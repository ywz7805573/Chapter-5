package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */
public class Cat {
    @SerializedName("id") private String id;
    @SerializedName("url") private String url;
    @SerializedName("width") private int width;
    @SerializedName("height") private int height;
    public String getId(){
        return id;
    }
    public String getUrl(){
        return url;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    // TODO-C1 (1) Implement your Cat Bean here according to the response json
}
