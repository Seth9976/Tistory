package com.kakao.tistory.presentation.view.entry;

import com.kakao.tistory.presentation.widget.dialog.DialogFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function0 {
    public final String a;
    public final DialogFactory b;

    public z(String s, DialogFactory dialogFactory0) {
        this.a = s;
        this.b = dialogFactory0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        EntryTiara.INSTANCE.trackClickChallengeSuccessClose(this.a);
        this.b.getDismiss().invoke();
        return Unit.INSTANCE;
    }
}

