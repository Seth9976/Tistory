package com.google.gson;

public interface ReflectionAccessFilter {
    public static enum FilterResult {
        ALLOW,
        INDECISIVE,
        BLOCK_INACCESSIBLE,
        BLOCK_ALL;

    }

    public static final ReflectionAccessFilter BLOCK_ALL_ANDROID;
    public static final ReflectionAccessFilter BLOCK_ALL_JAVA;
    public static final ReflectionAccessFilter BLOCK_ALL_PLATFORM;
    public static final ReflectionAccessFilter BLOCK_INACCESSIBLE_JAVA;

    static {
        ReflectionAccessFilter.BLOCK_INACCESSIBLE_JAVA = new j();  // 初始化器: Ljava/lang/Object;-><init>()V
        ReflectionAccessFilter.BLOCK_ALL_JAVA = new k();  // 初始化器: Ljava/lang/Object;-><init>()V
        ReflectionAccessFilter.BLOCK_ALL_ANDROID = new l();  // 初始化器: Ljava/lang/Object;-><init>()V
        ReflectionAccessFilter.BLOCK_ALL_PLATFORM = new m();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    FilterResult check(Class arg1);
}

