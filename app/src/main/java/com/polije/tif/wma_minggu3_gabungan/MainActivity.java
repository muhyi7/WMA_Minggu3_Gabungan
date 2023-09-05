package com.polije.tif.wma_minggu3_gabungan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void linearLayout1(View view) {
        Intent pindahLinearLayout = new Intent(MainActivity.this, LinearLayout.class);
        startActivity(pindahLinearLayout);
    }

    public void relativeLayout2(View view) {
        Intent pindahRelativeLayout = new Intent(MainActivity.this, RelativeLayout.class);
        startActivity(pindahRelativeLayout);
    }

    public void constraintLayout3(View view) {
        Intent pindahConstraintLayout = new Intent(MainActivity.this, ConstraintLayout.class);
        startActivity(pindahConstraintLayout);
    }

    public void frameLayout(View view) {
        Intent pindahFrameLayout = new Intent(MainActivity.this, FrameLayout.class);
        startActivity(pindahFrameLayout);
    }

    public void tableLayout(View view) {
        Intent pindahTableLayout = new Intent(MainActivity.this, TableLayout.class);
        startActivity(pindahTableLayout);
    }

    public void materialDesign(View view) {
        Intent pindahMaterialDesign = new Intent(MainActivity.this, MaterialDesign.class);
        startActivity(pindahMaterialDesign);
    }

    public void scrollView(View view) {
        Intent pindahScrollView = new Intent(MainActivity.this, ScrollView.class);
        startActivity(pindahScrollView);
    }

    public void scrollViewHorizontal(View view) {
        Intent pindahScrollViewHorizontal = new Intent(MainActivity.this, ScrollViewHorizontal.class);
        startActivity(pindahScrollViewHorizontal);
    }
}