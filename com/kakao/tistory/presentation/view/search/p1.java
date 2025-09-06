package com.kakao.tistory.presentation.view.search;

import androidx.compose.runtime.Composer;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.tistory.presentation.viewmodel.SearchResultViewModel;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class p1 extends Lambda implements Function2 {
    public final LazyPagingItems a;
    public final String b;
    public final TopViewModel c;
    public final SearchResultViewModel d;
    public final int e;

    public p1(LazyPagingItems lazyPagingItems0, String s, TopViewModel topViewModel0, SearchResultViewModel searchResultViewModel0, int v) {
        this.a = lazyPagingItems0;
        this.b = s;
        this.c = topViewModel0;
        this.d = searchResultViewModel0;
        this.e = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SearchResultListFragmentKt.access$SearchResultList(this.a, this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)));
        return Unit.INSTANCE;
    }
}

