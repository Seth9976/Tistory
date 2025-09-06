package com.kakao.tistory.presentation.view.editor;

import android.app.Dialog;
import com.kakao.tistory.presentation.screen.feed.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class m0 extends Lambda implements Function2 {
    public final EditorActivity a;

    public m0(EditorActivity editorActivity0) {
        this.a = editorActivity0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        t.a(((Number)object1), ((Dialog)object0), "dialog");
        this.a.finish();
        return Unit.INSTANCE;
    }
}

