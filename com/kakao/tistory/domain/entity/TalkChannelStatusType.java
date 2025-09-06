package com.kakao.tistory.domain.entity;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/tistory/domain/entity/TalkChannelStatusType;", "", "(Ljava/lang/String;I)V", "NONE", "ADDED", "BLOCKED", "UNDEFINED", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum TalkChannelStatusType {
    NONE,
    ADDED,
    BLOCKED,
    UNDEFINED;

    private static final EnumEntries $ENTRIES;
    private static final TalkChannelStatusType[] $VALUES;

    private static final TalkChannelStatusType[] $values() [...] // Inlined contents

    static {
        TalkChannelStatusType.$VALUES = arr_talkChannelStatusType;
        Intrinsics.checkNotNullParameter(arr_talkChannelStatusType, "entries");
        TalkChannelStatusType.$ENTRIES = new a(arr_talkChannelStatusType);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return TalkChannelStatusType.$ENTRIES;
    }
}

