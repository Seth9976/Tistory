package com.kakao.tistory.presentation.view.search;

import com.kakao.tistory.domain.entity.SearchItem.Keyword;
import com.kakao.tistory.presentation.viewmodel.SearchViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class u0 extends Lambda implements Function0 {
    public final SearchViewModel a;
    public final Keyword b;

    public u0(SearchViewModel searchViewModel0, Keyword searchItem$Keyword0) {
        this.a = searchViewModel0;
        this.b = searchItem$Keyword0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String s = this.b.getKeywordItem().getKeyword();
        return Boolean.valueOf(this.a.isSameCurrentKeyword(s));
    }
}

