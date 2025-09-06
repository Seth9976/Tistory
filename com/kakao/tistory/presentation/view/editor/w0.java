package com.kakao.tistory.presentation.view.editor;

import android.app.Dialog;
import com.kakao.tistory.domain.entity.entry.DraftItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class w0 extends Lambda implements Function2 {
    public final EditorActivity a;
    public final DraftItem b;

    public w0(EditorActivity editorActivity0, DraftItem draftItem0) {
        this.a = editorActivity0;
        this.b = draftItem0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((Dialog)object0), "dialog");
        switch(((Number)object1).intValue()) {
            case 1: {
                ((Dialog)object0).dismiss();
                return Unit.INSTANCE;
            }
            case 2: {
                ((Dialog)object0).dismiss();
                EditorActivity.access$getDraftViewModel(this.a).deleteDraft(this.b.getSequence());
                return Unit.INSTANCE;
            }
            default: {
                return Unit.INSTANCE;
            }
        }
    }
}

