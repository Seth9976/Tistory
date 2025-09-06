package androidx.navigation;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u001F\u0010\u0000\u001A\u00020\u00012\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001AZ\u0010\u0000\u001A\u00020\u0001\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u001D\b\u0002\u0010\u000B\u001A\u0017\u0012\u0004\u0012\u00020\r\u0012\r\u0012\u000B\u0012\u0002\b\u00030\u000E¢\u0006\u0002\b\u000F0\f2\u0019\b\n\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001A^\u0010\u0000\u001A\u00020\u0001\"\b\b\u0000\u0010\u0007*\u00020\b2\u0006\u0010\t\u001A\u00020\n2\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u0002H\u00070\u00112\u001B\u0010\u000B\u001A\u0017\u0012\u0004\u0012\u00020\r\u0012\r\u0012\u000B\u0012\u0002\b\u00030\u000E¢\u0006\u0002\b\u000F0\f2\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"navDeepLink", "Landroidx/navigation/NavDeepLink;", "deepLinkBuilder", "Lkotlin/Function1;", "Landroidx/navigation/NavDeepLinkDslBuilder;", "", "Lkotlin/ExtensionFunctionType;", "T", "", "basePath", "", "typeMap", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "route", "Lkotlin/reflect/KClass;", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class NavDeepLinkDslBuilderKt {
    public static final NavDeepLink navDeepLink(String s, Map map0, Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "basePath");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        Intrinsics.checkNotNullParameter(function10, "deepLinkBuilder");
        Intrinsics.reifiedOperationMarker(4, "T");
        return NavDeepLinkDslBuilderKt.navDeepLink(s, Reflection.getOrCreateKotlinClass(Object.class), map0, function10);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public static final NavDeepLink navDeepLink(@NotNull String s, @NotNull KClass kClass0, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "basePath");
        Intrinsics.checkNotNullParameter(kClass0, "route");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        Intrinsics.checkNotNullParameter(function10, "deepLinkBuilder");
        NavDeepLinkDslBuilder navDeepLinkDslBuilder0 = new NavDeepLinkDslBuilder(s, kClass0, map0);
        function10.invoke(navDeepLinkDslBuilder0);
        return navDeepLinkDslBuilder0.build$navigation_common_release();
    }

    @NotNull
    public static final NavDeepLink navDeepLink(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "deepLinkBuilder");
        NavDeepLinkDslBuilder navDeepLinkDslBuilder0 = new NavDeepLinkDslBuilder();
        function10.invoke(navDeepLinkDslBuilder0);
        return navDeepLinkDslBuilder0.build$navigation_common_release();
    }

    public static NavDeepLink navDeepLink$default(String s, Map map0, Function1 function10, int v, Object object0) {
        if((v & 2) != 0) {
            map0 = x.emptyMap();
        }
        if((v & 4) != 0) {
            function10 = androidx.navigation.NavDeepLinkDslBuilderKt.navDeepLink.1.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(s, "basePath");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        Intrinsics.checkNotNullParameter(function10, "deepLinkBuilder");
        Intrinsics.reifiedOperationMarker(4, "T");
        return NavDeepLinkDslBuilderKt.navDeepLink(s, Reflection.getOrCreateKotlinClass(Object.class), map0, function10);

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "", "Landroidx/navigation/NavDeepLinkDslBuilder;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nNavDeepLinkDslBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLinkDslBuilder.kt\nandroidx/navigation/NavDeepLinkDslBuilderKt$navDeepLink$1\n*L\n1#1,141:1\n*E\n"})
        public final class androidx.navigation.NavDeepLinkDslBuilderKt.navDeepLink.1 extends Lambda implements Function1 {
            public static final androidx.navigation.NavDeepLinkDslBuilderKt.navDeepLink.1 INSTANCE;

            static {
                androidx.navigation.NavDeepLinkDslBuilderKt.navDeepLink.1.INSTANCE = new androidx.navigation.NavDeepLinkDslBuilderKt.navDeepLink.1();
            }

            public androidx.navigation.NavDeepLinkDslBuilderKt.navDeepLink.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((NavDeepLinkDslBuilder)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull NavDeepLinkDslBuilder navDeepLinkDslBuilder0) {
                Intrinsics.checkNotNullParameter(navDeepLinkDslBuilder0, "$this$null");
            }
        }

    }
}

