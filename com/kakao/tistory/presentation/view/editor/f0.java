package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f0 extends Lambda implements Function1 {
    public final EditorActivity a;

    public f0(EditorActivity editorActivity0) {
        this.a = editorActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        String s = this.a.getString(string.label_exception_json_parser_title);
        Intrinsics.checkNotNull(s);
        d0 d00 = new d0(this.a);
        e0 e00 = new e0(this.a);
        TistoryDialog.showOk$default(TistoryDialog.INSTANCE, this.a, s, null, false, null, d00, e00, 20, null);
        return Unit.INSTANCE;
    }
}

