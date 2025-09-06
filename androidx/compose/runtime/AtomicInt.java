package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\n\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000E\u0010\u0005\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u0003J\b\u0010\u0007\u001A\u00020\bH\u0016J\b\u0010\t\u001A\u00020\nH\u0016J\b\u0010\u000B\u001A\u00020\fH\u0016¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/AtomicInt;", "Ljava/util/concurrent/atomic/AtomicInteger;", "value", "", "(I)V", "add", "amount", "toByte", "", "toChar", "", "toShort", "", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AtomicInt extends AtomicInteger {
    public static final int $stable;

    public AtomicInt(int v) {
        super(v);
    }

    public final int add(int v) {
        return this.addAndGet(v);
    }

    @Override
    public final byte byteValue() {
        return this.toByte();
    }

    @Override
    public final double doubleValue() {
        return this.toDouble();
    }

    @Override
    public final float floatValue() {
        return this.toFloat();
    }

    @Override
    public final int intValue() {
        return this.toInt();
    }

    @Override
    public final long longValue() {
        return this.toLong();
    }

    @Override
    public final short shortValue() {
        return this.toShort();
    }

    public byte toByte() {
        return (byte)this.intValue();
    }

    public char toChar() {
        return (char)this.intValue();
    }

    public double toDouble() {
        return super.doubleValue();
    }

    public float toFloat() {
        return super.floatValue();
    }

    public int toInt() {
        return super.intValue();
    }

    public long toLong() {
        return super.longValue();
    }

    public short toShort() {
        return (short)this.intValue();
    }
}

