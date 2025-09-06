package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DeserializedClassConstructorDescriptor extends ClassConstructorDescriptorImpl implements DeserializedCallableMemberDescriptor {
    public final Constructor D;
    public final NameResolver E;
    public final TypeTable F;
    public final VersionRequirementTable G;
    public final DeserializedContainerSource H;

    public DeserializedClassConstructorDescriptor(@NotNull ClassDescriptor classDescriptor0, @Nullable ConstructorDescriptor constructorDescriptor0, @NotNull Annotations annotations0, boolean z, @NotNull Kind callableMemberDescriptor$Kind0, @NotNull Constructor protoBuf$Constructor0, @NotNull NameResolver nameResolver0, @NotNull TypeTable typeTable0, @NotNull VersionRequirementTable versionRequirementTable0, @Nullable DeserializedContainerSource deserializedContainerSource0, @Nullable SourceElement sourceElement0) {
        Intrinsics.checkNotNullParameter(classDescriptor0, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations0, "annotations");
        Intrinsics.checkNotNullParameter(callableMemberDescriptor$Kind0, "kind");
        Intrinsics.checkNotNullParameter(protoBuf$Constructor0, "proto");
        Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable0, "versionRequirementTable");
        super(classDescriptor0, constructorDescriptor0, annotations0, z, callableMemberDescriptor$Kind0, (sourceElement0 == null ? SourceElement.NO_SOURCE : sourceElement0));
        this.D = protoBuf$Constructor0;
        this.E = nameResolver0;
        this.F = typeTable0;
        this.G = versionRequirementTable0;
        this.H = deserializedContainerSource0;
    }

    public DeserializedClassConstructorDescriptor(ClassDescriptor classDescriptor0, ConstructorDescriptor constructorDescriptor0, Annotations annotations0, boolean z, Kind callableMemberDescriptor$Kind0, Constructor protoBuf$Constructor0, NameResolver nameResolver0, TypeTable typeTable0, VersionRequirementTable versionRequirementTable0, DeserializedContainerSource deserializedContainerSource0, SourceElement sourceElement0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(classDescriptor0, constructorDescriptor0, annotations0, z, callableMemberDescriptor$Kind0, protoBuf$Constructor0, nameResolver0, typeTable0, versionRequirementTable0, deserializedContainerSource0, ((v & 0x400) == 0 ? sourceElement0 : null));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl
    public ClassConstructorDescriptorImpl createSubstitutedCopy(DeclarationDescriptor declarationDescriptor0, FunctionDescriptor functionDescriptor0, Kind callableMemberDescriptor$Kind0, Name name0, Annotations annotations0, SourceElement sourceElement0) {
        return this.createSubstitutedCopy(declarationDescriptor0, functionDescriptor0, callableMemberDescriptor$Kind0, name0, annotations0, sourceElement0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl
    public FunctionDescriptorImpl createSubstitutedCopy(DeclarationDescriptor declarationDescriptor0, FunctionDescriptor functionDescriptor0, Kind callableMemberDescriptor$Kind0, Name name0, Annotations annotations0, SourceElement sourceElement0) {
        return this.createSubstitutedCopy(declarationDescriptor0, functionDescriptor0, callableMemberDescriptor$Kind0, name0, annotations0, sourceElement0);
    }

    @NotNull
    public DeserializedClassConstructorDescriptor createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor0, @Nullable FunctionDescriptor functionDescriptor0, @NotNull Kind callableMemberDescriptor$Kind0, @Nullable Name name0, @NotNull Annotations annotations0, @NotNull SourceElement sourceElement0) {
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "newOwner");
        Intrinsics.checkNotNullParameter(callableMemberDescriptor$Kind0, "kind");
        Intrinsics.checkNotNullParameter(annotations0, "annotations");
        Intrinsics.checkNotNullParameter(sourceElement0, "source");
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor0 = new DeserializedClassConstructorDescriptor(((ClassDescriptor)declarationDescriptor0), ((ConstructorDescriptor)functionDescriptor0), annotations0, this.isPrimary, callableMemberDescriptor$Kind0, this.getProto(), this.getNameResolver(), this.getTypeTable(), this.getVersionRequirementTable(), this.getContainerSource(), sourceElement0);
        deserializedClassConstructorDescriptor0.setHasStableParameterNames(this.hasStableParameterNames());
        return deserializedClassConstructorDescriptor0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @Nullable
    public DeserializedContainerSource getContainerSource() {
        return this.H;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    public NameResolver getNameResolver() {
        return this.E;
    }

    @NotNull
    public Constructor getProto() {
        return this.D;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public MessageLite getProto() {
        return this.getProto();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    public TypeTable getTypeTable() {
        return this.F;
    }

    @NotNull
    public VersionRequirementTable getVersionRequirementTable() {
        return this.G;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInline() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isSuspend() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isTailrec() {
        return false;
    }
}

