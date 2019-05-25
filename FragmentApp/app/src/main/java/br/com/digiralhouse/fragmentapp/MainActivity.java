package br.com.digiralhouse.fragmentapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.digiralhouse.fragmentapp.fragments.Fragment2;
import br.com.digiralhouse.fragmentapp.fragments.fragmento1;

public class MainActivity extends AppCompatActivity {

    private Button btnFragment1;
    private Button btnFragment2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        btnFragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                addFragment(new fragmento1());
            }
        });

        btnFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addFragment(new Fragment2());
            }
        });
    }

    private void addFragment(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack("FRAGMENTS");
        transaction.commit();

        //Pode ser feito assim
        /*getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, fragment)
                .addToBackStack("FRAGMENTS")
                .commit();
         */
    }

    private void initViews() {
        btnFragment1 = findViewById(R.id.btnFragmento1);
        btnFragment2 = findViewById(R.id.btnFragmento2);
    }
}
