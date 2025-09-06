package kotlin.jvm.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001A\u00020\u0003*\u00020\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\u0003¢\u0006\u0004\b\u000B\u0010\u0006J\r\u0010\f\u001A\u00020\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Lkotlin/jvm/internal/IntSpreadBuilder;", "Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "", "", "size", "<init>", "(I)V", "getSize", "([I)I", "value", "", "add", "toArray", "()[I", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class IntSpreadBuilder extends PrimitiveSpreadBuilder {
    public final int[] d;

    public IntSpreadBuilder(int v) {
        super(v);
        this.d = new int[v];
    }

    public final void add(int v) {
        int v1 = this.getPosition();
        this.setPosition(v1 + 1);
        this.d[v1] = v;
    }

    @Override  // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(Object object0) {
        return this.getSize(((int[])object0));
    }

    public int getSize(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return arr_v.length;
    }

    @NotNull
    public final int[] toArray() {
        return (int[])this.toArray(this.d, new int[this.size()]);
    }
}

