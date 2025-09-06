package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.Arrays;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import org.jetbrains.annotations.NotNull;

public final class JvmMetadataVersion extends BinaryVersion {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public static final JvmMetadataVersion INSTANCE;
    @JvmField
    @NotNull
    public static final JvmMetadataVersion INSTANCE_NEXT;
    @JvmField
    @NotNull
    public static final JvmMetadataVersion INVALID_VERSION;
    public final boolean f;

    static {
        JvmMetadataVersion.Companion = new Companion(null);
        JvmMetadataVersion jvmMetadataVersion0 = new JvmMetadataVersion(new int[]{1, 8, 0});
        JvmMetadataVersion.INSTANCE = jvmMetadataVersion0;
        JvmMetadataVersion.INSTANCE_NEXT = jvmMetadataVersion0.next();
        JvmMetadataVersion.INVALID_VERSION = new JvmMetadataVersion(new int[0]);
    }

    public JvmMetadataVersion(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "numbers");
        this(arr_v, false);
    }

    public JvmMetadataVersion(@NotNull int[] arr_v, boolean z) {
        Intrinsics.checkNotNullParameter(arr_v, "versionArray");
        super(Arrays.copyOf(arr_v, arr_v.length));
        this.f = z;
    }

    public final boolean a(JvmMetadataVersion jvmMetadataVersion0) {
        if(this.getMajor() <= jvmMetadataVersion0.getMajor()) {
            return this.getMajor() >= jvmMetadataVersion0.getMajor() ? this.getMinor() > jvmMetadataVersion0.getMinor() : false;
        }
        return true;
    }

    public final boolean isCompatible(@NotNull JvmMetadataVersion jvmMetadataVersion0) {
        Intrinsics.checkNotNullParameter(jvmMetadataVersion0, "metadataVersionFromLanguageVersion");
        if(this.getMajor() == 2 && this.getMinor() == 0 && (JvmMetadataVersion.INSTANCE.getMajor() == 1 && JvmMetadataVersion.INSTANCE.getMinor() == 8)) {
            return true;
        }
        return this.getMajor() == 1 && this.getMinor() == 0 || this.getMajor() == 0 ? false : !this.a(jvmMetadataVersion0.lastSupportedVersionWithThisLanguageVersion(this.f));
    }

    public final boolean isStrictSemantics() {
        return this.f;
    }

    @NotNull
    public final JvmMetadataVersion lastSupportedVersionWithThisLanguageVersion(boolean z) {
        JvmMetadataVersion jvmMetadataVersion0 = z ? JvmMetadataVersion.INSTANCE : JvmMetadataVersion.INSTANCE_NEXT;
        return jvmMetadataVersion0.a(this) ? jvmMetadataVersion0 : this;
    }

    @NotNull
    public final JvmMetadataVersion next() {
        return this.getMajor() != 1 || this.getMinor() != 9 ? new JvmMetadataVersion(new int[]{this.getMajor(), this.getMinor() + 1, 0}) : new JvmMetadataVersion(new int[]{2, 0, 0});
    }
}

