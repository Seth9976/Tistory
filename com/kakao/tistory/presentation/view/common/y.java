package com.kakao.tistory.presentation.view.common;

import androidx.compose.runtime.MutableState;
import androidx.paging.CombinedLoadStates;
import androidx.paging.ItemSnapshotList;
import androidx.paging.compose.LazyPagingItems;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class y extends SuspendLambda implements Function2 {
    public final LazyPagingItems a;
    public final MutableState b;

    public y(LazyPagingItems lazyPagingItems0, MutableState mutableState0, Continuation continuation0) {
        this.a = lazyPagingItems0;
        this.b = mutableState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new y(this.a, this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new y(this.a, this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        LazyPagingItems lazyPagingItems0 = this.a;
        if(lazyPagingItems0 != null) {
            CombinedLoadStates combinedLoadStates0 = lazyPagingItems0.getLoadState();
            if(combinedLoadStates0 != null && combinedLoadStates0.isIdle()) {
                ItemSnapshotList itemSnapshotList0 = this.a.getItemSnapshotList();
                this.b.setValue(itemSnapshotList0);
            }
        }
        return Unit.INSTANCE;
    }
}

