package com.google.gson.internal;

public final class JavaVersion {
    public static final int a;

    // 去混淆评级： 中等(50)
    static {
        JavaVersion.a = 0;
    }

    public static int getMajorJavaVersion() {
        return JavaVersion.a;
    }

    public static boolean isJava9OrLater() [...] // 潜在的解密器
}

