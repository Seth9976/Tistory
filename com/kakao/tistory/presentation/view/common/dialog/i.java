package com.kakao.tistory.presentation.view.common.dialog;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function1 {
    public static final i a;

    static {
        i.a = new i();
    }

    public i() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DialogInterface)object0), "it");
        return Unit.INSTANCE;
    }
}

