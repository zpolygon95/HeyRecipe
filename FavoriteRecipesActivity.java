package io.zjp.heyrecipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FavoriteRecipesActivity extends AppCompatActivity {

    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_recipes);

        // Find the ListView resource.
        mainListView = (ListView) findViewById( R.id.mainListView );

        // Create and populate a List of recipe names.
        String[] recipes = new String[] { "Tacos", "Mac and Cheese", "BBQ Chicken Poppers", "Chinese Chicken Fried Rice",
                "Chicken Pot Pie"};
        ArrayList<String> recipeList = new ArrayList<>();
        recipeList.addAll( Arrays.asList(recipes) );

        // Create ArrayAdapter using the recipe list.
        listAdapter = new ArrayAdapter<>(this, R.layout.simplerow, recipeList);

        // Add more recipes. If you passed a String[] instead of a List<String>
        // into the ArrayAdapter constructor, you must not add more items.
        // Otherwise an exception will occur.
        listAdapter.add( "Smoky Chicken Chili" );
        listAdapter.add( "Standing Rib Roast" );
        listAdapter.add( "Corned Beef and Cabbage" );
        listAdapter.add( "Beef Burritos" );
        listAdapter.add( "Cilantro Lime Grilled Shrimp" );

        // Set the ArrayAdapter as the ListView's adapter.
        mainListView.setAdapter( listAdapter );

    }
}
