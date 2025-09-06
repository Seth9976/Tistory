package com.kakao.tistory.presentation.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class u0 extends Lambda implements Function0 {
    public final EditorViewModel a;

    public u0(EditorViewModel editorViewModel0) {
        this.a = editorViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        t0 t00 = new t0(this.a);
        EditorViewModel.access$editorPreExport(this.a, t00);
        return Unit.INSTANCE;
    }
}

