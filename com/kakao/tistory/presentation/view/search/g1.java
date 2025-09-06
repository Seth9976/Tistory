package com.kakao.tistory.presentation.view.search;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.domain.entity.SearchResultItem.BlogItem;
import com.kakao.tistory.presentation.viewmodel.SearchResultViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g1 extends Lambda implements Function2 {
    public final BlogItem a;
    public final SearchResultViewModel b;
    public final int c;

    public g1(BlogItem searchResultItem$BlogItem0, SearchResultViewModel searchResultViewModel0, int v) {
        this.a = searchResultItem$BlogItem0;
        this.b = searchResultViewModel0;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SearchResultListFragmentKt.access$SearchBlogResult(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

