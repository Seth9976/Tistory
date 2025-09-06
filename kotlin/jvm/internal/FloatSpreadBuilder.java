package kotlin.jvm.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001A\u00020\u0003*\u00020\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000E\u001A\u00020\u0002¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Lkotlin/jvm/internal/FloatSpreadBuilder;", "Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "", "", "size", "<init>", "(I)V", "getSize", "([F)I", "", "value", "", "add", "(F)V", "toArray", "()[F", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FloatSpreadBuilder extends PrimitiveSpreadBuilder {
    public final float[] d;

    public FloatSpreadBuilder(int v) {
        super(v);
        this.d = new float[v];
    }

    public final void add(float f) {
        int v = this.getPosition();
        this.setPosition(v + 1);
        this.d[v] = f;
    }

    @Override  // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(Object object0) {
        return this.getSize(((float[])object0));
    }

    public int getSize(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return arr_f.length;
    }

    @NotNull
    public final float[] toArray() {
        return (float[])this.toArray(this.d, new float[this.size()]);
    }
}

