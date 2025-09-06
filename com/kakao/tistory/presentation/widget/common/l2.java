package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.MutableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class l2 extends SuspendLambda implements Function2 {
    public final CoroutineScope a;
    public final MutableState b;

    public l2(CoroutineScope coroutineScope0, MutableState mutableState0, Continuation continuation0) {
        this.a = coroutineScope0;
        this.b = mutableState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new l2(this.a, this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new l2(this.a, this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        if(!RoundButtonKt.access$RoundButton$lambda$0(this.b)) {
            k2 k20 = new k2(this.b, null);
            BuildersKt.launch$default(this.a, null, null, k20, 3, null);
        }
        return Unit.INSTANCE;
    }
}

