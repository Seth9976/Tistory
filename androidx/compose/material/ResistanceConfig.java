package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Deprecated(message = "Material\'s Swipeable has been replaced by Foundation\'s AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u000B\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001A\u0010\r\u001A\u00020\f2\b\u0010\u000B\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001A\u0004\b\u001A\u0010\u0018R\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u0016\u001A\u0004\b\u001C\u0010\u0018¨\u0006\u001D"}, d2 = {"Landroidx/compose/material/ResistanceConfig;", "", "", "basis", "factorAtMin", "factorAtMax", "<init>", "(FFF)V", "overflow", "computeResistance", "(F)F", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "getBasis", "()F", "b", "getFactorAtMin", "c", "getFactorAtMax", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ResistanceConfig {
    public static final int $stable;
    public final float a;
    public final float b;
    public final float c;

    public ResistanceConfig(float f, float f1, float f2) {
        this.a = f;
        this.b = f1;
        this.c = f2;
    }

    public ResistanceConfig(float f, float f1, float f2, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            f1 = 10.0f;
        }
        if((v & 4) != 0) {
            f2 = 10.0f;
        }
        this(f, f1, f2);
    }

    public final float computeResistance(float f) {
        float f1 = f < 0.0f ? this.b : this.c;
        if(f1 == 0.0f) {
            return 0.0f;
        }
        float f2 = c.coerceIn(f / this.a, -1.0f, 1.0f);
        return this.a / f1 * ((float)Math.sin(f2 * 3.141593f / 2.0f));
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof ResistanceConfig ? this.a == ((ResistanceConfig)object0).a && this.b == ((ResistanceConfig)object0).b && this.c == ((ResistanceConfig)object0).c : false;
    }

    public final float getBasis() {
        return this.a;
    }

    public final float getFactorAtMax() {
        return this.c;
    }

    public final float getFactorAtMin() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Float.hashCode(this.c) + a.b(this.b, Float.hashCode(this.a) * 0x1F, 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ResistanceConfig(basis=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", factorAtMin=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", factorAtMax=");
        return a.n(stringBuilder0, this.c, ')');
    }
}

