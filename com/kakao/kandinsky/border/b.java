package com.kakao.kandinsky.border;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.kandinsky.designsystem.common.FeatureBottomBarKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function2 {
    public static final b w;

    static {
        b.w = new b(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB30BFA8D, v, -1, "com.kakao.kandinsky.border.ComposableSingletons$BorderScreenKt.lambda-1.<anonymous> (BorderScreen.kt:53)");
        }
        FeatureBottomBarKt.BottomBarFeatureTypeText(StringResources_androidKt.stringResource(string.border_feature_name, ((Composer)object0), 0), false, false, null, ((Composer)object0), 0x30, 12);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

