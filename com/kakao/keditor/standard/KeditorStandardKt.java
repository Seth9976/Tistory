package com.kakao.keditor.standard;

import android.graphics.Color;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0010\u000E\n\u0002\b\u0003\u001A;\u0010\u0000\u001A\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00032\u0006\u0010\u0004\u001A\u0002H\u00022\b\u0010\u0005\u001A\u0004\u0018\u0001H\u0001¢\u0006\u0002\u0010\u0006\u001A\u001B\u0010\u0007\u001A\u00020\b*\u00020\t2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000B¨\u0006\f"}, d2 = {"getOr", "V", "K", "", "key", "default", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "toColorInt", "", "", "defaultColor", "(Ljava/lang/String;Ljava/lang/Integer;)I", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class KeditorStandardKt {
    @Nullable
    public static final Object getOr(@NotNull Map map0, Object object0, @Nullable Object object1) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        return !map0.containsKey(object0) || map0.get(object0) == null ? object1 : map0.get(object0);
    }

    public static final int toColorInt(@NotNull String s, @Nullable Integer integer0) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        try {
            return Color.parseColor(s);
        }
        catch(Exception unused_ex) {
            return integer0 == null ? 0xFF000000 : ((int)integer0);
        }
    }

    public static int toColorInt$default(String s, Integer integer0, int v, Object object0) {
        if((v & 1) != 0) {
            integer0 = null;
        }
        return KeditorStandardKt.toColorInt(s, integer0);
    }
}

