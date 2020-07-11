package com.example.projectdatmonanonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class RegistryActivity extends AppCompatActivity {
    TextView txtRegistryReturn;
    Spinner spngender;
    Intent intent = LoginActivity.intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registry_layout);
        txtRegistryReturn = findViewById(R.id.txtRegistryReturn);
        spngender = findViewById(R.id.spnGender);

        txtRegistryReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(v.getContext(),LoginActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);
            }
        });
    }
}