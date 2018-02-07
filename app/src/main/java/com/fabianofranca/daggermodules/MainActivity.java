package com.fabianofranca.daggermodules;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.fabianofranca.core.DescribableFragment;

import java.util.Map;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {

    private static final String TAG = "Sandero";

    @Inject
    Map<String, DescribableFragment> fragments;

    private DrawerLayout drawerLayout;
    private ListView listView;
    private ActionBarDrawerToggle drawerToggle;
    private String[] fragmentsKeys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentsKeys = fragments.keySet().toArray(new String[0]);

        //region TOOLBAR
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        //endregion

        //region DRAWER LAYOUT
        drawerLayout = findViewById(R.id.main_drawer);
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, 0, 0) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };

        drawerLayout.addDrawerListener(drawerToggle);
        drawerLayout.post(() -> drawerToggle.syncState());
        //endregion

        //region LISTVIEW
        listView = findViewById(R.id.main_list);

        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                fragmentsKeys));

        listView.setOnItemClickListener(new DrawerItemClickListener());
        //endregion

        if (!fragments.isEmpty()) {
            listView.setSelection(0);
            selectItem(0);
        }
    }

    private void selectItem(int position) {
        listView.setItemChecked(position, true);

        String key = fragmentsKeys[position];
        setTitle(key);
        replaceFragment(key, fragments.get(key));
        drawerLayout.closeDrawer(listView);
    }

    private void replaceFragment(String title, DescribableFragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_content, fragment);
        fragmentTransaction.commit();
    }

    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            selectItem(position);
        }
    }
}