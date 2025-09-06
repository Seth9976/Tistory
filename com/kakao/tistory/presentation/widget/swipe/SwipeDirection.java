package com.kakao.tistory.presentation.widget.swipe;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/widget/swipe/SwipeDirection;", "", "Start", "Default", "End", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum SwipeDirection {
    Start,
    Default,
    End;

    public static final SwipeDirection[] a;
    public static final EnumEntries b;

    static {
        SwipeDirection.a = arr_swipeDirection;
        Intrinsics.checkNotNullParameter(arr_swipeDirection, "entries");
        SwipeDirection.b = new a(arr_swipeDirection);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return SwipeDirection.b;
    }
}

