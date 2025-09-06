package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\t\"\u0004\b\u001B\u0010\u001CR\"\u0010\u0005\u001A\u00020\u00048\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010\u000B\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "", "", "time", "", "dataPoint", "<init>", "(JF)V", "component1", "()J", "component2", "()F", "copy", "(JF)Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getTime", "setTime", "(J)V", "b", "F", "getDataPoint", "setDataPoint", "(F)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DataPointAtTime {
    public static final int $stable = 8;
    public long a;
    public float b;

    public DataPointAtTime(long v, float f) {
        this.a = v;
        this.b = f;
    }

    public final long component1() {
        return this.a;
    }

    public final float component2() {
        return this.b;
    }

    @NotNull
    public final DataPointAtTime copy(long v, float f) {
        return new DataPointAtTime(v, f);
    }

    public static DataPointAtTime copy$default(DataPointAtTime dataPointAtTime0, long v, float f, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = dataPointAtTime0.a;
        }
        if((v1 & 2) != 0) {
            f = dataPointAtTime0.b;
        }
        return dataPointAtTime0.copy(v, f);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DataPointAtTime)) {
            return false;
        }
        return this.a == ((DataPointAtTime)object0).a ? Float.compare(this.b, ((DataPointAtTime)object0).b) == 0 : false;
    }

    public final float getDataPoint() {
        return this.b;
    }

    public final long getTime() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return Float.hashCode(this.b) + Long.hashCode(this.a) * 0x1F;
    }

    public final void setDataPoint(float f) {
        this.b = f;
    }

    public final void setTime(long v) {
        this.a = v;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("DataPointAtTime(time=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", dataPoint=");
        return a.n(stringBuilder0, this.b, ')');
    }
}

