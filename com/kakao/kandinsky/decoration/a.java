package com.kakao.kandinsky.decoration;

import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.PainterResources_androidKt;
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
            ComposerKt.traceEventStart(0x676E5FFB, v, -1, "com.kakao.kandinsky.decoration.ComposableSingletons$ControlKt.lambda-1.<anonymous> (Control.kt:66)");
        }
        ImageKt.Image(PainterResources_androidKt.painterResource(drawable.toolbox_delete, ((Composer)object0), 0), null, null, null, null, 0.0f, null, ((Composer)object0), 56, 0x7C);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

