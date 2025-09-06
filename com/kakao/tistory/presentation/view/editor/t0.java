package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class t0 extends Lambda implements Function1 {
    public final EditorActivity a;

    public t0(EditorActivity editorActivity0) {
        this.a = editorActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        String s = this.a.getString(string.label_dialog_editor_cancel_modify_title);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        String s1 = this.a.getString(string.label_dialog_editor_cancel_modify);
        String s2 = this.a.getString(string.label_dialog_no);
        Intrinsics.checkNotNullExpressionValue(s2, "getString(...)");
        String s3 = this.a.getString(string.label_dialog_confirm_cancel);
        Intrinsics.checkNotNullExpressionValue(s3, "getString(...)");
        s0 s00 = new s0(this.a);
        TistoryDialog.INSTANCE.showOkCancel(this.a, s, s1, s2, s3, true, s00);
        return Unit.INSTANCE;
    }
}

