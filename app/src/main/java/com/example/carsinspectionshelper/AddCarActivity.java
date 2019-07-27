package com.example.carsinspectionshelper;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class AddCarActivity extends AppCompatActivity {

    private CarManager carManager = new CarManager();
    private TextView mCarVignetteStartDate;
    private DatePickerDialog.OnDateSetListener mCarVignetteStartListener;
    private TextView mCarVignetteEndDate;
    private DatePickerDialog.OnDateSetListener mCarVignetteEndListener;
    private TextView mCarInsuranceStartDate;
    private DatePickerDialog.OnDateSetListener mCarInsuranceStartListener;
    private TextView mCarInsuranceEndDate;
    private DatePickerDialog.OnDateSetListener mCarInsuranceEndListener;
    private TextView mCarInspectionStartDate;
    private DatePickerDialog.OnDateSetListener mCarInspectionStartListener;
    private TextView mCarInspectionEndDate;
    private DatePickerDialog.OnDateSetListener mCarInspectionEndListener;

    private void lose_focus(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_car);
        mCarVignetteStartDate = (TextView) findViewById(R.id.car_vignette_start);
        mCarVignetteEndDate = (TextView) findViewById(R.id.car_vignette_end);
        mCarInsuranceStartDate = (TextView) findViewById(R.id.car_insurance_start);
        mCarInsuranceEndDate = (TextView) findViewById(R.id.car_insurance_end);
        mCarInspectionStartDate = (TextView) findViewById(R.id.car_inspection_start);
        mCarInspectionEndDate = (TextView) findViewById(R.id.car_inspection_end);

//        ((EditText) findViewById(R.id.vehicle_plate_number)).setOnFocusChangeListener(new View.OnFocusChangeListener() {
//
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                /* When focus is lost check that the text field
//                 * has valid values.
//                 */
//                if (!hasFocus) {
//                    Log.d("Whateva", ((EditText) v).getText().toString());
//                    carManager.setCarPlate(((EditText) v).getText().toString());
//                    carManager.printToDebug();
//                }
//            }
//        });

        mCarVignetteStartDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                ((EditText) findViewById(R.id.vehicle_plate_number)).clearFocus();
                int year, month, day;
                if (carManager.getCarVignetteStart() != null) {
                    Calendar carVgnStrart = carManager.getCarVignetteStart();
                    year = carVgnStrart.get(Calendar.YEAR);
                    month = carVgnStrart.get(Calendar.MONTH);
                    day = carVgnStrart.get(Calendar.DAY_OF_MONTH);
                } else {
                    Calendar cal = Calendar.getInstance();
                    year = cal.get(Calendar.YEAR);
                    month = cal.get(Calendar.MONTH);
                    day = cal.get(Calendar.DAY_OF_MONTH);
                }
                DatePickerDialog dialog = new DatePickerDialog(
                        AddCarActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mCarVignetteStartListener,
                        year, month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        mCarVignetteStartListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
//                Log.d(TAG, "onDateSet: mm/dd/yyy: " + month + "/" + day + "/" + year);
                String date = day + "/" + month + "/" + year;
                mCarVignetteStartDate.setText(date);
                carManager.setCarVignetteStart(year, month, day);
                carManager.printToDebug();
            }
        };


        mCarVignetteEndDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int year, month, day;
                if (carManager.getCarVignetteEnd() != null) {
                    Calendar cal = carManager.getCarVignetteEnd();
                    year = cal.get(Calendar.YEAR);
                    month = cal.get(Calendar.MONTH);
                    day = cal.get(Calendar.DAY_OF_MONTH);
                } else {
                    Calendar cal = Calendar.getInstance();
                    year = cal.get(Calendar.YEAR);
                    month = cal.get(Calendar.MONTH);
                    day = cal.get(Calendar.DAY_OF_MONTH);
                }
                DatePickerDialog dialog = new DatePickerDialog(
                        AddCarActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mCarVignetteEndListener,
                        year, month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        mCarVignetteEndListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                String date = day + "/" + month + "/" + year;
                mCarVignetteEndDate.setText(date);
                carManager.setCarVignetteEnd(year, month, day);
                carManager.printToDebug();
            }
        };


        mCarInsuranceStartDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int year, month, day;
                if (carManager.getCarInsuranceStart() != null) {
                    Calendar cal = carManager.getCarInsuranceStart();
                    year = cal.get(Calendar.YEAR);
                    month = cal.get(Calendar.MONTH);
                    day = cal.get(Calendar.DAY_OF_MONTH);
                } else {
                    Calendar cal = Calendar.getInstance();
                    year = cal.get(Calendar.YEAR);
                    month = cal.get(Calendar.MONTH);
                    day = cal.get(Calendar.DAY_OF_MONTH);
                }
                DatePickerDialog dialog = new DatePickerDialog(
                        AddCarActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mCarInsuranceStartListener,
                        year, month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        mCarInsuranceStartListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                String date = day + "/" + month + "/" + year;
                mCarInsuranceStartDate.setText(date);
                carManager.setCarInsuranceStart(year, month, day);
                carManager.printToDebug();
            }
        };

        mCarInsuranceEndDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int year, month, day;
                if (carManager.getCarInsuranceEnd() != null) {
                    Calendar cal = carManager.getCarInsuranceEnd();
                    year = cal.get(Calendar.YEAR);
                    month = cal.get(Calendar.MONTH);
                    day = cal.get(Calendar.DAY_OF_MONTH);
                } else {
                    Calendar cal = Calendar.getInstance();
                    year = cal.get(Calendar.YEAR);
                    month = cal.get(Calendar.MONTH);
                    day = cal.get(Calendar.DAY_OF_MONTH);
                }
                DatePickerDialog dialog = new DatePickerDialog(
                        AddCarActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mCarInsuranceEndListener,
                        year, month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        mCarInsuranceEndListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                String date = day + "/" + month + "/" + year;
                mCarInsuranceEndDate.setText(date);
                carManager.setCarInsuranceEnd(year, month, day);
                carManager.printToDebug();
            }
        };

        mCarInspectionStartDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int year, month, day;
                if (carManager.getCarInspectionStart() != null) {
                    Calendar cal = carManager.getCarInspectionStart();
                    year = cal.get(Calendar.YEAR);
                    month = cal.get(Calendar.MONTH);
                    day = cal.get(Calendar.DAY_OF_MONTH);
                } else {
                    Calendar cal = Calendar.getInstance();
                    year = cal.get(Calendar.YEAR);
                    month = cal.get(Calendar.MONTH);
                    day = cal.get(Calendar.DAY_OF_MONTH);
                }
                DatePickerDialog dialog = new DatePickerDialog(
                        AddCarActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mCarInspectionStartListener,
                        year, month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        mCarInspectionStartListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                String date = day + "/" + month + "/" + year;
                mCarInspectionStartDate.setText(date);
                carManager.setCarInspectionStart(year, month, day);
                carManager.printToDebug();
            }
        };

        mCarInspectionEndDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int year, month, day;
                if (carManager.getCarInspectionEnd() != null) {
                    Calendar cal = carManager.getCarInspectionEnd();
                    year = cal.get(Calendar.YEAR);
                    month = cal.get(Calendar.MONTH);
                    day = cal.get(Calendar.DAY_OF_MONTH);
                } else {
                    Calendar cal = Calendar.getInstance();
                    year = cal.get(Calendar.YEAR);
                    month = cal.get(Calendar.MONTH);
                    day = cal.get(Calendar.DAY_OF_MONTH);
                }
                DatePickerDialog dialog = new DatePickerDialog(
                        AddCarActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mCarInspectionEndListener,
                        year, month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        mCarInspectionEndListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                String date = day + "/" + month + "/" + year;
                mCarInspectionEndDate.setText(date);
                carManager.setCarInspectionEnd(year, month, day);
                carManager.printToDebug();
            }
        };
    }
}
