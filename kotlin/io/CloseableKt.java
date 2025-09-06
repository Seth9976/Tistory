package kotlin.io;

import java.io.Closeable;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import md.b;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\u001F\u0010\u0004\u001A\u00020\u0003*\u0004\u0018\u00010\u00002\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljava/io/Closeable;", "", "cause", "", "closeFinally", "(Ljava/io/Closeable;Ljava/lang/Throwable;)V", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "CloseableKt")
public final class CloseableKt {
    @PublishedApi
    @SinceKotlin(version = "1.1")
    public static final void closeFinally(@Nullable Closeable closeable0, @Nullable Throwable throwable0) {
        if(closeable0 != null) {
            if(throwable0 == null) {
                closeable0.close();
                return;
            }
            try {
                closeable0.close();
            }
            catch(Throwable throwable1) {
                b.addSuppressed(throwable0, throwable1);
            }
        }
    }
}

