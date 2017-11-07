package com.ramadhany.vodjo.latihan1.helper;

/**
 * Created by RaRa on 12/10/2017.
 */

public class UtilsApi {
    // 10.0.2.2 ini adalah localhost.
    // bisa juga di masukan dengan IP address kalian
    public static final String BASE_URL_API =
            "http://192.168.88.16/latihan1/";

    // Mendeklarasikan Interface BaseApiService
    public static ApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(ApiService.class);
    }
}
