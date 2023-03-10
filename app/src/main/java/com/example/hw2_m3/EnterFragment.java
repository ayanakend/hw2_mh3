package com.example.hw2_m3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class EnterFragment extends Fragment {

    EditText editTextTime;
    Button button_one;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_enter, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        findView();
        setClickListeners();
    }

    private void setClickListeners() {
        button_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                if (editTextTime.getText().toString().isEmpty()){

                } else {
                    bundle.putString("012", editTextTime.getText().toString());
                    FinalFragment fragment = new FinalFragment();
                    fragment.setArguments(bundle);
                    requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).addToBackStack("").commit();
                }
            }
        });
    }

    void findView () {
        editTextTime = requireActivity().findViewById(R.id.editText);
        button_one = requireActivity().findViewById(R.id.btn);
    }
}