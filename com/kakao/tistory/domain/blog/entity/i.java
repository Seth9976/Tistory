package com.kakao.tistory.domain.blog.entity;

import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.internal.EnumsKt;

public final class i extends Lambda implements Function0 {
    public static final i a;

    static {
        i.a = new i();
    }

    public i() {
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        EntryVisibilityType[] arr_entryVisibilityType = EntryVisibilityType.values();
        Annotation[][] arr2_annotation = {new Annotation[]{new EntryVisibilityType.Companion.annotationImpl.kotlinx_serialization_json_JsonNames.0(new String[]{"reserved_public"})}, new Annotation[]{new EntryVisibilityType.Companion.annotationImpl.kotlinx_serialization_json_JsonNames.0(new String[]{"reserved_protected"})}, null};
        return EnumsKt.createAnnotatedEnumSerializer("com.kakao.tistory.domain.blog.entity.EntryVisibilityType", arr_entryVisibilityType, new String[]{0, 0, 0}, arr2_annotation, null);
    }
}

