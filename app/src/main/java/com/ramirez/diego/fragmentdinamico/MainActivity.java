package com.ramirez.diego.fragmentdinamico;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ramirez.diego.fragmentdinamico.Fragments.FragmentOne;
import com.ramirez.diego.fragmentdinamico.Fragments.FragmentTwo;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
        Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.fragment_one);
        btn2 = (Button) findViewById(R.id.fragment_two);

        FragmentOne  fragmentOne = new FragmentOne();
        getSupportFragmentManager().beginTransaction().add(R.id.container,fragmentOne);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.fragment_one:
                FragmentOne  fragmentOne = new FragmentOne();
                FragmentTransaction  fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container,fragmentOne);
                fragmentTransaction.commit();
                break;
            case R.id.fragment_two:
                FragmentTwo fragmentTwo = new FragmentTwo();
                FragmentTransaction  transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.container,fragmentTwo);
                transaction.commit();

                break;
            default:
                break;
        }
    }
}
