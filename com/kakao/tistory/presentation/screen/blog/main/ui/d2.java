package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.foundation.pager.PagerState;
import com.kakao.tistory.presentation.screen.blog.main.BlogMainTiara;
import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsType;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class d2 extends SuspendLambda implements Function2 {
    public final PagerState a;
    public final List b;

    public d2(PagerState pagerState0, List list0, Continuation continuation0) {
        this.a = pagerState0;
        this.b = list0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new d2(this.a, this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new d2(this.a, this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        if(this.a.getTargetPage() != this.a.getCurrentPage()) {
            int v = this.a.getCurrentPage();
            StatisticsType statisticsType0 = (StatisticsType)this.b.get(v);
            int v1 = this.a.getTargetPage();
            StatisticsType statisticsType1 = (StatisticsType)this.b.get(v1);
            BlogMainTiara.INSTANCE.trackClickStatisticsSwipe(statisticsType0, statisticsType1);
        }
        return Unit.INSTANCE;
    }
}

