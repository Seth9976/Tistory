package com.google.firebase.installations;

import androidx.annotation.NonNull;

public class RandomFidGenerator {
    public static final byte a;
    public static final byte b;

    static {
        RandomFidGenerator.a = 0x70;
        RandomFidGenerator.b = 15;
    }

    @NonNull
    public String createRandomFid() [...] // 潜在的解密器
}

