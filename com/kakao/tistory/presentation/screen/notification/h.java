package com.kakao.tistory.presentation.screen.notification;

import com.kakao.tistory.domain.entity.SortItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public final NotificationViewModel a;

    public h(NotificationViewModel notificationViewModel0) {
        this.a = notificationViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((SortItem)object0), "it");
        this.a.updateSort(((SortItem)object0));
        return Unit.INSTANCE;
    }
}

