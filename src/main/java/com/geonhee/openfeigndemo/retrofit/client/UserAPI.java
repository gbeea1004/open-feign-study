package com.geonhee.openfeigndemo.retrofit.client;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserAPI {

  @GET("/users/status")
  Call<String> findStatus();
}
