package com.kakao.tistory.presentation.view.editor;

import android.view.View;
import com.kakao.tistory.presentation.R.dimen;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.utils.ToolTip;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k1 extends Lambda implements Function1 {
    public final EditorFragment a;

    public k1(EditorFragment editorFragment0) {
        this.a = editorFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        String s = this.a.getString(string.label_dialog_editor_empty_title);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        View view0 = EditorFragment.access$getDataBinding(this.a).getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        int v = this.a.getResources().getDimensionPixelSize(dimen.tooltip_bottom_margin);
        ToolTip.INSTANCE.show(s, view0, v);
        return Unit.INSTANCE;
    }
}

