package androidx.compose.runtime;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\b\u0010\u0006\u001A\u00020\u0007H&J\u0015\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00028\u0000H&¢\u0006\u0002\u0010\nJ\u001D\u0010\u000B\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00028\u0000H&¢\u0006\u0002\u0010\u000FJ\u001D\u0010\u0010\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00028\u0000H&¢\u0006\u0002\u0010\u000FJ \u0010\u0011\u001A\u00020\u00072\u0006\u0010\u0012\u001A\u00020\r2\u0006\u0010\u0013\u001A\u00020\r2\u0006\u0010\u0014\u001A\u00020\rH&J\b\u0010\u0015\u001A\u00020\u0007H\u0016J\b\u0010\u0016\u001A\u00020\u0007H\u0016J\u0018\u0010\u0017\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u0014\u001A\u00020\rH&J\b\u0010\u0018\u001A\u00020\u0007H&R\u0012\u0010\u0003\u001A\u00028\u0000X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/Applier;", "N", "", "current", "getCurrent", "()Ljava/lang/Object;", "clear", "", "down", "node", "(Ljava/lang/Object;)V", "insertBottomUp", "index", "", "instance", "(ILjava/lang/Object;)V", "insertTopDown", "move", "from", "to", "count", "onBeginChanges", "onEndChanges", "remove", "up", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface Applier {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        public static void onBeginChanges(@NotNull Applier applier0) {
        }

        @Deprecated
        public static void onEndChanges(@NotNull Applier applier0) {
            applier0.super.onEndChanges();
        }
    }

    static void access$onBeginChanges$jd(Applier applier0) {
    }

    void clear();

    void down(Object arg1);

    Object getCurrent();

    void insertBottomUp(int arg1, Object arg2);

    void insertTopDown(int arg1, Object arg2);

    void move(int arg1, int arg2, int arg3);

    default void onBeginChanges() {
    }

    default void onEndChanges() {
    }

    void remove(int arg1, int arg2);

    void up();
}

