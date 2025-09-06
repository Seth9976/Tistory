package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.domain.entity.entry.DraftItem;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class x0 extends Lambda implements Function1 {
    public final EditorActivity a;

    public x0(EditorActivity editorActivity0) {
        this.a = editorActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DraftItem)object0), "draftItem");
        String s = this.a.getString(string.label_dialog_draft_delete_title);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        String s1 = this.a.getString(string.label_dialog_cancel);
        Intrinsics.checkNotNullExpressionValue(s1, "getString(...)");
        String s2 = this.a.getString(string.label_dialog_delete);
        Intrinsics.checkNotNullExpressionValue(s2, "getString(...)");
        w0 w00 = new w0(this.a, ((DraftItem)object0));
        TistoryDialog.showOkCancel$default(TistoryDialog.INSTANCE, this.a, s, null, s1, s2, true, w00, 4, null);
        return Unit.INSTANCE;
    }
}

