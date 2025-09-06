package kotlin.jvm.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.JvmName;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE})
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0010\u0012\u000E\b\u0002\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003R\u0017\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/jvm/internal/SerializedIr;", "", "bytes", "", "", "b", "()[Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.6")
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
public @interface SerializedIr {
    @JvmName(name = "b")
    String[] b() default {};
}

