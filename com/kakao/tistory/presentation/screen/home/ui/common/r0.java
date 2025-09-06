package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class r0 extends Lambda implements Function1 {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public final int f;

    public r0(ArrayList arrayList0, int v, int v1, long v2, int v3, int v4) {
        this.a = arrayList0;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = v4;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((PlacementScope)object0), "$this$layout");
        int v = this.b;
        int v1 = this.c;
        long v2 = this.d;
        int v3 = this.e;
        int v4 = this.f;
        int v5 = 0;
        int v6 = 0;
        for(Object object1: this.a) {
            PlacementScope.place$default(((PlacementScope)object0), ((Placeable)object1), v5, v6, 0.0f, 4, null);
            int v7 = v + v1 + v5;
            if(v7 >= Constraints.getMaxWidth-impl(v2)) {
                v6 = v3 + v4 + v6;
                v5 = 0;
            }
            else {
                v5 = v7;
            }
        }
        return Unit.INSTANCE;
    }
}

