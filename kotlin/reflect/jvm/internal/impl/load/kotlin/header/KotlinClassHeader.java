package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nKotlinClassHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinClassHeader.kt\norg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
public final class KotlinClassHeader {
    @SourceDebugExtension({"SMAP\nKotlinClassHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinClassHeader.kt\norg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader$Kind\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,78:1\n8811#2,2:79\n9071#2,4:81\n*S KotlinDebug\n*F\n+ 1 KotlinClassHeader.kt\norg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader$Kind\n*L\n34#1:79,2\n34#1:81,4\n*E\n"})
    public static enum Kind {
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @JvmStatic
            @NotNull
            public final Kind getById(int v) {
                Kind kotlinClassHeader$Kind0 = (Kind)Kind.b.get(v);
                return kotlinClassHeader$Kind0 == null ? Kind.UNKNOWN : kotlinClassHeader$Kind0;
            }
        }

        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);

        @NotNull
        public static final Companion Companion;
        public final int a;
        public static final LinkedHashMap b;

        static {
            Kind.Companion = new Companion(null);
            Kind[] arr_kotlinClassHeader$Kind = (Kind[])Kind.c.clone();
            int v1 = arr_kotlinClassHeader$Kind.length;
            if(v1 >= 0) {
                if(v1 < 3) {
                    ++v1;
                }
                else if(v1 < 0x40000000) {
                    v1 = (int)(((float)v1) / 0.75f + 1.0f);
                }
                else {
                    v1 = 0x7FFFFFFF;
                }
            }
            int v2 = v1;
            if(v2 < 16) {
                v2 = 16;
            }
            LinkedHashMap linkedHashMap0 = new LinkedHashMap(v2);
            for(int v = 0; v < arr_kotlinClassHeader$Kind.length; ++v) {
                Kind kotlinClassHeader$Kind0 = arr_kotlinClassHeader$Kind[v];
                linkedHashMap0.put(kotlinClassHeader$Kind0.a, kotlinClassHeader$Kind0);
            }
            Kind.b = linkedHashMap0;
        }

        public Kind(int v1) {
            this.a = v1;
        }

        @JvmStatic
        @NotNull
        public static final Kind getById(int v) {
            return Kind.Companion.getById(v);
        }
    }

    public final Kind a;
    public final JvmMetadataVersion b;
    public final String[] c;
    public final String[] d;
    public final String[] e;
    public final String f;
    public final int g;

    public KotlinClassHeader(@NotNull Kind kotlinClassHeader$Kind0, @NotNull JvmMetadataVersion jvmMetadataVersion0, @Nullable String[] arr_s, @Nullable String[] arr_s1, @Nullable String[] arr_s2, @Nullable String s, int v, @Nullable String s1, @Nullable byte[] arr_b) {
        Intrinsics.checkNotNullParameter(kotlinClassHeader$Kind0, "kind");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion0, "metadataVersion");
        super();
        this.a = kotlinClassHeader$Kind0;
        this.b = jvmMetadataVersion0;
        this.c = arr_s;
        this.d = arr_s1;
        this.e = arr_s2;
        this.f = s;
        this.g = v;
    }

    @Nullable
    public final String[] getData() {
        return this.c;
    }

    @Nullable
    public final String[] getIncompatibleData() {
        return this.d;
    }

    @NotNull
    public final Kind getKind() {
        return this.a;
    }

    @NotNull
    public final JvmMetadataVersion getMetadataVersion() {
        return this.b;
    }

    @Nullable
    public final String getMultifileClassName() {
        return this.a == Kind.MULTIFILE_CLASS_PART ? this.f : null;
    }

    @NotNull
    public final List getMultifilePartNames() {
        List list0 = null;
        String[] arr_s = this.a == Kind.MULTIFILE_CLASS ? this.c : null;
        if(arr_s != null) {
            list0 = ArraysKt___ArraysJvmKt.asList(arr_s);
        }
        return list0 == null ? CollectionsKt__CollectionsKt.emptyList() : list0;
    }

    @Nullable
    public final String[] getStrings() {
        return this.e;
    }

    public final boolean isPreRelease() {
        return (this.g & 2) != 0;
    }

    public final boolean isUnstableFirBinary() {
        return (this.g & 0x40) != 0 && (this.g & 0x20) == 0;
    }

    public final boolean isUnstableJvmIrBinary() {
        return (this.g & 16) != 0 && (this.g & 0x20) == 0;
    }

    @Override
    @NotNull
    public String toString() {
        return this.a + " version=" + this.b;
    }
}

