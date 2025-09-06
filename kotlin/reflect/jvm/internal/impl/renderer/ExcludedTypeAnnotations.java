package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;
import kotlin.collections.f0;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

public final class ExcludedTypeAnnotations {
    @NotNull
    public static final ExcludedTypeAnnotations INSTANCE;
    public static final Set a;

    static {
        ExcludedTypeAnnotations.INSTANCE = new ExcludedTypeAnnotations();  // 初始化器: Ljava/lang/Object;-><init>()V
        ExcludedTypeAnnotations.a = f0.setOf(new FqName[]{new FqName("kotlin.internal.NoInfer"), new FqName("kotlin.internal.Exact")});
    }

    @NotNull
    public final Set getInternalAnnotationsForResolve() {
        return ExcludedTypeAnnotations.a;
    }
}

