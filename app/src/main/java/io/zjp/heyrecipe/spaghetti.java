package io.zjp.heyrecipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class spaghetti extends AppCompatActivity {

    private Button button;

    String items[] = new String [] {"Olive Oil", "Lean ground beef", "Dry Spaghetti", "Garlic", "Salt and Pepper", "Fresh Basil", "Jar four cheese marinar sauce",
    "Canned petite diced tomatoes", "Warm Water", "Parmesan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spaghetti);

        final ListView listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShoppingListActivity();
            }
        });
    }
    public void openShoppingListActivity(){
        Intent intent = new Intent(this, ShoppingListActivity.class);
        startActivity(intent);
    }
}
