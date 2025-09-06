package y3;

import android.content.Context;
import androidx.annotation.DoNotInline;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class c {
    @DoNotInline
    @JvmStatic
    public static final boolean a(@NotNull Context context0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(s, "name");
        return context0.deleteSharedPreferences(s);
    }
}

