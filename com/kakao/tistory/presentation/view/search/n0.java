package com.kakao.tistory.presentation.view.search;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.domain.entity.SearchItem.Bottom;
import com.kakao.tistory.presentation.viewmodel.SearchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class n0 extends Lambda implements Function2 {
    public final Bottom a;
    public final SearchViewModel b;
    public final int c;

    public n0(Bottom searchItem$Bottom0, SearchViewModel searchViewModel0, int v) {
        this.a = searchItem$Bottom0;
        this.b = searchViewModel0;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SearchKeywordFragmentKt.access$SearchBottom(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

