package com.kakao.tistory.presentation.screen.home.ui;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope;
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function1 {
    public final ArrayList a;
    public final SnapshotStateList b;
    public final List c;
    public final Density d;

    public t(ArrayList arrayList0, SnapshotStateList snapshotStateList0, List list0, Density density0) {
        this.a = arrayList0;
        this.b = snapshotStateList0;
        this.c = list0;
        this.d = density0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyStaggeredGridScope)object0), "$this$LazyVerticalStaggeredGrid");
        ((LazyStaggeredGridScope)object0).items(this.a.size(), (s.a == null ? null : new HomeSlotListKt.MultiLane.2.invoke..inlined.itemsIndexed.default.1(s.a, this.a)), new HomeSlotListKt.MultiLane.2.invoke..inlined.itemsIndexed.default.2(this.a), null, ComposableLambdaKt.composableLambdaInstance(0x10FA3898, true, new HomeSlotListKt.MultiLane.2.invoke..inlined.itemsIndexed.default.4(this.a, this.d)));
        if(this.b.size() < this.c.size()) {
            LazyStaggeredGridScope.item$default(((LazyStaggeredGridScope)object0), "MEASURED_ITEM", "MEASURED_ITEM", null, ComposableSingletons.HomeSlotListKt.INSTANCE.getLambda-1$presentation_prodRelease(), 4, null);
        }
        ((LazyStaggeredGridScope)object0).item("CopyRight", "CopyRight", StaggeredGridItemSpan.Companion.getFullLine(), ComposableSingletons.HomeSlotListKt.INSTANCE.getLambda-2$presentation_prodRelease());
        return Unit.INSTANCE;
    }
}

