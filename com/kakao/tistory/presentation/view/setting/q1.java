package com.kakao.tistory.presentation.view.setting;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q1 extends Lambda implements Function3 {
    public final String a;

    public q1(String s) {
        this.a = s;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$PushItemContainer");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xEA18109B, v, -1, "com.kakao.tistory.presentation.view.setting.SettingPushActivity.TimeItem.<anonymous> (SettingPushActivity.kt:246)");
        }
        TextStyle textStyle0 = MaterialTheme.INSTANCE.getTypography(((Composer)object1), MaterialTheme.$stable).getH5();
        TextUnitKt.checkArithmetic--R2X_6o(0x13DCCCCCDL);
        TextKt.Text--4IGK_g(this.a, null, 0L, 0L, null, null, null, 0x1BDCCCCCDL, null, null, 0L, 2, false, 1, 0, null, textStyle0, ((Composer)object1), 0, 0xC30, 0xD77E);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

