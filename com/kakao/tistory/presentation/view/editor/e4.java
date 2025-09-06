package com.kakao.tistory.presentation.view.editor;

import androidx.fragment.app.FragmentActivity;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e4 extends Lambda implements Function1 {
    public final EditorSettingFragment a;
    public final EditorViewModel b;

    public e4(EditorSettingFragment editorSettingFragment0, EditorViewModel editorViewModel0) {
        this.a = editorSettingFragment0;
        this.b = editorViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        FragmentActivity fragmentActivity0 = this.a.getActivity();
        if(fragmentActivity0 != null) {
            String s = this.a.getString(string.label_dialog_challenge_category_required_title);
            Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
            String s1 = this.a.getString(string.label_dialog_challenge_category_required_message);
            String s2 = this.a.getString(string.label_dialog_challenge_category_required_left_button);
            Intrinsics.checkNotNullExpressionValue(s2, "getString(...)");
            String s3 = this.a.getString(string.label_dialog_challenge_category_required_right_button);
            Intrinsics.checkNotNullExpressionValue(s3, "getString(...)");
            d4 d40 = new d4(this.a, this.b);
            TistoryDialog.INSTANCE.showOkCancel(fragmentActivity0, s, s1, s2, s3, true, d40);
        }
        return Unit.INSTANCE;
    }
}

