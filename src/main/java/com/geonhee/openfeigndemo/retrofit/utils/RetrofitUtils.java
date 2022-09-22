package com.geonhee.openfeigndemo.retrofit.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RetrofitUtils {

  public static <T> T execute(Call<T> call) {
    try {
      Response<T> response = call.execute();
      if (response.isSuccessful()) {
        return response.body();
      }
      throw new RuntimeException(response.raw().toString());
    } catch (IOException e) {
      throw new RuntimeException(e.getMessage());
    }
  }
}
