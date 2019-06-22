package com.example.weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class Answer {
    @SerializedName("location")
    @Expose
    public Location location;

    @SerializedName("current")
    @Expose
    public Current current;

    public static class Location {
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("region")
        @Expose
        private String region;
        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("lat")
        @Expose
        private Double lat;
        @SerializedName("lon")
        @Expose
        private Double lon;
        @SerializedName("tz_id")
        @Expose
        private String tzId;
        @SerializedName("localtime_epoch")
        @Expose
        private Integer localtimeEpoch;
        @SerializedName("localtime")
        @Expose
        private String localtime;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Location withName(String name) {
            this.name = name;
            return this;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public Location withRegion(String region) {
            this.region = region;
            return this;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public Location withCountry(String country) {
            this.country = country;
            return this;
        }

        public Double getLat() {
            return lat;
        }

        public void setLat(Double lat) {
            this.lat = lat;
        }

        public Location withLat(Double lat) {
            this.lat = lat;
            return this;
        }

        public Double getLon() {
            return lon;
        }

        public void setLon(Double lon) {
            this.lon = lon;
        }

        public Location withLon(Double lon) {
            this.lon = lon;
            return this;
        }

        public String getTzId() {
            return tzId;
        }

        public void setTzId(String tzId) {
            this.tzId = tzId;
        }

        public Location withTzId(String tzId) {
            this.tzId = tzId;
            return this;
        }

        public Integer getLocaltimeEpoch() {
            return localtimeEpoch;
        }

        public void setLocaltimeEpoch(Integer localtimeEpoch) {
            this.localtimeEpoch = localtimeEpoch;
        }

        public Location withLocaltimeEpoch(Integer localtimeEpoch) {
            this.localtimeEpoch = localtimeEpoch;
            return this;
        }

        public String getLocaltime() {
            return localtime;
        }

        public void setLocaltime(String localtime) {
            this.localtime = localtime;
        }

        public Location withLocaltime(String localtime) {
            this.localtime = localtime;
            return this;
        }
    }
    public class Current {
        public class Condition {

            @SerializedName("text")
            @Expose
            private String text;
            @SerializedName("icon")
            @Expose
            private String icon;
            @SerializedName("code")
            @Expose
            private Integer code;

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public Condition withText(String text) {
                this.text = text;
                return this;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public Condition withIcon(String icon) {
                this.icon = icon;
                return this;
            }

            public Integer getCode() {
                return code;
            }

            public void setCode(Integer code) {
                this.code = code;
            }

            public Condition withCode(Integer code) {
                this.code = code;
                return this;
            }

        }
        @SerializedName("last_updated_epoch")
        @Expose
        private Integer lastUpdatedEpoch;
        @SerializedName("last_updated")
        @Expose
        private String lastUpdated;
        @SerializedName("temp_c")
        @Expose
        private Double tempC;
        @SerializedName("temp_f")
        @Expose
        private Double tempF;
        @SerializedName("is_day")
        @Expose
        private Integer isDay;
        @SerializedName("condition")
        @Expose
        private Condition condition;
        @SerializedName("wind_mph")
        @Expose
        private Double windMph;
        @SerializedName("wind_kph")
        @Expose
        private Double windKph;
        @SerializedName("wind_degree")
        @Expose
        private Integer windDegree;
        @SerializedName("wind_dir")
        @Expose
        private String windDir;
        @SerializedName("pressure_mb")
        @Expose
        private Double pressureMb;
        @SerializedName("pressure_in")
        @Expose
        private Double pressureIn;
        @SerializedName("precip_mm")
        @Expose
        private Double precipMm;
        @SerializedName("precip_in")
        @Expose
        private Double precipIn;
        @SerializedName("humidity")
        @Expose
        private Integer humidity;
        @SerializedName("cloud")
        @Expose
        private Integer cloud;
        @SerializedName("feelslike_c")
        @Expose
        private Double feelslikeC;
        @SerializedName("feelslike_f")
        @Expose
        private Double feelslikeF;
        @SerializedName("vis_km")
        @Expose
        private Double visKm;
        @SerializedName("vis_miles")
        @Expose
        private Double visMiles;
        @SerializedName("uv")
        @Expose
        private Double uv;
        @SerializedName("gust_mph")
        @Expose
        private Double gustMph;
        @SerializedName("gust_kph")
        @Expose
        private Double gustKph;

        public Integer getLastUpdatedEpoch() {
            return lastUpdatedEpoch;
        }

        public void setLastUpdatedEpoch(Integer lastUpdatedEpoch) {
            this.lastUpdatedEpoch = lastUpdatedEpoch;
        }

        public Current withLastUpdatedEpoch(Integer lastUpdatedEpoch) {
            this.lastUpdatedEpoch = lastUpdatedEpoch;
            return this;
        }

        public String getLastUpdated() {
            return lastUpdated;
        }

        public void setLastUpdated(String lastUpdated) {
            this.lastUpdated = lastUpdated;
        }

        public Current withLastUpdated(String lastUpdated) {
            this.lastUpdated = lastUpdated;
            return this;
        }

        public Double getTempC() {
            return tempC;
        }

        public void setTempC(Double tempC) {
            this.tempC = tempC;
        }

        public Current withTempC(Double tempC) {
            this.tempC = tempC;
            return this;
        }

        public Double getTempF() {
            return tempF;
        }

        public void setTempF(Double tempF) {
            this.tempF = tempF;
        }

        public Current withTempF(Double tempF) {
            this.tempF = tempF;
            return this;
        }

        public Integer getIsDay() {
            return isDay;
        }

        public void setIsDay(Integer isDay) {
            this.isDay = isDay;
        }

        public Current withIsDay(Integer isDay) {
            this.isDay = isDay;
            return this;
        }

        public Condition getCondition() {
            return condition;
        }

        public void setCondition(Condition condition) {
            this.condition = condition;
        }

        public Current withCondition(Condition condition) {
            this.condition = condition;
            return this;
        }

        public Double getWindMph() {
            return windMph;
        }

        public void setWindMph(Double windMph) {
            this.windMph = windMph;
        }

        public Current withWindMph(Double windMph) {
            this.windMph = windMph;
            return this;
        }

        public Double getWindKph() {
            return windKph;
        }

        public void setWindKph(Double windKph) {
            this.windKph = windKph;
        }

        public Current withWindKph(Double windKph) {
            this.windKph = windKph;
            return this;
        }

        public Integer getWindDegree() {
            return windDegree;
        }

        public void setWindDegree(Integer windDegree) {
            this.windDegree = windDegree;
        }

        public Current withWindDegree(Integer windDegree) {
            this.windDegree = windDegree;
            return this;
        }

        public String getWindDir() {
            return windDir;
        }

        public void setWindDir(String windDir) {
            this.windDir = windDir;
        }

        public Current withWindDir(String windDir) {
            this.windDir = windDir;
            return this;
        }

        public Double getPressureMb() {
            return pressureMb;
        }

        public void setPressureMb(Double pressureMb) {
            this.pressureMb = pressureMb;
        }

        public Current withPressureMb(Double pressureMb) {
            this.pressureMb = pressureMb;
            return this;
        }

        public Double getPressureIn() {
            return pressureIn;
        }

        public void setPressureIn(Double pressureIn) {
            this.pressureIn = pressureIn;
        }

        public Current withPressureIn(Double pressureIn) {
            this.pressureIn = pressureIn;
            return this;
        }

        public Double getPrecipMm() {
            return precipMm;
        }

        public void setPrecipMm(Double precipMm) {
            this.precipMm = precipMm;
        }

        public Current withPrecipMm(Double precipMm) {
            this.precipMm = precipMm;
            return this;
        }

        public Double getPrecipIn() {
            return precipIn;
        }

        public void setPrecipIn(Double precipIn) {
            this.precipIn = precipIn;
        }

        public Current withPrecipIn(Double precipIn) {
            this.precipIn = precipIn;
            return this;
        }

        public Integer getHumidity() {
            return humidity;
        }

        public void setHumidity(Integer humidity) {
            this.humidity = humidity;
        }

        public Current withHumidity(Integer humidity) {
            this.humidity = humidity;
            return this;
        }

        public Integer getCloud() {
            return cloud;
        }

        public void setCloud(Integer cloud) {
            this.cloud = cloud;
        }

        public Current withCloud(Integer cloud) {
            this.cloud = cloud;
            return this;
        }

        public Double getFeelslikeC() {
            return feelslikeC;
        }

        public void setFeelslikeC(Double feelslikeC) {
            this.feelslikeC = feelslikeC;
        }

        public Current withFeelslikeC(Double feelslikeC) {
            this.feelslikeC = feelslikeC;
            return this;
        }

        public Double getFeelslikeF() {
            return feelslikeF;
        }

        public void setFeelslikeF(Double feelslikeF) {
            this.feelslikeF = feelslikeF;
        }

        public Current withFeelslikeF(Double feelslikeF) {
            this.feelslikeF = feelslikeF;
            return this;
        }

        public Double getVisKm() {
            return visKm;
        }

        public void setVisKm(Double visKm) {
            this.visKm = visKm;
        }

        public Current withVisKm(Double visKm) {
            this.visKm = visKm;
            return this;
        }

        public Double getVisMiles() {
            return visMiles;
        }

        public void setVisMiles(Double visMiles) {
            this.visMiles = visMiles;
        }

        public Current withVisMiles(Double visMiles) {
            this.visMiles = visMiles;
            return this;
        }

        public Double getUv() {
            return uv;
        }

        public void setUv(Double uv) {
            this.uv = uv;
        }

        public Current withUv(Double uv) {
            this.uv = uv;
            return this;
        }

        public Double getGustMph() {
            return gustMph;
        }

        public void setGustMph(Double gustMph) {
            this.gustMph = gustMph;
        }

        public Current withGustMph(Double gustMph) {
            this.gustMph = gustMph;
            return this;
        }

        public Double getGustKph() {
            return gustKph;
        }

        public void setGustKph(Double gustKph) {
            this.gustKph = gustKph;
        }

        public Current withGustKph(Double gustKph) {
            this.gustKph = gustKph;
            return this;
        }

    }

    public Location getLocation(){
        return location;
    }
    public void setLocation(Location location){
        this.location = location;
    }
    public Answer withLocation(Location location){
        this.location = location;
        return this;
    }
    public Current getCurrent(){
        return current;
    }
    public void  setCurrent(Current current){
        this.current = current;
    }
    private Answer withCurrent(Current current){
        this.current = current;
        return this;
    }
}
