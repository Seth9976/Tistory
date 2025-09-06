package androidx.navigation;

import androidx.annotation.IdRes;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.SerializersKt;
import n4.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@NavDestinationDsl
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001A\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001A\u00020\u0005¢\u0006\u0004\b\b\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\n\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\n¢\u0006\u0004\b\b\u0010\fBH\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\n\u0010\u0007\u001A\u0006\u0012\u0002\b\u00030\r\u0012\f\u0010\u000B\u001A\b\u0012\u0002\b\u0003\u0018\u00010\r\u0012\u001B\u0010\u0012\u001A\u0017\u0012\u0004\u0012\u00020\u000F\u0012\r\u0012\u000B\u0012\u0002\b\u00030\u0010¢\u0006\u0002\b\u00110\u000E¢\u0006\u0004\b\b\u0010\u0013BD\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0014\u0012\f\u0010\u000B\u001A\b\u0012\u0002\b\u0003\u0018\u00010\r\u0012\u001B\u0010\u0012\u001A\u0017\u0012\u0004\u0012\u00020\u000F\u0012\r\u0012\u000B\u0012\u0002\b\u00030\u0010¢\u0006\u0002\b\u00110\u000E¢\u0006\u0004\b\b\u0010\u0015J%\u0010\u001A\u001A\u00020\u0019\"\b\b\u0000\u0010\u0017*\u00020\u00162\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001A\u0010\u001BJ\u0014\u0010\u001C\u001A\u00020\u0019*\u00020\u0016H\u0086\u0002¢\u0006\u0004\b\u001C\u0010\u001DJ\u0015\u0010\u001E\u001A\u00020\u00192\u0006\u0010\u001A\u001A\u00020\u0016¢\u0006\u0004\b\u001E\u0010\u001DJ\u000F\u0010\u001F\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u001F\u0010 R\u0017\u0010\u0004\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$¨\u0006%"}, d2 = {"Landroidx/navigation/NavGraphBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavigatorProvider;", "provider", "", "id", "startDestination", "<init>", "(Landroidx/navigation/NavigatorProvider;II)V", "", "route", "(Landroidx/navigation/NavigatorProvider;Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/reflect/KClass;", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "typeMap", "(Landroidx/navigation/NavigatorProvider;Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Ljava/util/Map;)V", "", "(Landroidx/navigation/NavigatorProvider;Ljava/lang/Object;Lkotlin/reflect/KClass;Ljava/util/Map;)V", "Landroidx/navigation/NavDestination;", "D", "navDestination", "", "destination", "(Landroidx/navigation/NavDestinationBuilder;)V", "unaryPlus", "(Landroidx/navigation/NavDestination;)V", "addDestination", "build", "()Landroidx/navigation/NavGraph;", "i", "Landroidx/navigation/NavigatorProvider;", "getProvider", "()Landroidx/navigation/NavigatorProvider;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavGraphBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilder\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n*L\n1#1,305:1\n157#2:306\n157#2:307\n157#2:308\n157#2:309\n*S KotlinDebug\n*F\n+ 1 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilder\n*L\n197#1:306\n214#1:307\n235#1:308\n256#1:309\n*E\n"})
public class NavGraphBuilder extends NavDestinationBuilder {
    public final NavigatorProvider i;
    public final int j;
    public final String k;
    public final KClass l;
    public final Object m;
    public final ArrayList n;

    @Deprecated(message = "Use routes to build your NavGraph instead", replaceWith = @ReplaceWith(expression = "NavGraphBuilder(provider, startDestination = startDestination.toString(), route = id.toString())", imports = {}))
    public NavGraphBuilder(@NotNull NavigatorProvider navigatorProvider0, @IdRes int v, @IdRes int v1) {
        Intrinsics.checkNotNullParameter(navigatorProvider0, "provider");
        super(navigatorProvider0.getNavigator(NavGraphNavigator.class), v);
        this.n = new ArrayList();
        this.i = navigatorProvider0;
        this.j = v1;
    }

    public NavGraphBuilder(@NotNull NavigatorProvider navigatorProvider0, @NotNull Object object0, @Nullable KClass kClass0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(navigatorProvider0, "provider");
        Intrinsics.checkNotNullParameter(object0, "startDestination");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        super(navigatorProvider0.getNavigator(NavGraphNavigator.class), kClass0, map0);
        this.n = new ArrayList();
        this.i = navigatorProvider0;
        this.m = object0;
    }

    public NavGraphBuilder(@NotNull NavigatorProvider navigatorProvider0, @NotNull String s, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(navigatorProvider0, "provider");
        Intrinsics.checkNotNullParameter(s, "startDestination");
        super(navigatorProvider0.getNavigator(NavGraphNavigator.class), s1);
        this.n = new ArrayList();
        this.i = navigatorProvider0;
        this.k = s;
    }

    public NavGraphBuilder(@NotNull NavigatorProvider navigatorProvider0, @NotNull KClass kClass0, @Nullable KClass kClass1, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(navigatorProvider0, "provider");
        Intrinsics.checkNotNullParameter(kClass0, "startDestination");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        super(navigatorProvider0.getNavigator(NavGraphNavigator.class), kClass1, map0);
        this.n = new ArrayList();
        this.i = navigatorProvider0;
        this.l = kClass0;
    }

    public final void addDestination(@NotNull NavDestination navDestination0) {
        Intrinsics.checkNotNullParameter(navDestination0, "destination");
        this.n.add(navDestination0);
    }

    @Override  // androidx.navigation.NavDestinationBuilder
    public NavDestination build() {
        return this.build();
    }

    @NotNull
    public NavGraph build() {
        NavGraph navGraph0 = (NavGraph)super.build();
        navGraph0.addDestinations(this.n);
        Object object0 = this.m;
        KClass kClass0 = this.l;
        String s = this.k;
        int v = this.j;
        if(v == 0 && s == null && kClass0 == null && object0 == null) {
            throw this.getRoute() == null ? new IllegalStateException("You must set a start destination id") : new IllegalStateException("You must set a start destination route");
        }
        if(s != null) {
            Intrinsics.checkNotNull(s);
            navGraph0.setStartDestination(s);
            return navGraph0;
        }
        if(kClass0 != null) {
            Intrinsics.checkNotNull(kClass0);
            navGraph0.setStartDestination(SerializersKt.serializer(kClass0), a.E);
            return navGraph0;
        }
        if(object0 != null) {
            Intrinsics.checkNotNull(object0);
            navGraph0.setStartDestination(object0);
            return navGraph0;
        }
        navGraph0.setStartDestination(v);
        return navGraph0;
    }

    public final void destination(@NotNull NavDestinationBuilder navDestinationBuilder0) {
        Intrinsics.checkNotNullParameter(navDestinationBuilder0, "navDestination");
        NavDestination navDestination0 = navDestinationBuilder0.build();
        this.n.add(navDestination0);
    }

    @NotNull
    public final NavigatorProvider getProvider() {
        return this.i;
    }

    public final void unaryPlus(@NotNull NavDestination navDestination0) {
        Intrinsics.checkNotNullParameter(navDestination0, "<this>");
        this.addDestination(navDestination0);
    }
}

