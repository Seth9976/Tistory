package androidx.compose.ui.text.android;

import android.text.StaticLayout.Builder;
import androidx.annotation.DoNotInline;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

public abstract class n {
    @DoNotInline
    @JvmStatic
    public static final void a(@NotNull StaticLayout.Builder staticLayout$Builder0, boolean z) {
        staticLayout$Builder0.setUseLineSpacingFromFallbacks(z);
    }
}

