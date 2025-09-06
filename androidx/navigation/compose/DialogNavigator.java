package androidx.navigation.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.window.DialogProperties;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination.ClassType;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator.Extras;
import androidx.navigation.Navigator.Name;
import androidx.navigation.Navigator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Name("dialog")
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001F2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001F B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\r\u001A\u00020\u0002H\u0016J\u0015\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u0007H\u0000¢\u0006\u0002\b\u0011J*\u0010\u0012\u001A\u00020\u000F2\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0014\u001A\u0004\u0018\u00010\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0017H\u0016J\u0015\u0010\u0018\u001A\u00020\u000F2\u0006\u0010\u0019\u001A\u00020\u0007H\u0000¢\u0006\u0002\b\u001AJ\u0018\u0010\u001B\u001A\u00020\u000F2\u0006\u0010\u001C\u001A\u00020\u00072\u0006\u0010\u001D\u001A\u00020\u001EH\u0016R \u0010\u0004\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00058@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\tR \u0010\n\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000B0\u00058@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\t¨\u0006!"}, d2 = {"Landroidx/navigation/compose/DialogNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/compose/DialogNavigator$Destination;", "()V", "backStack", "Lkotlinx/coroutines/flow/StateFlow;", "", "Landroidx/navigation/NavBackStackEntry;", "getBackStack$navigation_compose_release", "()Lkotlinx/coroutines/flow/StateFlow;", "transitionInProgress", "", "getTransitionInProgress$navigation_compose_release", "createDestination", "dismiss", "", "backStackEntry", "dismiss$navigation_compose_release", "navigate", "entries", "navOptions", "Landroidx/navigation/NavOptions;", "navigatorExtras", "Landroidx/navigation/Navigator$Extras;", "onTransitionComplete", "entry", "onTransitionComplete$navigation_compose_release", "popBackStack", "popUpTo", "savedState", "", "Companion", "Destination", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDialogNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogNavigator.kt\nandroidx/navigation/compose/DialogNavigator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n1855#2,2:90\n1864#2,3:92\n*S KotlinDebug\n*F\n+ 1 DialogNavigator.kt\nandroidx/navigation/compose/DialogNavigator\n*L\n55#1:90,2\n68#1:92,3\n*E\n"})
public final class DialogNavigator extends Navigator {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/compose/DialogNavigator$Companion;", "", "", "NAME", "Ljava/lang/String;", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @StabilityInferred(parameters = 1)
    @ClassType(Composable.class)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B2\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u0012\u0017\u0010\u000B\u001A\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\rR\u001A\u0010\u0006\u001A\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011R+\u0010\u000B\u001A\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/navigation/compose/DialogNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/FloatingWindow;", "Landroidx/navigation/compose/DialogNavigator;", "navigator", "Landroidx/compose/ui/window/DialogProperties;", "dialogProperties", "Lkotlin/Function1;", "Landroidx/navigation/NavBackStackEntry;", "", "Landroidx/compose/runtime/Composable;", "content", "<init>", "(Landroidx/navigation/compose/DialogNavigator;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;)V", "k", "Landroidx/compose/ui/window/DialogProperties;", "getDialogProperties$navigation_compose_release", "()Landroidx/compose/ui/window/DialogProperties;", "l", "Lkotlin/jvm/functions/Function3;", "getContent$navigation_compose_release", "()Lkotlin/jvm/functions/Function3;", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Destination extends NavDestination implements FloatingWindow {
        public static final int $stable;
        public final DialogProperties k;
        public final Function3 l;

        public Destination(@NotNull DialogNavigator dialogNavigator0, @NotNull DialogProperties dialogProperties0, @NotNull Function3 function30) {
            super(dialogNavigator0);
            this.k = dialogProperties0;
            this.l = function30;
        }

        public Destination(DialogNavigator dialogNavigator0, DialogProperties dialogProperties0, Function3 function30, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 2) != 0) {
                dialogProperties0 = new DialogProperties(false, false, false, 7, null);
            }
            this(dialogNavigator0, dialogProperties0, function30);
        }

        @NotNull
        public final Function3 getContent$navigation_compose_release() {
            return this.l;
        }

        @NotNull
        public final DialogProperties getDialogProperties$navigation_compose_release() {
            return this.k;
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public static final String NAME = "dialog";

    static {
        DialogNavigator.Companion = new Companion(null);
    }

    @Override  // androidx.navigation.Navigator
    public NavDestination createDestination() {
        return this.createDestination();
    }

    @NotNull
    public Destination createDestination() {
        return new Destination(this, null, ComposableSingletons.DialogNavigatorKt.INSTANCE.getLambda-1$navigation_compose_release(), 2, null);
    }

    public final void dismiss$navigation_compose_release(@NotNull NavBackStackEntry navBackStackEntry0) {
        this.popBackStack(navBackStackEntry0, false);
    }

    @NotNull
    public final StateFlow getBackStack$navigation_compose_release() {
        return this.getState().getBackStack();
    }

    @NotNull
    public final StateFlow getTransitionInProgress$navigation_compose_release() {
        return this.getState().getTransitionsInProgress();
    }

    @Override  // androidx.navigation.Navigator
    public void navigate(@NotNull List list0, @Nullable NavOptions navOptions0, @Nullable Extras navigator$Extras0) {
        for(Object object0: list0) {
            this.getState().push(((NavBackStackEntry)object0));
        }
    }

    public final void onTransitionComplete$navigation_compose_release(@NotNull NavBackStackEntry navBackStackEntry0) {
        this.getState().markTransitionComplete(navBackStackEntry0);
    }

    @Override  // androidx.navigation.Navigator
    public void popBackStack(@NotNull NavBackStackEntry navBackStackEntry0, boolean z) {
        this.getState().popWithTransition(navBackStackEntry0, z);
        int v = CollectionsKt___CollectionsKt.indexOf(((Iterable)this.getState().getTransitionsInProgress().getValue()), navBackStackEntry0);
        int v1 = 0;
        for(Object object0: ((Iterable)this.getState().getTransitionsInProgress().getValue())) {
            if(v1 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if(v1 > v) {
                this.onTransitionComplete$navigation_compose_release(((NavBackStackEntry)object0));
            }
            ++v1;
        }
    }
}

