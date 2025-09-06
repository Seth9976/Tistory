package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nTypeAliasConstructorDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAliasConstructorDescriptor.kt\norg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptorImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n1#2:239\n*E\n"})
public final class TypeAliasConstructorDescriptorImpl extends FunctionDescriptorImpl implements TypeAliasConstructorDescriptor {
    @SourceDebugExtension({"SMAP\nTypeAliasConstructorDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAliasConstructorDescriptor.kt\norg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptorImpl$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,238:1\n1559#2:239\n1590#2,4:240\n*S KotlinDebug\n*F\n+ 1 TypeAliasConstructorDescriptor.kt\norg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptorImpl$Companion\n*L\n209#1:239\n209#1:240,4\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static final TypeSubstitutor access$getTypeSubstitutorForUnderlyingClass(Companion typeAliasConstructorDescriptorImpl$Companion0, TypeAliasDescriptor typeAliasDescriptor0) {
            typeAliasConstructorDescriptorImpl$Companion0.getClass();
            return typeAliasDescriptor0.getClassDescriptor() == null ? null : TypeSubstitutor.create(typeAliasDescriptor0.getExpandedType());
        }

        @Nullable
        public final TypeAliasConstructorDescriptor createIfAvailable(@NotNull StorageManager storageManager0, @NotNull TypeAliasDescriptor typeAliasDescriptor0, @NotNull ClassConstructorDescriptor classConstructorDescriptor0) {
            List list2;
            Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
            Intrinsics.checkNotNullParameter(typeAliasDescriptor0, "typeAliasDescriptor");
            Intrinsics.checkNotNullParameter(classConstructorDescriptor0, "constructor");
            ReceiverParameterDescriptor receiverParameterDescriptor0 = null;
            TypeSubstitutor typeSubstitutor0 = typeAliasDescriptor0.getClassDescriptor() == null ? null : TypeSubstitutor.create(typeAliasDescriptor0.getExpandedType());
            if(typeSubstitutor0 == null) {
                return null;
            }
            ClassConstructorDescriptor classConstructorDescriptor1 = classConstructorDescriptor0.substitute(typeSubstitutor0);
            if(classConstructorDescriptor1 == null) {
                return null;
            }
            Annotations annotations0 = classConstructorDescriptor0.getAnnotations();
            Kind callableMemberDescriptor$Kind0 = classConstructorDescriptor0.getKind();
            Intrinsics.checkNotNullExpressionValue(callableMemberDescriptor$Kind0, "constructor.kind");
            SourceElement sourceElement0 = typeAliasDescriptor0.getSource();
            Intrinsics.checkNotNullExpressionValue(sourceElement0, "typeAliasDescriptor.source");
            TypeAliasConstructorDescriptor typeAliasConstructorDescriptor0 = new TypeAliasConstructorDescriptorImpl(storageManager0, typeAliasDescriptor0, classConstructorDescriptor1, null, annotations0, callableMemberDescriptor$Kind0, sourceElement0, null);
            List list0 = FunctionDescriptorImpl.getSubstitutedValueParameters(typeAliasConstructorDescriptor0, classConstructorDescriptor0.getValueParameters(), typeSubstitutor0);
            if(list0 == null) {
                return null;
            }
            SimpleType simpleType0 = FlexibleTypesKt.lowerIfFlexible(classConstructorDescriptor1.getReturnType().unwrap());
            SimpleType simpleType1 = typeAliasDescriptor0.getDefaultType();
            Intrinsics.checkNotNullExpressionValue(simpleType1, "typeAliasDescriptor.defaultType");
            SimpleType simpleType2 = SpecialTypesKt.withAbbreviation(simpleType0, simpleType1);
            ReceiverParameterDescriptor receiverParameterDescriptor1 = classConstructorDescriptor0.getDispatchReceiverParameter();
            if(receiverParameterDescriptor1 != null) {
                receiverParameterDescriptor0 = DescriptorFactory.createExtensionReceiverParameterForCallable(typeAliasConstructorDescriptor0, typeSubstitutor0.safeSubstitute(receiverParameterDescriptor1.getType(), Variance.INVARIANT), Annotations.Companion.getEMPTY());
            }
            ClassDescriptor classDescriptor0 = typeAliasDescriptor0.getClassDescriptor();
            if(classDescriptor0 == null) {
                list2 = CollectionsKt__CollectionsKt.emptyList();
            }
            else {
                List list1 = classConstructorDescriptor0.getContextReceiverParameters();
                Intrinsics.checkNotNullExpressionValue(list1, "constructor.contextReceiverParameters");
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list1, 10));
                int v = 0;
                for(Object object0: list1) {
                    if(v < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    KotlinType kotlinType0 = typeSubstitutor0.safeSubstitute(((ReceiverParameterDescriptor)object0).getType(), Variance.INVARIANT);
                    ReceiverValue receiverValue0 = ((ReceiverParameterDescriptor)object0).getValue();
                    Intrinsics.checkNotNull(receiverValue0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                    arrayList0.add(DescriptorFactory.createContextReceiverParameterForClass(classDescriptor0, kotlinType0, ((ImplicitContextReceiver)receiverValue0).getCustomLabelName(), Annotations.Companion.getEMPTY(), v));
                    ++v;
                }
                list2 = arrayList0;
            }
            List list3 = typeAliasDescriptor0.getDeclaredTypeParameters();
            DescriptorVisibility descriptorVisibility0 = typeAliasDescriptor0.getVisibility();
            ((FunctionDescriptorImpl)typeAliasConstructorDescriptor0).initialize(receiverParameterDescriptor0, null, list2, list3, list0, simpleType2, Modality.FINAL, descriptorVisibility0);
            return typeAliasConstructorDescriptor0;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final StorageManager D;
    public final TypeAliasDescriptor E;
    public final NullableLazyValue F;
    public ClassConstructorDescriptor G;
    public static final KProperty[] H;

    static {
        TypeAliasConstructorDescriptorImpl.H = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(TypeAliasConstructorDescriptorImpl.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};
        TypeAliasConstructorDescriptorImpl.Companion = new Companion(null);
    }

    public TypeAliasConstructorDescriptorImpl(StorageManager storageManager0, TypeAliasDescriptor typeAliasDescriptor0, ClassConstructorDescriptor classConstructorDescriptor0, TypeAliasConstructorDescriptor typeAliasConstructorDescriptor0, Annotations annotations0, Kind callableMemberDescriptor$Kind0, SourceElement sourceElement0) {
        super(typeAliasDescriptor0, typeAliasConstructorDescriptor0, annotations0, SpecialNames.INIT, callableMemberDescriptor$Kind0, sourceElement0);
        this.D = storageManager0;
        this.E = typeAliasDescriptor0;
        this.setActual(this.getTypeAliasDescriptor().isActual());
        this.F = storageManager0.createNullableLazyValue(new o(this, classConstructorDescriptor0));
        this.G = classConstructorDescriptor0;
    }

    public TypeAliasConstructorDescriptorImpl(StorageManager storageManager0, TypeAliasDescriptor typeAliasDescriptor0, ClassConstructorDescriptor classConstructorDescriptor0, TypeAliasConstructorDescriptor typeAliasConstructorDescriptor0, Annotations annotations0, Kind callableMemberDescriptor$Kind0, SourceElement sourceElement0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(storageManager0, typeAliasDescriptor0, classConstructorDescriptor0, typeAliasConstructorDescriptor0, annotations0, callableMemberDescriptor$Kind0, sourceElement0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public CallableMemberDescriptor copy(DeclarationDescriptor declarationDescriptor0, Modality modality0, DescriptorVisibility descriptorVisibility0, Kind callableMemberDescriptor$Kind0, boolean z) {
        return this.copy(declarationDescriptor0, modality0, descriptorVisibility0, callableMemberDescriptor$Kind0, z);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public FunctionDescriptor copy(DeclarationDescriptor declarationDescriptor0, Modality modality0, DescriptorVisibility descriptorVisibility0, Kind callableMemberDescriptor$Kind0, boolean z) {
        return this.copy(declarationDescriptor0, modality0, descriptorVisibility0, callableMemberDescriptor$Kind0, z);
    }

    @NotNull
    public TypeAliasConstructorDescriptor copy(@NotNull DeclarationDescriptor declarationDescriptor0, @NotNull Modality modality0, @NotNull DescriptorVisibility descriptorVisibility0, @NotNull Kind callableMemberDescriptor$Kind0, boolean z) {
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "newOwner");
        Intrinsics.checkNotNullParameter(modality0, "modality");
        Intrinsics.checkNotNullParameter(descriptorVisibility0, "visibility");
        Intrinsics.checkNotNullParameter(callableMemberDescriptor$Kind0, "kind");
        FunctionDescriptor functionDescriptor0 = this.newCopyBuilder().setOwner(declarationDescriptor0).setModality(modality0).setVisibility(descriptorVisibility0).setKind(callableMemberDescriptor$Kind0).setCopyOverrides(z).build();
        Intrinsics.checkNotNull(functionDescriptor0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (TypeAliasConstructorDescriptor)functionDescriptor0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public FunctionDescriptorImpl createSubstitutedCopy(DeclarationDescriptor declarationDescriptor0, FunctionDescriptor functionDescriptor0, Kind callableMemberDescriptor$Kind0, Name name0, Annotations annotations0, SourceElement sourceElement0) {
        return this.createSubstitutedCopy(declarationDescriptor0, functionDescriptor0, callableMemberDescriptor$Kind0, name0, annotations0, sourceElement0);
    }

    @NotNull
    public TypeAliasConstructorDescriptorImpl createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor0, @Nullable FunctionDescriptor functionDescriptor0, @NotNull Kind callableMemberDescriptor$Kind0, @Nullable Name name0, @NotNull Annotations annotations0, @NotNull SourceElement sourceElement0) {
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "newOwner");
        Intrinsics.checkNotNullParameter(callableMemberDescriptor$Kind0, "kind");
        Intrinsics.checkNotNullParameter(annotations0, "annotations");
        Intrinsics.checkNotNullParameter(sourceElement0, "source");
        return new TypeAliasConstructorDescriptorImpl(this.D, this.getTypeAliasDescriptor(), this.getUnderlyingConstructorDescriptor(), this, annotations0, Kind.DECLARATION, sourceElement0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    @NotNull
    public ClassDescriptor getConstructedClass() {
        ClassDescriptor classDescriptor0 = this.getUnderlyingConstructorDescriptor().getConstructedClass();
        Intrinsics.checkNotNullExpressionValue(classDescriptor0, "underlyingConstructorDescriptor.constructedClass");
        return classDescriptor0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    public ClassifierDescriptorWithTypeParameters getContainingDeclaration() {
        return this.getContainingDeclaration();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public DeclarationDescriptor getContainingDeclaration() {
        return this.getContainingDeclaration();
    }

    @NotNull
    public TypeAliasDescriptor getContainingDeclaration() {
        return this.getTypeAliasDescriptor();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public CallableDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public CallableMemberDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public DeclarationDescriptorWithSource getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public FunctionDescriptor getOriginal() {
        return this.getOriginal();
    }

    @NotNull
    public TypeAliasConstructorDescriptor getOriginal() {
        FunctionDescriptor functionDescriptor0 = super.getOriginal();
        Intrinsics.checkNotNull(functionDescriptor0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (TypeAliasConstructorDescriptor)functionDescriptor0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    @NotNull
    public KotlinType getReturnType() {
        KotlinType kotlinType0 = super.getReturnType();
        Intrinsics.checkNotNull(kotlinType0);
        return kotlinType0;
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.D;
    }

    @NotNull
    public TypeAliasDescriptor getTypeAliasDescriptor() {
        return this.E;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor
    @NotNull
    public ClassConstructorDescriptor getUnderlyingConstructorDescriptor() {
        return this.G;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    public boolean isPrimary() {
        return this.getUnderlyingConstructorDescriptor().isPrimary();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    public ConstructorDescriptor substitute(TypeSubstitutor typeSubstitutor0) {
        return this.substitute(typeSubstitutor0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public DeclarationDescriptorNonRoot substitute(TypeSubstitutor typeSubstitutor0) {
        return this.substitute(typeSubstitutor0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public FunctionDescriptor substitute(TypeSubstitutor typeSubstitutor0) {
        return this.substitute(typeSubstitutor0);
    }

    @Nullable
    public TypeAliasConstructorDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor0) {
        Intrinsics.checkNotNullParameter(typeSubstitutor0, "substitutor");
        FunctionDescriptor functionDescriptor0 = super.substitute(typeSubstitutor0);
        Intrinsics.checkNotNull(functionDescriptor0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        TypeSubstitutor typeSubstitutor1 = TypeSubstitutor.create(((TypeAliasConstructorDescriptorImpl)functionDescriptor0).getReturnType());
        Intrinsics.checkNotNullExpressionValue(typeSubstitutor1, "create(substitutedTypeAliasConstructor.returnType)");
        ClassConstructorDescriptor classConstructorDescriptor0 = this.getUnderlyingConstructorDescriptor().getOriginal().substitute(typeSubstitutor1);
        if(classConstructorDescriptor0 == null) {
            return null;
        }
        ((TypeAliasConstructorDescriptorImpl)functionDescriptor0).G = classConstructorDescriptor0;
        return (TypeAliasConstructorDescriptorImpl)functionDescriptor0;
    }
}

