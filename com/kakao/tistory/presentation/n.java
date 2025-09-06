package com.kakao.tistory.presentation;

import com.kakao.kandinsky.launcher.KandinskyBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function1 {
    public static final n a;

    static {
        n.a = new n();
    }

    public n() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((KandinskyBuilder)object0), "$this$kandinsky");
        ((KandinskyBuilder)object0).imageLibrary(k.a);
        ((KandinskyBuilder)object0).bitmapLoader(l.a);
        ((KandinskyBuilder)object0).serviceInfo(m.a);
        return Unit.INSTANCE;
    }
}

