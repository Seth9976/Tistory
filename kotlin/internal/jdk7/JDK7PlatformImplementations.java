package kotlin.internal.jdk7;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.internal.PlatformImplementations;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ud.a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001F\u0010\b\u001A\u00020\u00072\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001D\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0006\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u000B\u0010\f¨\u0006\u000E"}, d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "Lkotlin/internal/PlatformImplementations;", "<init>", "()V", "", "cause", "exception", "", "addSuppressed", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "", "getSuppressed", "(Ljava/lang/Throwable;)Ljava/util/List;", "ud/a", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class JDK7PlatformImplementations extends PlatformImplementations {
    @Override  // kotlin.internal.PlatformImplementations
    public void addSuppressed(@NotNull Throwable throwable0, @NotNull Throwable throwable1) {
        Intrinsics.checkNotNullParameter(throwable0, "cause");
        Intrinsics.checkNotNullParameter(throwable1, "exception");
        if(a.a != null && ((int)a.a) < 19) {
            super.addSuppressed(throwable0, throwable1);
            return;
        }
        throwable0.addSuppressed(throwable1);
    }

    @Override  // kotlin.internal.PlatformImplementations
    @NotNull
    public List getSuppressed(@NotNull Throwable throwable0) {
        Intrinsics.checkNotNullParameter(throwable0, "exception");
        if(a.a != null && ((int)a.a) < 19) {
            return super.getSuppressed(throwable0);
        }
        Throwable[] arr_throwable = throwable0.getSuppressed();
        Intrinsics.checkNotNullExpressionValue(arr_throwable, "getSuppressed(...)");
        return ArraysKt___ArraysJvmKt.asList(arr_throwable);
    }
}

