package com.bawei.demo0107;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;

/**
 * ProjectName: Demo0107
 * PackageName: com.bawei.demo0107
 * ClassName:   Service
 * Description: Java类的作用
 * Author: Lazy
 * CreateDate: 2020/1/7_8:44
 */
public interface Service {


    @GET("small/order/verify/v1/findShoppingCart")
    Observable<Entity> getData(@Header("userId") String uid,@Header("sessionId") String sesid);

}
