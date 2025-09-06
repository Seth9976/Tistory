package com.kakao.tistory.presentation.widget.common;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.q;
import zd.c;

public final class a4 extends Lambda implements Function1 {
    public final MeasureScope a;
    public final Placeable b;
    public final long c;
    public final Placeable d;
    public final Placeable e;
    public final Placeable f;
    public final Placeable g;
    public final float h;
    public final Placeable i;
    public final Placeable j;

    public a4(MeasureScope measureScope0, Placeable placeable0, long v, Placeable placeable1, Placeable placeable2, Placeable placeable3, Placeable placeable4, float f, Placeable placeable5, Placeable placeable6) {
        this.a = measureScope0;
        this.b = placeable0;
        this.c = v;
        this.d = placeable1;
        this.e = placeable2;
        this.f = placeable3;
        this.g = placeable4;
        this.h = f;
        this.i = placeable5;
        this.j = placeable6;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((PlacementScope)object0), "$this$layout");
        int v = this.a.roundToPx-0680j_4(20.0f);
        int v1 = this.a.roundToPx-0680j_4(4.0f);
        PlacementScope.place$default(((PlacementScope)object0), this.b, Constraints.getMaxWidth-impl(this.c) - this.b.getWidth(), Constraints.getMaxHeight-impl(this.c) - this.b.getHeight(), 0.0f, 4, null);
        PlacementScope.place$default(((PlacementScope)object0), this.d, 0, 0, 0.0f, 4, null);
        int v2 = q.A(this.e, this.d.getHeight(), 2);
        PlacementScope.place$default(((PlacementScope)object0), this.e, 0, v2, 0.0f, 4, null);
        int v3 = q.A(this.f, this.d.getHeight(), 2);
        PlacementScope.place$default(((PlacementScope)object0), this.f, Constraints.getMaxWidth-impl(this.c) - this.f.getWidth(), v3, 0.0f, 4, null);
        int v4 = q.d(this.g, Constraints.getMaxWidth-impl(this.c), 2);
        long v5 = IntOffsetKt.lerp-81ZRxRo(IntOffsetKt.IntOffset(v, Constraints.getMaxHeight-impl(this.c) - this.g.getHeight() - v1), IntOffsetKt.IntOffset(v4, (Constraints.getMaxHeight-impl(this.c) - this.g.getHeight()) / 2), this.h);
        float f = this.h * 1.0f + (1.0f - this.h) * 1.666667f;
        int v6 = c.roundToInt(((float)this.g.getWidth()) * f);
        int v7 = c.roundToInt(((float)this.g.getHeight()) * f);
        y3 y30 = new y3(f);
        PlacementScope.placeWithLayer-aW-9-wM$default(((PlacementScope)object0), this.g, v5, 0.0f, y30, 2, null);
        int v8 = this.a.roundToPx-0680j_4(7.0f);
        int v9 = this.a.roundToPx-0680j_4(2.0f);
        z3 z30 = new z3(this.h * 0.0f + (1.0f - this.h) * 1.0f, this.h);
        PlacementScope.placeWithLayer$default(((PlacementScope)object0), this.i, v8 + (IntOffset.getX-impl(v5) + v6), this.g.getHeight() + IntOffset.getY-impl(v5) - v7 + v9, 0.0f, z30, 4, null);
        PlacementScope.place$default(((PlacementScope)object0), this.j, 0, Constraints.getMaxHeight-impl(this.c) - this.j.getHeight(), 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

