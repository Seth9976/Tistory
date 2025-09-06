package com.kakao.tistory.presentation.view.signup.contract;

import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
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
        Intrinsics.checkNotNullParameter(((TextFieldValue)object0), "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(((String)object1), "<anonymous parameter 1>");
        return Unit.INSTANCE;
    }
}

