package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.data.datasource.BlogFollowingDataSource;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function0 {
    public final BlogFollowViewModel a;
    public final String b;

    public j(BlogFollowViewModel blogFollowViewModel0, String s) {
        this.a = blogFollowViewModel0;
        this.b = s;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BlogFollowingDataSource blogFollowingDataSource0 = new BlogFollowingDataSource(this.a.h, this.b);
        this.a.o = blogFollowingDataSource0;
        return blogFollowingDataSource0;
    }
}

