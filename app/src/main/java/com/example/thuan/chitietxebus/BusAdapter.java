package com.example.thuan.chitietxebus;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thuan on 3/11/2018.
 */

public class BusAdapter extends ArrayAdapter {
    private Context context;
    private int layout;
    private ArrayList<Bus> danhsachBus;
    public BusAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Bus> objects) {
        super(context, resource, objects);
        this.context=context;
        this.layout=resource;
        this.danhsachBus=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        TextView txtMaBus,txtTenBus;
        txtMaBus=convertView.findViewById(R.id.txtMaBus);
        txtTenBus=convertView.findViewById(R.id.txtTenBus);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout,parent, false);

        Bus bus=danhsachBus.get(position);
        txtMaBus.setText(bus.getMaSo().toString());
        txtTenBus.setText(bus.getTenTuyen().toString());

        return convertView;
    }
}
