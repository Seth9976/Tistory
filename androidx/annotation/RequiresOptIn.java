package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.ANNOTATION_TYPE})
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\n\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003R\u000F\u0010\u0002\u001A\u00020\u0003¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/annotation/RequiresOptIn;", "", "level", "Landroidx/annotation/RequiresOptIn$Level;", "()Landroidx/annotation/RequiresOptIn$Level;", "Level", "annotation-experimental_release"}, k = 1, mv = {1, 7, 0}, xi = 0x30)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
public @interface RequiresOptIn {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/annotation/RequiresOptIn$Level;", "", "WARNING", "ERROR", "annotation-experimental_release"}, k = 1, mv = {1, 7, 0}, xi = 0x30)
    public static enum Level {
        WARNING,
        ERROR;

    }

    Level level() default Level.ERROR;
}

