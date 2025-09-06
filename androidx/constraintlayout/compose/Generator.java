package androidx.constraintlayout.compose;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\u0007\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/constraintlayout/compose/Generator;", "Landroidx/constraintlayout/compose/GeneratedValue;", "", "start", "incrementBy", "<init>", "(FF)V", "value", "()F", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class Generator implements GeneratedValue {
    public final float a;
    public float b;

    public Generator(float f, float f1) {
        this.a = f1;
        this.b = f;
    }

    @Override  // androidx.constraintlayout.compose.GeneratedValue
    public float value() {
        float f = this.b + this.a;
        this.b = f;
        return f;
    }
}

