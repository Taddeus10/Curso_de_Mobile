package br.com.digiralhouse.comunicaoentrefragments.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import br.com.digiralhouse.comunicaoentrefragments.R;
import br.com.digiralhouse.comunicaoentrefragments.model.Pessoa;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {


    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        TextView textViewName = view.findViewById(R.id.textViewName);
        TextView textViewProfession = view.findViewById(R.id.textProfession);
        TextView textViewAge = view.findViewById(R.id.textViewAge);

        if (getArguments() !=null){
            Pessoa pessoa = getArguments().getParcelable("Pessoa");

            if (pessoa != null) {
                textViewName.setText(pessoa.getName());
                textViewProfession.setText(pessoa.getProfession());
                textViewAge.setText(pessoa.getAge() + " Anos");
            }

        }

        return view;
    }

}
