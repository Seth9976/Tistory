package androidx.navigation.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavDestination;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.NavDestinationDsl;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@NavDestinationDsl
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\"\u0010\r\u001A\u001E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007\u00A2\u0006\u0002\b\u000B\u00A2\u0006\u0002\b\f\u00A2\u0006\u0004\b\u000E\u0010\u000FB^\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\n\u0010\u0006\u001A\u0006\u0012\u0002\b\u00030\u0010\u0012\u001B\u0010\u0015\u001A\u0017\u0012\u0004\u0012\u00020\u0012\u0012\r\u0012\u000B\u0012\u0002\b\u00030\u0013\u00A2\u0006\u0002\b\u00140\u0011\u0012\"\u0010\r\u001A\u001E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007\u00A2\u0006\u0002\b\u000B\u00A2\u0006\u0002\b\f\u00A2\u0006\u0004\b\u000E\u0010\u0016J\u000F\u0010\u0017\u001A\u00020\u0002H\u0014\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u0019\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u0019\u0010\u0018RB\u0010#\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001B\u0012\u0006\u0012\u0004\u0018\u00010\u001C\u0018\u00010\u001A\u00A2\u0006\u0002\b\u0014\u00A2\u0006\u0002\b\f8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 \"\u0004\b!\u0010\"RB\u0010(\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001B\u0012\u0006\u0012\u0004\u0018\u00010$\u0018\u00010\u001A\u00A2\u0006\u0002\b\u0014\u00A2\u0006\u0002\b\f8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b%\u0010\u001E\u001A\u0004\b&\u0010 \"\u0004\b\'\u0010\"RB\u0010,\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001B\u0012\u0006\u0012\u0004\u0018\u00010\u001C\u0018\u00010\u001A\u00A2\u0006\u0002\b\u0014\u00A2\u0006\u0002\b\f8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b)\u0010\u001E\u001A\u0004\b*\u0010 \"\u0004\b+\u0010\"RB\u00100\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001B\u0012\u0006\u0012\u0004\u0018\u00010$\u0018\u00010\u001A\u00A2\u0006\u0002\b\u0014\u00A2\u0006\u0002\b\f8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b-\u0010\u001E\u001A\u0004\b.\u0010 \"\u0004\b/\u0010\"RB\u00105\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001B\u0012\u0006\u0012\u0004\u0018\u000101\u0018\u00010\u001A\u00A2\u0006\u0002\b\u0014\u00A2\u0006\u0002\b\f8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b2\u0010\u001E\u001A\u0004\b3\u0010 \"\u0004\b4\u0010\"\u00A8\u00066"}, d2 = {"Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/compose/ComposeNavigator$Destination;", "Landroidx/navigation/compose/ComposeNavigator;", "navigator", "", "route", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/navigation/NavBackStackEntry;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "<init>", "(Landroidx/navigation/compose/ComposeNavigator;Ljava/lang/String;Lkotlin/jvm/functions/Function4;)V", "Lkotlin/reflect/KClass;", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "typeMap", "(Landroidx/navigation/compose/ComposeNavigator;Lkotlin/reflect/KClass;Ljava/util/Map;Lkotlin/jvm/functions/Function4;)V", "instantiateDestination", "()Landroidx/navigation/compose/ComposeNavigator$Destination;", "build", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/EnterTransition;", "k", "Lkotlin/jvm/functions/Function1;", "getEnterTransition", "()Lkotlin/jvm/functions/Function1;", "setEnterTransition", "(Lkotlin/jvm/functions/Function1;)V", "enterTransition", "Landroidx/compose/animation/ExitTransition;", "l", "getExitTransition", "setExitTransition", "exitTransition", "m", "getPopEnterTransition", "setPopEnterTransition", "popEnterTransition", "n", "getPopExitTransition", "setPopExitTransition", "popExitTransition", "Landroidx/compose/animation/SizeTransform;", "o", "getSizeTransform", "setSizeTransform", "sizeTransform", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ComposeNavigatorDestinationBuilder extends NavDestinationBuilder {
    public static final int $stable = 8;
    public final ComposeNavigator i;
    public final Function4 j;
    public Function1 k;
    public Function1 l;
    public Function1 m;
    public Function1 n;
    public Function1 o;

    public ComposeNavigatorDestinationBuilder(@NotNull ComposeNavigator composeNavigator0, @NotNull String s, @NotNull Function4 function40) {
        super(composeNavigator0, s);
        this.i = composeNavigator0;
        this.j = function40;
    }

    public ComposeNavigatorDestinationBuilder(@NotNull ComposeNavigator composeNavigator0, @NotNull KClass kClass0, @NotNull Map map0, @NotNull Function4 function40) {
        super(composeNavigator0, kClass0, map0);
        this.i = composeNavigator0;
        this.j = function40;
    }

    @Override  // androidx.navigation.NavDestinationBuilder
    public NavDestination build() {
        return this.build();
    }

    @NotNull
    public Destination build() {
        Destination composeNavigator$Destination0 = (Destination)super.build();
        composeNavigator$Destination0.setEnterTransition$navigation_compose_release(this.k);
        composeNavigator$Destination0.setExitTransition$navigation_compose_release(this.l);
        composeNavigator$Destination0.setPopEnterTransition$navigation_compose_release(this.m);
        composeNavigator$Destination0.setPopExitTransition$navigation_compose_release(this.n);
        composeNavigator$Destination0.setSizeTransform$navigation_compose_release(this.o);
        return composeNavigator$Destination0;
    }

    @Nullable
    public final Function1 getEnterTransition() {
        return this.k;
    }

    @Nullable
    public final Function1 getExitTransition() {
        return this.l;
    }

    @Nullable
    public final Function1 getPopEnterTransition() {
        return this.m;
    }

    @Nullable
    public final Function1 getPopExitTransition() {
        return this.n;
    }

    @Nullable
    public final Function1 getSizeTransform() {
        return this.o;
    }

    @Override  // androidx.navigation.NavDestinationBuilder
    public NavDestination instantiateDestination() {
        return this.instantiateDestination();
    }

    @NotNull
    public Destination instantiateDestination() {
        return new Destination(this.i, this.j);
    }

    public final void setEnterTransition(@Nullable Function1 function10) {
        this.k = function10;
    }

    public final void setExitTransition(@Nullable Function1 function10) {
        this.l = function10;
    }

    public final void setPopEnterTransition(@Nullable Function1 function10) {
        this.m = function10;
    }

    public final void setPopExitTransition(@Nullable Function1 function10) {
        this.n = function10;
    }

    public final void setSizeTransform(@Nullable Function1 function10) {
        this.o = function10;
    }
}

