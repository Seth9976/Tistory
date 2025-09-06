package com.kakao.tistory.presentation.view.common;

import android.content.Context;
import com.kakao.tistory.presentation.common.utils.ScaleUtilsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f0 extends Lambda implements Function0 {
    public final ViewPagerIndicator a;

    public f0(ViewPagerIndicator viewPagerIndicator0) {
        this.a = viewPagerIndicator0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context0 = this.a.getContext();
        Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
        return ScaleUtilsKt.dp2px(context0, 4.0f);
    }
}

