package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker;
import kotlin.reflect.jvm.internal.impl.load.java.JavaModuleAnnotationsProvider;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import org.jetbrains.annotations.NotNull;

public final class JavaResolverComponents {
    public final StorageManager a;
    public final JavaClassFinder b;
    public final KotlinClassFinder c;
    public final DeserializedDescriptorResolver d;
    public final SignaturePropagator e;
    public final ErrorReporter f;
    public final JavaResolverCache g;
    public final JavaPropertyInitializerEvaluator h;
    public final SamConversionResolver i;
    public final JavaSourceElementFactory j;
    public final ModuleClassResolver k;
    public final PackagePartProvider l;
    public final SupertypeLoopChecker m;
    public final LookupTracker n;
    public final ModuleDescriptor o;
    public final ReflectionTypes p;
    public final AnnotationTypeQualifierResolver q;
    public final SignatureEnhancement r;
    public final JavaClassesTracker s;
    public final JavaResolverSettings t;
    public final NewKotlinTypeChecker u;
    public final JavaTypeEnhancementState v;
    public final JavaModuleAnnotationsProvider w;
    public final SyntheticJavaPartsProvider x;

    public JavaResolverComponents(@NotNull StorageManager storageManager0, @NotNull JavaClassFinder javaClassFinder0, @NotNull KotlinClassFinder kotlinClassFinder0, @NotNull DeserializedDescriptorResolver deserializedDescriptorResolver0, @NotNull SignaturePropagator signaturePropagator0, @NotNull ErrorReporter errorReporter0, @NotNull JavaResolverCache javaResolverCache0, @NotNull JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator0, @NotNull SamConversionResolver samConversionResolver0, @NotNull JavaSourceElementFactory javaSourceElementFactory0, @NotNull ModuleClassResolver moduleClassResolver0, @NotNull PackagePartProvider packagePartProvider0, @NotNull SupertypeLoopChecker supertypeLoopChecker0, @NotNull LookupTracker lookupTracker0, @NotNull ModuleDescriptor moduleDescriptor0, @NotNull ReflectionTypes reflectionTypes0, @NotNull AnnotationTypeQualifierResolver annotationTypeQualifierResolver0, @NotNull SignatureEnhancement signatureEnhancement0, @NotNull JavaClassesTracker javaClassesTracker0, @NotNull JavaResolverSettings javaResolverSettings0, @NotNull NewKotlinTypeChecker newKotlinTypeChecker0, @NotNull JavaTypeEnhancementState javaTypeEnhancementState0, @NotNull JavaModuleAnnotationsProvider javaModuleAnnotationsProvider0, @NotNull SyntheticJavaPartsProvider syntheticJavaPartsProvider0) {
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        Intrinsics.checkNotNullParameter(javaClassFinder0, "finder");
        Intrinsics.checkNotNullParameter(kotlinClassFinder0, "kotlinClassFinder");
        Intrinsics.checkNotNullParameter(deserializedDescriptorResolver0, "deserializedDescriptorResolver");
        Intrinsics.checkNotNullParameter(signaturePropagator0, "signaturePropagator");
        Intrinsics.checkNotNullParameter(errorReporter0, "errorReporter");
        Intrinsics.checkNotNullParameter(javaResolverCache0, "javaResolverCache");
        Intrinsics.checkNotNullParameter(javaPropertyInitializerEvaluator0, "javaPropertyInitializerEvaluator");
        Intrinsics.checkNotNullParameter(samConversionResolver0, "samConversionResolver");
        Intrinsics.checkNotNullParameter(javaSourceElementFactory0, "sourceElementFactory");
        Intrinsics.checkNotNullParameter(moduleClassResolver0, "moduleClassResolver");
        Intrinsics.checkNotNullParameter(packagePartProvider0, "packagePartProvider");
        Intrinsics.checkNotNullParameter(supertypeLoopChecker0, "supertypeLoopChecker");
        Intrinsics.checkNotNullParameter(lookupTracker0, "lookupTracker");
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "module");
        Intrinsics.checkNotNullParameter(reflectionTypes0, "reflectionTypes");
        Intrinsics.checkNotNullParameter(annotationTypeQualifierResolver0, "annotationTypeQualifierResolver");
        Intrinsics.checkNotNullParameter(signatureEnhancement0, "signatureEnhancement");
        Intrinsics.checkNotNullParameter(javaClassesTracker0, "javaClassesTracker");
        Intrinsics.checkNotNullParameter(javaResolverSettings0, "settings");
        Intrinsics.checkNotNullParameter(newKotlinTypeChecker0, "kotlinTypeChecker");
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState0, "javaTypeEnhancementState");
        Intrinsics.checkNotNullParameter(javaModuleAnnotationsProvider0, "javaModuleResolver");
        Intrinsics.checkNotNullParameter(syntheticJavaPartsProvider0, "syntheticPartsProvider");
        super();
        this.a = storageManager0;
        this.b = javaClassFinder0;
        this.c = kotlinClassFinder0;
        this.d = deserializedDescriptorResolver0;
        this.e = signaturePropagator0;
        this.f = errorReporter0;
        this.g = javaResolverCache0;
        this.h = javaPropertyInitializerEvaluator0;
        this.i = samConversionResolver0;
        this.j = javaSourceElementFactory0;
        this.k = moduleClassResolver0;
        this.l = packagePartProvider0;
        this.m = supertypeLoopChecker0;
        this.n = lookupTracker0;
        this.o = moduleDescriptor0;
        this.p = reflectionTypes0;
        this.q = annotationTypeQualifierResolver0;
        this.r = signatureEnhancement0;
        this.s = javaClassesTracker0;
        this.t = javaResolverSettings0;
        this.u = newKotlinTypeChecker0;
        this.v = javaTypeEnhancementState0;
        this.w = javaModuleAnnotationsProvider0;
        this.x = syntheticJavaPartsProvider0;
    }

    public JavaResolverComponents(StorageManager storageManager0, JavaClassFinder javaClassFinder0, KotlinClassFinder kotlinClassFinder0, DeserializedDescriptorResolver deserializedDescriptorResolver0, SignaturePropagator signaturePropagator0, ErrorReporter errorReporter0, JavaResolverCache javaResolverCache0, JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator0, SamConversionResolver samConversionResolver0, JavaSourceElementFactory javaSourceElementFactory0, ModuleClassResolver moduleClassResolver0, PackagePartProvider packagePartProvider0, SupertypeLoopChecker supertypeLoopChecker0, LookupTracker lookupTracker0, ModuleDescriptor moduleDescriptor0, ReflectionTypes reflectionTypes0, AnnotationTypeQualifierResolver annotationTypeQualifierResolver0, SignatureEnhancement signatureEnhancement0, JavaClassesTracker javaClassesTracker0, JavaResolverSettings javaResolverSettings0, NewKotlinTypeChecker newKotlinTypeChecker0, JavaTypeEnhancementState javaTypeEnhancementState0, JavaModuleAnnotationsProvider javaModuleAnnotationsProvider0, SyntheticJavaPartsProvider syntheticJavaPartsProvider0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        SyntheticJavaPartsProvider syntheticJavaPartsProvider1 = (v & 0x800000) == 0 ? syntheticJavaPartsProvider0 : SyntheticJavaPartsProvider.Companion.getEMPTY();
        this(storageManager0, javaClassFinder0, kotlinClassFinder0, deserializedDescriptorResolver0, signaturePropagator0, errorReporter0, javaResolverCache0, javaPropertyInitializerEvaluator0, samConversionResolver0, javaSourceElementFactory0, moduleClassResolver0, packagePartProvider0, supertypeLoopChecker0, lookupTracker0, moduleDescriptor0, reflectionTypes0, annotationTypeQualifierResolver0, signatureEnhancement0, javaClassesTracker0, javaResolverSettings0, newKotlinTypeChecker0, javaTypeEnhancementState0, javaModuleAnnotationsProvider0, syntheticJavaPartsProvider1);
    }

    @NotNull
    public final AnnotationTypeQualifierResolver getAnnotationTypeQualifierResolver() {
        return this.q;
    }

    @NotNull
    public final DeserializedDescriptorResolver getDeserializedDescriptorResolver() {
        return this.d;
    }

    @NotNull
    public final ErrorReporter getErrorReporter() {
        return this.f;
    }

    @NotNull
    public final JavaClassFinder getFinder() {
        return this.b;
    }

    @NotNull
    public final JavaClassesTracker getJavaClassesTracker() {
        return this.s;
    }

    @NotNull
    public final JavaModuleAnnotationsProvider getJavaModuleResolver() {
        return this.w;
    }

    @NotNull
    public final JavaPropertyInitializerEvaluator getJavaPropertyInitializerEvaluator() {
        return this.h;
    }

    @NotNull
    public final JavaResolverCache getJavaResolverCache() {
        return this.g;
    }

    @NotNull
    public final JavaTypeEnhancementState getJavaTypeEnhancementState() {
        return this.v;
    }

    @NotNull
    public final KotlinClassFinder getKotlinClassFinder() {
        return this.c;
    }

    @NotNull
    public final NewKotlinTypeChecker getKotlinTypeChecker() {
        return this.u;
    }

    @NotNull
    public final LookupTracker getLookupTracker() {
        return this.n;
    }

    @NotNull
    public final ModuleDescriptor getModule() {
        return this.o;
    }

    @NotNull
    public final ModuleClassResolver getModuleClassResolver() {
        return this.k;
    }

    @NotNull
    public final PackagePartProvider getPackagePartProvider() {
        return this.l;
    }

    @NotNull
    public final ReflectionTypes getReflectionTypes() {
        return this.p;
    }

    @NotNull
    public final JavaResolverSettings getSettings() {
        return this.t;
    }

    @NotNull
    public final SignatureEnhancement getSignatureEnhancement() {
        return this.r;
    }

    @NotNull
    public final SignaturePropagator getSignaturePropagator() {
        return this.e;
    }

    @NotNull
    public final JavaSourceElementFactory getSourceElementFactory() {
        return this.j;
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.a;
    }

    @NotNull
    public final SupertypeLoopChecker getSupertypeLoopChecker() {
        return this.m;
    }

    @NotNull
    public final SyntheticJavaPartsProvider getSyntheticPartsProvider() {
        return this.x;
    }

    @NotNull
    public final JavaResolverComponents replace(@NotNull JavaResolverCache javaResolverCache0) {
        Intrinsics.checkNotNullParameter(javaResolverCache0, "javaResolverCache");
        return new JavaResolverComponents(this.a, this.b, this.c, this.d, this.e, this.f, javaResolverCache0, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, null, 0x800000, null);
    }
}

