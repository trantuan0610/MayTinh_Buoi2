package com.tuantran.maytinh_bai3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtSo1;
    EditText edtSo2;
    EditText edtKetqua;
    Button btnCong, btnTru, btnNhan,btnChia;
    int a , b, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!edtSo1.getText().toString().isEmpty() && !edtSo2.getText().toString().isEmpty()) {
                    a = Integer.parseInt(edtSo1.getText().toString());
                    b = Integer.parseInt(edtSo2.getText().toString());
                    c = a + b;
                    edtKetqua.setText(String.valueOf(c));
                }else {
                    Toast.makeText(MainActivity.this, "Nhập đầy đủ số", Toast.LENGTH_SHORT).show();
                }

                }
        });
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!edtSo1.getText().toString().isEmpty() && !edtSo2.getText().toString().isEmpty()) {
                    a = Integer.parseInt(edtSo1.getText().toString());
                    b = Integer.parseInt(edtSo2.getText().toString());
                    c = a-b;
                    edtKetqua.setText(String.valueOf(c));
                }else{
                    Toast.makeText(MainActivity.this, "Nhập đầy đủ số", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!edtSo1.getText().toString().isEmpty() && !edtSo2.getText().toString().isEmpty()) {
                    a = Integer.parseInt(edtSo1.getText().toString());
                    b = Integer.parseInt(edtSo2.getText().toString());
                    c = a*b;
                    edtKetqua.setText(String.valueOf(c));
                }else{
                    Toast.makeText(MainActivity.this, "Nhập đầy đủ số", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!edtSo1.getText().toString().isEmpty() && !edtSo2.getText().toString().isEmpty()) {
                    a = Integer.parseInt(edtSo1.getText().toString());
                    b = Integer.parseInt(edtSo2.getText().toString());
                    if (b!=0){
                        c = a/b;
                        edtKetqua.setText(String.valueOf(c));
                    }else {
                        Toast.makeText(MainActivity.this, "b phải khác 0", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(MainActivity.this, "Nhập đầy đủ số", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
    private void AnhXa(){
        edtSo1 = (EditText) findViewById(R.id.edtso1);
        edtSo2 = (EditText) findViewById(R.id.edtso2);
        edtKetqua = (EditText) findViewById(R.id.edtketqua);
        btnCong = (Button) findViewById(R.id.btnCong);
        btnTru = (Button) findViewById(R.id.btnTru);
        btnNhan = (Button) findViewById(R.id.btnNhan);
        btnChia = (Button) findViewById(R.id.btnChia);


    }
}