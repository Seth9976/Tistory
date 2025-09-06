package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001A\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000E\u0010\u000FJ\u0012\u0010\u0010\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001A\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J<\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001A\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001A\u001A\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001A\u0010\u001BJ\u001A\u0010\u001D\u001A\u00020\u00042\b\u0010\u001C\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001D\u0010\u001ER\"\u0010\u0003\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\r\"\u0004\b\"\u0010#R\"\u0010\u0005\u001A\u00020\u00048\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\u000F\"\u0004\b\'\u0010(R$\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b)\u0010*\u001A\u0004\b+\u0010\u0011\"\u0004\b,\u0010-R$\u0010\t\u001A\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b.\u0010/\u001A\u0004\b0\u0010\u0013\"\u0004\b1\u00102¨\u00063"}, d2 = {"Landroidx/compose/foundation/layout/RowColumnParentData;", "", "", "weight", "", "fill", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisAlignment", "Landroidx/compose/foundation/layout/FlowLayoutData;", "flowLayoutData", "<init>", "(FZLandroidx/compose/foundation/layout/CrossAxisAlignment;Landroidx/compose/foundation/layout/FlowLayoutData;)V", "component1", "()F", "component2", "()Z", "component3", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "component4", "()Landroidx/compose/foundation/layout/FlowLayoutData;", "copy", "(FZLandroidx/compose/foundation/layout/CrossAxisAlignment;Landroidx/compose/foundation/layout/FlowLayoutData;)Landroidx/compose/foundation/layout/RowColumnParentData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getWeight", "setWeight", "(F)V", "b", "Z", "getFill", "setFill", "(Z)V", "c", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisAlignment", "setCrossAxisAlignment", "(Landroidx/compose/foundation/layout/CrossAxisAlignment;)V", "d", "Landroidx/compose/foundation/layout/FlowLayoutData;", "getFlowLayoutData", "setFlowLayoutData", "(Landroidx/compose/foundation/layout/FlowLayoutData;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class RowColumnParentData {
    public static final int $stable = 8;
    public float a;
    public boolean b;
    public CrossAxisAlignment c;
    public FlowLayoutData d;

    public RowColumnParentData() {
        this(0.0f, false, null, null, 15, null);
    }

    public RowColumnParentData(float f, boolean z, @Nullable CrossAxisAlignment crossAxisAlignment0, @Nullable FlowLayoutData flowLayoutData0) {
        this.a = f;
        this.b = z;
        this.c = crossAxisAlignment0;
        this.d = flowLayoutData0;
    }

    public RowColumnParentData(float f, boolean z, CrossAxisAlignment crossAxisAlignment0, FlowLayoutData flowLayoutData0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            z = true;
        }
        if((v & 4) != 0) {
            crossAxisAlignment0 = null;
        }
        if((v & 8) != 0) {
            flowLayoutData0 = null;
        }
        this(f, z, crossAxisAlignment0, flowLayoutData0);
    }

    public final float component1() {
        return this.a;
    }

    public final boolean component2() {
        return this.b;
    }

    @Nullable
    public final CrossAxisAlignment component3() {
        return this.c;
    }

    @Nullable
    public final FlowLayoutData component4() {
        return this.d;
    }

    @NotNull
    public final RowColumnParentData copy(float f, boolean z, @Nullable CrossAxisAlignment crossAxisAlignment0, @Nullable FlowLayoutData flowLayoutData0) {
        return new RowColumnParentData(f, z, crossAxisAlignment0, flowLayoutData0);
    }

    public static RowColumnParentData copy$default(RowColumnParentData rowColumnParentData0, float f, boolean z, CrossAxisAlignment crossAxisAlignment0, FlowLayoutData flowLayoutData0, int v, Object object0) {
        if((v & 1) != 0) {
            f = rowColumnParentData0.a;
        }
        if((v & 2) != 0) {
            z = rowColumnParentData0.b;
        }
        if((v & 4) != 0) {
            crossAxisAlignment0 = rowColumnParentData0.c;
        }
        if((v & 8) != 0) {
            flowLayoutData0 = rowColumnParentData0.d;
        }
        return rowColumnParentData0.copy(f, z, crossAxisAlignment0, flowLayoutData0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RowColumnParentData)) {
            return false;
        }
        if(Float.compare(this.a, ((RowColumnParentData)object0).a) != 0) {
            return false;
        }
        if(this.b != ((RowColumnParentData)object0).b) {
            return false;
        }
        return Intrinsics.areEqual(this.c, ((RowColumnParentData)object0).c) ? Intrinsics.areEqual(this.d, ((RowColumnParentData)object0).d) : false;
    }

    @Nullable
    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.c;
    }

    public final boolean getFill() {
        return this.b;
    }

    @Nullable
    public final FlowLayoutData getFlowLayoutData() {
        return this.d;
    }

    public final float getWeight() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = a.e(Float.hashCode(this.a) * 0x1F, 0x1F, this.b);
        int v1 = 0;
        int v2 = this.c == null ? 0 : this.c.hashCode();
        FlowLayoutData flowLayoutData0 = this.d;
        if(flowLayoutData0 != null) {
            v1 = flowLayoutData0.hashCode();
        }
        return (v + v2) * 0x1F + v1;
    }

    public final void setCrossAxisAlignment(@Nullable CrossAxisAlignment crossAxisAlignment0) {
        this.c = crossAxisAlignment0;
    }

    public final void setFill(boolean z) {
        this.b = z;
    }

    public final void setFlowLayoutData(@Nullable FlowLayoutData flowLayoutData0) {
        this.d = flowLayoutData0;
    }

    public final void setWeight(float f) {
        this.a = f;
    }

    @Override
    @NotNull
    public String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=" + this.d + ')';
    }
}

