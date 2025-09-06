package com.kakao.tistory.presentation.view.editor;

import androidx.fragment.app.FragmentActivity;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class q4 extends Lambda implements Function1 {
    public final EditorSettingFragment a;

    public q4(EditorSettingFragment editorSettingFragment0) {
        this.a = editorSettingFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v = ((Number)object0).longValue();
        FragmentActivity fragmentActivity0 = this.a.getActivity();
        if(fragmentActivity0 != null) {
            Calendar calendar0 = Calendar.getInstance();
            calendar0.setTimeInMillis(v);
            p4 p40 = new p4(this.a);
            TistoryDialog.INSTANCE.showDatePickerDialog(fragmentActivity0, calendar0, true, p40);
        }
        return Unit.INSTANCE;
    }
}

