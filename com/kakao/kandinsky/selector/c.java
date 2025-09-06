package com.kakao.kandinsky.selector;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function3 {
    public final boolean w;

    public c(boolean z) {
        this.w = z;
        super(3);
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
            ComposerKt.traceEventStart(246064337, v, -1, "com.kakao.kandinsky.selector.BottomBar.<anonymous>.<anonymous> (MultipleImageSelector.kt:147)");
        }
        Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 7.0f, 0.0f, 10, null);
        IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource((this.w ? drawable.icon_check_ok : drawable.icon_check_all_off), ((Composer)object1), 0), null, modifier0, 0L, ((Composer)object1), 0xDB8, 0);
        String s = StringResources_androidKt.stringResource(string.multiple_selector_all, ((Composer)object1), 0);
        TextStyle textStyle0 = MaterialTheme.INSTANCE.getTypography(((Composer)object1), MaterialTheme.$stable).getBodyLarge();
        TextKt.Text--4IGK_g(s, null, MaterialTheme.INSTANCE.getColorScheme(((Composer)object1), MaterialTheme.$stable).getOnSecondary-0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, ((Composer)object1), 0, 0, 0xFFFA);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

