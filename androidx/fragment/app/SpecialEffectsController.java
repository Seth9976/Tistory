package androidx.fragment.app;

import a5.b;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.CallSuper;
import androidx.core.os.CancellationSignal;
import androidx.core.view.ViewCompat;
import androidx.fragment.R.id;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\b \u0018\u0000 \'2\u00020\u0001:\u0003\'()B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001D\u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u000E\u0010\u000FJ\u0015\u0010\u0010\u001A\u00020\r2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001A\u00020\r2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0013\u001A\u00020\r2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0016\u001A\u00020\r2\u0006\u0010\u0015\u001A\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001A\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001A\u001A\u00020\r¢\u0006\u0004\b\u001A\u0010\u0019J\r\u0010\u001B\u001A\u00020\r¢\u0006\u0004\b\u001B\u0010\u0019J\r\u0010\u001C\u001A\u00020\r¢\u0006\u0004\b\u001C\u0010\u0019J*\u0010!\u001A\u00020\r2\u0011\u0010 \u001A\r\u0012\t\u0012\u00070\u001E¢\u0006\u0002\b\u001F0\u001D2\u0006\u0010\u0015\u001A\u00020\u0014H&¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&¨\u0006*"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController;", "", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "Landroidx/fragment/app/k1;", "fragmentStateManager", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "getAwaitingCompletionLifecycleImpact", "(Landroidx/fragment/app/k1;)Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "finalState", "", "enqueueAdd", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/k1;)V", "enqueueShow", "(Landroidx/fragment/app/k1;)V", "enqueueHide", "enqueueRemove", "", "isPop", "updateOperationDirection", "(Z)V", "markPostponedState", "()V", "forcePostponedExecutePendingOperations", "executePendingOperations", "forceCompleteAllOperations", "", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "Lkotlin/jvm/JvmSuppressWildcards;", "operations", "executeOperations", "(Ljava/util/List;Z)V", "a", "Landroid/view/ViewGroup;", "getContainer", "()Landroid/view/ViewGroup;", "Companion", "androidx/fragment/app/c2", "Operation", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,710:1\n288#2,2:711\n288#2,2:713\n533#2,6:715\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController\n*L\n69#1:711,2\n75#1:713,2\n166#1:715,6\n*E\n"})
public abstract class SpecialEffectsController {
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001F\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001F\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Companion;", "", "Landroid/view/ViewGroup;", "container", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/fragment/app/SpecialEffectsController;", "getOrCreateController", "(Landroid/view/ViewGroup;Landroidx/fragment/app/FragmentManager;)Landroidx/fragment/app/SpecialEffectsController;", "Landroidx/fragment/app/SpecialEffectsControllerFactory;", "factory", "(Landroid/view/ViewGroup;Landroidx/fragment/app/SpecialEffectsControllerFactory;)Landroidx/fragment/app/SpecialEffectsController;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final SpecialEffectsController getOrCreateController(@NotNull ViewGroup viewGroup0, @NotNull FragmentManager fragmentManager0) {
            Intrinsics.checkNotNullParameter(viewGroup0, "container");
            Intrinsics.checkNotNullParameter(fragmentManager0, "fragmentManager");
            SpecialEffectsControllerFactory specialEffectsControllerFactory0 = fragmentManager0.C();
            Intrinsics.checkNotNullExpressionValue(specialEffectsControllerFactory0, "fragmentManager.specialEffectsControllerFactory");
            return this.getOrCreateController(viewGroup0, specialEffectsControllerFactory0);
        }

        @JvmStatic
        @NotNull
        public final SpecialEffectsController getOrCreateController(@NotNull ViewGroup viewGroup0, @NotNull SpecialEffectsControllerFactory specialEffectsControllerFactory0) {
            Intrinsics.checkNotNullParameter(viewGroup0, "container");
            Intrinsics.checkNotNullParameter(specialEffectsControllerFactory0, "factory");
            Object object0 = viewGroup0.getTag(id.special_effects_controller_view_tag);
            if(object0 instanceof SpecialEffectsController) {
                return (SpecialEffectsController)object0;
            }
            SpecialEffectsController specialEffectsController0 = specialEffectsControllerFactory0.createController(viewGroup0);
            Intrinsics.checkNotNullExpressionValue(specialEffectsController0, "factory.createController(container)");
            viewGroup0.setTag(id.special_effects_controller_view_tag, specialEffectsController0);
            return specialEffectsController0;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000B\n\u0002\b\n\b\u0010\u0018\u00002\u00020\u0001:\u000267B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\r\u0010\u0010\u001A\u00020\u000F¢\u0006\u0004\b\u0010\u0010\u0011J\u001D\u0010\u0012\u001A\u00020\u000F2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001A\u00020\u000F2\u0006\u0010\u0015\u001A\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0018\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0018\u0010\u0011J\u0015\u0010\u001A\u001A\u00020\u000F2\u0006\u0010\u0019\u001A\u00020\b¢\u0006\u0004\b\u001A\u0010\u001BJ\u0015\u0010\u001C\u001A\u00020\u000F2\u0006\u0010\u0019\u001A\u00020\b¢\u0006\u0004\b\u001C\u0010\u001BJ\u000F\u0010\u001D\u001A\u00020\u000FH\u0017¢\u0006\u0004\b\u001D\u0010\u0011R\"\u0010\u0003\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u0005\u001A\u00020\u00048\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-R$\u00102\u001A\u00020.2\u0006\u0010/\u001A\u00020.8\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u00103R$\u00105\u001A\u00020.2\u0006\u0010/\u001A\u00020.8\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b4\u00101\u001A\u0004\b5\u00103¨\u00068"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation;", "", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "finalState", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "lifecycleImpact", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "<init>", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/Fragment;Landroidx/core/os/CancellationSignal;)V", "", "toString", "()Ljava/lang/String;", "", "cancel", "()V", "mergeWith", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;)V", "Ljava/lang/Runnable;", "listener", "addCompletionListener", "(Ljava/lang/Runnable;)V", "onStart", "signal", "markStartedSpecialEffect", "(Landroidx/core/os/CancellationSignal;)V", "completeSpecialEffect", "complete", "a", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "getFinalState", "()Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "setFinalState", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;)V", "b", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "getLifecycleImpact", "()Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "setLifecycleImpact", "(Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;)V", "c", "Landroidx/fragment/app/Fragment;", "getFragment", "()Landroidx/fragment/app/Fragment;", "", "<set-?>", "f", "Z", "isCanceled", "()Z", "g", "isComplete", "LifecycleImpact", "State", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,710:1\n1855#2,2:711\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n*L\n607#1:711,2\n*E\n"})
    public static class Operation {
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "", "NONE", "ADDING", "REMOVING", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING;

        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0080\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000B¨\u0006\f"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "", "Landroid/view/View;", "view", "", "applyState", "(Landroid/view/View;)V", "Companion", "REMOVED", "VISIBLE", "GONE", "INVISIBLE", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static enum State {
            @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0011\u0010\u0004\u001A\u00020\u0003*\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$State$Companion;", "", "Landroid/view/View;", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "asOperationState", "(Landroid/view/View;)Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "", "visibility", "from", "(I)Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
            public static final class androidx.fragment.app.SpecialEffectsController.Operation.State.Companion {
                public androidx.fragment.app.SpecialEffectsController.Operation.State.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
                }

                @NotNull
                public final State asOperationState(@NotNull View view0) {
                    Intrinsics.checkNotNullParameter(view0, "<this>");
                    return view0.getAlpha() != 0.0f || view0.getVisibility() != 0 ? this.from(view0.getVisibility()) : State.INVISIBLE;
                }

                @JvmStatic
                @NotNull
                public final State from(int v) {
                    switch(v) {
                        case 0: {
                            return State.VISIBLE;
                        }
                        case 4: {
                            return State.INVISIBLE;
                        }
                        case 8: {
                            return State.GONE;
                        }
                        default: {
                            throw new IllegalArgumentException("Unknown visibility " + v);
                        }
                    }
                }
            }

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
            public final class WhenMappings {
                public static final int[] $EnumSwitchMapping$0;

                static {
                    int[] arr_v = new int[State.values().length];
                    try {
                        arr_v[State.REMOVED.ordinal()] = 1;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[State.VISIBLE.ordinal()] = 2;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[State.GONE.ordinal()] = 3;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[State.INVISIBLE.ordinal()] = 4;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    WhenMappings.$EnumSwitchMapping$0 = arr_v;
                }
            }

            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            @NotNull
            public static final androidx.fragment.app.SpecialEffectsController.Operation.State.Companion Companion;

            static {
                State.Companion = new androidx.fragment.app.SpecialEffectsController.Operation.State.Companion(null);
            }

            public final void applyState(@NotNull View view0) {
                Intrinsics.checkNotNullParameter(view0, "view");
                switch(WhenMappings.$EnumSwitchMapping$0[this.ordinal()]) {
                    case 1: {
                        ViewParent viewParent0 = view0.getParent();
                        ViewGroup viewGroup0 = viewParent0 instanceof ViewGroup ? ((ViewGroup)viewParent0) : null;
                        if(viewGroup0 != null) {
                            if(FragmentManager.isLoggingEnabled(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view0 + " from container " + viewGroup0);
                            }
                            viewGroup0.removeView(view0);
                        }
                        return;
                    }
                    case 2: {
                        if(FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view0 + " to VISIBLE");
                        }
                        view0.setVisibility(0);
                        return;
                    }
                    case 3: {
                        if(FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view0 + " to GONE");
                        }
                        view0.setVisibility(8);
                        return;
                    }
                    case 4: {
                        if(FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view0 + " to INVISIBLE");
                        }
                        view0.setVisibility(4);
                    }
                }
            }

            @JvmStatic
            @NotNull
            public static final State from(int v) {
                return State.Companion.from(v);
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
        public final class androidx.fragment.app.SpecialEffectsController.Operation.WhenMappings {
            public static final int[] $EnumSwitchMapping$0;

            static {
                int[] arr_v = new int[LifecycleImpact.values().length];
                try {
                    arr_v[LifecycleImpact.ADDING.ordinal()] = 1;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[LifecycleImpact.REMOVING.ordinal()] = 2;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[LifecycleImpact.NONE.ordinal()] = 3;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                androidx.fragment.app.SpecialEffectsController.Operation.WhenMappings.$EnumSwitchMapping$0 = arr_v;
            }
        }

        public State a;
        public LifecycleImpact b;
        public final Fragment c;
        public final ArrayList d;
        public final LinkedHashSet e;
        public boolean f;
        public boolean g;

        public Operation(@NotNull State specialEffectsController$Operation$State0, @NotNull LifecycleImpact specialEffectsController$Operation$LifecycleImpact0, @NotNull Fragment fragment0, @NotNull CancellationSignal cancellationSignal0) {
            Intrinsics.checkNotNullParameter(specialEffectsController$Operation$State0, "finalState");
            Intrinsics.checkNotNullParameter(specialEffectsController$Operation$LifecycleImpact0, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragment0, "fragment");
            Intrinsics.checkNotNullParameter(cancellationSignal0, "cancellationSignal");
            super();
            this.a = specialEffectsController$Operation$State0;
            this.b = specialEffectsController$Operation$LifecycleImpact0;
            this.c = fragment0;
            this.d = new ArrayList();
            this.e = new LinkedHashSet();
            cancellationSignal0.setOnCancelListener(new j0(this));
        }

        public final void addCompletionListener(@NotNull Runnable runnable0) {
            Intrinsics.checkNotNullParameter(runnable0, "listener");
            this.d.add(runnable0);
        }

        public final void cancel() {
            if(this.f) {
                return;
            }
            this.f = true;
            LinkedHashSet linkedHashSet0 = this.e;
            if(linkedHashSet0.isEmpty()) {
                this.complete();
                return;
            }
            for(Object object0: CollectionsKt___CollectionsKt.toMutableSet(linkedHashSet0)) {
                ((CancellationSignal)object0).cancel();
            }
        }

        @CallSuper
        public void complete() {
            if(this.g) {
                return;
            }
            if(FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.g = true;
            for(Object object0: this.d) {
                ((Runnable)object0).run();
            }
        }

        public final void completeSpecialEffect(@NotNull CancellationSignal cancellationSignal0) {
            Intrinsics.checkNotNullParameter(cancellationSignal0, "signal");
            if(this.e.remove(cancellationSignal0) && this.e.isEmpty()) {
                this.complete();
            }
        }

        @NotNull
        public final State getFinalState() {
            return this.a;
        }

        @NotNull
        public final Fragment getFragment() {
            return this.c;
        }

        @NotNull
        public final LifecycleImpact getLifecycleImpact() {
            return this.b;
        }

        public final boolean isCanceled() {
            return this.f;
        }

        public final boolean isComplete() {
            return this.g;
        }

        public final void markStartedSpecialEffect(@NotNull CancellationSignal cancellationSignal0) {
            Intrinsics.checkNotNullParameter(cancellationSignal0, "signal");
            this.onStart();
            this.e.add(cancellationSignal0);
        }

        public final void mergeWith(@NotNull State specialEffectsController$Operation$State0, @NotNull LifecycleImpact specialEffectsController$Operation$LifecycleImpact0) {
            Intrinsics.checkNotNullParameter(specialEffectsController$Operation$State0, "finalState");
            Intrinsics.checkNotNullParameter(specialEffectsController$Operation$LifecycleImpact0, "lifecycleImpact");
            Fragment fragment0 = this.c;
            switch(androidx.fragment.app.SpecialEffectsController.Operation.WhenMappings.$EnumSwitchMapping$0[specialEffectsController$Operation$LifecycleImpact0.ordinal()]) {
                case 1: {
                    if(this.a == State.REMOVED) {
                        if(FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment0 + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.b + " to ADDING.");
                        }
                        this.a = State.VISIBLE;
                        this.b = LifecycleImpact.ADDING;
                        return;
                    }
                    break;
                }
                case 2: {
                    if(FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment0 + " mFinalState = " + this.a + " -> REMOVED. mLifecycleImpact  = " + this.b + " to REMOVING.");
                    }
                    this.a = State.REMOVED;
                    this.b = LifecycleImpact.REMOVING;
                    return;
                }
                case 3: {
                    if(this.a != State.REMOVED) {
                        if(FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment0 + " mFinalState = " + this.a + " -> " + specialEffectsController$Operation$State0 + '.');
                        }
                        this.a = specialEffectsController$Operation$State0;
                        return;
                    }
                    break;
                }
            }
        }

        public void onStart() {
        }

        public final void setFinalState(@NotNull State specialEffectsController$Operation$State0) {
            Intrinsics.checkNotNullParameter(specialEffectsController$Operation$State0, "<set-?>");
            this.a = specialEffectsController$Operation$State0;
        }

        public final void setLifecycleImpact(@NotNull LifecycleImpact specialEffectsController$Operation$LifecycleImpact0) {
            Intrinsics.checkNotNullParameter(specialEffectsController$Operation$LifecycleImpact0, "<set-?>");
            this.b = specialEffectsController$Operation$LifecycleImpact0;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = b.v("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
            stringBuilder0.append(this.a);
            stringBuilder0.append(" lifecycleImpact = ");
            stringBuilder0.append(this.b);
            stringBuilder0.append(" fragment = ");
            stringBuilder0.append(this.c);
            stringBuilder0.append('}');
            return stringBuilder0.toString();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class androidx.fragment.app.SpecialEffectsController.WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[LifecycleImpact.values().length];
            try {
                arr_v[LifecycleImpact.NONE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            androidx.fragment.app.SpecialEffectsController.WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;

    static {
        SpecialEffectsController.Companion = new Companion(null);
    }

    public SpecialEffectsController(@NotNull ViewGroup viewGroup0) {
        Intrinsics.checkNotNullParameter(viewGroup0, "container");
        super();
        this.a = viewGroup0;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final void a(State specialEffectsController$Operation$State0, LifecycleImpact specialEffectsController$Operation$LifecycleImpact0, k1 k10) {
        synchronized(this.b) {
            CancellationSignal cancellationSignal0 = new CancellationSignal();
            Intrinsics.checkNotNullExpressionValue(k10.c, "fragmentStateManager.fragment");
            Operation specialEffectsController$Operation0 = this.b(k10.c);
            if(specialEffectsController$Operation0 != null) {
                specialEffectsController$Operation0.mergeWith(specialEffectsController$Operation$State0, specialEffectsController$Operation$LifecycleImpact0);
                return;
            }
            c2 c20 = new c2(specialEffectsController$Operation$State0, specialEffectsController$Operation$LifecycleImpact0, k10, cancellationSignal0);
            this.b.add(c20);
            c20.addCompletionListener(new b2(this, c20, 0));
            c20.addCompletionListener(new b2(this, c20, 1));
        }
    }

    public final Operation b(Fragment fragment0) {
        for(Object object0: this.b) {
            if(Intrinsics.areEqual(((Operation)object0).getFragment(), fragment0) && !((Operation)object0).isCanceled()) {
                return (Operation)object0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final void c() {
        for(Object object0: this.b) {
            Operation specialEffectsController$Operation0 = (Operation)object0;
            if(specialEffectsController$Operation0.getLifecycleImpact() == LifecycleImpact.ADDING) {
                View view0 = specialEffectsController$Operation0.getFragment().requireView();
                Intrinsics.checkNotNullExpressionValue(view0, "fragment.requireView()");
                int v = view0.getVisibility();
                specialEffectsController$Operation0.mergeWith(State.Companion.from(v), LifecycleImpact.NONE);
            }
        }
    }

    public final void enqueueAdd(@NotNull State specialEffectsController$Operation$State0, @NotNull k1 k10) {
        Intrinsics.checkNotNullParameter(specialEffectsController$Operation$State0, "finalState");
        Intrinsics.checkNotNullParameter(k10, "fragmentStateManager");
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + k10.c);
        }
        this.a(specialEffectsController$Operation$State0, LifecycleImpact.ADDING, k10);
    }

    public final void enqueueHide(@NotNull k1 k10) {
        Intrinsics.checkNotNullParameter(k10, "fragmentStateManager");
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + k10.c);
        }
        this.a(State.GONE, LifecycleImpact.NONE, k10);
    }

    public final void enqueueRemove(@NotNull k1 k10) {
        Intrinsics.checkNotNullParameter(k10, "fragmentStateManager");
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + k10.c);
        }
        this.a(State.REMOVED, LifecycleImpact.REMOVING, k10);
    }

    public final void enqueueShow(@NotNull k1 k10) {
        Intrinsics.checkNotNullParameter(k10, "fragmentStateManager");
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + k10.c);
        }
        this.a(State.VISIBLE, LifecycleImpact.NONE, k10);
    }

    public abstract void executeOperations(@NotNull List arg1, boolean arg2);

    public final void executePendingOperations() {
        if(this.e) {
            return;
        }
        if(!ViewCompat.isAttachedToWindow(this.a)) {
            this.forceCompleteAllOperations();
            this.d = false;
            return;
        }
        synchronized(this.b) {
            if(!this.b.isEmpty()) {
                List list0 = CollectionsKt___CollectionsKt.toMutableList(this.c);
                this.c.clear();
                for(Object object0: list0) {
                    Operation specialEffectsController$Operation0 = (Operation)object0;
                    if(FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + specialEffectsController$Operation0);
                    }
                    specialEffectsController$Operation0.cancel();
                    if(!specialEffectsController$Operation0.isComplete()) {
                        this.c.add(specialEffectsController$Operation0);
                    }
                }
                this.c();
                List list1 = CollectionsKt___CollectionsKt.toMutableList(this.b);
                this.b.clear();
                this.c.addAll(list1);
                if(FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                }
                for(Object object1: list1) {
                    ((Operation)object1).onStart();
                }
                this.executeOperations(list1, this.d);
                this.d = false;
                if(FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                }
            }
        }
    }

    public final void forceCompleteAllOperations() {
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean z = ViewCompat.isAttachedToWindow(this.a);
        synchronized(this.b) {
            this.c();
            for(Object object0: this.b) {
                ((Operation)object0).onStart();
            }
            for(Object object1: CollectionsKt___CollectionsKt.toMutableList(this.c)) {
                Operation specialEffectsController$Operation0 = (Operation)object1;
                if(FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + (z ? "" : "Container " + this.a + " is not attached to window. ") + "Cancelling running operation " + specialEffectsController$Operation0);
                }
                specialEffectsController$Operation0.cancel();
            }
            for(Object object2: CollectionsKt___CollectionsKt.toMutableList(this.b)) {
                Operation specialEffectsController$Operation1 = (Operation)object2;
                if(FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + (z ? "" : "Container " + this.a + " is not attached to window. ") + "Cancelling pending operation " + specialEffectsController$Operation1);
                }
                specialEffectsController$Operation1.cancel();
            }
        }
    }

    public final void forcePostponedExecutePendingOperations() {
        if(this.e) {
            if(FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.e = false;
            this.executePendingOperations();
        }
    }

    @Nullable
    public final LifecycleImpact getAwaitingCompletionLifecycleImpact(@NotNull k1 k10) {
        Object object0 = null;
        Intrinsics.checkNotNullParameter(k10, "fragmentStateManager");
        Fragment fragment0 = k10.c;
        Intrinsics.checkNotNullExpressionValue(fragment0, "fragmentStateManager.fragment");
        Operation specialEffectsController$Operation0 = this.b(fragment0);
        LifecycleImpact specialEffectsController$Operation$LifecycleImpact0 = null;
        LifecycleImpact specialEffectsController$Operation$LifecycleImpact1 = specialEffectsController$Operation0 == null ? null : specialEffectsController$Operation0.getLifecycleImpact();
        for(Object object1: this.c) {
            if(Intrinsics.areEqual(((Operation)object1).getFragment(), fragment0) && !((Operation)object1).isCanceled()) {
                object0 = object1;
                break;
            }
        }
        if(((Operation)object0) != null) {
            specialEffectsController$Operation$LifecycleImpact0 = ((Operation)object0).getLifecycleImpact();
        }
        int v = specialEffectsController$Operation$LifecycleImpact1 == null ? -1 : androidx.fragment.app.SpecialEffectsController.WhenMappings.$EnumSwitchMapping$0[specialEffectsController$Operation$LifecycleImpact1.ordinal()];
        return v != -1 && v != 1 ? specialEffectsController$Operation$LifecycleImpact1 : specialEffectsController$Operation$LifecycleImpact0;
    }

    @NotNull
    public final ViewGroup getContainer() {
        return this.a;
    }

    @JvmStatic
    @NotNull
    public static final SpecialEffectsController getOrCreateController(@NotNull ViewGroup viewGroup0, @NotNull FragmentManager fragmentManager0) {
        return SpecialEffectsController.Companion.getOrCreateController(viewGroup0, fragmentManager0);
    }

    @JvmStatic
    @NotNull
    public static final SpecialEffectsController getOrCreateController(@NotNull ViewGroup viewGroup0, @NotNull SpecialEffectsControllerFactory specialEffectsControllerFactory0) {
        return SpecialEffectsController.Companion.getOrCreateController(viewGroup0, specialEffectsControllerFactory0);
    }

    public final void markPostponedState() {
        Object object0;
        Fragment fragment0;
        synchronized(this.b) {
            this.c();
            ListIterator listIterator0 = this.b.listIterator(this.b.size());
            do {
                fragment0 = null;
                if(!listIterator0.hasPrevious()) {
                    goto label_13;
                }
                object0 = listIterator0.previous();
                View view0 = ((Operation)object0).getFragment().mView;
                Intrinsics.checkNotNullExpressionValue(view0, "operation.fragment.mView");
                State specialEffectsController$Operation$State0 = State.Companion.asOperationState(view0);
            }
            while(((Operation)object0).getFinalState() != State.VISIBLE || specialEffectsController$Operation$State0 == State.VISIBLE);
            goto label_14;
        label_13:
            object0 = null;
        label_14:
            if(((Operation)object0) != null) {
                fragment0 = ((Operation)object0).getFragment();
            }
            this.e = fragment0 == null ? false : fragment0.isPostponed();
        }
    }

    public final void updateOperationDirection(boolean z) {
        this.d = z;
    }
}

