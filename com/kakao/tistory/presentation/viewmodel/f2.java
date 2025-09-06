package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.utils.CrashlyticsUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f2 extends Lambda implements Function1 {
    public static final f2 a;

    static {
        f2.a = new f2();
    }

    public f2() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Logger.INSTANCE.log("Login : Kakao -> error");
        Intrinsics.checkNotNull(((Throwable)object0));
        CrashlyticsUtils.INSTANCE.logException(((Throwable)object0));
        return Unit.INSTANCE;
    }
}

