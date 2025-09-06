package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ExperimentalComposeApi;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalComposeApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotContextElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "Key", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface SnapshotContextElement extends Element {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object fold(@NotNull SnapshotContextElement snapshotContextElement0, Object object0, @NotNull Function2 function20) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.fold(snapshotContextElement0, object0, function20);
        }

        @Nullable
        public static Element get(@NotNull SnapshotContextElement snapshotContextElement0, @NotNull Key coroutineContext$Key0) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.get(snapshotContextElement0, coroutineContext$Key0);
        }

        @NotNull
        public static CoroutineContext minusKey(@NotNull SnapshotContextElement snapshotContextElement0, @NotNull Key coroutineContext$Key0) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.minusKey(snapshotContextElement0, coroutineContext$Key0);
        }

        @NotNull
        public static CoroutineContext plus(@NotNull SnapshotContextElement snapshotContextElement0, @NotNull CoroutineContext coroutineContext0) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(snapshotContextElement0, coroutineContext0);
        }
    }

    @Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotContextElement$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/compose/runtime/snapshots/SnapshotContextElement;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class androidx.compose.runtime.snapshots.SnapshotContextElement.Key implements Key {
        public static final androidx.compose.runtime.snapshots.SnapshotContextElement.Key a;

        static {
            androidx.compose.runtime.snapshots.SnapshotContextElement.Key.a = new androidx.compose.runtime.snapshots.SnapshotContextElement.Key();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
    }

    @NotNull
    public static final androidx.compose.runtime.snapshots.SnapshotContextElement.Key Key;

    static {
        SnapshotContextElement.Key = androidx.compose.runtime.snapshots.SnapshotContextElement.Key.a;
    }
}

