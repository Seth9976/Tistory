package com.kakao.tistory.data.repository;

import com.kakao.tistory.domain.entity.appinfo.AppInfo;
import com.kakao.tistory.domain.entity.appinfo.Extra;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function1 {
    public static final q a;

    static {
        q.a = new q();
    }

    public q() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Extra extra0 = ((AppInfo)object0).getExtra();
        return extra0 != null ? extra0.getStep1() : null;
    }
}

