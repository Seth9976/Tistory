package com.kakao.tistory.presentation.view.search;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c0 extends Lambda implements Function1 {
    public final SearchActivity a;

    public c0(SearchActivity searchActivity0) {
        this.a = searchActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ErrorModel)object0), "it");
        TistoryDialog.showOk$default(TistoryDialog.INSTANCE, this.a, ((ErrorModel)object0).getTitle(), ((ErrorModel)object0).getMessage(), false, null, b0.a, null, 80, null);
        return Unit.INSTANCE;
    }
}

