package com.example.android_line_chart;
// Shanmugamss
// Status : This chart worked fine. Sucess.
//Worked Fine with Line charts. No Animation .



import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;


import java.util.ArrayList;


public class MainActivity extends AppCompatActivity  {

    private static final String TAG = "MainActivity";
    private LineChart mChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mChart = (LineChart) findViewById(R.id.linechart);
//        mChart.setOnChartGestureListener(MainActivity.this);
//        mChart.setOnChartValueSelectedListener(MainActivity.this);
        mChart.setDragEnabled(true);
        mChart.setScaleEnabled(false);
        mChart.setBackgroundColor(Color.rgb(200,200,100));
        ArrayList<Entry> yValues = new ArrayList<>();

        yValues.add(new Entry(0,60f));
        yValues.add(new Entry(1,30f));
        yValues.add(new Entry(2,60f));
        yValues.add(new Entry(3,10f));
        yValues.add(new Entry(4,30f));
        yValues.add(new Entry(5,60f));

        LineDataSet set1  = new LineDataSet(yValues,"Data Set 1");
        set1.setFillAlpha(100);
        ArrayList<ILineDataSet> dataSets = new ArrayList<>();
        dataSets.add(set1);
        LineData data = new LineData(dataSets);
        mChart.setData(data);



    }
}