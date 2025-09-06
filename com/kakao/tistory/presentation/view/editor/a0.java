package com.kakao.tistory.presentation.view.editor;

import android.widget.Toast;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function1 {
    public final EditorActivity a;

    public a0(EditorActivity editorActivity0) {
        this.a = editorActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        String s = this.a.getString(((Number)object0).intValue());
        Toast.makeText(this.a, s, 0).show();
        return Unit.INSTANCE;
    }
}

