package androidx.lifecycle;

import androidx.savedstate.SavedStateRegistry;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\u000E\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\u000E\u0010\u000FJ\u001F\u0010\u0014\u001A\u00020\r2\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0016\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR$\u0010 \u001A\u00020\u001C2\u0006\u0010\u001D\u001A\u00020\u001C8\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/LifecycleEventObserver;", "Ljava/io/Closeable;", "", "key", "Landroidx/lifecycle/SavedStateHandle;", "handle", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/SavedStateHandle;)V", "Landroidx/savedstate/SavedStateRegistry;", "registry", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "", "attachToLifecycle", "(Landroidx/savedstate/SavedStateRegistry;Landroidx/lifecycle/Lifecycle;)V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "close", "()V", "b", "Landroidx/lifecycle/SavedStateHandle;", "getHandle", "()Landroidx/lifecycle/SavedStateHandle;", "", "<set-?>", "c", "Z", "isAttached", "()Z", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSavedStateHandleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleController.kt\nandroidx/lifecycle/SavedStateHandleController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
public final class SavedStateHandleController implements LifecycleEventObserver, Closeable {
    public final String a;
    public final SavedStateHandle b;
    public boolean c;

    public SavedStateHandleController(@NotNull String s, @NotNull SavedStateHandle savedStateHandle0) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(savedStateHandle0, "handle");
        super();
        this.a = s;
        this.b = savedStateHandle0;
    }

    public final void attachToLifecycle(@NotNull SavedStateRegistry savedStateRegistry0, @NotNull Lifecycle lifecycle0) {
        Intrinsics.checkNotNullParameter(savedStateRegistry0, "registry");
        Intrinsics.checkNotNullParameter(lifecycle0, "lifecycle");
        if(this.c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.c = true;
        lifecycle0.addObserver(this);
        savedStateRegistry0.registerSavedStateProvider(this.a, this.b.savedStateProvider());
    }

    @Override
    public void close() {
    }

    @NotNull
    public final SavedStateHandle getHandle() {
        return this.b;
    }

    public final boolean isAttached() {
        return this.c;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull LifecycleOwner lifecycleOwner0, @NotNull Event lifecycle$Event0) {
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "source");
        Intrinsics.checkNotNullParameter(lifecycle$Event0, "event");
        if(lifecycle$Event0 == Event.ON_DESTROY) {
            this.c = false;
            lifecycleOwner0.getLifecycle().removeObserver(this);
        }
    }
}

