package androidx.activity.contextaware;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000F\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\n\u0010\u000BJ\u0015\u0010\f\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\f\u0010\u000BJ\u0015\u0010\u000E\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\u0004¢\u0006\u0004\b\u000E\u0010\u000FJ\r\u0010\u0010\u001A\u00020\t¢\u0006\u0004\b\u0010\u0010\u0003¨\u0006\u0011"}, d2 = {"Landroidx/activity/contextaware/ContextAwareHelper;", "", "<init>", "()V", "Landroid/content/Context;", "peekAvailableContext", "()Landroid/content/Context;", "Landroidx/activity/contextaware/OnContextAvailableListener;", "listener", "", "addOnContextAvailableListener", "(Landroidx/activity/contextaware/OnContextAvailableListener;)V", "removeOnContextAvailableListener", "context", "dispatchOnContextAvailable", "(Landroid/content/Context;)V", "clearAvailableContext", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ContextAwareHelper {
    public final CopyOnWriteArraySet a;
    public volatile Context b;

    public ContextAwareHelper() {
        this.a = new CopyOnWriteArraySet();
    }

    public final void addOnContextAvailableListener(@NotNull OnContextAvailableListener onContextAvailableListener0) {
        Intrinsics.checkNotNullParameter(onContextAvailableListener0, "listener");
        Context context0 = this.b;
        if(context0 != null) {
            onContextAvailableListener0.onContextAvailable(context0);
        }
        this.a.add(onContextAvailableListener0);
    }

    public final void clearAvailableContext() {
        this.b = null;
    }

    public final void dispatchOnContextAvailable(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this.b = context0;
        for(Object object0: this.a) {
            ((OnContextAvailableListener)object0).onContextAvailable(context0);
        }
    }

    @Nullable
    public final Context peekAvailableContext() {
        return this.b;
    }

    public final void removeOnContextAvailableListener(@NotNull OnContextAvailableListener onContextAvailableListener0) {
        Intrinsics.checkNotNullParameter(onContextAvailableListener0, "listener");
        this.a.remove(onContextAvailableListener0);
    }
}

