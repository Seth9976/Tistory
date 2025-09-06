package com.kakao.tistory.presentation.view.search;

import com.kakao.tistory.domain.entity.SearchItem.Keyword;
import com.kakao.tistory.presentation.viewmodel.SearchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class p0 extends Lambda implements Function0 {
    public final Keyword a;
    public final SearchViewModel b;

    public p0(Keyword searchItem$Keyword0, SearchViewModel searchViewModel0) {
        this.a = searchItem$Keyword0;
        this.b = searchViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.a.isRecentKeyword()) {
            this.b.onClickKeywordRemove(this.a.getKeywordItem());
            return Unit.INSTANCE;
        }
        this.b.onClickKeywordAttach(this.a.getKeywordItem());
        return Unit.INSTANCE;
    }
}

