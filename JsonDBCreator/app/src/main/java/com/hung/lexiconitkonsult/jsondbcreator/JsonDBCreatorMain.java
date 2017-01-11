package com.hung.lexiconitkonsult.jsondbcreator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class JsonDBCreatorMain extends AppCompatActivity {

    private final String TAG = "JsonDBCreatorMain";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_dbcreator_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainoptions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void createDatabase(MenuItem item) {
        Log.d("Create database pressed", TAG);
    }

    public void openDatabase(MenuItem item) {
        Log.d("Open database pressed", TAG);
    }
}
