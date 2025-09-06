package com.kakao.tistory.presentation.screen.blog.main;

import androidx.compose.runtime.State;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class x extends SuspendLambda implements Function2 {
    public final String a;
    public final boolean b;
    public final State c;

    public x(String s, boolean z, State state0, Continuation continuation0) {
        this.a = s;
        this.b = z;
        this.c = state0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new x(this.a, this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((x)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        BlogMainScreenKt.access$BlogMainScreen$lambda$0(this.c).getInit().invoke(this.a, Boxing.boxBoolean(this.b));
        return Unit.INSTANCE;
    }
}

