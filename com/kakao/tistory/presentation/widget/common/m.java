package com.kakao.tistory.presentation.widget.common;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function1 {
    public final CharSequence a;

    public m(CharSequence charSequence0) {
        this.a = charSequence0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((TextView)object0), "it");
        ((TextView)object0).setText(this.a);
        return Unit.INSTANCE;
    }
}

