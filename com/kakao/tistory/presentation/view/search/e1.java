package com.kakao.tistory.presentation.view.search;

import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.presentation.viewmodel.SearchResultViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e1 extends Lambda implements Function1 {
    public final SearchResultViewModel a;

    public e1(SearchResultViewModel searchResultViewModel0) {
        this.a = searchResultViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Blog)object0), "blog");
        this.a.onClickBlog(((Blog)object0), false);
        return Unit.INSTANCE;
    }
}

