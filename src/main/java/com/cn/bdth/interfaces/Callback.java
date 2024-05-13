package com.cn.bdth.interfaces;

import com.alibaba.fastjson.JSONObject;


/**
 *  回调
 *
 *
 * @version 1.0
 */
public interface Callback {

    void onSuccess(JSONObject rawData);

    void onFailure(JSONObject rawData, String cause);

    void onUpdate(JSONObject rawData);

}

