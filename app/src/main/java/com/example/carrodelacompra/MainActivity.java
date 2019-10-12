package com.example.carrodelacompra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView tvCounter;
    private Button buttonAddProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        tvCounter = (TextView) findViewById(R.id.tvCounter);
        buttonAddProduct = (Button) findViewById(R.id.buttonAddProduct);

        buttonAddProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int counter = Integer.parseInt(tvCounter.getText().toString());
                ++counter;
                tvCounter.setText(String.valueOf(counter));
            }
        });
    }
}
