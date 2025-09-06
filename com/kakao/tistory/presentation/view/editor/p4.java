package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.presentation.view.common.dialog.CommonDatePickerDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class p4 extends Lambda implements Function2 {
    public final EditorSettingFragment a;

    public p4(EditorSettingFragment editorSettingFragment0) {
        this.a = editorSettingFragment0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((CommonDatePickerDialog)object0), "dialog");
        if(((Number)object1).intValue() == 2) {
            EditorSettingFragment.access$getEditorViewModel(this.a).getReserverTime().postValue(((CommonDatePickerDialog)object0).getSelectedDate().getTimeInMillis());
        }
        ((CommonDatePickerDialog)object0).dismiss();
        return Unit.INSTANCE;
    }
}

