package com.kakao.tistory.presentation.screen.notification;

import androidx.compose.runtime.MutableState;
import com.kakao.tistory.domain.entity.NotificationItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function1 {
    public final MutableState a;

    public j(MutableState mutableState0) {
        this.a = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((NotificationItem)object0), "it");
        NotificationScreenKt.access$InitViewModel$lambda$14(this.a, ((NotificationItem)object0));
        return Unit.INSTANCE;
    }
}

