package com.kakao.tistory.presentation.view.common.bottomsheet;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function1 {
    public final AccessibilityBottomDialogFragment a;

    public d(AccessibilityBottomDialogFragment accessibilityBottomDialogFragment0) {
        this.a = accessibilityBottomDialogFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Function1 function10 = this.a.getOnSelectedItem();
        Intrinsics.checkNotNull(((AccessibilitySwipeItemType)object0));
        function10.invoke(((AccessibilitySwipeItemType)object0));
        this.a.dismiss();
        return Unit.INSTANCE;
    }
}

