package com.kakao.tistory.domain.blog.entity;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/kakao/tistory/domain/blog/entity/EntryCategoryVisibilityType;", "", "", "a", "I", "getValue", "()I", "value", "PUBLIC", "PRIVATE", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum EntryCategoryVisibilityType {
    PUBLIC(20),
    PRIVATE(0);

    public final int a;
    public static final EntryCategoryVisibilityType[] b;
    public static final EnumEntries c;

    static {
        EntryCategoryVisibilityType.b = arr_entryCategoryVisibilityType;
        Intrinsics.checkNotNullParameter(arr_entryCategoryVisibilityType, "entries");
        EntryCategoryVisibilityType.c = new a(arr_entryCategoryVisibilityType);
    }

    public EntryCategoryVisibilityType(int v1) {
        this.a = v1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return EntryCategoryVisibilityType.c;
    }

    public final int getValue() {
        return this.a;
    }
}

