package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J(\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u0007H&J(\u0010\n\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u000B2\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u0007H&J(\u0010\f\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u0007H&J\u0010\u0010\r\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u000BH&J\u0016\u0010\u000E\u001A\u00020\u00032\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00030\u0010H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/RememberManager;", "", "deactivating", "", "instance", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "endRelativeOrder", "", "priority", "endRelativeAfter", "forgetting", "Landroidx/compose/runtime/RememberObserver;", "releasing", "remembering", "sideEffect", "effect", "Lkotlin/Function0;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface RememberManager {
    void deactivating(@NotNull ComposeNodeLifecycleCallback arg1, int arg2, int arg3, int arg4);

    void forgetting(@NotNull RememberObserver arg1, int arg2, int arg3, int arg4);

    void releasing(@NotNull ComposeNodeLifecycleCallback arg1, int arg2, int arg3, int arg4);

    void remembering(@NotNull RememberObserver arg1);

    void sideEffect(@NotNull Function0 arg1);
}

