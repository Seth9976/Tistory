package androidx.compose.ui.text.android;

import android.text.StaticLayout.Builder;
import android.text.StaticLayout;
import androidx.activity.n;
import androidx.annotation.DoNotInline;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

public abstract class o {
    @DoNotInline
    @JvmStatic
    public static final boolean a(@NotNull StaticLayout staticLayout0) {
        return staticLayout0.isFallbackLineSpacingEnabled();
    }

    @DoNotInline
    @JvmStatic
    public static final void b(@NotNull StaticLayout.Builder staticLayout$Builder0, int v, int v1) {
        staticLayout$Builder0.setLineBreakConfig(n.e().setLineBreakStyle(v).setLineBreakWordStyle(v1).build());
    }
}

