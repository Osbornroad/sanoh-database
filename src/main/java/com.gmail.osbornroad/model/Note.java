package com.gmail.osbornroad.model;

import java.time.LocalDateTime;

/**
 * Created by User on 06.04.2017.
 */
public class Note {

    /*
A080 only - 56 symbols
    SequenceN    Variant            Series ChassisN 225 129 PredictedTrimInDateTime
    12           18                 4      6        2   2   12
    201404170064 TDBNLFWT31EQPB--L- T31J   130170   K7  S0  201404171832

A090 A001 added - 72 symbols
    APoint SequenceN    Variant            Series ChassisN PredictSeqN  PredTrInDateTime 225 129
    4      12           18                 4      6        12           12               2   2
    A080   201408140014 TDRNLBYT31EQPB--F- T31J   134637   201408120026 201408121020     TF  S1

W224 added - 84 symbols
    APoint SequenceN    Variant            Series ChassisN PredictSeqN  PredTrInDateTime AchievDateTime 225 224
    4      12           18                 4      6        12           12               12             2   2
    A080   201704060061 FDRNLBZJ11EQRB99G- J116   027524   201704060115 201704061322     201704061017   25  F0
     */

    private String aPoint;
    private String seqNumber;
    private String carVariant;
    private String series;
    private String chassis;
    private String predSeqNumber;
    private LocalDateTime predTrimInDateTime;
    private LocalDateTime achievDateTime;
    private String w225;
    private String w224;

    public Note() {
    }

/*    public Note(String aPoint, String seqNumber, String carVariant, String series, String chassis, String predSeqNumber, LocalDateTime predTrimInDateTime, String w225) {
        this.aPoint = aPoint;
        this.seqNumber = seqNumber;
        this.carVariant = carVariant;
        this.series = series;
        this.chassis = chassis;
        this.predSeqNumber = predSeqNumber;
        this.predTrimInDateTime = predTrimInDateTime;
        this.achievDateTime = LocalDateTime.of(2000, 0, 1, 0, 0);
        this.w225 = w225;
        this.w224 = "unavailable";
    }*/

    public Note(String aPoint, String seqNumber, String carVariant, String series, String chassis, String predSeqNumber, LocalDateTime predTrimInDateTime, LocalDateTime achievDateTime, String w225, String w224) {
        this.aPoint = aPoint;
        this.seqNumber = seqNumber;
        this.carVariant = carVariant;
        this.series = series;
        this.chassis = chassis;
        this.predSeqNumber = predSeqNumber;
        this.predTrimInDateTime = predTrimInDateTime;
        this.achievDateTime = achievDateTime;
        this.w225 = w225;
        this.w224 = w224;
    }

    public String getaPoint() {
        return aPoint;
    }

    public void setaPoint(String aPoint) {
        this.aPoint = aPoint;
    }

    public String getSeqNumber() {
        return seqNumber;
    }

    public void setSeqNumber(String seqNumber) {
        this.seqNumber = seqNumber;
    }

    public String getCarVariant() {
        return carVariant;
    }

    public void setCarVariant(String carVariant) {
        this.carVariant = carVariant;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public String getPredSeqNumber() {
        return predSeqNumber;
    }

    public void setPredSeqNumber(String predSeqNumber) {
        this.predSeqNumber = predSeqNumber;
    }

    public LocalDateTime getPredTrimInDateTime() {
        return predTrimInDateTime;
    }

    public void setPredTrimInDateTime(LocalDateTime predTrimInDateTime) {
        this.predTrimInDateTime = predTrimInDateTime;
    }

    public LocalDateTime getAchievDateTime() {
        return achievDateTime;
    }

    public void setAchievDateTime(LocalDateTime achievDateTime) {
        this.achievDateTime = achievDateTime;
    }

    public String getW225() {
        return w225;
    }

    public void setW225(String w225) {
        this.w225 = w225;
    }

    public String getW224() {
        return w224;
    }

    public void setW224(String w224) {
        this.w224 = w224;
    }
}
