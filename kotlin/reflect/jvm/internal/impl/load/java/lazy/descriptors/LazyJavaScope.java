package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import a5.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.l;
import kotlin.collections.w;
import kotlin.collections.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorWithInitializerImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude.NonExtensions;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import se.n;
import se.o;
import se.p;
import se.q;
import se.r;

@SourceDebugExtension({"SMAP\nLazyJavaScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,405:1\n1477#2:406\n1502#2,3:407\n1505#2,3:417\n1549#2:420\n1620#2,3:421\n1549#2:424\n1620#2,3:425\n361#3,7:410\n*S KotlinDebug\n*F\n+ 1 LazyJavaScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaScope\n*L\n129#1:406\n129#1:407,3\n129#1:417,3\n165#1:420\n165#1:421,3\n212#1:424\n212#1:425,3\n129#1:410,7\n*E\n"})
public abstract class LazyJavaScope extends MemberScopeImpl {
    public static final class MethodSignatureData {
        public final KotlinType a;
        public final KotlinType b;
        public final List c;
        public final List d;
        public final boolean e;
        public final List f;

        public MethodSignatureData(@NotNull KotlinType kotlinType0, @Nullable KotlinType kotlinType1, @NotNull List list0, @NotNull List list1, boolean z, @NotNull List list2) {
            Intrinsics.checkNotNullParameter(kotlinType0, "returnType");
            Intrinsics.checkNotNullParameter(list0, "valueParameters");
            Intrinsics.checkNotNullParameter(list1, "typeParameters");
            Intrinsics.checkNotNullParameter(list2, "errors");
            super();
            this.a = kotlinType0;
            this.b = kotlinType1;
            this.c = list0;
            this.d = list1;
            this.e = z;
            this.f = list2;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof MethodSignatureData)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((MethodSignatureData)object0).a)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((MethodSignatureData)object0).b)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((MethodSignatureData)object0).c)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.d, ((MethodSignatureData)object0).d)) {
                return false;
            }
            return this.e == ((MethodSignatureData)object0).e ? Intrinsics.areEqual(this.f, ((MethodSignatureData)object0).f) : false;
        }

        @NotNull
        public final List getErrors() {
            return this.f;
        }

        public final boolean getHasStableParameterNames() {
            return this.e;
        }

        @Nullable
        public final KotlinType getReceiverType() {
            return this.b;
        }

        @NotNull
        public final KotlinType getReturnType() {
            return this.a;
        }

        @NotNull
        public final List getTypeParameters() {
            return this.d;
        }

        @NotNull
        public final List getValueParameters() {
            return this.c;
        }

        @Override
        public int hashCode() {
            int v = b.c(this.d, b.c(this.c, (this.a.hashCode() * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F, 0x1F), 0x1F);
            int v1 = this.e;
            if(v1) {
                v1 = 1;
            }
            return this.f.hashCode() + (v + v1) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "MethodSignatureData(returnType=" + this.a + ", receiverType=" + this.b + ", valueParameters=" + this.c + ", typeParameters=" + this.d + ", hasStableParameterNames=" + this.e + ", errors=" + this.f + ')';
        }
    }

    public static final class ResolvedValueParameters {
        public final List a;
        public final boolean b;

        public ResolvedValueParameters(@NotNull List list0, boolean z) {
            Intrinsics.checkNotNullParameter(list0, "descriptors");
            super();
            this.a = list0;
            this.b = z;
        }

        @NotNull
        public final List getDescriptors() {
            return this.a;
        }

        public final boolean getHasSynthesizedNames() {
            return this.b;
        }
    }

    public final LazyJavaResolverContext a;
    public final LazyJavaScope b;
    public final NotNullLazyValue c;
    public final NotNullLazyValue d;
    public final MemoizedFunctionToNotNull e;
    public final MemoizedFunctionToNullable f;
    public final MemoizedFunctionToNotNull g;
    public final NotNullLazyValue h;
    public final NotNullLazyValue i;
    public final NotNullLazyValue j;
    public final MemoizedFunctionToNotNull k;
    public static final KProperty[] l;

    static {
        LazyJavaScope.l = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaScope.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaScope.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaScope.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    }

    public LazyJavaScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @Nullable LazyJavaScope lazyJavaScope0) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "c");
        super();
        this.a = lazyJavaResolverContext0;
        this.b = lazyJavaScope0;
        this.c = lazyJavaResolverContext0.getStorageManager().createRecursionTolerantLazyValue(new n(this), CollectionsKt__CollectionsKt.emptyList());
        this.d = lazyJavaResolverContext0.getStorageManager().createLazyValue(new o(this, 1));
        this.e = lazyJavaResolverContext0.getStorageManager().createMemoizedFunction(new p(this, 1));
        this.f = lazyJavaResolverContext0.getStorageManager().createMemoizedFunctionWithNullableValues(new p(this, 0));
        this.g = lazyJavaResolverContext0.getStorageManager().createMemoizedFunction(new p(this, 2));
        this.h = lazyJavaResolverContext0.getStorageManager().createLazyValue(new o(this, 2));
        this.i = lazyJavaResolverContext0.getStorageManager().createLazyValue(new o(this, 3));
        this.j = lazyJavaResolverContext0.getStorageManager().createLazyValue(new o(this, 0));
        this.k = lazyJavaResolverContext0.getStorageManager().createMemoizedFunction(new p(this, 3));
    }

    public LazyJavaScope(LazyJavaResolverContext lazyJavaResolverContext0, LazyJavaScope lazyJavaScope0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            lazyJavaScope0 = null;
        }
        this(lazyJavaResolverContext0, lazyJavaScope0);
    }

    public static final PropertyDescriptor access$resolveProperty(LazyJavaScope lazyJavaScope0, JavaField javaField0) {
        lazyJavaScope0.getClass();
        boolean z = javaField0.isFinal();
        boolean z1 = true;
        LazyJavaResolverContext lazyJavaResolverContext0 = lazyJavaScope0.a;
        Annotations annotations0 = LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext0, javaField0);
        DeclarationDescriptor declarationDescriptor0 = lazyJavaScope0.getOwnerDescriptor();
        Modality modality0 = Modality.FINAL;
        DescriptorVisibility descriptorVisibility0 = UtilsKt.toDescriptorVisibility(javaField0.getVisibility());
        Name name0 = javaField0.getName();
        JavaSourceElement javaSourceElement0 = lazyJavaResolverContext0.getComponents().getSourceElementFactory().source(javaField0);
        if(!javaField0.isFinal() || !javaField0.isStatic()) {
            z1 = false;
        }
        PropertyDescriptor propertyDescriptor0 = JavaPropertyDescriptor.create(declarationDescriptor0, annotations0, modality0, descriptorVisibility0, !z, name0, javaSourceElement0, z1);
        Intrinsics.checkNotNullExpressionValue(propertyDescriptor0, "create(\n            owne…d.isFinalStatic\n        )");
        ((PropertyDescriptorImpl)propertyDescriptor0).initialize(null, null, null, null);
        KotlinType kotlinType0 = lazyJavaResolverContext0.getTypeResolver().transformJavaType(javaField0.getType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null));
        if((KotlinBuiltIns.isPrimitiveType(kotlinType0) || KotlinBuiltIns.isString(kotlinType0)) && javaField0.isFinal() && javaField0.isStatic() && javaField0.getHasConstantNotNullInitializer()) {
            kotlinType0 = TypeUtils.makeNotNullable(kotlinType0);
            Intrinsics.checkNotNullExpressionValue(kotlinType0, "makeNotNullable(propertyType)");
        }
        ((PropertyDescriptorImpl)propertyDescriptor0).setType(kotlinType0, CollectionsKt__CollectionsKt.emptyList(), lazyJavaScope0.getDispatchReceiverParameter(), null, CollectionsKt__CollectionsKt.emptyList());
        if(DescriptorUtils.shouldRecordInitializerForProperty(propertyDescriptor0, ((VariableDescriptorImpl)propertyDescriptor0).getType())) {
            ((VariableDescriptorWithInitializerImpl)propertyDescriptor0).setCompileTimeInitializerFactory(new q(lazyJavaScope0, javaField0, ((JavaPropertyDescriptor)propertyDescriptor0), 1));
        }
        lazyJavaResolverContext0.getComponents().getJavaResolverCache().recordField(javaField0, propertyDescriptor0);
        return propertyDescriptor0;
    }

    public static final void access$retainMostSpecificMethods(LazyJavaScope lazyJavaScope0, Set set0) {
        lazyJavaScope0.getClass();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: set0) {
            String s = MethodSignatureMappingKt.computeJvmDescriptor$default(((SimpleFunctionDescriptor)object0), false, false, 2, null);
            ArrayList arrayList0 = linkedHashMap0.get(s);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                linkedHashMap0.put(s, arrayList0);
            }
            arrayList0.add(object0);
        }
        for(Object object1: linkedHashMap0.values()) {
            List list0 = (List)object1;
            if(list0.size() != 1) {
                Collection collection0 = OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(list0, r.w);
                set0.removeAll(list0);
                set0.addAll(collection0);
            }
        }
    }

    @NotNull
    public abstract Set computeClassNames(@NotNull DescriptorKindFilter arg1, @Nullable Function1 arg2);

    @NotNull
    public final List computeDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(descriptorKindFilter0, "kindFilter");
        Intrinsics.checkNotNullParameter(function10, "nameFilter");
        NoLookupLocation noLookupLocation0 = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        if(descriptorKindFilter0.acceptsKinds(7)) {
            for(Object object0: this.computeClassNames(descriptorKindFilter0, function10)) {
                Name name0 = (Name)object0;
                if(((Boolean)function10.invoke(name0)).booleanValue()) {
                    CollectionsKt.addIfNotNull(linkedHashSet0, this.getContributedClassifier(name0, noLookupLocation0));
                }
            }
        }
        if(descriptorKindFilter0.acceptsKinds(16) && !descriptorKindFilter0.getExcludes().contains(NonExtensions.INSTANCE)) {
            for(Object object1: this.computeFunctionNames(descriptorKindFilter0, function10)) {
                Name name1 = (Name)object1;
                if(((Boolean)function10.invoke(name1)).booleanValue()) {
                    linkedHashSet0.addAll(this.getContributedFunctions(name1, noLookupLocation0));
                }
            }
        }
        if(descriptorKindFilter0.acceptsKinds(0x20) && !descriptorKindFilter0.getExcludes().contains(NonExtensions.INSTANCE)) {
            for(Object object2: this.computePropertyNames(descriptorKindFilter0, function10)) {
                Name name2 = (Name)object2;
                if(((Boolean)function10.invoke(name2)).booleanValue()) {
                    linkedHashSet0.addAll(this.getContributedVariables(name2, noLookupLocation0));
                }
            }
        }
        return CollectionsKt___CollectionsKt.toList(linkedHashSet0);
    }

    @NotNull
    public abstract Set computeFunctionNames(@NotNull DescriptorKindFilter arg1, @Nullable Function1 arg2);

    public void computeImplicitlyDeclaredFunctions(@NotNull Collection collection0, @NotNull Name name0) {
        Intrinsics.checkNotNullParameter(collection0, "result");
        Intrinsics.checkNotNullParameter(name0, "name");
    }

    @NotNull
    public abstract DeclaredMemberIndex computeMemberIndex();

    @NotNull
    public final KotlinType computeMethodReturnType(@NotNull JavaMethod javaMethod0, @NotNull LazyJavaResolverContext lazyJavaResolverContext0) {
        Intrinsics.checkNotNullParameter(javaMethod0, "method");
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "c");
        boolean z = javaMethod0.getContainingClass().isAnnotationType();
        JavaTypeAttributes javaTypeAttributes0 = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, z, false, null, 6, null);
        return lazyJavaResolverContext0.getTypeResolver().transformJavaType(javaMethod0.getReturnType(), javaTypeAttributes0);
    }

    public abstract void computeNonDeclaredFunctions(@NotNull Collection arg1, @NotNull Name arg2);

    public abstract void computeNonDeclaredProperties(@NotNull Name arg1, @NotNull Collection arg2);

    @NotNull
    public abstract Set computePropertyNames(@NotNull DescriptorKindFilter arg1, @Nullable Function1 arg2);

    @NotNull
    public final NotNullLazyValue getAllDescriptors() {
        return this.c;
    }

    @NotNull
    public final LazyJavaResolverContext getC() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    @NotNull
    public Set getClassifierNames() {
        return (Set)StorageKt.getValue(this.j, this, LazyJavaScope.l[2]);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    @NotNull
    public Collection getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(descriptorKindFilter0, "kindFilter");
        Intrinsics.checkNotNullParameter(function10, "nameFilter");
        return (Collection)this.c.invoke();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    @NotNull
    public Collection getContributedFunctions(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        return !this.getFunctionNames().contains(name0) ? CollectionsKt__CollectionsKt.emptyList() : ((Collection)this.g.invoke(name0));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    @NotNull
    public Collection getContributedVariables(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        return !this.getVariableNames().contains(name0) ? CollectionsKt__CollectionsKt.emptyList() : ((Collection)this.k.invoke(name0));
    }

    @NotNull
    public final NotNullLazyValue getDeclaredMemberIndex() {
        return this.d;
    }

    @Nullable
    public abstract ReceiverParameterDescriptor getDispatchReceiverParameter();

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    @NotNull
    public Set getFunctionNames() {
        return (Set)StorageKt.getValue(this.h, this, LazyJavaScope.l[0]);
    }

    @Nullable
    public final LazyJavaScope getMainScope() {
        return this.b;
    }

    @NotNull
    public abstract DeclarationDescriptor getOwnerDescriptor();

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    @NotNull
    public Set getVariableNames() {
        return (Set)StorageKt.getValue(this.i, this, LazyJavaScope.l[1]);
    }

    public boolean isVisibleAsFunction(@NotNull JavaMethodDescriptor javaMethodDescriptor0) {
        Intrinsics.checkNotNullParameter(javaMethodDescriptor0, "<this>");
        return true;
    }

    @NotNull
    public abstract MethodSignatureData resolveMethodSignature(@NotNull JavaMethod arg1, @NotNull List arg2, @NotNull KotlinType arg3, @NotNull List arg4);

    @NotNull
    public final JavaMethodDescriptor resolveMethodToFunctionDescriptor(@NotNull JavaMethod javaMethod0) {
        Map map0;
        Intrinsics.checkNotNullParameter(javaMethod0, "method");
        Annotations annotations0 = LazyJavaAnnotationsKt.resolveAnnotations(this.a, javaMethod0);
        JavaMethodDescriptor javaMethodDescriptor0 = JavaMethodDescriptor.createJavaMethod(this.getOwnerDescriptor(), annotations0, javaMethod0.getName(), this.a.getComponents().getSourceElementFactory().source(javaMethod0), ((DeclaredMemberIndex)this.d.invoke()).findRecordComponentByName(javaMethod0.getName()) != null && javaMethod0.getValueParameters().isEmpty());
        Intrinsics.checkNotNullExpressionValue(javaMethodDescriptor0, "createJavaMethod(\n      …eters.isEmpty()\n        )");
        LazyJavaResolverContext lazyJavaResolverContext0 = ContextKt.childForMethod$default(this.a, javaMethodDescriptor0, javaMethod0, 0, 4, null);
        Iterable iterable0 = javaMethod0.getTypeParameters();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            TypeParameterDescriptor typeParameterDescriptor0 = lazyJavaResolverContext0.getTypeParameterResolver().resolveTypeParameter(((JavaTypeParameter)object0));
            Intrinsics.checkNotNull(typeParameterDescriptor0);
            arrayList0.add(typeParameterDescriptor0);
        }
        ResolvedValueParameters lazyJavaScope$ResolvedValueParameters0 = this.resolveValueParameters(lazyJavaResolverContext0, javaMethodDescriptor0, javaMethod0.getValueParameters());
        MethodSignatureData lazyJavaScope$MethodSignatureData0 = this.resolveMethodSignature(javaMethod0, arrayList0, this.computeMethodReturnType(javaMethod0, lazyJavaResolverContext0), lazyJavaScope$ResolvedValueParameters0.getDescriptors());
        KotlinType kotlinType0 = lazyJavaScope$MethodSignatureData0.getReceiverType();
        ReceiverParameterDescriptor receiverParameterDescriptor0 = kotlinType0 == null ? null : DescriptorFactory.createExtensionReceiverParameterForCallable(javaMethodDescriptor0, kotlinType0, Annotations.Companion.getEMPTY());
        ReceiverParameterDescriptor receiverParameterDescriptor1 = this.getDispatchReceiverParameter();
        List list0 = CollectionsKt__CollectionsKt.emptyList();
        List list1 = lazyJavaScope$MethodSignatureData0.getTypeParameters();
        List list2 = lazyJavaScope$MethodSignatureData0.getValueParameters();
        KotlinType kotlinType1 = lazyJavaScope$MethodSignatureData0.getReturnType();
        boolean z = javaMethod0.isAbstract();
        boolean z1 = javaMethod0.isFinal();
        Modality modality0 = Modality.Companion.convertFromFlags(false, z, ((boolean)(true ^ z1)));
        DescriptorVisibility descriptorVisibility0 = UtilsKt.toDescriptorVisibility(javaMethod0.getVisibility());
        if(lazyJavaScope$MethodSignatureData0.getReceiverType() == null) {
            map0 = x.emptyMap();
        }
        else {
            Object object1 = CollectionsKt___CollectionsKt.first(lazyJavaScope$ResolvedValueParameters0.getDescriptors());
            map0 = w.mapOf(TuplesKt.to(JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER, object1));
        }
        javaMethodDescriptor0.initialize(receiverParameterDescriptor0, receiverParameterDescriptor1, list0, list1, list2, kotlinType1, modality0, descriptorVisibility0, map0);
        javaMethodDescriptor0.setParameterNamesStatus(lazyJavaScope$MethodSignatureData0.getHasStableParameterNames(), lazyJavaScope$ResolvedValueParameters0.getHasSynthesizedNames());
        if(!lazyJavaScope$MethodSignatureData0.getErrors().isEmpty()) {
            lazyJavaResolverContext0.getComponents().getSignaturePropagator().reportSignatureErrors(javaMethodDescriptor0, lazyJavaScope$MethodSignatureData0.getErrors());
        }
        return javaMethodDescriptor0;
    }

    @NotNull
    public final ResolvedValueParameters resolveValueParameters(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @NotNull FunctionDescriptor functionDescriptor0, @NotNull List list0) {
        Name name0;
        Pair pair0;
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "c");
        Intrinsics.checkNotNullParameter(functionDescriptor0, "function");
        Intrinsics.checkNotNullParameter(list0, "jValueParameters");
        Iterable iterable0 = CollectionsKt___CollectionsKt.withIndex(list0);
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        boolean z = false;
        for(Object object0: iterable0) {
            int v = ((IndexedValue)object0).component1();
            JavaValueParameter javaValueParameter0 = (JavaValueParameter)((IndexedValue)object0).component2();
            Annotations annotations0 = LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext0, javaValueParameter0);
            JavaTypeAttributes javaTypeAttributes0 = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null);
            JavaArrayType javaArrayType0 = null;
            if(javaValueParameter0.isVararg()) {
                JavaType javaType0 = javaValueParameter0.getType();
                if(javaType0 instanceof JavaArrayType) {
                    javaArrayType0 = (JavaArrayType)javaType0;
                }
                if(javaArrayType0 == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + javaValueParameter0);
                }
                KotlinType kotlinType0 = lazyJavaResolverContext0.getTypeResolver().transformArrayType(javaArrayType0, javaTypeAttributes0, true);
                pair0 = TuplesKt.to(kotlinType0, lazyJavaResolverContext0.getModule().getBuiltIns().getArrayElementType(kotlinType0));
            }
            else {
                pair0 = TuplesKt.to(lazyJavaResolverContext0.getTypeResolver().transformJavaType(javaValueParameter0.getType(), javaTypeAttributes0), null);
            }
            KotlinType kotlinType1 = (KotlinType)pair0.component1();
            Object object1 = pair0.component2();
            if(!Intrinsics.areEqual(functionDescriptor0.getName().asString(), "equals") || list0.size() != 1 || !Intrinsics.areEqual(lazyJavaResolverContext0.getModule().getBuiltIns().getNullableAnyType(), kotlinType1)) {
                name0 = javaValueParameter0.getName();
                if(name0 == null) {
                    z = true;
                }
                if(name0 == null) {
                    name0 = Name.identifier(("p" + v));
                    Intrinsics.checkNotNullExpressionValue(name0, "identifier(\"p$index\")");
                }
            }
            else {
                name0 = Name.identifier("other");
            }
            Intrinsics.checkNotNullExpressionValue(name0, "if (function.name.asStri…(\"p$index\")\n            }");
            arrayList0.add(new ValueParameterDescriptorImpl(functionDescriptor0, null, v, annotations0, name0, kotlinType1, false, false, false, ((KotlinType)object1), lazyJavaResolverContext0.getComponents().getSourceElementFactory().source(javaValueParameter0)));
        }
        return new ResolvedValueParameters(CollectionsKt___CollectionsKt.toList(arrayList0), z);
    }

    @Override
    @NotNull
    public String toString() {
        return "Lazy scope for " + this.getOwnerDescriptor();
    }
}

