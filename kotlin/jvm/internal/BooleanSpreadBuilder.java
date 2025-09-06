package kotlin.jvm.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001A\u00020\u0003*\u00020\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000E\u001A\u00020\u0002¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Lkotlin/jvm/internal/BooleanSpreadBuilder;", "Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "", "", "size", "<init>", "(I)V", "getSize", "([Z)I", "", "value", "", "add", "(Z)V", "toArray", "()[Z", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BooleanSpreadBuilder extends PrimitiveSpreadBuilder {
    public final boolean[] d;

    public BooleanSpreadBuilder(int v) {
        super(v);
        this.d = new boolean[v];
    }

    public final void add(boolean z) {
        int v = this.getPosition();
        this.setPosition(v + 1);
        this.d[v] = z;
    }

    @Override  // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(Object object0) {
        return this.getSize(((boolean[])object0));
    }

    public int getSize(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        return arr_z.length;
    }

    @NotNull
    public final boolean[] toArray() {
        return (boolean[])this.toArray(this.d, new boolean[this.size()]);
    }
}

