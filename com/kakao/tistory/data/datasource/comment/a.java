package com.kakao.tistory.data.datasource.comment;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class a extends ContinuationImpl {
    public CommentDataSource a;
    public Query b;
    public ListMode c;
    public Long d;
    public Object e;
    public final CommentDataSource f;
    public int g;

    public a(CommentDataSource commentDataSource0, Continuation continuation0) {
        this.f = commentDataSource0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.e = object0;
        this.g |= 0x80000000;
        return CommentDataSource.a(this.f, null, this);
    }
}

