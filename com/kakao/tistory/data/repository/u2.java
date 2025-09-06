package com.kakao.tistory.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class u2 extends ContinuationImpl {
    public Object a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Object f;
    public Object g;
    public Object h;
    public final OldBlogRepositoryImpl i;
    public int j;

    public u2(OldBlogRepositoryImpl oldBlogRepositoryImpl0, Continuation continuation0) {
        this.i = oldBlogRepositoryImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.h = object0;
        this.j |= 0x80000000;
        return this.i.postBlogInfo(null, null, null, null, null, false, this);
    }
}

