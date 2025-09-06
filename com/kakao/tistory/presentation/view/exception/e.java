package com.kakao.tistory.presentation.view.exception;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function3 {
    public final Integer a;

    public e(Integer integer0) {
        this.a = integer0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$Button");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-407579947, v, -1, "com.kakao.tistory.presentation.view.exception.TistoryGuideActivity.GuideBody.<anonymous>.<anonymous> (TistoryGuideActivity.kt:134)");
        }
        ((Composer)object1).startReplaceGroup(-1031377390);
        String s = this.a == null ? null : StringResources_androidKt.stringResource(this.a.intValue(), ((Composer)object1), 0);
        ((Composer)object1).endReplaceGroup();
        if(s == null) {
            s = "";
        }
        TextKt.Text--4IGK_g(s, null, 0xFFFFFFFF00000000L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.getTypography().getButton(), ((Composer)object1), 0x180, 0, 0xFFFA);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

