package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider.None;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter.NoPlatformDependent;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.CompositePackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.SingleModuleClassResolver;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JavaDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration.Default;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.extensions.TypeAttributeTranslators;
import org.jetbrains.annotations.NotNull;

public final class DeserializationComponentsForJava {
    public static final class Companion {
        public static final class ModuleData {
            public final DeserializationComponentsForJava a;
            public final DeserializedDescriptorResolver b;

            public ModuleData(@NotNull DeserializationComponentsForJava deserializationComponentsForJava0, @NotNull DeserializedDescriptorResolver deserializedDescriptorResolver0) {
                Intrinsics.checkNotNullParameter(deserializationComponentsForJava0, "deserializationComponentsForJava");
                Intrinsics.checkNotNullParameter(deserializedDescriptorResolver0, "deserializedDescriptorResolver");
                super();
                this.a = deserializationComponentsForJava0;
                this.b = deserializedDescriptorResolver0;
            }

            @NotNull
            public final DeserializationComponentsForJava getDeserializationComponentsForJava() {
                return this.a;
            }

            @NotNull
            public final DeserializedDescriptorResolver getDeserializedDescriptorResolver() {
                return this.b;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final ModuleData createModuleData(@NotNull KotlinClassFinder kotlinClassFinder0, @NotNull KotlinClassFinder kotlinClassFinder1, @NotNull JavaClassFinder javaClassFinder0, @NotNull String s, @NotNull ErrorReporter errorReporter0, @NotNull JavaSourceElementFactory javaSourceElementFactory0) {
            Intrinsics.checkNotNullParameter(kotlinClassFinder0, "kotlinClassFinder");
            Intrinsics.checkNotNullParameter(kotlinClassFinder1, "jvmBuiltInsKotlinClassFinder");
            Intrinsics.checkNotNullParameter(javaClassFinder0, "javaClassFinder");
            Intrinsics.checkNotNullParameter(s, "moduleName");
            Intrinsics.checkNotNullParameter(errorReporter0, "errorReporter");
            Intrinsics.checkNotNullParameter(javaSourceElementFactory0, "javaSourceElementFactory");
            LockBasedStorageManager lockBasedStorageManager0 = new LockBasedStorageManager("DeserializationComponentsForJava.ModuleData");
            JvmBuiltIns jvmBuiltIns0 = new JvmBuiltIns(lockBasedStorageManager0, Kind.FROM_DEPENDENCIES);
            Name name0 = Name.special(("<" + s + '>'));
            Intrinsics.checkNotNullExpressionValue(name0, "special(\"<$moduleName>\")");
            ModuleDescriptorImpl moduleDescriptorImpl0 = new ModuleDescriptorImpl(name0, lockBasedStorageManager0, jvmBuiltIns0, null, null, null, 56, null);
            jvmBuiltIns0.setBuiltInsModule(moduleDescriptorImpl0);
            jvmBuiltIns0.initialize(moduleDescriptorImpl0, true);
            DeserializedDescriptorResolver deserializedDescriptorResolver0 = new DeserializedDescriptorResolver();
            SingleModuleClassResolver singleModuleClassResolver0 = new SingleModuleClassResolver();
            NotFoundClasses notFoundClasses0 = new NotFoundClasses(lockBasedStorageManager0, moduleDescriptorImpl0);
            LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider0 = DeserializationComponentsForJavaKt.makeLazyJavaPackageFragmentProvider$default(javaClassFinder0, moduleDescriptorImpl0, lockBasedStorageManager0, notFoundClasses0, kotlinClassFinder0, deserializedDescriptorResolver0, errorReporter0, javaSourceElementFactory0, singleModuleClassResolver0, null, 0x200, null);
            DeserializationComponentsForJava deserializationComponentsForJava0 = DeserializationComponentsForJavaKt.makeDeserializationComponentsForJava(moduleDescriptorImpl0, lockBasedStorageManager0, notFoundClasses0, lazyJavaPackageFragmentProvider0, kotlinClassFinder0, deserializedDescriptorResolver0, errorReporter0, JvmMetadataVersion.INSTANCE);
            deserializedDescriptorResolver0.setComponents(deserializationComponentsForJava0);
            Intrinsics.checkNotNullExpressionValue(JavaResolverCache.EMPTY, "EMPTY");
            JavaDescriptorResolver javaDescriptorResolver0 = new JavaDescriptorResolver(lazyJavaPackageFragmentProvider0, JavaResolverCache.EMPTY);
            singleModuleClassResolver0.setResolver(javaDescriptorResolver0);
            JvmBuiltInsCustomizer jvmBuiltInsCustomizer0 = jvmBuiltIns0.getCustomizer();
            JvmBuiltInsCustomizer jvmBuiltInsCustomizer1 = jvmBuiltIns0.getCustomizer();
            SamConversionResolverImpl samConversionResolverImpl0 = new SamConversionResolverImpl(lockBasedStorageManager0, CollectionsKt__CollectionsKt.emptyList());
            JvmBuiltInsPackageFragmentProvider jvmBuiltInsPackageFragmentProvider0 = new JvmBuiltInsPackageFragmentProvider(lockBasedStorageManager0, kotlinClassFinder1, moduleDescriptorImpl0, notFoundClasses0, jvmBuiltInsCustomizer0, jvmBuiltInsCustomizer1, Default.INSTANCE, NewKotlinTypeChecker.Companion.getDefault(), samConversionResolverImpl0);
            moduleDescriptorImpl0.setDependencies(new ModuleDescriptorImpl[]{moduleDescriptorImpl0});
            moduleDescriptorImpl0.initialize(new CompositePackageFragmentProvider(CollectionsKt__CollectionsKt.listOf(new PackageFragmentProviderOptimized[]{javaDescriptorResolver0.getPackageFragmentProvider(), jvmBuiltInsPackageFragmentProvider0}), "CompositeProvider@RuntimeModuleData for " + moduleDescriptorImpl0));
            return new ModuleData(deserializationComponentsForJava0, deserializedDescriptorResolver0);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final DeserializationComponents a;

    static {
        DeserializationComponentsForJava.Companion = new Companion(null);
    }

    public DeserializationComponentsForJava(@NotNull StorageManager storageManager0, @NotNull ModuleDescriptor moduleDescriptor0, @NotNull DeserializationConfiguration deserializationConfiguration0, @NotNull JavaClassDataFinder javaClassDataFinder0, @NotNull BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl0, @NotNull LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider0, @NotNull NotFoundClasses notFoundClasses0, @NotNull ErrorReporter errorReporter0, @NotNull LookupTracker lookupTracker0, @NotNull ContractDeserializer contractDeserializer0, @NotNull NewKotlinTypeChecker newKotlinTypeChecker0, @NotNull TypeAttributeTranslators typeAttributeTranslators0) {
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        JvmBuiltInsCustomizer jvmBuiltInsCustomizer1;
        JvmBuiltInsCustomizer jvmBuiltInsCustomizer0;
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(deserializationConfiguration0, "configuration");
        Intrinsics.checkNotNullParameter(javaClassDataFinder0, "classDataFinder");
        Intrinsics.checkNotNullParameter(binaryClassAnnotationAndConstantLoaderImpl0, "annotationAndConstantLoader");
        Intrinsics.checkNotNullParameter(lazyJavaPackageFragmentProvider0, "packageFragmentProvider");
        Intrinsics.checkNotNullParameter(notFoundClasses0, "notFoundClasses");
        Intrinsics.checkNotNullParameter(errorReporter0, "errorReporter");
        Intrinsics.checkNotNullParameter(lookupTracker0, "lookupTracker");
        Intrinsics.checkNotNullParameter(contractDeserializer0, "contractDeserializer");
        Intrinsics.checkNotNullParameter(newKotlinTypeChecker0, "kotlinTypeChecker");
        Intrinsics.checkNotNullParameter(typeAttributeTranslators0, "typeAttributeTranslators");
        super();
        KotlinBuiltIns kotlinBuiltIns0 = moduleDescriptor0.getBuiltIns();
        JvmBuiltIns jvmBuiltIns0 = kotlinBuiltIns0 instanceof JvmBuiltIns ? ((JvmBuiltIns)kotlinBuiltIns0) : null;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings.Default localClassifierTypeSettings$Default0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings.Default.INSTANCE;
        JavaFlexibleTypeDeserializer javaFlexibleTypeDeserializer0 = JavaFlexibleTypeDeserializer.INSTANCE;
        List list0 = CollectionsKt__CollectionsKt.emptyList();
        if(jvmBuiltIns0 == null) {
            jvmBuiltInsCustomizer0 = None.INSTANCE;
        }
        else {
            jvmBuiltInsCustomizer0 = jvmBuiltIns0.getCustomizer();
            if(jvmBuiltInsCustomizer0 == null) {
                jvmBuiltInsCustomizer0 = None.INSTANCE;
            }
        }
        if(jvmBuiltIns0 == null) {
            jvmBuiltInsCustomizer1 = NoPlatformDependent.INSTANCE;
        }
        else {
            jvmBuiltInsCustomizer1 = jvmBuiltIns0.getCustomizer();
            if(jvmBuiltInsCustomizer1 == null) {
                jvmBuiltInsCustomizer1 = NoPlatformDependent.INSTANCE;
            }
        }
        this.a = new DeserializationComponents(storageManager0, moduleDescriptor0, deserializationConfiguration0, javaClassDataFinder0, binaryClassAnnotationAndConstantLoaderImpl0, lazyJavaPackageFragmentProvider0, localClassifierTypeSettings$Default0, errorReporter0, lookupTracker0, javaFlexibleTypeDeserializer0, list0, notFoundClasses0, contractDeserializer0, jvmBuiltInsCustomizer0, jvmBuiltInsCustomizer1, JvmProtoBufUtil.INSTANCE.getEXTENSION_REGISTRY(), newKotlinTypeChecker0, new SamConversionResolverImpl(storageManager0, CollectionsKt__CollectionsKt.emptyList()), null, typeAttributeTranslators0.getTranslators(), 0x40000, null);
    }

    @NotNull
    public final DeserializationComponents getComponents() {
        return this.a;
    }
}

