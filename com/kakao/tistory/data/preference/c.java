package com.kakao.tistory.data.preference;

import androidx.datastore.preferences.core.MutablePreferences;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

public final class c extends SuspendLambda implements Function2 {
    public Object a;
    public final String b;

    public c(String s, Continuation continuation0) {
        this.b = s;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new c(this.b, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        c c0 = new c(this.b, ((Continuation)object1));
        c0.a = (MutablePreferences)object0;
        return c0.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        ((MutablePreferences)this.a).set(HomePreference.b, this.b);
        return Unit.INSTANCE;
    }
}

