package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ValueParameterDescriptor extends ParameterDescriptor, VariableDescriptor {
    public static final class DefaultImpls {
        public static boolean isLateInit(@NotNull ValueParameterDescriptor valueParameterDescriptor0) [...] // Inlined contents
    }

    @NotNull
    ValueParameterDescriptor copy(@NotNull CallableDescriptor arg1, @NotNull Name arg2, int arg3);

    boolean declaresDefaultValue();

    @NotNull
    CallableDescriptor getContainingDeclaration();

    int getIndex();

    @NotNull
    ValueParameterDescriptor getOriginal();

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    Collection getOverriddenDescriptors();

    @Nullable
    KotlinType getVarargElementType();

    boolean isCrossinline();

    boolean isNoinline();
}

