package com.kakao.tistory.presentation.view.editor;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h0 extends Lambda implements Function1 {
    public final EditorActivity a;

    public h0(EditorActivity editorActivity0) {
        this.a = editorActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DialogInterface)object0), "it");
        this.a.finish();
        return Unit.INSTANCE;
    }
}

