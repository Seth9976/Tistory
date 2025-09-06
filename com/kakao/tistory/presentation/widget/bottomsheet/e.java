package com.kakao.tistory.presentation.widget.bottomsheet;

import androidx.compose.material.FractionalThreshold;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function2 {
    public static final e a;

    static {
        e.a = new e();
    }

    public e() {
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((BottomSheetValue)object0), "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(((BottomSheetValue)object1), "<anonymous parameter 1>");
        return new FractionalThreshold(0.2f);
    }
}

