package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p9.a;
import se.k;
import se.l;
import se.m;

@SourceDebugExtension({"SMAP\nLazyJavaPackageScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1620#2,3:190\n1611#2:193\n1855#2:194\n1856#2:196\n1612#2:197\n766#2:198\n857#2,2:199\n1#3:195\n*S KotlinDebug\n*F\n+ 1 LazyJavaPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageScope\n*L\n160#1:190,3\n162#1:193\n162#1:194\n162#1:196\n162#1:197\n185#1:198\n185#1:199,2\n162#1:195\n*E\n"})
public final class LazyJavaPackageScope extends LazyJavaStaticScope {
    public final JavaPackage m;
    public final LazyJavaPackageFragment n;
    public final NullableLazyValue o;
    public final MemoizedFunctionToNullable p;

    public LazyJavaPackageScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @NotNull JavaPackage javaPackage0, @NotNull LazyJavaPackageFragment lazyJavaPackageFragment0) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "c");
        Intrinsics.checkNotNullParameter(javaPackage0, "jPackage");
        Intrinsics.checkNotNullParameter(lazyJavaPackageFragment0, "ownerDescriptor");
        super(lazyJavaResolverContext0);
        this.m = javaPackage0;
        this.n = lazyJavaPackageFragment0;
        this.o = lazyJavaResolverContext0.getStorageManager().createNullableLazyValue(new a(6, lazyJavaResolverContext0, this));
        this.p = lazyJavaResolverContext0.getStorageManager().createMemoizedFunctionWithNullableValues(new m(this, lazyJavaResolverContext0));
    }

    public final ClassDescriptor a(Name name0, JavaClass javaClass0) {
        if(!SpecialNames.INSTANCE.isSafeIdentifier(name0)) {
            return null;
        }
        Set set0 = (Set)this.o.invoke();
        if(javaClass0 == null && set0 != null && !set0.contains(name0.asString())) {
            return null;
        }
        k k0 = new k(name0, javaClass0);
        return (ClassDescriptor)this.p.invoke(k0);
    }

    public static final JvmMetadataVersion access$getJvmMetadataVersion(LazyJavaPackageScope lazyJavaPackageScope0) {
        return DeserializationHelpersKt.jvmMetadataVersionOrDefault(lazyJavaPackageScope0.getC().getComponents().getDeserializedDescriptorResolver().getComponents().getConfiguration());
    }

    public static final l access$resolveKotlinBinaryClass(LazyJavaPackageScope lazyJavaPackageScope0, KotlinJvmBinaryClass kotlinJvmBinaryClass0) {
        lazyJavaPackageScope0.getClass();
        if(kotlinJvmBinaryClass0 == null) {
            return LazyJavaPackageScope.KotlinClassLookupResult.NotFound.INSTANCE;
        }
        if(kotlinJvmBinaryClass0.getClassHeader().getKind() == Kind.CLASS) {
            ClassDescriptor classDescriptor0 = lazyJavaPackageScope0.getC().getComponents().getDeserializedDescriptorResolver().resolveClass(kotlinJvmBinaryClass0);
            return classDescriptor0 != null ? new LazyJavaPackageScope.KotlinClassLookupResult.Found(classDescriptor0) : LazyJavaPackageScope.KotlinClassLookupResult.NotFound.INSTANCE;
        }
        return LazyJavaPackageScope.KotlinClassLookupResult.SyntheticClass.INSTANCE;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set computeClassNames(@NotNull DescriptorKindFilter descriptorKindFilter0, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(descriptorKindFilter0, "kindFilter");
        if(!descriptorKindFilter0.acceptsKinds(1)) {
            return f0.emptySet();
        }
        Set set0 = (Set)this.o.invoke();
        if(set0 != null) {
            Set set1 = new HashSet();
            for(Object object0: set0) {
                set1.add(Name.identifier(((String)object0)));
            }
            return set1;
        }
        if(function10 == null) {
            function10 = FunctionsKt.alwaysTrue();
        }
        Iterable iterable0 = this.m.getClasses(function10);
        Set set2 = new LinkedHashSet();
        for(Object object1: iterable0) {
            JavaClass javaClass0 = (JavaClass)object1;
            Name name0 = javaClass0.getLightClassOriginKind() == LightClassOriginKind.SOURCE ? null : javaClass0.getName();
            if(name0 != null) {
                set2.add(name0);
            }
        }
        return set2;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set computeFunctionNames(@NotNull DescriptorKindFilter descriptorKindFilter0, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(descriptorKindFilter0, "kindFilter");
        return f0.emptySet();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public DeclaredMemberIndex computeMemberIndex() {
        return Empty.INSTANCE;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeNonDeclaredFunctions(@NotNull Collection collection0, @NotNull Name name0) {
        Intrinsics.checkNotNullParameter(collection0, "result");
        Intrinsics.checkNotNullParameter(name0, "name");
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set computePropertyNames(@NotNull DescriptorKindFilter descriptorKindFilter0, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(descriptorKindFilter0, "kindFilter");
        return f0.emptySet();
    }

    @Nullable
    public final ClassDescriptor findClassifierByJavaClass$descriptors_jvm(@NotNull JavaClass javaClass0) {
        Intrinsics.checkNotNullParameter(javaClass0, "javaClass");
        return this.a(javaClass0.getName(), javaClass0);
    }

    @Nullable
    public ClassDescriptor getContributedClassifier(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        return this.a(name0, null);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    public ClassifierDescriptor getContributedClassifier(Name name0, LookupLocation lookupLocation0) {
        return this.getContributedClassifier(name0, lookupLocation0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Collection getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(descriptorKindFilter0, "kindFilter");
        Intrinsics.checkNotNullParameter(function10, "nameFilter");
        if(!descriptorKindFilter0.acceptsKinds(7)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Iterable iterable0 = (Iterable)this.getAllDescriptors().invoke();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            DeclarationDescriptor declarationDescriptor0 = (DeclarationDescriptor)object0;
            if(declarationDescriptor0 instanceof ClassDescriptor) {
                Name name0 = ((ClassDescriptor)declarationDescriptor0).getName();
                Intrinsics.checkNotNullExpressionValue(name0, "it.name");
                if(((Boolean)function10.invoke(name0)).booleanValue()) {
                    arrayList0.add(object0);
                }
            }
        }
        return arrayList0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Collection getContributedVariables(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public DeclarationDescriptor getOwnerDescriptor() {
        return this.getOwnerDescriptor();
    }

    @NotNull
    public LazyJavaPackageFragment getOwnerDescriptor() {
        return this.n;
    }
}

