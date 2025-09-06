package com.kakao.tistory.presentation.screen.revenue;

import androidx.compose.runtime.State;
import com.kakao.tistory.domain.blog.entity.BlogInfo;
import com.kakao.tistory.presentation.screen.item.ViewState.Success;
import com.kakao.tistory.presentation.screen.item.ViewState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class p extends SuspendLambda implements Function2 {
    public final State a;
    public final State b;

    public p(State state0, State state1, Continuation continuation0) {
        this.a = state0;
        this.b = state1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new p(this.a, this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new p(this.a, this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        ViewState viewState0 = RevenueScreenKt.access$RevenueScreen$lambda$5(this.a).getState();
        BlogInfo blogInfo0 = null;
        Success viewState$Success0 = viewState0 instanceof Success ? ((Success)viewState0) : null;
        if(viewState$Success0 != null) {
            blogInfo0 = (BlogInfo)viewState$Success0.getItem();
        }
        RevenueScreenKt.access$RevenueScreen$lambda$6(this.b).getChangeBlogInfo().invoke(blogInfo0);
        return Unit.INSTANCE;
    }
}

