package com.kakao.tistory.presentation.screen.notification.ui;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.domain.entity.NotificationItem.Notification;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function2 {
    public final Notification a;
    public final Function0 b;
    public final Function0 c;
    public final int d;
    public final int e;

    public l(Notification notificationItem$Notification0, Function0 function00, Function0 function01, int v, int v1) {
        this.a = notificationItem$Notification0;
        this.b = function00;
        this.c = function01;
        this.d = v;
        this.e = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        NotificationListKt.access$Notification(this.a, this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)), this.e);
        return Unit.INSTANCE;
    }
}

