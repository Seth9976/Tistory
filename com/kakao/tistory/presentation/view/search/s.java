package com.kakao.tistory.presentation.view.search;

import androidx.compose.runtime.State;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class s extends SuspendLambda implements Function2 {
    public final State a;
    public final SearchActivity b;

    public s(State state0, SearchActivity searchActivity0, Continuation continuation0) {
        this.a = state0;
        this.b = searchActivity0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new s(this.a, this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new s(this.a, this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        SearchViewType searchActivity$SearchViewType0 = (SearchViewType)this.a.getValue();
        if(searchActivity$SearchViewType0 != null) {
            SearchActivity.access$updatePageView(this.b, searchActivity$SearchViewType0);
        }
        return Unit.INSTANCE;
    }
}

