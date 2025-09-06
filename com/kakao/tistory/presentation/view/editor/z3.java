package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.presentation.view.common.dialog.CommonTimePickerDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class z3 extends Lambda implements Function2 {
    public final EditorSettingFragment a;

    public z3(EditorSettingFragment editorSettingFragment0) {
        this.a = editorSettingFragment0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((CommonTimePickerDialog)object0), "dialog");
        if(((Number)object1).intValue() == 2) {
            EditorSettingFragment.access$getEditorViewModel(this.a).getReserverTime().postValue(((CommonTimePickerDialog)object0).getSelectedTime().getTimeInMillis());
        }
        ((CommonTimePickerDialog)object0).dismiss();
        return Unit.INSTANCE;
    }
}

