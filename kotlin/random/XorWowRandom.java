package kotlin.random;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B9\b\u0000\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\u0004\u0012\u0006\u0010\t\u001A\u00020\u0004\u0012\u0006\u0010\n\u001A\u00020\u0004¢\u0006\u0004\b\u000B\u0010\fB\u0019\b\u0010\u0012\u0006\u0010\r\u001A\u00020\u0004\u0012\u0006\u0010\u000E\u001A\u00020\u0004¢\u0006\u0004\b\u000B\u0010\u000FJ\u000F\u0010\u0010\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001A\u00020\u00042\u0006\u0010\u0012\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lkotlin/random/XorWowRandom;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "x", "y", "z", "w", "v", "addend", "<init>", "(IIIIII)V", "seed1", "seed2", "(II)V", "nextInt", "()I", "bitCount", "nextBits", "(I)I", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nXorWowRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XorWowRandom.kt\nkotlin/random/XorWowRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
public final class XorWowRandom extends Random implements Serializable {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public XorWowRandom(int v, int v1) {
        this(v, v1, 0, 0, ~v, v << 10 ^ v1 >>> 4);
    }

    public XorWowRandom(int v, int v1, int v2, int v3, int v4, int v5) {
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = v4;
        this.g = v5;
        if((v | v1 | v2 | v3 | v4) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
        for(int v6 = 0; v6 < 0x40; ++v6) {
            this.nextInt();
        }
    }

    @Override  // kotlin.random.Random
    public int nextBits(int v) {
        return RandomKt.takeUpperBits(this.nextInt(), v);
    }

    @Override  // kotlin.random.Random
    public int nextInt() {
        int v = this.b ^ this.b >>> 2;
        this.b = this.c;
        this.c = this.d;
        this.d = this.e;
        this.e = this.f;
        int v1 = v ^ v << 1 ^ this.f ^ this.f << 4;
        this.f = v1;
        int v2 = this.g + 0x587C5;
        this.g = v2;
        return v1 + v2;
    }
}

