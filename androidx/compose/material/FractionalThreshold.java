package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@ExperimentalMaterialApi
@Immutable
@Deprecated(message = "Material\'s Swipeable has been replaced by Foundation\'s AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001A\u00020\u0002*\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001A\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/material/FractionalThreshold;", "Landroidx/compose/material/ThresholdConfig;", "", "fraction", "<init>", "(F)V", "Landroidx/compose/ui/unit/Density;", "fromValue", "toValue", "computeThreshold", "(Landroidx/compose/ui/unit/Density;FF)F", "copy", "(F)Landroidx/compose/material/FractionalThreshold;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FractionalThreshold implements ThresholdConfig {
    public static final int $stable;
    public final float a;

    public FractionalThreshold(float f) {
        this.a = f;
    }

    @Override  // androidx.compose.material.ThresholdConfig
    public float computeThreshold(@NotNull Density density0, float f, float f1) {
        return this.a * f1 + (1.0f - this.a) * f;
    }

    @NotNull
    public final FractionalThreshold copy(float f) {
        return new FractionalThreshold(f);
    }

    public static FractionalThreshold copy$default(FractionalThreshold fractionalThreshold0, float f, int v, Object object0) {
        if((v & 1) != 0) {
            f = fractionalThreshold0.a;
        }
        return fractionalThreshold0.copy(f);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof FractionalThreshold ? Float.compare(this.a, ((FractionalThreshold)object0).a) == 0 : false;
    }

    @Override
    public int hashCode() {
        return Float.hashCode(this.a);
    }

    @Override
    @NotNull
    public String toString() {
        return a.n(new StringBuilder("FractionalThreshold(fraction="), this.a, ')');
    }
}

