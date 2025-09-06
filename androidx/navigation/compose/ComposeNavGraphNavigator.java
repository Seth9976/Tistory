package androidx.navigation.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphNavigator;
import androidx.navigation.Navigator.Name;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Name("navigation")
@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001A\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Landroidx/navigation/compose/ComposeNavGraphNavigator;", "Landroidx/navigation/NavGraphNavigator;", "navigatorProvider", "Landroidx/navigation/NavigatorProvider;", "(Landroidx/navigation/NavigatorProvider;)V", "createDestination", "Landroidx/navigation/NavGraph;", "ComposeNavGraph", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ComposeNavGraphNavigator extends NavGraphNavigator {
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000E\u0010\u0003\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005RB\u0010\u0012\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006¢\u0006\u0002\b\n¢\u0006\u0002\b\u000B8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F\"\u0004\b\u0010\u0010\u0011RB\u0010\u0017\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0006¢\u0006\u0002\b\n¢\u0006\u0002\b\u000B8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0014\u0010\r\u001A\u0004\b\u0015\u0010\u000F\"\u0004\b\u0016\u0010\u0011RB\u0010\u001B\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006¢\u0006\u0002\b\n¢\u0006\u0002\b\u000B8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0018\u0010\r\u001A\u0004\b\u0019\u0010\u000F\"\u0004\b\u001A\u0010\u0011RB\u0010\u001F\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0006¢\u0006\u0002\b\n¢\u0006\u0002\b\u000B8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u001C\u0010\r\u001A\u0004\b\u001D\u0010\u000F\"\u0004\b\u001E\u0010\u0011RB\u0010$\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u0006¢\u0006\u0002\b\n¢\u0006\u0002\b\u000B8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b!\u0010\r\u001A\u0004\b\"\u0010\u000F\"\u0004\b#\u0010\u0011¨\u0006%"}, d2 = {"Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;", "Landroidx/navigation/NavGraph;", "Landroidx/navigation/Navigator;", "navGraphNavigator", "<init>", "(Landroidx/navigation/Navigator;)V", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation/NavBackStackEntry;", "Landroidx/compose/animation/EnterTransition;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ExtensionFunctionType;", "o", "Lkotlin/jvm/functions/Function1;", "getEnterTransition$navigation_compose_release", "()Lkotlin/jvm/functions/Function1;", "setEnterTransition$navigation_compose_release", "(Lkotlin/jvm/functions/Function1;)V", "enterTransition", "Landroidx/compose/animation/ExitTransition;", "p", "getExitTransition$navigation_compose_release", "setExitTransition$navigation_compose_release", "exitTransition", "q", "getPopEnterTransition$navigation_compose_release", "setPopEnterTransition$navigation_compose_release", "popEnterTransition", "r", "getPopExitTransition$navigation_compose_release", "setPopExitTransition$navigation_compose_release", "popExitTransition", "Landroidx/compose/animation/SizeTransform;", "s", "getSizeTransform$navigation_compose_release", "setSizeTransform$navigation_compose_release", "sizeTransform", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class ComposeNavGraph extends NavGraph {
        public static final int $stable = 8;
        public Function1 o;
        public Function1 p;
        public Function1 q;
        public Function1 r;
        public Function1 s;

        public ComposeNavGraph(@NotNull Navigator navigator0) {
            super(navigator0);
        }

        @Nullable
        public final Function1 getEnterTransition$navigation_compose_release() {
            return this.o;
        }

        @Nullable
        public final Function1 getExitTransition$navigation_compose_release() {
            return this.p;
        }

        @Nullable
        public final Function1 getPopEnterTransition$navigation_compose_release() {
            return this.q;
        }

        @Nullable
        public final Function1 getPopExitTransition$navigation_compose_release() {
            return this.r;
        }

        @Nullable
        public final Function1 getSizeTransform$navigation_compose_release() {
            return this.s;
        }

        public final void setEnterTransition$navigation_compose_release(@Nullable Function1 function10) {
            this.o = function10;
        }

        public final void setExitTransition$navigation_compose_release(@Nullable Function1 function10) {
            this.p = function10;
        }

        public final void setPopEnterTransition$navigation_compose_release(@Nullable Function1 function10) {
            this.q = function10;
        }

        public final void setPopExitTransition$navigation_compose_release(@Nullable Function1 function10) {
            this.r = function10;
        }

        public final void setSizeTransform$navigation_compose_release(@Nullable Function1 function10) {
            this.s = function10;
        }
    }

    public static final int $stable;

    public ComposeNavGraphNavigator(@NotNull NavigatorProvider navigatorProvider0) {
        super(navigatorProvider0);
    }

    @Override  // androidx.navigation.NavGraphNavigator
    public NavDestination createDestination() {
        return this.createDestination();
    }

    @Override  // androidx.navigation.NavGraphNavigator
    @NotNull
    public NavGraph createDestination() {
        return new ComposeNavGraph(this);
    }
}

