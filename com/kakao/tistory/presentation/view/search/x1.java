package com.kakao.tistory.presentation.view.search;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.viewmodel.SearchResultViewModel;
import com.kakao.tistory.presentation.viewmodel.SearchViewModel;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class x1 extends Lambda implements Function2 {
    public final SearchViewModel a;
    public final TopViewModel b;
    public final SearchResultViewModel c;
    public final int d;
    public final int e;

    public x1(SearchViewModel searchViewModel0, TopViewModel topViewModel0, SearchResultViewModel searchResultViewModel0, int v, int v1) {
        this.a = searchViewModel0;
        this.b = topViewModel0;
        this.c = searchResultViewModel0;
        this.d = v;
        this.e = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SearchResultListFragmentKt.SearchResultPager(this.a, this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)), this.e);
        return Unit.INSTANCE;
    }
}

