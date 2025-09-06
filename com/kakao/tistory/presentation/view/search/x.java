package com.kakao.tistory.presentation.view.search;

import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function1 {
    public final SearchActivity a;

    public x(SearchActivity searchActivity0) {
        this.a = searchActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        String s = this.a.getString(string.label_dialog_search_remove_all_title);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        String s1 = this.a.getString(string.label_dialog_cancel);
        Intrinsics.checkNotNullExpressionValue(s1, "getString(...)");
        String s2 = this.a.getString(string.label_dialog_delete);
        Intrinsics.checkNotNullExpressionValue(s2, "getString(...)");
        w w0 = new w(this.a);
        TistoryDialog.showOkCancel$default(TistoryDialog.INSTANCE, this.a, s, null, s1, s2, true, w0, 4, null);
        return Unit.INSTANCE;
    }
}

