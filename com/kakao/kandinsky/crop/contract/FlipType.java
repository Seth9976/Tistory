package com.kakao.kandinsky.crop.contract;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/kakao/kandinsky/crop/contract/FlipType;", "", "Horizontal", "Vertical", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum FlipType {
    Horizontal,
    Vertical;

    public static final FlipType[] a;
    public static final EnumEntries b;

    static {
        FlipType.a = arr_flipType;
        Intrinsics.checkNotNullParameter(arr_flipType, "entries");
        FlipType.b = new a(arr_flipType);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return FlipType.b;
    }
}

