package je;

import java.util.List;
import kotlin.collections.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

public final class g extends Lambda implements Function0 {
    public final JvmBuiltInsCustomizer w;

    public g(JvmBuiltInsCustomizer jvmBuiltInsCustomizer0) {
        this.w = jvmBuiltInsCustomizer0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list0 = k.listOf(AnnotationUtilKt.createDeprecatedAnnotation$default(JvmBuiltInsCustomizer.access$getModuleDescriptor$p(this.w).getBuiltIns(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, 6, null));
        return Annotations.Companion.create(list0);
    }
}

