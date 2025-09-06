package com.kakao.tistory.presentation.view.editor;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.domain.entity.entry.DraftItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function4 {
    public final Function1 a;
    public final Function1 b;

    public v(Function1 function10, Function1 function11) {
        this.a = function10;
        this.b = function11;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        ((Number)object0).intValue();
        int v = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((DraftItem)object1), "item");
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2095621294, v, -1, "com.kakao.tistory.presentation.view.editor.DraftList.<anonymous>.<anonymous>.<anonymous> (DraftBottomSheet.kt:150)");
        }
        DraftBottomSheetKt.DraftItemView(((DraftItem)object1), new t(this.a, ((DraftItem)object1)), new u(this.b, ((DraftItem)object1)), ((Composer)object2), 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

