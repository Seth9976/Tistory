package com.kakao.tistory.presentation.view.search;

import com.kakao.tistory.presentation.viewmodel.SearchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class f extends FunctionReferenceImpl implements Function1 {
    public f(SearchViewModel searchViewModel0) {
        super(1, searchViewModel0, SearchViewModel.class, "onTextChanged", "onTextChanged(Ljava/lang/String;)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "p0");
        ((SearchViewModel)this.receiver).onTextChanged(((String)object0));
        return Unit.INSTANCE;
    }
}

