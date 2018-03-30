package pl.blogprogramisty.musicapp.api;

import retrofit2.Retrofit;

public class ApiService {

    public static ApiClient getService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.theaudiodb.com/api/v1/json/{APIKEY}/")
                .build();

        return retrofit.create(ApiClient.class);
    }

}
