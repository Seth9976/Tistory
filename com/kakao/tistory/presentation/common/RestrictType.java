package com.kakao.tistory.presentation.common;

import com.kakao.tistory.presentation.R.string;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000B\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u0017\u0010\u0010\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000E\u0010\n\u001A\u0004\b\u000F\u0010\fj\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/presentation/common/RestrictType;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "", "b", "I", "getTitleStringId", "()I", "titleStringId", "c", "getEntryMessageStringId", "entryMessageStringId", "ADMIN_DELETE", "TEMPORARY", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum RestrictType {
    ADMIN_DELETE("del", string.label_entry_restricted_admin_delete_title, string.label_entry_restricted_admin_delete_message),
    TEMPORARY("tmp", string.label_entry_restricted_temporary_title, string.label_entry_restricted_temporary_message);

    public final String a;
    public final int b;
    public final int c;
    public static final RestrictType[] d;
    public static final EnumEntries e;

    static {
        RestrictType.d = arr_restrictType;
        Intrinsics.checkNotNullParameter(arr_restrictType, "entries");
        RestrictType.e = new a(arr_restrictType);
    }

    public RestrictType(String s1, int v1, int v2) {
        this.a = s1;
        this.b = v1;
        this.c = v2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return RestrictType.e;
    }

    public final int getEntryMessageStringId() {
        return this.c;
    }

    public final int getTitleStringId() {
        return this.b;
    }

    @NotNull
    public final String getValue() {
        return this.a;
    }
}

