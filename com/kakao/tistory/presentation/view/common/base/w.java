package com.kakao.tistory.presentation.view.common.base;

import com.kakao.tistory.presentation.view.common.AppBarTitleVisibleViewBehavior;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function0 {
    public final TistoryToolbarActivity a;

    public w(TistoryToolbarActivity tistoryToolbarActivity0) {
        this.a = tistoryToolbarActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new AppBarTitleVisibleViewBehavior(this.a);
    }
}

