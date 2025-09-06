package kotlinx.collections.immutable.internal;

import a5.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001A\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\u0005¨\u0006\u0019"}, d2 = {"Lkotlinx/collections/immutable/internal/DeltaCounter;", "", "", "count", "<init>", "(I)V", "that", "", "plusAssign", "component1", "()I", "copy", "(I)Lkotlinx/collections/immutable/internal/DeltaCounter;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getCount", "setCount", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DeltaCounter {
    public int a;

    public DeltaCounter() {
        this(0, 1, null);
    }

    public DeltaCounter(int v) {
        this.a = v;
    }

    public DeltaCounter(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        this(v);
    }

    public final int component1() {
        return this.a;
    }

    @NotNull
    public final DeltaCounter copy(int v) {
        return new DeltaCounter(v);
    }

    public static DeltaCounter copy$default(DeltaCounter deltaCounter0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = deltaCounter0.a;
        }
        return deltaCounter0.copy(v);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof DeltaCounter ? this.a == ((DeltaCounter)object0).a : false;
    }

    public final int getCount() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    public final void plusAssign(int v) {
        this.a += v;
    }

    public final void setCount(int v) {
        this.a = v;
    }

    @Override
    @NotNull
    public String toString() {
        return b.p(new StringBuilder("DeltaCounter(count="), this.a, ')');
    }
}

