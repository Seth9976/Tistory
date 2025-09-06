package com.kakao.tistory.presentation.view.editor;

import android.app.Dialog;
import com.kakao.tistory.domain.entity.entry.DraftItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a1 extends Lambda implements Function2 {
    public final EditorFragment a;
    public final DraftItem b;

    public a1(EditorFragment editorFragment0, DraftItem draftItem0) {
        this.a = editorFragment0;
        this.b = draftItem0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((Dialog)object0), "dialog");
        ((Dialog)object0).dismiss();
        if(((Number)object1).intValue() == 2) {
            EditorFragment.access$getDraftViewModel(this.a).dismissDraftListDialog();
            EditorFragment.access$getEditorViewModel(this.a).clearAutoSaved();
            EditorFragment.access$getEditorViewModel(this.a).loadDraftCMD(this.b);
        }
        return Unit.INSTANCE;
    }
}

