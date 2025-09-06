package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.domain.blog.entity.BlogInfo;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainUiState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class c extends SuspendLambda implements Function2 {
    public final BlogMainUiState a;
    public final BlogInfo b;

    public c(BlogMainUiState blogMainUiState0, BlogInfo blogInfo0, Continuation continuation0) {
        this.a = blogMainUiState0;
        this.b = blogInfo0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new c(this.a, this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new c(this.a, this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        this.a.getChangeBlogInfo().invoke(this.b);
        return Unit.INSTANCE;
    }
}

