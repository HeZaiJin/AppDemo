package com.haozhang.retrofit.reset.service;

import com.haozhang.retrofit.reset.modle.ResponseListEvent;

import retrofit.Call;
import retrofit.http.POST;
import retrofit.http.Query;

/**
 * Created by Administrator on 2015/12/18.
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