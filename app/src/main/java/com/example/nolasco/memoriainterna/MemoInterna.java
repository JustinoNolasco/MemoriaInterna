package com.example.nolasco.memoriainterna;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MemoInterna extends ActionBarActivity implements View.OnClickListener {
//declaracion de variables
    private EditText edTexto;
    private Button btnabrir,btnGuardar;
    private static final int READ_BLOCK_SIZE=100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo_interna);
        //SE DESCRIBEN LOS BOTONES Y LOS TEXTOS



        edTexto=(EditText)findViewById(R.id.edDocumento);
        btnabrir=(Button)findViewById(R.id.btnabrir);
        btnGuardar=(Button)findViewById(R.id.btnGuardar);
        btnGuardar.setOnClickListener(this);
        btnabrir.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_memo_interna, menu);
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

    @Override
    public void onClick(View v) {
        if (v.equals(btnGuardar)) {
            String str = edTexto.getText().toString();

    }
}
}

