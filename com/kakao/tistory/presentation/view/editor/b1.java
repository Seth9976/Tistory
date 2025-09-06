package com.kakao.tistory.presentation.view.editor;

import androidx.fragment.app.FragmentActivity;
import com.kakao.tistory.domain.entity.entry.DraftItem;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b1 extends Lambda implements Function1 {
    public final EditorFragment a;

    public b1(EditorFragment editorFragment0) {
        this.a = editorFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DraftItem)object0), "draftItem");
        FragmentActivity fragmentActivity0 = this.a.getActivity();
        if(fragmentActivity0 != null) {
            String s = this.a.getString(string.label_draft_load_on_edit_title);
            Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
            String s1 = this.a.getString(string.label_draft_load_on_edit_message);
            String s2 = this.a.getString(com.kakao.keditor.R.string.common_dialog_cancel);
            Intrinsics.checkNotNullExpressionValue(s2, "getString(...)");
            String s3 = this.a.getString(string.label_dialog_load);
            Intrinsics.checkNotNullExpressionValue(s3, "getString(...)");
            a1 a10 = new a1(this.a, ((DraftItem)object0));
            TistoryDialog.INSTANCE.showOkCancel(fragmentActivity0, s, s1, s2, s3, true, a10);
        }
        return Unit.INSTANCE;
    }
}

