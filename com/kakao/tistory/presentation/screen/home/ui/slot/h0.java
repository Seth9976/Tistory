package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Creator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h0 extends Lambda implements Function2 {
    public final Creator a;
    public final MutableState b;
    public final MutableState c;

    public h0(Creator homeSlotUiState$Creator0, MutableState mutableState0, MutableState mutableState1) {
        this.a = homeSlotUiState$Creator0;
        this.b = mutableState0;
        this.c = mutableState1;
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
            ComposerKt.traceEventStart(0x8035C60D, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.Creator.<anonymous>.<anonymous> (Creator.kt:98)");
        }
        String s = this.a.getTitle();
        String s1 = this.a.getEmoji();
        ((Composer)object0).startReplaceGroup(0x3337C474);
        MutableState mutableState0 = this.b;
        f0 f00 = ((Composer)object0).rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(f00 == composer$Companion0.getEmpty()) {
            f00 = new f0(mutableState0);
            ((Composer)object0).updateRememberedValue(f00);
        }
        ((Composer)object0).endReplaceGroup();
        ((Composer)object0).startReplaceGroup(859294807);
        MutableState mutableState1 = this.c;
        g0 g00 = ((Composer)object0).rememberedValue();
        if(g00 == composer$Companion0.getEmpty()) {
            g00 = new g0(mutableState1);
            ((Composer)object0).updateRememberedValue(g00);
        }
        ((Composer)object0).endReplaceGroup();
        CreatorKt.access$CreatorTitle(s, s1, f00, g00, ((Composer)object0), 0xD80);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

