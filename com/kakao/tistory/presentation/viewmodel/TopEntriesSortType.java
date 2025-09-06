package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.presentation.R.string;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/TopEntriesSortType;", "", "", "a", "I", "getTitleRes", "()I", "titleRes", "VIEW", "LIKE", "COMMENT", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum TopEntriesSortType {
    VIEW(string.top_entries_sort_by_view),
    LIKE(string.top_entries_sort_by_like),
    COMMENT(string.top_entries_sort_by_comment);

    public final int a;
    public static final TopEntriesSortType[] b;
    public static final EnumEntries c;

    static {
        TopEntriesSortType.b = arr_topEntriesSortType;
        Intrinsics.checkNotNullParameter(arr_topEntriesSortType, "entries");
        TopEntriesSortType.c = new a(arr_topEntriesSortType);
    }

    public TopEntriesSortType(int v1) {
        this.a = v1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return TopEntriesSortType.c;
    }

    public final int getTitleRes() {
        return this.a;
    }
}

