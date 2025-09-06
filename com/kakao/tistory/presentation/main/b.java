package com.kakao.tistory.presentation.main;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.widget.dialog.DialogFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function4 {
    public static final b a;

    static {
        b.a = new b();
    }

    public b() {
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((DialogFactory)object0), "$this$DialogHandler");
        Intrinsics.checkNotNullParameter(((MainAppDialogEvent)object1), "it");
        int v1 = (v & 14) == 0 ? (((Composer)object2).changed(((DialogFactory)object0)) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (((Composer)object2).changed(((MainAppDialogEvent)object1)) ? 0x20 : 16);
        }
        if((v1 & 731) == 0x92 && ((Composer)object2).getSkipping()) {
            ((Composer)object2).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(600394764, v1, -1, "com.kakao.tistory.presentation.main.ComposableSingletons$MainAppKt.lambda-1.<anonymous> (MainApp.kt:132)");
        }
        if(((MainAppDialogEvent)object1) instanceof ShowOk) {
            String s = ((ShowOk)(((MainAppDialogEvent)object1))).getTitle();
            String s1 = ((ShowOk)(((MainAppDialogEvent)object1))).getMessage();
            ((Composer)object2).startReplaceGroup(0x68798AC8);
            a a0 = ((Composer)object2).rememberedValue();
            if((v1 & 14) == 4 || a0 == Composer.Companion.getEmpty()) {
                a0 = new a(((DialogFactory)object0));
                ((Composer)object2).updateRememberedValue(a0);
            }
            ((Composer)object2).endReplaceGroup();
            ((DialogFactory)object0).ShowOk(s, s1, 0, false, a0, null, ((Composer)object2), v1 << 18 & 0x380000, 44);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

