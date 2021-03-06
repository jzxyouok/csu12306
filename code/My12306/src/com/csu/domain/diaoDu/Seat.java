package com.csu.domain.diaoDu;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by sx on 2016/9/14.
 */
public class Seat {
    private int seatid;     //席位代码
    private int trainid;    //车次
    private Timestamp date;      //日期
    private int chexiang;   //车厢号
    private String seatno;  //座位号
    private String from;    //乘车区间起始站
    private String to;      //乘车区间终到站
    private String status;  //售票状态

    public Seat() {
    }

    public Seat(int seatid, int trainid, Timestamp date, int chexiang, String seatno, String from, String to, String status) {
        this.seatid = seatid;
        this.trainid = trainid;
        this.date = date;
        this.chexiang = chexiang;
        this.seatno = seatno;
        this.from = from;
        this.to = to;
        this.status = status;
    }

    public int getSeatid() {
        return seatid;
    }

    public void setSeatid(int seatid) {
        this.seatid = seatid;
    }

    public int getTrainid() {
        return trainid;
    }

    public void setTrainid(int trainid) {
        this.trainid = trainid;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public int getChexiang() {
        return chexiang;
    }

    public void setChexiang(int chexiang) {
        this.chexiang = chexiang;
    }

    public String getSeatno() {
        return seatno;
    }

    public void setSeatno(String seatno) {
        this.seatno = seatno;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
