package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DeserializedTypeAliasDescriptor extends AbstractTypeAliasDescriptor implements DeserializedMemberDescriptor {
    public final StorageManager h;
    public final TypeAlias i;
    public final NameResolver j;
    public final TypeTable k;
    public final VersionRequirementTable l;
    public final DeserializedContainerSource m;
    public Collection n;
    public SimpleType o;
    public SimpleType p;
    public List q;
    public SimpleType r;

    public DeserializedTypeAliasDescriptor(@NotNull StorageManager storageManager0, @NotNull DeclarationDescriptor declarationDescriptor0, @NotNull Annotations annotations0, @NotNull Name name0, @NotNull DescriptorVisibility descriptorVisibility0, @NotNull TypeAlias protoBuf$TypeAlias0, @NotNull NameResolver nameResolver0, @NotNull TypeTable typeTable0, @NotNull VersionRequirementTable versionRequirementTable0, @Nullable DeserializedContainerSource deserializedContainerSource0) {
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations0, "annotations");
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(descriptorVisibility0, "visibility");
        Intrinsics.checkNotNullParameter(protoBuf$TypeAlias0, "proto");
        Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable0, "versionRequirementTable");
        Intrinsics.checkNotNullExpressionValue(SourceElement.NO_SOURCE, "NO_SOURCE");
        super(declarationDescriptor0, annotations0, name0, SourceElement.NO_SOURCE, descriptorVisibility0);
        this.h = storageManager0;
        this.i = protoBuf$TypeAlias0;
        this.j = nameResolver0;
        this.k = typeTable0;
        this.l = versionRequirementTable0;
        this.m = deserializedContainerSource0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    @Nullable
    public ClassDescriptor getClassDescriptor() {
        if(!KotlinTypeKt.isError(this.getExpandedType())) {
            ClassifierDescriptor classifierDescriptor0 = this.getExpandedType().getConstructor().getDeclarationDescriptor();
            return classifierDescriptor0 instanceof ClassDescriptor ? ((ClassDescriptor)classifierDescriptor0) : null;
        }
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @Nullable
    public DeserializedContainerSource getContainerSource() {
        return this.m;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public SimpleType getDefaultType() {
        SimpleType simpleType0 = this.r;
        if(simpleType0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("defaultTypeImpl");
            return null;
        }
        return simpleType0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    @NotNull
    public SimpleType getExpandedType() {
        SimpleType simpleType0 = this.p;
        if(simpleType0 != null) {
            return simpleType0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("expandedType");
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    public NameResolver getNameResolver() {
        return this.j;
    }

    @NotNull
    public TypeAlias getProto() {
        return this.i;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public MessageLite getProto() {
        return this.getProto();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor
    @NotNull
    public StorageManager getStorageManager() {
        return this.h;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor
    @NotNull
    public List getTypeConstructorTypeParameters() {
        List list0 = this.q;
        if(list0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("typeConstructorParameters");
            return null;
        }
        return list0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    public TypeTable getTypeTable() {
        return this.k;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    @NotNull
    public SimpleType getUnderlyingType() {
        SimpleType simpleType0 = this.o;
        if(simpleType0 != null) {
            return simpleType0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("underlyingType");
        return null;
    }

    @NotNull
    public VersionRequirementTable getVersionRequirementTable() {
        return this.l;
    }

    public final void initialize(@NotNull List list0, @NotNull SimpleType simpleType0, @NotNull SimpleType simpleType1) {
        Intrinsics.checkNotNullParameter(list0, "declaredTypeParameters");
        Intrinsics.checkNotNullParameter(simpleType0, "underlyingType");
        Intrinsics.checkNotNullParameter(simpleType1, "expandedType");
        this.initialize(list0);
        this.o = simpleType0;
        this.p = simpleType1;
        this.q = TypeParameterUtilsKt.computeConstructorTypeParameters(this);
        this.r = this.computeDefaultType();
        this.n = this.getTypeAliasConstructors();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public DeclarationDescriptorNonRoot substitute(TypeSubstitutor typeSubstitutor0) {
        return this.substitute(typeSubstitutor0);
    }

    @NotNull
    public TypeAliasDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor0) {
        Intrinsics.checkNotNullParameter(typeSubstitutor0, "substitutor");
        if(typeSubstitutor0.isEmpty()) {
            return this;
        }
        DeclarationDescriptor declarationDescriptor0 = this.getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(declarationDescriptor0, "containingDeclaration");
        Annotations annotations0 = this.getAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations0, "annotations");
        Name name0 = this.getName();
        Intrinsics.checkNotNullExpressionValue(name0, "name");
        TypeAliasDescriptor typeAliasDescriptor0 = new DeserializedTypeAliasDescriptor(this.getStorageManager(), declarationDescriptor0, annotations0, name0, this.getVisibility(), this.getProto(), this.getNameResolver(), this.getTypeTable(), this.getVersionRequirementTable(), this.getContainerSource());
        List list0 = this.getDeclaredTypeParameters();
        KotlinType kotlinType0 = typeSubstitutor0.safeSubstitute(this.getUnderlyingType(), Variance.INVARIANT);
        Intrinsics.checkNotNullExpressionValue(kotlinType0, "substitutor.safeSubstitu…Type, Variance.INVARIANT)");
        SimpleType simpleType0 = TypeSubstitutionKt.asSimpleType(kotlinType0);
        KotlinType kotlinType1 = typeSubstitutor0.safeSubstitute(this.getExpandedType(), Variance.INVARIANT);
        Intrinsics.checkNotNullExpressionValue(kotlinType1, "substitutor.safeSubstitu…Type, Variance.INVARIANT)");
        ((DeserializedTypeAliasDescriptor)typeAliasDescriptor0).initialize(list0, simpleType0, TypeSubstitutionKt.asSimpleType(kotlinType1));
        return typeAliasDescriptor0;
    }
}

