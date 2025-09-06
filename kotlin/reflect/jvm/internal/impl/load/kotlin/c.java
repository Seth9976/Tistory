package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function1 {
    public final AbstractBinaryClassAnnotationAndConstantLoader w;

    public c(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader0) {
        this.w = abstractBinaryClassAnnotationAndConstantLoader0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((KotlinJvmBinaryClass)object0), "kotlinClass");
        return AbstractBinaryClassAnnotationAndConstantLoader.access$loadAnnotationsAndInitializers(this.w, ((KotlinJvmBinaryClass)object0));
    }
}

