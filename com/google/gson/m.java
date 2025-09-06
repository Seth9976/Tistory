package com.google.gson;

import com.google.gson.internal.ReflectionAccessFilterHelper;

public final class m implements ReflectionAccessFilter {
    // 去混淆评级： 低(20)
    @Override  // com.google.gson.ReflectionAccessFilter
    public final FilterResult check(Class class0) {
        return ReflectionAccessFilterHelper.isAnyPlatformType(class0) ? FilterResult.BLOCK_ALL : FilterResult.INDECISIVE;
    }
}

