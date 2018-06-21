package com.example.kush.project_material_api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by kush on 2018. 6. 4..
 */

public interface NaverApiService {

    @Headers({
            "X-Naver-Client-id:l2QLPCtaiyI43yHTo_MU",
            "X-Naver-Client-Secret:sBxOqEEJEy"
    })
    @GET("/v1/search/news.json")
    Call<NewsItems> getSearchItems(
            @Query(value = "query", encoded=true) String query,
            @Query(value = "display") String display,
            @Query(value = "start") String start,
            @Query(value = "sort") String sort
    );
}
