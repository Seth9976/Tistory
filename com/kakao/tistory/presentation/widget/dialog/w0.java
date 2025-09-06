package com.kakao.tistory.presentation.widget.dialog;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class w0 extends Lambda implements Function0 {
    public final MutableState a;

    public w0(MutableState mutableState0) {
        this.a = mutableState0;
        super(0);
    }

    public final void a() {
        String s = TistoryComposeDialogKt.access$ShowDialogEventPreview$lambda$7(this.a);
        TistoryComposeDialogKt.access$ShowDialogEventPreview$lambda$8(this.a, s + " dismiss");
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a();
        return Unit.INSTANCE;
    }
}

