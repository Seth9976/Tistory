package kotlin.reflect.jvm.internal;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001E\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001D\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u0019\u0010\f\u001A\u0004\u0018\u00010\u00052\u0006\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0011\u001A\u0006\u0012\u0002\b\u00030\u000E8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010R\u001E\u0010\u0015\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014R\u001A\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00160\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0014¨\u0006\u0019"}, d2 = {"Lkotlin/reflect/jvm/internal/EmptyContainerForLocal;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "name", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "getProperties", "(Lkotlin/reflect/jvm/internal/impl/name/Name;)Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "getFunctions", "", "index", "getLocalProperty", "(I)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "Ljava/lang/Class;", "getJClass", "()Ljava/lang/Class;", "jClass", "Lkotlin/reflect/KCallable;", "getMembers", "()Ljava/util/Collection;", "members", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "constructorDescriptors", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class EmptyContainerForLocal extends KDeclarationContainerImpl {
    @NotNull
    public static final EmptyContainerForLocal INSTANCE;

    static {
        EmptyContainerForLocal.INSTANCE = new EmptyContainerForLocal();  // 初始化器: Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;-><init>()V
    }

    @Override  // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Collection getConstructorDescriptors() {
        throw new KotlinReflectionInternalError("Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection");
    }

    @Override  // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Collection getFunctions(@NotNull Name name0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        throw new KotlinReflectionInternalError("Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection");
    }

    @Override  // kotlin.jvm.internal.ClassBasedDeclarationContainer
    @NotNull
    public Class getJClass() {
        throw new KotlinReflectionInternalError("Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection");
    }

    @Override  // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @Nullable
    public PropertyDescriptor getLocalProperty(int v) {
        return null;
    }

    @Override  // kotlin.reflect.KDeclarationContainer
    @NotNull
    public Collection getMembers() {
        throw new KotlinReflectionInternalError("Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection");
    }

    @Override  // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Collection getProperties(@NotNull Name name0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        throw new KotlinReflectionInternalError("Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection");
    }
}

