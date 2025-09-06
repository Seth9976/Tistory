package kotlin.random;

import a5.b;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\'\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0004H&J\b\u0010\u0006\u001A\u00020\u0007H\u0016J\u0010\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\tH\u0016J$\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\u00042\b\b\u0002\u0010\f\u001A\u00020\u0004H\u0016J\u0010\u0010\b\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\u0004H\u0016J\b\u0010\u000E\u001A\u00020\u000FH\u0016J\u0010\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u000FH\u0016J\u0018\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0011\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u000FH\u0016J\b\u0010\u0012\u001A\u00020\u0013H\u0016J\b\u0010\u0014\u001A\u00020\u0004H\u0016J\u0010\u0010\u0014\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u0004H\u0016J\u0018\u0010\u0014\u001A\u00020\u00042\u0006\u0010\u0011\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u0004H\u0016J\b\u0010\u0015\u001A\u00020\u0016H\u0016J\u0010\u0010\u0015\u001A\u00020\u00162\u0006\u0010\u0010\u001A\u00020\u0016H\u0016J\u0018\u0010\u0015\u001A\u00020\u00162\u0006\u0010\u0011\u001A\u00020\u00162\u0006\u0010\u0010\u001A\u00020\u0016H\u0016¨\u0006\u0018"}, d2 = {"Lkotlin/random/Random;", "", "()V", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "fromIndex", "toIndex", "size", "nextDouble", "", "until", "from", "nextFloat", "", "nextInt", "nextLong", "", "Default", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.3")
@SourceDebugExtension({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/Random\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
public abstract class Random {
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000B\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003J\u0017\u0010\u0006\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\b\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u001F\u0010\b\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u000E\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u0010J\u001F\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000B\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0016\u001A\u00020\u00152\u0006\u0010\n\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0018J\u001F\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u000B\u001A\u00020\u00152\u0006\u0010\n\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0019J\u000F\u0010\u001B\u001A\u00020\u001AH\u0016¢\u0006\u0004\b\u001B\u0010\u001CJ\u0017\u0010\u001F\u001A\u00020\u001D2\u0006\u0010\u001E\u001A\u00020\u001DH\u0016¢\u0006\u0004\b\u001F\u0010 J\u0017\u0010\u001F\u001A\u00020\u001D2\u0006\u0010!\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u001F\u0010\"J\'\u0010\u001F\u001A\u00020\u001D2\u0006\u0010\u001E\u001A\u00020\u001D2\u0006\u0010#\u001A\u00020\u00042\u0006\u0010$\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u001F\u0010%R\u0014\u0010&\u001A\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\'¨\u0006("}, d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "bitCount", "nextBits", "(I)I", "nextInt", "()I", "until", "from", "(II)I", "", "nextLong", "()J", "(J)J", "(JJ)J", "", "nextBoolean", "()Z", "", "nextDouble", "()D", "(D)D", "(DD)D", "", "nextFloat", "()F", "", "array", "nextBytes", "([B)[B", "size", "(I)[B", "fromIndex", "toIndex", "([BII)[B", "defaultRandom", "Lkotlin/random/Random;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Default extends Random implements Serializable {
        public Default(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @Override  // kotlin.random.Random
        public int nextBits(int v) {
            return Random.a.nextBits(v);
        }

        @Override  // kotlin.random.Random
        public boolean nextBoolean() {
            return Random.a.nextBoolean();
        }

        @Override  // kotlin.random.Random
        @NotNull
        public byte[] nextBytes(int v) {
            return Random.a.nextBytes(v);
        }

        @Override  // kotlin.random.Random
        @NotNull
        public byte[] nextBytes(@NotNull byte[] arr_b) {
            Intrinsics.checkNotNullParameter(arr_b, "array");
            return Random.a.nextBytes(arr_b);
        }

        @Override  // kotlin.random.Random
        @NotNull
        public byte[] nextBytes(@NotNull byte[] arr_b, int v, int v1) {
            Intrinsics.checkNotNullParameter(arr_b, "array");
            return Random.a.nextBytes(arr_b, v, v1);
        }

        @Override  // kotlin.random.Random
        public double nextDouble() {
            return Random.a.nextDouble();
        }

        @Override  // kotlin.random.Random
        public double nextDouble(double f) {
            return Random.a.nextDouble(f);
        }

        @Override  // kotlin.random.Random
        public double nextDouble(double f, double f1) {
            return Random.a.nextDouble(f, f1);
        }

        @Override  // kotlin.random.Random
        public float nextFloat() {
            return Random.a.nextFloat();
        }

        @Override  // kotlin.random.Random
        public int nextInt() {
            return Random.a.nextInt();
        }

        @Override  // kotlin.random.Random
        public int nextInt(int v) {
            return Random.a.nextInt(v);
        }

        @Override  // kotlin.random.Random
        public int nextInt(int v, int v1) {
            return Random.a.nextInt(v, v1);
        }

        @Override  // kotlin.random.Random
        public long nextLong() {
            return Random.a.nextLong();
        }

        @Override  // kotlin.random.Random
        public long nextLong(long v) {
            return Random.a.nextLong(v);
        }

        @Override  // kotlin.random.Random
        public long nextLong(long v, long v1) {
            return Random.a.nextLong(v, v1);
        }
    }

    @NotNull
    public static final Default Default;
    public static final Random a;

    static {
        Random.Default = new Default(null);
        Random.a = PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();
    }

    public abstract int nextBits(int arg1);

    public boolean nextBoolean() {
        return this.nextBits(1) != 0;
    }

    @NotNull
    public byte[] nextBytes(int v) {
        return this.nextBytes(new byte[v]);
    }

    @NotNull
    public byte[] nextBytes(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "array");
        return this.nextBytes(arr_b, 0, arr_b.length);
    }

    @NotNull
    public byte[] nextBytes(@NotNull byte[] arr_b, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_b, "array");
        if(!new IntRange(0, arr_b.length).contains(v) || !new IntRange(0, arr_b.length).contains(v1)) {
            throw new IllegalArgumentException(b.p(q.u("fromIndex (", v, ") or toIndex (", v1, ") are out of range: 0.."), arr_b.length, '.').toString());
        }
        if(v > v1) {
            throw new IllegalArgumentException(("fromIndex (" + v + ") must be not greater than toIndex (" + v1 + ").").toString());
        }
        int v3 = (v1 - v) / 4;
        for(int v4 = 0; v4 < v3; ++v4) {
            int v5 = this.nextInt();
            arr_b[v] = (byte)v5;
            arr_b[v + 1] = (byte)(v5 >>> 8);
            arr_b[v + 2] = (byte)(v5 >>> 16);
            arr_b[v + 3] = (byte)(v5 >>> 24);
            v += 4;
        }
        int v6 = v1 - v;
        int v7 = this.nextBits(v6 * 8);
        for(int v2 = 0; v2 < v6; ++v2) {
            arr_b[v + v2] = (byte)(v7 >>> v2 * 8);
        }
        return arr_b;
    }

    public static byte[] nextBytes$default(Random random0, byte[] arr_b, int v, int v1, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
        }
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_b.length;
        }
        return random0.nextBytes(arr_b, v, v1);
    }

    public double nextDouble() {
        return PlatformRandomKt.doubleFromParts(this.nextBits(26), this.nextBits(27));
    }

    public double nextDouble(double f) {
        return this.nextDouble(0.0, f);
    }

    public double nextDouble(double f, double f1) {
        double f4;
        RandomKt.checkRangeBounds(f, f1);
        double f2 = f1 - f;
        if(Double.isInfinite(f2) && !Double.isInfinite(f) && !Double.isNaN(f) && !Double.isInfinite(f1) && !Double.isNaN(f1)) {
            double f3 = (f1 / 2.0 - f / 2.0) * this.nextDouble();
            f4 = f + f3 + f3;
            return f4 >= f1 ? Math.nextAfter(f1, -Infinity) : f4;
        }
        f4 = f + this.nextDouble() * f2;
        return f4 >= f1 ? Math.nextAfter(f1, -Infinity) : f4;
    }

    public float nextFloat() {
        return ((float)this.nextBits(24)) / 16777216.0f;
    }

    public int nextInt() {
        return this.nextBits(0x20);
    }

    public int nextInt(int v) {
        return this.nextInt(0, v);
    }

    public int nextInt(int v, int v1) {
        int v5;
        int v3;
        RandomKt.checkRangeBounds(v, v1);
        int v2 = v1 - v;
        if(v2 <= 0 && v2 != 0x80000000) {
            do {
                v3 = this.nextInt();
            }
            while(v > v3 || v3 >= v1);
            return v3;
        }
        if((-v2 & v2) == v2) {
            return v + this.nextBits(RandomKt.fastLog2(v2));
        }
        do {
            int v4 = this.nextInt();
            v5 = (v4 >>> 1) % v2;
        }
        while(v2 - 1 + ((v4 >>> 1) - v5) < 0);
        return v + v5;
    }

    public long nextLong() {
        return (((long)this.nextInt()) << 0x20) + ((long)this.nextInt());
    }

    public long nextLong(long v) {
        return this.nextLong(0L, v);
    }

    public long nextLong(long v, long v1) {
        long v5;
        long v4;
        RandomKt.checkRangeBounds(v, v1);
        long v2 = v1 - v;
        if(v2 > 0L) {
            if(Long.compare(-v2 & v2, v2) == 0) {
                if(((int)v2) != 0) {
                    return v + (((long)this.nextBits(RandomKt.fastLog2(((int)v2)))) & 0xFFFFFFFFL);
                }
                return ((int)(v2 >>> 0x20)) == 1 ? v + (((long)this.nextInt()) & 0xFFFFFFFFL) : v + ((((long)this.nextBits(RandomKt.fastLog2(((int)(v2 >>> 0x20))))) << 0x20) + (((long)this.nextInt()) & 0xFFFFFFFFL));
            }
            do {
                long v3 = this.nextLong();
                v4 = (v3 >>> 1) % v2;
            }
            while(v2 - 1L + ((v3 >>> 1) - v4) < 0L);
            return v + v4;
        }
        do {
            v5 = this.nextLong();
        }
        while(v > v5 || v5 >= v1);
        return v5;
    }
}

