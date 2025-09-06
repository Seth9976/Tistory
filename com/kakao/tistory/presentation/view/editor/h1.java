package com.kakao.tistory.presentation.view.editor;

import com.kakao.android.base.tiara.TiaraUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h1 extends Lambda implements Function1 {
    public final EditorFragment a;

    public h1(EditorFragment editorFragment0) {
        this.a = editorFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        TiaraUtils.trackPage$default(TiaraUtils.INSTANCE, this.a, null, null, null, 14, null);
        return Unit.INSTANCE;
    }
}

