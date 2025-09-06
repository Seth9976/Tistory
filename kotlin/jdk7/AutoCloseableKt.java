package kotlin.jdk7;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import md.b;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\u001F\u0010\u0004\u001A\u00020\u0003*\u0004\u0018\u00010\u00002\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljava/lang/AutoCloseable;", "", "cause", "", "closeFinally", "(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V", "kotlin-stdlib-jdk7"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "AutoCloseableKt")
public final class AutoCloseableKt {
    @PublishedApi
    @SinceKotlin(version = "1.2")
    public static final void closeFinally(@Nullable AutoCloseable autoCloseable0, @Nullable Throwable throwable0) {
        if(autoCloseable0 != null) {
            if(throwable0 == null) {
                autoCloseable0.close();
                return;
            }
            try {
                autoCloseable0.close();
            }
            catch(Throwable throwable1) {
                b.addSuppressed(throwable0, throwable1);
            }
        }
    }
}

