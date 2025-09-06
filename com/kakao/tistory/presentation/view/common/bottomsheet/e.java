package com.kakao.tistory.presentation.view.common.bottomsheet;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function0 {
    public final CommonBottomDialogFragment a;

    public e(CommonBottomDialogFragment commonBottomDialogFragment0) {
        this.a = commonBottomDialogFragment0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context0 = this.a.requireContext();
        Intrinsics.checkNotNullExpressionValue(context0, "requireContext(...)");
        return new CommonBottomDialogAdapter(context0);
    }
}

