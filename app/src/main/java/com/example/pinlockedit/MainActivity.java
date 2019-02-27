package com.example.pinlockedit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.sfs.OnOtpCompletionListener;
import com.sfs.OtpView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,
        OnOtpCompletionListener {
    private OtpView otpView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeUi();
    }


    private void initializeUi() {
        otpView = findViewById(R.id.otp_view);
        otpView.setOtpCompletionListener(this);

    }

    @Override
    public void onOtpCompleted(String otp) {
    }

    @Override
    public void onClick(View v) {

    }
}
