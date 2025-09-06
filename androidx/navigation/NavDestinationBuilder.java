package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@NavDestinationDsl
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\r\n\u0002\b\b\b\u0017\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003B-\b\u0000\u0012\u000E\u0010\u0005\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\b\b\u0001\u0010\u0007\u001A\u00020\u0006\u0012\b\u0010\t\u001A\u0004\u0018\u00010\b\u00A2\u0006\u0004\b\n\u0010\u000BB#\b\u0017\u0012\u000E\u0010\u0005\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\b\b\u0001\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\n\u0010\fB#\b\u0016\u0012\u000E\u0010\u0005\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\b\u0010\t\u001A\u0004\u0018\u00010\b\u00A2\u0006\u0004\b\n\u0010\rBD\b\u0016\u0012\u000E\u0010\u0005\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\f\u0010\t\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u000E\u0012\u001B\u0010\u0013\u001A\u0017\u0012\u0004\u0012\u00020\u0010\u0012\r\u0012\u000B\u0012\u0002\b\u00030\u0011\u00A2\u0006\u0002\b\u00120\u000F\u00A2\u0006\u0004\b\n\u0010\u0014J.\u0010\u001B\u001A\u00020\u00182\u0006\u0010\u0015\u001A\u00020\b2\u0017\u0010\u001A\u001A\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u001D\u0010\u001B\u001A\u00020\u00182\u0006\u0010\u0015\u001A\u00020\b2\u0006\u0010\u001B\u001A\u00020\u001D\u00A2\u0006\u0004\b\u001B\u0010\u001EJ\u0015\u0010 \u001A\u00020\u00182\u0006\u0010\u001F\u001A\u00020\b\u00A2\u0006\u0004\b \u0010!J$\u0010 \u001A\u00020\u0018\"\n\b\u0001\u0010\"\u0018\u0001*\u00020\u00032\u0006\u0010#\u001A\u00020\bH\u0087\b\u00A2\u0006\u0004\b$\u0010!J&\u0010 \u001A\u00020\u00182\u0017\u0010&\u001A\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00180\u0016\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0004\b \u0010\'JB\u0010 \u001A\u00020\u0018\"\n\b\u0001\u0010\"\u0018\u0001*\u00020\u00032\u0006\u0010#\u001A\u00020\b2\u0019\b\b\u0010&\u001A\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00180\u0016\u00A2\u0006\u0002\b\u0019H\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010\u001CJH\u0010 \u001A\u00020\u0018\"\b\b\u0001\u0010\"*\u00020\u00032\u0006\u0010#\u001A\u00020\b2\f\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00010\u000E2\u0017\u0010&\u001A\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00180\u0016\u00A2\u0006\u0002\b\u0019H\u0007\u00A2\u0006\u0004\b \u0010(J\u0015\u0010 \u001A\u00020\u00182\u0006\u0010&\u001A\u00020)\u00A2\u0006\u0004\b \u0010*J0\u0010.\u001A\u00020\u00182\u0006\u0010+\u001A\u00020\u00062\u0017\u0010-\u001A\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00180\u0016\u00A2\u0006\u0002\b\u0019H\u0007\u00A2\u0006\u0004\b.\u0010/J\u000F\u00100\u001A\u00028\u0000H\u0014\u00A2\u0006\u0004\b0\u00101J\u000F\u00102\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b2\u00101R\"\u0010\u0005\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00048\u0004X\u0084\u0004\u00A2\u0006\f\n\u0004\b3\u00104\u001A\u0004\b5\u00106R\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010:R\u0019\u0010\t\u001A\u0004\u0018\u00010\b8\u0006\u00A2\u0006\f\n\u0004\b;\u0010<\u001A\u0004\b=\u0010>R$\u0010F\u001A\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b@\u0010A\u001A\u0004\bB\u0010C\"\u0004\bD\u0010E\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006G"}, d2 = {"Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/NavDestination;", "D", "", "Landroidx/navigation/Navigator;", "navigator", "", "id", "", "route", "<init>", "(Landroidx/navigation/Navigator;ILjava/lang/String;)V", "(Landroidx/navigation/Navigator;I)V", "(Landroidx/navigation/Navigator;Ljava/lang/String;)V", "Lkotlin/reflect/KClass;", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "typeMap", "(Landroidx/navigation/Navigator;Lkotlin/reflect/KClass;Ljava/util/Map;)V", "name", "Lkotlin/Function1;", "Landroidx/navigation/NavArgumentBuilder;", "", "Lkotlin/ExtensionFunctionType;", "argumentBuilder", "argument", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Landroidx/navigation/NavArgument;", "(Ljava/lang/String;Landroidx/navigation/NavArgument;)V", "uriPattern", "deepLink", "(Ljava/lang/String;)V", "T", "basePath", "deepLinkSafeArgs", "Landroidx/navigation/NavDeepLinkDslBuilder;", "navDeepLink", "(Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/String;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "Landroidx/navigation/NavDeepLink;", "(Landroidx/navigation/NavDeepLink;)V", "actionId", "Landroidx/navigation/NavActionBuilder;", "actionBuilder", "action", "(ILkotlin/jvm/functions/Function1;)V", "instantiateDestination", "()Landroidx/navigation/NavDestination;", "build", "a", "Landroidx/navigation/Navigator;", "getNavigator", "()Landroidx/navigation/Navigator;", "b", "I", "getId", "()I", "c", "Ljava/lang/String;", "getRoute", "()Ljava/lang/String;", "", "e", "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "label", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestinationBuilder.kt\nandroidx/navigation/NavDestinationBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,398:1\n1855#2,2:399\n1855#2,2:401\n1855#2,2:405\n215#3,2:403\n215#3,2:407\n*S KotlinDebug\n*F\n+ 1 NavDestinationBuilder.kt\nandroidx/navigation/NavDestinationBuilder\n*L\n95#1:399,2\n238#1:401,2\n295#1:405,2\n294#1:403,2\n296#1:407,2\n*E\n"})
public class NavDestinationBuilder {
    public final Navigator a;
    public final int b;
    public final String c;
    public final Map d;
    public CharSequence e;
    public final LinkedHashMap f;
    public final ArrayList g;
    public final LinkedHashMap h;

    @Deprecated(message = "Use routes to build your NavDestination instead", replaceWith = @ReplaceWith(expression = "NavDestinationBuilder(navigator, route = id.toString())", imports = {}))
    public NavDestinationBuilder(@NotNull Navigator navigator0, @IdRes int v) {
        Intrinsics.checkNotNullParameter(navigator0, "navigator");
        this(navigator0, v, null);
    }

    public NavDestinationBuilder(@NotNull Navigator navigator0, @IdRes int v, @Nullable String s) {
        Intrinsics.checkNotNullParameter(navigator0, "navigator");
        super();
        this.a = navigator0;
        this.b = v;
        this.c = s;
        this.f = new LinkedHashMap();
        this.g = new ArrayList();
        this.h = new LinkedHashMap();
    }

    public NavDestinationBuilder(@NotNull Navigator navigator0, @Nullable String s) {
        Intrinsics.checkNotNullParameter(navigator0, "navigator");
        this(navigator0, -1, s);
    }

    public NavDestinationBuilder(@NotNull Navigator navigator0, @Nullable KClass kClass0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(navigator0, "navigator");
        int v;
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        if(kClass0 == null) {
            v = -1;
        }
        else {
            KSerializer kSerializer0 = SerializersKt.serializer(kClass0);
            v = kSerializer0 == null ? -1 : RouteSerializerKt.generateHashCode(kSerializer0);
        }
        String s = null;
        if(kClass0 != null) {
            KSerializer kSerializer1 = SerializersKt.serializer(kClass0);
            if(kSerializer1 != null) {
                s = RouteSerializerKt.generateRoutePattern$default(kSerializer1, map0, null, 2, null);
            }
        }
        this(navigator0, v, s);
        if(kClass0 != null) {
            for(Object object0: RouteSerializerKt.generateNavArguments(SerializersKt.serializer(kClass0), map0)) {
                this.f.put(((NamedNavArgument)object0).getName(), ((NamedNavArgument)object0).getArgument());
            }
        }
        this.d = map0;
    }

    @Deprecated(message = "Building NavDestinations using IDs with the Kotlin DSL has been deprecated in favor of using routes. When using routes there is no need for actions.")
    public final void action(int v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "actionBuilder");
        NavActionBuilder navActionBuilder0 = new NavActionBuilder();
        function10.invoke(navActionBuilder0);
        NavAction navAction0 = navActionBuilder0.build$navigation_common_release();
        this.h.put(v, navAction0);
    }

    public final void argument(@NotNull String s, @NotNull NavArgument navArgument0) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(navArgument0, "argument");
        this.f.put(s, navArgument0);
    }

    public final void argument(@NotNull String s, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(function10, "argumentBuilder");
        NavArgumentBuilder navArgumentBuilder0 = new NavArgumentBuilder();
        function10.invoke(navArgumentBuilder0);
        NavArgument navArgument0 = navArgumentBuilder0.build();
        this.f.put(s, navArgument0);
    }

    @NotNull
    public NavDestination build() {
        NavDestination navDestination0 = this.instantiateDestination();
        navDestination0.setLabel(this.e);
        for(Object object0: this.f.entrySet()) {
            navDestination0.addArgument(((String)((Map.Entry)object0).getKey()), ((NavArgument)((Map.Entry)object0).getValue()));
        }
        for(Object object1: this.g) {
            navDestination0.addDeepLink(((NavDeepLink)object1));
        }
        for(Object object2: this.h.entrySet()) {
            navDestination0.putAction(((Number)((Map.Entry)object2).getKey()).intValue(), ((NavAction)((Map.Entry)object2).getValue()));
        }
        String s = this.c;
        if(s != null) {
            navDestination0.setRoute(s);
        }
        int v = this.b;
        if(v != -1) {
            navDestination0.setId(v);
        }
        return navDestination0;
    }

    public final void deepLink(@NotNull NavDeepLink navDeepLink0) {
        Intrinsics.checkNotNullParameter(navDeepLink0, "navDeepLink");
        this.g.add(navDeepLink0);
    }

    public final void deepLink(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "uriPattern");
        NavDeepLink navDeepLink0 = new NavDeepLink(s);
        this.g.add(navDeepLink0);
    }

    public final void deepLink(String s, Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "basePath");
        Intrinsics.checkNotNullParameter(function10, "navDeepLink");
        Intrinsics.reifiedOperationMarker(4, "T");
        this.deepLink(s, Reflection.getOrCreateKotlinClass(Object.class), function10);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final void deepLink(@NotNull String s, @NotNull KClass kClass0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "basePath");
        Intrinsics.checkNotNullParameter(kClass0, "route");
        Intrinsics.checkNotNullParameter(function10, "navDeepLink");
        Map map0 = this.d;
        if(map0 == null) {
            throw new IllegalStateException(("Cannot add deeplink from KClass [" + kClass0 + "]. Use the NavDestinationBuilder constructor that takes a KClass with the same arguments.").toString());
        }
        for(Object object0: RouteSerializerKt.generateNavArguments(SerializersKt.serializer(kClass0), map0)) {
            NamedNavArgument namedNavArgument0 = (NamedNavArgument)object0;
            NavArgument navArgument0 = (NavArgument)this.f.get(namedNavArgument0.getName());
            if(navArgument0 == null || !Intrinsics.areEqual(navArgument0.getType(), namedNavArgument0.getArgument().getType())) {
                throw new IllegalArgumentException(("Cannot add deeplink from KClass [" + kClass0 + "]. DeepLink contains unknown argument [" + namedNavArgument0.getName() + "]. Ensure deeplink arguments matches the destination\'s route from KClass").toString());
            }
            if(false) {
                break;
            }
        }
        this.deepLink(NavDeepLinkDslBuilderKt.navDeepLink(s, kClass0, map0, function10));
    }

    public final void deepLink(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "navDeepLink");
        NavDeepLinkDslBuilder navDeepLinkDslBuilder0 = new NavDeepLinkDslBuilder();
        function10.invoke(navDeepLinkDslBuilder0);
        NavDeepLink navDeepLink0 = navDeepLinkDslBuilder0.build$navigation_common_release();
        this.g.add(navDeepLink0);
    }

    @JvmName(name = "deepLinkSafeArgs")
    public final void deepLinkSafeArgs(String s) {
        Intrinsics.checkNotNullParameter(s, "basePath");
        Intrinsics.reifiedOperationMarker(4, "T");
        this.deepLink(s, Reflection.getOrCreateKotlinClass(Object.class), androidx.navigation.NavDestinationBuilder.deepLink.1.INSTANCE);

        @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003\"\n\b\u0001\u0010\u0004 \u0001*\u00020\u0005*\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "T", "", "D", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/NavDeepLinkDslBuilder;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nNavDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestinationBuilder.kt\nandroidx/navigation/NavDestinationBuilder$deepLink$1\n*L\n1#1,398:1\n*E\n"})
        public final class androidx.navigation.NavDestinationBuilder.deepLink.1 extends Lambda implements Function1 {
            public static final androidx.navigation.NavDestinationBuilder.deepLink.1 INSTANCE;

            static {
                androidx.navigation.NavDestinationBuilder.deepLink.1.INSTANCE = new androidx.navigation.NavDestinationBuilder.deepLink.1();
            }

            public androidx.navigation.NavDestinationBuilder.deepLink.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((NavDeepLinkDslBuilder)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull NavDeepLinkDslBuilder navDeepLinkDslBuilder0) {
                Intrinsics.checkNotNullParameter(navDeepLinkDslBuilder0, "$this$deepLink");
            }
        }

    }

    public final int getId() {
        return this.b;
    }

    @Nullable
    public final CharSequence getLabel() {
        return this.e;
    }

    @NotNull
    public final Navigator getNavigator() {
        return this.a;
    }

    @Nullable
    public final String getRoute() {
        return this.c;
    }

    @NotNull
    public NavDestination instantiateDestination() {
        return this.a.createDestination();
    }

    public final void setLabel(@Nullable CharSequence charSequence0) {
        this.e = charSequence0;
    }
}

