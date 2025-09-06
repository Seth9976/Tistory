package com.bumptech.glide.signature;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import java.security.MessageDigest;

public final class EmptySignature implements Key {
    public static final EmptySignature a;

    static {
        EmptySignature.a = new EmptySignature();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NonNull
    public static EmptySignature obtain() {
        return EmptySignature.a;
    }

    @Override
    public String toString() {
        return "EmptySignature";
    }

    @Override  // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest0) {
    }
}

