package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.domain.entity.common.RegulationLink;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.ExtensionsKt;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k0 extends Lambda implements Function1 {
    public final EditorActivity a;

    public k0(EditorActivity editorActivity0) {
        this.a = editorActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((RegulationLink)object0), "it");
        CharSequence charSequence0 = ExtensionsKt.getRegulationClickableSpanMessage(((RegulationLink)object0), this.a);
        String s = this.a.getString(string.label_exception_regulation_title);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        TistoryDialog.showOk$default(TistoryDialog.INSTANCE, this.a, s, charSequence0, false, null, j0.a, null, 88, null);
        return Unit.INSTANCE;
    }
}

