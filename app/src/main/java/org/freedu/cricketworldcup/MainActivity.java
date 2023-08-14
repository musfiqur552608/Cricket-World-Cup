package org.freedu.cricketworldcup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment = new HomeFragment();
    CountryFragment countryFragment = new CountryFragment();
    PlayerFragment playerFragment = new PlayerFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavView);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.homeid);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == R.id.homeid){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frameFragment,homeFragment)
                    .commit();
            return true;
        }
        else if(item.getItemId() == R.id.playerid){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frameFragment,playerFragment)
                    .commit();
            return true;
        } else if (item.getItemId() == R.id.countryid) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frameFragment,countryFragment)
                    .commit();
            return true;
        }

        return false;

    }
}