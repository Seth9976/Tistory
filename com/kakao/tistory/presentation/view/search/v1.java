package com.kakao.tistory.presentation.view.search;

import com.google.accompanist.pager.PagerState;
import com.kakao.tistory.presentation.viewmodel.SearchViewModel;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class v1 extends SuspendLambda implements Function2 {
    public final SearchViewModel a;
    public final List b;
    public final PagerState c;
    public final CoroutineScope d;

    public v1(SearchViewModel searchViewModel0, List list0, PagerState pagerState0, CoroutineScope coroutineScope0, Continuation continuation0) {
        this.a = searchViewModel0;
        this.b = list0;
        this.c = pagerState0;
        this.d = coroutineScope0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new v1(this.a, this.b, this.c, this.d, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((v1)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        if(this.a.getRedirectDestination() == RedirectDestination.TAG) {
            int v = this.b.indexOf(ResultViewType.TAG);
            if(v >= 0 && this.c.getCurrentPage() != v) {
                u1 u10 = new u1(this.c, v, null);
                BuildersKt.launch$default(this.d, null, null, u10, 3, null);
            }
            this.a.setRedirectDestination(null);
        }
        return Unit.INSTANCE;
    }
}

