package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider.None;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter.All;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentTypeTransformer;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DeserializationComponents {
    public final StorageManager a;
    public final ModuleDescriptor b;
    public final DeserializationConfiguration c;
    public final ClassDataFinder d;
    public final AnnotationAndConstantLoader e;
    public final PackageFragmentProvider f;
    public final LocalClassifierTypeSettings g;
    public final ErrorReporter h;
    public final LookupTracker i;
    public final FlexibleTypeDeserializer j;
    public final Iterable k;
    public final NotFoundClasses l;
    public final ContractDeserializer m;
    public final AdditionalClassPartsProvider n;
    public final PlatformDependentDeclarationFilter o;
    public final ExtensionRegistryLite p;
    public final NewKotlinTypeChecker q;
    public final SamConversionResolver r;
    public final PlatformDependentTypeTransformer s;
    public final List t;
    public final ClassDeserializer u;

    public DeserializationComponents(@NotNull StorageManager storageManager0, @NotNull ModuleDescriptor moduleDescriptor0, @NotNull DeserializationConfiguration deserializationConfiguration0, @NotNull ClassDataFinder classDataFinder0, @NotNull AnnotationAndConstantLoader annotationAndConstantLoader0, @NotNull PackageFragmentProvider packageFragmentProvider0, @NotNull LocalClassifierTypeSettings localClassifierTypeSettings0, @NotNull ErrorReporter errorReporter0, @NotNull LookupTracker lookupTracker0, @NotNull FlexibleTypeDeserializer flexibleTypeDeserializer0, @NotNull Iterable iterable0, @NotNull NotFoundClasses notFoundClasses0, @NotNull ContractDeserializer contractDeserializer0, @NotNull AdditionalClassPartsProvider additionalClassPartsProvider0, @NotNull PlatformDependentDeclarationFilter platformDependentDeclarationFilter0, @NotNull ExtensionRegistryLite extensionRegistryLite0, @NotNull NewKotlinTypeChecker newKotlinTypeChecker0, @NotNull SamConversionResolver samConversionResolver0, @NotNull PlatformDependentTypeTransformer platformDependentTypeTransformer0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(deserializationConfiguration0, "configuration");
        Intrinsics.checkNotNullParameter(classDataFinder0, "classDataFinder");
        Intrinsics.checkNotNullParameter(annotationAndConstantLoader0, "annotationAndConstantLoader");
        Intrinsics.checkNotNullParameter(packageFragmentProvider0, "packageFragmentProvider");
        Intrinsics.checkNotNullParameter(localClassifierTypeSettings0, "localClassifierTypeSettings");
        Intrinsics.checkNotNullParameter(errorReporter0, "errorReporter");
        Intrinsics.checkNotNullParameter(lookupTracker0, "lookupTracker");
        Intrinsics.checkNotNullParameter(flexibleTypeDeserializer0, "flexibleTypeDeserializer");
        Intrinsics.checkNotNullParameter(iterable0, "fictitiousClassDescriptorFactories");
        Intrinsics.checkNotNullParameter(notFoundClasses0, "notFoundClasses");
        Intrinsics.checkNotNullParameter(contractDeserializer0, "contractDeserializer");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider0, "additionalClassPartsProvider");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter0, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(extensionRegistryLite0, "extensionRegistryLite");
        Intrinsics.checkNotNullParameter(newKotlinTypeChecker0, "kotlinTypeChecker");
        Intrinsics.checkNotNullParameter(samConversionResolver0, "samConversionResolver");
        Intrinsics.checkNotNullParameter(platformDependentTypeTransformer0, "platformDependentTypeTransformer");
        Intrinsics.checkNotNullParameter(list0, "typeAttributeTranslators");
        super();
        this.a = storageManager0;
        this.b = moduleDescriptor0;
        this.c = deserializationConfiguration0;
        this.d = classDataFinder0;
        this.e = annotationAndConstantLoader0;
        this.f = packageFragmentProvider0;
        this.g = localClassifierTypeSettings0;
        this.h = errorReporter0;
        this.i = lookupTracker0;
        this.j = flexibleTypeDeserializer0;
        this.k = iterable0;
        this.l = notFoundClasses0;
        this.m = contractDeserializer0;
        this.n = additionalClassPartsProvider0;
        this.o = platformDependentDeclarationFilter0;
        this.p = extensionRegistryLite0;
        this.q = newKotlinTypeChecker0;
        this.r = samConversionResolver0;
        this.s = platformDependentTypeTransformer0;
        this.t = list0;
        this.u = new ClassDeserializer(this);
    }

    public DeserializationComponents(StorageManager storageManager0, ModuleDescriptor moduleDescriptor0, DeserializationConfiguration deserializationConfiguration0, ClassDataFinder classDataFinder0, AnnotationAndConstantLoader annotationAndConstantLoader0, PackageFragmentProvider packageFragmentProvider0, LocalClassifierTypeSettings localClassifierTypeSettings0, ErrorReporter errorReporter0, LookupTracker lookupTracker0, FlexibleTypeDeserializer flexibleTypeDeserializer0, Iterable iterable0, NotFoundClasses notFoundClasses0, ContractDeserializer contractDeserializer0, AdditionalClassPartsProvider additionalClassPartsProvider0, PlatformDependentDeclarationFilter platformDependentDeclarationFilter0, ExtensionRegistryLite extensionRegistryLite0, NewKotlinTypeChecker newKotlinTypeChecker0, SamConversionResolver samConversionResolver0, PlatformDependentTypeTransformer platformDependentTypeTransformer0, List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        AdditionalClassPartsProvider additionalClassPartsProvider1 = (v & 0x2000) == 0 ? additionalClassPartsProvider0 : None.INSTANCE;
        PlatformDependentDeclarationFilter platformDependentDeclarationFilter1 = (v & 0x4000) == 0 ? platformDependentDeclarationFilter0 : All.INSTANCE;
        NewKotlinTypeChecker newKotlinTypeChecker1 = (0x10000 & v) == 0 ? newKotlinTypeChecker0 : NewKotlinTypeChecker.Companion.getDefault();
        PlatformDependentTypeTransformer platformDependentTypeTransformer1 = (0x40000 & v) == 0 ? platformDependentTypeTransformer0 : kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentTypeTransformer.None.INSTANCE;
        this(storageManager0, moduleDescriptor0, deserializationConfiguration0, classDataFinder0, annotationAndConstantLoader0, packageFragmentProvider0, localClassifierTypeSettings0, errorReporter0, lookupTracker0, flexibleTypeDeserializer0, iterable0, notFoundClasses0, contractDeserializer0, additionalClassPartsProvider1, platformDependentDeclarationFilter1, extensionRegistryLite0, newKotlinTypeChecker1, samConversionResolver0, platformDependentTypeTransformer1, ((v & 0x80000) == 0 ? list0 : k.listOf(DefaultTypeAttributeTranslator.INSTANCE)));
    }

    @NotNull
    public final DeserializationContext createContext(@NotNull PackageFragmentDescriptor packageFragmentDescriptor0, @NotNull NameResolver nameResolver0, @NotNull TypeTable typeTable0, @NotNull VersionRequirementTable versionRequirementTable0, @NotNull BinaryVersion binaryVersion0, @Nullable DeserializedContainerSource deserializedContainerSource0) {
        Intrinsics.checkNotNullParameter(packageFragmentDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable0, "versionRequirementTable");
        Intrinsics.checkNotNullParameter(binaryVersion0, "metadataVersion");
        return new DeserializationContext(this, nameResolver0, packageFragmentDescriptor0, typeTable0, versionRequirementTable0, binaryVersion0, deserializedContainerSource0, null, CollectionsKt__CollectionsKt.emptyList());
    }

    @Nullable
    public final ClassDescriptor deserializeClass(@NotNull ClassId classId0) {
        Intrinsics.checkNotNullParameter(classId0, "classId");
        return ClassDeserializer.deserializeClass$default(this.u, classId0, null, 2, null);
    }

    @NotNull
    public final AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        return this.n;
    }

    @NotNull
    public final AnnotationAndConstantLoader getAnnotationAndConstantLoader() {
        return this.e;
    }

    @NotNull
    public final ClassDataFinder getClassDataFinder() {
        return this.d;
    }

    @NotNull
    public final ClassDeserializer getClassDeserializer() {
        return this.u;
    }

    @NotNull
    public final DeserializationConfiguration getConfiguration() {
        return this.c;
    }

    @NotNull
    public final ContractDeserializer getContractDeserializer() {
        return this.m;
    }

    @NotNull
    public final ErrorReporter getErrorReporter() {
        return this.h;
    }

    @NotNull
    public final ExtensionRegistryLite getExtensionRegistryLite() {
        return this.p;
    }

    @NotNull
    public final Iterable getFictitiousClassDescriptorFactories() {
        return this.k;
    }

    @NotNull
    public final FlexibleTypeDeserializer getFlexibleTypeDeserializer() {
        return this.j;
    }

    @NotNull
    public final NewKotlinTypeChecker getKotlinTypeChecker() {
        return this.q;
    }

    @NotNull
    public final LocalClassifierTypeSettings getLocalClassifierTypeSettings() {
        return this.g;
    }

    @NotNull
    public final LookupTracker getLookupTracker() {
        return this.i;
    }

    @NotNull
    public final ModuleDescriptor getModuleDescriptor() {
        return this.b;
    }

    @NotNull
    public final NotFoundClasses getNotFoundClasses() {
        return this.l;
    }

    @NotNull
    public final PackageFragmentProvider getPackageFragmentProvider() {
        return this.f;
    }

    @NotNull
    public final PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        return this.o;
    }

    @NotNull
    public final PlatformDependentTypeTransformer getPlatformDependentTypeTransformer() {
        return this.s;
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.a;
    }

    @NotNull
    public final List getTypeAttributeTranslators() {
        return this.t;
    }
}

