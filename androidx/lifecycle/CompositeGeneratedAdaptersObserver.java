package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001F\u0010\f\u001A\u00020\u000B2\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "", "Landroidx/lifecycle/GeneratedAdapter;", "generatedAdapters", "<init>", "([Landroidx/lifecycle/GeneratedAdapter;)V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CompositeGeneratedAdaptersObserver implements LifecycleEventObserver {
    public final GeneratedAdapter[] a;

    public CompositeGeneratedAdaptersObserver(@NotNull GeneratedAdapter[] arr_generatedAdapter) {
        Intrinsics.checkNotNullParameter(arr_generatedAdapter, "generatedAdapters");
        super();
        this.a = arr_generatedAdapter;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull LifecycleOwner lifecycleOwner0, @NotNull Event lifecycle$Event0) {
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "source");
        Intrinsics.checkNotNullParameter(lifecycle$Event0, "event");
        MethodCallsLogger methodCallsLogger0 = new MethodCallsLogger();
        GeneratedAdapter[] arr_generatedAdapter = this.a;
        for(int v1 = 0; v1 < arr_generatedAdapter.length; ++v1) {
            arr_generatedAdapter[v1].callMethods(lifecycleOwner0, lifecycle$Event0, false, methodCallsLogger0);
        }
        for(int v = 0; v < arr_generatedAdapter.length; ++v) {
            arr_generatedAdapter[v].callMethods(lifecycleOwner0, lifecycle$Event0, true, methodCallsLogger0);
        }
    }
}

