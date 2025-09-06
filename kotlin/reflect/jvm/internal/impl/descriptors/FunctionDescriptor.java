package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface FunctionDescriptor extends CallableMemberDescriptor {
    public interface CopyBuilder {
        @Nullable
        FunctionDescriptor build();

        @NotNull
        CopyBuilder putUserData(@NotNull UserDataKey arg1, Object arg2);

        @NotNull
        CopyBuilder setAdditionalAnnotations(@NotNull Annotations arg1);

        @NotNull
        CopyBuilder setCopyOverrides(boolean arg1);

        @NotNull
        CopyBuilder setDispatchReceiverParameter(@Nullable ReceiverParameterDescriptor arg1);

        @NotNull
        CopyBuilder setDropOriginalInContainingParts();

        @NotNull
        CopyBuilder setExtensionReceiverParameter(@Nullable ReceiverParameterDescriptor arg1);

        @NotNull
        CopyBuilder setHiddenForResolutionEverywhereBesideSupercalls();

        @NotNull
        CopyBuilder setHiddenToOvercomeSignatureClash();

        @NotNull
        CopyBuilder setKind(@NotNull Kind arg1);

        @NotNull
        CopyBuilder setModality(@NotNull Modality arg1);

        @NotNull
        CopyBuilder setName(@NotNull Name arg1);

        @NotNull
        CopyBuilder setOriginal(@Nullable CallableMemberDescriptor arg1);

        @NotNull
        CopyBuilder setOwner(@NotNull DeclarationDescriptor arg1);

        @NotNull
        CopyBuilder setPreserveSourceElement();

        @NotNull
        CopyBuilder setReturnType(@NotNull KotlinType arg1);

        @NotNull
        CopyBuilder setSignatureChange();

        @NotNull
        CopyBuilder setSubstitution(@NotNull TypeSubstitution arg1);

        @NotNull
        CopyBuilder setTypeParameters(@NotNull List arg1);

        @NotNull
        CopyBuilder setValueParameters(@NotNull List arg1);

        @NotNull
        CopyBuilder setVisibility(@NotNull DescriptorVisibility arg1);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    DeclarationDescriptor getContainingDeclaration();

    @Nullable
    FunctionDescriptor getInitialSignatureDescriptor();

    @NotNull
    FunctionDescriptor getOriginal();

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    Collection getOverriddenDescriptors();

    boolean isHiddenForResolutionEverywhereBesideSupercalls();

    boolean isHiddenToOvercomeSignatureClash();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    boolean isTailrec();

    @NotNull
    CopyBuilder newCopyBuilder();

    @Nullable
    FunctionDescriptor substitute(@NotNull TypeSubstitutor arg1);
}

