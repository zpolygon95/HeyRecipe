package io.zjp.heyrecipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecipesActivity extends AppCompatActivity {
    private Button button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFavoriteRecipesActivity();
            }
        });
    }

    public void openFavoriteRecipesActivity(){
        Intent intent = new Intent(this, FavoriteRecipesActivity.class);
        startActivity(intent);
    }
}
