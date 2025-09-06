package kotlin.collections;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\t\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00028\u0000HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ*\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00028\u0000HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001A\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u000B¨\u0006\u001C"}, d2 = {"Lkotlin/collections/IndexedValue;", "T", "", "", "index", "value", "<init>", "(ILjava/lang/Object;)V", "component1", "()I", "component2", "()Ljava/lang/Object;", "copy", "(ILjava/lang/Object;)Lkotlin/collections/IndexedValue;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getIndex", "b", "Ljava/lang/Object;", "getValue", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class IndexedValue {
    public final int a;
    public final Object b;

    public IndexedValue(int v, Object object0) {
        this.a = v;
        this.b = object0;
    }

    public final int component1() {
        return this.a;
    }

    public final Object component2() {
        return this.b;
    }

    @NotNull
    public final IndexedValue copy(int v, Object object0) {
        return new IndexedValue(v, object0);
    }

    public static IndexedValue copy$default(IndexedValue indexedValue0, int v, Object object0, int v1, Object object1) {
        if((v1 & 1) != 0) {
            v = indexedValue0.a;
        }
        if((v1 & 2) != 0) {
            object0 = indexedValue0.b;
        }
        return indexedValue0.copy(v, object0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof IndexedValue)) {
            return false;
        }
        return this.a == ((IndexedValue)object0).a ? Intrinsics.areEqual(this.b, ((IndexedValue)object0).b) : false;
    }

    public final int getIndex() {
        return this.a;
    }

    public final Object getValue() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.b == null ? this.a * 0x1F : this.a * 0x1F + this.b.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ')';
    }
}

