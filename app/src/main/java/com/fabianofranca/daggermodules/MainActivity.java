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
import com.fabianofranca.sandero.SanderoFragment;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {

    private static final String TAG = "Sandero";

    private String[] drawerItems = {"1", "2", "3"};
    private DrawerLayout drawerLayout;
    private ListView listView;
    private ActionBarDrawerToggle drawerToggle;

    @Inject
    SanderoFragment fragment1;

    @Inject
    SanderoFragment fragment2;

    @Inject
    SanderoFragment fragment3;

    private List<DescribableFragment> fragments =  new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        drawerLayout.post( () -> drawerToggle.syncState());
        //endregion

        //region LISTVIEW
        listView = findViewById(R.id.main_list);

        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                drawerItems));

        listView.setOnItemClickListener(new DrawerItemClickListener());
        //endregion

        fragments.add(fragment1);
        fragments.add(fragment2);
        fragments.add(fragment3);

        replaceFragment(fragments.get(0));
    }

    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            selectItem(position);
        }
    }

    private void selectItem(int position) {
        listView.setItemChecked(position, true);
        setTitle(drawerItems[position]);
        replaceFragment(fragments.get(position));
        drawerLayout.closeDrawer(listView);
    }

    private void replaceFragment(DescribableFragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_content, fragment);
        fragmentTransaction.commit();
    }
}