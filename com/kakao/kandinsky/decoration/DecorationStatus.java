package com.kakao.kandinsky.decoration;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/kandinsky/decoration/DecorationStatus;", "", "Selected", "Enabled", "Disabled", "OnlyView", "decoration_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum DecorationStatus {
    Selected,
    Enabled,
    Disabled,
    OnlyView;

    public static final DecorationStatus[] a;
    public static final EnumEntries b;

    static {
        DecorationStatus.a = arr_decorationStatus;
        Intrinsics.checkNotNullParameter(arr_decorationStatus, "entries");
        DecorationStatus.b = new a(arr_decorationStatus);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return DecorationStatus.b;
    }
}

