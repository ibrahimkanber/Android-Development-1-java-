package com.ibrahim.landmarkbookjava;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.ibrahim.landmarkbookjava.databinding.ActivityDetailsBinding;
import com.ibrahim.landmarkbookjava.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;


public class MainActivity extends AppCompatActivity {
    ArrayList<Landmark> landmarkArrayList;
    private ActivityMainBinding binding;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


    landmarkArrayList=new ArrayList<>();
    //data
    Landmark pisa=new Landmark("Pisa","Italy",R.drawable.pisa);
    Landmark eiffel=new Landmark("Eiffel","France",R.drawable.eifel);
    Landmark colosseum=new Landmark("Colosseum","Italy",R.drawable.colosseum);
    Landmark londonBridge=new Landmark("London Bridge","UK",R.drawable.london);

       landmarkArrayList.add(pisa);
       landmarkArrayList.add(eiffel);
       landmarkArrayList.add(colosseum);
       landmarkArrayList.add(londonBridge);

       binding.recyclerview.setLayoutManager(new LinearLayoutManager(this));
       LandmarkAdapter landmarkAdapter=new LandmarkAdapter(landmarkArrayList);
       binding.recyclerview.setAdapter(landmarkAdapter);

        /*
       //Adapter
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,landmarkArrayList.stream().map(landmark -> landmark.name).collect(Collectors.toList()));
        binding.listView.setAdapter(arrayAdapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this,landmarkArrayList.get(position).name,Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("landmark",landmarkArrayList.get(position));
                startActivity(intent);
            }
        });
        */



    }

}