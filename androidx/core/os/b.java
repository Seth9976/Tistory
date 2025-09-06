package androidx.core.os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.DoNotInline;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class b {
    @DoNotInline
    @JvmStatic
    public static final void a(@NotNull Bundle bundle0, @NotNull String s, @Nullable Size size0) {
        bundle0.putSize(s, size0);
    }

    @DoNotInline
    @JvmStatic
    public static final void b(@NotNull Bundle bundle0, @NotNull String s, @Nullable SizeF sizeF0) {
        bundle0.putSizeF(s, sizeF0);
    }
}

