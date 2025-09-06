package com.kakao.tistory.presentation.view.editor;

import androidx.fragment.app.FragmentActivity;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e1 extends Lambda implements Function1 {
    public final EditorFragment a;

    public e1(EditorFragment editorFragment0) {
        this.a = editorFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v = ((Number)object0).intValue();
        FragmentActivity fragmentActivity0 = this.a.getActivity();
        if(fragmentActivity0 != null) {
            String s = this.a.getString(v);
            Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
            TistoryDialog.showOk$default(TistoryDialog.INSTANCE, fragmentActivity0, s, null, false, null, d1.a, null, 92, null);
        }
        return Unit.INSTANCE;
    }
}

