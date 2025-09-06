package com.kakao.tistory.presentation.view.editor;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class r4 extends Lambda implements Function1 {
    public final EditorSettingFragment a;

    public r4(EditorSettingFragment editorSettingFragment0) {
        this.a = editorSettingFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "password");
        EditorSettingFragment.access$getEditorViewModel(this.a).setEntryPassword(((String)object0));
        return Unit.INSTANCE;
    }
}

