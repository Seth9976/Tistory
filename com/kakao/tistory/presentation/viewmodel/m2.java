package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.appinfo.Step1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class m2 extends Lambda implements Function1 {
    public static final m2 a;

    static {
        m2.a = new m2();
    }

    public m2() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((Step1)object0) == null ? false : Boolean.valueOf(((Step1)object0).getHideOldAccountLoginButton());
    }
}

