package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@ExperimentalMaterialApi
@Immutable
@Deprecated(message = "Material\'s Swipeable has been replaced by Foundation\'s AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\r\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001F\u0012\u0006\u0010\u0003\u001A\u00028\u0000\u0012\u0006\u0010\u0004\u001A\u00028\u0000\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001A\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001A\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C¨\u0006\u001D"}, d2 = {"Landroidx/compose/material/SwipeProgress;", "T", "", "from", "to", "", "fraction", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;F)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Object;", "getFrom", "()Ljava/lang/Object;", "b", "getTo", "c", "F", "getFraction", "()F", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SwipeProgress {
    public static final int $stable;
    public final Object a;
    public final Object b;
    public final float c;

    public SwipeProgress(Object object0, Object object1, float f) {
        this.a = object0;
        this.b = object1;
        this.c = f;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SwipeProgress)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((SwipeProgress)object0).a)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((SwipeProgress)object0).b) ? this.c == ((SwipeProgress)object0).c : false;
    }

    public final float getFraction() {
        return this.c;
    }

    public final Object getFrom() {
        return this.a;
    }

    public final Object getTo() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        Object object0 = this.b;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return Float.hashCode(this.c) + (v1 * 0x1F + v) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("SwipeProgress(from=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", to=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", fraction=");
        return a.n(stringBuilder0, this.c, ')');
    }
}

