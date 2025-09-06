package com.kakao.keditor.plugin.attrs.item;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/item/Location;", "", "Ljava/io/Serializable;", "(Ljava/lang/String;I)V", "UPLOADED", "LOCAL", "FAILED", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum Location implements Serializable {
    UPLOADED,
    LOCAL,
    FAILED;

    private static final EnumEntries $ENTRIES;
    private static final Location[] $VALUES;

    private static final Location[] $values() [...] // Inlined contents

    static {
        Location.$VALUES = arr_location;
        Intrinsics.checkNotNullParameter(arr_location, "entries");
        Location.$ENTRIES = new a(arr_location);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return Location.$ENTRIES;
    }
}

