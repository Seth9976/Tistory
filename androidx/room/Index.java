package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

@Retention(RetentionPolicy.CLASS)
@Target({})
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u000EB8\u0012\u0012\u0010\u0002\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004\u0012\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0004\u0012\b\b\u0002\u0010\b\u001A\u00020\tR\u000F\u0010\u0007\u001A\u00020\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\nR\u0015\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u000BR\u000F\u0010\b\u001A\u00020\t¢\u0006\u0006\u001A\u0004\b\b\u0010\fR\u0017\u0010\u0002\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0006\u001A\u0004\b\u0002\u0010\r¨\u0006\u000F"}, d2 = {"Landroidx/room/Index;", "", "value", "", "", "orders", "Landroidx/room/Index$Order;", "name", "unique", "", "()Ljava/lang/String;", "()[Landroidx/room/Index$Order;", "()Z", "()[Ljava/lang/String;", "Order", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@kotlin.annotation.Target(allowedTargets = {})
public @interface Index {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/Index$Order;", "", "ASC", "DESC", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static enum Order {
        ASC,
        DESC;

    }

    String name() default "";

    Order[] orders() default {};

    boolean unique() default false;

    String[] value();
}

