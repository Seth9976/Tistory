package androidx.compose.ui.semantics;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import ce.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u000F\b\u0007\u0018\u0000 \u001E2\u00020\u0001:\u0001\u001EB\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001A\u0010\f\u001A\u00020\u000B2\b\u0010\n\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u001D\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001AR\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u000F¨\u0006\u001F"}, d2 = {"Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "", "", "current", "Lkotlin/ranges/ClosedFloatingPointRange;", "range", "", "steps", "<init>", "(FLkotlin/ranges/ClosedFloatingPointRange;I)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "getCurrent", "()F", "b", "Lkotlin/ranges/ClosedFloatingPointRange;", "getRange", "()Lkotlin/ranges/ClosedFloatingPointRange;", "c", "I", "getSteps", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/ProgressBarRangeInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1617:1\n1#2:1618\n*E\n"})
public final class ProgressBarRangeInfo {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/semantics/ProgressBarRangeInfo$Companion;", "", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "Indeterminate", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "getIndeterminate", "()Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final ProgressBarRangeInfo getIndeterminate() {
            return ProgressBarRangeInfo.d;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final float a;
    public final ClosedFloatingPointRange b;
    public final int c;
    public static final ProgressBarRangeInfo d;

    static {
        ProgressBarRangeInfo.Companion = new Companion(null);
        ProgressBarRangeInfo.d = new ProgressBarRangeInfo(0.0f, e.rangeTo(0.0f, 0.0f), 0, 4, null);
    }

    public ProgressBarRangeInfo(float f, @NotNull ClosedFloatingPointRange closedFloatingPointRange0, int v) {
        this.a = f;
        this.b = closedFloatingPointRange0;
        this.c = v;
        if(Float.isNaN(f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public ProgressBarRangeInfo(float f, ClosedFloatingPointRange closedFloatingPointRange0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(f, closedFloatingPointRange0, v);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ProgressBarRangeInfo)) {
            return false;
        }
        return this.a == ((ProgressBarRangeInfo)object0).a && Intrinsics.areEqual(this.b, ((ProgressBarRangeInfo)object0).b) ? this.c == ((ProgressBarRangeInfo)object0).c : false;
    }

    public final float getCurrent() {
        return this.a;
    }

    @NotNull
    public final ClosedFloatingPointRange getRange() {
        return this.b;
    }

    public final int getSteps() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return (this.b.hashCode() + Float.hashCode(this.a) * 0x1F) * 0x1F + this.c;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ProgressBarRangeInfo(current=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", range=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", steps=");
        return b.p(stringBuilder0, this.c, ')');
    }
}

