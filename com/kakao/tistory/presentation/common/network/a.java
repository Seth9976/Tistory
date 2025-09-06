package com.kakao.tistory.presentation.common.network;

import kotlin.jvm.internal.Intrinsics;

public enum a {
    NONE,
    WIFI,
    MOBILE,
    ETC;

    public static final a[] e;

    static {
        a.e = arr_a;
        Intrinsics.checkNotNullParameter(arr_a, "entries");
        new sd.a(arr_a);
    }
}

