package com.kakao.tistory.presentation.view.search;

import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function1 {
    public final SearchActivity a;

    public z(SearchActivity searchActivity0) {
        this.a = searchActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(((String)object0) != null) {
            NavigatorExtensionKt.goToBlogTop(this.a, ((String)object0));
        }
        return Unit.INSTANCE;
    }
}

