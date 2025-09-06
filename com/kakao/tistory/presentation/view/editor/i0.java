package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i0 extends Lambda implements Function1 {
    public final EditorActivity a;

    public i0(EditorActivity editorActivity0) {
        this.a = editorActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        String s = this.a.getString(string.label_dialog_not_my_blog_title);
        String s1 = this.a.getString(string.label_dialog_not_my_blog_message);
        Intrinsics.checkNotNull(s);
        g0 g00 = new g0(this.a);
        h0 h00 = new h0(this.a);
        TistoryDialog.showOk$default(TistoryDialog.INSTANCE, this.a, s, s1, false, null, g00, h00, 16, null);
        return Unit.INSTANCE;
    }
}

