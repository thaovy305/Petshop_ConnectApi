package com.example.petshop_connectapi;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    private TextView txtWelcome;
    private Button btnLogout;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnLogout = findViewById(R.id.btnLogout);
        txtWelcome = findViewById(R.id.txtWelcome);
        sharedPreferences = getSharedPreferences("UserPrefs", MODE_PRIVATE);

        // Lấy tên người dùng từ SharedPreferences
        String name = sharedPreferences.getString("userName", "User");

        // Hiển thị lời chào
        txtWelcome.setText("Hello, " + name);

        // Xử lý sự kiện Logout
        btnLogout.setOnClickListener(v -> logoutUser());
    }
    private void logoutUser() {
        // Xóa token và thông tin người dùng khỏi SharedPreferences
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();

        // Quay lại màn hình đăng nhập
        Intent intent = new Intent(HomeActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}