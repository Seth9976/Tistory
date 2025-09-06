package com.kakao.tistory.presentation.screen.home.item;

import com.kakao.tistory.domain.home.entity.HomeSlotContent.Subscription;
import com.kakao.tistory.presentation.screen.home.tiara.HomeTiara;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function0 {
    public final Function1 a;
    public final Subscription b;

    public m(Function1 function10, Subscription homeSlotContent$Subscription0) {
        this.a = function10;
        this.b = homeSlotContent$Subscription0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        HomeTiara.INSTANCE.trackClickSubscriptionFollow(true);
        this.a.invoke(this.b.getBlogName());
        return Unit.INSTANCE;
    }
}

