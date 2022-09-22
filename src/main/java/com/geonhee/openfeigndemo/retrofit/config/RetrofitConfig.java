package com.geonhee.openfeigndemo.retrofit.config;

import com.geonhee.openfeigndemo.retrofit.client.UserAPI;
import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import java.util.concurrent.TimeUnit;

@Configuration
public class RetrofitConfig {

  private static final String USER_API_URL = "http://localhost:8080";

  @Bean
  public OkHttpClient okHttpClient() {
    return new OkHttpClient.Builder()
        .connectTimeout(20, TimeUnit.SECONDS)
        .writeTimeout(60, TimeUnit.SECONDS)
        .readTimeout(60, TimeUnit.SECONDS)
        .build();
  }

  @Bean
  public Retrofit retrofit(OkHttpClient client) {
    return new Retrofit.Builder()
        .baseUrl(USER_API_URL)
        .addConverterFactory(ScalarsConverterFactory.create())
        .addConverterFactory(JacksonConverterFactory.create())
        .client(client)
        .build();
  }

  @Bean
  public UserAPI userAPI(Retrofit retrofit) {
    return retrofit.create(UserAPI.class);
  }
}
