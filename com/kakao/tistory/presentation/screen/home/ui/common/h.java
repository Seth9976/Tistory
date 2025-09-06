package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.TextStyle;
import com.kakao.tistory.presentation.common.utils.ScaleUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function2 {
    public final TextStyle a;

    public h(TextStyle textStyle0) {
        this.a = textStyle0;
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
            ComposerKt.traceEventStart(0x5309D3C6, v, -1, "com.kakao.tistory.presentation.screen.home.ui.common.ComposableSingletons$SlotGridKt.lambda-4.<anonymous>.<anonymous> (SlotGrid.kt:83)");
        }
        TextStyle textStyle0 = this.a;
        for(int v1 = 0; v1 < 4; ++v1) {
            ComposableSingletons.SlotGridKt.lambda-4.1.1.1.1 composableSingletons$SlotGridKt$lambda-4$1$1$1$10 = v1 == 0 ? new ComposableSingletons.SlotGridKt.lambda-4.1.1.1.1() : SlotGridKt.a;
            float f = ScaleUtilsKt.lineHeightToDp(textStyle0, ((Composer)object0), 6);
            SlotGridKt.SlotGridItem-xfPyhaw(composableSingletons$SlotGridKt$lambda-4$1$1$1$10, false, ComposableLambdaKt.rememberComposableLambda(0xDBCA0580, true, new g(textStyle0), ((Composer)object0), 54), f, 0L, ((Composer)object0), 0x180, 18);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

