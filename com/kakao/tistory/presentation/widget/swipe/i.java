package com.kakao.tistory.presentation.widget.swipe;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.paging.compose.LazyPagingItems;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function4 {
    public final LazyPagingItems a;
    public final Function2 b;
    public final CommonSwipeGroupState c;
    public final AnchorsProvider d;
    public final Integer e;
    public final Function4 f;

    public i(LazyPagingItems lazyPagingItems0, Function2 function20, CommonSwipeGroupState commonSwipeGroupState0, AnchorsProvider anchorsProvider0, Integer integer0, Function4 function40) {
        this.a = lazyPagingItems0;
        this.b = function20;
        this.c = commonSwipeGroupState0;
        this.d = anchorsProvider0;
        this.e = integer0;
        this.f = function40;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((LazyItemScope)object0), "$this$items");
        if((v1 & 0x70) == 0) {
            v1 |= (((Composer)object2).changed(v) ? 0x20 : 16);
        }
        if((v1 & 721) == 0x90 && ((Composer)object2).getSkipping()) {
            ((Composer)object2).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x48E7849C, v1, -1, "com.kakao.tistory.presentation.widget.swipe.swipeableItems.<anonymous> (LazyListExtension.kt:61)");
        }
        Object object4 = this.a.get(v);
        if(object4 != null) {
            LazyListExtensionKt.access$SwipeableItems(v, object4, (this.b == null ? null : this.b.invoke(v, object4)), this.c, this.d, this.e, this.f, ((Composer)object2), v1 >> 3 & 14 | 0x200, 0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

