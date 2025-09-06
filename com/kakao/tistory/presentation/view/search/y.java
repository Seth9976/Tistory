package com.kakao.tistory.presentation.view.search;

import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.viewmodel.SearchResultViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function1 {
    public final SearchResultViewModel a;
    public final SearchActivity b;

    public y(SearchResultViewModel searchResultViewModel0, SearchActivity searchActivity0) {
        this.a = searchResultViewModel0;
        this.b = searchActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((EntryItem)object0), "it");
        boolean z = this.a.hasBlogRole(((EntryItem)object0).getBlogName());
        NavigatorExtensionKt.goToEntryView$default(this.b, ((EntryItem)object0), z, null, 4, null);
        return Unit.INSTANCE;
    }
}

