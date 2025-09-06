package com.kakao.tistory.presentation.screen.revenue;

import com.kakao.tistory.domain.blog.entity.BlogInfo;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent.ChangeBlogInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class d0 extends Lambda implements Function1 {
    public final RevenueViewModel a;

    public d0(RevenueViewModel revenueViewModel0) {
        this.a = revenueViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ChangeBlogInfo revenueIntent$ChangeBlogInfo0 = new ChangeBlogInfo(((BlogInfo)object0));
        this.a.sendIntent(revenueIntent$ChangeBlogInfo0);
        return Unit.INSTANCE;
    }
}

