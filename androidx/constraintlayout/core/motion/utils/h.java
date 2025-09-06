package androidx.constraintlayout.core.motion.utils;

public final class h extends SplineSet {
    public String c;

    @Override  // androidx.constraintlayout.core.motion.utils.SplineSet
    public final void setProperty(TypedValues typedValues0, float f) {
        typedValues0.setValue(typedValues0.getId(this.c), this.get(f));
    }
}

