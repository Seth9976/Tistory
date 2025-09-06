package com.kakao.tistory.presentation.view.setting.secretLab;

import kotlin.jvm.internal.Intrinsics;
import sd.a;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class c extends Enum {
    public static final c[] a;

    static {
        c[] arr_c = {new c("Main", 0, "Main"), new c("ServerType", 1, "SeverType")};
        c.a = arr_c;
        Intrinsics.checkNotNullParameter(arr_c, "entries");
        new a(arr_c);
    }

    public c(String s, int v, String s1) {
        super(s, v);
    }

    public static c valueOf(String s) {
        return (c)Enum.valueOf(c.class, s);
    }

    public static c[] values() {
        return (c[])c.a.clone();
    }
}

