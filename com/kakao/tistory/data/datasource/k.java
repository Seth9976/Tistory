package com.kakao.tistory.data.datasource;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class k extends ContinuationImpl {
    public SearchPostDataSource a;
    public Function2 b;
    public Function1 c;
    public boolean d;
    public Object e;
    public final SearchPostDataSource f;
    public int g;

    public k(SearchPostDataSource searchPostDataSource0, Continuation continuation0) {
        this.f = searchPostDataSource0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.e = object0;
        this.g |= 0x80000000;
        return this.f.loadItems(0, false, 0, null, null, this);
    }
}

