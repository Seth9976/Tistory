package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.MutableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class s2 extends SuspendLambda implements Function2 {
    public final CoroutineScope a;
    public final MutableState b;

    public s2(CoroutineScope coroutineScope0, MutableState mutableState0, Continuation continuation0) {
        this.a = coroutineScope0;
        this.b = mutableState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new s2(this.a, this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new s2(this.a, this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        if(!RoundButtonKt.access$RoundToggleButton$lambda$2(this.b)) {
            r2 r20 = new r2(this.b, null);
            BuildersKt.launch$default(this.a, null, null, r20, 3, null);
        }
        return Unit.INSTANCE;
    }
}

