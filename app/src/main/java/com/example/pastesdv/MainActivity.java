package com.example.pastesdv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView ePassats;
    Esdeveniment esdv = new Esdeveniment("concert", "aasa", 2, 2.43, 123);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ePassats =(ListView)findViewById(R.id.ePassats);
        esdv.addPastEvents(esdv);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,esdv.getPastEventsListName());

        ePassats.setAdapter(adapter);
        ePassats.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;
                String itemValue = (String) ePassats.getItemAtPosition(position);

                Toast.makeText(getApplicationContext(),"Posició: "+itemPosition+" Valor: "+itemValue,Toast.LENGTH_LONG).show();
            }
        });
    }
}
