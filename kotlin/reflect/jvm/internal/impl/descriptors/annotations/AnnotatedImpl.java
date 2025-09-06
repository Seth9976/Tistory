package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import org.jetbrains.annotations.NotNull;

public class AnnotatedImpl implements Annotated {
    public final Annotations a;

    public AnnotatedImpl(@NotNull Annotations annotations0) {
        if(annotations0 != null) {
            super();
            this.a = annotations0;
            return;
        }
        AnnotatedImpl.a(0);
        throw null;
    }

    public static void a(int v) {
        Object[] arr_object = new Object[(v == 1 ? 2 : 3)];
        arr_object[0] = v == 1 ? "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl" : "annotations";
        arr_object[1] = v == 1 ? "getAnnotations" : "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        if(v != 1) {
            arr_object[2] = "<init>";
        }
        String s = String.format((v == 1 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalArgumentException illegalArgumentException0 = v == 1 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalArgumentException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        Annotations annotations0 = this.a;
        if(annotations0 != null) {
            return annotations0;
        }
        AnnotatedImpl.a(1);
        throw null;
    }
}

