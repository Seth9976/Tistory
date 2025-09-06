package com.kakao.tistory.domain.entity.push;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000F\b\u0002\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/kakao/tistory/domain/entity/push/GroupType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "NEW_ENTRY", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum GroupType {
    NEW_ENTRY("entry");

    private static final EnumEntries $ENTRIES;
    private static final GroupType[] $VALUES;
    @NotNull
    private final String value;

    private static final GroupType[] $values() [...] // Inlined contents

    static {
        GroupType.$VALUES = arr_groupType;
        Intrinsics.checkNotNullParameter(arr_groupType, "entries");
        GroupType.$ENTRIES = new a(arr_groupType);
    }

    private GroupType(String s1) {
        this.value = s1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return GroupType.$ENTRIES;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}

