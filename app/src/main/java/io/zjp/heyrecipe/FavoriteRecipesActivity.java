package io.zjp.heyrecipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FavoriteRecipesActivity extends AppCompatActivity {

    String items[] = new String [] {"Tacos", "BBQ Chicken", "Spaghetti", "Chicken Fried Rice", "Chicken Pot Pie"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_recipes);

        final ListView listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                /*if (position == 0){
                    Intent intent = new Intent(view.getContext(),tacos.class);
                    startActivity(intent);
                }

                if (position == 1){
                    Intent intent = new Intent(view.getContext(),bbqChicken.class);
                    startActivity(intent);
                }
                */
                if (position == 2){
                    Intent intent = new Intent(view.getContext(),spaghetti.class);
                    startActivity(intent);
                }

                /*if (position == 3){
                    Intent intent = new Intent(view.getContext(),chickenFriedRice.class);
                    startActivity(intent);
                }

                if (position == 4){
                    Intent intent = new Intent(view.getContext(),chickenPotPie.class);
                    startActivity(intent);
                }*/

            }
        });
    }
}