package com.kakao.tistory.presentation.screen.notification.ui;

import com.kakao.tistory.domain.entity.NotificationItem.Banner;
import com.kakao.tistory.domain.entity.NotificationItem.Empty;
import com.kakao.tistory.domain.entity.NotificationItem.Header;
import com.kakao.tistory.domain.entity.NotificationItem.Notification;
import com.kakao.tistory.domain.entity.NotificationItem;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.q;

public final class m extends Lambda implements Function1 {
    public static final m a;

    static {
        m.a = new m();
    }

    public m() {
        super(1);
    }

    public static String a(NotificationItem notificationItem0) {
        Intrinsics.checkNotNullParameter(notificationItem0, "it");
        if(Intrinsics.areEqual(notificationItem0, Header.INSTANCE)) {
            return "Header";
        }
        if(notificationItem0 instanceof Notification) {
            return "Notification " + ((Notification)notificationItem0).getId();
        }
        if(notificationItem0 instanceof Banner) {
            return q.n(((Banner)notificationItem0).getId(), "Banner ");
        }
        if(!(notificationItem0 instanceof Empty)) {
            throw new NoWhenBranchMatchedException();
        }
        return "Empty";
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return m.a(((NotificationItem)object0));
    }
}

