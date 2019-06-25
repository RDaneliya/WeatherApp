package com.example.weather;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyRecyclerViewAdapter recyclerAdapter;

    private void viewInfo(List<String> infoTypes, List<String> infoValues){
        recyclerAdapter = new MyRecyclerViewAdapter(this, infoTypes, infoValues);
        recyclerView.setAdapter(recyclerAdapter);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Map<String,String> cities = new HashMap<String, String>();
        cities.put("Томск", "Tomsk");
        cities.put("Москва", "Moscow");
        cities.put("Нью-Йорк", "New_York");

        final ImageView imageView =  findViewById(R.id.warningView);
        final TextView textView =  findViewById(R.id.textView1);
        final String apiKey = "ae129e848cf74559a8d95151191201&";
        final Spinner spinner = findViewById(R.id.citySpinner);
        final EditText editText = findViewById(R.id.cityEdit);
        final TextInputLayout textInputLayout =  findViewById(R.id.cityTextLayout);

        final ArrayList<String> infoTypes = new ArrayList<>();
        infoTypes.add("Температура");
        infoTypes.add("Скорость ветра");
        infoTypes.add("Направление ветра");
        infoTypes.add("Давление");
        infoTypes.add("Влажность");
        final ArrayList<String> infoValues = new ArrayList<>();

        recyclerView = findViewById(R.id.info);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), linearLayoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);

        ArrayAdapter<?> adapter = ArrayAdapter.createFromResource(this,R.array.Cities,R.layout.center_spinner_item);
        adapter.setDropDownViewResource(R.layout.center_spinner_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, final View view, int position, long id) {
                if(spinner.getSelectedItemPosition() != 0){
                    NetworkService.getInstance()
                            .getApixu()
                            .getCity(cities.get(spinner.getSelectedItem()))
                            .enqueue(new Callback<Answer>() {
                                @Override
                                public void onResponse(Call<Answer> call, Response<Answer> response) {
                                    Answer answer1 = response.body();
                                    infoValues.add(Double.toString(answer1.getCurrent().getTempC()));
                                    infoValues.add(Double.toString(answer1.getCurrent().getWindKph()));
                                    infoValues.add(answer1.getCurrent().getWindDir());
                                    infoValues.add(Double.toString(answer1.getCurrent().getPressureMb()));
                                    infoValues.add(Double.toString(answer1.getCurrent().getHumidity())+"%");
                                    viewInfo(infoTypes,infoValues);
                                }

                                @Override
                                public void onFailure(Call<Answer> call, Throwable t) {
                                    imageView.setVisibility(View.VISIBLE);
                                    textView.setVisibility(View.VISIBLE);
                                }
                            });
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if(event.getAction()== KeyEvent.ACTION_DOWN && (keyCode == KeyEvent.KEYCODE_ENTER)){
                    String city = editText.getText().toString();
                    NetworkService.getInstance()
                            .getApixu()
                            .getCity(city)
                            .enqueue(new Callback<Answer>() {
                                @Override
                                public void onResponse(Call<Answer> call, Response<Answer> response) {
                                    Answer answer1 = response.body();
                                }

                                @Override
                                public void onFailure(Call<Answer> call, Throwable t) {
                                    imageView.setVisibility(View.VISIBLE);
                                    textView.setVisibility(View.VISIBLE);
                                }
                            });
                    return true;
                }
                return false;
            }
        });
    }
}
