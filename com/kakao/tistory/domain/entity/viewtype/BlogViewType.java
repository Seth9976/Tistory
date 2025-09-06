package com.kakao.tistory.domain.entity.viewtype;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000F\b\u0002\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/tistory/domain/entity/viewtype/BlogViewType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "TOP", "NOTICE", "CATEGORY", "ENTRY", "EMPTY", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum BlogViewType {
    TOP(0),
    NOTICE(1),
    CATEGORY(2),
    ENTRY(3),
    EMPTY(4);

    private static final EnumEntries $ENTRIES;
    private static final BlogViewType[] $VALUES;
    private final int value;

    private static final BlogViewType[] $values() [...] // Inlined contents

    static {
        BlogViewType.$VALUES = arr_blogViewType;
        Intrinsics.checkNotNullParameter(arr_blogViewType, "entries");
        BlogViewType.$ENTRIES = new a(arr_blogViewType);
    }

    private BlogViewType(int v1) {
        this.value = v1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return BlogViewType.$ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}

