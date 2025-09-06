package com.kakao.tistory.presentation.screen.notification.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function2 {
    public final int a;

    public s(int v) {
        this.a = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        NotificationListKt.PreviewNotification(((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.a | 1));
        return Unit.INSTANCE;
    }
}

