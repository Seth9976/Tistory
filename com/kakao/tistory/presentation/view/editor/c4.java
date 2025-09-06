package com.kakao.tistory.presentation.view.editor;

import androidx.fragment.app.FragmentActivity;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c4 extends Lambda implements Function1 {
    public final EditorSettingFragment a;

    public c4(EditorSettingFragment editorSettingFragment0) {
        this.a = editorSettingFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        FragmentActivity fragmentActivity0 = this.a.getActivity();
        if(fragmentActivity0 != null) {
            String s = this.a.getString(string.label_dialog_delete_thumbnail);
            Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
            String s1 = this.a.getString(string.label_dialog_cancel);
            Intrinsics.checkNotNullExpressionValue(s1, "getString(...)");
            String s2 = this.a.getString(string.label_dialog_delete);
            Intrinsics.checkNotNullExpressionValue(s2, "getString(...)");
            b4 b40 = new b4(this.a);
            TistoryDialog.showOkCancel$default(TistoryDialog.INSTANCE, fragmentActivity0, s, null, s1, s2, true, b40, 4, null);
        }
        return Unit.INSTANCE;
    }
}

