package io.reactivex.schedulers;

import io.reactivex.annotations.NonNull;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.TimeUnit;

public final class Timed {
    public final Object a;
    public final long b;
    public final TimeUnit c;

    public Timed(@NonNull Object object0, long v, @NonNull TimeUnit timeUnit0) {
        this.a = object0;
        this.b = v;
        this.c = (TimeUnit)ObjectHelper.requireNonNull(timeUnit0, "unit is null");
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof Timed && ObjectHelper.equals(this.a, ((Timed)object0).a) && this.b == ((Timed)object0).b && ObjectHelper.equals(this.c, ((Timed)object0).c);
    }

    @Override
    public int hashCode() {
        return this.a == null ? this.c.hashCode() + ((int)(this.b ^ this.b >>> 0x1F)) * 0x1F : this.c.hashCode() + (this.a.hashCode() * 0x1F + ((int)(this.b ^ this.b >>> 0x1F))) * 0x1F;
    }

    public long time() {
        return this.b;
    }

    public long time(@NonNull TimeUnit timeUnit0) {
        return timeUnit0.convert(this.b, this.c);
    }

    @Override
    public String toString() {
        return "Timed[time=" + this.b + ", unit=" + this.c + ", value=" + this.a + "]";
    }

    @NonNull
    public TimeUnit unit() {
        return this.c;
    }

    @NonNull
    public Object value() {
        return this.a;
    }
}

