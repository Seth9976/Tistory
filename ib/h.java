package ib;

import com.kakao.kemoticon.EmoticonRepository.Pack.Companion;
import com.kakao.kemoticon.EmoticonRepositoryKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import sd.a;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class h extends Enum {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public static final EmoticonRepository.Pack.Companion f;
    public static final enum h g;
    public static final enum h h;
    public static final enum h i;
    public static final enum h j;
    public static final h[] k;
    public static final EnumEntries l;

    static {
        h.g = new h("FRIENDS1", 0, "friends1", "gif", 120, 0x30);
        h.h = new h("NINIZ", 1, "niniz", "gif", 120, 0x30);
        h.i = new h("FRIENDS2", 2, "friends2", "png", 120, 88);
        h.j = new h("FACE", 3, "face", "png", 80, 74);
        h[] arr_h = {h.g, h.h, h.i, h.j, new h("FROG", 4, "frog", "png", 120, 30), new h("CHALLENGE", 5, "challenge", "png", 120, 20)};
        h.k = arr_h;
        Intrinsics.checkNotNullParameter(arr_h, "entries");
        h.l = new a(arr_h);
        h.f = new EmoticonRepository.Pack.Companion(null);
    }

    public h(String s, int v, String s1, String s2, int v1, int v2) {
        super(s, v);
        this.a = s1;
        this.b = s2;
        this.c = v1;
        this.d = v2;
        this.e = EmoticonRepositoryKt.toEmoticonSizeType(v1);
    }

    public static h valueOf(String s) {
        return (h)Enum.valueOf(h.class, s);
    }

    public static h[] values() {
        return (h[])h.k.clone();
    }
}

