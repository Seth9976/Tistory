package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o0 extends Lambda implements Function1 {
    public final EditorActivity a;

    public o0(EditorActivity editorActivity0) {
        this.a = editorActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "it");
        String s = this.a.getString(string.label_editor_can_not_edit_entry_title);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        String s1 = this.a.getString(string.label_editor_can_not_edit_entry_message);
        m0 m00 = new m0(this.a);
        n0 n00 = new n0(this.a);
        TistoryDialog.showOk$default(TistoryDialog.INSTANCE, this.a, s, s1, false, null, m00, n00, 24, null);
        return Unit.INSTANCE;
    }
}

