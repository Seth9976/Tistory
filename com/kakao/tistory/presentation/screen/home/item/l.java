package com.kakao.tistory.presentation.screen.home.item;

import com.kakao.tistory.domain.home.entity.HomeSlotContent.Subscription;
import com.kakao.tistory.presentation.screen.home.tiara.HomeTiara;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function0 {
    public final Subscription a;
    public final int b;
    public final Function1 c;

    public l(Subscription homeSlotContent$Subscription0, int v, Function1 function10) {
        this.a = homeSlotContent$Subscription0;
        this.b = v;
        this.c = function10;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        HomeTiara.INSTANCE.trackClickSubscriptionBlog(this.a.getBlogName(), this.b);
        this.c.invoke(this.a.getBlogName());
        return Unit.INSTANCE;
    }
}

