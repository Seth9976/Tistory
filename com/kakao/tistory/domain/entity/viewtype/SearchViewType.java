package com.kakao.tistory.domain.entity.viewtype;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000F\b\u0002\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/tistory/domain/entity/viewtype/SearchViewType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "EMPTY", "TOP", "KEYWORD", "BOTTOM", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum SearchViewType {
    EMPTY(0),
    TOP(1),
    KEYWORD(2),
    BOTTOM(3);

    private static final EnumEntries $ENTRIES;
    private static final SearchViewType[] $VALUES;
    private final int value;

    private static final SearchViewType[] $values() [...] // Inlined contents

    static {
        SearchViewType.$VALUES = arr_searchViewType;
        Intrinsics.checkNotNullParameter(arr_searchViewType, "entries");
        SearchViewType.$ENTRIES = new a(arr_searchViewType);
    }

    private SearchViewType(int v1) {
        this.value = v1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return SearchViewType.$ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}

