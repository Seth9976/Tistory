package com.kakao.tistory.presentation.common.tiara;

import androidx.compose.runtime.State;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.LongRef;

public final class c extends Lambda implements Function1 {
    public final String a;
    public final String b;
    public final String c;
    public final State d;

    public c(String s, String s1, String s2, State state0) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = state0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LifecycleResumePauseEffectScope)object0), "$this$LifecycleResumeEffect");
        LongRef ref$LongRef0 = new LongRef();
        ref$LongRef0.element = System.currentTimeMillis();
        return new TiaraExtensionKt.TrackUsage.1.1.invoke..inlined.onPauseOrDispose.1(((LifecycleResumePauseEffectScope)object0), ref$LongRef0, this.a, this.b, this.c, this.d);
    }
}

