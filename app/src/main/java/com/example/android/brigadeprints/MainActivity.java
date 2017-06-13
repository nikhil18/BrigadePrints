package com.example.android.brigadeprints;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView contactUs = (TextView) findViewById(R.id.contactUs);
        contactUs.setText("Company: Brigade Prints\n" +
                "Name: Mr. Sudarshan\n" +
                "Address: No.12/1, Andree Road, Shantinagar\n" +
                "City: Bangalore\n" +
                "State: Karnataka\n" +
                "Mobile: +91-9164600040\n"
                + "Hours of Operation: 10am to 7am and sunday holiday");
    }

    public void openwebSite(View view) {
        goToUrl("http://www.brigadeprints.net/");
    }

    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}

