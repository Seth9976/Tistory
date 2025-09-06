package com.kakao.tistory.presentation.screen.home.ui;

import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

public final class s extends Lambda implements Function2 {
    public static final s a;

    static {
        s.a = new s();
    }

    public s() {
        super(2);
    }

    public static String a(int v, Pair pair0) {
        Intrinsics.checkNotNullParameter(pair0, "it");
        HomeSlotUiState homeSlotUiState0 = (HomeSlotUiState)pair0.getFirst();
        if(homeSlotUiState0 != null) {
            String s = Reflection.getOrCreateKotlinClass(homeSlotUiState0.getClass()).getSimpleName() + v;
            return s == null ? "empty" + v : s;
        }
        return "empty" + v;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return s.a(((Number)object0).intValue(), ((Pair)object1));
    }
}

