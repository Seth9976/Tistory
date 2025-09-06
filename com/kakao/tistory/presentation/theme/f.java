package com.kakao.tistory.presentation.theme;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.room.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function3 {
    public final Function0 a;

    public f(Function0 function00) {
        this.a = function00;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = a.c(((Number)object2), ((Modifier)object0), "$this$composed", ((Composer)object1), 0xA3344DF3);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA3344DF3, v, -1, "com.kakao.tistory.presentation.theme.noRippleClickable.<anonymous> (Modifier.kt:49)");
        }
        ((Composer)object1).startReplaceGroup(0xDF02AF44);
        MutableInteractionSource mutableInteractionSource0 = ((Composer)object1).rememberedValue();
        if(mutableInteractionSource0 == Composer.Companion.getEmpty()) {
            mutableInteractionSource0 = InteractionSourceKt.MutableInteractionSource();
            ((Composer)object1).updateRememberedValue(mutableInteractionSource0);
        }
        ((Composer)object1).endReplaceGroup();
        Modifier modifier0 = ClickableKt.clickable-O2vRcR0$default(((Modifier)object0), mutableInteractionSource0, null, false, null, null, this.a, 28, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceGroup();
        return modifier0;
    }
}

