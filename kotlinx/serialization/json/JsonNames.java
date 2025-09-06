package kotlinx.serialization.json;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerialInfo;
import org.jetbrains.annotations.NotNull;

@Retention(RetentionPolicy.RUNTIME)
@Target({})
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0014\u0012\u0012\u0010\u0002\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004R\u0017\u0010\u0002\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/json/JsonNames;", "", "names", "", "", "()[Ljava/lang/String;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.PROPERTY})
@ExperimentalSerializationApi
@SerialInfo
public @interface JsonNames {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class Impl implements JsonNames {
        public final String[] a;

        public Impl(@NotNull String[] arr_s) {
            Intrinsics.checkNotNullParameter(arr_s, "names");
            super();
            this.a = arr_s;
        }

        @Override  // kotlinx.serialization.json.JsonNames
        public final String[] names() {
            return this.a;
        }
    }

    String[] names();
}

