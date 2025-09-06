package com.kakao.kandinsky.decoration;

import android.graphics.Matrix;
import androidx.compose.ui.geometry.Offset;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final long w;

    public b(long v) {
        this.w = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
        ((Matrix)object0).postTranslate(Offset.getX-impl(this.w), Offset.getY-impl(this.w));
        return Unit.INSTANCE;
    }
}

