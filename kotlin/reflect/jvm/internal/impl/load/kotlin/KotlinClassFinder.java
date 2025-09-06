package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.KotlinMetadataFinder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface KotlinClassFinder extends KotlinMetadataFinder {
    public static abstract class Result {
        public static final class ClassFileContent extends Result {
            @NotNull
            public final byte[] getContent() [...] // Inlined contents
        }

        public static final class KotlinClass extends Result {
            public final KotlinJvmBinaryClass a;

            public KotlinClass(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass0, @Nullable byte[] arr_b) {
                Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass0, "kotlinJvmBinaryClass");
                super(null);
                this.a = kotlinJvmBinaryClass0;
            }

            public KotlinClass(KotlinJvmBinaryClass kotlinJvmBinaryClass0, byte[] arr_b, int v, DefaultConstructorMarker defaultConstructorMarker0) {
                if((v & 2) != 0) {
                    arr_b = null;
                }
                this(kotlinJvmBinaryClass0, arr_b);
            }

            @NotNull
            public final KotlinJvmBinaryClass getKotlinJvmBinaryClass() {
                return this.a;
            }
        }

        public Result(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @Nullable
        public final KotlinJvmBinaryClass toKotlinJvmBinaryClass() {
            KotlinClass kotlinClassFinder$Result$KotlinClass0 = this instanceof KotlinClass ? ((KotlinClass)this) : null;
            return kotlinClassFinder$Result$KotlinClass0 == null ? null : kotlinClassFinder$Result$KotlinClass0.getKotlinJvmBinaryClass();
        }
    }

    @Nullable
    Result findKotlinClassOrContent(@NotNull JavaClass arg1, @NotNull JvmMetadataVersion arg2);

    @Nullable
    Result findKotlinClassOrContent(@NotNull ClassId arg1, @NotNull JvmMetadataVersion arg2);
}

