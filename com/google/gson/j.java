package com.google.gson;

import com.google.gson.internal.ReflectionAccessFilterHelper;

public final class j implements ReflectionAccessFilter {
    // 去混淆评级： 低(20)
    @Override  // com.google.gson.ReflectionAccessFilter
    public final FilterResult check(Class class0) {
        return ReflectionAccessFilterHelper.isJavaType(class0) ? FilterResult.BLOCK_INACCESSIBLE : FilterResult.INDECISIVE;
    }
}

