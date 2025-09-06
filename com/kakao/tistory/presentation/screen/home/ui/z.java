package com.kakao.tistory.presentation.screen.home.ui;

import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

public final class z extends Lambda implements Function2 {
    public static final z a;

    static {
        z.a = new z();
    }

    public z() {
        super(2);
    }

    public static String a(int v, HomeSlotUiState homeSlotUiState0) {
        Intrinsics.checkNotNullParameter(homeSlotUiState0, "item");
        return Reflection.getOrCreateKotlinClass(homeSlotUiState0.getClass()).getSimpleName() + v;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return z.a(((Number)object0).intValue(), ((HomeSlotUiState)object1));
    }
}

