package com.kakao.tistory.domain.blog.entity;

import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.internal.EnumsKt;

public final class h extends Lambda implements Function0 {
    public static final h a;

    static {
        h.a = new h();
    }

    public h() {
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return EnumsKt.createAnnotatedEnumSerializer("com.kakao.tistory.domain.blog.entity.EntryScheduleStatusType", EntryScheduleStatusType.values(), new String[]{"scheduled", "not_scheduled", "once_scheduled"}, new Annotation[][]{0, 0, 0}, null);
    }
}

