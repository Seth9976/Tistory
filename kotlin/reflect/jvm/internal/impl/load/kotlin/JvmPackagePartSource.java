package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nJvmPackagePartSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmPackagePartSource.kt\norg/jetbrains/kotlin/load/kotlin/JvmPackagePartSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
public final class JvmPackagePartSource implements DeserializedContainerSource {
    public final JvmClassName a;
    public final JvmClassName b;
    public final KotlinJvmBinaryClass c;

    public JvmPackagePartSource(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass0, @NotNull Package protoBuf$Package0, @NotNull NameResolver nameResolver0, @Nullable IncompatibleVersionErrorData incompatibleVersionErrorData0, boolean z, @NotNull DeserializedContainerAbiStability deserializedContainerAbiStability0) {
        Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass0, "kotlinClass");
        Intrinsics.checkNotNullParameter(protoBuf$Package0, "packageProto");
        Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
        Intrinsics.checkNotNullParameter(deserializedContainerAbiStability0, "abiStability");
        JvmClassName jvmClassName0 = JvmClassName.byClassId(kotlinJvmBinaryClass0.getClassId());
        Intrinsics.checkNotNullExpressionValue(jvmClassName0, "byClassId(kotlinClass.classId)");
        String s = kotlinJvmBinaryClass0.getClassHeader().getMultifileClassName();
        this(jvmClassName0, (s == null || s.length() <= 0 ? null : JvmClassName.byInternalName(s)), protoBuf$Package0, nameResolver0, incompatibleVersionErrorData0, z, deserializedContainerAbiStability0, kotlinJvmBinaryClass0);
    }

    public JvmPackagePartSource(@NotNull JvmClassName jvmClassName0, @Nullable JvmClassName jvmClassName1, @NotNull Package protoBuf$Package0, @NotNull NameResolver nameResolver0, @Nullable IncompatibleVersionErrorData incompatibleVersionErrorData0, boolean z, @NotNull DeserializedContainerAbiStability deserializedContainerAbiStability0, @Nullable KotlinJvmBinaryClass kotlinJvmBinaryClass0) {
        Intrinsics.checkNotNullParameter(jvmClassName0, "className");
        Intrinsics.checkNotNullParameter(protoBuf$Package0, "packageProto");
        Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
        Intrinsics.checkNotNullParameter(deserializedContainerAbiStability0, "abiStability");
        super();
        this.a = jvmClassName0;
        this.b = jvmClassName1;
        this.c = kotlinJvmBinaryClass0;
        Intrinsics.checkNotNullExpressionValue(JvmProtoBuf.packageModuleName, "packageModuleName");
        Integer integer0 = (Integer)ProtoBufUtilKt.getExtensionOrNull(protoBuf$Package0, JvmProtoBuf.packageModuleName);
        if(integer0 != null) {
            nameResolver0.getString(integer0.intValue());
        }
    }

    @NotNull
    public final ClassId getClassId() {
        return new ClassId(this.getClassName().getPackageFqName(), this.getSimpleName());
    }

    @NotNull
    public JvmClassName getClassName() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    @NotNull
    public SourceFile getContainingFile() {
        Intrinsics.checkNotNullExpressionValue(SourceFile.NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return SourceFile.NO_SOURCE_FILE;
    }

    @Nullable
    public JvmClassName getFacadeClassName() {
        return this.b;
    }

    @Nullable
    public final KotlinJvmBinaryClass getKnownJvmBinaryClass() {
        return this.c;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource
    @NotNull
    public String getPresentableString() {
        return "Class \'" + this.getClassId().asSingleFqName().asString() + '\'';
    }

    @NotNull
    public final Name getSimpleName() {
        String s = this.getClassName().getInternalName();
        Intrinsics.checkNotNullExpressionValue(s, "className.internalName");
        Name name0 = Name.identifier(StringsKt__StringsKt.substringAfterLast$default(s, '/', null, 2, null));
        Intrinsics.checkNotNullExpressionValue(name0, "identifier(className.int….substringAfterLast(\'/\'))");
        return name0;
    }

    @Override
    @NotNull
    public String toString() {
        return "JvmPackagePartSource: " + this.getClassName();
    }
}

