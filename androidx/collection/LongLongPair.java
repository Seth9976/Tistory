package androidx.collection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001A\u00020\u0002H\u0086\n¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002H\u0086\n¢\u0006\u0004\b\t\u0010\bJ\u001A\u0010\f\u001A\u00020\u000B2\b\u0010\n\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\bR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001A\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Landroidx/collection/LongLongPair;", "", "", "first", "second", "<init>", "(JJ)V", "component1", "()J", "component2", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "getFirst", "b", "getSecond", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LongLongPair {
    public final long a;
    public final long b;

    public LongLongPair(long v, long v1) {
        this.a = v;
        this.b = v1;
    }

    public final long component1() {
        return this.getFirst();
    }

    public final long component2() {
        return this.getSecond();
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof LongLongPair ? ((LongLongPair)object0).a == this.a && ((LongLongPair)object0).b == this.b : false;
    }

    public final long getFirst() {
        return this.a;
    }

    public final long getSecond() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(this.a) ^ Long.hashCode(this.b);
    }

    @Override
    @NotNull
    public String toString() {
        return "(" + this.a + ", " + this.b + ')';
    }
}

