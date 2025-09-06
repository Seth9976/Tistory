package com.kakao.tistory.presentation.main;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import com.kakao.tistory.presentation.main.ui.MainBottomBarKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function2 {
    public final MainAppState a;
    public final State b;

    public m(MainAppState mainAppState0, State state0) {
        this.a = mainAppState0;
        this.b = state0;
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
            ComposerKt.traceEventStart(0x95C32CB5, v, -1, "com.kakao.tistory.presentation.main.MainApp.<anonymous>.<anonymous>.<anonymous> (MainApp.kt:71)");
        }
        if(this.a.getShowBottomBar(((Composer)object0), 0)) {
            List list0 = this.a.getMainDestinations();
            ((Composer)object0).startReplaceGroup(0xE69E2043);
            boolean z = ((Composer)object0).changed(this.a);
            MainAppState mainAppState0 = this.a;
            j j0 = ((Composer)object0).rememberedValue();
            if(z || j0 == Composer.Companion.getEmpty()) {
                j0 = new j(mainAppState0);
                ((Composer)object0).updateRememberedValue(j0);
            }
            ((Composer)object0).endReplaceGroup();
            ((Composer)object0).startReplaceGroup(0xE69E3B4D);
            boolean z1 = ((Composer)object0).changed(this.b);
            State state0 = this.b;
            k k0 = ((Composer)object0).rememberedValue();
            if(z1 || k0 == Composer.Companion.getEmpty()) {
                k0 = new k(state0);
                ((Composer)object0).updateRememberedValue(k0);
            }
            ((Composer)object0).endReplaceGroup();
            ((Composer)object0).startReplaceGroup(-425830033);
            boolean z2 = ((Composer)object0).changed(this.a);
            MainAppState mainAppState1 = this.a;
            l l0 = ((Composer)object0).rememberedValue();
            if(z2 || l0 == Composer.Companion.getEmpty()) {
                l0 = new l(mainAppState1);
                ((Composer)object0).updateRememberedValue(l0);
            }
            ((Composer)object0).endReplaceGroup();
            MainBottomBarKt.MainBottomBar(list0, j0, k0, l0, this.a.getCurrentMainDestinationState(((Composer)object0), 0), MainAppKt.access$MainApp$lambda$0(this.b).getCurrentBlog(), MainAppKt.access$MainApp$lambda$0(this.b).getNotificationCount(), ((Composer)object0), 0x40008, 0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

