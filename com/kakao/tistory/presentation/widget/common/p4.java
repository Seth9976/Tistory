package com.kakao.tistory.presentation.widget.common;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.q;

public final class p4 extends Lambda implements Function1 {
    public final Placeable a;
    public final Placeable b;
    public final Placeable c;
    public final long d;
    public final Placeable e;
    public final Placeable f;

    public p4(Placeable placeable0, Placeable placeable1, Placeable placeable2, long v, Placeable placeable3, Placeable placeable4) {
        this.a = placeable0;
        this.b = placeable1;
        this.c = placeable2;
        this.d = v;
        this.e = placeable3;
        this.f = placeable4;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((PlacementScope)object0), "$this$layout");
        PlacementScope.place$default(((PlacementScope)object0), this.a, 0, 0, 0.0f, 4, null);
        int v = q.A(this.b, this.a.getHeight(), 2);
        PlacementScope.place$default(((PlacementScope)object0), this.b, 0, v, 0.0f, 4, null);
        int v1 = q.A(this.c, this.a.getHeight(), 2);
        PlacementScope.place$default(((PlacementScope)object0), this.c, Constraints.getMaxWidth-impl(this.d) - this.c.getWidth(), v1, 0.0f, 4, null);
        int v2 = q.d(this.e, Constraints.getMaxWidth-impl(this.d), 2);
        int v3 = q.A(this.e, Constraints.getMaxHeight-impl(this.d), 2);
        PlacementScope.place$default(((PlacementScope)object0), this.e, v2, v3, 0.0f, 4, null);
        PlacementScope.place$default(((PlacementScope)object0), this.f, 0, Constraints.getMaxHeight-impl(this.d) - this.f.getHeight(), 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

