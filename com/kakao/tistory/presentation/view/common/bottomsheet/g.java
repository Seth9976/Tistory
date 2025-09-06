package com.kakao.tistory.presentation.view.common.bottomsheet;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function1 {
    public final CommonBottomDialogFragment a;

    public g(CommonBottomDialogFragment commonBottomDialogFragment0) {
        this.a = commonBottomDialogFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return Boolean.valueOf(CommonBottomDialogFragment.access$getBottomCommonDialogAdapter(this.a).checkNeedDivider(((Number)object0).intValue()));
    }
}

