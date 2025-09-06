package com.kakao.tistory.presentation.view.search;

import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.viewmodel.SearchResultViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class j1 extends Lambda implements Function0 {
    public final SearchResultViewModel a;
    public final int b;
    public final EntryItem c;

    public j1(SearchResultViewModel searchResultViewModel0, int v, EntryItem entryItem0) {
        this.a = searchResultViewModel0;
        this.b = v;
        this.c = entryItem0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.onClickEntryItem(this.b - 1, this.c);
        return Unit.INSTANCE;
    }
}

