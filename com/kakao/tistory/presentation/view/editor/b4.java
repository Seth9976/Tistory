package com.kakao.tistory.presentation.view.editor;

import android.app.Dialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b4 extends Lambda implements Function2 {
    public final EditorSettingFragment a;

    public b4(EditorSettingFragment editorSettingFragment0) {
        this.a = editorSettingFragment0;
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
                EditorSettingFragment.access$getEditorViewModel(this.a).deleteThumbnailImage();
                return Unit.INSTANCE;
            }
            default: {
                return Unit.INSTANCE;
            }
        }
    }
}

