package com.kakao.tistory.presentation.screen.home;

import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.presentation.widget.common.RoundButtonDefaults.ButtonColors;
import com.kakao.tistory.presentation.widget.common.RoundButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function3 {
    public final Function0 a;

    public n(Function0 function00) {
        this.a = function00;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$TistoryTopAppBar");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF7726695, v, -1, "com.kakao.tistory.presentation.screen.home.HomeTopAppBar.<anonymous> (HomeScreen.kt:151)");
        }
        ButtonColors roundButtonDefaults$ButtonColors0 = new ButtonColors(0L, 0L, 0L, 0L, 0L, 0L, 56, null);
        PaddingValues paddingValues0 = PaddingKt.PaddingValues-YgX7TsA(12.0f, 6.0f);
        Modifier modifier0 = OffsetKt.offset-VpY3zN4$default(Modifier.Companion, -12.0f, 0.0f, 2, null);
        ((Composer)object1).startReplaceGroup(0x5E7CF790);
        boolean z = ((Composer)object1).changed(this.a);
        Function0 function00 = this.a;
        m m0 = ((Composer)object1).rememberedValue();
        if(z || m0 == Composer.Companion.getEmpty()) {
            m0 = new m(function00);
            ((Composer)object1).updateRememberedValue(m0);
        }
        ((Composer)object1).endReplaceGroup();
        RoundButtonKt.RoundButton(m0, null, roundButtonDefaults$ButtonColors0, modifier0, null, null, false, null, paddingValues0, ComposableSingletons.HomeScreenKt.INSTANCE.getLambda-1$presentation_prodRelease(), ((Composer)object1), 0x36000D80, 0xF2);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

