package com.kakao.tistory.presentation.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class s0 extends Lambda implements Function0 {
    public final EditorViewModel a;

    public s0(EditorViewModel editorViewModel0) {
        this.a = editorViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        r0 r00 = new r0(this.a);
        EditorViewModel.access$editorPreExport(this.a, r00);
        return Unit.INSTANCE;
    }
}

