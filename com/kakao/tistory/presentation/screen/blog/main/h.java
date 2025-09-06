package com.kakao.tistory.presentation.screen.blog.main;

import androidx.compose.foundation.lazy.LazyListState;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainUiState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class h extends SuspendLambda implements Function2 {
    public int a;
    public final LazyListState b;
    public final BlogMainUiState c;
    public final int d;

    public h(LazyListState lazyListState0, BlogMainUiState blogMainUiState0, int v, Continuation continuation0) {
        this.b = lazyListState0;
        this.c = blogMainUiState0;
        this.d = v;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new h(this.b, this.c, this.d, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((h)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                return this.b.animateScrollToItem(this.c.getCategoryItemIndex(), -this.d, this) == object1 ? object1 : Unit.INSTANCE;
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

