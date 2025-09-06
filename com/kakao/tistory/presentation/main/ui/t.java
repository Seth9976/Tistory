package com.kakao.tistory.presentation.main.ui;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.graphics.SolidColor;
import com.kakao.tistory.presentation.theme.TColor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function1 {
    public static final t a;

    static {
        t.a = new t();
    }

    public t() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((CacheDrawScope)object0), "$this$drawWithCache");
        return ((CacheDrawScope)object0).onDrawWithContent(new s(new SolidColor(TColor.INSTANCE.getBlack8-0d7_KjU(), null)));
    }
}

