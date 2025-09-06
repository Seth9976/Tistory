package com.kakao.tistory.presentation.view.common.bottomsheet;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function1 {
    public final AccessibilityBottomDialogFragment a;

    public c(AccessibilityBottomDialogFragment accessibilityBottomDialogFragment0) {
        this.a = accessibilityBottomDialogFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return Boolean.valueOf(AccessibilityBottomDialogFragment.access$getBottomCommonDialogAdapter(this.a).checkNeedDivider(((Number)object0).intValue()));
    }
}

