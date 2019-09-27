package com.example.administrator.rxjavaretrofitdemo;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Administrator on 2019/9/27.
 */

public interface ApiService {
    @GET(Constans.retrofit)
   // Call<Bean> getRetrofit();
    Observable<Bean>  getRetrofit();
}
