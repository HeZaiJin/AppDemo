package com.haozhang.retrofit.rest.service;

import com.haozhang.retrofit.rest.modle.ResponseListEvent;

import retrofit.Call;
import retrofit.http.POST;
import retrofit.http.Query;

/**
 *ApiServices
 */
public interface ApiServices {

    /**历史上的今天API START*/

    /***
     * 事件列表
     * params:
     *      key:
     *      v:1.0
     *      month:
     *      day:
     * @return
     */
    @POST("toh")
    Call<ResponseListEvent> loadListInofs(@Query("v") String v,@Query("key") String key,@Query("month") int month,@Query("day") int day);

    /**历史上的今天API END*/

}