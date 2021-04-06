package org.example.weatherbit.dto;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WeatherDTO {

    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("count")
    @Expose
    private Double count;

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Double getCount() {
        return count;
    }

    public void setCount(Double count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "WeatherDTO{" +
                "data=" + data +
                ", count=" + count +
                '}';
    }
}
