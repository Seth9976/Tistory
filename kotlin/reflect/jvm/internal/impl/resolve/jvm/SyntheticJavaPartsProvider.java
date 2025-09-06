package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

public interface SyntheticJavaPartsProvider {
    public static final class Companion {
        public static final Companion a;
        public static final CompositeSyntheticJavaPartsProvider b;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.b = new CompositeSyntheticJavaPartsProvider(CollectionsKt__CollectionsKt.emptyList());
        }

        @NotNull
        public final CompositeSyntheticJavaPartsProvider getEMPTY() {
            return Companion.b;
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        SyntheticJavaPartsProvider.Companion = Companion.a;
    }

    void generateConstructors(@NotNull LazyJavaResolverContext arg1, @NotNull ClassDescriptor arg2, @NotNull List arg3);

    void generateMethods(@NotNull LazyJavaResolverContext arg1, @NotNull ClassDescriptor arg2, @NotNull Name arg3, @NotNull Collection arg4);

    void generateNestedClass(@NotNull LazyJavaResolverContext arg1, @NotNull ClassDescriptor arg2, @NotNull Name arg3, @NotNull List arg4);

    void generateStaticFunctions(@NotNull LazyJavaResolverContext arg1, @NotNull ClassDescriptor arg2, @NotNull Name arg3, @NotNull Collection arg4);

    @NotNull
    List getMethodNames(@NotNull LazyJavaResolverContext arg1, @NotNull ClassDescriptor arg2);

    @NotNull
    List getNestedClassNames(@NotNull LazyJavaResolverContext arg1, @NotNull ClassDescriptor arg2);

    @NotNull
    List getStaticFunctionNames(@NotNull LazyJavaResolverContext arg1, @NotNull ClassDescriptor arg2);
}

