package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001R\u0011\u0010\u0005\u001A\u00020\u00028G¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/ScaffoldDefaults;", "", "Landroidx/compose/foundation/layout/WindowInsets;", "getContentWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "contentWindowInsets", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ScaffoldDefaults {
    public static final int $stable;
    @NotNull
    public static final ScaffoldDefaults INSTANCE;

    static {
        ScaffoldDefaults.INSTANCE = new ScaffoldDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Composable
    @JvmName(name = "getContentWindowInsets")
    @NotNull
    public final WindowInsets getContentWindowInsets(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x2D20CC2C, v, -1, "androidx.compose.material3.ScaffoldDefaults.<get-contentWindowInsets> (Scaffold.kt:292)");
        }
        WindowInsets windowInsets0 = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsets0;
    }
}

