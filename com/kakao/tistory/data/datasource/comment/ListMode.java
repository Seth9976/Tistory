package com.kakao.tistory.data.datasource.comment;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000E\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/tistory/data/datasource/comment/ListMode;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "INIT", "COMMENT", "PREV", "NEXT", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum ListMode {
    INIT("init"),
    COMMENT("comment"),
    PREV("prev"),
    NEXT("next");

    public final String a;
    public static final ListMode[] b;
    public static final EnumEntries c;

    static {
        ListMode.b = arr_listMode;
        Intrinsics.checkNotNullParameter(arr_listMode, "entries");
        ListMode.c = new a(arr_listMode);
    }

    public ListMode(String s1) {
        this.a = s1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return ListMode.c;
    }

    @NotNull
    public final String getValue() {
        return this.a;
    }
}

