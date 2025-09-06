package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000E\n\u0000\u001A\u0010\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"illegalDecoyCallException", "", "fName", "", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class DecoyKt {
    @ComposeCompilerApi
    @NotNull
    public static final Void illegalDecoyCallException(@NotNull String s) {
        throw new IllegalStateException("Function " + s + " should have been replaced by compiler.");
    }
}

