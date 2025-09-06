package com.kakao.tistory.presentation.view.common.base;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class j0 extends Lambda implements Function2 {
    public final TistoryToolbarComposeActivity a;
    public final LazyListState b;
    public final int c;

    public j0(TistoryToolbarComposeActivity tistoryToolbarComposeActivity0, LazyListState lazyListState0, int v) {
        this.a = tistoryToolbarComposeActivity0;
        this.b = lazyListState0;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.ToolbarVisibilityHandler(this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

