package com.kakao.tistory.presentation.screen.notification.ui;

import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import com.kakao.tistory.domain.entity.NotificationItem;
import com.kakao.tistory.presentation.screen.notification.NotificationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function0 {
    public final HapticFeedback a;
    public final NotificationViewModel b;
    public final NotificationItem c;

    public o(HapticFeedback hapticFeedback0, NotificationViewModel notificationViewModel0, NotificationItem notificationItem0) {
        this.a = hapticFeedback0;
        this.b = notificationViewModel0;
        this.c = notificationItem0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int v = HapticFeedbackType.Companion.getLongPress-5zf0vsI();
        this.a.performHapticFeedback-CdsT49E(v);
        this.b.onLongClickNotification(this.c);
        return Unit.INSTANCE;
    }
}

