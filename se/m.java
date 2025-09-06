package se;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder.Request;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.Found;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.NotFound;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.SyntheticClass;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.ClassFileContent;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

public final class m extends Lambda implements Function1 {
    public final LazyJavaPackageScope w;
    public final LazyJavaResolverContext x;

    public m(LazyJavaPackageScope lazyJavaPackageScope0, LazyJavaResolverContext lazyJavaResolverContext0) {
        this.w = lazyJavaPackageScope0;
        this.x = lazyJavaResolverContext0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((k)object0), "request");
        LazyJavaPackageScope lazyJavaPackageScope0 = this.w;
        ClassId classId0 = new ClassId(lazyJavaPackageScope0.getOwnerDescriptor().getFqName(), ((k)object0).a);
        LazyJavaResolverContext lazyJavaResolverContext0 = this.x;
        JavaClass javaClass0 = ((k)object0).b;
        Result kotlinClassFinder$Result0 = javaClass0 == null ? lazyJavaResolverContext0.getComponents().getKotlinClassFinder().findKotlinClassOrContent(classId0, LazyJavaPackageScope.access$getJvmMetadataVersion(lazyJavaPackageScope0)) : lazyJavaResolverContext0.getComponents().getKotlinClassFinder().findKotlinClassOrContent(javaClass0, LazyJavaPackageScope.access$getJvmMetadataVersion(lazyJavaPackageScope0));
        KotlinJvmBinaryClass kotlinJvmBinaryClass0 = kotlinClassFinder$Result0 == null ? null : kotlinClassFinder$Result0.toKotlinJvmBinaryClass();
        ClassId classId1 = kotlinJvmBinaryClass0 == null ? null : kotlinJvmBinaryClass0.getClassId();
        if(classId1 == null || !classId1.isNestedClass() && !classId1.isLocal()) {
            l l0 = LazyJavaPackageScope.access$resolveKotlinBinaryClass(lazyJavaPackageScope0, kotlinJvmBinaryClass0);
            if(l0 instanceof LazyJavaPackageScope.KotlinClassLookupResult.Found) {
                return ((LazyJavaPackageScope.KotlinClassLookupResult.Found)l0).getDescriptor();
            }
            if(!(l0 instanceof LazyJavaPackageScope.KotlinClassLookupResult.SyntheticClass)) {
                if(!(l0 instanceof LazyJavaPackageScope.KotlinClassLookupResult.NotFound)) {
                    throw new NoWhenBranchMatchedException();
                }
                if(javaClass0 == null) {
                    JavaClassFinder javaClassFinder0 = lazyJavaResolverContext0.getComponents().getFinder();
                    if(kotlinClassFinder$Result0 instanceof ClassFileContent) {
                        ClassFileContent kotlinClassFinder$Result$ClassFileContent0 = (ClassFileContent)kotlinClassFinder$Result0;
                    }
                    javaClass0 = javaClassFinder0.findClass(new Request(classId0, null, null, 4, null));
                }
                if((javaClass0 == null ? null : javaClass0.getLightClassOriginKind()) == LightClassOriginKind.BINARY) {
                    throw new IllegalStateException("Couldn\'t find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + javaClass0 + "\nClassId: " + classId0 + "\nfindKotlinClass(JavaClass) = " + KotlinClassFinderKt.findKotlinClass(lazyJavaResolverContext0.getComponents().getKotlinClassFinder(), javaClass0, LazyJavaPackageScope.access$getJvmMetadataVersion(lazyJavaPackageScope0)) + "\nfindKotlinClass(ClassId) = " + KotlinClassFinderKt.findKotlinClass(lazyJavaResolverContext0.getComponents().getKotlinClassFinder(), classId0, LazyJavaPackageScope.access$getJvmMetadataVersion(lazyJavaPackageScope0)) + '\n');
                }
                FqName fqName0 = javaClass0 == null ? null : javaClass0.getFqName();
                if(fqName0 != null && !fqName0.isRoot() && Intrinsics.areEqual(fqName0.parent(), lazyJavaPackageScope0.getOwnerDescriptor().getFqName())) {
                    ClassDescriptor classDescriptor0 = new LazyJavaClassDescriptor(this.x, lazyJavaPackageScope0.getOwnerDescriptor(), javaClass0, null, 8, null);
                    lazyJavaResolverContext0.getComponents().getJavaClassesTracker().reportClass(((JavaClassDescriptor)classDescriptor0));
                    return classDescriptor0;
                }
            }
        }
        return null;
    }
}

