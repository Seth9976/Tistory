package com.kakao.tistory.presentation.view.editor;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a6 extends Lambda implements Function1 {
    public final EditorTagFragment a;

    public a6(EditorTagFragment editorTagFragment0) {
        this.a = editorTagFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        EditorTagFragment.access$getEditorTagViewModel(this.a).initSelectedTag(((List)object0));
        return Unit.INSTANCE;
    }
}

