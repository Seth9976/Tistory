package kotlin.jvm.internal;

import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\r\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001A\u00020\u0003*\u00028\u0000H$¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00028\u0000¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u0004\u001A\u00020\u0003H\u0004¢\u0006\u0004\b\u0004\u0010\rJ\u001F\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00028\u0000H\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001A\u00020\u00038\u0004@\u0004X\u0084\u000E¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u0006¨\u0006\u0017"}, d2 = {"Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "", "T", "", "size", "<init>", "(I)V", "getSize", "(Ljava/lang/Object;)I", "spreadArgument", "", "addSpread", "(Ljava/lang/Object;)V", "()I", "values", "result", "toArray", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "b", "I", "getPosition", "setPosition", "position", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class PrimitiveSpreadBuilder {
    public final int a;
    public int b;
    public final Object[] c;

    public PrimitiveSpreadBuilder(int v) {
        this.a = v;
        this.c = new Object[v];
    }

    public final void addSpread(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "spreadArgument");
        int v = this.b;
        this.b = v + 1;
        this.c[v] = object0;
    }

    public final int getPosition() {
        return this.b;
    }

    public abstract int getSize(@NotNull Object arg1);

    public final void setPosition(int v) {
        this.b = v;
    }

    public final int size() {
        int v = 0;
        IntIterator intIterator0 = new IntRange(0, this.a - 1).iterator();
        while(intIterator0.hasNext()) {
            Object object0 = this.c[intIterator0.nextInt()];
            v += (object0 == null ? 1 : this.getSize(object0));
        }
        return v;
    }

    @NotNull
    public final Object toArray(@NotNull Object object0, @NotNull Object object1) {
        Intrinsics.checkNotNullParameter(object0, "values");
        Intrinsics.checkNotNullParameter(object1, "result");
        int v = this.a;
        int v1 = 0;
        int v2 = 0;
        IntIterator intIterator0 = new IntRange(0, v - 1).iterator();
        while(intIterator0.hasNext()) {
            int v3 = intIterator0.nextInt();
            Object object2 = this.c[v3];
            if(object2 != null) {
                if(v1 < v3) {
                    int v4 = v3 - v1;
                    System.arraycopy(object0, v1, object1, v2, v4);
                    v2 += v4;
                }
                int v5 = this.getSize(object2);
                System.arraycopy(object2, 0, object1, v2, v5);
                v2 += v5;
                v1 = v3 + 1;
            }
        }
        if(v1 < v) {
            System.arraycopy(object0, v1, object1, v2, v - v1);
        }
        return object1;
    }
}

