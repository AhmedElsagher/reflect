package com.example.ahmed.dialogft;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity  {
TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv= (TextView) findViewById(R.id.sol);

    }
 public void showDialog(View v){
     FragmentManager fm=getFragmentManager();
    // FragmentTransaction ft=fm.beginTransaction();
     Mydialog m=new Mydialog();
     m.show(fm,"MyD");
 }

 /// erase any overide methods
}
