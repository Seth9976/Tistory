package com.kakao.tistory.presentation.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class r0 extends Lambda implements Function0 {
    public final EditorViewModel a;

    public r0(EditorViewModel editorViewModel0) {
        this.a = editorViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        q0 q00 = new q0(this.a);
        this.a.a(q00);
        return Unit.INSTANCE;
    }
}

