package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p0.o2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\"\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001A\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalContentAlpha", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalContentAlpha", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ContentAlphaKt {
    public static final ProvidableCompositionLocal a;

    static {
        ContentAlphaKt.a = CompositionLocalKt.compositionLocalOf$default(null, o2.y, 1, null);
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalContentAlpha() {
        return ContentAlphaKt.a;
    }
}

