package com.kakao.tistory.presentation.view.editor;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class l1 extends Lambda implements Function1 {
    public final EditorFragment a;

    public l1(EditorFragment editorFragment0) {
        this.a = editorFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(((Pair)object0) == null) {
            EditorFragment.access$getUploadProgressDialog(this.a).hide();
            return Unit.INSTANCE;
        }
        EditorFragment.access$getUploadProgressDialog(this.a).show();
        EditorFragment.access$getUploadProgressDialog(this.a).setProgress(((Number)((Pair)object0).getFirst()).intValue(), ((Number)((Pair)object0).getSecond()).intValue());
        return Unit.INSTANCE;
    }
}

