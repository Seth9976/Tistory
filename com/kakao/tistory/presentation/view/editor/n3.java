package com.kakao.tistory.presentation.view.editor;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class n3 extends Lambda implements Function1 {
    public static final n3 a;

    static {
        n3.a = new n3();
    }

    public n3() {
        super(1);
    }

    public static String a(String s) {
        Intrinsics.checkNotNullParameter(s, "it");
        return "#" + s;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return n3.a(((String)object0));
    }
}

