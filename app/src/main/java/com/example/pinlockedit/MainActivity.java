package com.example.pinlockedit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.mukesh.OnOtpCompletionListener;
import com.mukesh.OtpView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,
        OnOtpCompletionListener {
    private OtpView otpView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeUi();
        setListeners();
    }


    private void initializeUi() {
        otpView = findViewById(R.id.otp_view);
        otpView.setOtpCompletionListener(this);

    }

    private void setListeners() {
    }

    @Override
    public void onOtpCompleted(String otp) {
    }

    @Override
    public void onClick(View v) {

    }
}
