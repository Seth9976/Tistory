package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import j0.t1;
import j2.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import je.a;
import je.d;
import je.e;
import je.f;
import je.g;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModalityUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilterKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet.Companion;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nJvmBuiltInsCustomizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmBuiltInsCustomizer.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n1747#2,3:346\n1603#2,9:349\n1855#2:358\n1856#2:360\n1612#2:361\n1549#2:362\n1620#2,3:363\n766#2:366\n857#2:367\n1747#2,3:368\n858#2:371\n766#2:372\n857#2:373\n2624#2,3:374\n858#2:377\n1549#2:378\n1620#2,3:379\n1747#2,3:382\n1603#2,9:385\n1855#2:394\n1856#2:396\n1612#2:397\n1#3:359\n1#3:395\n*S KotlinDebug\n*F\n+ 1 JvmBuiltInsCustomizer.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer\n*L\n108#1:346,3\n124#1:349,9\n124#1:358\n124#1:360\n124#1:361\n173#1:362\n173#1:363,3\n187#1:366\n187#1:367\n192#1:368,3\n187#1:371\n288#1:372\n288#1:373\n290#1:374,3\n288#1:377\n297#1:378\n297#1:379,3\n324#1:382,3\n235#1:385,9\n235#1:394\n235#1:396\n235#1:397\n124#1:359\n235#1:395\n*E\n"})
public final class JvmBuiltInsCustomizer implements AdditionalClassPartsProvider, PlatformDependentDeclarationFilter {
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[d.values().length];
            try {
                arr_v[0] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[2] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[3] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[1] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public final ModuleDescriptor a;
    public final JavaToKotlinClassMapper b;
    public final NotNullLazyValue c;
    public final SimpleType d;
    public final NotNullLazyValue e;
    public final CacheWithNotNullValues f;
    public final NotNullLazyValue g;
    public static final KProperty[] h;

    static {
        JvmBuiltInsCustomizer.h = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JvmBuiltInsCustomizer.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JvmBuiltInsCustomizer.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JvmBuiltInsCustomizer.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    }

    public JvmBuiltInsCustomizer(@NotNull ModuleDescriptor moduleDescriptor0, @NotNull StorageManager storageManager0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        Intrinsics.checkNotNullParameter(function00, "settingsComputation");
        super();
        this.a = moduleDescriptor0;
        this.b = JavaToKotlinClassMapper.INSTANCE;
        this.c = storageManager0.createLazyValue(function00);
        JvmBuiltInsCustomizer.createMockJavaIoSerializableType.mockJavaIoPackageFragment.1 jvmBuiltInsCustomizer$createMockJavaIoSerializableType$mockJavaIoPackageFragment$10 = new JvmBuiltInsCustomizer.createMockJavaIoSerializableType.mockJavaIoPackageFragment.1(moduleDescriptor0, new FqName("java.io"));  // 初始化器: Lkotlin/reflect/jvm/internal/impl/descriptors/impl/PackageFragmentDescriptorImpl;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/ModuleDescriptor;Lkotlin/reflect/jvm/internal/impl/name/FqName;)V
        List list0 = k.listOf(new LazyWrappedType(storageManager0, new j(this, 3)));
        ClassDescriptorImpl classDescriptorImpl0 = new ClassDescriptorImpl(jvmBuiltInsCustomizer$createMockJavaIoSerializableType$mockJavaIoPackageFragment$10, Name.identifier("Serializable"), Modality.ABSTRACT, ClassKind.INTERFACE, list0, SourceElement.NO_SOURCE, false, storageManager0);
        classDescriptorImpl0.initialize(Empty.INSTANCE, f0.emptySet(), null);
        SimpleType simpleType0 = classDescriptorImpl0.getDefaultType();
        Intrinsics.checkNotNullExpressionValue(simpleType0, "mockSerializableClass.defaultType");
        this.d = simpleType0;
        this.e = storageManager0.createLazyValue(new kotlin.reflect.jvm.internal.impl.builtins.jvm.d(this, storageManager0));
        this.f = storageManager0.createCacheWithNotNullValues();
        this.g = storageManager0.createLazyValue(new g(this));
    }

    public final LazyJavaClassDescriptor a(ClassDescriptor classDescriptor0) {
        if(KotlinBuiltIns.isAny(classDescriptor0)) {
            return null;
        }
        if(!KotlinBuiltIns.isUnderKotlinPackage(classDescriptor0)) {
            return null;
        }
        FqNameUnsafe fqNameUnsafe0 = DescriptorUtilsKt.getFqNameUnsafe(classDescriptor0);
        if(!fqNameUnsafe0.isSafe()) {
            return null;
        }
        ClassId classId0 = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(fqNameUnsafe0);
        if(classId0 != null) {
            FqName fqName0 = classId0.asSingleFqName();
            if(fqName0 != null) {
                ClassDescriptor classDescriptor1 = DescriptorUtilKt.resolveClassByFqName(this.b().getOwnerModuleDescriptor(), fqName0, NoLookupLocation.FROM_BUILTINS);
                return classDescriptor1 instanceof LazyJavaClassDescriptor ? ((LazyJavaClassDescriptor)classDescriptor1) : null;
            }
        }
        return null;
    }

    public static final JavaToKotlinClassMapper access$getJ2kClassMapper$p(JvmBuiltInsCustomizer jvmBuiltInsCustomizer0) {
        return jvmBuiltInsCustomizer0.b;
    }

    public static final ModuleDescriptor access$getModuleDescriptor$p(JvmBuiltInsCustomizer jvmBuiltInsCustomizer0) {
        return jvmBuiltInsCustomizer0.a;
    }

    public final Settings b() {
        return (Settings)StorageKt.getValue(this.c, this, JvmBuiltInsCustomizer.h[0]);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    public Collection getConstructors(@NotNull ClassDescriptor classDescriptor0) {
        Intrinsics.checkNotNullParameter(classDescriptor0, "classDescriptor");
        if(classDescriptor0.getKind() == ClassKind.CLASS && this.b().isAdditionalBuiltInsFeatureSupported()) {
            LazyJavaClassDescriptor lazyJavaClassDescriptor0 = this.a(classDescriptor0);
            if(lazyJavaClassDescriptor0 == null) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            FqName fqName0 = DescriptorUtilsKt.getFqNameSafe(lazyJavaClassDescriptor0);
            ClassDescriptor classDescriptor1 = JavaToKotlinClassMapper.mapJavaToKotlin$default(this.b, fqName0, a.f.getInstance(), null, 4, null);
            if(classDescriptor1 == null) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            TypeSubstitutor typeSubstitutor0 = MappingUtilKt.createMappedTypeParametersSubstitution(classDescriptor1, lazyJavaClassDescriptor0).buildSubstitutor();
            Iterable iterable0 = lazyJavaClassDescriptor0.getConstructors();
            ArrayList arrayList0 = new ArrayList();
            Iterator iterator0 = iterable0.iterator();
        label_13:
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                ClassConstructorDescriptor classConstructorDescriptor0 = (ClassConstructorDescriptor)object0;
                if(classConstructorDescriptor0.getVisibility().isPublicAPI()) {
                    Collection collection0 = classDescriptor1.getConstructors();
                    Intrinsics.checkNotNullExpressionValue(collection0, "defaultKotlinVersion.constructors");
                    Iterable iterable1 = collection0;
                    if(!(iterable1 instanceof Collection) || !((Collection)iterable1).isEmpty()) {
                        for(Object object1: iterable1) {
                            Intrinsics.checkNotNullExpressionValue(((ClassConstructorDescriptor)object1), "it");
                            if(OverridingUtil.getBothWaysOverridability(((ClassConstructorDescriptor)object1), classConstructorDescriptor0.substitute(typeSubstitutor0)) == Result.OVERRIDABLE) {
                                continue label_13;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                    if(classConstructorDescriptor0.getValueParameters().size() == 1) {
                        List list0 = classConstructorDescriptor0.getValueParameters();
                        Intrinsics.checkNotNullExpressionValue(list0, "valueParameters");
                        ClassifierDescriptor classifierDescriptor0 = ((ValueParameterDescriptor)CollectionsKt___CollectionsKt.single(list0)).getType().getConstructor().getDeclarationDescriptor();
                        if(!Intrinsics.areEqual((classifierDescriptor0 == null ? null : DescriptorUtilsKt.getFqNameUnsafe(classifierDescriptor0)), DescriptorUtilsKt.getFqNameUnsafe(classDescriptor0))) {
                            goto label_32;
                        }
                    }
                    else {
                    label_32:
                        if(!KotlinBuiltIns.isDeprecated(classConstructorDescriptor0)) {
                            String s = MethodSignatureMappingKt.computeJvmDescriptor$default(classConstructorDescriptor0, false, false, 3, null);
                            if(!JvmBuiltInsSignatures.INSTANCE.getHIDDEN_CONSTRUCTOR_SIGNATURES().contains(MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, lazyJavaClassDescriptor0, s))) {
                                arrayList0.add(object0);
                            }
                        }
                    }
                }
            }
            Collection collection1 = new ArrayList(l.collectionSizeOrDefault(arrayList0, 10));
            for(Object object2: arrayList0) {
                CopyBuilder functionDescriptor$CopyBuilder0 = ((ClassConstructorDescriptor)object2).newCopyBuilder();
                functionDescriptor$CopyBuilder0.setOwner(classDescriptor0);
                functionDescriptor$CopyBuilder0.setReturnType(classDescriptor0.getDefaultType());
                functionDescriptor$CopyBuilder0.setPreserveSourceElement();
                functionDescriptor$CopyBuilder0.setSubstitution(typeSubstitutor0.getSubstitution());
                String s1 = MethodSignatureMappingKt.computeJvmDescriptor$default(((ClassConstructorDescriptor)object2), false, false, 3, null);
                if(!JvmBuiltInsSignatures.INSTANCE.getVISIBLE_CONSTRUCTOR_SIGNATURES().contains(MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, lazyJavaClassDescriptor0, s1))) {
                    functionDescriptor$CopyBuilder0.setAdditionalAnnotations(((Annotations)StorageKt.getValue(this.g, this, JvmBuiltInsCustomizer.h[2])));
                }
                FunctionDescriptor functionDescriptor0 = functionDescriptor$CopyBuilder0.build();
                Intrinsics.checkNotNull(functionDescriptor0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
                ((ArrayList)collection1).add(((ClassConstructorDescriptor)functionDescriptor0));
            }
            return collection1;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    public Collection getFunctions(@NotNull Name name0, @NotNull ClassDescriptor classDescriptor0) {
        SimpleFunctionDescriptor simpleFunctionDescriptor1;
        boolean z3;
        Collection collection0;
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(classDescriptor0, "classDescriptor");
        boolean z = Intrinsics.areEqual(name0, CloneableClassScope.Companion.getCLONE_NAME());
        KProperty[] arr_kProperty = JvmBuiltInsCustomizer.h;
        if(z && classDescriptor0 instanceof DeserializedClassDescriptor && KotlinBuiltIns.isArrayOrPrimitiveArray(classDescriptor0)) {
            List list0 = ((DeserializedClassDescriptor)classDescriptor0).getClassProto().getFunctionList();
            Intrinsics.checkNotNullExpressionValue(list0, "classDescriptor.classProto.functionList");
            if(!(list0 instanceof Collection) || !list0.isEmpty()) {
                for(Object object0: list0) {
                    if(Intrinsics.areEqual(NameResolverUtilKt.getName(((DeserializedClassDescriptor)classDescriptor0).getC().getNameResolver(), ((Function)object0).getName()), CloneableClassScope.Companion.getCLONE_NAME())) {
                        return CollectionsKt__CollectionsKt.emptyList();
                    }
                    if(false) {
                        break;
                    }
                }
            }
            CopyBuilder functionDescriptor$CopyBuilder0 = ((SimpleFunctionDescriptor)CollectionsKt___CollectionsKt.single(((SimpleType)StorageKt.getValue(this.e, this, arr_kProperty[1])).getMemberScope().getContributedFunctions(name0, NoLookupLocation.FROM_BUILTINS))).newCopyBuilder();
            functionDescriptor$CopyBuilder0.setOwner(((DeserializedClassDescriptor)classDescriptor0));
            functionDescriptor$CopyBuilder0.setVisibility(DescriptorVisibilities.PUBLIC);
            functionDescriptor$CopyBuilder0.setReturnType(((DeserializedClassDescriptor)classDescriptor0).getDefaultType());
            functionDescriptor$CopyBuilder0.setDispatchReceiverParameter(((DeserializedClassDescriptor)classDescriptor0).getThisAsReceiverParameter());
            FunctionDescriptor functionDescriptor0 = functionDescriptor$CopyBuilder0.build();
            Intrinsics.checkNotNull(functionDescriptor0);
            return k.listOf(((SimpleFunctionDescriptor)functionDescriptor0));
        }
        if(!this.b().isAdditionalBuiltInsFeatureSupported()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        e e0 = new e(name0, 0);
        LazyJavaClassDescriptor lazyJavaClassDescriptor0 = this.a(classDescriptor0);
        boolean z1 = false;
        if(lazyJavaClassDescriptor0 == null) {
            collection0 = CollectionsKt__CollectionsKt.emptyList();
        }
        else {
            FqName fqName0 = DescriptorUtilsKt.getFqNameSafe(lazyJavaClassDescriptor0);
            JavaToKotlinClassMapper javaToKotlinClassMapper0 = this.b;
            Iterable iterable0 = javaToKotlinClassMapper0.mapPlatformClass(fqName0, a.f.getInstance());
            ClassDescriptor classDescriptor1 = (ClassDescriptor)CollectionsKt___CollectionsKt.lastOrNull(iterable0);
            if(classDescriptor1 == null) {
                collection0 = CollectionsKt__CollectionsKt.emptyList();
            }
            else {
                Companion smartSet$Companion0 = SmartSet.Companion;
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
                for(Object object1: iterable0) {
                    arrayList0.add(DescriptorUtilsKt.getFqNameSafe(((ClassDescriptor)object1)));
                }
                SmartSet smartSet0 = smartSet$Companion0.create(arrayList0);
                boolean z2 = javaToKotlinClassMapper0.isMutable(classDescriptor0);
                FqName fqName1 = DescriptorUtilsKt.getFqNameSafe(lazyJavaClassDescriptor0);
                t1 t10 = new t1(4, lazyJavaClassDescriptor0, classDescriptor1);
                MemberScope memberScope0 = ((ClassDescriptor)this.f.computeIfAbsent(fqName1, t10)).getUnsubstitutedMemberScope();
                Intrinsics.checkNotNullExpressionValue(memberScope0, "fakeJavaClassDescriptor.unsubstitutedMemberScope");
                Iterable iterable1 = (Iterable)e0.invoke(memberScope0);
                ArrayList arrayList1 = new ArrayList();
                for(Object object2: iterable1) {
                    SimpleFunctionDescriptor simpleFunctionDescriptor0 = (SimpleFunctionDescriptor)object2;
                    if(simpleFunctionDescriptor0.getKind() == Kind.DECLARATION && simpleFunctionDescriptor0.getVisibility().isPublicAPI() && !KotlinBuiltIns.isDeprecated(simpleFunctionDescriptor0)) {
                        Collection collection1 = simpleFunctionDescriptor0.getOverriddenDescriptors();
                        Intrinsics.checkNotNullExpressionValue(collection1, "analogueMember.overriddenDescriptors");
                        Iterable iterable2 = collection1;
                        if(!(iterable2 instanceof Collection) || !((Collection)iterable2).isEmpty()) {
                            for(Object object3: iterable2) {
                                DeclarationDescriptor declarationDescriptor0 = ((FunctionDescriptor)object3).getContainingDeclaration();
                                Intrinsics.checkNotNullExpressionValue(declarationDescriptor0, "it.containingDeclaration");
                                if(smartSet0.contains(DescriptorUtilsKt.getFqNameSafe(declarationDescriptor0))) {
                                    goto label_81;
                                }
                            }
                        }
                        DeclarationDescriptor declarationDescriptor1 = simpleFunctionDescriptor0.getContainingDeclaration();
                        Intrinsics.checkNotNull(declarationDescriptor1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        String s = MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor0, false, false, 3, null);
                        if((JvmBuiltInsSignatures.INSTANCE.getMUTABLE_METHOD_SIGNATURES().contains(MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, ((ClassDescriptor)declarationDescriptor1), s)) ^ z2) == 0) {
                            Collection collection2 = k.listOf(simpleFunctionDescriptor0);
                            f f0 = new f(this);
                            Boolean boolean0 = DFS.ifAny(collection2, (/* 缺少Lambda参数 */) -> ((CallableMemberDescriptor)object0).getOriginal().getOverriddenDescriptors(), f0);
                            Intrinsics.checkNotNullExpressionValue(boolean0, "private fun SimpleFuncti…scriptor)\n        }\n    }");
                            z3 = boolean0.booleanValue();
                        }
                        else {
                            z3 = true;
                        }
                        if(!z3) {
                            z1 = true;
                        }
                    }
                label_81:
                    if(z1) {
                        arrayList1.add(object2);
                    }
                    z1 = false;
                }
                collection0 = arrayList1;
            }
        }
        Collection collection3 = new ArrayList();
        for(Object object4: collection0) {
            DeclarationDescriptor declarationDescriptor2 = ((SimpleFunctionDescriptor)object4).getContainingDeclaration();
            Intrinsics.checkNotNull(declarationDescriptor2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            FunctionDescriptor functionDescriptor1 = ((SimpleFunctionDescriptor)object4).substitute(MappingUtilKt.createMappedTypeParametersSubstitution(((ClassDescriptor)declarationDescriptor2), classDescriptor0).buildSubstitutor());
            Intrinsics.checkNotNull(functionDescriptor1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            CopyBuilder functionDescriptor$CopyBuilder1 = ((SimpleFunctionDescriptor)functionDescriptor1).newCopyBuilder();
            functionDescriptor$CopyBuilder1.setOwner(classDescriptor0);
            functionDescriptor$CopyBuilder1.setDispatchReceiverParameter(classDescriptor0.getThisAsReceiverParameter());
            functionDescriptor$CopyBuilder1.setPreserveSourceElement();
            DeclarationDescriptor declarationDescriptor3 = ((SimpleFunctionDescriptor)object4).getContainingDeclaration();
            Intrinsics.checkNotNull(declarationDescriptor3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            String s1 = MethodSignatureMappingKt.computeJvmDescriptor$default(((SimpleFunctionDescriptor)object4), false, false, 3, null);
            ObjectRef ref$ObjectRef0 = new ObjectRef();
            Object object5 = DFS.dfs(k.listOf(((ClassDescriptor)declarationDescriptor3)), new androidx.appcompat.view.menu.f(this, 22), new JvmBuiltInsCustomizer.getJdkMethodStatus.2(s1, ref$ObjectRef0));
            Intrinsics.checkNotNullExpressionValue(object5, "jvmDescriptor = computeJ…CONSIDERED\n            })");
            int v = ((d)object5).ordinal();
            if(v != 0) {
                switch(v) {
                    case 2: {
                        functionDescriptor$CopyBuilder1.setAdditionalAnnotations(((Annotations)StorageKt.getValue(this.g, this, arr_kProperty[2])));
                        goto label_112;
                    }
                    case 3: {
                        break;
                    }
                    default: {
                        goto label_112;
                    }
                }
            }
            else if(!ModalityUtilsKt.isFinalClass(classDescriptor0)) {
                functionDescriptor$CopyBuilder1.setHiddenForResolutionEverywhereBesideSupercalls();
            label_112:
                FunctionDescriptor functionDescriptor2 = functionDescriptor$CopyBuilder1.build();
                Intrinsics.checkNotNull(functionDescriptor2);
                simpleFunctionDescriptor1 = (SimpleFunctionDescriptor)functionDescriptor2;
            }
            else {
                simpleFunctionDescriptor1 = null;
            }
            if(simpleFunctionDescriptor1 != null) {
                ((ArrayList)collection3).add(simpleFunctionDescriptor1);
            }
        }
        return collection3;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public Collection getFunctionsNames(ClassDescriptor classDescriptor0) {
        return this.getFunctionsNames(classDescriptor0);
    }

    @NotNull
    public Set getFunctionsNames(@NotNull ClassDescriptor classDescriptor0) {
        Intrinsics.checkNotNullParameter(classDescriptor0, "classDescriptor");
        if(!this.b().isAdditionalBuiltInsFeatureSupported()) {
            return f0.emptySet();
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptor0 = this.a(classDescriptor0);
        if(lazyJavaClassDescriptor0 != null) {
            LazyJavaClassMemberScope lazyJavaClassMemberScope0 = lazyJavaClassDescriptor0.getUnsubstitutedMemberScope();
            if(lazyJavaClassMemberScope0 != null) {
                Set set0 = lazyJavaClassMemberScope0.getFunctionNames();
                return set0 == null ? f0.emptySet() : set0;
            }
        }
        return f0.emptySet();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    public Collection getSupertypes(@NotNull ClassDescriptor classDescriptor0) {
        Intrinsics.checkNotNullParameter(classDescriptor0, "classDescriptor");
        FqNameUnsafe fqNameUnsafe0 = DescriptorUtilsKt.getFqNameUnsafe(classDescriptor0);
        JvmBuiltInsSignatures jvmBuiltInsSignatures0 = JvmBuiltInsSignatures.INSTANCE;
        boolean z = jvmBuiltInsSignatures0.isArrayOrPrimitiveArray(fqNameUnsafe0);
        SimpleType simpleType0 = this.d;
        if(z) {
            SimpleType simpleType1 = (SimpleType)StorageKt.getValue(this.e, this, JvmBuiltInsCustomizer.h[1]);
            Intrinsics.checkNotNullExpressionValue(simpleType1, "cloneableType");
            return CollectionsKt__CollectionsKt.listOf(new KotlinType[]{simpleType1, simpleType0});
        }
        return jvmBuiltInsSignatures0.isSerializableInJava(fqNameUnsafe0) ? k.listOf(simpleType0) : CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
    public boolean isFunctionAvailable(@NotNull ClassDescriptor classDescriptor0, @NotNull SimpleFunctionDescriptor simpleFunctionDescriptor0) {
        Intrinsics.checkNotNullParameter(classDescriptor0, "classDescriptor");
        Intrinsics.checkNotNullParameter(simpleFunctionDescriptor0, "functionDescriptor");
        LazyJavaClassDescriptor lazyJavaClassDescriptor0 = this.a(classDescriptor0);
        if(lazyJavaClassDescriptor0 == null) {
            return true;
        }
        if(!simpleFunctionDescriptor0.getAnnotations().hasAnnotation(PlatformDependentDeclarationFilterKt.getPLATFORM_DEPENDENT_ANNOTATION_FQ_NAME())) {
            return true;
        }
        if(!this.b().isAdditionalBuiltInsFeatureSupported()) {
            return false;
        }
        String s = MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor0, false, false, 3, null);
        LazyJavaClassMemberScope lazyJavaClassMemberScope0 = lazyJavaClassDescriptor0.getUnsubstitutedMemberScope();
        Name name0 = simpleFunctionDescriptor0.getName();
        Intrinsics.checkNotNullExpressionValue(name0, "functionDescriptor.name");
        Iterable iterable0 = lazyJavaClassMemberScope0.getContributedFunctions(name0, NoLookupLocation.FROM_BUILTINS);
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object0: iterable0) {
                if(Intrinsics.areEqual(MethodSignatureMappingKt.computeJvmDescriptor$default(((SimpleFunctionDescriptor)object0), false, false, 3, null), s)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }
}

