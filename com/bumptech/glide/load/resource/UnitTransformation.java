package com.bumptech.glide.load.resource;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import java.security.MessageDigest;

public final class UnitTransformation implements Transformation {
    public static final UnitTransformation a;

    static {
        UnitTransformation.a = new UnitTransformation();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NonNull
    public static UnitTransformation get() {
        return UnitTransformation.a;
    }

    @Override  // com.bumptech.glide.load.Transformation
    @NonNull
    public Resource transform(@NonNull Context context0, @NonNull Resource resource0, int v, int v1) {
        return resource0;
    }

    @Override  // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest0) {
    }
}

