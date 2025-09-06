package com.kakao.tistory.presentation.screen.notification;

import androidx.compose.runtime.MutableState;
import androidx.paging.compose.LazyPagingItems;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function0 {
    public final NotificationViewModel a;
    public final LazyPagingItems b;
    public final MutableState c;

    public t(NotificationViewModel notificationViewModel0, LazyPagingItems lazyPagingItems0, MutableState mutableState0) {
        this.a = notificationViewModel0;
        this.b = lazyPagingItems0;
        this.c = mutableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NotificationScreenKt.access$NotificationScreen$lambda$5(this.c, true);
        NotificationScreenKt.access$refresh(this.a, this.b);
        return Unit.INSTANCE;
    }
}

