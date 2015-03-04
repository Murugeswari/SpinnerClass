package com.example.androidspinnerexample;


import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.ClipData.Item;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends Activity {

private static final OnItemSelectedListener MyonItemSelectedListener = null;

private static final OnItemClickListener MysecoundItemSelectedListener=null;

private Spinner Spinner1,Spinner2;

private Button button;

@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
addItemOnSpinner2();
addListenerOnButton();
addListenerOnSpinnerItemSelection();

}


private void addListenerOnSpinnerItemSelection() {
Spinner1=(Spinner) findViewById(R.id.spinner1);
Spinner1.setOnItemSelectedListener(new MyonItemSelectedListener());
// TODO Auto-generated method stub

}


private void addListenerOnButton() {
Spinner1=(Spinner) findViewById(R.id.spinner1);
Spinner2=(Spinner) findViewById(R.id.spinner2);
button=(Button)  findViewById(R.id.button);
button.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {

Toast.makeText(MainActivity.this, "this is the spinner class",Toast.LENGTH_SHORT);
// TODO Auto-generated method stub

}
});
// TODO Auto-generated method stub

}


private void addItemOnSpinner2() {
// TODO Auto-generated method stub
Spinner2=(Spinner) findViewById(R.id.spinner2);
List list=new ArrayList();
list.add("Saranya");
list.add("Ambika");
list.add("ShreeMidhun");
list.add("Raj Kumar");
list.add("Ruban Raj");
list.add("Suganya");
list.add("Monika");
list.add("Shanmuga Priya");

ArrayAdapter dataAdapter=new ArrayAdapter(this,android.R.layout.simple_spinner_item,list);
dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
Spinner2.setAdapter(dataAdapter);

}


@Override
public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
getMenuInflater().inflate(R.menu.main, menu);
return true;
}

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//        if (id == R.id.action_settings) {
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
}

