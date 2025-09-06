package com.kakao.tistory.presentation.view.common.dialog;

import android.app.Dialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function2 {
    public final DialogUIModel a;

    public j(DialogUIModel dialogUIModel0) {
        this.a = dialogUIModel0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((Dialog)object0), "dialog");
        if(((Number)object1).intValue() == 1) {
            this.a.getOnClickLeft().invoke();
        }
        else {
            this.a.getOnClickRight().invoke();
        }
        ((Dialog)object0).dismiss();
        return Unit.INSTANCE;
    }
}

