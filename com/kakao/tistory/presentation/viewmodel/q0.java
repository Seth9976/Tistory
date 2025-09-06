package com.kakao.tistory.presentation.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class q0 extends Lambda implements Function1 {
    public final EditorViewModel a;

    public q0(EditorViewModel editorViewModel0) {
        this.a = editorViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        EditorViewModel.access$publishDraft(this.a, ((String)object0));
        return Unit.INSTANCE;
    }
}

