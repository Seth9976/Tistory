package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import ce.e;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Deprecated(message = "Not necessary with the introduction of Slider state")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FR7\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028F@@X\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u001D\u001A\u00020\u00052\u0006\u0010\u0010\u001A\u00020\u00058F@@X\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u001C¨\u0006\u001E"}, d2 = {"Landroidx/compose/material3/SliderPositions;", "", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "initialActiveRange", "", "initialTickFractions", "<init>", "(Lkotlin/ranges/ClosedFloatingPointRange;[F)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "<set-?>", "a", "Landroidx/compose/runtime/MutableState;", "getActiveRange", "()Lkotlin/ranges/ClosedFloatingPointRange;", "setActiveRange$material3_release", "(Lkotlin/ranges/ClosedFloatingPointRange;)V", "activeRange", "b", "getTickFractions", "()[F", "setTickFractions$material3_release", "([F)V", "tickFractions", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderPositions\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2263:1\n81#2:2264\n107#2,2:2265\n81#2:2267\n107#2,2:2268\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderPositions\n*L\n1898#1:2264\n1898#1:2265,2\n1906#1:2267\n1906#1:2268,2\n*E\n"})
public final class SliderPositions {
    public static final int $stable;
    public final MutableState a;
    public final MutableState b;

    public SliderPositions() {
        this(null, null, 3, null);
    }

    public SliderPositions(@NotNull ClosedFloatingPointRange closedFloatingPointRange0, @NotNull float[] arr_f) {
        this.a = SnapshotStateKt.mutableStateOf$default(closedFloatingPointRange0, null, 2, null);
        this.b = SnapshotStateKt.mutableStateOf$default(arr_f, null, 2, null);
    }

    public SliderPositions(ClosedFloatingPointRange closedFloatingPointRange0, float[] arr_f, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            closedFloatingPointRange0 = e.rangeTo(0.0f, 1.0f);
        }
        if((v & 2) != 0) {
            arr_f = new float[0];
        }
        this(closedFloatingPointRange0, arr_f);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SliderPositions)) {
            return false;
        }
        return Intrinsics.areEqual(this.getActiveRange(), ((SliderPositions)object0).getActiveRange()) ? Arrays.equals(this.getTickFractions(), ((SliderPositions)object0).getTickFractions()) : false;
    }

    @NotNull
    public final ClosedFloatingPointRange getActiveRange() {
        return (ClosedFloatingPointRange)this.a.getValue();
    }

    @NotNull
    public final float[] getTickFractions() {
        return (float[])this.b.getValue();
    }

    @Override
    public int hashCode() {
        int v = this.getActiveRange().hashCode();
        return Arrays.hashCode(this.getTickFractions()) + v * 0x1F;
    }

    public final void setActiveRange$material3_release(@NotNull ClosedFloatingPointRange closedFloatingPointRange0) {
        this.a.setValue(closedFloatingPointRange0);
    }

    public final void setTickFractions$material3_release(@NotNull float[] arr_f) {
        this.b.setValue(arr_f);
    }
}

