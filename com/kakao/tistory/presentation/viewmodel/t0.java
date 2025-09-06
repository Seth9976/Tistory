package com.kakao.tistory.presentation.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class t0 extends Lambda implements Function0 {
    public final EditorViewModel a;

    public t0(EditorViewModel editorViewModel0) {
        this.a = editorViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.a(EditorMode.SETTING_MODE);
        return Unit.INSTANCE;
    }
}

