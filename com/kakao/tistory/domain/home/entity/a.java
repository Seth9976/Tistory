package com.kakao.tistory.domain.home.entity;

import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.internal.ObjectSerializer;

public final class a extends Lambda implements Function0 {
    public static final a a;

    static {
        a.a = new a();
    }

    public a() {
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Annotation[] arr_annotation = {new HomeSlot.Today..serializer.annotationImpl.kotlinx_serialization_json_JsonClassDiscriminator.0("slotType")};
        return new ObjectSerializer("com.kakao.tistory.domain.home.entity.HomeSlot.Unknown", Unknown.INSTANCE, arr_annotation);
    }
}

