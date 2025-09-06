package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.SolidColor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b2 extends Lambda implements Function1 {
    public final long a;
    public final float b;

    public b2(long v, float f) {
        this.a = v;
        this.b = f;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((CacheDrawScope)object0), "$this$drawWithCache");
        return BlogMainTopBackgroundKt.drawTopBackground-cSwnlzA(((CacheDrawScope)object0), new SolidColor(this.a, null), Size.copy-xjbvk4A(((CacheDrawScope)object0).getSize-NH-jbRc(), Size.getWidth-impl(((CacheDrawScope)object0).getSize-NH-jbRc()), ((CacheDrawScope)object0).toPx-0680j_4(this.b) / 2.0f));
    }
}

