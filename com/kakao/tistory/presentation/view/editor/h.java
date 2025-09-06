package com.kakao.tistory.presentation.view.editor;

import androidx.paging.LoadState.NotLoading;
import androidx.paging.compose.LazyPagingItems;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class h extends SuspendLambda implements Function2 {
    public final LazyPagingItems a;

    public h(LazyPagingItems lazyPagingItems0, Continuation continuation0) {
        this.a = lazyPagingItems0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new h(this.a, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new h(this.a, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        if(this.a.getLoadState().getRefresh() instanceof NotLoading) {
            this.a.refresh();
        }
        return Unit.INSTANCE;
    }
}

