package com.kakao.tistory.data.repository;

import com.kakao.tistory.domain.entity.PushSetting;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class k3 extends Lambda implements Function1 {
    public static final k3 a;

    static {
        k3.a = new k3();
    }

    public k3() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return Boolean.valueOf(((PushSetting)object0).getEtiquette().getEnable());
    }
}

