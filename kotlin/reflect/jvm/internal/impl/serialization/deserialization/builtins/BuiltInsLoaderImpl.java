package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import ef.a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider.None;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker.DO_NOTHING;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration.Default;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedClassDataFinder;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer.ThrowException;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nBuiltInsLoaderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInsLoaderImpl.kt\norg/jetbrains/kotlin/serialization/deserialization/builtins/BuiltInsLoaderImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n1549#2:94\n1620#2,3:95\n*S KotlinDebug\n*F\n+ 1 BuiltInsLoaderImpl.kt\norg/jetbrains/kotlin/serialization/deserialization/builtins/BuiltInsLoaderImpl\n*L\n57#1:94\n57#1:95,3\n*E\n"})
public final class BuiltInsLoaderImpl implements BuiltInsLoader {
    public final BuiltInsResourceLoader a;

    public BuiltInsLoaderImpl() {
        this.a = new BuiltInsResourceLoader();
    }

    @NotNull
    public final PackageFragmentProvider createBuiltInPackageFragmentProvider(@NotNull StorageManager storageManager0, @NotNull ModuleDescriptor moduleDescriptor0, @NotNull Set set0, @NotNull Iterable iterable0, @NotNull PlatformDependentDeclarationFilter platformDependentDeclarationFilter0, @NotNull AdditionalClassPartsProvider additionalClassPartsProvider0, boolean z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "module");
        Intrinsics.checkNotNullParameter(set0, "packageFqNames");
        Intrinsics.checkNotNullParameter(iterable0, "classDescriptorFactories");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter0, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider0, "additionalClassPartsProvider");
        Intrinsics.checkNotNullParameter(function10, "loadResource");
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(set0, 10));
        for(Object object0: set0) {
            String s = BuiltInSerializerProtocol.INSTANCE.getBuiltInsFilePath(((FqName)object0));
            Object object1 = function10.invoke(s);
            if(((InputStream)object1) == null) {
                throw new IllegalStateException("Resource not found in classpath: " + s);
            }
            arrayList0.add(BuiltInsPackageFragmentImpl.Companion.create(((FqName)object0), storageManager0, moduleDescriptor0, ((InputStream)object1), z));
        }
        PackageFragmentProviderImpl packageFragmentProviderImpl0 = new PackageFragmentProviderImpl(arrayList0);
        NotFoundClasses notFoundClasses0 = new NotFoundClasses(storageManager0, moduleDescriptor0);
        DeserializedClassDataFinder deserializedClassDataFinder0 = new DeserializedClassDataFinder(packageFragmentProviderImpl0);
        AnnotationAndConstantLoaderImpl annotationAndConstantLoaderImpl0 = new AnnotationAndConstantLoaderImpl(moduleDescriptor0, notFoundClasses0, BuiltInSerializerProtocol.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(ErrorReporter.DO_NOTHING, "DO_NOTHING");
        SamConversionResolverImpl samConversionResolverImpl0 = new SamConversionResolverImpl(storageManager0, CollectionsKt__CollectionsKt.emptyList());
        DeserializationComponents deserializationComponents0 = new DeserializationComponents(storageManager0, moduleDescriptor0, Default.INSTANCE, deserializedClassDataFinder0, annotationAndConstantLoaderImpl0, packageFragmentProviderImpl0, () -> null, ErrorReporter.DO_NOTHING, DO_NOTHING.INSTANCE, ThrowException.INSTANCE, iterable0, notFoundClasses0, ContractDeserializer.Companion.getDEFAULT(), additionalClassPartsProvider0, platformDependentDeclarationFilter0, BuiltInSerializerProtocol.INSTANCE.getExtensionRegistry(), null, samConversionResolverImpl0, null, null, 0xD0000, null);
        for(Object object2: arrayList0) {
            ((BuiltInsPackageFragmentImpl)object2).initialize(deserializationComponents0);
        }
        return packageFragmentProviderImpl0;
    }

    public static PackageFragmentProvider createBuiltInPackageFragmentProvider$default(BuiltInsLoaderImpl builtInsLoaderImpl0, StorageManager storageManager0, ModuleDescriptor moduleDescriptor0, Set set0, Iterable iterable0, PlatformDependentDeclarationFilter platformDependentDeclarationFilter0, AdditionalClassPartsProvider additionalClassPartsProvider0, boolean z, Function1 function10, int v, Object object0) {
        return (v & 0x20) == 0 ? builtInsLoaderImpl0.createBuiltInPackageFragmentProvider(storageManager0, moduleDescriptor0, set0, iterable0, platformDependentDeclarationFilter0, additionalClassPartsProvider0, z, function10) : builtInsLoaderImpl0.createBuiltInPackageFragmentProvider(storageManager0, moduleDescriptor0, set0, iterable0, platformDependentDeclarationFilter0, None.INSTANCE, z, function10);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader
    @NotNull
    public PackageFragmentProvider createPackageFragmentProvider(@NotNull StorageManager storageManager0, @NotNull ModuleDescriptor moduleDescriptor0, @NotNull Iterable iterable0, @NotNull PlatformDependentDeclarationFilter platformDependentDeclarationFilter0, @NotNull AdditionalClassPartsProvider additionalClassPartsProvider0, boolean z) {
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "builtInsModule");
        Intrinsics.checkNotNullParameter(iterable0, "classDescriptorFactories");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter0, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider0, "additionalClassPartsProvider");
        a a0 = new a(1, this.a, 0);
        return this.createBuiltInPackageFragmentProvider(storageManager0, moduleDescriptor0, StandardNames.BUILT_INS_PACKAGE_FQ_NAMES, iterable0, platformDependentDeclarationFilter0, additionalClassPartsProvider0, z, a0);
    }
}

