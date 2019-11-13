package com.example.carsinspectionshelper;

import android.util.Log;

import java.util.Calendar;
import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class CarManager extends RealmObject {
    @PrimaryKey
    private String carPlate;
    private String vehicleIdentificationNumber;
    private Date carVignetteStart;
    private Date carVignetteEnd;
    private Date carInsuranceStart;
    private Date carInsuranceEnd;
    private Date carInspectionStart;
    private Date carInspectionEnd;


    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }


    public String getVehicleIdentificationNumber() {
        return vehicleIdentificationNumber;
    }

    public void setVehicleIdentificationNumber(String vehicleIdentificationNumber) {
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
    }

    public Date getCarVignetteStart() {
        return carVignetteStart;
    }

    public void setCarVignetteStart(int year, int month, int day) {
        this.carVignetteStart = this.getDateFromParts(year, month, day);
    }


    public Date getCarVignetteEnd() {
        return carVignetteEnd;
    }

    public void setCarVignetteEnd(int year, int month, int day) {
        this.carVignetteEnd = this.getDateFromParts(year, month, day);
    }

    public Date getCarInsuranceStart() {
        return carInsuranceStart;
    }

    public void setCarInsuranceStart(int year, int month, int day) {
        this.carInsuranceStart = this.getDateFromParts(year, month, day);
    }

    public Date getCarInsuranceEnd() {
        return carInsuranceEnd;
    }

    public void setCarInsuranceEnd(int year, int month, int day) {
        this.carInsuranceEnd = this.getDateFromParts(year, month, day);
    }

    public Date getCarInspectionStart() {
        return carInspectionStart;
    }

    public void setCarInspectionStart(int year, int month, int day) {
        this.carInspectionStart = this.getDateFromParts(year, month, day);
    }

    public Date getCarInspectionEnd() {
        return carInspectionEnd;
    }

    public void setCarInspectionEnd(int year, int month, int day) {
        this.carInspectionEnd = this.getDateFromParts(year, month, day);
    }

    private Date getDateFromParts(int year, int month, int day) {
        Calendar newDate = Calendar.getInstance();
        newDate.set(Calendar.YEAR, year);
        newDate.set(Calendar.MONTH, month);
        newDate.set(Calendar.DAY_OF_MONTH, day);

        return newDate.getTime();
    }

    public static Calendar toCalendar(Date date){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal;
    }

    public void printToDebug() {
        if (carPlate != null) {
            Log.d("Whateva", carPlate);
        }
        if (vehicleIdentificationNumber != null) {
            Log.d("Whateva", vehicleIdentificationNumber);
        }
        if (carVignetteStart != null) {
            Log.d("Whateva", carVignetteStart.toString());
        }
        if (carVignetteEnd != null) {
            Log.d("Whateva", carVignetteEnd.toString());
        }
        if (carInsuranceStart != null) {
            Log.d("Whateva", carInsuranceStart.toString());
        }
        if (carInsuranceEnd != null) {
            Log.d("Whateva", carInsuranceEnd.toString());
        }
        if (carInspectionStart != null) {
            Log.d("Whateva", carInspectionStart.toString());
        }
        if (carInspectionEnd != null) {
            Log.d("Whateva", carInspectionEnd.toString());
        }
    }

}
