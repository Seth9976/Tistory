package com.kakao.tistory.presentation.screen.notification.ui;

import androidx.compose.runtime.Composer;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.tistory.presentation.screen.notification.NotificationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function2 {
    public final NotificationViewModel a;
    public final LazyPagingItems b;
    public final int c;

    public r(NotificationViewModel notificationViewModel0, LazyPagingItems lazyPagingItems0, int v) {
        this.a = notificationViewModel0;
        this.b = lazyPagingItems0;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        NotificationListKt.NotificationList(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

