package com.kakao.tistory.presentation.view.entry;

import com.kakao.tistory.presentation.R.dimen;
import com.kakao.tistory.presentation.common.utils.ScaleUtilsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class h0 extends Lambda implements Function0 {
    public final EntryViewActivity a;

    public h0(EntryViewActivity entryViewActivity0) {
        this.a = entryViewActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ScaleUtilsKt.dimen2px(this.a, dimen.common_toolbar_height);
    }
}

