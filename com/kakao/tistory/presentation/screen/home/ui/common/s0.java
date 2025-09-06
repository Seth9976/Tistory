package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.DpSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;

public final class s0 implements MeasurePolicy {
    public final long a;
    public final int b;

    public s0(long v, int v1) {
        this.a = v;
        this.b = v1;
        super();
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        Integer integer0;
        Intrinsics.checkNotNullParameter(measureScope0, "$this$Layout");
        Intrinsics.checkNotNullParameter(list0, "measurables");
        int v1 = measureScope0.roundToPx-0680j_4(DpSize.getWidth-D9Ej5fM(this.a));
        int v2 = list0.size();
        int v3 = (Constraints.getMaxWidth-impl(v) - (this.b - 1) * v1) / this.b;
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            arrayList0.add(((Measurable)object0).measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, c.coerceAtLeast(v3, 0), 0, 0, 12, null)));
        }
        Iterator iterator1 = arrayList0.iterator();
        if(iterator1.hasNext()) {
            Object object1 = iterator1.next();
            Integer integer1 = ((Placeable)object1).getHeight();
            while(iterator1.hasNext()) {
                Object object2 = iterator1.next();
                Integer integer2 = ((Placeable)object2).getHeight();
                if(integer1.compareTo(integer2) < 0) {
                    integer1 = integer2;
                }
            }
            integer0 = integer1;
        }
        else {
            integer0 = null;
        }
        int v4 = integer0 == null ? 0 : ((int)integer0);
        int v5 = measureScope0.roundToPx-0680j_4(DpSize.getHeight-D9Ej5fM(this.a));
        r0 r00 = new r0(arrayList0, v3, v1, v, v4, v5);
        return MeasureScope.layout$default(measureScope0, Constraints.getMaxWidth-impl(v), c.coerceAtLeast((v4 + v5) * ((int)(((float)Math.ceil(((float)v2) / ((float)this.b))))) - v5, 0), null, r00, 4, null);
    }
}

