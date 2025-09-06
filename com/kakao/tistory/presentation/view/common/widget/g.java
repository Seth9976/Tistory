package com.kakao.tistory.presentation.view.common.widget;

import android.content.Context;
import com.kakao.tistory.presentation.R.dimen;
import com.kakao.tistory.presentation.common.utils.ScaleUtilsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function0 {
    public final TistoryToolbar a;

    public g(TistoryToolbar tistoryToolbar0) {
        this.a = tistoryToolbar0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context0 = this.a.getContext();
        Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
        return ScaleUtilsKt.dimen2px(context0, dimen.common_toolbar_height);
    }
}

