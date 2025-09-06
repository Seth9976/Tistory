package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava.Companion.ModuleData;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import org.jetbrains.annotations.NotNull;

public final class RuntimeModuleData {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final RuntimeModuleData create(@NotNull ClassLoader classLoader0) {
            Intrinsics.checkNotNullParameter(classLoader0, "classLoader");
            ReflectKotlinClassFinder reflectKotlinClassFinder0 = new ReflectKotlinClassFinder(classLoader0);
            ClassLoader classLoader1 = Unit.class.getClassLoader();
            Intrinsics.checkNotNullExpressionValue(classLoader1, "Unit::class.java.classLoader");
            ReflectKotlinClassFinder reflectKotlinClassFinder1 = new ReflectKotlinClassFinder(classLoader1);
            ReflectJavaClassFinder reflectJavaClassFinder0 = new ReflectJavaClassFinder(classLoader0);
            ModuleData deserializationComponentsForJava$Companion$ModuleData0 = DeserializationComponentsForJava.Companion.createModuleData(reflectKotlinClassFinder0, reflectKotlinClassFinder1, reflectJavaClassFinder0, "runtime module for " + classLoader0, RuntimeErrorReporter.INSTANCE, RuntimeSourceElementFactory.INSTANCE);
            return new RuntimeModuleData(deserializationComponentsForJava$Companion$ModuleData0.getDeserializationComponentsForJava().getComponents(), new PackagePartScopeCache(deserializationComponentsForJava$Companion$ModuleData0.getDeserializedDescriptorResolver(), reflectKotlinClassFinder0), null);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final DeserializationComponents a;
    public final PackagePartScopeCache b;

    static {
        RuntimeModuleData.Companion = new Companion(null);
    }

    public RuntimeModuleData(DeserializationComponents deserializationComponents0, PackagePartScopeCache packagePartScopeCache0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = deserializationComponents0;
        this.b = packagePartScopeCache0;
    }

    @NotNull
    public final DeserializationComponents getDeserialization() {
        return this.a;
    }

    @NotNull
    public final ModuleDescriptor getModule() {
        return this.a.getModuleDescriptor();
    }

    @NotNull
    public final PackagePartScopeCache getPackagePartScopeCache() {
        return this.b;
    }
}

