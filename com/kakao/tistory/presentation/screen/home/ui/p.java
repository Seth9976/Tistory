package com.kakao.tistory.presentation.screen.home.ui;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Dp;
import com.kakao.tistory.domain.home.entity.HomeSlot.Position;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function3 {
    public final float a;
    public final List b;
    public final LazyListState c;
    public final Function1 d;
    public final LazyStaggeredGridState e;

    public p(float f, List list0, LazyListState lazyListState0, Function1 function10, LazyStaggeredGridState lazyStaggeredGridState0) {
        this.a = f;
        this.b = list0;
        this.c = lazyListState0;
        this.d = function10;
        this.e = lazyStaggeredGridState0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((BoxWithConstraintsScope)object0), "$this$BoxWithConstraints");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((BoxWithConstraintsScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE348B1D4, v, -1, "com.kakao.tistory.presentation.screen.home.ui.HomeSlotList.<anonymous> (HomeSlotList.kt:31)");
        }
        List list0 = this.b;
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = HomeSlotListKt.HomeSlotList.1.EntriesMappings.entries$0.iterator();
    label_12:
        while(iterator0.hasNext()) {
            Object object3 = iterator0.next();
            Position homeSlot$Position0 = (Position)object3;
            if(!(list0 instanceof Collection) || !list0.isEmpty()) {
                Iterator iterator1 = list0.iterator();
                do {
                    if(!iterator1.hasNext()) {
                        continue label_12;
                    }
                    Object object4 = iterator1.next();
                }
                while(((HomeSlotUiState)object4).getPosition() != homeSlot$Position0);
                arrayList0.add(object3);
            }
        }
        if(Dp.compareTo-0680j_4(((BoxWithConstraintsScope)object0).getMaxWidth-D9Ej5fM(), this.a) < 0 || arrayList0.size() <= 1) {
            ((Composer)object1).startReplaceGroup(-339260333);
            CompositionLocalKt.CompositionLocalProvider(HomeSlotListKt.getHomeListSingleLane().provides(Boolean.TRUE), ComposableLambdaKt.rememberComposableLambda(0x25DBCC59, true, new n(this.b, this.c, this.d), ((Composer)object1), 54), ((Composer)object1), ProvidedValue.$stable | 0x30);
        }
        else {
            ((Composer)object1).startReplaceGroup(-339009202);
            CompositionLocalKt.CompositionLocalProvider(HomeSlotListKt.getHomeListSingleLane().provides(Boolean.FALSE), ComposableLambdaKt.rememberComposableLambda(0xDB5F3FF0, true, new o(((BoxWithConstraintsScope)object0), this.b, this.e, arrayList0, this.d), ((Composer)object1), 54), ((Composer)object1), ProvidedValue.$stable | 0x30);
        }
        ((Composer)object1).endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

