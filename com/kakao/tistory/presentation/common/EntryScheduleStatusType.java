package com.kakao.tistory.presentation.common;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000E\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/tistory/presentation/common/EntryScheduleStatusType;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "SCHEDULED", "NOT_SCHEDULED", "ONCE_SCHEDULED", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum EntryScheduleStatusType {
    SCHEDULED("scheduled"),
    NOT_SCHEDULED("not_scheduled"),
    ONCE_SCHEDULED("once_scheduled");

    public final String a;
    public static final EntryScheduleStatusType[] b;
    public static final EnumEntries c;

    static {
        EntryScheduleStatusType.b = arr_entryScheduleStatusType;
        Intrinsics.checkNotNullParameter(arr_entryScheduleStatusType, "entries");
        EntryScheduleStatusType.c = new a(arr_entryScheduleStatusType);
    }

    public EntryScheduleStatusType(String s1) {
        this.a = s1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return EntryScheduleStatusType.c;
    }

    @NotNull
    public final String getValue() {
        return this.a;
    }
}

