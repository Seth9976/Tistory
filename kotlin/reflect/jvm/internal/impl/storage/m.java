package kotlin.reflect.jvm.internal.impl.storage;

public final class m {
    public final Object a;
    public final boolean b;

    public m(Object object0, boolean z) {
        this.a = object0;
        this.b = z;
    }

    // 去混淆评级： 低(20)
    @Override
    public final String toString() {
        return this.b ? "FALL_THROUGH" : String.valueOf(this.a);
    }
}

