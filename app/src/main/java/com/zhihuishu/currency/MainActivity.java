package com.zhihuishu.currency;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    // Define string array.
    String[] listValue = new String[] {"100 SGD  =  496 CNY ","100 CNY  =  14.7 USD","100 USD  =  784.0 HKD ","100 HKD  =  9.0 GBP ","100 GBP  =  176.0 SGD ","......"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_2, android.R.id.text1, listValue);

        listView.setAdapter(adapter);

        // ListView on item selected listener.
        listView.setOnItemClickListener(new OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // Getting list view click value into String variable.
                String TempListViewClickedValue = listValue[position];

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                // Sending value to another activity using intent.
                intent.putExtra("ListViewClickedValue", TempListViewClickedValue);

                startActivity(intent);

            }
        });

    }
}
