package androidx.navigation.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.window.DialogProperties;
import androidx.navigation.NavDestination;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.NavDestinationDsl;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@NavDestinationDsl
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B:\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0017\u0010\r\u001A\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000B0\t¢\u0006\u0002\b\f¢\u0006\u0004\b\u000E\u0010\u000FB[\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\n\u0010\u0006\u001A\u0006\u0012\u0002\b\u00030\u0010\u0012\u001B\u0010\u0015\u001A\u0017\u0012\u0004\u0012\u00020\u0012\u0012\r\u0012\u000B\u0012\u0002\b\u00030\u0013¢\u0006\u0002\b\u00140\u0011\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0017\u0010\r\u001A\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000B0\t¢\u0006\u0002\b\f¢\u0006\u0004\b\u000E\u0010\u0016J\u000F\u0010\u0017\u001A\u00020\u0002H\u0014¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/compose/DialogNavigator$Destination;", "Landroidx/navigation/compose/DialogNavigator;", "navigator", "", "route", "Landroidx/compose/ui/window/DialogProperties;", "dialogProperties", "Lkotlin/Function1;", "Landroidx/navigation/NavBackStackEntry;", "", "Landroidx/compose/runtime/Composable;", "content", "<init>", "(Landroidx/navigation/compose/DialogNavigator;Ljava/lang/String;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;)V", "Lkotlin/reflect/KClass;", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "typeMap", "(Landroidx/navigation/compose/DialogNavigator;Lkotlin/reflect/KClass;Ljava/util/Map;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;)V", "instantiateDestination", "()Landroidx/navigation/compose/DialogNavigator$Destination;", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DialogNavigatorDestinationBuilder extends NavDestinationBuilder {
    public static final int $stable;
    public final DialogNavigator i;
    public final DialogProperties j;
    public final Function3 k;

    public DialogNavigatorDestinationBuilder(@NotNull DialogNavigator dialogNavigator0, @NotNull String s, @NotNull DialogProperties dialogProperties0, @NotNull Function3 function30) {
        super(dialogNavigator0, s);
        this.i = dialogNavigator0;
        this.j = dialogProperties0;
        this.k = function30;
    }

    public DialogNavigatorDestinationBuilder(@NotNull DialogNavigator dialogNavigator0, @NotNull KClass kClass0, @NotNull Map map0, @NotNull DialogProperties dialogProperties0, @NotNull Function3 function30) {
        super(dialogNavigator0, kClass0, map0);
        this.i = dialogNavigator0;
        this.j = dialogProperties0;
        this.k = function30;
    }

    @Override  // androidx.navigation.NavDestinationBuilder
    public NavDestination instantiateDestination() {
        return this.instantiateDestination();
    }

    @NotNull
    public Destination instantiateDestination() {
        return new Destination(this.i, this.j, this.k);
    }
}

