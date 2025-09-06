package com.kakao.tistory.presentation.view.common.base;

import android.app.Dialog;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.screen.feed.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function2 {
    public final TistoryActivity a;

    public a(TistoryActivity tistoryActivity0) {
        this.a = tistoryActivity0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        t.a(((Number)object1), ((Dialog)object0), "dialog");
        NavigatorExtensionKt.goToSplash(this.a);
        return Unit.INSTANCE;
    }
}

