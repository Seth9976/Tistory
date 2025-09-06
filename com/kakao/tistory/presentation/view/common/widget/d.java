package com.kakao.tistory.presentation.view.common.widget;

import android.app.Dialog;
import android.os.Process;
import com.kakao.tistory.presentation.view.common.base.TistoryActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function2 {
    public final TistoryToolbar a;

    public d(TistoryToolbar tistoryToolbar0) {
        this.a = tistoryToolbar0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((Dialog)object0), "dialog");
        switch(((Number)object1).intValue()) {
            case 1: {
                ((Dialog)object0).dismiss();
                return Unit.INSTANCE;
            }
            case 2: {
                ((Dialog)object0).dismiss();
                TistoryActivity tistoryActivity0 = this.a.a;
                if(tistoryActivity0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("activity");
                    tistoryActivity0 = null;
                }
                tistoryActivity0.finishAffinity();
                Process.killProcess(Process.myPid());
                return Unit.INSTANCE;
            }
            default: {
                return Unit.INSTANCE;
            }
        }
    }
}

