package com.kakao.tistory.domain.blog.entity;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonNames;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class EntryVisibilityType.Companion.annotationImpl.kotlinx_serialization_json_JsonNames.0 implements JsonNames {
    public final String[] a;

    public EntryVisibilityType.Companion.annotationImpl.kotlinx_serialization_json_JsonNames.0(@NotNull String[] arr_s) {
        Intrinsics.checkNotNullParameter(arr_s, "names");
        super();
        this.a = arr_s;
    }

    @Override
    public final Class annotationType() {
        return JsonNames.class;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(@Nullable Object object0) {
        return object0 instanceof JsonNames ? Arrays.equals(this.names(), ((JsonNames)object0).names()) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a) ^ 0x17AFCCB8;
    }

    @Override  // kotlinx.serialization.json.JsonNames
    public final String[] names() {
        return this.a;
    }

    @Override
    @NotNull
    public final String toString() {
        return a.d("@kotlinx.serialization.json.JsonNames(names=", Arrays.toString(this.a), ")");
    }
}

