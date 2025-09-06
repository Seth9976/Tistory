package androidx.compose.foundation;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import u.g2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\"(\u0010\b\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001A\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/foundation/OverscrollConfiguration;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalOverscrollConfiguration", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalOverscrollConfiguration$annotations", "()V", "LocalOverscrollConfiguration", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class OverscrollConfiguration_androidKt {
    public static final ProvidableCompositionLocal a;

    static {
        OverscrollConfiguration_androidKt.a = CompositionLocalKt.compositionLocalOf$default(null, g2.y, 1, null);
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final ProvidableCompositionLocal getLocalOverscrollConfiguration() {
        return OverscrollConfiguration_androidKt.a;
    }

    @ExperimentalFoundationApi
    public static void getLocalOverscrollConfiguration$annotations() {
    }
}

