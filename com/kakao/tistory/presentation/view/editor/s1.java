package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.domain.entity.entry.DraftItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class s1 extends Lambda implements Function1 {
    public final EditorFragment a;

    public s1(EditorFragment editorFragment0) {
        this.a = editorFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DraftItem)object0), "it");
        EditorFragment.access$getEditorViewModel(this.a).loadDraft(((DraftItem)object0));
        return Unit.INSTANCE;
    }
}

