package com.kakao.tistory.presentation.view.search;

import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.presentation.viewmodel.SearchResultViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class d1 extends FunctionReferenceImpl implements Function1 {
    public d1(SearchResultViewModel searchResultViewModel0) {
        super(1, searchResultViewModel0, SearchResultViewModel.class, "onClickFollow", "onClickFollow(Lcom/kakao/tistory/domain/entity/Blog;)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Blog)object0), "p0");
        ((SearchResultViewModel)this.receiver).onClickFollow(((Blog)object0));
        return Unit.INSTANCE;
    }
}

