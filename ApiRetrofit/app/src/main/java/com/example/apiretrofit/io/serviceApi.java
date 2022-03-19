package com.example.apiretrofit.io;

import com.example.apiretrofit.model.Hechizo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface serviceApi {

        @GET("Spells")
        Call<List<Hechizo>> getAllHechizo();
    
}
