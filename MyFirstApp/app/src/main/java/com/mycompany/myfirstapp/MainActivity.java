package com.mycompany.myfirstapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {


    /*
        EL APK ESTA EN; D:\Android\MyFirstApp\MyFirstApp\app\build\outputs\apk
    * */
    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        // Creo una actividad
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        // Recupero el campo del texto editable
        EditText editText = (EditText) findViewById(R.id.edit_message);
        // Obtengo el texto del campo
        String message = editText.getText().toString();
        // Pongo el texto en el intent
        intent.putExtra(EXTRA_MESSAGE, message);
        // Finalizo la actuvidad
        startActivity(intent);
    }
}
