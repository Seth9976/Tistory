package androidx.lifecycle.viewmodel.internal;

import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\b\u0010\u0002\u001A\u00020\u0003H\u0000\u001A\f\u0010\u0004\u001A\u00020\u0003*\u00020\u0005H\u0000\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"VIEW_MODEL_SCOPE_KEY", "", "createViewModelScope", "Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "asCloseable", "Lkotlinx/coroutines/CoroutineScope;", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class CloseableCoroutineScopeKt {
    @NotNull
    public static final String VIEW_MODEL_SCOPE_KEY = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY";

    @NotNull
    public static final CloseableCoroutineScope asCloseable(@NotNull CoroutineScope coroutineScope0) {
        Intrinsics.checkNotNullParameter(coroutineScope0, "<this>");
        return new CloseableCoroutineScope(coroutineScope0);
    }

    @NotNull
    public static final CloseableCoroutineScope createViewModelScope() {
        try {
            return new CloseableCoroutineScope(Dispatchers.getMain().getImmediate().plus(SupervisorKt.SupervisorJob$default(null, 1, null)));
        }
        catch(NotImplementedError unused_ex) {
            return new CloseableCoroutineScope(EmptyCoroutineContext.INSTANCE.plus(SupervisorKt.SupervisorJob$default(null, 1, null)));
        }
        catch(IllegalStateException unused_ex) {
            return new CloseableCoroutineScope(EmptyCoroutineContext.INSTANCE.plus(SupervisorKt.SupervisorJob$default(null, 1, null)));
        }
    }
}

