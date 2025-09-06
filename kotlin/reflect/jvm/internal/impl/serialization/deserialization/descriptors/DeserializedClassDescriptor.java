package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import ef.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.CliSealedClassInheritorsProvider;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextClassReceiver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlagsUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ValueClassUtilKt;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nDeserializedClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,424:1\n288#2,2:425\n766#2:427\n857#2,2:428\n1549#2:430\n1620#2,3:431\n1549#2:434\n1620#2,3:435\n1603#2,9:438\n1855#2:447\n1856#2:449\n1612#2:450\n661#2,11:452\n1#3:448\n1#3:451\n*S KotlinDebug\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor\n*L\n136#1:425,2\n148#1:427\n148#1:428,2\n148#1:430\n148#1:431,3\n154#1:434\n154#1:435,3\n185#1:438,9\n185#1:447\n185#1:449\n185#1:450\n215#1:452,11\n185#1:448\n*E\n"})
public final class DeserializedClassDescriptor extends AbstractClassDescriptor implements DeserializedDescriptor {
    public final Class d;
    public final BinaryVersion e;
    public final SourceElement f;
    public final ClassId g;
    public final Modality h;
    public final DescriptorVisibility i;
    public final ClassKind j;
    public final DeserializationContext k;
    public final MemberScopeImpl l;
    public final c m;
    public final ScopesHolderForClass n;
    public final f o;
    public final DeclarationDescriptor p;
    public final NullableLazyValue q;
    public final NotNullLazyValue r;
    public final NullableLazyValue s;
    public final NotNullLazyValue t;
    public final NullableLazyValue u;
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class v;
    public final Annotations w;

    public DeserializedClassDescriptor(@NotNull DeserializationContext deserializationContext0, @NotNull Class protoBuf$Class0, @NotNull NameResolver nameResolver0, @NotNull BinaryVersion binaryVersion0, @NotNull SourceElement sourceElement0) {
        Intrinsics.checkNotNullParameter(deserializationContext0, "outerContext");
        Intrinsics.checkNotNullParameter(protoBuf$Class0, "classProto");
        Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
        Intrinsics.checkNotNullParameter(binaryVersion0, "metadataVersion");
        Intrinsics.checkNotNullParameter(sourceElement0, "sourceElement");
        super(deserializationContext0.getStorageManager(), NameResolverUtilKt.getClassId(nameResolver0, protoBuf$Class0.getFqName()).getShortClassName());
        this.d = protoBuf$Class0;
        this.e = binaryVersion0;
        this.f = sourceElement0;
        this.g = NameResolverUtilKt.getClassId(nameResolver0, protoBuf$Class0.getFqName());
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality protoBuf$Modality0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality)Flags.MODALITY.get(protoBuf$Class0.getFlags());
        this.h = ProtoEnumFlags.INSTANCE.modality(protoBuf$Modality0);
        Visibility protoBuf$Visibility0 = (Visibility)Flags.VISIBILITY.get(protoBuf$Class0.getFlags());
        this.i = ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, protoBuf$Visibility0);
        Kind protoBuf$Class$Kind0 = (Kind)Flags.CLASS_KIND.get(protoBuf$Class0.getFlags());
        ClassKind classKind0 = ProtoEnumFlags.INSTANCE.classKind(protoBuf$Class$Kind0);
        this.j = classKind0;
        List list0 = protoBuf$Class0.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(list0, "classProto.typeParameterList");
        TypeTable protoBuf$TypeTable0 = protoBuf$Class0.getTypeTable();
        Intrinsics.checkNotNullExpressionValue(protoBuf$TypeTable0, "classProto.typeTable");
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable0 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable(protoBuf$TypeTable0);
        VersionRequirementTable protoBuf$VersionRequirementTable0 = protoBuf$Class0.getVersionRequirementTable();
        Intrinsics.checkNotNullExpressionValue(protoBuf$VersionRequirementTable0, "classProto.versionRequirementTable");
        DeserializationContext deserializationContext1 = deserializationContext0.childContext(this, list0, nameResolver0, typeTable0, kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion.create(protoBuf$VersionRequirementTable0), binaryVersion0);
        this.k = deserializationContext1;
        ClassKind classKind1 = ClassKind.ENUM_CLASS;
        StaticScopeForKotlinEnum staticScopeForKotlinEnum0 = classKind0 == classKind1 ? new StaticScopeForKotlinEnum(deserializationContext1.getStorageManager(), this) : Empty.INSTANCE;
        this.l = staticScopeForKotlinEnum0;
        this.m = new c(this);
        StorageManager storageManager0 = deserializationContext1.getStorageManager();
        KotlinTypeRefiner kotlinTypeRefiner0 = deserializationContext1.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner();
        k k0 = new k(1, this);  // 初始化器: Lkotlin/jvm/internal/FunctionReference;-><init>(ILjava/lang/Object;)V
        this.n = ScopesHolderForClass.Companion.create(this, storageManager0, kotlinTypeRefiner0, k0);
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class protoContainer$Class0 = null;
        this.o = classKind0 == classKind1 ? new f(this) : null;
        DeclarationDescriptor declarationDescriptor0 = deserializationContext0.getContainingDeclaration();
        this.p = declarationDescriptor0;
        this.q = deserializationContext1.getStorageManager().createNullableLazyValue(new l(this));
        this.r = deserializationContext1.getStorageManager().createLazyValue(new j(this));
        this.s = deserializationContext1.getStorageManager().createNullableLazyValue(new h(this));
        this.t = deserializationContext1.getStorageManager().createLazyValue(new m(this));
        this.u = deserializationContext1.getStorageManager().createNullableLazyValue(new n(this));
        NameResolver nameResolver1 = deserializationContext1.getNameResolver();
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable1 = deserializationContext1.getTypeTable();
        DeserializedClassDescriptor deserializedClassDescriptor0 = declarationDescriptor0 instanceof DeserializedClassDescriptor ? ((DeserializedClassDescriptor)declarationDescriptor0) : null;
        if(deserializedClassDescriptor0 != null) {
            protoContainer$Class0 = deserializedClassDescriptor0.v;
        }
        this.v = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class(protoBuf$Class0, nameResolver1, typeTable1, sourceElement0, protoContainer$Class0);
        Annotations annotations0 = Flags.HAS_ANNOTATIONS.get(protoBuf$Class0.getFlags()).booleanValue() ? new NonEmptyDeserializedAnnotations(deserializationContext1.getStorageManager(), new g(this)) : Annotations.Companion.getEMPTY();
        this.w = annotations0;
    }

    public static final ClassDescriptor access$computeCompanionObjectDescriptor(DeserializedClassDescriptor deserializedClassDescriptor0) {
        Class protoBuf$Class0 = deserializedClassDescriptor0.d;
        if(protoBuf$Class0.hasCompanionObjectName()) {
            Name name0 = NameResolverUtilKt.getName(deserializedClassDescriptor0.k.getNameResolver(), protoBuf$Class0.getCompanionObjectName());
            ClassifierDescriptor classifierDescriptor0 = deserializedClassDescriptor0.b().getContributedClassifier(name0, NoLookupLocation.FROM_DESERIALIZATION);
            return classifierDescriptor0 instanceof ClassDescriptor ? ((ClassDescriptor)classifierDescriptor0) : null;
        }
        return null;
    }

    public static final Collection access$computeConstructors(DeserializedClassDescriptor deserializedClassDescriptor0) {
        DeserializationContext deserializationContext0;
        List list0 = deserializedClassDescriptor0.d.getConstructorList();
        Intrinsics.checkNotNullExpressionValue(list0, "classProto.constructorList");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            Boolean boolean0 = Flags.IS_SECONDARY.get(((Constructor)object0).getFlags());
            Intrinsics.checkNotNullExpressionValue(boolean0, "IS_SECONDARY.get(it.flags)");
            if(boolean0.booleanValue()) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(kotlin.collections.l.collectionSizeOrDefault(arrayList0, 10));
        Iterator iterator1 = arrayList0.iterator();
        while(true) {
            boolean z = iterator1.hasNext();
            deserializationContext0 = deserializedClassDescriptor0.k;
            if(!z) {
                break;
            }
            Object object1 = iterator1.next();
            Intrinsics.checkNotNullExpressionValue(((Constructor)object1), "it");
            arrayList1.add(deserializationContext0.getMemberDeserializer().loadConstructor(((Constructor)object1), false));
        }
        return CollectionsKt___CollectionsKt.plus(CollectionsKt___CollectionsKt.plus(arrayList1, CollectionsKt__CollectionsKt.listOfNotNull(deserializedClassDescriptor0.getUnsubstitutedPrimaryConstructor())), deserializationContext0.getComponents().getAdditionalClassPartsProvider().getConstructors(deserializedClassDescriptor0));
    }

    public static final ClassConstructorDescriptor access$computePrimaryConstructor(DeserializedClassDescriptor deserializedClassDescriptor0) {
        if(deserializedClassDescriptor0.j.isSingleton()) {
            ClassConstructorDescriptor classConstructorDescriptor0 = DescriptorFactory.createPrimaryConstructorForObject(deserializedClassDescriptor0, SourceElement.NO_SOURCE);
            ((FunctionDescriptorImpl)classConstructorDescriptor0).setReturnType(deserializedClassDescriptor0.getDefaultType());
            return classConstructorDescriptor0;
        }
        List list0 = deserializedClassDescriptor0.d.getConstructorList();
        Intrinsics.checkNotNullExpressionValue(list0, "classProto.constructorList");
        for(Object object0: list0) {
            if(!Flags.IS_SECONDARY.get(((Constructor)object0).getFlags()).booleanValue()) {
                return ((Constructor)object0) == null ? null : deserializedClassDescriptor0.k.getMemberDeserializer().loadConstructor(((Constructor)object0), true);
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public static final Collection access$computeSubclassesForSealedClass(DeserializedClassDescriptor deserializedClassDescriptor0) {
        if(deserializedClassDescriptor0.h != Modality.SEALED) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = deserializedClassDescriptor0.d.getSealedSubclassFqNameList();
        Intrinsics.checkNotNullExpressionValue(list0, "fqNames");
        if(!list0.isEmpty()) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                Intrinsics.checkNotNullExpressionValue(((Integer)object0), "index");
                ClassId classId0 = NameResolverUtilKt.getClassId(deserializedClassDescriptor0.k.getNameResolver(), ((int)(((Integer)object0))));
                ClassDescriptor classDescriptor0 = deserializedClassDescriptor0.k.getComponents().deserializeClass(classId0);
                if(classDescriptor0 != null) {
                    arrayList0.add(classDescriptor0);
                }
            }
            return arrayList0;
        }
        return CliSealedClassInheritorsProvider.INSTANCE.computeSealedSubclasses(deserializedClassDescriptor0, false);
    }

    public static final ValueClassRepresentation access$computeValueClassRepresentation(DeserializedClassDescriptor deserializedClassDescriptor0) {
        if(deserializedClassDescriptor0.isInline() || deserializedClassDescriptor0.isValue()) {
            i i0 = new i(1, deserializedClassDescriptor0.k.getTypeDeserializer());  // 初始化器: Lkotlin/jvm/internal/FunctionReference;-><init>(ILjava/lang/Object;)V
            a a0 = new a(1, deserializedClassDescriptor0, 2);
            ValueClassRepresentation valueClassRepresentation0 = ValueClassUtilKt.loadValueClassRepresentation(deserializedClassDescriptor0.d, deserializedClassDescriptor0.k.getNameResolver(), deserializedClassDescriptor0.k.getTypeTable(), i0, a0);
            if(valueClassRepresentation0 != null) {
                return valueClassRepresentation0;
            }
            if(!deserializedClassDescriptor0.e.isAtLeast(1, 5, 1)) {
                ClassConstructorDescriptor classConstructorDescriptor0 = deserializedClassDescriptor0.getUnsubstitutedPrimaryConstructor();
                if(classConstructorDescriptor0 == null) {
                    throw new IllegalStateException(("Inline class has no primary constructor: " + deserializedClassDescriptor0).toString());
                }
                List list0 = classConstructorDescriptor0.getValueParameters();
                Intrinsics.checkNotNullExpressionValue(list0, "constructor.valueParameters");
                Name name0 = ((ValueParameterDescriptor)CollectionsKt___CollectionsKt.first(list0)).getName();
                Intrinsics.checkNotNullExpressionValue(name0, "constructor.valueParameters.first().name");
                SimpleType simpleType0 = deserializedClassDescriptor0.c(name0);
                if(simpleType0 == null) {
                    throw new IllegalStateException(("Value class has no underlying property: " + deserializedClassDescriptor0).toString());
                }
                return new InlineClassRepresentation(name0, simpleType0);
            }
        }
        return null;
    }

    public static final SimpleType access$getValueClassPropertyType(DeserializedClassDescriptor deserializedClassDescriptor0, Name name0) {
        return deserializedClassDescriptor0.c(name0);
    }

    public final b b() {
        KotlinTypeRefiner kotlinTypeRefiner0 = this.k.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner();
        return (b)this.n.getScope(kotlinTypeRefiner0);
    }

    public final SimpleType c(Name name0) {
        KotlinType kotlinType0 = null;
        boolean z = false;
        Object object0 = null;
        for(Object object1: this.b().getContributedVariables(name0, NoLookupLocation.FROM_DESERIALIZATION)) {
            if(((PropertyDescriptor)object1).getExtensionReceiverParameter() != null) {
                continue;
            }
            if(!z) {
                z = true;
                object0 = object1;
                continue;
            }
            object0 = null;
            goto label_15;
        }
        if(!z) {
            object0 = null;
        }
    label_15:
        if(((PropertyDescriptor)object0) != null) {
            kotlinType0 = ((PropertyDescriptor)object0).getType();
        }
        return (SimpleType)kotlinType0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.w;
    }

    @NotNull
    public final DeserializationContext getC() {
        return this.k;
    }

    @NotNull
    public final Class getClassProto() {
        return this.d;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    public ClassDescriptor getCompanionObjectDescriptor() {
        return (ClassDescriptor)this.s.invoke();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Collection getConstructors() {
        return (Collection)this.r.invoke();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public DeclarationDescriptor getContainingDeclaration() {
        return this.p;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor
    @NotNull
    public List getContextReceivers() {
        DeserializationContext deserializationContext0 = this.k;
        Iterable iterable0 = ProtoTypeTableUtilKt.contextReceiverTypes(this.d, deserializationContext0.getTypeTable());
        List list0 = new ArrayList(kotlin.collections.l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            KotlinType kotlinType0 = deserializationContext0.getTypeDeserializer().type(((Type)object0));
            list0.add(new ReceiverParameterDescriptorImpl(this.getThisAsReceiverParameter(), new ContextClassReceiver(this, kotlinType0, null, null), Annotations.Companion.getEMPTY()));
        }
        return list0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public List getDeclaredTypeParameters() {
        return this.k.getTypeDeserializer().getOwnTypeParameters();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ClassKind getKind() {
        return this.j;
    }

    @NotNull
    public final BinaryVersion getMetadataVersion() {
        return this.e;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Modality getModality() {
        return this.h;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Collection getSealedSubclasses() {
        return (Collection)this.t.invoke();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        return this.f;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getStaticScope() {
        return this.getStaticScope();
    }

    @NotNull
    public MemberScopeImpl getStaticScope() {
        return this.l;
    }

    @NotNull
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class getThisAsProtoContainer$deserialization() {
        return this.v;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public TypeConstructor getTypeConstructor() {
        return this.m;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    public MemberScope getUnsubstitutedMemberScope(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
        return this.n.getScope(kotlinTypeRefiner0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    public ClassConstructorDescriptor getUnsubstitutedPrimaryConstructor() {
        return (ClassConstructorDescriptor)this.q.invoke();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    public ValueClassRepresentation getValueClassRepresentation() {
        return (ValueClassRepresentation)this.u.invoke();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public DescriptorVisibility getVisibility() {
        return this.i;
    }

    public final boolean hasNestedClass$deserialization(@NotNull Name name0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        return this.b().getClassNames$deserialization().contains(name0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return Flags.CLASS_KIND.get(this.d.getFlags()) == Kind.COMPANION_OBJECT;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        Boolean boolean0 = Flags.IS_DATA.get(this.d.getFlags());
        Intrinsics.checkNotNullExpressionValue(boolean0, "IS_DATA.get(classProto.flags)");
        return boolean0.booleanValue();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        Boolean boolean0 = Flags.IS_EXPECT_CLASS.get(this.d.getFlags());
        Intrinsics.checkNotNullExpressionValue(boolean0, "IS_EXPECT_CLASS.get(classProto.flags)");
        return boolean0.booleanValue();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        Boolean boolean0 = Flags.IS_EXTERNAL_CLASS.get(this.d.getFlags());
        Intrinsics.checkNotNullExpressionValue(boolean0, "IS_EXTERNAL_CLASS.get(classProto.flags)");
        return boolean0.booleanValue();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isFun() {
        Boolean boolean0 = Flags.IS_FUN_INTERFACE.get(this.d.getFlags());
        Intrinsics.checkNotNullExpressionValue(boolean0, "IS_FUN_INTERFACE.get(classProto.flags)");
        return boolean0.booleanValue();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        Boolean boolean0 = Flags.IS_VALUE_CLASS.get(this.d.getFlags());
        Intrinsics.checkNotNullExpressionValue(boolean0, "IS_VALUE_CLASS.get(classProto.flags)");
        return boolean0.booleanValue() && this.e.isAtMost(1, 4, 1);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        Boolean boolean0 = Flags.IS_INNER.get(this.d.getFlags());
        Intrinsics.checkNotNullExpressionValue(boolean0, "IS_INNER.get(classProto.flags)");
        return boolean0.booleanValue();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        Boolean boolean0 = Flags.IS_VALUE_CLASS.get(this.d.getFlags());
        Intrinsics.checkNotNullExpressionValue(boolean0, "IS_VALUE_CLASS.get(classProto.flags)");
        return boolean0.booleanValue() && this.e.isAtLeast(1, 4, 2);
    }

    // 去混淆评级： 低(20)
    @Override
    @NotNull
    public String toString() {
        return "deserialized " + (this.isExpect() ? "expect " : "") + "class " + this.getName();
    }
}

