package com.kakao.tistory.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import retrofit2.Response;

public final class t extends ContinuationImpl {
    public BaseRepository a;
    public Response b;
    public String c;
    public Object d;
    public final BaseRepository e;
    public int f;

    public t(BaseRepository baseRepository0, Continuation continuation0) {
        this.e = baseRepository0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.d = object0;
        this.f |= 0x80000000;
        return BaseRepository.a(this.e, null, this);
    }
}

