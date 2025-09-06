package com.kakao.tistory.presentation.screen.home.item;

import com.kakao.tistory.domain.home.entity.HomeSlotContent.Subscription;
import com.kakao.tistory.domain.home.entity.HomeSlotContent.SubscriptionEntry;
import com.kakao.tistory.presentation.screen.home.tiara.HomeTiara.ClickEntry;
import com.kakao.tistory.presentation.screen.home.tiara.HomeTiara;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function0 {
    public final int a;
    public final SubscriptionEntry b;
    public final Subscription c;
    public final int d;
    public final Function2 e;

    public k(int v, SubscriptionEntry homeSlotContent$SubscriptionEntry0, Subscription homeSlotContent$Subscription0, int v1, Function2 function20) {
        this.a = v;
        this.b = homeSlotContent$SubscriptionEntry0;
        this.c = homeSlotContent$Subscription0;
        this.d = v1;
        this.e = function20;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ClickEntry homeTiara$ClickEntry0 = new ClickEntry(this.a, this.b.getId(), "", this.b.getThumbnail().getOrigin(), this.b.getCategoryLabel(), this.b.getCategoryId(), this.c.getBlogName(), this.b.getMobileLink(), this.d);
        HomeTiara.INSTANCE.trackClickSubscriptionEntry(homeTiara$ClickEntry0);
        this.e.invoke(this.c.getBlogName(), this.b.getId());
        return Unit.INSTANCE;
    }
}

