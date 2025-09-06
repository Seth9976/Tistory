package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.KotlinClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsResourceLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nReflectKotlinClassFinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectKotlinClassFinder.kt\norg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClassFinder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
public final class ReflectKotlinClassFinder implements KotlinClassFinder {
    public final ClassLoader a;
    public final BuiltInsResourceLoader b;

    public ReflectKotlinClassFinder(@NotNull ClassLoader classLoader0) {
        Intrinsics.checkNotNullParameter(classLoader0, "classLoader");
        super();
        this.a = classLoader0;
        this.b = new BuiltInsResourceLoader();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.KotlinMetadataFinder
    @Nullable
    public InputStream findBuiltInsData(@NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "packageFqName");
        if(!fqName0.startsWith(StandardNames.BUILT_INS_PACKAGE_NAME)) {
            return null;
        }
        String s = BuiltInSerializerProtocol.INSTANCE.getBuiltInsFilePath(fqName0);
        return this.b.loadResource(s);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder
    @Nullable
    public Result findKotlinClassOrContent(@NotNull JavaClass javaClass0, @NotNull JvmMetadataVersion jvmMetadataVersion0) {
        Intrinsics.checkNotNullParameter(javaClass0, "javaClass");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion0, "jvmMetadataVersion");
        FqName fqName0 = javaClass0.getFqName();
        if(fqName0 != null) {
            String s = fqName0.asString();
            if(s != null) {
                Class class0 = ReflectJavaClassFinderKt.tryLoadClass(this.a, s);
                if(class0 != null) {
                    ReflectKotlinClass reflectKotlinClass0 = ReflectKotlinClass.Factory.create(class0);
                    if(reflectKotlinClass0 != null) {
                        return new KotlinClass(reflectKotlinClass0, null, 2, null);
                    }
                }
            }
        }
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder
    @Nullable
    public Result findKotlinClassOrContent(@NotNull ClassId classId0, @NotNull JvmMetadataVersion jvmMetadataVersion0) {
        Intrinsics.checkNotNullParameter(classId0, "classId");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion0, "jvmMetadataVersion");
        String s = ReflectKotlinClassFinderKt.access$toRuntimeFqName(classId0);
        Class class0 = ReflectJavaClassFinderKt.tryLoadClass(this.a, s);
        if(class0 != null) {
            ReflectKotlinClass reflectKotlinClass0 = ReflectKotlinClass.Factory.create(class0);
            if(reflectKotlinClass0 != null) {
                return new KotlinClass(reflectKotlinClass0, null, 2, null);
            }
        }
        return null;
    }
}

