package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class r {
    @DoNotInline
    @JvmStatic
    public static final void a(@NotNull PersistableBundle persistableBundle0, @Nullable String s, boolean z) {
        persistableBundle0.putBoolean(s, z);
    }

    @DoNotInline
    @JvmStatic
    public static final void b(@NotNull PersistableBundle persistableBundle0, @Nullable String s, @NotNull boolean[] arr_z) {
        persistableBundle0.putBooleanArray(s, arr_z);
    }
}

