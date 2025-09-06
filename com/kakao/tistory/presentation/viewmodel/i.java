package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.data.datasource.BlogFollowerDataSource;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function0 {
    public final BlogFollowViewModel a;
    public final String b;
    public final String c;

    public i(BlogFollowViewModel blogFollowViewModel0, String s, String s1) {
        this.a = blogFollowViewModel0;
        this.b = s;
        this.c = s1;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BlogFollowerDataSource blogFollowerDataSource0 = new BlogFollowerDataSource(this.a.h, this.b, this.c);
        this.a.p = blogFollowerDataSource0;
        return blogFollowerDataSource0;
    }
}

