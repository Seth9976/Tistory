package com.kakao.tistory.domain.blog.entity;

import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.internal.EnumsKt;

public final class f extends Lambda implements Function0 {
    public static final f a;

    static {
        f.a = new f();
    }

    public f() {
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return EnumsKt.createAnnotatedEnumSerializer("com.kakao.tistory.domain.blog.entity.BlogStatusType", BlogStatusType.values(), new String[]{"open", "closed", "del", "tmp"}, new Annotation[][]{0, 0, 0, 0}, null);
    }
}

