package com.ramirez.diego.fragmentdinamico.Fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ramirez.diego.fragmentdinamico.R;

/**
 * Created by Diego on 05/03/2016.
 */
public class FragmentTwo extends Fragment {
    View view;
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.fragment_two,container,false);

        return view;
    }
}