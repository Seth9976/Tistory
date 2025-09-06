package com.kakao.tistory.presentation.screen.home;

import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.kakao.tistory.presentation.common.CommonCompositionLocalKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function2 {
    public final State a;
    public final TopAppBarScrollBehavior b;
    public final String c;
    public final Function0 d;
    public final Function0 e;
    public final MutableState f;

    public k(State state0, TopAppBarScrollBehavior topAppBarScrollBehavior0, String s, Function0 function00, Function0 function01, MutableState mutableState0) {
        this.a = state0;
        this.b = topAppBarScrollBehavior0;
        this.c = s;
        this.d = function00;
        this.e = function01;
        this.f = mutableState0;
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
            ComposerKt.traceEventStart(0x29568D43, v, -1, "com.kakao.tistory.presentation.screen.home.HomeScreen.<anonymous> (HomeScreen.kt:73)");
        }
        boolean z = ((Boolean)((Composer)object0).consume(CommonCompositionLocalKt.getLocalRefreshingState())).booleanValue();
        ((Composer)object0).startReplaceGroup(790002870);
        boolean z1 = ((Composer)object0).changed(this.a);
        State state0 = this.a;
        e e0 = ((Composer)object0).rememberedValue();
        if(z1 || e0 == Composer.Companion.getEmpty()) {
            e0 = new e(state0);
            ((Composer)object0).updateRememberedValue(e0);
        }
        ((Composer)object0).endReplaceGroup();
        PullToRefreshKt.PullToRefreshBox(z, e0, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(0x982338A9, true, new j(this.b, this.c, this.d, this.e, this.a, this.f), ((Composer)object0), 54), ((Composer)object0), 0x180000, 60);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

