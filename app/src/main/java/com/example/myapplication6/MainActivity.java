package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
private EditText editText;
private Button btn;
private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         textView = findViewById(R.id.text);
        editText = findViewById(R.id.editText);
        btn = findViewById(R.id.btn);

        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
btn.setOnClickListener(new View.OnClickListener() {
    @SuppressLint("ResourceType")
    @Override
    public void onClick(View view) {
        startActivity(intent);
        String text = editText.getText().toString();
        textView.setText(text);
        finish();
    }
});
    }
}