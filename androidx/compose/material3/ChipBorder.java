package androidx.compose.material3;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Immutable
@Deprecated(level = DeprecationLevel.WARNING, message = "Maintained for binary compatibility. Use the chipBorder functions instead")
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001F\u0010\u000F\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000B2\u0006\u0010\n\u001A\u00020\tH\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u001A\u0010\u0011\u001A\u00020\t2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0014\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/ChipBorder;", "", "Landroidx/compose/ui/graphics/Color;", "borderColor", "disabledBorderColor", "Landroidx/compose/ui/unit/Dp;", "borderWidth", "<init>", "(JJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/BorderStroke;", "borderStroke$material3_release", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "borderStroke", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ChipBorder {
    public static final int $stable;
    public final long a;
    public final long b;
    public final float c;

    public ChipBorder(long v, long v1, float f, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = f;
    }

    @Composable
    @NotNull
    public final State borderStroke$material3_release(boolean z, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x7139ED50, v, -1, "androidx.compose.material3.ChipBorder.borderStroke (Chip.kt:2733)");
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(BorderStrokeKt.BorderStroke-cXLIe8U(this.c, (z ? this.a : this.b)), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || !(object0 instanceof ChipBorder) || !Color.equals-impl0(this.a, ((ChipBorder)object0).a)) {
            return false;
        }
        return Color.equals-impl0(this.b, ((ChipBorder)object0).b) ? Dp.equals-impl0(this.c, ((ChipBorder)object0).c) : false;
    }

    @Override
    public int hashCode() {
        return Dp.hashCode-impl(this.c) + a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F);
    }
}

