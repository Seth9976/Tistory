package com.kakao.tistory.presentation.view.search;

import androidx.lifecycle.LiveData;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class n extends SuspendLambda implements Function2 {
    public final SearchActivity a;

    public n(SearchActivity searchActivity0, Continuation continuation0) {
        this.a = searchActivity0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new n(this.a, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new n(this.a, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        LiveData liveData0 = SearchActivity.access$getSearchViewModel(this.a).isTextCleared();
        m m0 = new m(this.a);
        LiveDataExtensionKt.observeEvent(liveData0, this.a, m0);
        return Unit.INSTANCE;
    }
}

