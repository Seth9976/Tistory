package com.kakao.tistory.presentation.screen.home.tiara;

import kotlin.jvm.internal.Intrinsics;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class a extends Enum {
    public static final a[] a;

    static {
        a[] arr_a = {new a("TODAY", 0, "투데이", "커버"), new a("BEST", 1, "인기", "TOP5"), new a("CATEGORY", 2, "인기"), new a("CREATOR", 3, "크리에이터", "추천"), new a("SUBSCRIPTION", 4, "크리에이터", "구독급상승"), new a("SUPPORT", 5, "크리에이터", "응원"), new a("FOCUS", 6, "섹션"), new a("TIP", 7, "팁", "글")};
        a.a = arr_a;
        Intrinsics.checkNotNullParameter(arr_a, "entries");
        new sd.a(arr_a);
    }

    public a(String s, int v, String s1) {
        super(s, v);
    }

    public a(String s, int v, String s1, String s2) {
        super(s, v);
    }

    public static a valueOf(String s) {
        return (a)Enum.valueOf(a.class, s);
    }

    public static a[] values() {
        return (a[])a.a.clone();
    }
}

