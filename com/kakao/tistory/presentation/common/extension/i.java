package com.kakao.tistory.presentation.common.extension;

import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function1 {
    public final FragmentActivity a;
    public final String b;
    public final long c;
    public final Integer d;

    public i(FragmentActivity fragmentActivity0, String s, long v, Integer integer0) {
        this.a = fragmentActivity0;
        this.b = s;
        this.c = v;
        this.d = integer0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "it");
        NavigatorExtensionKt.goToEntryView(this.a, this.b, this.c, ((String)object0), null, this.d);
        return Unit.INSTANCE;
    }
}

