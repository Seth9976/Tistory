package c3;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.StyleableRes;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class i {
    @DoNotInline
    @JvmStatic
    @NotNull
    public static final Typeface a(@NotNull TypedArray typedArray0, @StyleableRes int v) {
        Typeface typeface0 = typedArray0.getFont(v);
        Intrinsics.checkNotNull(typeface0);
        return typeface0;
    }
}

