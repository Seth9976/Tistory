package com.kakao.tistory.presentation.screen.notification.ui;

import androidx.compose.runtime.MutableState;
import com.kakao.tistory.domain.entity.NotificationItem;
import com.kakao.tistory.presentation.screen.notification.NotificationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function0 {
    public final NotificationViewModel a;
    public final NotificationItem b;
    public final MutableState c;

    public n(NotificationViewModel notificationViewModel0, NotificationItem notificationItem0, MutableState mutableState0) {
        this.a = notificationViewModel0;
        this.b = notificationItem0;
        this.c = mutableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.onClickNotification(this.b);
        this.c.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}

