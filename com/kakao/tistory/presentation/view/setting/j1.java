package com.kakao.tistory.presentation.view.setting;

import androidx.compose.runtime.State;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j1 extends Lambda implements Function1 {
    public final String a;
    public final SettingPushItem b;
    public final boolean c;
    public final State d;

    public j1(String s, SettingPushItem settingPushItem0, boolean z, State state0) {
        this.a = s;
        this.b = settingPushItem0;
        this.c = z;
        this.d = state0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((SemanticsPropertyReceiver)object0), "$this$semantics");
        i1 i10 = new i1(this.b, this.c, this.d);
        SemanticsPropertiesKt.onClick(((SemanticsPropertyReceiver)object0), this.a, i10);
        return Unit.INSTANCE;
    }
}

