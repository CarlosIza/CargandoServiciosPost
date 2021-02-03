package com.example.cargandoserviciospost;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
private TextView miJson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miJson = (TextView)findViewById(R.id.gsonText);
    }
    private void getPost(){
        Gson gson = new Gson();
        Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
                //.addConverterFactory(GsonConverterFactory.create())
                .build();




    }
}