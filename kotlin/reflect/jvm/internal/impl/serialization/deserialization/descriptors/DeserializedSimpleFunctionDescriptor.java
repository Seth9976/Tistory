package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DeserializedSimpleFunctionDescriptor extends SimpleFunctionDescriptorImpl implements DeserializedCallableMemberDescriptor {
    public final Function D;
    public final NameResolver E;
    public final TypeTable F;
    public final VersionRequirementTable G;
    public final DeserializedContainerSource H;

    public DeserializedSimpleFunctionDescriptor(@NotNull DeclarationDescriptor declarationDescriptor0, @Nullable SimpleFunctionDescriptor simpleFunctionDescriptor0, @NotNull Annotations annotations0, @NotNull Name name0, @NotNull Kind callableMemberDescriptor$Kind0, @NotNull Function protoBuf$Function0, @NotNull NameResolver nameResolver0, @NotNull TypeTable typeTable0, @NotNull VersionRequirementTable versionRequirementTable0, @Nullable DeserializedContainerSource deserializedContainerSource0, @Nullable SourceElement sourceElement0) {
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations0, "annotations");
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(callableMemberDescriptor$Kind0, "kind");
        Intrinsics.checkNotNullParameter(protoBuf$Function0, "proto");
        Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable0, "versionRequirementTable");
        super(declarationDescriptor0, simpleFunctionDescriptor0, annotations0, name0, callableMemberDescriptor$Kind0, (sourceElement0 == null ? SourceElement.NO_SOURCE : sourceElement0));
        this.D = protoBuf$Function0;
        this.E = nameResolver0;
        this.F = typeTable0;
        this.G = versionRequirementTable0;
        this.H = deserializedContainerSource0;
    }

    public DeserializedSimpleFunctionDescriptor(DeclarationDescriptor declarationDescriptor0, SimpleFunctionDescriptor simpleFunctionDescriptor0, Annotations annotations0, Name name0, Kind callableMemberDescriptor$Kind0, Function protoBuf$Function0, NameResolver nameResolver0, TypeTable typeTable0, VersionRequirementTable versionRequirementTable0, DeserializedContainerSource deserializedContainerSource0, SourceElement sourceElement0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(declarationDescriptor0, simpleFunctionDescriptor0, annotations0, name0, callableMemberDescriptor$Kind0, protoBuf$Function0, nameResolver0, typeTable0, versionRequirementTable0, deserializedContainerSource0, ((v & 0x400) == 0 ? sourceElement0 : null));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl
    @NotNull
    public FunctionDescriptorImpl createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor0, @Nullable FunctionDescriptor functionDescriptor0, @NotNull Kind callableMemberDescriptor$Kind0, @Nullable Name name0, @NotNull Annotations annotations0, @NotNull SourceElement sourceElement0) {
        Name name2;
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "newOwner");
        Intrinsics.checkNotNullParameter(callableMemberDescriptor$Kind0, "kind");
        Intrinsics.checkNotNullParameter(annotations0, "annotations");
        Intrinsics.checkNotNullParameter(sourceElement0, "source");
        if(name0 == null) {
            Name name1 = this.getName();
            Intrinsics.checkNotNullExpressionValue(name1, "name");
            name2 = name1;
        }
        else {
            name2 = name0;
        }
        FunctionDescriptorImpl functionDescriptorImpl0 = new DeserializedSimpleFunctionDescriptor(declarationDescriptor0, ((SimpleFunctionDescriptor)functionDescriptor0), annotations0, name2, callableMemberDescriptor$Kind0, this.getProto(), this.getNameResolver(), this.getTypeTable(), this.getVersionRequirementTable(), this.getContainerSource(), sourceElement0);
        functionDescriptorImpl0.setHasStableParameterNames(this.hasStableParameterNames());
        return functionDescriptorImpl0;
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
    public Function getProto() {
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
}

