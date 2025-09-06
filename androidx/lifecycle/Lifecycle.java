package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.platform.t1;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0002\u001C\u001DB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\'¢\u0006\u0004\b\t\u0010\bRR\u0010\u0013\u001A\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u000B2\u001A\u0010\f\u001A\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u000B8G@GX\u0087\u000E¢\u0006\u0012\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001A\u00020\u00148gX¦\u0004¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u0016R\u001A\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00140\u00188VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u001A¨\u0006\u001E"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "", "<init>", "()V", "Landroidx/lifecycle/LifecycleObserver;", "observer", "", "addObserver", "(Landroidx/lifecycle/LifecycleObserver;)V", "removeObserver", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/lifecycle/AtomicReference;", "<set-?>", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "getInternalScopeRef", "()Ljava/util/concurrent/atomic/AtomicReference;", "setInternalScopeRef", "(Ljava/util/concurrent/atomic/AtomicReference;)V", "internalScopeRef", "Landroidx/lifecycle/Lifecycle$State;", "getCurrentState", "()Landroidx/lifecycle/Lifecycle$State;", "currentState", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "currentStateFlow", "Event", "State", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lifecycle.kt\nandroidx/lifecycle/Lifecycle\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,390:1\n1#2:391\n*E\n"})
public abstract class Lifecycle {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0011\u0010\u0005\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000Bj\u0002\b\fj\u0002\b\r¨\u0006\u000E"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event;", "", "Landroidx/lifecycle/Lifecycle$State;", "getTargetState", "()Landroidx/lifecycle/Lifecycle$State;", "targetState", "Companion", "ON_CREATE", "ON_START", "ON_RESUME", "ON_PAUSE", "ON_STOP", "ON_DESTROY", "ON_ANY", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static enum Event {
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\t\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event$Companion;", "", "Landroidx/lifecycle/Lifecycle$State;", "state", "Landroidx/lifecycle/Lifecycle$Event;", "downFrom", "(Landroidx/lifecycle/Lifecycle$State;)Landroidx/lifecycle/Lifecycle$Event;", "downTo", "upFrom", "upTo", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Companion {
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
            public final class WhenMappings {
                public static final int[] $EnumSwitchMapping$0;

                static {
                    int[] arr_v = new int[State.values().length];
                    try {
                        arr_v[State.CREATED.ordinal()] = 1;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[State.STARTED.ordinal()] = 2;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[State.RESUMED.ordinal()] = 3;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[State.DESTROYED.ordinal()] = 4;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[State.INITIALIZED.ordinal()] = 5;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    WhenMappings.$EnumSwitchMapping$0 = arr_v;
                }
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @JvmStatic
            @Nullable
            public final Event downFrom(@NotNull State lifecycle$State0) {
                Intrinsics.checkNotNullParameter(lifecycle$State0, "state");
                switch(WhenMappings.$EnumSwitchMapping$0[lifecycle$State0.ordinal()]) {
                    case 1: {
                        return Event.ON_DESTROY;
                    }
                    case 2: {
                        return Event.ON_STOP;
                    }
                    case 3: {
                        return Event.ON_PAUSE;
                    }
                    default: {
                        return null;
                    }
                }
            }

            @JvmStatic
            @Nullable
            public final Event downTo(@NotNull State lifecycle$State0) {
                Intrinsics.checkNotNullParameter(lifecycle$State0, "state");
                switch(WhenMappings.$EnumSwitchMapping$0[lifecycle$State0.ordinal()]) {
                    case 1: {
                        return Event.ON_STOP;
                    }
                    case 2: {
                        return Event.ON_PAUSE;
                    }
                    case 4: {
                        return Event.ON_DESTROY;
                    }
                    default: {
                        return null;
                    }
                }
            }

            @JvmStatic
            @Nullable
            public final Event upFrom(@NotNull State lifecycle$State0) {
                Intrinsics.checkNotNullParameter(lifecycle$State0, "state");
                switch(WhenMappings.$EnumSwitchMapping$0[lifecycle$State0.ordinal()]) {
                    case 1: {
                        return Event.ON_START;
                    }
                    case 2: {
                        return Event.ON_RESUME;
                    }
                    case 5: {
                        return Event.ON_CREATE;
                    }
                    default: {
                        return null;
                    }
                }
            }

            @JvmStatic
            @Nullable
            public final Event upTo(@NotNull State lifecycle$State0) {
                Intrinsics.checkNotNullParameter(lifecycle$State0, "state");
                switch(WhenMappings.$EnumSwitchMapping$0[lifecycle$State0.ordinal()]) {
                    case 1: {
                        return Event.ON_CREATE;
                    }
                    case 2: {
                        return Event.ON_START;
                    }
                    case 3: {
                        return Event.ON_RESUME;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
        public final class androidx.lifecycle.Lifecycle.Event.WhenMappings {
            public static final int[] $EnumSwitchMapping$0;

            static {
                int[] arr_v = new int[Event.values().length];
                try {
                    arr_v[Event.ON_CREATE.ordinal()] = 1;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[Event.ON_STOP.ordinal()] = 2;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[Event.ON_START.ordinal()] = 3;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[Event.ON_PAUSE.ordinal()] = 4;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[Event.ON_RESUME.ordinal()] = 5;
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
                androidx.lifecycle.Lifecycle.Event.WhenMappings.$EnumSwitchMapping$0 = arr_v;
            }
        }

        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        @NotNull
        public static final Companion Companion;

        static {
            Event.Companion = new Companion(null);
        }

        @JvmStatic
        @Nullable
        public static final Event downFrom(@NotNull State lifecycle$State0) {
            return Event.Companion.downFrom(lifecycle$State0);
        }

        @JvmStatic
        @Nullable
        public static final Event downTo(@NotNull State lifecycle$State0) {
            return Event.Companion.downTo(lifecycle$State0);
        }

        @NotNull
        public final State getTargetState() {
            switch(androidx.lifecycle.Lifecycle.Event.WhenMappings.$EnumSwitchMapping$0[this.ordinal()]) {
                case 1: 
                case 2: {
                    return State.CREATED;
                }
                case 3: 
                case 4: {
                    return State.STARTED;
                }
                case 5: {
                    return State.RESUMED;
                }
                case 6: {
                    return State.DESTROYED;
                }
                default: {
                    throw new IllegalArgumentException(this + " has no target state");
                }
            }
        }

        @JvmStatic
        @Nullable
        public static final Event upFrom(@NotNull State lifecycle$State0) {
            return Event.Companion.upFrom(lifecycle$State0);
        }

        @JvmStatic
        @Nullable
        public static final Event upTo(@NotNull State lifecycle$State0) {
            return Event.Companion.upTo(lifecycle$State0);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\u0015\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0002\u001A\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000B"}, d2 = {"Landroidx/lifecycle/Lifecycle$State;", "", "state", "", "isAtLeast", "(Landroidx/lifecycle/Lifecycle$State;)Z", "DESTROYED", "INITIALIZED", "CREATED", "STARTED", "RESUMED", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean isAtLeast(@NotNull State lifecycle$State0) {
            Intrinsics.checkNotNullParameter(lifecycle$State0, "state");
            return this.compareTo(lifecycle$State0) >= 0;
        }
    }

    public AtomicReference a;

    public Lifecycle() {
        this.a = new AtomicReference(null);
    }

    @MainThread
    public abstract void addObserver(@NotNull LifecycleObserver arg1);

    @MainThread
    @NotNull
    public abstract State getCurrentState();

    @NotNull
    public StateFlow getCurrentStateFlow() {
        MutableStateFlow mutableStateFlow0 = StateFlowKt.MutableStateFlow(this.getCurrentState());
        this.addObserver(new t1(mutableStateFlow0, 1));
        return FlowKt.asStateFlow(mutableStateFlow0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public final AtomicReference getInternalScopeRef() {
        return this.a;
    }

    @MainThread
    public abstract void removeObserver(@NotNull LifecycleObserver arg1);

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final void setInternalScopeRef(@NotNull AtomicReference atomicReference0) {
        Intrinsics.checkNotNullParameter(atomicReference0, "<set-?>");
        this.a = atomicReference0;
    }
}

