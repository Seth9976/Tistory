package kotlinx.serialization;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({})
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\n\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003R\u000F\u0010\u0002\u001A\u00020\u0003¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/EncodeDefault;", "", "mode", "Lkotlinx/serialization/EncodeDefault$Mode;", "()Lkotlinx/serialization/EncodeDefault$Mode;", "Mode", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@MustBeDocumented
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.PROPERTY})
@ExperimentalSerializationApi
public @interface EncodeDefault {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/EncodeDefault$Mode;", "", "ALWAYS", "NEVER", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @ExperimentalSerializationApi
    public static enum Mode {
        ALWAYS,
        NEVER;

        public static final Mode[] a;
        public static final EnumEntries b;

        static {
            Mode.a = arr_encodeDefault$Mode;
            Intrinsics.checkNotNullParameter(arr_encodeDefault$Mode, "entries");
            Mode.b = new a(arr_encodeDefault$Mode);
        }

        @NotNull
        public static EnumEntries getEntries() {
            return Mode.b;
        }
    }

    Mode mode() default Mode.ALWAYS;
}

