package com.bumptech.glide.load.model;

import java.util.Map;

public interface Headers {
    public static final Headers DEFAULT;
    @Deprecated
    public static final Headers NONE;

    static {
        Headers.NONE = new n();  // 初始化器: Ljava/lang/Object;-><init>()V
        Headers.DEFAULT = new Builder().build();
    }

    Map getHeaders();
}

