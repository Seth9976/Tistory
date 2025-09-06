package com.kakao.tistory.presentation.view.search;

import com.kakao.tistory.presentation.common.utils.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function1 {
    public final SearchActivity a;

    public a0(SearchActivity searchActivity0) {
        this.a = searchActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(((Integer)object0) != null) {
            ToastUtils.show$default(ToastUtils.INSTANCE, this.a, ((Integer)object0).intValue(), 0, 0, 12, null);
        }
        return Unit.INSTANCE;
    }
}

