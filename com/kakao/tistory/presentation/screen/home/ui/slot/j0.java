package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.runtime.MutableState;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Creator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class j0 extends Lambda implements Function0 {
    public final Creator a;
    public final String b;
    public final MutableState c;

    public j0(Creator homeSlotUiState$Creator0, String s, MutableState mutableState0) {
        this.a = homeSlotUiState$Creator0;
        this.b = s;
        this.c = mutableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.getOnClickUrl().invoke(this.b);
        CreatorKt.access$Creator$lambda$12(this.c, false);
        return Unit.INSTANCE;
    }
}

