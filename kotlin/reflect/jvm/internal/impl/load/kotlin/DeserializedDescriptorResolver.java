package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Set;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ve.a;

@SourceDebugExtension({"SMAP\nDeserializedDescriptorResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedDescriptorResolver.kt\norg/jetbrains/kotlin/load/kotlin/DeserializedDescriptorResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n126#1,14:155\n126#1,14:169\n1#2:183\n*S KotlinDebug\n*F\n+ 1 DeserializedDescriptorResolver.kt\norg/jetbrains/kotlin/load/kotlin/DeserializedDescriptorResolver\n*L\n56#1:155,14\n68#1:169,14\n*E\n"})
public final class DeserializedDescriptorResolver {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final JvmMetadataVersion getKOTLIN_1_3_RC_METADATA_VERSION$descriptors_jvm() {
            return DeserializedDescriptorResolver.e;
        }
    }

    @NotNull
    public static final Companion Companion;
    public static final Set a;
    public static final Set b;
    public static final JvmMetadataVersion c;
    public DeserializationComponents components;
    public static final JvmMetadataVersion d;
    public static final JvmMetadataVersion e;

    static {
        DeserializedDescriptorResolver.Companion = new Companion(null);
        DeserializedDescriptorResolver.a = e0.setOf(Kind.CLASS);
        DeserializedDescriptorResolver.b = f0.setOf(new Kind[]{Kind.FILE_FACADE, Kind.MULTIFILE_CLASS_PART});
        DeserializedDescriptorResolver.c = new JvmMetadataVersion(new int[]{1, 1, 2});
        DeserializedDescriptorResolver.d = new JvmMetadataVersion(new int[]{1, 1, 11});
        DeserializedDescriptorResolver.e = new JvmMetadataVersion(new int[]{1, 1, 13});
    }

    public final DeserializedContainerAbiStability a(KotlinJvmBinaryClass kotlinJvmBinaryClass0) {
        if(this.getComponents().getConfiguration().getAllowUnstableDependencies()) {
            return DeserializedContainerAbiStability.STABLE;
        }
        if(kotlinJvmBinaryClass0.getClassHeader().isUnstableFirBinary()) {
            return DeserializedContainerAbiStability.FIR_UNSTABLE;
        }
        return kotlinJvmBinaryClass0.getClassHeader().isUnstableJvmIrBinary() ? DeserializedContainerAbiStability.IR_UNSTABLE : DeserializedContainerAbiStability.STABLE;
    }

    public final IncompatibleVersionErrorData b(KotlinJvmBinaryClass kotlinJvmBinaryClass0) {
        if(!this.getComponents().getConfiguration().getSkipMetadataVersionCheck() && !kotlinJvmBinaryClass0.getClassHeader().getMetadataVersion().isCompatible(DeserializationHelpersKt.jvmMetadataVersionOrDefault(this.getComponents().getConfiguration()))) {
            JvmMetadataVersion jvmMetadataVersion0 = kotlinJvmBinaryClass0.getClassHeader().getMetadataVersion();
            JvmMetadataVersion jvmMetadataVersion1 = DeserializationHelpersKt.jvmMetadataVersionOrDefault(this.getComponents().getConfiguration());
            JvmMetadataVersion jvmMetadataVersion2 = DeserializationHelpersKt.jvmMetadataVersionOrDefault(this.getComponents().getConfiguration()).lastSupportedVersionWithThisLanguageVersion(kotlinJvmBinaryClass0.getClassHeader().getMetadataVersion().isStrictSemantics());
            String s = kotlinJvmBinaryClass0.getLocation();
            ClassId classId0 = kotlinJvmBinaryClass0.getClassId();
            return new IncompatibleVersionErrorData(jvmMetadataVersion0, JvmMetadataVersion.INSTANCE, jvmMetadataVersion1, jvmMetadataVersion2, s, classId0);
        }
        return null;
    }

    // 去混淆评级： 中等(60)
    public final boolean c(KotlinJvmBinaryClass kotlinJvmBinaryClass0) {
        return this.getComponents().getConfiguration().getReportErrorsOnPreReleaseDependencies() && (kotlinJvmBinaryClass0.getClassHeader().isPreRelease() || Intrinsics.areEqual(kotlinJvmBinaryClass0.getClassHeader().getMetadataVersion(), DeserializedDescriptorResolver.c)) || !this.getComponents().getConfiguration().getSkipPrereleaseCheck() && kotlinJvmBinaryClass0.getClassHeader().isPreRelease() && Intrinsics.areEqual(kotlinJvmBinaryClass0.getClassHeader().getMetadataVersion(), DeserializedDescriptorResolver.d);
    }

    @Nullable
    public final MemberScope createKotlinPackagePartScope(@NotNull PackageFragmentDescriptor packageFragmentDescriptor0, @NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass0) {
        Pair pair0;
        Intrinsics.checkNotNullParameter(packageFragmentDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass0, "kotlinClass");
        KotlinClassHeader kotlinClassHeader0 = kotlinJvmBinaryClass0.getClassHeader();
        String[] arr_s = kotlinClassHeader0.getData();
        if(arr_s == null) {
            arr_s = kotlinClassHeader0.getIncompatibleData();
        }
        if(arr_s == null || !DeserializedDescriptorResolver.b.contains(kotlinClassHeader0.getKind())) {
            arr_s = null;
        }
        if(arr_s == null) {
            return null;
        }
        String[] arr_s1 = kotlinJvmBinaryClass0.getClassHeader().getStrings();
        if(arr_s1 == null) {
            return null;
        }
        try {
            try {
                pair0 = JvmProtoBufUtil.readPackageDataFrom(arr_s, arr_s1);
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                throw new IllegalStateException("Could not read data from " + kotlinJvmBinaryClass0.getLocation(), invalidProtocolBufferException0);
            }
        }
        catch(Throwable throwable0) {
            if(this.getComponents().getConfiguration().getSkipMetadataVersionCheck() || kotlinJvmBinaryClass0.getClassHeader().getMetadataVersion().isCompatible(DeserializationHelpersKt.jvmMetadataVersionOrDefault(this.getComponents().getConfiguration()))) {
                throw throwable0;
            }
            pair0 = null;
        }
        if(pair0 == null) {
            return null;
        }
        IncompatibleVersionErrorData incompatibleVersionErrorData0 = this.b(kotlinJvmBinaryClass0);
        boolean z = this.c(kotlinJvmBinaryClass0);
        DeserializedContainerAbiStability deserializedContainerAbiStability0 = this.a(kotlinJvmBinaryClass0);
        Package protoBuf$Package0 = (Package)pair0.component2();
        JvmNameResolver jvmNameResolver0 = (JvmNameResolver)pair0.component1();
        JvmPackagePartSource jvmPackagePartSource0 = new JvmPackagePartSource(kotlinJvmBinaryClass0, protoBuf$Package0, jvmNameResolver0, incompatibleVersionErrorData0, z, deserializedContainerAbiStability0);
        return new DeserializedPackageMemberScope(packageFragmentDescriptor0, protoBuf$Package0, jvmNameResolver0, kotlinJvmBinaryClass0.getClassHeader().getMetadataVersion(), jvmPackagePartSource0, this.getComponents(), "scope for " + jvmPackagePartSource0 + " in " + packageFragmentDescriptor0, a.w);
    }

    @NotNull
    public final DeserializationComponents getComponents() {
        DeserializationComponents deserializationComponents0 = this.components;
        if(deserializationComponents0 != null) {
            return deserializationComponents0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("components");
        return null;
    }

    @Nullable
    public final ClassData readClassData$descriptors_jvm(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass0) {
        Pair pair0;
        Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass0, "kotlinClass");
        KotlinClassHeader kotlinClassHeader0 = kotlinJvmBinaryClass0.getClassHeader();
        String[] arr_s = kotlinClassHeader0.getData();
        if(arr_s == null) {
            arr_s = kotlinClassHeader0.getIncompatibleData();
        }
        if(arr_s == null || !DeserializedDescriptorResolver.a.contains(kotlinClassHeader0.getKind())) {
            arr_s = null;
        }
        if(arr_s == null) {
            return null;
        }
        String[] arr_s1 = kotlinJvmBinaryClass0.getClassHeader().getStrings();
        if(arr_s1 == null) {
            return null;
        }
        try {
            try {
                pair0 = JvmProtoBufUtil.readClassDataFrom(arr_s, arr_s1);
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                throw new IllegalStateException("Could not read data from " + kotlinJvmBinaryClass0.getLocation(), invalidProtocolBufferException0);
            }
        }
        catch(Throwable throwable0) {
            if(this.getComponents().getConfiguration().getSkipMetadataVersionCheck() || kotlinJvmBinaryClass0.getClassHeader().getMetadataVersion().isCompatible(DeserializationHelpersKt.jvmMetadataVersionOrDefault(this.getComponents().getConfiguration()))) {
                throw throwable0;
            }
            pair0 = null;
        }
        if(pair0 == null) {
            return null;
        }
        KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement0 = new KotlinJvmBinarySourceElement(kotlinJvmBinaryClass0, this.b(kotlinJvmBinaryClass0), this.c(kotlinJvmBinaryClass0), this.a(kotlinJvmBinaryClass0));
        return new ClassData(((JvmNameResolver)pair0.component1()), ((Class)pair0.component2()), kotlinJvmBinaryClass0.getClassHeader().getMetadataVersion(), kotlinJvmBinarySourceElement0);
    }

    @Nullable
    public final ClassDescriptor resolveClass(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass0) {
        Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass0, "kotlinClass");
        ClassData classData0 = this.readClassData$descriptors_jvm(kotlinJvmBinaryClass0);
        return classData0 == null ? null : this.getComponents().getClassDeserializer().deserializeClass(kotlinJvmBinaryClass0.getClassId(), classData0);
    }

    public final void setComponents(@NotNull DeserializationComponentsForJava deserializationComponentsForJava0) {
        Intrinsics.checkNotNullParameter(deserializationComponentsForJava0, "components");
        this.setComponents(deserializationComponentsForJava0.getComponents());
    }

    public final void setComponents(@NotNull DeserializationComponents deserializationComponents0) {
        Intrinsics.checkNotNullParameter(deserializationComponents0, "<set-?>");
        this.components = deserializationComponents0;
    }
}

