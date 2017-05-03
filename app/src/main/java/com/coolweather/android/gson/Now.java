package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/5/3.
 */

/*public class Now {
    public String tmp;
    public Cond cond;
    public class Cond{
        public String txt;
    }
}*/
public class Now{
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}