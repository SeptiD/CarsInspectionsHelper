package com.example.carsinspectionshelper;

import android.util.Log;

import java.util.Calendar;

public class CarManager {
    private String carPlate;
    private String vehicleIdentificationNumber;
    private Calendar carVignetteStart;
    private Calendar carVignetteEnd;
    private Calendar carInsuranceStart;
    private Calendar carInsuranceEnd;
    private Calendar carInspectionStart;
    private Calendar carInspectionEnd;


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

    public Calendar getCarVignetteStart() {
        return carVignetteStart;
    }

    public void setCarVignetteStart(int year, int month, int day) {
        this.carVignetteStart = this.get_calendar_from_parts(year, month, day);
    }


    public Calendar getCarVignetteEnd() {
        return carVignetteEnd;
    }

    public void setCarVignetteEnd(int year, int month, int day) {
        this.carVignetteEnd = this.get_calendar_from_parts(year, month, day);
    }

    public Calendar getCarInsuranceStart() {
        return carInsuranceStart;
    }

    public void setCarInsuranceStart(int year, int month, int day) {
        this.carInsuranceStart = this.get_calendar_from_parts(year, month, day);
    }

    public Calendar getCarInsuranceEnd() {
        return carInsuranceEnd;
    }

    public void setCarInsuranceEnd(int year, int month, int day) {
        this.carInsuranceEnd = this.get_calendar_from_parts(year, month, day);
    }

    public Calendar getCarInspectionStart() {
        return carInspectionStart;
    }

    public void setCarInspectionStart(int year, int month, int day) {
        this.carInspectionStart = this.get_calendar_from_parts(year, month, day);
    }

    public Calendar getCarInspectionEnd() {
        return carInspectionEnd;
    }

    public void setCarInspectionEnd(int year, int month, int day) {
        this.carInspectionEnd = this.get_calendar_from_parts(year, month, day);
    }

    private Calendar get_calendar_from_parts(int year, int month, int day) {
        Calendar newDate = Calendar.getInstance();
        newDate.set(Calendar.YEAR, year);
        newDate.set(Calendar.MONTH, month);
        newDate.set(Calendar.DAY_OF_MONTH, day);

        return newDate;
    }

    public void printToDebug() {
        if (carPlate != null) {
            Log.d("Whateva", carPlate);
        }
        if (vehicleIdentificationNumber != null) {
            Log.d("Whateva", vehicleIdentificationNumber);
        }
        if (carVignetteStart != null) {
            Log.d("Whateva", carVignetteStart.getTime().toString());
        }
        if (carVignetteEnd != null) {
            Log.d("Whateva", carVignetteEnd.getTime().toString());
        }
        if (carInsuranceStart != null) {
            Log.d("Whateva", carInsuranceStart.getTime().toString());
        }
        if (carInsuranceEnd != null) {
            Log.d("Whateva", carInsuranceEnd.getTime().toString());
        }
        if (carInspectionStart != null) {
            Log.d("Whateva", carInspectionStart.getTime().toString());
        }
        if (carInspectionEnd != null) {
            Log.d("Whateva", carInspectionEnd.getTime().toString());
        }
    }

}
