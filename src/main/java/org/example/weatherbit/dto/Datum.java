package org.example.weatherbit.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("wind_cdir")
    @Expose
    private String windCdir;
    @SerializedName("rh")
    @Expose
    private Double rh;
    @SerializedName("pod")
    @Expose
    private String pod;
    @SerializedName("lon")
    @Expose
    private String lon;
    @SerializedName("pres")
    @Expose
    private Double pres;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("ob_time")
    @Expose
    private String obTime;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("clouds")
    @Expose
    private Double clouds;
    @SerializedName("vis")
    @Expose
    private Double vis;
    @SerializedName("wind_spd")
    @Expose
    private Double windSpd;
    @SerializedName("wind_cdir_full")
    @Expose
    private String windCdirFull;
    @SerializedName("app_temp")
    @Expose
    private Double appTemp;
    @SerializedName("state_code")
    @Expose
    private String stateCode;
    @SerializedName("ts")
    @Expose
    private Double ts;
    @SerializedName("h_angle")
    @Expose
    private Double hAngle;
    @SerializedName("dewpt")
    @Expose
    private Double dewpt;
    @SerializedName("weather")
    @Expose
    private Weather weather;
    @SerializedName("uv")
    @Expose
    private Double uv;
    @SerializedName("aqi")
    @Expose
    private Double aqi;
    @SerializedName("station")
    @Expose
    private String station;
    @SerializedName("wind_dir")
    @Expose
    private Double windDir;
    @SerializedName("elev_angle")
    @Expose
    private Double elevAngle;
    @SerializedName("datetime")
    @Expose
    private String datetime;
    @SerializedName("precip")
    @Expose
    private Double precip;
    @SerializedName("ghi")
    @Expose
    private Double ghi;
    @SerializedName("dni")
    @Expose
    private Double dni;
    @SerializedName("dhi")
    @Expose
    private Double dhi;
    @SerializedName("solar_rad")
    @Expose
    private Double solarRad;
    @SerializedName("city_name")
    @Expose
    private String cityName;
    @SerializedName("sunrise")
    @Expose
    private String sunrise;
    @SerializedName("sunset")
    @Expose
    private String sunset;
    @SerializedName("temp")
    @Expose
    private Double temp;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("slp")
    @Expose
    private Double slp;

    public String getWindCdir() {
        return windCdir;
    }

    public void setWindCdir(String windCdir) {
        this.windCdir = windCdir;
    }

    public Double getRh() {
        return rh;
    }

    public void setRh(Double rh) {
        this.rh = rh;
    }

    public String getPod() {
        return pod;
    }

    public void setPod(String pod) {
        this.pod = pod;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public Double getPres() {
        return pres;
    }

    public void setPres(Double pres) {
        this.pres = pres;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getObTime() {
        return obTime;
    }

    public void setObTime(String obTime) {
        this.obTime = obTime;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Double getClouds() {
        return clouds;
    }

    public void setClouds(Double clouds) {
        this.clouds = clouds;
    }

    public Double getVis() {
        return vis;
    }

    public void setVis(Double vis) {
        this.vis = vis;
    }

    public Double getWindSpd() {
        return windSpd;
    }

    public void setWindSpd(Double windSpd) {
        this.windSpd = windSpd;
    }

    public String getWindCdirFull() {
        return windCdirFull;
    }

    public void setWindCdirFull(String windCdirFull) {
        this.windCdirFull = windCdirFull;
    }

    public Double getAppTemp() {
        return appTemp;
    }

    public void setAppTemp(Double appTemp) {
        this.appTemp = appTemp;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public Double getTs() {
        return ts;
    }

    public void setTs(Double ts) {
        this.ts = ts;
    }

    public Double getHAngle() {
        return hAngle;
    }

    public void setHAngle(Double hAngle) {
        this.hAngle = hAngle;
    }

    public Double getDewpt() {
        return dewpt;
    }

    public void setDewpt(Double dewpt) {
        this.dewpt = dewpt;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Double getUv() {
        return uv;
    }

    public void setUv(Double uv) {
        this.uv = uv;
    }

    public Double getAqi() {
        return aqi;
    }

    public void setAqi(Double aqi) {
        this.aqi = aqi;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public Double getWindDir() {
        return windDir;
    }

    public void setWindDir(Double windDir) {
        this.windDir = windDir;
    }

    public Double getElevAngle() {
        return elevAngle;
    }

    public void setElevAngle(Double elevAngle) {
        this.elevAngle = elevAngle;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public Double getPrecip() {
        return precip;
    }

    public void setPrecip(Double precip) {
        this.precip = precip;
    }

    public Double getGhi() {
        return ghi;
    }

    public void setGhi(Double ghi) {
        this.ghi = ghi;
    }

    public Double getDni() {
        return dni;
    }

    public void setDni(Double dni) {
        this.dni = dni;
    }

    public Double getDhi() {
        return dhi;
    }

    public void setDhi(Double dhi) {
        this.dhi = dhi;
    }

    public Double getSolarRad() {
        return solarRad;
    }

    public void setSolarRad(Double solarRad) {
        this.solarRad = solarRad;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public Double getSlp() {
        return slp;
    }

    public void setSlp(Double slp) {
        this.slp = slp;
    }

    @Override
    public String toString() {
        return "Datum{" +
                "windCdir='" + windCdir + '\'' +
                ", rh=" + rh +
                ", pod='" + pod + '\'' +
                ", lon='" + lon + '\'' +
                ", pres=" + pres +
                ", timezone='" + timezone + '\'' +
                ", obTime='" + obTime + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", clouds=" + clouds +
                ", vis=" + vis +
                ", windSpd=" + windSpd +
                ", windCdirFull='" + windCdirFull + '\'' +
                ", appTemp=" + appTemp +
                ", stateCode='" + stateCode + '\'' +
                ", ts=" + ts +
                ", hAngle=" + hAngle +
                ", dewpt=" + dewpt +
                ", weather=" + weather +
                ", uv=" + uv +
                ", aqi=" + aqi +
                ", station='" + station + '\'' +
                ", windDir=" + windDir +
                ", elevAngle=" + elevAngle +
                ", datetime='" + datetime + '\'' +
                ", precip=" + precip +
                ", ghi=" + ghi +
                ", dni=" + dni +
                ", dhi=" + dhi +
                ", solarRad=" + solarRad +
                ", cityName='" + cityName + '\'' +
                ", sunrise='" + sunrise + '\'' +
                ", sunset='" + sunset + '\'' +
                ", temp=" + temp +
                ", lat='" + lat + '\'' +
                ", slp=" + slp +
                '}';
    }
}