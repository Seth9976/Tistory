package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.f0;
import kotlin.collections.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeKt;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import o0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nJvmPackageScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/JvmPackageScope\n+ 2 scopeUtils.kt\norg/jetbrains/kotlin/util/collectionUtils/ScopeUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,109:1\n92#2,14:110\n60#2,5:124\n60#2,5:129\n60#2,5:134\n10664#3,5:139\n10664#3,5:144\n*S KotlinDebug\n*F\n+ 1 JvmPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/JvmPackageScope\n*L\n58#1:110,14\n63#1:124,5\n68#1:129,5\n74#1:134,5\n76#1:139,5\n80#1:144,5\n*E\n"})
public final class JvmPackageScope implements MemberScope {
    public final LazyJavaResolverContext a;
    public final LazyJavaPackageFragment b;
    public final LazyJavaPackageScope c;
    public final NotNullLazyValue d;
    public static final KProperty[] e;

    static {
        JvmPackageScope.e = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JvmPackageScope.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    }

    public JvmPackageScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @NotNull JavaPackage javaPackage0, @NotNull LazyJavaPackageFragment lazyJavaPackageFragment0) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "c");
        Intrinsics.checkNotNullParameter(javaPackage0, "jPackage");
        Intrinsics.checkNotNullParameter(lazyJavaPackageFragment0, "packageFragment");
        super();
        this.a = lazyJavaResolverContext0;
        this.b = lazyJavaPackageFragment0;
        this.c = new LazyJavaPackageScope(lazyJavaResolverContext0, javaPackage0, lazyJavaPackageFragment0);
        this.d = lazyJavaResolverContext0.getStorageManager().createLazyValue(new e(this, 20));
    }

    public final MemberScope[] a() {
        return (MemberScope[])StorageKt.getValue(this.d, this, JvmPackageScope.e[0]);
    }

    public static final LazyJavaResolverContext access$getC$p(JvmPackageScope jvmPackageScope0) {
        return jvmPackageScope0.a;
    }

    public static final LazyJavaPackageFragment access$getPackageFragment$p(JvmPackageScope jvmPackageScope0) {
        return jvmPackageScope0.b;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @Nullable
    public Set getClassifierNames() {
        Set set0 = MemberScopeKt.flatMapClassifierNamesOrNull(ArraysKt___ArraysKt.asIterable(this.a()));
        if(set0 != null) {
            set0.addAll(this.c.getClassifierNames());
            return set0;
        }
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    public ClassifierDescriptor getContributedClassifier(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        this.recordLookup(name0, lookupLocation0);
        ClassifierDescriptor classifierDescriptor0 = this.c.getContributedClassifier(name0, lookupLocation0);
        if(classifierDescriptor0 != null) {
            return classifierDescriptor0;
        }
        MemberScope[] arr_memberScope = this.a();
        ClassifierDescriptor classifierDescriptor1 = null;
        for(int v = 0; v < arr_memberScope.length; ++v) {
            ClassifierDescriptor classifierDescriptor2 = arr_memberScope[v].getContributedClassifier(name0, lookupLocation0);
            if(classifierDescriptor2 != null) {
                if(!(classifierDescriptor2 instanceof ClassifierDescriptorWithTypeParameters) || !((ClassifierDescriptorWithTypeParameters)classifierDescriptor2).isExpect()) {
                    return classifierDescriptor2;
                }
                if(classifierDescriptor1 == null) {
                    classifierDescriptor1 = classifierDescriptor2;
                }
            }
        }
        return classifierDescriptor1;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(descriptorKindFilter0, "kindFilter");
        Intrinsics.checkNotNullParameter(function10, "nameFilter");
        MemberScope[] arr_memberScope = this.a();
        Collection collection0 = this.c.getContributedDescriptors(descriptorKindFilter0, function10);
        for(int v = 0; v < arr_memberScope.length; ++v) {
            collection0 = ScopeUtilsKt.concat(collection0, arr_memberScope[v].getContributedDescriptors(descriptorKindFilter0, function10));
        }
        return collection0 == null ? f0.emptySet() : collection0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection getContributedFunctions(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        this.recordLookup(name0, lookupLocation0);
        MemberScope[] arr_memberScope = this.a();
        Collection collection0 = this.c.getContributedFunctions(name0, lookupLocation0);
        for(int v = 0; v < arr_memberScope.length; ++v) {
            collection0 = ScopeUtilsKt.concat(collection0, arr_memberScope[v].getContributedFunctions(name0, lookupLocation0));
        }
        return collection0 == null ? f0.emptySet() : collection0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection getContributedVariables(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        this.recordLookup(name0, lookupLocation0);
        MemberScope[] arr_memberScope = this.a();
        Collection collection0 = this.c.getContributedVariables(name0, lookupLocation0);
        for(int v = 0; v < arr_memberScope.length; ++v) {
            collection0 = ScopeUtilsKt.concat(collection0, arr_memberScope[v].getContributedVariables(name0, lookupLocation0));
        }
        return collection0 == null ? f0.emptySet() : collection0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set getFunctionNames() {
        MemberScope[] arr_memberScope = this.a();
        Set set0 = new LinkedHashSet();
        for(int v = 0; v < arr_memberScope.length; ++v) {
            o.addAll(set0, arr_memberScope[v].getFunctionNames());
        }
        set0.addAll(this.c.getFunctionNames());
        return set0;
    }

    @NotNull
    public final LazyJavaPackageScope getJavaScope$descriptors_jvm() {
        return this.c;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set getVariableNames() {
        MemberScope[] arr_memberScope = this.a();
        Set set0 = new LinkedHashSet();
        for(int v = 0; v < arr_memberScope.length; ++v) {
            o.addAll(set0, arr_memberScope[v].getVariableNames());
        }
        set0.addAll(this.c.getVariableNames());
        return set0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public void recordLookup(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        UtilsKt.record(this.a.getComponents().getLookupTracker(), lookupLocation0, this.b, name0);
    }

    @Override
    @NotNull
    public String toString() {
        return "scope for " + this.b;
    }
}

