package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.foundation.pager.PagerState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import qd.a;

public final class y2 extends SuspendLambda implements Function2 {
    public int a;
    public final long b;
    public final CoroutineScope c;
    public final PagerState d;
    public final int e;

    public y2(long v, CoroutineScope coroutineScope0, PagerState pagerState0, int v1, Continuation continuation0) {
        this.b = v;
        this.c = coroutineScope0;
        this.d = pagerState0;
        this.e = v1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new y2(this.b, this.c, this.d, this.e, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((y2)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                goto label_8;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            x2 x20 = new x2(this.d, this.e, null);
            BuildersKt.launch$default(this.c, null, null, x20, 3, null);
        label_8:
            this.a = 1;
        }
        while(DelayKt.delay(this.b, this) != object1);
        return object1;
    }
}

