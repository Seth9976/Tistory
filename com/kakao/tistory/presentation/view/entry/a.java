package com.kakao.tistory.presentation.view.entry;

import com.kakao.tistory.presentation.widget.dialog.DialogButton;
import com.kakao.tistory.presentation.widget.dialog.DialogFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final DialogFactory a;

    public a(DialogFactory dialogFactory0) {
        this.a = dialogFactory0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DialogButton)object0), "it");
        this.a.getDismiss().invoke();
        return Unit.INSTANCE;
    }
}

