package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0012\u001A\u00020\u00112\b\u0010\u0010\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\u0005¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutData;", "", "", "fillCrossAxisFraction", "<init>", "(F)V", "component1", "()F", "copy", "(F)Landroidx/compose/foundation/layout/FlowLayoutData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getFillCrossAxisFraction", "setFillCrossAxisFraction", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FlowLayoutData {
    public static final int $stable = 8;
    public float a;

    public FlowLayoutData(float f) {
        this.a = f;
    }

    public final float component1() {
        return this.a;
    }

    @NotNull
    public final FlowLayoutData copy(float f) {
        return new FlowLayoutData(f);
    }

    public static FlowLayoutData copy$default(FlowLayoutData flowLayoutData0, float f, int v, Object object0) {
        if((v & 1) != 0) {
            f = flowLayoutData0.a;
        }
        return flowLayoutData0.copy(f);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof FlowLayoutData ? Float.compare(this.a, ((FlowLayoutData)object0).a) == 0 : false;
    }

    public final float getFillCrossAxisFraction() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return Float.hashCode(this.a);
    }

    public final void setFillCrossAxisFraction(float f) {
        this.a = f;
    }

    @Override
    @NotNull
    public String toString() {
        return a.n(new StringBuilder("FlowLayoutData(fillCrossAxisFraction="), this.a, ')');
    }
}

