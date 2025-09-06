package com.kakao.tistory.presentation.view.search;

import com.kakao.tistory.domain.entity.SearchItem.Keyword;
import com.kakao.tistory.presentation.viewmodel.SearchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class v0 extends FunctionReferenceImpl implements Function2 {
    public v0(Object object0) {
        super(2, object0, SearchViewModel.class, "onClickKeyword", "onClickKeyword(ILcom/kakao/tistory/domain/entity/SearchItem$Keyword;)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((Keyword)object1), "p1");
        ((SearchViewModel)this.receiver).onClickKeyword(((Number)object0).intValue(), ((Keyword)object1));
        return Unit.INSTANCE;
    }
}

