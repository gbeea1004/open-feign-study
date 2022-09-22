package com.geonhee.openfeigndemo.retrofit.service;

import com.geonhee.openfeigndemo.retrofit.client.UserAPI;
import com.geonhee.openfeigndemo.retrofit.utils.RetrofitUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import retrofit2.Call;

@RequiredArgsConstructor
@Service
public class RetrofitService {

  private final UserAPI userAPI;

  public String findStatus() {
    Call<String> call = userAPI.findStatus();
    return RetrofitUtils.execute(call);
  }
}
