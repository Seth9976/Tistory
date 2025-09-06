package com.kakao.tistory.presentation.common.tiara;

import com.kakao.tiara.data.ActionKind;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class a extends SuspendLambda implements Function2 {
    public final String a;
    public final String b;
    public final ActionKind c;
    public final Map d;

    public a(String s, String s1, ActionKind actionKind0, Map map0, Continuation continuation0) {
        this.a = s;
        this.b = s1;
        this.c = actionKind0;
        this.d = map0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new a(this.a, this.b, this.c, this.d, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((a)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        TistoryTiara.trackPage$default(TistoryTiara.INSTANCE, this.a, this.b, null, this.c, null, this.d, null, 84, null);
        return Unit.INSTANCE;
    }
}

