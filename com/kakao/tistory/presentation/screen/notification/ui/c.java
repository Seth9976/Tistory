package com.kakao.tistory.presentation.screen.notification.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.domain.entity.NotificationItem.Notification;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function2 {
    public static final c a;

    static {
        c.a = new c();
    }

    public c() {
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-960861480, v, -1, "com.kakao.tistory.presentation.screen.notification.ui.ComposableSingletons$NotificationListKt.lambda-1.<anonymous> (NotificationList.kt:208)");
        }
        NotificationListKt.access$Notification(new Notification(0L, false, "title", "content", "image", "bot111111tomLabel bot111111tomLabel bot111111tomLabel", "11", "link"), a.a, b.a, ((Composer)object0), 440, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

