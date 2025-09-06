package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import androidx.room.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorWithInitializerImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nMemberDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/MemberDeserializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,371:1\n1#2:372\n1#2:391\n1559#3:373\n1590#3,4:374\n1569#3,11:378\n1864#3,2:389\n1866#3:392\n1580#3:393\n1549#3:394\n1620#3,3:395\n1559#3:398\n1590#3,4:399\n*S KotlinDebug\n*F\n+ 1 MemberDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/MemberDeserializer\n*L\n215#1:391\n63#1:373\n63#1:374,4\n215#1:378,11\n215#1:389,2\n215#1:392\n215#1:393\n243#1:394\n243#1:395,3\n327#1:398\n327#1:399,4\n*E\n"})
public final class MemberDeserializer {
    public final DeserializationContext a;
    public final AnnotationDeserializer b;

    public MemberDeserializer(@NotNull DeserializationContext deserializationContext0) {
        Intrinsics.checkNotNullParameter(deserializationContext0, "c");
        super();
        this.a = deserializationContext0;
        this.b = new AnnotationDeserializer(deserializationContext0.getComponents().getModuleDescriptor(), deserializationContext0.getComponents().getNotFoundClasses());
    }

    public final ProtoContainer a(DeclarationDescriptor declarationDescriptor0) {
        if(declarationDescriptor0 instanceof PackageFragmentDescriptor) {
            return new Package(((PackageFragmentDescriptor)declarationDescriptor0).getFqName(), this.a.getNameResolver(), this.a.getTypeTable(), this.a.getContainerSource());
        }
        return declarationDescriptor0 instanceof DeserializedClassDescriptor ? ((DeserializedClassDescriptor)declarationDescriptor0).getThisAsProtoContainer$deserialization() : null;
    }

    public final Annotations b(ExtendableMessage generatedMessageLite$ExtendableMessage0, int v, AnnotatedCallableKind annotatedCallableKind0) {
        return !Flags.HAS_ANNOTATIONS.get(v).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.a.getStorageManager(), new d(this, generatedMessageLite$ExtendableMessage0, annotatedCallableKind0, 0));
    }

    public final Annotations c(Property protoBuf$Property0, boolean z) {
        return !Flags.HAS_ANNOTATIONS.get(protoBuf$Property0.getFlags()).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.a.getStorageManager(), new e(this, z, protoBuf$Property0));
    }

    public final List d(List list0, ExtendableMessage generatedMessageLite$ExtendableMessage0, AnnotatedCallableKind annotatedCallableKind0) {
        DeserializationContext deserializationContext0 = this.a;
        DeclarationDescriptor declarationDescriptor0 = deserializationContext0.getContainingDeclaration();
        Intrinsics.checkNotNull(declarationDescriptor0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        DeclarationDescriptor declarationDescriptor1 = ((CallableDescriptor)declarationDescriptor0).getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(declarationDescriptor1, "callableDescriptor.containingDeclaration");
        ProtoContainer protoContainer0 = this.a(declarationDescriptor1);
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        int v = 0;
        for(Object object0: list0) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            int v1 = ((ValueParameter)object0).hasFlags() ? ((ValueParameter)object0).getFlags() : 0;
            Annotations annotations0 = protoContainer0 == null || !a.y(Flags.HAS_ANNOTATIONS, v1, "HAS_ANNOTATIONS.get(flags)") ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(deserializationContext0.getStorageManager(), new j(this, protoContainer0, generatedMessageLite$ExtendableMessage0, annotatedCallableKind0, v, ((ValueParameter)object0)));
            Name name0 = NameResolverUtilKt.getName(deserializationContext0.getNameResolver(), ((ValueParameter)object0).getName());
            KotlinType kotlinType0 = deserializationContext0.getTypeDeserializer().type(ProtoTypeTableUtilKt.type(((ValueParameter)object0), deserializationContext0.getTypeTable()));
            boolean z = a.y(Flags.DECLARES_DEFAULT_VALUE, v1, "DECLARES_DEFAULT_VALUE.get(flags)");
            boolean z1 = a.y(Flags.IS_CROSSINLINE, v1, "IS_CROSSINLINE.get(flags)");
            boolean z2 = a.y(Flags.IS_NOINLINE, v1, "IS_NOINLINE.get(flags)");
            Type protoBuf$Type0 = ProtoTypeTableUtilKt.varargElementType(((ValueParameter)object0), deserializationContext0.getTypeTable());
            KotlinType kotlinType1 = protoBuf$Type0 == null ? null : deserializationContext0.getTypeDeserializer().type(protoBuf$Type0);
            Intrinsics.checkNotNullExpressionValue(SourceElement.NO_SOURCE, "NO_SOURCE");
            arrayList0.add(new ValueParameterDescriptorImpl(((CallableDescriptor)declarationDescriptor0), null, v, annotations0, name0, kotlinType0, z, z1, z2, kotlinType1, SourceElement.NO_SOURCE));
            ++v;
        }
        return CollectionsKt___CollectionsKt.toList(arrayList0);
    }

    @NotNull
    public final ClassConstructorDescriptor loadConstructor(@NotNull Constructor protoBuf$Constructor0, boolean z) {
        Intrinsics.checkNotNullParameter(protoBuf$Constructor0, "proto");
        DeclarationDescriptor declarationDescriptor0 = this.a.getContainingDeclaration();
        Intrinsics.checkNotNull(declarationDescriptor0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor0 = new DeserializedClassConstructorDescriptor(((ClassDescriptor)declarationDescriptor0), null, this.b(protoBuf$Constructor0, protoBuf$Constructor0.getFlags(), AnnotatedCallableKind.FUNCTION), z, Kind.DECLARATION, protoBuf$Constructor0, this.a.getNameResolver(), this.a.getTypeTable(), this.a.getVersionRequirementTable(), this.a.getContainerSource(), null, 0x400, null);
        MemberDeserializer memberDeserializer0 = DeserializationContext.childContext$default(this.a, deserializedClassConstructorDescriptor0, CollectionsKt__CollectionsKt.emptyList(), null, null, null, null, 60, null).getMemberDeserializer();
        List list0 = protoBuf$Constructor0.getValueParameterList();
        Intrinsics.checkNotNullExpressionValue(list0, "proto.valueParameterList");
        List list1 = memberDeserializer0.d(list0, protoBuf$Constructor0, AnnotatedCallableKind.FUNCTION);
        Visibility protoBuf$Visibility0 = (Visibility)Flags.VISIBILITY.get(protoBuf$Constructor0.getFlags());
        deserializedClassConstructorDescriptor0.initialize(list1, ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, protoBuf$Visibility0));
        deserializedClassConstructorDescriptor0.setReturnType(((ClassDescriptor)declarationDescriptor0).getDefaultType());
        deserializedClassConstructorDescriptor0.setExpect(((ClassDescriptor)declarationDescriptor0).isExpect());
        deserializedClassConstructorDescriptor0.setHasStableParameterNames(!Flags.IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES.get(protoBuf$Constructor0.getFlags()).booleanValue());
        return deserializedClassConstructorDescriptor0;
    }

    @NotNull
    public final SimpleFunctionDescriptor loadFunction(@NotNull Function protoBuf$Function0) {
        ReceiverParameterDescriptor receiverParameterDescriptor0;
        SimpleFunctionDescriptor simpleFunctionDescriptor0;
        int v;
        Intrinsics.checkNotNullParameter(protoBuf$Function0, "proto");
        if(protoBuf$Function0.hasFlags()) {
            v = protoBuf$Function0.getFlags();
        }
        else {
            int v1 = protoBuf$Function0.getOldFlags();
            v = (v1 >> 8 << 6) + (v1 & 0x3F);
        }
        AnnotatedCallableKind annotatedCallableKind0 = AnnotatedCallableKind.FUNCTION;
        Annotations annotations0 = this.b(protoBuf$Function0, v, annotatedCallableKind0);
        boolean z = ProtoTypeTableUtilKt.hasReceiver(protoBuf$Function0);
        DeserializationContext deserializationContext0 = this.a;
        Annotations annotations1 = z ? new DeserializedAnnotations(deserializationContext0.getStorageManager(), new d(this, protoBuf$Function0, annotatedCallableKind0, 1)) : Annotations.Companion.getEMPTY();
        VersionRequirementTable versionRequirementTable0 = Intrinsics.areEqual(DescriptorUtilsKt.getFqNameSafe(deserializationContext0.getContainingDeclaration()).child(NameResolverUtilKt.getName(deserializationContext0.getNameResolver(), protoBuf$Function0.getName())), SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME) ? VersionRequirementTable.Companion.getEMPTY() : deserializationContext0.getVersionRequirementTable();
        Name name0 = NameResolverUtilKt.getName(deserializationContext0.getNameResolver(), protoBuf$Function0.getName());
        MemberKind protoBuf$MemberKind0 = (MemberKind)Flags.MEMBER_KIND.get(v);
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor0 = new DeserializedSimpleFunctionDescriptor(deserializationContext0.getContainingDeclaration(), null, annotations0, name0, ProtoEnumFlagsUtilsKt.memberKind(ProtoEnumFlags.INSTANCE, protoBuf$MemberKind0), protoBuf$Function0, deserializationContext0.getNameResolver(), deserializationContext0.getTypeTable(), versionRequirementTable0, deserializationContext0.getContainerSource(), null, 0x400, null);
        List list0 = protoBuf$Function0.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(list0, "proto.typeParameterList");
        DeserializationContext deserializationContext1 = DeserializationContext.childContext$default(this.a, deserializedSimpleFunctionDescriptor0, list0, null, null, null, null, 60, null);
        Type protoBuf$Type0 = ProtoTypeTableUtilKt.receiverType(protoBuf$Function0, deserializationContext0.getTypeTable());
        if(protoBuf$Type0 == null) {
            simpleFunctionDescriptor0 = deserializedSimpleFunctionDescriptor0;
            receiverParameterDescriptor0 = null;
        }
        else {
            KotlinType kotlinType0 = deserializationContext1.getTypeDeserializer().type(protoBuf$Type0);
            if(kotlinType0 == null) {
                simpleFunctionDescriptor0 = deserializedSimpleFunctionDescriptor0;
                receiverParameterDescriptor0 = null;
            }
            else {
                simpleFunctionDescriptor0 = deserializedSimpleFunctionDescriptor0;
                receiverParameterDescriptor0 = DescriptorFactory.createExtensionReceiverParameterForCallable(simpleFunctionDescriptor0, kotlinType0, annotations1);
            }
        }
        DeclarationDescriptor declarationDescriptor0 = deserializationContext0.getContainingDeclaration();
        ClassDescriptor classDescriptor0 = declarationDescriptor0 instanceof ClassDescriptor ? ((ClassDescriptor)declarationDescriptor0) : null;
        ReceiverParameterDescriptor receiverParameterDescriptor1 = classDescriptor0 == null ? null : classDescriptor0.getThisAsReceiverParameter();
        Iterable iterable0 = ProtoTypeTableUtilKt.contextReceiverTypes(protoBuf$Function0, deserializationContext0.getTypeTable());
        ArrayList arrayList0 = new ArrayList();
        int v2 = 0;
        for(Object object0: iterable0) {
            if(v2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            ReceiverParameterDescriptor receiverParameterDescriptor2 = DescriptorFactory.createContextReceiverParameterForCallable(simpleFunctionDescriptor0, deserializationContext1.getTypeDeserializer().type(((Type)object0)), null, Annotations.Companion.getEMPTY(), v2);
            if(receiverParameterDescriptor2 != null) {
                arrayList0.add(receiverParameterDescriptor2);
            }
            ++v2;
        }
        List list1 = deserializationContext1.getTypeDeserializer().getOwnTypeParameters();
        List list2 = protoBuf$Function0.getValueParameterList();
        Intrinsics.checkNotNullExpressionValue(list2, "proto.valueParameterList");
        List list3 = deserializationContext1.getMemberDeserializer().d(list2, protoBuf$Function0, AnnotatedCallableKind.FUNCTION);
        KotlinType kotlinType1 = deserializationContext1.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(protoBuf$Function0, deserializationContext0.getTypeTable()));
        Modality protoBuf$Modality0 = (Modality)Flags.MODALITY.get(v);
        kotlin.reflect.jvm.internal.impl.descriptors.Modality modality0 = ProtoEnumFlags.INSTANCE.modality(protoBuf$Modality0);
        Visibility protoBuf$Visibility0 = (Visibility)Flags.VISIBILITY.get(v);
        ((SimpleFunctionDescriptorImpl)simpleFunctionDescriptor0).initialize(receiverParameterDescriptor0, receiverParameterDescriptor1, arrayList0, list1, list3, kotlinType1, modality0, ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, protoBuf$Visibility0), x.emptyMap());
        Boolean boolean0 = Flags.IS_OPERATOR.get(v);
        Intrinsics.checkNotNullExpressionValue(boolean0, "IS_OPERATOR.get(flags)");
        ((FunctionDescriptorImpl)simpleFunctionDescriptor0).setOperator(boolean0.booleanValue());
        Boolean boolean1 = Flags.IS_INFIX.get(v);
        Intrinsics.checkNotNullExpressionValue(boolean1, "IS_INFIX.get(flags)");
        ((FunctionDescriptorImpl)simpleFunctionDescriptor0).setInfix(boolean1.booleanValue());
        Boolean boolean2 = Flags.IS_EXTERNAL_FUNCTION.get(v);
        Intrinsics.checkNotNullExpressionValue(boolean2, "IS_EXTERNAL_FUNCTION.get(flags)");
        ((FunctionDescriptorImpl)simpleFunctionDescriptor0).setExternal(boolean2.booleanValue());
        Boolean boolean3 = Flags.IS_INLINE.get(v);
        Intrinsics.checkNotNullExpressionValue(boolean3, "IS_INLINE.get(flags)");
        ((FunctionDescriptorImpl)simpleFunctionDescriptor0).setInline(boolean3.booleanValue());
        Boolean boolean4 = Flags.IS_TAILREC.get(v);
        Intrinsics.checkNotNullExpressionValue(boolean4, "IS_TAILREC.get(flags)");
        ((FunctionDescriptorImpl)simpleFunctionDescriptor0).setTailrec(boolean4.booleanValue());
        Boolean boolean5 = Flags.IS_SUSPEND.get(v);
        Intrinsics.checkNotNullExpressionValue(boolean5, "IS_SUSPEND.get(flags)");
        ((FunctionDescriptorImpl)simpleFunctionDescriptor0).setSuspend(boolean5.booleanValue());
        Boolean boolean6 = Flags.IS_EXPECT_FUNCTION.get(v);
        Intrinsics.checkNotNullExpressionValue(boolean6, "IS_EXPECT_FUNCTION.get(flags)");
        ((FunctionDescriptorImpl)simpleFunctionDescriptor0).setExpect(boolean6.booleanValue());
        ((FunctionDescriptorImpl)simpleFunctionDescriptor0).setHasStableParameterNames(!Flags.IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES.get(v).booleanValue());
        Pair pair0 = deserializationContext0.getComponents().getContractDeserializer().deserializeContractFromFunction(protoBuf$Function0, simpleFunctionDescriptor0, deserializationContext0.getTypeTable(), deserializationContext1.getTypeDeserializer());
        if(pair0 != null) {
            ((FunctionDescriptorImpl)simpleFunctionDescriptor0).putInUserDataMap(((UserDataKey)pair0.getFirst()), pair0.getSecond());
        }
        return simpleFunctionDescriptor0;
    }

    @NotNull
    public final PropertyDescriptor loadProperty(@NotNull Property protoBuf$Property0) {
        PropertySetterDescriptorImpl propertySetterDescriptorImpl1;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl2;
        PropertyDescriptor propertyDescriptor0;
        FlagField flags$FlagField3;
        FlagField flags$FlagField2;
        ReceiverParameterDescriptor receiverParameterDescriptor1;
        DeserializedPropertyDescriptor deserializedPropertyDescriptor1;
        int v;
        Intrinsics.checkNotNullParameter(protoBuf$Property0, "proto");
        if(protoBuf$Property0.hasFlags()) {
            v = protoBuf$Property0.getFlags();
        }
        else {
            int v1 = protoBuf$Property0.getOldFlags();
            v = (v1 >> 8 << 6) + (v1 & 0x3F);
        }
        Annotations annotations0 = this.b(protoBuf$Property0, v, AnnotatedCallableKind.PROPERTY);
        Modality protoBuf$Modality0 = (Modality)Flags.MODALITY.get(v);
        kotlin.reflect.jvm.internal.impl.descriptors.Modality modality0 = ProtoEnumFlags.INSTANCE.modality(protoBuf$Modality0);
        Visibility protoBuf$Visibility0 = (Visibility)Flags.VISIBILITY.get(v);
        DescriptorVisibility descriptorVisibility0 = ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, protoBuf$Visibility0);
        boolean z = a.y(Flags.IS_VAR, v, "IS_VAR.get(flags)");
        Name name0 = NameResolverUtilKt.getName(this.a.getNameResolver(), protoBuf$Property0.getName());
        MemberKind protoBuf$MemberKind0 = (MemberKind)Flags.MEMBER_KIND.get(v);
        Kind callableMemberDescriptor$Kind0 = ProtoEnumFlagsUtilsKt.memberKind(ProtoEnumFlags.INSTANCE, protoBuf$MemberKind0);
        boolean z1 = a.y(Flags.IS_LATEINIT, v, "IS_LATEINIT.get(flags)");
        boolean z2 = a.y(Flags.IS_CONST, v, "IS_CONST.get(flags)");
        boolean z3 = a.y(Flags.IS_EXTERNAL_PROPERTY, v, "IS_EXTERNAL_PROPERTY.get(flags)");
        boolean z4 = a.y(Flags.IS_DELEGATED, v, "IS_DELEGATED.get(flags)");
        DeserializationContext deserializationContext0 = this.a;
        boolean z5 = a.y(Flags.IS_EXPECT_PROPERTY, v, "IS_EXPECT_PROPERTY.get(flags)");
        DeserializedPropertyDescriptor deserializedPropertyDescriptor0 = new DeserializedPropertyDescriptor(this.a.getContainingDeclaration(), null, annotations0, modality0, descriptorVisibility0, z, name0, callableMemberDescriptor$Kind0, z1, z2, z3, z4, z5, protoBuf$Property0, deserializationContext0.getNameResolver(), deserializationContext0.getTypeTable(), deserializationContext0.getVersionRequirementTable(), deserializationContext0.getContainerSource());
        List list0 = protoBuf$Property0.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(list0, "proto.typeParameterList");
        DeserializationContext deserializationContext1 = DeserializationContext.childContext$default(this.a, deserializedPropertyDescriptor0, list0, null, null, null, null, 60, null);
        boolean z6 = a.y(Flags.HAS_GETTER, v, "HAS_GETTER.get(flags)");
        Annotations annotations1 = !z6 || !ProtoTypeTableUtilKt.hasReceiver(protoBuf$Property0) ? Annotations.Companion.getEMPTY() : new DeserializedAnnotations(deserializationContext0.getStorageManager(), new d(this, protoBuf$Property0, AnnotatedCallableKind.PROPERTY_GETTER, 1));
        KotlinType kotlinType0 = deserializationContext1.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(protoBuf$Property0, deserializationContext0.getTypeTable()));
        List list1 = deserializationContext1.getTypeDeserializer().getOwnTypeParameters();
        DeclarationDescriptor declarationDescriptor0 = deserializationContext0.getContainingDeclaration();
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl0 = null;
        ClassDescriptor classDescriptor0 = declarationDescriptor0 instanceof ClassDescriptor ? ((ClassDescriptor)declarationDescriptor0) : null;
        ReceiverParameterDescriptor receiverParameterDescriptor0 = classDescriptor0 == null ? null : classDescriptor0.getThisAsReceiverParameter();
        Type protoBuf$Type0 = ProtoTypeTableUtilKt.receiverType(protoBuf$Property0, deserializationContext0.getTypeTable());
        if(protoBuf$Type0 == null) {
            deserializedPropertyDescriptor1 = deserializedPropertyDescriptor0;
            receiverParameterDescriptor1 = null;
        }
        else {
            KotlinType kotlinType1 = deserializationContext1.getTypeDeserializer().type(protoBuf$Type0);
            if(kotlinType1 == null) {
                deserializedPropertyDescriptor1 = deserializedPropertyDescriptor0;
                receiverParameterDescriptor1 = null;
            }
            else {
                deserializedPropertyDescriptor1 = deserializedPropertyDescriptor0;
                receiverParameterDescriptor1 = DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedPropertyDescriptor1, kotlinType1, annotations1);
            }
        }
        Iterable iterable0 = ProtoTypeTableUtilKt.contextReceiverTypes(protoBuf$Property0, deserializationContext0.getTypeTable());
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        int v2 = 0;
        for(Object object0: iterable0) {
            if(v2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList0.add(DescriptorFactory.createContextReceiverParameterForCallable(deserializedPropertyDescriptor1, deserializationContext1.getTypeDeserializer().type(((Type)object0)), null, Annotations.Companion.getEMPTY(), v2));
            ++v2;
        }
        deserializedPropertyDescriptor1.setType(kotlinType0, list1, receiverParameterDescriptor0, receiverParameterDescriptor1, arrayList0);
        boolean z7 = a.y(Flags.HAS_ANNOTATIONS, v, "HAS_ANNOTATIONS.get(flags)");
        FlagField flags$FlagField0 = Flags.VISIBILITY;
        Object object1 = flags$FlagField0.get(v);
        FlagField flags$FlagField1 = Flags.MODALITY;
        int v3 = Flags.getAccessorFlags(z7, ((Visibility)object1), ((Modality)flags$FlagField1.get(v)), false, false, false);
        if(z6) {
            int v4 = protoBuf$Property0.hasGetterFlags() ? protoBuf$Property0.getGetterFlags() : v3;
            boolean z8 = a.y(Flags.IS_NOT_DEFAULT, v4, "IS_NOT_DEFAULT.get(getterFlags)");
            boolean z9 = a.y(Flags.IS_EXTERNAL_ACCESSOR, v4, "IS_EXTERNAL_ACCESSOR.get(getterFlags)");
            boolean z10 = a.y(Flags.IS_INLINE_ACCESSOR, v4, "IS_INLINE_ACCESSOR.get(getterFlags)");
            Annotations annotations2 = this.b(protoBuf$Property0, v4, AnnotatedCallableKind.PROPERTY_GETTER);
            if(z8) {
                Modality protoBuf$Modality1 = (Modality)flags$FlagField1.get(v4);
                kotlin.reflect.jvm.internal.impl.descriptors.Modality modality1 = ProtoEnumFlags.INSTANCE.modality(protoBuf$Modality1);
                Visibility protoBuf$Visibility1 = (Visibility)flags$FlagField0.get(v4);
                flags$FlagField2 = flags$FlagField0;
                flags$FlagField3 = flags$FlagField1;
                propertyDescriptor0 = deserializedPropertyDescriptor1;
                propertyGetterDescriptorImpl0 = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor1, annotations2, modality1, ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, protoBuf$Visibility1), false, z9, z10, deserializedPropertyDescriptor1.getKind(), null, SourceElement.NO_SOURCE);
            }
            else {
                flags$FlagField2 = flags$FlagField0;
                flags$FlagField3 = flags$FlagField1;
                propertyDescriptor0 = deserializedPropertyDescriptor1;
                PropertyGetterDescriptorImpl propertyGetterDescriptorImpl1 = DescriptorFactory.createDefaultGetter(propertyDescriptor0, annotations2);
                Intrinsics.checkNotNullExpressionValue(propertyGetterDescriptorImpl1, "{\n                Descri…nnotations)\n            }");
                propertyGetterDescriptorImpl0 = propertyGetterDescriptorImpl1;
            }
            propertyGetterDescriptorImpl0.initialize(((PropertyDescriptorImpl)propertyDescriptor0).getReturnType());
        }
        else {
            flags$FlagField2 = flags$FlagField0;
            flags$FlagField3 = flags$FlagField1;
            propertyDescriptor0 = deserializedPropertyDescriptor1;
        }
        if(a.y(Flags.HAS_SETTER, v, "HAS_SETTER.get(flags)")) {
            if(protoBuf$Property0.hasSetterFlags()) {
                v3 = protoBuf$Property0.getSetterFlags();
            }
            boolean z11 = a.y(Flags.IS_NOT_DEFAULT, v3, "IS_NOT_DEFAULT.get(setterFlags)");
            boolean z12 = a.y(Flags.IS_EXTERNAL_ACCESSOR, v3, "IS_EXTERNAL_ACCESSOR.get(setterFlags)");
            boolean z13 = a.y(Flags.IS_INLINE_ACCESSOR, v3, "IS_INLINE_ACCESSOR.get(setterFlags)");
            AnnotatedCallableKind annotatedCallableKind0 = AnnotatedCallableKind.PROPERTY_SETTER;
            Annotations annotations3 = this.b(protoBuf$Property0, v3, annotatedCallableKind0);
            if(z11) {
                Modality protoBuf$Modality2 = (Modality)flags$FlagField3.get(v3);
                kotlin.reflect.jvm.internal.impl.descriptors.Modality modality2 = ProtoEnumFlags.INSTANCE.modality(protoBuf$Modality2);
                Visibility protoBuf$Visibility2 = (Visibility)flags$FlagField2.get(v3);
                propertyGetterDescriptorImpl2 = propertyGetterDescriptorImpl0;
                PropertySetterDescriptorImpl propertySetterDescriptorImpl0 = new PropertySetterDescriptorImpl(propertyDescriptor0, annotations3, modality2, ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, protoBuf$Visibility2), false, z12, z13, ((PropertyDescriptorImpl)propertyDescriptor0).getKind(), null, SourceElement.NO_SOURCE);
                propertySetterDescriptorImpl0.initialize(((ValueParameterDescriptor)CollectionsKt___CollectionsKt.single(DeserializationContext.childContext$default(deserializationContext1, propertySetterDescriptorImpl0, CollectionsKt__CollectionsKt.emptyList(), null, null, null, null, 60, null).getMemberDeserializer().d(k.listOf(protoBuf$Property0.getSetterValueParameter()), protoBuf$Property0, annotatedCallableKind0))));
                propertySetterDescriptorImpl1 = propertySetterDescriptorImpl0;
            }
            else {
                propertyGetterDescriptorImpl2 = propertyGetterDescriptorImpl0;
                propertySetterDescriptorImpl1 = DescriptorFactory.createDefaultSetter(propertyDescriptor0, annotations3, Annotations.Companion.getEMPTY());
                Intrinsics.checkNotNullExpressionValue(propertySetterDescriptorImpl1, "{\n                Descri…          )\n            }");
            }
        }
        else {
            propertyGetterDescriptorImpl2 = propertyGetterDescriptorImpl0;
            propertySetterDescriptorImpl1 = null;
        }
        if(a.y(Flags.HAS_CONSTANT, v, "HAS_CONSTANT.get(flags)")) {
            ((VariableDescriptorWithInitializerImpl)propertyDescriptor0).setCompileTimeInitializerFactory(new g(this, protoBuf$Property0, ((DeserializedPropertyDescriptor)propertyDescriptor0)));
        }
        DeclarationDescriptor declarationDescriptor1 = deserializationContext0.getContainingDeclaration();
        ClassDescriptor classDescriptor1 = declarationDescriptor1 instanceof ClassDescriptor ? ((ClassDescriptor)declarationDescriptor1) : null;
        if((classDescriptor1 == null ? null : classDescriptor1.getKind()) == ClassKind.ANNOTATION_CLASS) {
            ((VariableDescriptorWithInitializerImpl)propertyDescriptor0).setCompileTimeInitializerFactory(new i(this, protoBuf$Property0, ((DeserializedPropertyDescriptor)propertyDescriptor0)));
        }
        ((PropertyDescriptorImpl)propertyDescriptor0).initialize(propertyGetterDescriptorImpl2, propertySetterDescriptorImpl1, new FieldDescriptorImpl(this.c(protoBuf$Property0, false), propertyDescriptor0), new FieldDescriptorImpl(this.c(protoBuf$Property0, true), propertyDescriptor0));
        return propertyDescriptor0;
    }

    @NotNull
    public final TypeAliasDescriptor loadTypeAlias(@NotNull TypeAlias protoBuf$TypeAlias0) {
        DeserializationContext deserializationContext0;
        Intrinsics.checkNotNullParameter(protoBuf$TypeAlias0, "proto");
        Companion annotations$Companion0 = Annotations.Companion;
        List list0 = protoBuf$TypeAlias0.getAnnotationList();
        Intrinsics.checkNotNullExpressionValue(list0, "proto.annotationList");
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        Iterator iterator0 = list0.iterator();
        while(true) {
            boolean z = iterator0.hasNext();
            deserializationContext0 = this.a;
            if(!z) {
                break;
            }
            Object object0 = iterator0.next();
            Intrinsics.checkNotNullExpressionValue(((Annotation)object0), "it");
            arrayList0.add(this.b.deserializeAnnotation(((Annotation)object0), deserializationContext0.getNameResolver()));
        }
        Annotations annotations0 = annotations$Companion0.create(arrayList0);
        Visibility protoBuf$Visibility0 = (Visibility)Flags.VISIBILITY.get(protoBuf$TypeAlias0.getFlags());
        DescriptorVisibility descriptorVisibility0 = ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, protoBuf$Visibility0);
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor0 = new DeserializedTypeAliasDescriptor(deserializationContext0.getStorageManager(), deserializationContext0.getContainingDeclaration(), annotations0, NameResolverUtilKt.getName(deserializationContext0.getNameResolver(), protoBuf$TypeAlias0.getName()), descriptorVisibility0, protoBuf$TypeAlias0, deserializationContext0.getNameResolver(), deserializationContext0.getTypeTable(), deserializationContext0.getVersionRequirementTable(), deserializationContext0.getContainerSource());
        List list1 = protoBuf$TypeAlias0.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(list1, "proto.typeParameterList");
        DeserializationContext deserializationContext1 = DeserializationContext.childContext$default(this.a, deserializedTypeAliasDescriptor0, list1, null, null, null, null, 60, null);
        deserializedTypeAliasDescriptor0.initialize(deserializationContext1.getTypeDeserializer().getOwnTypeParameters(), deserializationContext1.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.underlyingType(protoBuf$TypeAlias0, deserializationContext0.getTypeTable()), false), deserializationContext1.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.expandedType(protoBuf$TypeAlias0, deserializationContext0.getTypeTable()), false));
        return deserializedTypeAliasDescriptor0;
    }
}

