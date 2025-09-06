package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.repository.SearchRepository.DefaultImpls;
import com.kakao.tistory.presentation.common.extension.StringExtensionKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.p;
import kotlinx.coroutines.CoroutineScope;

public final class k4 extends SuspendLambda implements Function2 {
    public final SearchViewModel a;

    public k4(SearchViewModel searchViewModel0, Continuation continuation0) {
        this.a = searchViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new k4(this.a, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new k4(this.a, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        String s = (String)this.a.getSearchKeyword().getValue();
        if(s != null) {
            SearchViewModel searchViewModel0 = this.a;
            if(!p.isBlank(s)) {
                DefaultImpls.addRecentSearch$default(searchViewModel0.g, StringExtensionKt.getStringExcludeBold(s), 0, 2, null);
            }
        }
        return Unit.INSTANCE;
    }
}

