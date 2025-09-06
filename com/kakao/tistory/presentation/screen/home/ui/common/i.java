package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.DpKt;
import com.kakao.tistory.presentation.theme.TTextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function2 {
    public static final i a;

    static {
        i.a = new i();
    }

    public i() {
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
            ComposerKt.traceEventStart(0xADC45212, v, -1, "com.kakao.tistory.presentation.screen.home.ui.common.ComposableSingletons$SlotGridKt.lambda-4.<anonymous> (SlotGrid.kt:76)");
        }
        SlotGridKt.SlotGrid-8HUqYh0(PaddingKt.padding-3ABfNKs(Modifier.Companion, 20.0f), DpKt.DpSize-YgX7TsA(16.0f, 10.0f), 3, ComposableLambdaKt.rememberComposableLambda(0x5309D3C6, true, new h(TTextStyle.INSTANCE.getSize12Weight400()), ((Composer)object0), 54), ((Composer)object0), 3510, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

