package com.kakao.kandinsky.selector;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function3 {
    public static final a w;

    static {
        a.w = new a(3);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$TextButton");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1FEA6B6F, v, -1, "com.kakao.kandinsky.selector.ComposableSingletons$MultipleImageSelectorKt.lambda-2.<anonymous> (MultipleImageSelector.kt:109)");
        }
        String s = StringResources_androidKt.stringResource(string.selector_cancel, ((Composer)object1), 0);
        TextStyle textStyle0 = MaterialTheme.INSTANCE.getTypography(((Composer)object1), MaterialTheme.$stable).getHeadlineSmall();
        TextKt.Text--4IGK_g(s, null, MaterialTheme.INSTANCE.getColorScheme(((Composer)object1), MaterialTheme.$stable).getOnTertiaryContainer-0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, ((Composer)object1), 0, 0, 0xFFFA);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

