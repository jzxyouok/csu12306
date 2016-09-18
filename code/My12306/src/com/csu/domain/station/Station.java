package com.csu.domain.station;

/**
 * Created by Asus_ on 2016/9/13.
 */
public class Station {

    private String stationId;//车站编号
    private String stationName;//车站名
    private String pinYin;//拼音码
    private String location;//所在地

    public Station() {
    }

    public Station(String stationId, String stationName, String pinYin, String location) {
        this.stationId = stationId;
        this.stationName = stationName;
        this.pinYin = pinYin;
        this.location = location;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getPinYin() {
        return pinYin;
    }

    public void setPinYin(String pinYin) {
        this.pinYin = pinYin;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
