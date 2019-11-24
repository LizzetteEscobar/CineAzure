package com.example.cineazure.Fragments;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.cineazure.*;

/**
 * A simple {@link Fragment} subclass.
 */
public class ClaquetaFragment extends Fragment implements View.OnClickListener{

    Button btnestreno;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_claqueta, container, false);

        return v;

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnestreno:
                Intent intent = new Intent(getContext(), DeltallePelicula.class);
                ((MainActivity) getActivity()).startActivity(intent);
                break;
        }
    }
}
