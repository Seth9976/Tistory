package com.kakao.tistory.domain.blog.entity;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.internal.EnumsKt;

public final class e extends Lambda implements Function0 {
    public static final e a;

    static {
        e.a = new e();
    }

    public e() {
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return EnumsKt.createSimpleEnumSerializer("com.kakao.tistory.domain.blog.entity.BlogRoleType", BlogRoleType.values());
    }
}

