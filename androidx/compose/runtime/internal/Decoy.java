package androidx.compose.runtime.internal;

import androidx.compose.runtime.ExperimentalComposeApi;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationTarget;

@ExperimentalComposeApi
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u001C\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0012\u0010\u0004\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0005\"\u00020\u0003R\u0017\u0010\u0004\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0005¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0006R\u000F\u0010\u0002\u001A\u00020\u0003¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/internal/Decoy;", "", "targetName", "", "signature", "", "()[Ljava/lang/String;", "()Ljava/lang/String;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.CONSTRUCTOR})
public @interface Decoy {
    String[] signature();

    String targetName();
}

