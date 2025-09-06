package com.kakao.kandinsky.resize;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.kandinsky.designsystem.common.FeatureBottomBarKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function2 {
    public static final a w;

    static {
        a.w = new a(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x2BB482B, v, -1, "com.kakao.kandinsky.resize.ComposableSingletons$ReSizeScreenKt.lambda-5.<anonymous> (ReSizeScreen.kt:295)");
        }
        FeatureBottomBarKt.BottomBarFeatureTypeText(StringResources_androidKt.stringResource(string.resize_feature_name, ((Composer)object0), 0), false, false, null, ((Composer)object0), 0x30, 12);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

