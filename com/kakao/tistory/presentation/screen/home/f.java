package com.kakao.tistory.presentation.screen.home;

import androidx.compose.runtime.MutableState;
import com.kakao.tistory.presentation.screen.home.tiara.HomeTiara.LastSlotInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function1 {
    public final MutableState a;

    public f(MutableState mutableState0) {
        this.a = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LastSlotInfo)object0), "it");
        HomeScreenKt.access$HomeScreen$lambda$3(this.a, ((LastSlotInfo)object0));
        return Unit.INSTANCE;
    }
}

