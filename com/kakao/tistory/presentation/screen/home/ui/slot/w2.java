package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.foundation.pager.PagerState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class w2 extends SuspendLambda implements Function2 {
    public final PagerState a;
    public final CoroutineScope b;

    public w2(PagerState pagerState0, CoroutineScope coroutineScope0, Continuation continuation0) {
        this.a = pagerState0;
        this.b = coroutineScope0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new w2(this.a, this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new w2(this.a, this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        if(this.a.getCurrentPageOffsetFraction() != 0.0f) {
            v2 v20 = new v2(this.a, null);
            BuildersKt.launch$default(this.b, null, null, v20, 3, null);
        }
        return Unit.INSTANCE;
    }
}

