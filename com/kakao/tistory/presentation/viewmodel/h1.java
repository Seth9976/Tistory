package com.kakao.tistory.presentation.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class h1 extends Lambda implements Function0 {
    public final EditorViewModel a;

    public h1(EditorViewModel editorViewModel0) {
        this.a = editorViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.uploadPost();
        return Unit.INSTANCE;
    }
}

