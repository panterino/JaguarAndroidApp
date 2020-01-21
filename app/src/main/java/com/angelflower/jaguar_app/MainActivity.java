package com.angelflower.jaguar_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.angelflower.jaguar_app.fragmentos.AjustesFragmento;
import com.angelflower.jaguar_app.fragmentos.AprendeFragmento;
import com.angelflower.jaguar_app.fragmentos.InicioFragmento;
import com.angelflower.jaguar_app.fragmentos.MensajesFragmento;
import com.angelflower.jaguar_app.fragmentos.NotificacionesFragmento;
import com.angelflower.jaguar_app.fragmentos.PerfilFragmento;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigation = findViewById(R.id.navigationView);
        bottomNavigation.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        openFragment(InicioFragmento.newInstance("", ""));

    }

    public void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.navigation_inicio:
                            openFragment(InicioFragmento.newInstance("", ""));
                            return true;
                        case R.id.navigation_aprende:
                            openFragment(AprendeFragmento.newInstance("", ""));
                            return true;
                        case R.id.navigation_mensajes:
                            openFragment(MensajesFragmento.newInstance("", ""));
                            return true;
                        case R.id.navigation_notificaciones:
                            openFragment(NotificacionesFragmento.newInstance("", ""));
                            return true;
                    }
                    return false;
                }
            };



    }
