package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001F\u0010\f\u001A\u00020\u000B2\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Landroidx/lifecycle/DefaultLifecycleObserverAdapter;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "defaultLifecycleObserver", "lifecycleEventObserver", "<init>", "(Landroidx/lifecycle/DefaultLifecycleObserver;Landroidx/lifecycle/LifecycleEventObserver;)V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DefaultLifecycleObserverAdapter implements LifecycleEventObserver {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Event.values().length];
            try {
                arr_v[Event.ON_CREATE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Event.ON_START.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Event.ON_RESUME.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Event.ON_PAUSE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Event.ON_STOP.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Event.ON_DESTROY.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Event.ON_ANY.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public final DefaultLifecycleObserver a;
    public final LifecycleEventObserver b;

    public DefaultLifecycleObserverAdapter(@NotNull DefaultLifecycleObserver defaultLifecycleObserver0, @Nullable LifecycleEventObserver lifecycleEventObserver0) {
        Intrinsics.checkNotNullParameter(defaultLifecycleObserver0, "defaultLifecycleObserver");
        super();
        this.a = defaultLifecycleObserver0;
        this.b = lifecycleEventObserver0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull LifecycleOwner lifecycleOwner0, @NotNull Event lifecycle$Event0) {
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "source");
        Intrinsics.checkNotNullParameter(lifecycle$Event0, "event");
        DefaultLifecycleObserver defaultLifecycleObserver0 = this.a;
        switch(WhenMappings.$EnumSwitchMapping$0[lifecycle$Event0.ordinal()]) {
            case 1: {
                defaultLifecycleObserver0.onCreate(lifecycleOwner0);
                break;
            }
            case 2: {
                defaultLifecycleObserver0.onStart(lifecycleOwner0);
                break;
            }
            case 3: {
                defaultLifecycleObserver0.onResume(lifecycleOwner0);
                break;
            }
            case 4: {
                defaultLifecycleObserver0.onPause(lifecycleOwner0);
                break;
            }
            case 5: {
                defaultLifecycleObserver0.onStop(lifecycleOwner0);
                break;
            }
            case 6: {
                defaultLifecycleObserver0.onDestroy(lifecycleOwner0);
                break;
            }
            case 7: {
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            }
        }
        LifecycleEventObserver lifecycleEventObserver0 = this.b;
        if(lifecycleEventObserver0 != null) {
            lifecycleEventObserver0.onStateChanged(lifecycleOwner0, lifecycle$Event0);
        }
    }
}

