package com.kakao.tistory.presentation.screen.notification;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function0 {
    public final NotificationViewModel a;

    public p(NotificationViewModel notificationViewModel0) {
        this.a = notificationViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.onClickSort();
        return Unit.INSTANCE;
    }
}

