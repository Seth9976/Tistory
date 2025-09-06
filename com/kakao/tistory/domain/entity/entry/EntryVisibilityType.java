package com.kakao.tistory.domain.entity.entry;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nj\u0002\b\u000Bj\u0002\b\fj\u0002\b\rj\u0002\b\u000E¨\u0006\u000F"}, d2 = {"Lcom/kakao/tistory/domain/entity/entry/EntryVisibilityType;", "", "value", "", "intType", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getIntType", "()I", "getValue", "()Ljava/lang/String;", "PUBLIC", "CONNECTED", "PROTECTED", "PRIVATE", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum EntryVisibilityType {
    @SerializedName(alternate = {"PUBLIC", "public"}, value = "PUBLIC")
    PUBLIC("public", 20),
    @SerializedName(alternate = {"CONNECTED", "connected"}, value = "CONNECTED")
    CONNECTED("connected", -1),
    @SerializedName(alternate = {"PROTECTED", "protected"}, value = "PROTECTED")
    PROTECTED("protected", 15),
    @SerializedName(alternate = {"PRIVATE", "private"}, value = "PRIVATE")
    PRIVATE("private", 0);

    private static final EnumEntries $ENTRIES;
    private static final EntryVisibilityType[] $VALUES;
    private final int intType;
    @NotNull
    private final String value;

    private static final EntryVisibilityType[] $values() [...] // Inlined contents

    static {
        EntryVisibilityType.$VALUES = arr_entryVisibilityType;
        Intrinsics.checkNotNullParameter(arr_entryVisibilityType, "entries");
        EntryVisibilityType.$ENTRIES = new a(arr_entryVisibilityType);
    }

    private EntryVisibilityType(String s1, int v1) {
        this.value = s1;
        this.intType = v1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return EntryVisibilityType.$ENTRIES;
    }

    public final int getIntType() {
        return this.intType;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}

