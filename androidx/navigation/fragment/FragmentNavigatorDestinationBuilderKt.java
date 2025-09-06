package androidx.navigation.fragment;

import androidx.annotation.IdRes;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavGraphBuilder;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A#\u0010\u0000\u001A\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\b\b\u0001\u0010\u0005\u001A\u00020\u0006H\u0087\b\u001A?\u0010\u0000\u001A\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\b\b\u0001\u0010\u0005\u001A\u00020\u00062\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\nH\u0087\bø\u0001\u0000\u001A!\u0010\u0000\u001A\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0006\u0010\u000B\u001A\u00020\fH\u0086\b\u001A=\u0010\u0000\u001A\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0006\u0010\u000B\u001A\u00020\f2\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000\u001AD\u0010\u0000\u001A\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003\"\n\b\u0001\u0010\r\u0018\u0001*\u00020\u000E*\u00020\u00042\u001D\b\u0002\u0010\u000F\u001A\u0017\u0012\u0004\u0012\u00020\u0011\u0012\r\u0012\u000B\u0012\u0002\b\u00030\u0012¢\u0006\u0002\b\u00130\u0010H\u0086\b\u001A`\u0010\u0000\u001A\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003\"\n\b\u0001\u0010\r\u0018\u0001*\u00020\u000E*\u00020\u00042\u001D\b\u0002\u0010\u000F\u001A\u0017\u0012\u0004\u0012\u00020\u0011\u0012\r\u0012\u000B\u0012\u0002\b\u00030\u0012¢\u0006\u0002\b\u00130\u00102\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"fragment", "", "F", "Landroidx/fragment/app/Fragment;", "Landroidx/navigation/NavGraphBuilder;", "id", "", "builder", "Lkotlin/Function1;", "Landroidx/navigation/fragment/FragmentNavigatorDestinationBuilder;", "Lkotlin/ExtensionFunctionType;", "route", "", "T", "", "typeMap", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "navigation-fragment_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFragmentNavigatorDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/fragment/FragmentNavigatorDestinationBuilderKt\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n*L\n1#1,186:1\n57#1,2:187\n59#1,2:190\n80#1,2:193\n82#1,2:196\n108#1,3:199\n112#1,5:203\n108#1,9:208\n157#2:189\n157#2:192\n157#2:195\n157#2:198\n157#2:202\n157#2:217\n*S KotlinDebug\n*F\n+ 1 FragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/fragment/FragmentNavigatorDestinationBuilderKt\n*L\n40#1:187,2\n40#1:190,2\n68#1:193,2\n68#1:196,2\n94#1:199,3\n94#1:203,5\n94#1:208,9\n40#1:189\n58#1:192\n68#1:195\n81#1:198\n94#1:202\n110#1:217\n*E\n"})
public final class FragmentNavigatorDestinationBuilderKt {
    @Deprecated(message = "Use routes to create your FragmentDestination instead", replaceWith = @ReplaceWith(expression = "fragment<F>(route = id.toString())", imports = {}))
    public static final void fragment(NavGraphBuilder navGraphBuilder0, @IdRes int v) {
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        FragmentNavigator fragmentNavigator0 = (FragmentNavigator)navGraphBuilder0.getProvider().getNavigator(FragmentNavigator.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        navGraphBuilder0.destination(new FragmentNavigatorDestinationBuilder(fragmentNavigator0, v, Reflection.getOrCreateKotlinClass(Fragment.class)));
    }

    @Deprecated(message = "Use routes to create your FragmentDestination instead", replaceWith = @ReplaceWith(expression = "fragment<F>(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void fragment(NavGraphBuilder navGraphBuilder0, @IdRes int v, Function1 function10) {
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "builder");
        FragmentNavigator fragmentNavigator0 = (FragmentNavigator)navGraphBuilder0.getProvider().getNavigator(FragmentNavigator.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder0 = new FragmentNavigatorDestinationBuilder(fragmentNavigator0, v, Reflection.getOrCreateKotlinClass(Fragment.class));
        function10.invoke(fragmentNavigatorDestinationBuilder0);
        navGraphBuilder0.destination(fragmentNavigatorDestinationBuilder0);
    }

    public static final void fragment(NavGraphBuilder navGraphBuilder0, String s) {
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(s, "route");
        FragmentNavigator fragmentNavigator0 = (FragmentNavigator)navGraphBuilder0.getProvider().getNavigator(FragmentNavigator.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        navGraphBuilder0.destination(new FragmentNavigatorDestinationBuilder(fragmentNavigator0, s, Reflection.getOrCreateKotlinClass(Fragment.class)));
    }

    public static final void fragment(NavGraphBuilder navGraphBuilder0, String s, Function1 function10) {
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(s, "route");
        Intrinsics.checkNotNullParameter(function10, "builder");
        FragmentNavigator fragmentNavigator0 = (FragmentNavigator)navGraphBuilder0.getProvider().getNavigator(FragmentNavigator.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder0 = new FragmentNavigatorDestinationBuilder(fragmentNavigator0, s, Reflection.getOrCreateKotlinClass(Fragment.class));
        function10.invoke(fragmentNavigatorDestinationBuilder0);
        navGraphBuilder0.destination(fragmentNavigatorDestinationBuilder0);
    }

    public static final void fragment(NavGraphBuilder navGraphBuilder0, Map map0) {
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        FragmentNavigator fragmentNavigator0 = (FragmentNavigator)navGraphBuilder0.getProvider().getNavigator(FragmentNavigator.class);
        Intrinsics.reifiedOperationMarker(4, "T");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        navGraphBuilder0.destination(new FragmentNavigatorDestinationBuilder(fragmentNavigator0, kClass0, map0, Reflection.getOrCreateKotlinClass(Fragment.class)));
    }

    public static final void fragment(NavGraphBuilder navGraphBuilder0, Map map0, Function1 function10) {
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        Intrinsics.checkNotNullParameter(function10, "builder");
        FragmentNavigator fragmentNavigator0 = (FragmentNavigator)navGraphBuilder0.getProvider().getNavigator(FragmentNavigator.class);
        Intrinsics.reifiedOperationMarker(4, "T");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder0 = new FragmentNavigatorDestinationBuilder(fragmentNavigator0, kClass0, map0, Reflection.getOrCreateKotlinClass(Fragment.class));
        function10.invoke(fragmentNavigatorDestinationBuilder0);
        navGraphBuilder0.destination(fragmentNavigatorDestinationBuilder0);
    }

    public static void fragment$default(NavGraphBuilder navGraphBuilder0, Map map0, int v, Object object0) {
        if((v & 1) != 0) {
            map0 = x.emptyMap();
        }
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        FragmentNavigator fragmentNavigator0 = (FragmentNavigator)navGraphBuilder0.getProvider().getNavigator(FragmentNavigator.class);
        Intrinsics.reifiedOperationMarker(4, "T");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        navGraphBuilder0.destination(new FragmentNavigatorDestinationBuilder(fragmentNavigator0, kClass0, map0, Reflection.getOrCreateKotlinClass(Fragment.class)));
    }

    public static void fragment$default(NavGraphBuilder navGraphBuilder0, Map map0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            map0 = x.emptyMap();
        }
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        Intrinsics.checkNotNullParameter(function10, "builder");
        FragmentNavigator fragmentNavigator0 = (FragmentNavigator)navGraphBuilder0.getProvider().getNavigator(FragmentNavigator.class);
        Intrinsics.reifiedOperationMarker(4, "T");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder0 = new FragmentNavigatorDestinationBuilder(fragmentNavigator0, kClass0, map0, Reflection.getOrCreateKotlinClass(Fragment.class));
        function10.invoke(fragmentNavigatorDestinationBuilder0);
        navGraphBuilder0.destination(fragmentNavigatorDestinationBuilder0);
    }
}

