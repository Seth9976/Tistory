package com.kakao.tistory.domain.entity.viewtype;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000F\b\u0002\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/tistory/domain/entity/viewtype/SearchResultViewType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "EMPTY", "TOP", "POST", "TAG", "BLOG", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum SearchResultViewType {
    EMPTY(0),
    TOP(1),
    POST(2),
    TAG(3),
    BLOG(4);

    private static final EnumEntries $ENTRIES;
    private static final SearchResultViewType[] $VALUES;
    private final int value;

    private static final SearchResultViewType[] $values() [...] // Inlined contents

    static {
        SearchResultViewType.$VALUES = arr_searchResultViewType;
        Intrinsics.checkNotNullParameter(arr_searchResultViewType, "entries");
        SearchResultViewType.$ENTRIES = new a(arr_searchResultViewType);
    }

    private SearchResultViewType(int v1) {
        this.value = v1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return SearchResultViewType.$ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}

