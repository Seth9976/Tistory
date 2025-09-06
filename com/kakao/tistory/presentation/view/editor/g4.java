package com.kakao.tistory.presentation.view.editor;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class g4 extends Lambda implements Function1 {
    public final EditorSettingFragment a;

    public g4(EditorSettingFragment editorSettingFragment0) {
        this.a = editorSettingFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        EditorSettingFragment.access$showProtectedDialog(this.a, ((String)object0));
        return Unit.INSTANCE;
    }
}

