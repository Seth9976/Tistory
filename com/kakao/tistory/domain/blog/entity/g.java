package com.kakao.tistory.domain.blog.entity;

import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.internal.EnumsKt;

public final class g extends Lambda implements Function0 {
    public static final g a;

    static {
        g.a = new g();
    }

    public g() {
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return EnumsKt.createAnnotatedEnumSerializer("com.kakao.tistory.domain.blog.entity.EntryRestrictType", EntryRestrictType.values(), new String[]{"del", "tmp"}, new Annotation[][]{0, 0}, null);
    }
}

