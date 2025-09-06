package androidx.compose.material3.internal;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000E\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001F\u0010\n\u001A\u00020\t2\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\f\u001A\u00020\t2\u0006\u0010\u0006\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001F\u0010\u000E\u001A\u00020\t2\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u000E\u0010\u000BJ\u0017\u0010\u000F\u001A\u00020\t2\u0006\u0010\u0006\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u000F\u0010\rR+\u0010\u0016\u001A\u00020\u00012\u0006\u0010\u0010\u001A\u00020\u00018F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0004¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/internal/MutableWindowInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "initialInsets", "<init>", "(Landroidx/compose/foundation/layout/WindowInsets;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "getLeft", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;)I", "getTop", "(Landroidx/compose/ui/unit/Density;)I", "getRight", "getBottom", "<set-?>", "a", "Landroidx/compose/runtime/MutableState;", "getInsets", "()Landroidx/compose/foundation/layout/WindowInsets;", "setInsets", "insets", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMutableWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableWindowInsets.kt\nandroidx/compose/material3/internal/MutableWindowInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,51:1\n81#2:52\n107#2,2:53\n*S KotlinDebug\n*F\n+ 1 MutableWindowInsets.kt\nandroidx/compose/material3/internal/MutableWindowInsets\n*L\n39#1:52\n39#1:53,2\n*E\n"})
public final class MutableWindowInsets implements WindowInsets {
    public static final int $stable;
    public final MutableState a;

    public MutableWindowInsets() {
        this(null, 1, null);
    }

    public MutableWindowInsets(@NotNull WindowInsets windowInsets0) {
        this.a = SnapshotStateKt.mutableStateOf$default(windowInsets0, null, 2, null);
    }

    public MutableWindowInsets(WindowInsets windowInsets0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            windowInsets0 = WindowInsetsKt.WindowInsets(0, 0, 0, 0);
        }
        this(windowInsets0);
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@NotNull Density density0) {
        return this.getInsets().getBottom(density0);
    }

    @NotNull
    public final WindowInsets getInsets() {
        return (WindowInsets)this.a.getValue();
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@NotNull Density density0, @NotNull LayoutDirection layoutDirection0) {
        return this.getInsets().getLeft(density0, layoutDirection0);
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@NotNull Density density0, @NotNull LayoutDirection layoutDirection0) {
        return this.getInsets().getRight(density0, layoutDirection0);
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@NotNull Density density0) {
        return this.getInsets().getTop(density0);
    }

    public final void setInsets(@NotNull WindowInsets windowInsets0) {
        this.a.setValue(windowInsets0);
    }
}

