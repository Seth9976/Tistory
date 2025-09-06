package kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class Variance extends Enum {
    public static final enum Variance INVARIANT;
    public static final enum Variance IN_VARIANCE;
    public static final enum Variance OUT_VARIANCE;
    public final String a;
    public final boolean b;
    public static final Variance[] c;

    static {
        Variance.INVARIANT = new Variance(0, "INVARIANT", true, "");
        Variance.IN_VARIANCE = new Variance(1, "IN_VARIANCE", false, "in");
        Variance.OUT_VARIANCE = new Variance(2, "OUT_VARIANCE", true, "out");
        Variance.c = new Variance[]{Variance.INVARIANT, Variance.IN_VARIANCE, Variance.OUT_VARIANCE};
    }

    public Variance(int v, String s, boolean z, String s1) {
        super(s, v);
        this.a = s1;
        this.b = z;
    }

    public final boolean getAllowsOutPosition() {
        return this.b;
    }

    @NotNull
    public final String getLabel() {
        return this.a;
    }

    @Override
    @NotNull
    public String toString() {
        return this.a;
    }

    public static Variance valueOf(String s) {
        return (Variance)Enum.valueOf(Variance.class, s);
    }

    public static Variance[] values() {
        return (Variance[])Variance.c.clone();
    }
}

