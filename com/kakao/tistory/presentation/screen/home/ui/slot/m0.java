package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class m0 extends Lambda implements Function0 {
    public final MutableState a;
    public final MutableState b;

    public m0(MutableState mutableState0, MutableState mutableState1) {
        this.a = mutableState0;
        this.b = mutableState1;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Offset.box-impl(Offset.minus-MK-Hz9U(CreatorKt.access$Creator$lambda$6(this.a), CreatorKt.access$Creator$lambda$3(this.b)));
    }
}

