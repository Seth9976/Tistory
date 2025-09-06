package com.kakao.tistory.presentation.screen.notification;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function2 {
    public final String a;
    public final Function0 b;
    public final Function0 c;
    public final NotificationViewModel d;
    public final int e;
    public final int f;

    public s(String s, Function0 function00, Function0 function01, NotificationViewModel notificationViewModel0, int v, int v1) {
        this.a = s;
        this.b = function00;
        this.c = function01;
        this.d = notificationViewModel0;
        this.e = v;
        this.f = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        NotificationScreenKt.NotificationScreen(this.a, this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)), this.f);
        return Unit.INSTANCE;
    }
}

