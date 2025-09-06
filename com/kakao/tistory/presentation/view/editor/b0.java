package com.kakao.tistory.presentation.view.editor;

import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function2 {
    public final EditorActivity a;

    public b0(EditorActivity editorActivity0) {
        this.a = editorActivity0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3B8A6294, v, -1, "com.kakao.tistory.presentation.view.editor.EditorActivity.initView.<anonymous>.<anonymous> (EditorActivity.kt:104)");
        }
        Window window0 = this.a.getWindow();
        Intrinsics.checkNotNullExpressionValue(window0, "getWindow(...)");
        DraftBottomSheetKt.DraftBottomSheet(window0, EditorActivity.access$getDraftViewModel(this.a), ((Composer)object0), 72, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

