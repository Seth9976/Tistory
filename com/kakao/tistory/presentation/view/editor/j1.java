package com.kakao.tistory.presentation.view.editor;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class j1 extends Lambda implements Function1 {
    public final EditorFragment a;

    public j1(EditorFragment editorFragment0) {
        this.a = editorFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Boolean boolean0 = (Boolean)object0;
        View view0 = this.a.requireActivity().getWindow().getCurrentFocus();
        if(view0 != null) {
            view0.clearFocus();
        }
        return Unit.INSTANCE;
    }
}

