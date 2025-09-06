package androidx.compose.runtime.tooling;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import j1.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0006\"%\u0010\u0007\u001A\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "Landroidx/compose/runtime/tooling/CompositionData;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalInspectionTables", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalInspectionTables", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class InspectionTablesKt {
    public static final ProvidableCompositionLocal a;

    static {
        InspectionTablesKt.a = CompositionLocalKt.staticCompositionLocalOf(a.w);
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalInspectionTables() {
        return InspectionTablesKt.a;
    }
}

