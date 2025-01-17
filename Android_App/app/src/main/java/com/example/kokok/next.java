package com.example.kokok;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.kokok.R;

public class next extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_next);
    }
    public void disable(View v) {
        Button button = (Button) v;
        button.setText("back"); /* เปลี่ยนข้อความของปุ่ม */

        Intent i = new Intent(this, MainActivity.class); // Replace 'NextActivity' with the actual class name
        startActivity(i);
    }
    public void disable15(View v) {
        Log.d("success", "Button Disabled");
    }
}
