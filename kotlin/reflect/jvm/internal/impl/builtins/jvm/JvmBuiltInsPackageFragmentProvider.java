package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.io.InputStream;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker.DO_NOTHING;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedClassDataFinder;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer.ThrowException;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings.Default;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JvmBuiltInsPackageFragmentProvider extends AbstractDeserializedPackageFragmentProvider {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        JvmBuiltInsPackageFragmentProvider.Companion = new Companion(null);
    }

    public JvmBuiltInsPackageFragmentProvider(@NotNull StorageManager storageManager0, @NotNull KotlinClassFinder kotlinClassFinder0, @NotNull ModuleDescriptor moduleDescriptor0, @NotNull NotFoundClasses notFoundClasses0, @NotNull AdditionalClassPartsProvider additionalClassPartsProvider0, @NotNull PlatformDependentDeclarationFilter platformDependentDeclarationFilter0, @NotNull DeserializationConfiguration deserializationConfiguration0, @NotNull NewKotlinTypeChecker newKotlinTypeChecker0, @NotNull SamConversionResolver samConversionResolver0) {
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinClassFinder0, "finder");
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(notFoundClasses0, "notFoundClasses");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider0, "additionalClassPartsProvider");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter0, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(deserializationConfiguration0, "deserializationConfiguration");
        Intrinsics.checkNotNullParameter(newKotlinTypeChecker0, "kotlinTypeChecker");
        Intrinsics.checkNotNullParameter(samConversionResolver0, "samConversionResolver");
        super(storageManager0, kotlinClassFinder0, moduleDescriptor0);
        DeserializedClassDataFinder deserializedClassDataFinder0 = new DeserializedClassDataFinder(this);
        AnnotationAndConstantLoaderImpl annotationAndConstantLoaderImpl0 = new AnnotationAndConstantLoaderImpl(moduleDescriptor0, notFoundClasses0, BuiltInSerializerProtocol.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(ErrorReporter.DO_NOTHING, "DO_NOTHING");
        List list0 = CollectionsKt__CollectionsKt.listOf(new ClassDescriptorFactory[]{new BuiltInFictitiousFunctionClassFactory(storageManager0, moduleDescriptor0), new JvmBuiltInClassDescriptorFactory(storageManager0, moduleDescriptor0, null, 4, null)});
        this.setComponents(new DeserializationComponents(storageManager0, moduleDescriptor0, deserializationConfiguration0, deserializedClassDataFinder0, annotationAndConstantLoaderImpl0, this, Default.INSTANCE, ErrorReporter.DO_NOTHING, DO_NOTHING.INSTANCE, ThrowException.INSTANCE, list0, notFoundClasses0, ContractDeserializer.Companion.getDEFAULT(), additionalClassPartsProvider0, platformDependentDeclarationFilter0, BuiltInSerializerProtocol.INSTANCE.getExtensionRegistry(), newKotlinTypeChecker0, samConversionResolver0, null, null, 0xC0000, null));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider
    @Nullable
    public DeserializedPackageFragment findPackage(@NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        InputStream inputStream0 = this.getFinder().findBuiltInsData(fqName0);
        return inputStream0 != null ? BuiltInsPackageFragmentImpl.Companion.create(fqName0, this.getStorageManager(), this.getModuleDescriptor(), inputStream0, false) : null;
    }
}

