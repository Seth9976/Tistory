package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.internal.FastSafeIterableMap;
import androidx.arch.core.internal.SafeIterableMap.IteratorWithAdditions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u0000  2\u00020\u0001:\u0002 !B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0011\u001A\u00020\b2\u0006\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001A\u00020\b2\u0006\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R$\u0010\u0017\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00068V@VX\u0096\u000E¢\u0006\f\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\nR\u001A\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00060\u00188VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u001AR\u0014\u0010\u001F\u001A\u00020\u001C8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u001E¨\u0006\""}, d2 = {"Landroidx/lifecycle/LifecycleRegistry;", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/LifecycleOwner;", "provider", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/lifecycle/Lifecycle$State;", "state", "", "markState", "(Landroidx/lifecycle/Lifecycle$State;)V", "Landroidx/lifecycle/Lifecycle$Event;", "event", "handleLifecycleEvent", "(Landroidx/lifecycle/Lifecycle$Event;)V", "Landroidx/lifecycle/LifecycleObserver;", "observer", "addObserver", "(Landroidx/lifecycle/LifecycleObserver;)V", "removeObserver", "getCurrentState", "()Landroidx/lifecycle/Lifecycle$State;", "setCurrentState", "currentState", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "currentStateFlow", "", "getObserverCount", "()I", "observerCount", "Companion", "ObserverWithState", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class LifecycleRegistry extends Lifecycle {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00072\b\u0010\t\u001A\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000B¨\u0006\r"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry$Companion;", "", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Landroidx/lifecycle/LifecycleRegistry;", "createUnsafe", "(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleRegistry;", "Landroidx/lifecycle/Lifecycle$State;", "state1", "state2", "min$lifecycle_runtime_release", "(Landroidx/lifecycle/Lifecycle$State;Landroidx/lifecycle/Lifecycle$State;)Landroidx/lifecycle/Lifecycle$State;", "min", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @VisibleForTesting
        @JvmStatic
        @NotNull
        public final LifecycleRegistry createUnsafe(@NotNull LifecycleOwner lifecycleOwner0) {
            Intrinsics.checkNotNullParameter(lifecycleOwner0, "owner");
            return new LifecycleRegistry(lifecycleOwner0, false, null);
        }

        @JvmStatic
        @NotNull
        public final State min$lifecycle_runtime_release(@NotNull State lifecycle$State0, @Nullable State lifecycle$State1) {
            Intrinsics.checkNotNullParameter(lifecycle$State0, "state1");
            return lifecycle$State1 == null || lifecycle$State1.compareTo(lifecycle$State0) >= 0 ? lifecycle$State0 : lifecycle$State1;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001F\u0010\r\u001A\u00020\f2\b\u0010\t\u001A\u0004\u0018\u00010\b2\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\r\u0010\u000ER\"\u0010\u0015\u001A\u00020\u00048\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001D\u001A\u00020\u00168\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u001C¨\u0006\u001E"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry$ObserverWithState;", "", "Landroidx/lifecycle/LifecycleObserver;", "observer", "Landroidx/lifecycle/Lifecycle$State;", "initialState", "<init>", "(Landroidx/lifecycle/LifecycleObserver;Landroidx/lifecycle/Lifecycle$State;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "dispatchEvent", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "a", "Landroidx/lifecycle/Lifecycle$State;", "getState", "()Landroidx/lifecycle/Lifecycle$State;", "setState", "(Landroidx/lifecycle/Lifecycle$State;)V", "state", "Landroidx/lifecycle/LifecycleEventObserver;", "b", "Landroidx/lifecycle/LifecycleEventObserver;", "getLifecycleObserver", "()Landroidx/lifecycle/LifecycleEventObserver;", "setLifecycleObserver", "(Landroidx/lifecycle/LifecycleEventObserver;)V", "lifecycleObserver", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class ObserverWithState {
        public State a;
        public LifecycleEventObserver b;

        public ObserverWithState(@Nullable LifecycleObserver lifecycleObserver0, @NotNull State lifecycle$State0) {
            Intrinsics.checkNotNullParameter(lifecycle$State0, "initialState");
            super();
            Intrinsics.checkNotNull(lifecycleObserver0);
            this.b = Lifecycling.lifecycleEventObserver(lifecycleObserver0);
            this.a = lifecycle$State0;
        }

        public final void dispatchEvent(@Nullable LifecycleOwner lifecycleOwner0, @NotNull Event lifecycle$Event0) {
            Intrinsics.checkNotNullParameter(lifecycle$Event0, "event");
            State lifecycle$State0 = lifecycle$Event0.getTargetState();
            this.a = LifecycleRegistry.Companion.min$lifecycle_runtime_release(this.a, lifecycle$State0);
            LifecycleEventObserver lifecycleEventObserver0 = this.b;
            Intrinsics.checkNotNull(lifecycleOwner0);
            lifecycleEventObserver0.onStateChanged(lifecycleOwner0, lifecycle$Event0);
            this.a = lifecycle$State0;
        }

        @NotNull
        public final LifecycleEventObserver getLifecycleObserver() {
            return this.b;
        }

        @NotNull
        public final State getState() {
            return this.a;
        }

        public final void setLifecycleObserver(@NotNull LifecycleEventObserver lifecycleEventObserver0) {
            Intrinsics.checkNotNullParameter(lifecycleEventObserver0, "<set-?>");
            this.b = lifecycleEventObserver0;
        }

        public final void setState(@NotNull State lifecycle$State0) {
            Intrinsics.checkNotNullParameter(lifecycle$State0, "<set-?>");
            this.a = lifecycle$State0;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final boolean b;
    public FastSafeIterableMap c;
    public State d;
    public final WeakReference e;
    public int f;
    public boolean g;
    public boolean h;
    public final ArrayList i;
    public final MutableStateFlow j;

    static {
        LifecycleRegistry.Companion = new Companion(null);
    }

    public LifecycleRegistry(@NotNull LifecycleOwner lifecycleOwner0) {
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "provider");
        this(lifecycleOwner0, true);
    }

    public LifecycleRegistry(LifecycleOwner lifecycleOwner0, boolean z) {
        this.b = z;
        this.c = new FastSafeIterableMap();
        this.d = State.INITIALIZED;
        this.i = new ArrayList();
        this.e = new WeakReference(lifecycleOwner0);
        this.j = StateFlowKt.MutableStateFlow(State.INITIALIZED);
    }

    public LifecycleRegistry(LifecycleOwner lifecycleOwner0, boolean z, DefaultConstructorMarker defaultConstructorMarker0) {
        this(lifecycleOwner0, z);
    }

    public final State a(LifecycleObserver lifecycleObserver0) {
        State lifecycle$State1;
        Map.Entry map$Entry0 = this.c.ceil(lifecycleObserver0);
        State lifecycle$State0 = null;
        if(map$Entry0 == null) {
            lifecycle$State1 = null;
        }
        else {
            ObserverWithState lifecycleRegistry$ObserverWithState0 = (ObserverWithState)map$Entry0.getValue();
            lifecycle$State1 = lifecycleRegistry$ObserverWithState0 == null ? null : lifecycleRegistry$ObserverWithState0.getState();
        }
        ArrayList arrayList0 = this.i;
        if(!arrayList0.isEmpty()) {
            lifecycle$State0 = (State)arrayList0.get(arrayList0.size() - 1);
        }
        State lifecycle$State2 = LifecycleRegistry.Companion.min$lifecycle_runtime_release(this.d, lifecycle$State1);
        return LifecycleRegistry.Companion.min$lifecycle_runtime_release(lifecycle$State2, lifecycle$State0);
    }

    @Override  // androidx.lifecycle.Lifecycle
    public void addObserver(@NotNull LifecycleObserver lifecycleObserver0) {
        Intrinsics.checkNotNullParameter(lifecycleObserver0, "observer");
        this.b("addObserver");
        ObserverWithState lifecycleRegistry$ObserverWithState0 = new ObserverWithState(lifecycleObserver0, (this.d == State.DESTROYED ? State.DESTROYED : State.INITIALIZED));
        if(((ObserverWithState)this.c.putIfAbsent(lifecycleObserver0, lifecycleRegistry$ObserverWithState0)) != null) {
            return;
        }
        LifecycleOwner lifecycleOwner0 = (LifecycleOwner)this.e.get();
        if(lifecycleOwner0 == null) {
            return;
        }
        boolean z = this.f != 0 || this.g;
        State lifecycle$State0 = this.a(lifecycleObserver0);
        ++this.f;
        while(lifecycleRegistry$ObserverWithState0.getState().compareTo(lifecycle$State0) < 0 && this.c.contains(lifecycleObserver0)) {
            this.i.add(lifecycleRegistry$ObserverWithState0.getState());
            Event lifecycle$Event0 = Event.Companion.upFrom(lifecycleRegistry$ObserverWithState0.getState());
            if(lifecycle$Event0 == null) {
                throw new IllegalStateException("no event up from " + lifecycleRegistry$ObserverWithState0.getState());
            }
            lifecycleRegistry$ObserverWithState0.dispatchEvent(lifecycleOwner0, lifecycle$Event0);
            this.i.remove(this.i.size() - 1);
            lifecycle$State0 = this.a(lifecycleObserver0);
        }
        if(!z) {
            this.d();
        }
        --this.f;
    }

    public final void b(String s) {
        if(this.b && !LifecycleRegistry_androidKt.isMainThread()) {
            throw new IllegalStateException(("Method " + s + " must be called on the main thread").toString());
        }
    }

    public final void c(State lifecycle$State0) {
        State lifecycle$State1 = this.d;
        if(lifecycle$State1 == lifecycle$State0) {
            return;
        }
        if(lifecycle$State1 == State.INITIALIZED && lifecycle$State0 == State.DESTROYED) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + lifecycle$State0 + ", but was " + this.d + " in component " + this.e.get()).toString());
        }
        this.d = lifecycle$State0;
        if(!this.g && this.f == 0) {
            this.g = true;
            this.d();
            this.g = false;
            if(this.d == State.DESTROYED) {
                this.c = new FastSafeIterableMap();
            }
            return;
        }
        this.h = true;
    }

    @VisibleForTesting
    @JvmStatic
    @NotNull
    public static final LifecycleRegistry createUnsafe(@NotNull LifecycleOwner lifecycleOwner0) {
        return LifecycleRegistry.Companion.createUnsafe(lifecycleOwner0);
    }

    public final void d() {
        LifecycleOwner lifecycleOwner0 = (LifecycleOwner)this.e.get();
        if(lifecycleOwner0 == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while(this.c.size() != 0) {
            Map.Entry map$Entry0 = this.c.eldest();
            Intrinsics.checkNotNull(map$Entry0);
            State lifecycle$State0 = ((ObserverWithState)map$Entry0.getValue()).getState();
            Map.Entry map$Entry1 = this.c.newest();
            Intrinsics.checkNotNull(map$Entry1);
            State lifecycle$State1 = ((ObserverWithState)map$Entry1.getValue()).getState();
            if(lifecycle$State0 == lifecycle$State1 && this.d == lifecycle$State1) {
                break;
            }
            this.h = false;
            State lifecycle$State2 = this.d;
            Map.Entry map$Entry2 = this.c.eldest();
            Intrinsics.checkNotNull(map$Entry2);
            if(lifecycle$State2.compareTo(((ObserverWithState)map$Entry2.getValue()).getState()) < 0) {
                Iterator iterator0 = this.c.descendingIterator();
                Intrinsics.checkNotNullExpressionValue(iterator0, "observerMap.descendingIterator()");
                while(iterator0.hasNext() && !this.h) {
                    Object object0 = iterator0.next();
                    Intrinsics.checkNotNullExpressionValue(((Map.Entry)object0), "next()");
                    LifecycleObserver lifecycleObserver0 = (LifecycleObserver)((Map.Entry)object0).getKey();
                    ObserverWithState lifecycleRegistry$ObserverWithState0 = (ObserverWithState)((Map.Entry)object0).getValue();
                    while(lifecycleRegistry$ObserverWithState0.getState().compareTo(this.d) > 0 && !this.h && this.c.contains(lifecycleObserver0)) {
                        Event lifecycle$Event0 = Event.Companion.downFrom(lifecycleRegistry$ObserverWithState0.getState());
                        if(lifecycle$Event0 == null) {
                            throw new IllegalStateException("no event down from " + lifecycleRegistry$ObserverWithState0.getState());
                        }
                        State lifecycle$State3 = lifecycle$Event0.getTargetState();
                        this.i.add(lifecycle$State3);
                        lifecycleRegistry$ObserverWithState0.dispatchEvent(lifecycleOwner0, lifecycle$Event0);
                        this.i.remove(this.i.size() - 1);
                    }
                }
            }
            Map.Entry map$Entry3 = this.c.newest();
            if(!this.h && map$Entry3 != null && this.d.compareTo(((ObserverWithState)map$Entry3.getValue()).getState()) > 0) {
                IteratorWithAdditions safeIterableMap$IteratorWithAdditions0 = this.c.iteratorWithAdditions();
                Intrinsics.checkNotNullExpressionValue(safeIterableMap$IteratorWithAdditions0, "observerMap.iteratorWithAdditions()");
                while(safeIterableMap$IteratorWithAdditions0.hasNext() && !this.h) {
                    Object object1 = safeIterableMap$IteratorWithAdditions0.next();
                    LifecycleObserver lifecycleObserver1 = (LifecycleObserver)((Map.Entry)object1).getKey();
                    ObserverWithState lifecycleRegistry$ObserverWithState1 = (ObserverWithState)((Map.Entry)object1).getValue();
                    while(lifecycleRegistry$ObserverWithState1.getState().compareTo(this.d) < 0 && !this.h && this.c.contains(lifecycleObserver1)) {
                        this.i.add(lifecycleRegistry$ObserverWithState1.getState());
                        Event lifecycle$Event1 = Event.Companion.upFrom(lifecycleRegistry$ObserverWithState1.getState());
                        if(lifecycle$Event1 == null) {
                            throw new IllegalStateException("no event up from " + lifecycleRegistry$ObserverWithState1.getState());
                        }
                        lifecycleRegistry$ObserverWithState1.dispatchEvent(lifecycleOwner0, lifecycle$Event1);
                        this.i.remove(this.i.size() - 1);
                    }
                }
                if(false) {
                    break;
                }
            }
        }
        this.h = false;
        this.j.setValue(this.getCurrentState());
    }

    @Override  // androidx.lifecycle.Lifecycle
    @NotNull
    public State getCurrentState() {
        return this.d;
    }

    @Override  // androidx.lifecycle.Lifecycle
    @NotNull
    public StateFlow getCurrentStateFlow() {
        return FlowKt.asStateFlow(this.j);
    }

    public int getObserverCount() {
        this.b("getObserverCount");
        return this.c.size();
    }

    public void handleLifecycleEvent(@NotNull Event lifecycle$Event0) {
        Intrinsics.checkNotNullParameter(lifecycle$Event0, "event");
        this.b("handleLifecycleEvent");
        this.c(lifecycle$Event0.getTargetState());
    }

    @MainThread
    @Deprecated(message = "Override [currentState].")
    public void markState(@NotNull State lifecycle$State0) {
        Intrinsics.checkNotNullParameter(lifecycle$State0, "state");
        this.b("markState");
        this.setCurrentState(lifecycle$State0);
    }

    @JvmStatic
    @NotNull
    public static final State min$lifecycle_runtime_release(@NotNull State lifecycle$State0, @Nullable State lifecycle$State1) {
        return LifecycleRegistry.Companion.min$lifecycle_runtime_release(lifecycle$State0, lifecycle$State1);
    }

    @Override  // androidx.lifecycle.Lifecycle
    public void removeObserver(@NotNull LifecycleObserver lifecycleObserver0) {
        Intrinsics.checkNotNullParameter(lifecycleObserver0, "observer");
        this.b("removeObserver");
        this.c.remove(lifecycleObserver0);
    }

    public void setCurrentState(@NotNull State lifecycle$State0) {
        Intrinsics.checkNotNullParameter(lifecycle$State0, "state");
        this.b("setCurrentState");
        this.c(lifecycle$State0);
    }
}

