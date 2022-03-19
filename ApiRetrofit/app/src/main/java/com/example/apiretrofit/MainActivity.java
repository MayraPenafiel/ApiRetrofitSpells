package com.example.apiretrofit;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.apiretrofit.io.serviceApi;
import com.example.apiretrofit.model.Hechizo;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView item;
        
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        item=findViewById(R.id.txthechizo);

        getFact();

    }

    private void getFact(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://wizard-world-api.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        serviceApi ser=retrofit.create(serviceApi.class);

        Call<List<Hechizo>> hec = ser.getAllHechizo();

        hec.enqueue(new Callback<List<Hechizo>>() {

            @Override
            public void onResponse(Call<List<Hechizo>> call, Response<List<Hechizo>> response) {
                if (!response.isSuccessful()) {
                    item.setText(": "+response.code());
                    return;
                }
                List<Hechizo> listaH= response.body();

                for(Hechizo h :listaH ){
                    String c= "";
                    c+="__________________________________________________"+"\n";
                    c+="Nombre: "+h.getName()+"\n";
                    c+="Conjuro: "+h.getIncantation()+"\n";
                    c+="Efecto: "+h.getEffect()+"\n";
                    c+="Tipo: "+h.getType()+"\n";
                    c+="Luz: "+h.getLight()+"\n";
                    c+="Creador: "+h.getCreator()+"\n";
                    item.append(c);
                }
            }

            @Override
            public void onFailure(Call<List<Hechizo>> call, Throwable t) {
                item.setText(t.getMessage());
            }
        });
    }
}