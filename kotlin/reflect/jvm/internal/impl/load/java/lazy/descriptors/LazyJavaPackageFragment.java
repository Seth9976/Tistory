package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryPackageSourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import se.i;
import se.j;

public final class LazyJavaPackageFragment extends PackageFragmentDescriptorImpl {
    public final JavaPackage g;
    public final LazyJavaResolverContext h;
    public final JvmMetadataVersion i;
    public final NotNullLazyValue j;
    public final JvmPackageScope k;
    public final NotNullLazyValue l;
    public final Annotations m;
    public final NotNullLazyValue n;
    public static final KProperty[] o;

    static {
        LazyJavaPackageFragment.o = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaPackageFragment.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaPackageFragment.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    }

    public LazyJavaPackageFragment(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @NotNull JavaPackage javaPackage0) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "outerContext");
        Intrinsics.checkNotNullParameter(javaPackage0, "jPackage");
        super(lazyJavaResolverContext0.getModule(), javaPackage0.getFqName());
        this.g = javaPackage0;
        LazyJavaResolverContext lazyJavaResolverContext1 = ContextKt.childForClassOrPackage$default(lazyJavaResolverContext0, this, null, 0, 6, null);
        this.h = lazyJavaResolverContext1;
        this.i = DeserializationHelpersKt.jvmMetadataVersionOrDefault(lazyJavaResolverContext0.getComponents().getDeserializedDescriptorResolver().getComponents().getConfiguration());
        this.j = lazyJavaResolverContext1.getStorageManager().createLazyValue(new i(this, 0));
        this.k = new JvmPackageScope(lazyJavaResolverContext1, javaPackage0, this);
        this.l = lazyJavaResolverContext1.getStorageManager().createRecursionTolerantLazyValue(new i(this, 1), CollectionsKt__CollectionsKt.emptyList());
        this.m = lazyJavaResolverContext1.getComponents().getJavaTypeEnhancementState().getDisabledDefaultAnnotations() ? Annotations.Companion.getEMPTY() : LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext1, javaPackage0);
        this.n = lazyJavaResolverContext1.getStorageManager().createLazyValue(new j(this));
    }

    @Nullable
    public final ClassDescriptor findClassifierByJavaClass$descriptors_jvm(@NotNull JavaClass javaClass0) {
        Intrinsics.checkNotNullParameter(javaClass0, "jClass");
        return this.k.getJavaScope$descriptors_jvm().findClassifierByJavaClass$descriptors_jvm(javaClass0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.m;
    }

    @NotNull
    public final Map getBinaryClasses$descriptors_jvm() {
        return (Map)StorageKt.getValue(this.j, this, LazyJavaPackageFragment.o[0]);
    }

    @NotNull
    public JvmPackageScope getMemberScope() {
        return this.k;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    public MemberScope getMemberScope() {
        return this.getMemberScope();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl
    @NotNull
    public SourceElement getSource() {
        return new KotlinJvmBinaryPackageSourceElement(this);
    }

    @NotNull
    public final List getSubPackageFqNames$descriptors_jvm() {
        return (List)this.l.invoke();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl
    @NotNull
    public String toString() {
        return "Lazy Java package fragment: " + this.getFqName() + " of module " + this.h.getComponents().getModule();
    }
}

