package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterialApi
@Immutable
@Deprecated(message = "Material\'s Swipeable has been replaced by Foundation\'s AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001A\u00020\u0007*\u00020\u00062\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u001D\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001A\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001A"}, d2 = {"Landroidx/compose/material/FixedThreshold;", "Landroidx/compose/material/ThresholdConfig;", "Landroidx/compose/ui/unit/Dp;", "offset", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/Density;", "", "fromValue", "toValue", "computeThreshold", "(Landroidx/compose/ui/unit/Density;FF)F", "copy-0680j_4", "(F)Landroidx/compose/material/FixedThreshold;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FixedThreshold implements ThresholdConfig {
    public static final int $stable;
    public final float a;

    public FixedThreshold(float f, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = f;
    }

    @Override  // androidx.compose.material.ThresholdConfig
    public float computeThreshold(@NotNull Density density0, float f, float f1) {
        return Math.signum(f1 - f) * density0.toPx-0680j_4(this.a) + f;
    }

    @NotNull
    public final FixedThreshold copy-0680j_4(float f) {
        return new FixedThreshold(f, null);
    }

    public static FixedThreshold copy-0680j_4$default(FixedThreshold fixedThreshold0, float f, int v, Object object0) {
        if((v & 1) != 0) {
            f = fixedThreshold0.a;
        }
        return fixedThreshold0.copy-0680j_4(f);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof FixedThreshold ? Dp.equals-impl0(this.a, ((FixedThreshold)object0).a) : false;
    }

    @Override
    public int hashCode() {
        return Dp.hashCode-impl(this.a);
    }

    @Override
    @NotNull
    public String toString() {
        return "FixedThreshold(offset=" + Dp.toString-impl(this.a) + ')';
    }
}

