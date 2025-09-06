package okhttp3.internal.platform.android;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B%\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001A\u0004\u0018\u00010\u00012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\u000E\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/platform/android/CloseGuard;", "", "Ljava/lang/reflect/Method;", "getMethod", "openMethod", "warnIfOpenMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "", "closer", "createAndOpen", "(Ljava/lang/String;)Ljava/lang/Object;", "closeGuardInstance", "", "warnIfOpen", "(Ljava/lang/Object;)Z", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CloseGuard {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/android/CloseGuard$Companion;", "", "Lokhttp3/internal/platform/android/CloseGuard;", "get", "()Lokhttp3/internal/platform/android/CloseGuard;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final CloseGuard get() {
            try {
                Class class0 = Class.forName("dalvik.system.CloseGuard");
                return new CloseGuard(class0.getMethod("get", null), class0.getMethod("open", String.class), class0.getMethod("warnIfOpen", null));
            }
            catch(Exception unused_ex) {
                return new CloseGuard(null, null, null);
            }
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Method a;
    public final Method b;
    public final Method c;

    static {
        CloseGuard.Companion = new Companion(null);
    }

    public CloseGuard(@Nullable Method method0, @Nullable Method method1, @Nullable Method method2) {
        this.a = method0;
        this.b = method1;
        this.c = method2;
    }

    @Nullable
    public final Object createAndOpen(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "closer");
        Method method0 = this.a;
        if(method0 != null) {
            try {
                Object object0 = method0.invoke(null, null);
                Intrinsics.checkNotNull(this.b);
                this.b.invoke(object0, s);
                return object0;
            }
            catch(Exception unused_ex) {
            }
        }
        return null;
    }

    public final boolean warnIfOpen(@Nullable Object object0) {
        if(object0 != null) {
            try {
                Intrinsics.checkNotNull(this.c);
                this.c.invoke(object0, null);
                return true;
            }
            catch(Exception unused_ex) {
            }
        }
        return false;
    }
}

