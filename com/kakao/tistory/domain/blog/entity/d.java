package com.kakao.tistory.domain.blog.entity;

import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.internal.EnumsKt;

public final class d extends Lambda implements Function0 {
    public static final d a;

    static {
        d.a = new d();
    }

    public d() {
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return EnumsKt.createAnnotatedEnumSerializer("com.kakao.tistory.domain.blog.entity.BlogProfileStatus", BlogProfileStatus.values(), new String[]{"normal", "tmp", "del"}, new Annotation[][]{0, 0, 0}, null);
    }
}

