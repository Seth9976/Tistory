package com.kakao.tistory.presentation.screen.home.contract;

import com.kakao.tistory.domain.home.entity.HomeSlot.Position;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function1 {
    public static final c a;

    static {
        c.a = new c();
    }

    public c() {
        super(1);
    }

    public static String a(HomeSlotUiState homeSlotUiState0) {
        Intrinsics.checkNotNullParameter(homeSlotUiState0, "it");
        Position homeSlot$Position0 = homeSlotUiState0.getPosition();
        String s = homeSlotUiState0.getSlotType();
        String s1 = homeSlotUiState0.getTitle();
        String s2 = CollectionsKt___CollectionsKt.joinToString$default(homeSlotUiState0.getContents(), null, null, null, 0, null, b.a, 0x1F, null);
        StringBuilder stringBuilder0 = new StringBuilder("position=");
        stringBuilder0.append(homeSlot$Position0);
        stringBuilder0.append(", slotType=");
        stringBuilder0.append(s);
        stringBuilder0.append(", title=");
        return a5.b.q(stringBuilder0, s1, ", contents=", s2);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return c.a(((HomeSlotUiState)object0));
    }
}

