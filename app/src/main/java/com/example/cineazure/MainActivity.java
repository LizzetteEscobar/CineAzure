package com.example.cineazure;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.cineazure.Fragments.ClaquetaFragment;
import com.example.cineazure.Fragments.ConfiteriaFragment;
import com.example.cineazure.Fragments.UbicacionFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView mBottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        showSelectedFragment(new ClaquetaFragment());

        mBottomNavigation = (BottomNavigationView) findViewById(R.id.bottomNavigation);

        mBottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                if (menuItem.getItemId() == R.id.menu_claqueta){ showSelectedFragment(new ClaquetaFragment()); }
                if (menuItem.getItemId() == R.id.menu_ubicacion){ showSelectedFragment(new UbicacionFragment()); }
                if (menuItem.getItemId() == R.id.menu_confiteria){ showSelectedFragment(new ConfiteriaFragment()); }

                return true;
            }
        });
    }

    /*
     *METODO QUE PERMITE EJECUTAR EL FRAGMENT
     */
    private void  showSelectedFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();
    }
}
