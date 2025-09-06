package com.kakao.tistory.presentation.widget.common;

import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q0 extends Lambda implements Function3 {
    public static final q0 a;

    static {
        q0.a = new q0();
    }

    public q0() {
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((FlowRowScope)object0), "$this$FlowRow");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(13970885, v, -1, "com.kakao.tistory.presentation.widget.common.ComposableSingletons$TistoryChipKt.lambda-1.<anonymous> (TistoryChip.kt:34)");
        }
        TistoryChipKt.TistoryChip(null, null, null, true, null, null, ((Composer)object1), 0xC00, 55);
        TistoryChipKt.TistoryChip(null, null, null, false, null, null, ((Composer)object1), 0xC00, 55);
        TistoryChipKt.TistoryChip(0x1080037, null, null, true, null, null, ((Composer)object1), 0xC06, 54);
        TistoryChipKt.TistoryChip(0x1080037, null, null, false, null, null, ((Composer)object1), 0xC06, 54);
        TistoryChipKt.TistoryChip(0x1080037, null, null, true, null, null, ((Composer)object1), 0xC36, 52);
        TistoryChipKt.TistoryChip(0x1080037, null, null, false, null, null, ((Composer)object1), 0xC36, 52);
        TistoryChipKt.TistoryChip(0x1080033, 0x1080037, null, true, null, null, ((Composer)object1), 0xC36, 52);
        TistoryChipKt.TistoryChip(0x1080033, 0x1080037, null, false, null, null, ((Composer)object1), 0xC36, 52);
        TistoryChipKt.TistoryChip(null, null, "Label11", true, null, o0.a, ((Composer)object1), 200064, 19);
        TistoryChipKt.TistoryChip(null, null, "Label11", false, null, p0.a, ((Composer)object1), 200064, 19);
        TistoryChipKt.TistoryChip(0x1080037, null, "Label", true, null, null, ((Composer)object1), 0xD86, 50);
        TistoryChipKt.TistoryChip(0x1080037, null, "Label", false, null, null, ((Composer)object1), 0xD86, 50);
        TistoryChipKt.TistoryChip(0x1080037, null, "Label", false, null, null, ((Composer)object1), 0xD86, 50);
        TistoryChipKt.TistoryChip(0x1080037, null, "Label", false, null, null, ((Composer)object1), 0xD86, 50);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

