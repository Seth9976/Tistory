package com.kakao.tistory.presentation.view.search;

import androidx.compose.runtime.Composer;
import com.google.accompanist.pager.PagerState;
import com.kakao.tistory.presentation.viewmodel.SearchViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class k2 extends Lambda implements Function2 {
    public final PagerState a;
    public final List b;
    public final SearchViewModel c;
    public final int d;

    public k2(PagerState pagerState0, List list0, SearchViewModel searchViewModel0, int v) {
        this.a = pagerState0;
        this.b = list0;
        this.c = searchViewModel0;
        this.d = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SearchResultListFragmentKt.a(this.a, this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)));
        return Unit.INSTANCE;
    }
}

