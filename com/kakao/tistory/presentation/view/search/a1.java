package com.kakao.tistory.presentation.view.search;

import androidx.compose.runtime.State;
import com.kakao.tistory.presentation.viewmodel.SearchViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class a1 extends SuspendLambda implements Function2 {
    public final SearchViewModel a;
    public final State b;

    public a1(SearchViewModel searchViewModel0, State state0, Continuation continuation0) {
        this.a = searchViewModel0;
        this.b = state0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new a1(this.a, this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new a1(this.a, this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        String s = SearchKeywordFragmentKt.access$SearchKeywordPage$lambda$0(this.b);
        this.a.getSuggestKeywords(s);
        return Unit.INSTANCE;
    }
}

