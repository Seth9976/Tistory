package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.theme.TTextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o0 extends Lambda implements Function3 {
    public final int a;

    public o0(int v) {
        this.a = v;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$RoundButton");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xCCFDD17C, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.ActionButton.<anonymous> (BlogMainInfo.kt:435)");
        }
        TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(this.a, ((Composer)object1), 0), PaddingKt.padding-VpY3zN4(Modifier.Companion, 24.0f, 9.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize12Weight400(), ((Composer)object1), 0x30, 0x180000, 0xFFFC);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

