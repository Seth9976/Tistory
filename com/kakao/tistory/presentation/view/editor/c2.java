package com.kakao.tistory.presentation.view.editor;

import androidx.compose.runtime.State;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class c2 extends Lambda implements Function1 {
    public final EditorSettingFragment a;
    public final State b;

    public c2(EditorSettingFragment editorSettingFragment0, State state0) {
        this.a = editorSettingFragment0;
        this.b = state0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((Boolean)object0).getClass();
        EditorSettingFragment.access$getEditorViewModel(this.a).commentAcceptChanged(!EditorSettingFragment.access$CommentPermitContainer$lambda$39(this.b).booleanValue());
        return Unit.INSTANCE;
    }
}

