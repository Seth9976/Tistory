package be;

import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

public final class a extends Random {
    public final kotlin.random.Random a;
    public boolean b;

    public a(kotlin.random.Random random0) {
        Intrinsics.checkNotNullParameter(random0, "impl");
        super();
        this.a = random0;
    }

    @Override
    public final int next(int v) {
        return this.a.nextBits(v);
    }

    @Override
    public final boolean nextBoolean() {
        return this.a.nextBoolean();
    }

    @Override
    public final void nextBytes(byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "bytes");
        this.a.nextBytes(arr_b);
    }

    @Override
    public final double nextDouble() {
        return this.a.nextDouble();
    }

    @Override
    public final float nextFloat() {
        return this.a.nextFloat();
    }

    @Override
    public final int nextInt() {
        return this.a.nextInt();
    }

    @Override
    public final int nextInt(int v) {
        return this.a.nextInt(v);
    }

    @Override
    public final long nextLong() {
        return this.a.nextLong();
    }

    @Override
    public final void setSeed(long v) {
        if(this.b) {
            throw new UnsupportedOperationException("Setting seed is not supported.");
        }
        this.b = true;
    }
}

