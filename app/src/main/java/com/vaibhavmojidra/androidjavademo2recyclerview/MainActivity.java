package com.vaibhavmojidra.androidjavademo2recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<TV> tvList =new ArrayList<TV>();
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fillTVData();
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new TVAdapter(tvList, tv -> Toast.makeText(MainActivity.this,"TV Name "+tv.getName()+"\nTV Company: "+tv.getCompany(),Toast.LENGTH_SHORT).show()));
    }

    public void fillTVData(){
        tvList.add(new TV("Samsung QN90A Neo QLED", "Samsung"));
        tvList.add(new TV("LG CX OLED", "LG"));
        tvList.add(new TV("Sony A8H OLED", "Sony"));
        tvList.add(new TV("Vizio P-Series Quantum X", "Vizio"));
        tvList.add(new TV("TCL 6-Series Roku TV", "TCL"));
        tvList.add(new TV("Hisense H9G Quantum", "Hisense"));
        tvList.add(new TV("Philips OLED 805", "Philips"));
        tvList.add(new TV("Panasonic HZ2000", "Panasonic"));
        tvList.add(new TV("Xiaomi Mi TV Q1", "Xiaomi"));
        tvList.add(new TV("Skyworth Q71", "Skyworth"));
        tvList.add(new TV("Toshiba 4K UHD Smart TV", "Toshiba"));
        tvList.add(new TV("Sharp Aquos R3", "Sharp"));
    }
}