package com.kakao.tistory.presentation.screen.feed;

import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.paging.compose.LazyPagingItems;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class j extends SuspendLambda implements Function2 {
    public int a;
    public final FeedViewModel b;
    public final LifecycleOwner c;
    public final LazyPagingItems d;

    public j(FeedViewModel feedViewModel0, LifecycleOwner lifecycleOwner0, LazyPagingItems lazyPagingItems0, Continuation continuation0) {
        this.b = feedViewModel0;
        this.c = lifecycleOwner0;
        this.d = lazyPagingItems0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new j(this.b, this.c, this.d, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((j)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                y y0 = new y(new h(this.d));
                this.b.getFollowingCount().observe(this.c, y0);
                i i0 = new i(this.b, null);
                this.a = 1;
                return RepeatOnLifecycleKt.repeatOnLifecycle(this.c, State.RESUMED, i0, this) == object1 ? object1 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

