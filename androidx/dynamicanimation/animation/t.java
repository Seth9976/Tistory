package androidx.dynamicanimation.animation;

public final class t implements Force {
    public float a;
    public float b;
    public final s c;

    public t() {
        this.a = -4.2f;
        this.c = new s();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.dynamicanimation.animation.Force
    public final float getAcceleration(float f, float f1) {
        return f1 * this.a;
    }

    @Override  // androidx.dynamicanimation.animation.Force
    public final boolean isAtEquilibrium(float f, float f1) {
        return Math.abs(f1) < this.b;
    }
}

