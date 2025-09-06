package com.kakao.tistory.presentation.view.editor;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class n5 extends Lambda implements Function1 {
    public final Function0 a;

    public n5(Function0 function00) {
        this.a = function00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        KeyEvent keyEvent0 = ((androidx.compose.ui.input.key.KeyEvent)object0).unbox-impl();
        Intrinsics.checkNotNullParameter(keyEvent0, "it");
        return keyEvent0.getKeyCode() == 67 ? Boolean.valueOf(((Boolean)this.a.invoke()).booleanValue()) : false;
    }
}

