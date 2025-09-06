package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.SearchKeywordItem;
import com.kakao.tistory.presentation.common.extension.StringExtensionKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class h4 extends SuspendLambda implements Function2 {
    public final SearchViewModel a;
    public final SearchKeywordItem b;

    public h4(SearchViewModel searchViewModel0, SearchKeywordItem searchKeywordItem0, Continuation continuation0) {
        this.a = searchViewModel0;
        this.b = searchKeywordItem0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new h4(this.a, this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new h4(this.a, this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        String s = StringExtensionKt.getStringExcludeBold(this.b.getKeyword());
        this.a.g.removeRecentSearch(s);
        return Unit.INSTANCE;
    }
}

