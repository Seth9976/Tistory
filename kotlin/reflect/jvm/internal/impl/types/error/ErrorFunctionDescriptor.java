package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ErrorFunctionDescriptor extends SimpleFunctionDescriptorImpl {
    public ErrorFunctionDescriptor(@NotNull ClassDescriptor classDescriptor0) {
        Intrinsics.checkNotNullParameter(classDescriptor0, "containingDeclaration");
        Name name0 = Name.special("<Error function>");
        super(classDescriptor0, null, Annotations.Companion.getEMPTY(), name0, Kind.DECLARATION, SourceElement.NO_SOURCE);
        this.initialize(null, null, CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList(), ErrorUtils.createErrorType(ErrorTypeKind.RETURN_TYPE_FOR_FUNCTION, new String[0]), Modality.OPEN, DescriptorVisibilities.PUBLIC);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl
    public CallableMemberDescriptor copy(DeclarationDescriptor declarationDescriptor0, Modality modality0, DescriptorVisibility descriptorVisibility0, Kind callableMemberDescriptor$Kind0, boolean z) {
        return this.copy(declarationDescriptor0, modality0, descriptorVisibility0, callableMemberDescriptor$Kind0, z);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl
    public FunctionDescriptor copy(DeclarationDescriptor declarationDescriptor0, Modality modality0, DescriptorVisibility descriptorVisibility0, Kind callableMemberDescriptor$Kind0, boolean z) {
        return this.copy(declarationDescriptor0, modality0, descriptorVisibility0, callableMemberDescriptor$Kind0, z);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl
    @NotNull
    public SimpleFunctionDescriptor copy(@NotNull DeclarationDescriptor declarationDescriptor0, @NotNull Modality modality0, @NotNull DescriptorVisibility descriptorVisibility0, @NotNull Kind callableMemberDescriptor$Kind0, boolean z) {
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "newOwner");
        Intrinsics.checkNotNullParameter(modality0, "modality");
        Intrinsics.checkNotNullParameter(descriptorVisibility0, "visibility");
        Intrinsics.checkNotNullParameter(callableMemberDescriptor$Kind0, "kind");
        return this;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl
    @NotNull
    public FunctionDescriptorImpl createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor0, @Nullable FunctionDescriptor functionDescriptor0, @NotNull Kind callableMemberDescriptor$Kind0, @Nullable Name name0, @NotNull Annotations annotations0, @NotNull SourceElement sourceElement0) {
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "newOwner");
        Intrinsics.checkNotNullParameter(callableMemberDescriptor$Kind0, "kind");
        Intrinsics.checkNotNullParameter(annotations0, "annotations");
        Intrinsics.checkNotNullParameter(sourceElement0, "source");
        return this;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public Object getUserData(@NotNull UserDataKey callableDescriptor$UserDataKey0) {
        Intrinsics.checkNotNullParameter(callableDescriptor$UserDataKey0, "key");
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isSuspend() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl
    @NotNull
    public CopyBuilder newCopyBuilder() {
        return new CopyBuilder() {
            public final ErrorFunctionDescriptor a;

            {
                this.a = errorFunctionDescriptor0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
            public FunctionDescriptor build() {
                return this.build();
            }

            @NotNull
            public SimpleFunctionDescriptor build() {
                return this.a;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
            @NotNull
            public CopyBuilder putUserData(@NotNull UserDataKey callableDescriptor$UserDataKey0, Object object0) {
                Intrinsics.checkNotNullParameter(callableDescriptor$UserDataKey0, "userDataKey");
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
            @NotNull
            public CopyBuilder setAdditionalAnnotations(@NotNull Annotations annotations0) {
                Intrinsics.checkNotNullParameter(annotations0, "additionalAnnotations");
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
            @NotNull
            public CopyBuilder setCopyOverrides(boolean z) {
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
            @NotNull
            public CopyBuilder setDispatchReceiverParameter(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor0) {
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
            @NotNull
            public CopyBuilder setDropOriginalInContainingParts() {
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
            @NotNull
            public CopyBuilder setExtensionReceiverParameter(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor0) {
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
            @NotNull
            public CopyBuilder setHiddenForResolutionEverywhereBesideSupercalls() {
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
            @NotNull
            public CopyBuilder setHiddenToOvercomeSignatureClash() {
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
            @NotNull
            public CopyBuilder setKind(@NotNull Kind callableMemberDescriptor$Kind0) {
                Intrinsics.checkNotNullParameter(callableMemberDescriptor$Kind0, "kind");
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
            @NotNull
            public CopyBuilder setModality(@NotNull Modality modality0) {
                Intrinsics.checkNotNullParameter(modality0, "modality");
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
            @NotNull
            public CopyBuilder setName(@NotNull Name name0) {
                Intrinsics.checkNotNullParameter(name0, "name");
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
            @NotNull
            public CopyBuilder setOriginal(@Nullable CallableMemberDescriptor callableMemberDescriptor0) {
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
            @NotNull
            public CopyBuilder setOwner(@NotNull DeclarationDescriptor declarationDescriptor0) {
                Intrinsics.checkNotNullParameter(declarationDescriptor0, "owner");
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
            @NotNull
            public CopyBuilder setPreserveSourceElement() {
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
            @NotNull
            public CopyBuilder setReturnType(@NotNull KotlinType kotlinType0) {
                Intrinsics.checkNotNullParameter(kotlinType0, "type");
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
            @NotNull
            public CopyBuilder setSignatureChange() {
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
            @NotNull
            public CopyBuilder setSubstitution(@NotNull TypeSubstitution typeSubstitution0) {
                Intrinsics.checkNotNullParameter(typeSubstitution0, "substitution");
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
            @NotNull
            public CopyBuilder setTypeParameters(@NotNull List list0) {
                Intrinsics.checkNotNullParameter(list0, "parameters");
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
            @NotNull
            public CopyBuilder setValueParameters(@NotNull List list0) {
                Intrinsics.checkNotNullParameter(list0, "parameters");
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder
            @NotNull
            public CopyBuilder setVisibility(@NotNull DescriptorVisibility descriptorVisibility0) {
                Intrinsics.checkNotNullParameter(descriptorVisibility0, "visibility");
                return this;
            }
        };
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void setOverriddenDescriptors(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "overriddenDescriptors");
    }
}

