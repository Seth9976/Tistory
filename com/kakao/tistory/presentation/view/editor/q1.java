package com.kakao.tistory.presentation.view.editor;

import android.content.Context;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.utils.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q1 extends Lambda implements Function1 {
    public final EditorFragment a;

    public q1(EditorFragment editorFragment0) {
        this.a = editorFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        EditorFragment.access$getDraftViewModel(this.a).dismissDraftListDialog();
        Context context0 = this.a.getContext();
        String s = this.a.getString(string.label_dialog_editor_load_draft_duplicated);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        ToastUtils.show$default(ToastUtils.INSTANCE, context0, s, 0, 0, 12, null);
        return Unit.INSTANCE;
    }
}

