package com.kakao.tistory.presentation.view.signup;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function1 {
    public static final s a;

    static {
        s.a = new s();
    }

    public s() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        KeyEvent keyEvent0 = ((androidx.compose.ui.input.key.KeyEvent)object0).unbox-impl();
        Intrinsics.checkNotNullParameter(keyEvent0, "it");
        return keyEvent0.getKeyCode() == 66;
    }
}

