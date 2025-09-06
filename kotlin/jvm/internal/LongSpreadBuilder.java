package kotlin.jvm.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001A\u00020\u0003*\u00020\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000E\u001A\u00020\u0002¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Lkotlin/jvm/internal/LongSpreadBuilder;", "Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "", "", "size", "<init>", "(I)V", "getSize", "([J)I", "", "value", "", "add", "(J)V", "toArray", "()[J", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class LongSpreadBuilder extends PrimitiveSpreadBuilder {
    public final long[] d;

    public LongSpreadBuilder(int v) {
        super(v);
        this.d = new long[v];
    }

    public final void add(long v) {
        int v1 = this.getPosition();
        this.setPosition(v1 + 1);
        this.d[v1] = v;
    }

    @Override  // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(Object object0) {
        return this.getSize(((long[])object0));
    }

    public int getSize(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return arr_v.length;
    }

    @NotNull
    public final long[] toArray() {
        return (long[])this.toArray(this.d, new long[this.size()]);
    }
}

