package com.kakao.tistory.presentation.view.common.widget;

import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.view.common.base.TistoryActivity;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public final TistoryToolbar a;

    public e(TistoryToolbar tistoryToolbar0) {
        this.a = tistoryToolbar0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        TistoryDialog tistoryDialog0 = TistoryDialog.INSTANCE;
        TistoryActivity tistoryActivity0 = this.a.a;
        if(tistoryActivity0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activity");
            tistoryActivity0 = null;
        }
        String s = this.a.getContext().getString(string.label_dialog_developer_finish);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        String s1 = this.a.getContext().getString(string.label_dialog_cancel);
        Intrinsics.checkNotNullExpressionValue(s1, "getString(...)");
        String s2 = this.a.getContext().getString(string.label_dialog_ok);
        Intrinsics.checkNotNullExpressionValue(s2, "getString(...)");
        TistoryDialog.showOkCancel$default(tistoryDialog0, tistoryActivity0, s, null, s1, s2, true, new d(this.a), 4, null);
        return Unit.INSTANCE;
    }
}

