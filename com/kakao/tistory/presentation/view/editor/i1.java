package com.kakao.tistory.presentation.view.editor;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i1 extends Lambda implements Function1 {
    public final EditorFragment a;

    public i1(EditorFragment editorFragment0) {
        this.a = editorFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNull(((Boolean)object0));
        if(((Boolean)object0).booleanValue()) {
            this.a.getLoadingDialog().show();
            return Unit.INSTANCE;
        }
        this.a.getLoadingDialog().dismiss();
        return Unit.INSTANCE;
    }
}

