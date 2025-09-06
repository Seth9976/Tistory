package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ef.a;
import j0.b2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.l;
import kotlin.collections.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.PropertiesConventionUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator.PropagatedSignature;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaForKotlinOverridePropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import se.d;
import se.e;
import se.f;
import se.g;
import se.h;

@SourceDebugExtension({"SMAP\nLazyJavaClassMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassMemberScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassMemberScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,890:1\n1446#2,5:891\n1747#2,2:897\n1747#2,3:899\n1749#2:902\n1603#2,9:903\n1855#2:912\n1856#2:914\n1612#2:915\n1747#2,3:916\n1549#2:919\n1620#2,3:920\n819#2:923\n847#2,2:924\n766#2:926\n857#2,2:927\n1747#2,3:929\n1747#2,3:932\n2624#2,3:935\n766#2:938\n857#2,2:939\n766#2:941\n857#2,2:942\n1549#2:944\n1620#2,3:945\n2624#2,3:948\n288#2,2:951\n1549#2:953\n1620#2,3:954\n1446#2,5:957\n2624#2,3:962\n1360#2:965\n1446#2,2:966\n1549#2:968\n1620#2,3:969\n1448#2,3:972\n1549#2:975\n1620#2,3:976\n3190#2,10:979\n1446#2,5:989\n1#3:896\n1#3:913\n*S KotlinDebug\n*F\n+ 1 LazyJavaClassMemberScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassMemberScope\n*L\n74#1:891,5\n160#1:897,2\n161#1:899,3\n160#1:902\n189#1:903,9\n189#1:912\n189#1:914\n189#1:915\n193#1:916,3\n199#1:919\n199#1:920,3\n202#1:923\n202#1:924,2\n211#1:926\n211#1:927,2\n216#1:929,3\n222#1:932,3\n322#1:935,3\n327#1:938\n327#1:939,2\n354#1:941\n354#1:942,2\n376#1:944\n376#1:945,3\n461#1:948,3\n470#1:951,2\n476#1:953\n476#1:954,3\n489#1:957,5\n495#1:962,3\n649#1:965\n649#1:966,2\n650#1:968\n650#1:969,3\n649#1:972,3\n698#1:975\n698#1:976,3\n749#1:979,10\n879#1:989,5\n189#1:913\n*E\n"})
public final class LazyJavaClassMemberScope extends LazyJavaScope {
    public final ClassDescriptor m;
    public final JavaClass n;
    public final boolean o;
    public final NotNullLazyValue p;
    public final NotNullLazyValue q;
    public final NotNullLazyValue r;
    public final NotNullLazyValue s;
    public final MemoizedFunctionToNullable t;

    public LazyJavaClassMemberScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @NotNull ClassDescriptor classDescriptor0, @NotNull JavaClass javaClass0, boolean z, @Nullable LazyJavaClassMemberScope lazyJavaClassMemberScope0) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "c");
        Intrinsics.checkNotNullParameter(classDescriptor0, "ownerDescriptor");
        Intrinsics.checkNotNullParameter(javaClass0, "jClass");
        super(lazyJavaResolverContext0, lazyJavaClassMemberScope0);
        this.m = classDescriptor0;
        this.n = javaClass0;
        this.o = z;
        this.p = lazyJavaResolverContext0.getStorageManager().createLazyValue(new f(this, lazyJavaResolverContext0));
        this.q = lazyJavaResolverContext0.getStorageManager().createLazyValue(new g(this, 1));
        this.r = lazyJavaResolverContext0.getStorageManager().createLazyValue(new f(lazyJavaResolverContext0, this));
        this.s = lazyJavaResolverContext0.getStorageManager().createLazyValue(new g(this, 0));
        this.t = lazyJavaResolverContext0.getStorageManager().createMemoizedFunctionWithNullableValues(new h(this, lazyJavaResolverContext0));
    }

    public LazyJavaClassMemberScope(LazyJavaResolverContext lazyJavaResolverContext0, ClassDescriptor classDescriptor0, JavaClass javaClass0, boolean z, LazyJavaClassMemberScope lazyJavaClassMemberScope0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 16) != 0) {
            lazyJavaClassMemberScope0 = null;
        }
        this(lazyJavaResolverContext0, classDescriptor0, javaClass0, z, lazyJavaClassMemberScope0);
    }

    public final void a(ArrayList arrayList0, JavaClassConstructorDescriptor javaClassConstructorDescriptor0, int v, JavaMethod javaMethod0, KotlinType kotlinType0, KotlinType kotlinType1) {
        Name name0 = javaMethod0.getName();
        KotlinType kotlinType2 = TypeUtils.makeNotNullable(kotlinType0);
        Intrinsics.checkNotNullExpressionValue(kotlinType2, "makeNotNullable(returnType)");
        boolean z = javaMethod0.getHasAnnotationParameterDefaultValue();
        arrayList0.add(new ValueParameterDescriptorImpl(javaClassConstructorDescriptor0, null, v, Annotations.Companion.getEMPTY(), name0, kotlinType2, z, false, false, (kotlinType1 == null ? null : TypeUtils.makeNotNullable(kotlinType1)), this.getC().getComponents().getSourceElementFactory().source(javaMethod0)));
    }

    public static final ClassConstructorDescriptor access$createDefaultConstructor(LazyJavaClassMemberScope lazyJavaClassMemberScope0) {
        List list0;
        JavaClass javaClass0 = lazyJavaClassMemberScope0.n;
        boolean z = javaClass0.isAnnotationType();
        if(!javaClass0.isInterface() && javaClass0.hasDefaultConstructor() || z) {
            ClassDescriptor classDescriptor0 = lazyJavaClassMemberScope0.getOwnerDescriptor();
            JavaSourceElement javaSourceElement0 = lazyJavaClassMemberScope0.getC().getComponents().getSourceElementFactory().source(javaClass0);
            JavaClassConstructorDescriptor javaClassConstructorDescriptor0 = JavaClassConstructorDescriptor.createJavaConstructor(classDescriptor0, Annotations.Companion.getEMPTY(), true, javaSourceElement0);
            Intrinsics.checkNotNullExpressionValue(javaClassConstructorDescriptor0, "createJavaConstructor(\n ….source(jClass)\n        )");
            if(z) {
                Collection collection0 = javaClass0.getMethods();
                list0 = new ArrayList(collection0.size());
                JavaTypeAttributes javaTypeAttributes0 = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, true, false, null, 6, null);
                ArrayList arrayList0 = new ArrayList();
                ArrayList arrayList1 = new ArrayList();
                for(Object object0: collection0) {
                    if(Intrinsics.areEqual(((JavaMethod)object0).getName(), JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME)) {
                        arrayList0.add(object0);
                    }
                    else {
                        arrayList1.add(object0);
                    }
                }
                Pair pair0 = new Pair(arrayList0, arrayList1);
                List list1 = (List)pair0.component1();
                Object object1 = pair0.component2();
                list1.size();
                Object object2 = CollectionsKt___CollectionsKt.firstOrNull(list1);
                if(((JavaMethod)object2) != null) {
                    JavaType javaType0 = ((JavaMethod)object2).getReturnType();
                    Pair pair1 = javaType0 instanceof JavaArrayType ? new Pair(lazyJavaClassMemberScope0.getC().getTypeResolver().transformArrayType(((JavaArrayType)javaType0), javaTypeAttributes0, true), lazyJavaClassMemberScope0.getC().getTypeResolver().transformJavaType(((JavaArrayType)javaType0).getComponentType(), javaTypeAttributes0)) : new Pair(lazyJavaClassMemberScope0.getC().getTypeResolver().transformJavaType(javaType0, javaTypeAttributes0), null);
                    lazyJavaClassMemberScope0.a(((ArrayList)list0), javaClassConstructorDescriptor0, 0, ((JavaMethod)object2), ((KotlinType)pair1.component1()), ((KotlinType)pair1.component2()));
                }
                int v = 0;
                for(Object object3: ((List)object1)) {
                    lazyJavaClassMemberScope0.a(((ArrayList)list0), javaClassConstructorDescriptor0, v + (((JavaMethod)object2) == null ? 0 : 1), ((JavaMethod)object3), lazyJavaClassMemberScope0.getC().getTypeResolver().transformJavaType(((JavaMethod)object3).getReturnType(), javaTypeAttributes0), null);
                    ++v;
                }
            }
            else {
                list0 = Collections.emptyList();
            }
            javaClassConstructorDescriptor0.setHasSynthesizedParameterNames(false);
            DescriptorVisibility descriptorVisibility0 = classDescriptor0.getVisibility();
            Intrinsics.checkNotNullExpressionValue(descriptorVisibility0, "classDescriptor.visibility");
            if(Intrinsics.areEqual(descriptorVisibility0, JavaDescriptorVisibilities.PROTECTED_STATIC_VISIBILITY)) {
                descriptorVisibility0 = JavaDescriptorVisibilities.PROTECTED_AND_PACKAGE;
                Intrinsics.checkNotNullExpressionValue(descriptorVisibility0, "PROTECTED_AND_PACKAGE");
            }
            javaClassConstructorDescriptor0.initialize(list0, descriptorVisibility0);
            javaClassConstructorDescriptor0.setHasStableParameterNames(true);
            javaClassConstructorDescriptor0.setReturnType(classDescriptor0.getDefaultType());
            lazyJavaClassMemberScope0.getC().getComponents().getJavaResolverCache().recordConstructor(javaClass0, javaClassConstructorDescriptor0);
            return javaClassConstructorDescriptor0;
        }
        return null;
    }

    public static final ClassConstructorDescriptor access$createDefaultRecordConstructor(LazyJavaClassMemberScope lazyJavaClassMemberScope0) {
        ClassDescriptor classDescriptor0 = lazyJavaClassMemberScope0.getOwnerDescriptor();
        JavaSourceElement javaSourceElement0 = lazyJavaClassMemberScope0.getC().getComponents().getSourceElementFactory().source(lazyJavaClassMemberScope0.n);
        ClassConstructorDescriptor classConstructorDescriptor0 = JavaClassConstructorDescriptor.createJavaConstructor(classDescriptor0, Annotations.Companion.getEMPTY(), true, javaSourceElement0);
        Intrinsics.checkNotNullExpressionValue(classConstructorDescriptor0, "createJavaConstructor(\n ….source(jClass)\n        )");
        Collection collection0 = lazyJavaClassMemberScope0.n.getRecordComponents();
        ArrayList arrayList0 = new ArrayList(collection0.size());
        JavaTypeAttributes javaTypeAttributes0 = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 6, null);
        int v = 0;
        for(Object object0: collection0) {
            KotlinType kotlinType0 = lazyJavaClassMemberScope0.getC().getTypeResolver().transformJavaType(((JavaRecordComponent)object0).getType(), javaTypeAttributes0);
            KotlinType kotlinType1 = ((JavaRecordComponent)object0).isVararg() ? lazyJavaClassMemberScope0.getC().getComponents().getModule().getBuiltIns().getArrayElementType(kotlinType0) : null;
            Name name0 = ((JavaRecordComponent)object0).getName();
            JavaSourceElement javaSourceElement1 = lazyJavaClassMemberScope0.getC().getComponents().getSourceElementFactory().source(((JavaRecordComponent)object0));
            arrayList0.add(new ValueParameterDescriptorImpl(classConstructorDescriptor0, null, v, Annotations.Companion.getEMPTY(), name0, kotlinType0, false, false, false, kotlinType1, javaSourceElement1));
            ++v;
        }
        ((JavaClassConstructorDescriptor)classConstructorDescriptor0).setHasSynthesizedParameterNames(false);
        DescriptorVisibility descriptorVisibility0 = classDescriptor0.getVisibility();
        Intrinsics.checkNotNullExpressionValue(descriptorVisibility0, "classDescriptor.visibility");
        if(Intrinsics.areEqual(descriptorVisibility0, JavaDescriptorVisibilities.PROTECTED_STATIC_VISIBILITY)) {
            descriptorVisibility0 = JavaDescriptorVisibilities.PROTECTED_AND_PACKAGE;
            Intrinsics.checkNotNullExpressionValue(descriptorVisibility0, "PROTECTED_AND_PACKAGE");
        }
        ((ClassConstructorDescriptorImpl)classConstructorDescriptor0).initialize(arrayList0, descriptorVisibility0);
        ((JavaClassConstructorDescriptor)classConstructorDescriptor0).setHasStableParameterNames(false);
        ((FunctionDescriptorImpl)classConstructorDescriptor0).setReturnType(classDescriptor0.getDefaultType());
        return classConstructorDescriptor0;
    }

    public static final JavaClassConstructorDescriptor access$resolveConstructor(LazyJavaClassMemberScope lazyJavaClassMemberScope0, JavaConstructor javaConstructor0) {
        ClassDescriptor classDescriptor0 = lazyJavaClassMemberScope0.getOwnerDescriptor();
        JavaClassConstructorDescriptor javaClassConstructorDescriptor0 = JavaClassConstructorDescriptor.createJavaConstructor(classDescriptor0, LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaClassMemberScope0.getC(), javaConstructor0), false, lazyJavaClassMemberScope0.getC().getComponents().getSourceElementFactory().source(javaConstructor0));
        Intrinsics.checkNotNullExpressionValue(javaClassConstructorDescriptor0, "createJavaConstructor(\n …ce(constructor)\n        )");
        LazyJavaResolverContext lazyJavaResolverContext0 = ContextKt.childForMethod(lazyJavaClassMemberScope0.getC(), javaClassConstructorDescriptor0, javaConstructor0, classDescriptor0.getDeclaredTypeParameters().size());
        ResolvedValueParameters lazyJavaScope$ResolvedValueParameters0 = lazyJavaClassMemberScope0.resolveValueParameters(lazyJavaResolverContext0, javaClassConstructorDescriptor0, javaConstructor0.getValueParameters());
        List list0 = classDescriptor0.getDeclaredTypeParameters();
        Intrinsics.checkNotNullExpressionValue(list0, "classDescriptor.declaredTypeParameters");
        Iterable iterable0 = javaConstructor0.getTypeParameters();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            TypeParameterDescriptor typeParameterDescriptor0 = lazyJavaResolverContext0.getTypeParameterResolver().resolveTypeParameter(((JavaTypeParameter)object0));
            Intrinsics.checkNotNull(typeParameterDescriptor0);
            arrayList0.add(typeParameterDescriptor0);
        }
        List list1 = CollectionsKt___CollectionsKt.plus(list0, arrayList0);
        javaClassConstructorDescriptor0.initialize(lazyJavaScope$ResolvedValueParameters0.getDescriptors(), UtilsKt.toDescriptorVisibility(javaConstructor0.getVisibility()), list1);
        javaClassConstructorDescriptor0.setHasStableParameterNames(false);
        javaClassConstructorDescriptor0.setHasSynthesizedParameterNames(lazyJavaScope$ResolvedValueParameters0.getHasSynthesizedNames());
        javaClassConstructorDescriptor0.setReturnType(classDescriptor0.getDefaultType());
        lazyJavaResolverContext0.getComponents().getJavaResolverCache().recordConstructor(javaConstructor0, javaClassConstructorDescriptor0);
        return javaClassConstructorDescriptor0;
    }

    public static final Collection access$searchMethodsByNameWithoutBuiltinMagic(LazyJavaClassMemberScope lazyJavaClassMemberScope0, Name name0) {
        Iterable iterable0 = ((DeclaredMemberIndex)lazyJavaClassMemberScope0.getDeclaredMemberIndex().invoke()).findMethodsByName(name0);
        Collection collection0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            ((ArrayList)collection0).add(lazyJavaClassMemberScope0.resolveMethodToFunctionDescriptor(((JavaMethod)object0)));
        }
        return collection0;
    }

    public static final Collection access$searchMethodsInSupertypesWithoutBuiltinMagic(LazyJavaClassMemberScope lazyJavaClassMemberScope0, Name name0) {
        LinkedHashSet linkedHashSet0 = lazyJavaClassMemberScope0.m(name0);
        Collection collection0 = new ArrayList();
        for(Object object0: linkedHashSet0) {
            if(!SpecialBuiltinMembers.doesOverrideBuiltinWithDifferentJvmName(((SimpleFunctionDescriptor)object0)) && BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(((SimpleFunctionDescriptor)object0)) == null) {
                ((ArrayList)collection0).add(object0);
            }
        }
        return collection0;
    }

    public final void b(Collection collection0, Name name0, Collection collection1, boolean z) {
        Collection collection2 = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name0, collection1, collection0, this.getOwnerDescriptor(), this.getC().getComponents().getErrorReporter(), this.getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
        Intrinsics.checkNotNullExpressionValue(collection2, "resolveOverridesForNonSt….overridingUtil\n        )");
        if(!z) {
            collection0.addAll(collection2);
            return;
        }
        List list0 = CollectionsKt___CollectionsKt.plus(collection0, collection2);
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(collection2, 10));
        for(Object object0: collection2) {
            SimpleFunctionDescriptor simpleFunctionDescriptor0 = (SimpleFunctionDescriptor)object0;
            SimpleFunctionDescriptor simpleFunctionDescriptor1 = (SimpleFunctionDescriptor)SpecialBuiltinMembers.getOverriddenSpecialBuiltin(simpleFunctionDescriptor0);
            if(simpleFunctionDescriptor1 == null) {
                Intrinsics.checkNotNullExpressionValue(simpleFunctionDescriptor0, "resolvedOverride");
            }
            else {
                Intrinsics.checkNotNullExpressionValue(simpleFunctionDescriptor0, "resolvedOverride");
                simpleFunctionDescriptor0 = LazyJavaClassMemberScope.f(simpleFunctionDescriptor0, simpleFunctionDescriptor1, list0);
            }
            arrayList0.add(simpleFunctionDescriptor0);
        }
        collection0.addAll(arrayList0);
    }

    public final void c(Name name0, Collection collection0, Collection collection1, Collection collection2, Function1 function10) {
        SimpleFunctionDescriptor simpleFunctionDescriptor6;
        SimpleFunctionDescriptor simpleFunctionDescriptor5;
        Iterator iterator0 = collection1.iterator();
        while(iterator0.hasNext()) {
            SimpleFunctionDescriptor simpleFunctionDescriptor0 = null;
            Object object0 = iterator0.next();
            SimpleFunctionDescriptor simpleFunctionDescriptor1 = (SimpleFunctionDescriptor)object0;
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor)SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName(simpleFunctionDescriptor1);
            SimpleFunctionDescriptor simpleFunctionDescriptor3 = null;
            if(simpleFunctionDescriptor2 != null) {
                String s = SpecialBuiltinMembers.getJvmMethodNameIfSpecial(simpleFunctionDescriptor2);
                Intrinsics.checkNotNull(s);
                Name name1 = Name.identifier(s);
                Intrinsics.checkNotNullExpressionValue(name1, "identifier(nameInJava)");
                for(Object object1: ((Collection)function10.invoke(name1))) {
                    CopyBuilder functionDescriptor$CopyBuilder0 = ((SimpleFunctionDescriptor)object1).newCopyBuilder();
                    functionDescriptor$CopyBuilder0.setName(name0);
                    functionDescriptor$CopyBuilder0.setSignatureChange();
                    functionDescriptor$CopyBuilder0.setPreserveSourceElement();
                    FunctionDescriptor functionDescriptor0 = functionDescriptor$CopyBuilder0.build();
                    Intrinsics.checkNotNull(functionDescriptor0);
                    SimpleFunctionDescriptor simpleFunctionDescriptor4 = (SimpleFunctionDescriptor)functionDescriptor0;
                    FunctionDescriptor functionDescriptor1 = BuiltinMethodsWithDifferentJvmName.INSTANCE.isRemoveAtByIndex(simpleFunctionDescriptor2) ? simpleFunctionDescriptor4.getOriginal() : simpleFunctionDescriptor4;
                    Intrinsics.checkNotNullExpressionValue(functionDescriptor1, "if (superDescriptor.isRe…iginal else subDescriptor");
                    if(LazyJavaClassMemberScope.i(functionDescriptor1, simpleFunctionDescriptor2)) {
                        simpleFunctionDescriptor0 = LazyJavaClassMemberScope.f(simpleFunctionDescriptor4, simpleFunctionDescriptor2, collection0);
                        break;
                    }
                }
            }
            CollectionsKt.addIfNotNull(collection2, simpleFunctionDescriptor0);
            FunctionDescriptor functionDescriptor2 = BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(simpleFunctionDescriptor1);
            if(functionDescriptor2 == null) {
                simpleFunctionDescriptor6 = null;
            }
            else {
                Name name2 = functionDescriptor2.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "overridden.name");
                for(Object object2: ((Iterable)function10.invoke(name2))) {
                    if(!LazyJavaClassMemberScope.o(((SimpleFunctionDescriptor)object2), functionDescriptor2)) {
                        continue;
                    }
                    goto label_40;
                }
                object2 = null;
            label_40:
                if(((SimpleFunctionDescriptor)object2) == null) {
                    simpleFunctionDescriptor5 = null;
                }
                else {
                    CopyBuilder functionDescriptor$CopyBuilder1 = ((SimpleFunctionDescriptor)object2).newCopyBuilder();
                    List list0 = functionDescriptor2.getValueParameters();
                    Intrinsics.checkNotNullExpressionValue(list0, "overridden.valueParameters");
                    ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
                    for(Object object3: list0) {
                        arrayList0.add(((ValueParameterDescriptor)object3).getType());
                    }
                    List list1 = ((SimpleFunctionDescriptor)object2).getValueParameters();
                    Intrinsics.checkNotNullExpressionValue(list1, "override.valueParameters");
                    functionDescriptor$CopyBuilder1.setValueParameters(UtilKt.copyValueParameters(arrayList0, list1, functionDescriptor2));
                    functionDescriptor$CopyBuilder1.setSignatureChange();
                    functionDescriptor$CopyBuilder1.setPreserveSourceElement();
                    functionDescriptor$CopyBuilder1.putUserData(JavaMethodDescriptor.HAS_ERASED_VALUE_PARAMETERS, Boolean.TRUE);
                    simpleFunctionDescriptor5 = (SimpleFunctionDescriptor)functionDescriptor$CopyBuilder1.build();
                }
                if(simpleFunctionDescriptor5 != null) {
                    if(!this.p(simpleFunctionDescriptor5)) {
                        simpleFunctionDescriptor5 = null;
                    }
                    if(simpleFunctionDescriptor5 != null) {
                        simpleFunctionDescriptor6 = LazyJavaClassMemberScope.f(simpleFunctionDescriptor5, functionDescriptor2, collection0);
                    }
                }
            }
            CollectionsKt.addIfNotNull(collection2, simpleFunctionDescriptor6);
            if(simpleFunctionDescriptor1.isSuspend()) {
                Name name3 = simpleFunctionDescriptor1.getName();
                Intrinsics.checkNotNullExpressionValue(name3, "descriptor.name");
                for(Object object4: ((Iterable)function10.invoke(name3))) {
                    SimpleFunctionDescriptor simpleFunctionDescriptor7 = LazyJavaClassMemberScope.g(((SimpleFunctionDescriptor)object4));
                    if(simpleFunctionDescriptor7 == null || !LazyJavaClassMemberScope.i(simpleFunctionDescriptor7, simpleFunctionDescriptor1)) {
                        simpleFunctionDescriptor7 = null;
                    }
                    if(simpleFunctionDescriptor7 != null) {
                        simpleFunctionDescriptor3 = simpleFunctionDescriptor7;
                        break;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            CollectionsKt.addIfNotNull(collection2, simpleFunctionDescriptor3);
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set computeClassNames(@NotNull DescriptorKindFilter descriptorKindFilter0, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(descriptorKindFilter0, "kindFilter");
        return g0.plus(((Set)this.q.invoke()), ((Map)this.s.invoke()).keySet());
    }

    @NotNull
    public LinkedHashSet computeFunctionNames(@NotNull DescriptorKindFilter descriptorKindFilter0, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(descriptorKindFilter0, "kindFilter");
        Collection collection0 = this.getOwnerDescriptor().getTypeConstructor().getSupertypes();
        Intrinsics.checkNotNullExpressionValue(collection0, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        for(Object object0: collection0) {
            o.addAll(linkedHashSet0, ((KotlinType)object0).getMemberScope().getFunctionNames());
        }
        linkedHashSet0.addAll(((DeclaredMemberIndex)this.getDeclaredMemberIndex().invoke()).getMethodNames());
        linkedHashSet0.addAll(((DeclaredMemberIndex)this.getDeclaredMemberIndex().invoke()).getRecordComponentNames());
        linkedHashSet0.addAll(this.computeClassNames(descriptorKindFilter0, function10));
        linkedHashSet0.addAll(this.getC().getComponents().getSyntheticPartsProvider().getMethodNames(this.getC(), this.getOwnerDescriptor()));
        return linkedHashSet0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public Set computeFunctionNames(DescriptorKindFilter descriptorKindFilter0, Function1 function10) {
        return this.computeFunctionNames(descriptorKindFilter0, function10);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeImplicitlyDeclaredFunctions(@NotNull Collection collection0, @NotNull Name name0) {
        Intrinsics.checkNotNullParameter(collection0, "result");
        Intrinsics.checkNotNullParameter(name0, "name");
        if(this.n.isRecord() && ((DeclaredMemberIndex)this.getDeclaredMemberIndex().invoke()).findRecordComponentByName(name0) != null) {
            if(!collection0.isEmpty()) {
                for(Object object0: collection0) {
                    if(!((SimpleFunctionDescriptor)object0).getValueParameters().isEmpty()) {
                        continue;
                    }
                    this.getC().getComponents().getSyntheticPartsProvider().generateMethods(this.getC(), this.getOwnerDescriptor(), name0, collection0);
                    return;
                }
            }
            JavaRecordComponent javaRecordComponent0 = ((DeclaredMemberIndex)this.getDeclaredMemberIndex().invoke()).findRecordComponentByName(name0);
            Intrinsics.checkNotNull(javaRecordComponent0);
            JavaMethodDescriptor javaMethodDescriptor0 = JavaMethodDescriptor.createJavaMethod(this.getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(this.getC(), javaRecordComponent0), javaRecordComponent0.getName(), this.getC().getComponents().getSourceElementFactory().source(javaRecordComponent0), true);
            Intrinsics.checkNotNullExpressionValue(javaMethodDescriptor0, "createJavaMethod(\n      …omponent), true\n        )");
            JavaTypeAttributes javaTypeAttributes0 = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 6, null);
            KotlinType kotlinType0 = this.getC().getTypeResolver().transformJavaType(javaRecordComponent0.getType(), javaTypeAttributes0);
            javaMethodDescriptor0.initialize(null, this.getDispatchReceiverParameter(), CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList(), kotlinType0, Modality.Companion.convertFromFlags(false, false, true), DescriptorVisibilities.PUBLIC, null);
            javaMethodDescriptor0.setParameterNamesStatus(false, false);
            this.getC().getComponents().getJavaResolverCache().recordMethod(javaRecordComponent0, javaMethodDescriptor0);
            collection0.add(javaMethodDescriptor0);
        }
        this.getC().getComponents().getSyntheticPartsProvider().generateMethods(this.getC(), this.getOwnerDescriptor(), name0, collection0);
    }

    @NotNull
    public ClassDeclaredMemberIndex computeMemberIndex() {
        return new ClassDeclaredMemberIndex(this.n, d.w);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public DeclaredMemberIndex computeMemberIndex() {
        return this.computeMemberIndex();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeNonDeclaredFunctions(@NotNull Collection collection0, @NotNull Name name0) {
        Intrinsics.checkNotNullParameter(collection0, "result");
        Intrinsics.checkNotNullParameter(name0, "name");
        LinkedHashSet linkedHashSet0 = this.m(name0);
        if(!SpecialGenericSignatures.Companion.getSameAsRenamedInJvmBuiltin(name0) && !BuiltinMethodsWithSpecialGenericSignature.INSTANCE.getSameAsBuiltinMethodWithErasedValueParameters(name0)) {
            if(!linkedHashSet0.isEmpty()) {
                for(Object object0: linkedHashSet0) {
                    if(!((FunctionDescriptor)object0).isSuspend()) {
                        continue;
                    }
                    goto label_19;
                }
            }
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: linkedHashSet0) {
                if(this.p(((SimpleFunctionDescriptor)object1))) {
                    arrayList0.add(object1);
                }
            }
            this.b(collection0, name0, arrayList0, false);
            return;
        }
    label_19:
        SmartSet smartSet0 = SmartSet.Companion.create();
        OverridingUtil overridingUtil0 = this.getC().getComponents().getKotlinTypeChecker().getOverridingUtil();
        Collection collection1 = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name0, linkedHashSet0, CollectionsKt__CollectionsKt.emptyList(), this.getOwnerDescriptor(), ErrorReporter.DO_NOTHING, overridingUtil0);
        Intrinsics.checkNotNullExpressionValue(collection1, "resolveOverridesForNonSt….overridingUtil\n        )");
        this.c(name0, collection0, collection1, collection0, new a(1, this, 3));
        this.c(name0, collection0, collection1, smartSet0, new a(1, this, 4));
        ArrayList arrayList1 = new ArrayList();
        for(Object object2: linkedHashSet0) {
            if(this.p(((SimpleFunctionDescriptor)object2))) {
                arrayList1.add(object2);
            }
        }
        this.b(collection0, name0, CollectionsKt___CollectionsKt.plus(arrayList1, smartSet0), true);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeNonDeclaredProperties(@NotNull Name name0, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(collection0, "result");
        if(this.n.isAnnotationType()) {
            JavaMethod javaMethod0 = (JavaMethod)CollectionsKt___CollectionsKt.singleOrNull(((DeclaredMemberIndex)this.getDeclaredMemberIndex().invoke()).findMethodsByName(name0));
            if(javaMethod0 != null) {
                Annotations annotations0 = LazyJavaAnnotationsKt.resolveAnnotations(this.getC(), javaMethod0);
                DescriptorVisibility descriptorVisibility0 = UtilsKt.toDescriptorVisibility(javaMethod0.getVisibility());
                Name name1 = javaMethod0.getName();
                JavaSourceElement javaSourceElement0 = this.getC().getComponents().getSourceElementFactory().source(javaMethod0);
                JavaPropertyDescriptor javaPropertyDescriptor0 = JavaPropertyDescriptor.create(this.getOwnerDescriptor(), annotations0, Modality.FINAL, descriptorVisibility0, false, name1, javaSourceElement0, false);
                Intrinsics.checkNotNullExpressionValue(javaPropertyDescriptor0, "create(\n            owne…inal = */ false\n        )");
                PropertyGetterDescriptorImpl propertyGetterDescriptorImpl0 = DescriptorFactory.createDefaultGetter(javaPropertyDescriptor0, Annotations.Companion.getEMPTY());
                Intrinsics.checkNotNullExpressionValue(propertyGetterDescriptorImpl0, "createDefaultGetter(prop…iptor, Annotations.EMPTY)");
                javaPropertyDescriptor0.initialize(propertyGetterDescriptorImpl0, null);
                KotlinType kotlinType0 = this.computeMethodReturnType(javaMethod0, ContextKt.childForMethod$default(this.getC(), javaPropertyDescriptor0, javaMethod0, 0, 4, null));
                javaPropertyDescriptor0.setType(kotlinType0, CollectionsKt__CollectionsKt.emptyList(), this.getDispatchReceiverParameter(), null, CollectionsKt__CollectionsKt.emptyList());
                propertyGetterDescriptorImpl0.initialize(kotlinType0);
                collection0.add(javaPropertyDescriptor0);
            }
        }
        Set set0 = this.n(name0);
        if(set0.isEmpty()) {
            return;
        }
        SmartSet smartSet0 = SmartSet.Companion.create();
        SmartSet smartSet1 = SmartSet.Companion.create();
        this.d(set0, collection0, smartSet0, new e(this, 0));
        this.d(g0.minus(set0, smartSet0), smartSet1, null, new e(this, 1));
        Collection collection1 = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name0, g0.plus(set0, smartSet1), collection0, this.getOwnerDescriptor(), this.getC().getComponents().getErrorReporter(), this.getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
        Intrinsics.checkNotNullExpressionValue(collection1, "resolveOverridesForNonSt…rridingUtil\n            )");
        collection0.addAll(collection1);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set computePropertyNames(@NotNull DescriptorKindFilter descriptorKindFilter0, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(descriptorKindFilter0, "kindFilter");
        if(this.n.isAnnotationType()) {
            return this.getFunctionNames();
        }
        Set set0 = new LinkedHashSet(((DeclaredMemberIndex)this.getDeclaredMemberIndex().invoke()).getFieldNames());
        Collection collection0 = this.getOwnerDescriptor().getTypeConstructor().getSupertypes();
        Intrinsics.checkNotNullExpressionValue(collection0, "ownerDescriptor.typeConstructor.supertypes");
        for(Object object0: collection0) {
            o.addAll(set0, ((KotlinType)object0).getMemberScope().getVariableNames());
        }
        return set0;
    }

    public final void d(Set set0, Collection collection0, SmartSet smartSet0, Function1 function10) {
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl1;
        JavaForKotlinOverridePropertyDescriptor javaForKotlinOverridePropertyDescriptor1;
        SimpleFunctionDescriptor simpleFunctionDescriptor1;
        for(Object object0: set0) {
            PropertyDescriptor propertyDescriptor0 = (PropertyDescriptor)object0;
            Object object1 = null;
            if(this.h(propertyDescriptor0, function10)) {
                SimpleFunctionDescriptor simpleFunctionDescriptor0 = this.k(propertyDescriptor0, function10);
                Intrinsics.checkNotNull(simpleFunctionDescriptor0);
                if(propertyDescriptor0.isVar()) {
                    simpleFunctionDescriptor1 = LazyJavaClassMemberScope.l(propertyDescriptor0, function10);
                    Intrinsics.checkNotNull(simpleFunctionDescriptor1);
                }
                else {
                    simpleFunctionDescriptor1 = null;
                }
                if(simpleFunctionDescriptor1 != null) {
                    simpleFunctionDescriptor1.getModality();
                    simpleFunctionDescriptor0.getModality();
                }
                JavaForKotlinOverridePropertyDescriptor javaForKotlinOverridePropertyDescriptor0 = new JavaForKotlinOverridePropertyDescriptor(this.getOwnerDescriptor(), simpleFunctionDescriptor0, simpleFunctionDescriptor1, propertyDescriptor0);
                KotlinType kotlinType0 = simpleFunctionDescriptor0.getReturnType();
                Intrinsics.checkNotNull(kotlinType0);
                javaForKotlinOverridePropertyDescriptor0.setType(kotlinType0, CollectionsKt__CollectionsKt.emptyList(), this.getDispatchReceiverParameter(), null, CollectionsKt__CollectionsKt.emptyList());
                PropertyGetterDescriptorImpl propertyGetterDescriptorImpl0 = DescriptorFactory.createGetter(javaForKotlinOverridePropertyDescriptor0, simpleFunctionDescriptor0.getAnnotations(), false, false, false, simpleFunctionDescriptor0.getSource());
                propertyGetterDescriptorImpl0.setInitialSignatureDescriptor(simpleFunctionDescriptor0);
                propertyGetterDescriptorImpl0.initialize(javaForKotlinOverridePropertyDescriptor0.getType());
                Intrinsics.checkNotNullExpressionValue(propertyGetterDescriptorImpl0, "createGetter(\n          …escriptor.type)\n        }");
                if(simpleFunctionDescriptor1 == null) {
                    javaForKotlinOverridePropertyDescriptor1 = javaForKotlinOverridePropertyDescriptor0;
                }
                else {
                    List list0 = simpleFunctionDescriptor1.getValueParameters();
                    Intrinsics.checkNotNullExpressionValue(list0, "setterMethod.valueParameters");
                    ValueParameterDescriptor valueParameterDescriptor0 = (ValueParameterDescriptor)CollectionsKt___CollectionsKt.firstOrNull(list0);
                    if(valueParameterDescriptor0 == null) {
                        throw new AssertionError("No parameter found for " + simpleFunctionDescriptor1);
                    }
                    javaForKotlinOverridePropertyDescriptor1 = javaForKotlinOverridePropertyDescriptor0;
                    object1 = DescriptorFactory.createSetter(javaForKotlinOverridePropertyDescriptor0, simpleFunctionDescriptor1.getAnnotations(), valueParameterDescriptor0.getAnnotations(), false, false, false, simpleFunctionDescriptor1.getVisibility(), simpleFunctionDescriptor1.getSource());
                    ((PropertyAccessorDescriptorImpl)object1).setInitialSignatureDescriptor(simpleFunctionDescriptor1);
                }
                propertyGetterDescriptorImpl1 = propertyGetterDescriptorImpl0;
                javaForKotlinOverridePropertyDescriptor1.initialize(propertyGetterDescriptorImpl1, ((PropertySetterDescriptor)object1));
                object1 = javaForKotlinOverridePropertyDescriptor1;
            }
            if(object1 != null) {
                collection0.add(object1);
                if(smartSet0 == null) {
                    break;
                }
                smartSet0.add(propertyDescriptor0);
                return;
            }
            if(false) {
                break;
            }
        }
    }

    public final Collection e() {
        if(this.o) {
            Collection collection0 = this.getOwnerDescriptor().getTypeConstructor().getSupertypes();
            Intrinsics.checkNotNullExpressionValue(collection0, "ownerDescriptor.typeConstructor.supertypes");
            return collection0;
        }
        return this.getC().getComponents().getKotlinTypeChecker().getKotlinTypeRefiner().refineSupertypes(this.getOwnerDescriptor());
    }

    public static SimpleFunctionDescriptor f(SimpleFunctionDescriptor simpleFunctionDescriptor0, FunctionDescriptor functionDescriptor0, Collection collection0) {
        if(!(collection0 instanceof Collection) || !collection0.isEmpty()) {
            for(Object object0: collection0) {
                SimpleFunctionDescriptor simpleFunctionDescriptor1 = (SimpleFunctionDescriptor)object0;
                if(!Intrinsics.areEqual(simpleFunctionDescriptor0, simpleFunctionDescriptor1) && simpleFunctionDescriptor1.getInitialSignatureDescriptor() == null && LazyJavaClassMemberScope.i(simpleFunctionDescriptor1, functionDescriptor0)) {
                    FunctionDescriptor functionDescriptor1 = simpleFunctionDescriptor0.newCopyBuilder().setHiddenToOvercomeSignatureClash().build();
                    Intrinsics.checkNotNull(functionDescriptor1);
                    return (SimpleFunctionDescriptor)functionDescriptor1;
                }
                if(false) {
                    break;
                }
            }
        }
        return simpleFunctionDescriptor0;
    }

    public static SimpleFunctionDescriptor g(SimpleFunctionDescriptor simpleFunctionDescriptor0) {
        FqName fqName0;
        List list0 = simpleFunctionDescriptor0.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(list0, "valueParameters");
        ValueParameterDescriptor valueParameterDescriptor0 = (ValueParameterDescriptor)CollectionsKt___CollectionsKt.lastOrNull(list0);
        if(valueParameterDescriptor0 != null) {
            ClassifierDescriptor classifierDescriptor0 = valueParameterDescriptor0.getType().getConstructor().getDeclarationDescriptor();
            if(classifierDescriptor0 == null) {
                fqName0 = null;
            }
            else {
                FqNameUnsafe fqNameUnsafe0 = DescriptorUtilsKt.getFqNameUnsafe(classifierDescriptor0);
                if(fqNameUnsafe0 == null) {
                    fqName0 = null;
                }
                else {
                    if(!fqNameUnsafe0.isSafe()) {
                        fqNameUnsafe0 = null;
                    }
                    fqName0 = fqNameUnsafe0 == null ? null : fqNameUnsafe0.toSafe();
                }
            }
            if(!Intrinsics.areEqual(fqName0, StandardNames.CONTINUATION_INTERFACE_FQ_NAME)) {
                valueParameterDescriptor0 = null;
            }
            if(valueParameterDescriptor0 != null) {
                CopyBuilder functionDescriptor$CopyBuilder0 = simpleFunctionDescriptor0.newCopyBuilder();
                List list1 = simpleFunctionDescriptor0.getValueParameters();
                Intrinsics.checkNotNullExpressionValue(list1, "valueParameters");
                SimpleFunctionDescriptor simpleFunctionDescriptor1 = (SimpleFunctionDescriptor)functionDescriptor$CopyBuilder0.setValueParameters(CollectionsKt___CollectionsKt.dropLast(list1, 1)).setReturnType(((TypeProjection)valueParameterDescriptor0.getType().getArguments().get(0)).getType()).build();
                if(((SimpleFunctionDescriptorImpl)simpleFunctionDescriptor1) != null) {
                    ((SimpleFunctionDescriptorImpl)simpleFunctionDescriptor1).setSuspend(true);
                }
                return simpleFunctionDescriptor1;
            }
        }
        return null;
    }

    @NotNull
    public final NotNullLazyValue getConstructors$descriptors_jvm() {
        return this.p;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    @Nullable
    public ClassifierDescriptor getContributedClassifier(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        this.recordLookup(name0, lookupLocation0);
        LazyJavaClassMemberScope lazyJavaClassMemberScope0 = (LazyJavaClassMemberScope)this.getMainScope();
        if(lazyJavaClassMemberScope0 != null) {
            MemoizedFunctionToNullable memoizedFunctionToNullable0 = lazyJavaClassMemberScope0.t;
            if(memoizedFunctionToNullable0 != null) {
                ClassifierDescriptor classifierDescriptor0 = (ClassDescriptor)memoizedFunctionToNullable0.invoke(name0);
                return classifierDescriptor0 == null ? ((ClassifierDescriptor)this.t.invoke(name0)) : classifierDescriptor0;
            }
        }
        return (ClassifierDescriptor)this.t.invoke(name0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Collection getContributedFunctions(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        this.recordLookup(name0, lookupLocation0);
        return super.getContributedFunctions(name0, lookupLocation0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Collection getContributedVariables(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        this.recordLookup(name0, lookupLocation0);
        return super.getContributedVariables(name0, lookupLocation0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @Nullable
    public ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return DescriptorUtils.getDispatchReceiverParameterIfNeeded(this.getOwnerDescriptor());
    }

    @NotNull
    public ClassDescriptor getOwnerDescriptor() {
        return this.m;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public DeclarationDescriptor getOwnerDescriptor() {
        return this.getOwnerDescriptor();
    }

    public final boolean h(PropertyDescriptor propertyDescriptor0, Function1 function10) {
        if(JavaDescriptorUtilKt.isJavaField(propertyDescriptor0)) {
            return false;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptor0 = this.k(propertyDescriptor0, function10);
        SimpleFunctionDescriptor simpleFunctionDescriptor1 = LazyJavaClassMemberScope.l(propertyDescriptor0, function10);
        if(simpleFunctionDescriptor0 == null) {
            return false;
        }
        return propertyDescriptor0.isVar() ? simpleFunctionDescriptor1 != null && simpleFunctionDescriptor1.getModality() == simpleFunctionDescriptor0.getModality() : true;
    }

    public static boolean i(FunctionDescriptor functionDescriptor0, FunctionDescriptor functionDescriptor1) {
        Result overridingUtil$OverrideCompatibilityInfo$Result0 = OverridingUtil.DEFAULT.isOverridableByWithoutExternalConditions(functionDescriptor1, functionDescriptor0, true).getResult();
        Intrinsics.checkNotNullExpressionValue(overridingUtil$OverrideCompatibilityInfo$Result0, "DEFAULT.isOverridableByW…iptor, this, true).result");
        return overridingUtil$OverrideCompatibilityInfo$Result0 == Result.OVERRIDABLE && !JavaIncompatibilityRulesOverridabilityCondition.Companion.doesJavaOverrideHaveIncompatibleValueParameterKinds(functionDescriptor1, functionDescriptor0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public boolean isVisibleAsFunction(@NotNull JavaMethodDescriptor javaMethodDescriptor0) {
        Intrinsics.checkNotNullParameter(javaMethodDescriptor0, "<this>");
        return this.n.isAnnotationType() ? false : this.p(javaMethodDescriptor0);
    }

    public static SimpleFunctionDescriptor j(PropertyDescriptor propertyDescriptor0, String s, Function1 function10) {
        SimpleFunctionDescriptor simpleFunctionDescriptor0;
        Name name0 = Name.identifier(s);
        Intrinsics.checkNotNullExpressionValue(name0, "identifier(getterName)");
        Iterator iterator0 = ((Iterable)function10.invoke(name0)).iterator();
        do {
            simpleFunctionDescriptor0 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            SimpleFunctionDescriptor simpleFunctionDescriptor1 = (SimpleFunctionDescriptor)object0;
            if(simpleFunctionDescriptor1.getValueParameters().size() == 0) {
                KotlinType kotlinType0 = simpleFunctionDescriptor1.getReturnType();
                if((kotlinType0 == null ? false : KotlinTypeChecker.DEFAULT.isSubtypeOf(kotlinType0, propertyDescriptor0.getType()))) {
                    simpleFunctionDescriptor0 = simpleFunctionDescriptor1;
                }
            }
        }
        while(simpleFunctionDescriptor0 == null);
        return simpleFunctionDescriptor0;
    }

    public final SimpleFunctionDescriptor k(PropertyDescriptor propertyDescriptor0, Function1 function10) {
        PropertyGetterDescriptor propertyGetterDescriptor0 = propertyDescriptor0.getGetter();
        String s = null;
        PropertyGetterDescriptor propertyGetterDescriptor1 = propertyGetterDescriptor0 == null ? null : ((PropertyGetterDescriptor)SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName(propertyGetterDescriptor0));
        if(propertyGetterDescriptor1 != null) {
            s = ClassicBuiltinSpecialProperties.INSTANCE.getBuiltinSpecialPropertyGetterName(propertyGetterDescriptor1);
        }
        if(s != null && !SpecialBuiltinMembers.hasRealKotlinSuperClassWithOverrideOf(this.getOwnerDescriptor(), propertyGetterDescriptor1)) {
            return LazyJavaClassMemberScope.j(propertyDescriptor0, s, function10);
        }
        String s1 = propertyDescriptor0.getName().asString();
        Intrinsics.checkNotNullExpressionValue(s1, "name.asString()");
        return LazyJavaClassMemberScope.j(propertyDescriptor0, JvmAbi.getterName(s1), function10);
    }

    public static SimpleFunctionDescriptor l(PropertyDescriptor propertyDescriptor0, Function1 function10) {
        SimpleFunctionDescriptor simpleFunctionDescriptor0;
        String s = propertyDescriptor0.getName().asString();
        Intrinsics.checkNotNullExpressionValue(s, "name.asString()");
        Name name0 = Name.identifier(JvmAbi.setterName(s));
        Intrinsics.checkNotNullExpressionValue(name0, "identifier(JvmAbi.setterName(name.asString()))");
        Iterator iterator0 = ((Iterable)function10.invoke(name0)).iterator();
        do {
            simpleFunctionDescriptor0 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            SimpleFunctionDescriptor simpleFunctionDescriptor1 = (SimpleFunctionDescriptor)object0;
            if(simpleFunctionDescriptor1.getValueParameters().size() == 1) {
                KotlinType kotlinType0 = simpleFunctionDescriptor1.getReturnType();
                if(kotlinType0 != null && KotlinBuiltIns.isUnit(kotlinType0)) {
                    List list0 = simpleFunctionDescriptor1.getValueParameters();
                    Intrinsics.checkNotNullExpressionValue(list0, "descriptor.valueParameters");
                    KotlinType kotlinType1 = ((ValueParameterDescriptor)CollectionsKt___CollectionsKt.single(list0)).getType();
                    KotlinType kotlinType2 = propertyDescriptor0.getType();
                    if(KotlinTypeChecker.DEFAULT.equalTypes(kotlinType1, kotlinType2)) {
                        simpleFunctionDescriptor0 = simpleFunctionDescriptor1;
                    }
                }
            }
        }
        while(simpleFunctionDescriptor0 == null);
        return simpleFunctionDescriptor0;
    }

    public final LinkedHashSet m(Name name0) {
        Iterable iterable0 = this.e();
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        for(Object object0: iterable0) {
            o.addAll(linkedHashSet0, ((KotlinType)object0).getMemberScope().getContributedFunctions(name0, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet0;
    }

    public final Set n(Name name0) {
        Iterable iterable0 = this.e();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            Iterable iterable1 = ((KotlinType)object0).getMemberScope().getContributedVariables(name0, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(iterable1, 10));
            for(Object object1: iterable1) {
                arrayList1.add(((PropertyDescriptor)object1));
            }
            o.addAll(arrayList0, arrayList1);
        }
        return CollectionsKt___CollectionsKt.toSet(arrayList0);
    }

    public static boolean o(SimpleFunctionDescriptor simpleFunctionDescriptor0, FunctionDescriptor functionDescriptor0) {
        String s = MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor0, false, false, 2, null);
        FunctionDescriptor functionDescriptor1 = functionDescriptor0.getOriginal();
        Intrinsics.checkNotNullExpressionValue(functionDescriptor1, "builtinWithErasedParameters.original");
        return Intrinsics.areEqual(s, MethodSignatureMappingKt.computeJvmDescriptor$default(functionDescriptor1, false, false, 2, null)) && !LazyJavaClassMemberScope.i(simpleFunctionDescriptor0, functionDescriptor0);
    }

    public final boolean p(SimpleFunctionDescriptor simpleFunctionDescriptor0) {
        Name name0 = simpleFunctionDescriptor0.getName();
        Intrinsics.checkNotNullExpressionValue(name0, "function.name");
        Iterable iterable0 = PropertiesConventionUtilKt.getPropertyNamesCandidatesByAccessorName(name0);
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object0: iterable0) {
                Iterable iterable1 = this.n(((Name)object0));
                if(!(iterable1 instanceof Collection) || !((Collection)iterable1).isEmpty()) {
                    for(Object object1: iterable1) {
                        PropertyDescriptor propertyDescriptor0 = (PropertyDescriptor)object1;
                        if(!this.h(propertyDescriptor0, new b2(22, simpleFunctionDescriptor0, this))) {
                            continue;
                        }
                        if(!propertyDescriptor0.isVar()) {
                            String s = simpleFunctionDescriptor0.getName().asString();
                            Intrinsics.checkNotNullExpressionValue(s, "function.name.asString()");
                            if(!JvmAbi.isSetterName(s)) {
                                return false;
                            }
                            continue;
                        }
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        Name name1 = simpleFunctionDescriptor0.getName();
        Intrinsics.checkNotNullExpressionValue(name1, "name");
        Name name2 = SpecialGenericSignatures.Companion.getBuiltinFunctionNamesByJvmName(name1);
        if(name2 != null) {
            LinkedHashSet linkedHashSet0 = this.m(name2);
            ArrayList arrayList0 = new ArrayList();
            for(Object object2: linkedHashSet0) {
                if(SpecialBuiltinMembers.doesOverrideBuiltinWithDifferentJvmName(((SimpleFunctionDescriptor)object2))) {
                    arrayList0.add(object2);
                }
            }
            if(!arrayList0.isEmpty()) {
                CopyBuilder functionDescriptor$CopyBuilder0 = simpleFunctionDescriptor0.newCopyBuilder();
                functionDescriptor$CopyBuilder0.setName(name2);
                functionDescriptor$CopyBuilder0.setSignatureChange();
                functionDescriptor$CopyBuilder0.setPreserveSourceElement();
                FunctionDescriptor functionDescriptor0 = functionDescriptor$CopyBuilder0.build();
                Intrinsics.checkNotNull(functionDescriptor0);
                if(!arrayList0.isEmpty()) {
                    for(Object object3: arrayList0) {
                        FunctionDescriptor functionDescriptor1 = BuiltinMethodsWithDifferentJvmName.INSTANCE.isRemoveAtByIndex(((SimpleFunctionDescriptor)object3)) ? ((SimpleFunctionDescriptor)functionDescriptor0).getOriginal() : ((SimpleFunctionDescriptor)functionDescriptor0);
                        Intrinsics.checkNotNullExpressionValue(functionDescriptor1, "if (superDescriptor.isRe…iginal else subDescriptor");
                        if(LazyJavaClassMemberScope.i(functionDescriptor1, ((SimpleFunctionDescriptor)object3))) {
                            return false;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
            }
        }
        Name name3 = simpleFunctionDescriptor0.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "name");
        if(BuiltinMethodsWithSpecialGenericSignature.INSTANCE.getSameAsBuiltinMethodWithErasedValueParameters(name3)) {
            Name name4 = simpleFunctionDescriptor0.getName();
            Intrinsics.checkNotNullExpressionValue(name4, "name");
            LinkedHashSet linkedHashSet1 = this.m(name4);
            ArrayList arrayList1 = new ArrayList();
            for(Object object4: linkedHashSet1) {
                FunctionDescriptor functionDescriptor2 = BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(((SimpleFunctionDescriptor)object4));
                if(functionDescriptor2 != null) {
                    arrayList1.add(functionDescriptor2);
                }
            }
            if(!arrayList1.isEmpty()) {
                for(Object object5: arrayList1) {
                    if(LazyJavaClassMemberScope.o(simpleFunctionDescriptor0, ((FunctionDescriptor)object5))) {
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        SimpleFunctionDescriptor simpleFunctionDescriptor1 = LazyJavaClassMemberScope.g(simpleFunctionDescriptor0);
        if(simpleFunctionDescriptor1 != null) {
            Name name5 = simpleFunctionDescriptor0.getName();
            Intrinsics.checkNotNullExpressionValue(name5, "name");
            LinkedHashSet linkedHashSet2 = this.m(name5);
            if(!linkedHashSet2.isEmpty()) {
                for(Object object6: linkedHashSet2) {
                    if(((SimpleFunctionDescriptor)object6).isSuspend() && LazyJavaClassMemberScope.i(simpleFunctionDescriptor1, ((SimpleFunctionDescriptor)object6))) {
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return true;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    public void recordLookup(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        kotlin.reflect.jvm.internal.impl.incremental.UtilsKt.record(this.getC().getComponents().getLookupTracker(), lookupLocation0, this.getOwnerDescriptor(), name0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public MethodSignatureData resolveMethodSignature(@NotNull JavaMethod javaMethod0, @NotNull List list0, @NotNull KotlinType kotlinType0, @NotNull List list1) {
        Intrinsics.checkNotNullParameter(javaMethod0, "method");
        Intrinsics.checkNotNullParameter(list0, "methodTypeParameters");
        Intrinsics.checkNotNullParameter(kotlinType0, "returnType");
        Intrinsics.checkNotNullParameter(list1, "valueParameters");
        PropagatedSignature signaturePropagator$PropagatedSignature0 = this.getC().getComponents().getSignaturePropagator().resolvePropagatedSignature(javaMethod0, this.getOwnerDescriptor(), kotlinType0, null, list1, list0);
        Intrinsics.checkNotNullExpressionValue(signaturePropagator$PropagatedSignature0, "c.components.signaturePr…dTypeParameters\n        )");
        KotlinType kotlinType1 = signaturePropagator$PropagatedSignature0.getReturnType();
        Intrinsics.checkNotNullExpressionValue(kotlinType1, "propagated.returnType");
        List list2 = signaturePropagator$PropagatedSignature0.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(list2, "propagated.valueParameters");
        List list3 = signaturePropagator$PropagatedSignature0.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(list3, "propagated.typeParameters");
        List list4 = signaturePropagator$PropagatedSignature0.getErrors();
        Intrinsics.checkNotNullExpressionValue(list4, "propagated.errors");
        return new MethodSignatureData(kotlinType1, signaturePropagator$PropagatedSignature0.getReceiverType(), list2, list3, signaturePropagator$PropagatedSignature0.hasStableParameterNames(), list4);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public String toString() {
        return "Lazy Java member scope for " + this.n.getFqName();
    }
}

