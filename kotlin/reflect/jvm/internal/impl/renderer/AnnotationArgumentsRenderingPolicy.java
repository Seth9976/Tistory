package kotlin.reflect.jvm.internal.impl.renderer;

public enum AnnotationArgumentsRenderingPolicy {
    NO_ARGUMENTS(3, false),
    UNLESS_EMPTY(2, true),
    ALWAYS_PARENTHESIZED(true, true);

    public final boolean a;
    public final boolean b;

    public AnnotationArgumentsRenderingPolicy(int v1, boolean z) {
        if((v1 & 1) != 0) {
            z = false;
        }
        this(z, false);
    }

    public AnnotationArgumentsRenderingPolicy(boolean z, boolean z1) {
        this.a = z;
        this.b = z1;
    }

    public final boolean getIncludeAnnotationArguments() {
        return this.a;
    }

    public final boolean getIncludeEmptyAnnotationArguments() {
        return this.b;
    }
}

