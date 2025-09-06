package com.kakao.tistory.presentation.theme;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function2 {
    public final TextSelectionColors a;
    public final Function2 b;

    public i(TextSelectionColors textSelectionColors0, Function2 function20) {
        this.a = textSelectionColors0;
        this.b = function20;
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
            ComposerKt.traceEventStart(0x70FC733F, v, -1, "com.kakao.tistory.presentation.theme.TistoryTheme.<anonymous> (TistoryTheme.kt:45)");
        }
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{TextSelectionColorsKt.getLocalTextSelectionColors().provides(this.a), CompositionLocalsKt.getLocalDensity().provides(DensityKt.Density(((Density)((Composer)object0).consume(CompositionLocalsKt.getLocalDensity())).getDensity(), 1.0f))}, this.b, ((Composer)object0), ProvidedValue.$stable);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

