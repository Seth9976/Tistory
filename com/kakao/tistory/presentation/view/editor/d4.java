package com.kakao.tistory.presentation.view.editor;

import android.app.Dialog;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d4 extends Lambda implements Function2 {
    public final EditorSettingFragment a;
    public final EditorViewModel b;

    public d4(EditorSettingFragment editorSettingFragment0, EditorViewModel editorViewModel0) {
        this.a = editorSettingFragment0;
        this.b = editorViewModel0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((Dialog)object0), "dialog");
        switch(((Number)object1).intValue()) {
            case 1: {
                EditorSettingTiara.INSTANCE.trackClickChallengeServiceCategoryContinue();
                ((Dialog)object0).dismiss();
                EditorSettingFragment.access$getEditorViewModel(this.a).uploadPost();
                return Unit.INSTANCE;
            }
            case 2: {
                EditorSettingTiara.INSTANCE.trackClickChallengeServiceCategory();
                ((Dialog)object0).dismiss();
                this.b.onClickDaumLikeSelect(false);
                return Unit.INSTANCE;
            }
            default: {
                return Unit.INSTANCE;
            }
        }
    }
}

