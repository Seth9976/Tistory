package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class m extends l {
    @NotNull
    public static final StringBuilder append(@NotNull StringBuilder stringBuilder0, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(stringBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "value");
        for(int v = 0; v < arr_object.length; ++v) {
            stringBuilder0.append(arr_object[v]);
        }
        return stringBuilder0;
    }

    @NotNull
    public static StringBuilder append(@NotNull StringBuilder stringBuilder0, @NotNull String[] arr_s) {
        Intrinsics.checkNotNullParameter(stringBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(arr_s, "value");
        for(int v = 0; v < arr_s.length; ++v) {
            stringBuilder0.append(arr_s[v]);
        }
        return stringBuilder0;
    }
}

