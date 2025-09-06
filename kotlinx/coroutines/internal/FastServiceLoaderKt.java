package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000B\n\u0002\b\u0005\"\u001A\u0010\u0001\u001A\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001A\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "ANDROID_DETECTED", "Z", "getANDROID_DETECTED", "()Z", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFastServiceLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoaderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
public final class FastServiceLoaderKt {
    static {
        try {
            Class.forName("android.os.Build");
        }
        catch(Throwable throwable0) {
            ResultKt.createFailure(throwable0);
        }
    }

    public static final boolean getANDROID_DETECTED() [...] // Inlined contents
}

