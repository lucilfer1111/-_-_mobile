package com.example.pizza.Activity;

import static com.example.pizza.Fragment.HomeFragment.clearClicked;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pizza.Fragment.HomeFragment;
import com.example.pizza.Model.Utils;
import com.example.pizza.R;


public class SearchFiltersActivity extends AppCompatActivity implements View.OnClickListener {
    TextView clearFilters;
    LinearLayout categoryAlaCarte, categoryBento, categoryHandRoll, categoryBeverage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_filters);

        initAll();

        clearFilters.setOnClickListener(this);

        categoryAlaCarte.setOnClickListener(this);
        categoryBento.setOnClickListener(this);
        categoryHandRoll.setOnClickListener(this);
        categoryBeverage.setOnClickListener(this);


    }

    private void initAll() {
        clearFilters = findViewById(R.id.id_clear_btn);
        categoryAlaCarte = findViewById(R.id.cat_alacart);
        categoryBento = findViewById(R.id.cat_bento);
        categoryHandRoll = findViewById(R.id.cat_handroll);
        categoryBeverage = findViewById(R.id.cat_beverage);
    }

    public void goBack(View view) {
        finish();
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if (id == R.id.cat_alacart || id == R.id.cat_bento || id == R.id.cat_handroll || id == R.id.cat_beverage) {
            if (id == R.id.cat_alacart) {
                HomeFragment.category = "Pizza";
            } else if (id == R.id.cat_bento) {
                HomeFragment.category = "Drinks";
            } else if (id == R.id.cat_handroll) {
                HomeFragment.category = "Chicken";
            } else if (id == R.id.cat_beverage) {
                HomeFragment.category = "Others";
            }
            HomeFragment.isCategorySeleted = true;
            HomeFragment.isFiltersApplied = true;
            finish();
        } else if (id == R.id.id_clear_btn) {
            clearClicked();
            finish();
        }

    }
}