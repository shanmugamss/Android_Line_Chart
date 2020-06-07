package com.example.android_line_chart;
// Shanmugamss
// Status : This chart worked fine. Sucess.

// Taken from Youtube video link : https://www.youtube.com/watch?v=DD1CxoVONFE&list=PLc2rvfiptPSR7NliWRLwweX55XwrsrTOO&index=2

//Worked Fine with Line charts. No Animation .
// Limits are being set.


import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
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
        mChart.setDragEnabled(true);
        mChart.setScaleEnabled(false);
        mChart.setBackgroundColor(Color.rgb(200,200,200));


        // Formats X axis and Y axis alone . Just the axis , not the data.

        XAxis xAxis = mChart.getXAxis();
        YAxis yAxis = mChart.getAxisLeft();

        YAxis yRight = mChart.getAxisRight();
        yRight.disableAxisLineDashedLine();

        xAxis.setAxisMaximum(70f);
        xAxis.setAxisMinimum(20f);
        xAxis.setTextColor(Color.rgb(255,255,100));
        xAxis.setTextSize(20);
        xAxis.setAxisLineColor(Color.rgb(0,0,255));

        yAxis.setAxisMaximum(100f);
        yAxis.setAxisMinimum(-20f);
        yAxis.setTextColor(Color.rgb(100,255,200));
        yAxis.setTextSize(20);
        yAxis.setAxisLineColor(Color.rgb(0,0,255));


        ArrayList<Entry> yValues = new ArrayList<>();
        yValues.add(new Entry(30f,60f));
        yValues.add(new Entry(35f,30f));
        yValues.add(new Entry(40f,60f));
        yValues.add(new Entry(45f,10f));
        yValues.add(new Entry(50f,30f));
        yValues.add(new Entry(60f,60f));


        LineDataSet set1  = new LineDataSet(yValues,"Data Set 1");
        set1.setFillAlpha(10);
        set1.setCircleColor(Color.rgb(100,50,100));
        set1.setCircleHoleRadius(20f);
        set1.setCircleRadius(5f);
        set1.setLineWidth(5f);

        ArrayList<ILineDataSet> dataSets = new ArrayList<>();
        dataSets.add(set1);
        LineData data = new LineData(dataSets);
        mChart.setData(data);



    }
}