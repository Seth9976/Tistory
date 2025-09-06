package com.kakao.tistory.presentation.view.search;

import androidx.compose.runtime.Composer;
import com.google.accompanist.pager.PagerState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class e2 extends Lambda implements Function2 {
    public final PagerState a;
    public final List b;
    public final int c;

    public e2(PagerState pagerState0, List list0, int v) {
        this.a = pagerState0;
        this.b = list0;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SearchResultListFragmentKt.SearchResultTab(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

