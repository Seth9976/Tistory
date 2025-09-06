package com.kakao.tistory.presentation.view.common.base;

import com.kakao.android.base.model.ErrorModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function0 {
    public final TistoryRecyclerFragment a;

    public v(TistoryRecyclerFragment tistoryRecyclerFragment0) {
        this.a = tistoryRecyclerFragment0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ErrorModel errorModel0 = new ErrorModel();
        this.a.showExceptionView(errorModel0);
        return Unit.INSTANCE;
    }
}

