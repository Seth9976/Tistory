package com.kakao.tistory.presentation.view.editor;

import androidx.fragment.app.FragmentActivity;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g1 extends Lambda implements Function1 {
    public final EditorFragment a;

    public g1(EditorFragment editorFragment0) {
        this.a = editorFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Pair)object0), "<name for destructuring parameter 0>");
        Object object1 = ((Pair)object0).component1();
        Object object2 = ((Pair)object0).component2();
        FragmentActivity fragmentActivity0 = this.a.getActivity();
        if(fragmentActivity0 != null) {
            TistoryDialog.showOk$default(TistoryDialog.INSTANCE, fragmentActivity0, ((String)object1), ((String)object2), false, null, f1.a, null, 88, null);
        }
        return Unit.INSTANCE;
    }
}

