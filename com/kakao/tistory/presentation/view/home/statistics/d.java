package com.kakao.tistory.presentation.view.home.statistics;

import android.content.Context;
import com.kakao.tistory.presentation.common.utils.ScaleUtilsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function0 {
    public final Context a;

    public d(Context context0) {
        this.a = context0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return (float)ScaleUtilsKt.dp2px(this.a, 1.5f);
    }
}

