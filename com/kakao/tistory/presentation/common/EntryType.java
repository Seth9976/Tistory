package com.kakao.tistory.presentation.common;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000E\n\u0002\b\u000B\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000Bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/common/EntryType;", "", "", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "type", "POST", "NOTICE", "PAGE", "TEMPLATE", "KEYWORD", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum EntryType {
    POST("post"),
    NOTICE("notice"),
    PAGE("page"),
    TEMPLATE("template"),
    KEYWORD("keyword");

    public final String a;
    public static final EntryType[] b;
    public static final EnumEntries c;

    static {
        EntryType.b = arr_entryType;
        Intrinsics.checkNotNullParameter(arr_entryType, "entries");
        EntryType.c = new a(arr_entryType);
    }

    public EntryType(String s1) {
        this.a = s1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return EntryType.c;
    }

    @NotNull
    public final String getType() {
        return this.a;
    }
}

