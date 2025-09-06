package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.unit.Dp;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;

public final class q extends Lambda implements Function1 {
    public final float a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;

    public q(float f, int v, float f1, float f2, float f3) {
        this.a = f;
        this.b = v;
        this.c = f1;
        this.d = f2;
        this.e = f3;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ContentDrawScope)object0), "$this$drawWithContent");
        float f = Dp.equals-impl0(this.a, NaNf) ? Size.getWidth-impl(((ContentDrawScope)object0).getSize-NH-jbRc()) : ((ContentDrawScope)object0).toPx-0680j_4(this.a);
        IntRange intRange0 = c.until(0, this.b);
        float f1 = this.c;
        float f2 = this.d;
        float f3 = this.e;
        Iterator iterator0 = intRange0.iterator();
        while(iterator0.hasNext()) {
            PlaceHolderKt.a(((ContentDrawScope)object0), 0L, OffsetKt.Offset(0.0f, ((float)((IntIterator)iterator0).nextInt()) * f1 + f2), SizeKt.Size(f, f3), 3);
        }
        return Unit.INSTANCE;
    }
}

