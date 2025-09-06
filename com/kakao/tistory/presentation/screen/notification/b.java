package com.kakao.tistory.presentation.screen.notification;

import com.kakao.tistory.domain.entity.NotificationItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function0 {
    public final NotificationViewModel a;
    public final NotificationItem b;

    public b(NotificationViewModel notificationViewModel0, NotificationItem notificationItem0) {
        this.a = notificationViewModel0;
        this.b = notificationItem0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.onClickDelete(this.b);
        return Unit.INSTANCE;
    }
}

