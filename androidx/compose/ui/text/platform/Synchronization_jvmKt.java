package androidx.compose.ui.text.platform;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\b\u0010\u0000\u001A\u00020\u0001H\u0000\u001A*\u0010\u0002\u001A\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001A\u00020\u00012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0081\b¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"createSynchronizedObject", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "synchronized", "R", "lock", "block", "Lkotlin/Function0;", "(Landroidx/compose/ui/text/platform/SynchronizedObject;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class Synchronization_jvmKt {
    @NotNull
    public static final SynchronizedObject createSynchronizedObject() {
        return new SynchronizedObject();
    }

    @PublishedApi
    public static final Object synchronized(@NotNull SynchronizedObject synchronizedObject0, @NotNull Function0 function00) {
        synchronized(synchronizedObject0) {
            return function00.invoke();
        }
    }
}

