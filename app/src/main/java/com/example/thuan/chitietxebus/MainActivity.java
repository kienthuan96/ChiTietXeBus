package com.example.thuan.chitietxebus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.TabHost;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TabHost tabHost;
    GridView gridView;
    ArrayList<Bus> danhsachBus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabHost=findViewById(R.id.tabhost);
        //gridView=findViewById(R.id.gvXe);

        tabHost.setup();

        TabHost.TabSpec tab1=tabHost.newTabSpec("t1");
        tab1.setIndicator("Tram dừng");
        tab1.setContent(R.id.tab1);
        tabHost.addTab(tab1);

        TabHost.TabSpec t2=tabHost.newTabSpec("t2");
        t2.setIndicator("Thông tin");
        t2.setContent(R.id.tab2);
        tabHost.addTab(t2);

        danhsachBus=new ArrayList<Bus>();
        danhsachBus.add(new Bus("1","Cho Lon - Ben Thanh"));
        danhsachBus.add(new Bus("150","Cho Lon - Suoi Tien"));
        BusAdapter busAdapter= new BusAdapter(MainActivity.this, R.layout.bus_layout,danhsachBus);
        //gridView.setAdapter(busAdapter);


    }
}
