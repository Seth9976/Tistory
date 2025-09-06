package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DeserializedPropertyDescriptor extends PropertyDescriptorImpl implements DeserializedCallableMemberDescriptor {
    public final NameResolver A;
    public final TypeTable B;
    public final VersionRequirementTable C;
    public final DeserializedContainerSource D;
    public final Property z;

    public DeserializedPropertyDescriptor(@NotNull DeclarationDescriptor declarationDescriptor0, @Nullable PropertyDescriptor propertyDescriptor0, @NotNull Annotations annotations0, @NotNull Modality modality0, @NotNull DescriptorVisibility descriptorVisibility0, boolean z, @NotNull Name name0, @NotNull Kind callableMemberDescriptor$Kind0, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull Property protoBuf$Property0, @NotNull NameResolver nameResolver0, @NotNull TypeTable typeTable0, @NotNull VersionRequirementTable versionRequirementTable0, @Nullable DeserializedContainerSource deserializedContainerSource0) {
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations0, "annotations");
        Intrinsics.checkNotNullParameter(modality0, "modality");
        Intrinsics.checkNotNullParameter(descriptorVisibility0, "visibility");
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(callableMemberDescriptor$Kind0, "kind");
        Intrinsics.checkNotNullParameter(protoBuf$Property0, "proto");
        Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable0, "versionRequirementTable");
        super(declarationDescriptor0, propertyDescriptor0, annotations0, modality0, descriptorVisibility0, z, name0, callableMemberDescriptor$Kind0, SourceElement.NO_SOURCE, z1, z2, z5, false, z3, z4);
        this.z = protoBuf$Property0;
        this.A = nameResolver0;
        this.B = typeTable0;
        this.C = versionRequirementTable0;
        this.D = deserializedContainerSource0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl
    @NotNull
    public PropertyDescriptorImpl createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor0, @NotNull Modality modality0, @NotNull DescriptorVisibility descriptorVisibility0, @Nullable PropertyDescriptor propertyDescriptor0, @NotNull Kind callableMemberDescriptor$Kind0, @NotNull Name name0, @NotNull SourceElement sourceElement0) {
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "newOwner");
        Intrinsics.checkNotNullParameter(modality0, "newModality");
        Intrinsics.checkNotNullParameter(descriptorVisibility0, "newVisibility");
        Intrinsics.checkNotNullParameter(callableMemberDescriptor$Kind0, "kind");
        Intrinsics.checkNotNullParameter(name0, "newName");
        Intrinsics.checkNotNullParameter(sourceElement0, "source");
        return new DeserializedPropertyDescriptor(declarationDescriptor0, propertyDescriptor0, this.getAnnotations(), modality0, descriptorVisibility0, this.isVar(), name0, callableMemberDescriptor$Kind0, this.isLateInit(), this.isConst(), this.isExternal(), this.isDelegated(), this.isExpect(), this.getProto(), this.getNameResolver(), this.getTypeTable(), this.getVersionRequirementTable(), this.getContainerSource());
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @Nullable
    public DeserializedContainerSource getContainerSource() {
        return this.D;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    public NameResolver getNameResolver() {
        return this.A;
    }

    @NotNull
    public Property getProto() {
        return this.z;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public MessageLite getProto() {
        return this.getProto();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    public TypeTable getTypeTable() {
        return this.B;
    }

    @NotNull
    public VersionRequirementTable getVersionRequirementTable() {
        return this.C;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        Boolean boolean0 = Flags.IS_EXTERNAL_PROPERTY.get(this.getProto().getFlags());
        Intrinsics.checkNotNullExpressionValue(boolean0, "IS_EXTERNAL_PROPERTY.get(proto.flags)");
        return boolean0.booleanValue();
    }
}

