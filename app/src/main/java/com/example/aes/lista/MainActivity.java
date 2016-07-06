package com.example.aes.lista;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aes.lista.clases.ArrayAdapterPersona;
import com.example.aes.lista.clases.Persona;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 ListView listap ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        listap= (ListView)findViewById(R.id.listViewpersona);
       //  String[] Datos=new String[]{"Alex","Carlos","Maria"};
     //   ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Datos);
      //  listap.setAdapter(adapter);
        ArrayList<Persona> datos=new ArrayList<Persona>();
        Persona p1=new Persona(false,"Alex","Yungan");
        Persona p2=new Persona(false,"Carlos","perez");
        Persona p3=new Persona(false,"andrea","lopez");
        Persona p4=new Persona(true,"luis","zanches");
        datos.add(p1);
        datos.add(p2);
        datos.add(p3);
        datos.add(p4);
        ArrayAdapterPersona adapterPersona = new ArrayAdapterPersona(this,datos);
        listap.setAdapter(adapterPersona);

        listap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView nom=(TextView)view.findViewById(R.id.textView_nombre);
                TextView appellido=(TextView)view.findViewById(R.id.textView_Apellido);
                Toast.makeText(getApplicationContext(),nom.getText().toString()+" "+appellido.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });

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
}
