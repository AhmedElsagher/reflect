package com.example.ahmed.dialogft;


import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Mydialog extends DialogFragment
        //implements View.OnClickListener
        {






            @Override
            public Dialog onCreateDialog(Bundle savedInstanceState) {
                AlertDialog.Builder builder= new AlertDialog.Builder(getActivity());

                builder.setTitle("my Dream");
                LayoutInflater inflater=getActivity().getLayoutInflater();
                View view =inflater.inflate(R.layout.fragment_mydialog,null);
                builder.setView(view);
                Dialog dia =builder.create();
                return dia;
            }

}
