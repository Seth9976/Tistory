package com.kakao.tistory.presentation.view.search;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.domain.entity.SearchResultItem.Top;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class i2 extends Lambda implements Function2 {
    public final Top a;
    public final TopViewModel b;
    public final int c;

    public i2(Top searchResultItem$Top0, TopViewModel topViewModel0, int v) {
        this.a = searchResultItem$Top0;
        this.b = topViewModel0;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SearchResultListFragmentKt.access$SearchTop(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

