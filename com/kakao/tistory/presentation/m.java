package com.kakao.tistory.presentation;

import com.kakao.kandinsky.launcher.KandinskyBuilder.ServiceInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function1 {
    public static final m a;

    static {
        m.a = new m();
    }

    public m() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ServiceInfo)object0), "$this$serviceInfo");
        ((ServiceInfo)object0).setDebug(false);
        ((ServiceInfo)object0).setServiceKey("tistory-app");
        ((ServiceInfo)object0).setServiceDomain("tistory.com");
        ((ServiceInfo)object0).setServiceVersionName("3.0.8");
        return Unit.INSTANCE;
    }
}

