package androidx.compose.runtime;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@InternalComposeApi
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001R\u0016\u0010\u0002\u001A\u00060\u0003j\u0002`\u0004X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001A\u00020\bX¦\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000BÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/RecomposerErrorInfo;", "", "cause", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getCause", "()Ljava/lang/Exception;", "recoverable", "", "getRecoverable", "()Z", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface RecomposerErrorInfo {
    @NotNull
    Exception getCause();

    boolean getRecoverable();
}

