package fr.utt.if26.fillmyfridge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class GenerateListMenuPersonPerMealActivity extends AppCompatActivity implements View.OnClickListener {

    private Button continueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_list_menu_person_per_meal);
        Intent intent = getIntent();
        ArrayList<Integer> mealsNumber = intent.getIntegerArrayListExtra("mealsNumber");
        for(int o : mealsNumber){
            Log.e("mealsNumber: ", o + "");
        }
        continueButton = (Button) findViewById(R.id.gen_menu_list_person_per_meal_continue);
        continueButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.gen_menu_list_person_per_meal_continue:
                Intent themeIntent = new Intent(GenerateListMenuPersonPerMealActivity.this, GenerateListMenuMealThemeActivity.class);
                GenerateListMenuPersonPerMealActivity.this.startActivity(themeIntent);
                break;
        }
    }
}
