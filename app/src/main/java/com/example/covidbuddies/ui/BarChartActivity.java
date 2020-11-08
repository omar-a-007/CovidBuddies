package com.example.covidbuddies.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.example.covidbuddies.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class BarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart2);

        BarChart barChart = findViewById(R.id.barChart);

        ArrayList<BarEntry> points = new ArrayList<>();
        points.add(new BarEntry(1, 420));
        points.add(new BarEntry(2, 425));
        points.add(new BarEntry(4, 400));
        points.add(new BarEntry(3, 420));
        points.add(new BarEntry(5, 370));
        points.add(new BarEntry(6, 420));
        points.add(new BarEntry(7, 470));

        BarDataSet barDataSet = new BarDataSet(points, "Healthy Points");
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(16f);

        BarData barData = new BarData(barDataSet);

        barChart.setFitBars(true);
        barChart.setData(barData);
        barChart.getDescription().setText("Bar Chart Example");
        barChart.animateY(2000);


    }
}