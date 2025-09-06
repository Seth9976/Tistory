package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface CallableDescriptor extends DeclarationDescriptorNonRoot, DeclarationDescriptorWithVisibility, Substitutable {
    public interface UserDataKey {
    }

    @NotNull
    List getContextReceiverParameters();

    @Nullable
    ReceiverParameterDescriptor getDispatchReceiverParameter();

    @Nullable
    ReceiverParameterDescriptor getExtensionReceiverParameter();

    @NotNull
    CallableDescriptor getOriginal();

    @NotNull
    Collection getOverriddenDescriptors();

    @Nullable
    KotlinType getReturnType();

    @NotNull
    List getTypeParameters();

    @Nullable
    Object getUserData(UserDataKey arg1);

    @NotNull
    List getValueParameters();

    boolean hasSynthesizedParameterNames();
}

