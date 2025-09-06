package com.kakao.tistory.presentation.view.search;

import android.app.Dialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function2 {
    public final SearchActivity a;

    public w(SearchActivity searchActivity0) {
        this.a = searchActivity0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((Dialog)object0), "dialog");
        if(((Number)object1).intValue() == 2) {
            SearchActivity.access$getSearchViewModel(this.a).removeAllRecentKeyword();
        }
        ((Dialog)object0).dismiss();
        return Unit.INSTANCE;
    }
}

