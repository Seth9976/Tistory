package kotlin.reflect.full;

import java.lang.reflect.Method;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0004\u001A\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR!\u0010\u0004\u001A\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"kotlin/reflect/full/Java8RepeatableContainerLoader$Cache", "", "Ljava/lang/Class;", "", "repeatableClass", "Ljava/lang/reflect/Method;", "valueMethod", "<init>", "(Ljava/lang/Class;Ljava/lang/reflect/Method;)V", "a", "Ljava/lang/Class;", "getRepeatableClass", "()Ljava/lang/Class;", "b", "Ljava/lang/reflect/Method;", "getValueMethod", "()Ljava/lang/reflect/Method;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Java8RepeatableContainerLoader.Cache {
    public final Class a;
    public final Method b;

    public Java8RepeatableContainerLoader.Cache(@Nullable Class class0, @Nullable Method method0) {
        this.a = class0;
        this.b = method0;
    }

    @Nullable
    public final Class getRepeatableClass() {
        return this.a;
    }

    @Nullable
    public final Method getValueMethod() {
        return this.b;
    }
}

