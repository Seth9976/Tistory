package androidx.navigation.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination.ClassType;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator.Extras;
import androidx.navigation.Navigator.Name;
import androidx.navigation.Navigator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Name("composable")
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\b\b\u0007\u0018\u0000 \'2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\'(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J1\u0010\r\u001A\u00020\f2\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\t\u001A\u0004\u0018\u00010\b2\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u001F\u0010\u0014\u001A\u00020\f2\u0006\u0010\u0011\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001A\u00020\f2\u0006\u0010\u0016\u001A\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001A\u00020\f2\u0006\u0010\u0016\u001A\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0018R \u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u00120\u001A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER \u0010$\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060!0 8@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\"\u0010#R\u001D\u0010&\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050 8F¢\u0006\u0006\u001A\u0004\b%\u0010#¨\u0006)"}, d2 = {"Landroidx/navigation/compose/ComposeNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/compose/ComposeNavigator$Destination;", "<init>", "()V", "", "Landroidx/navigation/NavBackStackEntry;", "entries", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "", "navigate", "(Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "createDestination", "()Landroidx/navigation/compose/ComposeNavigator$Destination;", "popUpTo", "", "savedState", "popBackStack", "(Landroidx/navigation/NavBackStackEntry;Z)V", "entry", "prepareForTransition", "(Landroidx/navigation/NavBackStackEntry;)V", "onTransitionComplete", "Landroidx/compose/runtime/MutableState;", "c", "Landroidx/compose/runtime/MutableState;", "isPop$navigation_compose_release", "()Landroidx/compose/runtime/MutableState;", "isPop", "Lkotlinx/coroutines/flow/StateFlow;", "", "getTransitionsInProgress$navigation_compose_release", "()Lkotlinx/coroutines/flow/StateFlow;", "transitionsInProgress", "getBackStack", "backStack", "Companion", "Destination", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nComposeNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeNavigator.kt\nandroidx/navigation/compose/ComposeNavigator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,140:1\n1855#2,2:141\n*S KotlinDebug\n*F\n+ 1 ComposeNavigator.kt\nandroidx/navigation/compose/ComposeNavigator\n*L\n55#1:141,2\n*E\n"})
public final class ComposeNavigator extends Navigator {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/compose/ComposeNavigator$Companion;", "", "", "NAME", "Ljava/lang/String;", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @StabilityInferred(parameters = 0)
    @ClassType(Composable.class)
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B8\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\'\u0010\u000B\u001A#\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0006\u00A2\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\b0\u0004\u00A2\u0006\u0002\b\t\u00A2\u0006\u0002\b\n\u00A2\u0006\u0004\b\f\u0010\rB/\b\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u001C\u0010\u000B\u001A\u0018\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\b\u00A2\u0006\u0002\b\u00070\u000E\u00A2\u0006\u0002\b\t\u00A2\u0006\u0004\b\f\u0010\u000FR;\u0010\u000B\u001A#\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0006\u00A2\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\b0\u0004\u00A2\u0006\u0002\b\t\u00A2\u0006\u0002\b\n8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013RB\u0010\u001C\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u000E\u00A2\u0006\u0002\b\u0007\u00A2\u0006\u0002\b\n8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\u001BRB\u0010!\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001D\u0018\u00010\u000E\u00A2\u0006\u0002\b\u0007\u00A2\u0006\u0002\b\n8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b\u001E\u0010\u0017\u001A\u0004\b\u001F\u0010\u0019\"\u0004\b \u0010\u001BRB\u0010%\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u000E\u00A2\u0006\u0002\b\u0007\u00A2\u0006\u0002\b\n8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b\"\u0010\u0017\u001A\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001BRB\u0010)\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001D\u0018\u00010\u000E\u00A2\u0006\u0002\b\u0007\u00A2\u0006\u0002\b\n8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b&\u0010\u0017\u001A\u0004\b\'\u0010\u0019\"\u0004\b(\u0010\u001BRB\u0010.\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\u0006\u0012\u0004\u0018\u00010*\u0018\u00010\u000E\u00A2\u0006\u0002\b\u0007\u00A2\u0006\u0002\b\n8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b+\u0010\u0017\u001A\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001B\u00A8\u0006/"}, d2 = {"Landroidx/navigation/compose/ComposeNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/compose/ComposeNavigator;", "navigator", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/navigation/NavBackStackEntry;", "Lkotlin/jvm/JvmSuppressWildcards;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "<init>", "(Landroidx/navigation/compose/ComposeNavigator;Lkotlin/jvm/functions/Function4;)V", "Lkotlin/Function1;", "(Landroidx/navigation/compose/ComposeNavigator;Lkotlin/jvm/functions/Function3;)V", "k", "Lkotlin/jvm/functions/Function4;", "getContent$navigation_compose_release", "()Lkotlin/jvm/functions/Function4;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/EnterTransition;", "l", "Lkotlin/jvm/functions/Function1;", "getEnterTransition$navigation_compose_release", "()Lkotlin/jvm/functions/Function1;", "setEnterTransition$navigation_compose_release", "(Lkotlin/jvm/functions/Function1;)V", "enterTransition", "Landroidx/compose/animation/ExitTransition;", "m", "getExitTransition$navigation_compose_release", "setExitTransition$navigation_compose_release", "exitTransition", "n", "getPopEnterTransition$navigation_compose_release", "setPopEnterTransition$navigation_compose_release", "popEnterTransition", "o", "getPopExitTransition$navigation_compose_release", "setPopExitTransition$navigation_compose_release", "popExitTransition", "Landroidx/compose/animation/SizeTransform;", "p", "getSizeTransform$navigation_compose_release", "setSizeTransform$navigation_compose_release", "sizeTransform", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Destination extends NavDestination {
        public static final int $stable = 8;
        public final Function4 k;
        public Function1 l;
        public Function1 m;
        public Function1 n;
        public Function1 o;
        public Function1 p;

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of Destination that supports AnimatedContent")
        public Destination(ComposeNavigator composeNavigator0, Function3 function30) {
            this(composeNavigator0, ComposableLambdaKt.composableLambdaInstance(1587956030, true, new a(function30)));
        }

        public Destination(@NotNull ComposeNavigator composeNavigator0, @NotNull Function4 function40) {
            super(composeNavigator0);
            this.k = function40;
        }

        @NotNull
        public final Function4 getContent$navigation_compose_release() {
            return this.k;
        }

        @Nullable
        public final Function1 getEnterTransition$navigation_compose_release() {
            return this.l;
        }

        @Nullable
        public final Function1 getExitTransition$navigation_compose_release() {
            return this.m;
        }

        @Nullable
        public final Function1 getPopEnterTransition$navigation_compose_release() {
            return this.n;
        }

        @Nullable
        public final Function1 getPopExitTransition$navigation_compose_release() {
            return this.o;
        }

        @Nullable
        public final Function1 getSizeTransform$navigation_compose_release() {
            return this.p;
        }

        public final void setEnterTransition$navigation_compose_release(@Nullable Function1 function10) {
            this.l = function10;
        }

        public final void setExitTransition$navigation_compose_release(@Nullable Function1 function10) {
            this.m = function10;
        }

        public final void setPopEnterTransition$navigation_compose_release(@Nullable Function1 function10) {
            this.n = function10;
        }

        public final void setPopExitTransition$navigation_compose_release(@Nullable Function1 function10) {
            this.o = function10;
        }

        public final void setSizeTransform$navigation_compose_release(@Nullable Function1 function10) {
            this.p = function10;
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public static final String NAME = "composable";
    public final MutableState c;

    static {
        ComposeNavigator.Companion = new Companion(null);
    }

    public ComposeNavigator() {
        this.c = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    @Override  // androidx.navigation.Navigator
    public NavDestination createDestination() {
        return this.createDestination();
    }

    @NotNull
    public Destination createDestination() {
        return new Destination(this, ComposableSingletons.ComposeNavigatorKt.INSTANCE.getLambda-1$navigation_compose_release());
    }

    @NotNull
    public final StateFlow getBackStack() {
        return this.getState().getBackStack();
    }

    @NotNull
    public final StateFlow getTransitionsInProgress$navigation_compose_release() {
        return this.getState().getTransitionsInProgress();
    }

    @NotNull
    public final MutableState isPop$navigation_compose_release() {
        return this.c;
    }

    @Override  // androidx.navigation.Navigator
    public void navigate(@NotNull List list0, @Nullable NavOptions navOptions0, @Nullable Extras navigator$Extras0) {
        for(Object object0: list0) {
            this.getState().pushWithTransition(((NavBackStackEntry)object0));
        }
        this.c.setValue(Boolean.FALSE);
    }

    public final void onTransitionComplete(@NotNull NavBackStackEntry navBackStackEntry0) {
        this.getState().markTransitionComplete(navBackStackEntry0);
    }

    @Override  // androidx.navigation.Navigator
    public void popBackStack(@NotNull NavBackStackEntry navBackStackEntry0, boolean z) {
        this.getState().popWithTransition(navBackStackEntry0, z);
        this.c.setValue(Boolean.TRUE);
    }

    public final void prepareForTransition(@NotNull NavBackStackEntry navBackStackEntry0) {
        this.getState().prepareForTransition(navBackStackEntry0);
    }
}

