package androidx.navigation.fragment;

import androidx.annotation.IdRes;
import androidx.fragment.app.DialogFragment;
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

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A#\u0010\u0000\u001A\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\b\b\u0001\u0010\u0005\u001A\u00020\u0006H\u0087\b\u001A?\u0010\u0000\u001A\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\b\b\u0001\u0010\u0005\u001A\u00020\u00062\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\nH\u0087\bø\u0001\u0000\u001A!\u0010\u0000\u001A\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0006\u0010\u000B\u001A\u00020\fH\u0086\b\u001A=\u0010\u0000\u001A\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0006\u0010\u000B\u001A\u00020\f2\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000\u001AD\u0010\u0000\u001A\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003\"\n\b\u0001\u0010\r\u0018\u0001*\u00020\u000E*\u00020\u00042\u001D\b\u0002\u0010\u000F\u001A\u0017\u0012\u0004\u0012\u00020\u0011\u0012\r\u0012\u000B\u0012\u0002\b\u00030\u0012¢\u0006\u0002\b\u00130\u0010H\u0086\b\u001A`\u0010\u0000\u001A\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003\"\n\b\u0001\u0010\r\u0018\u0001*\u00020\u000E*\u00020\u00042\u001D\b\u0002\u0010\u000F\u001A\u0017\u0012\u0004\u0012\u00020\u0011\u0012\r\u0012\u000B\u0012\u0002\b\u00030\u0012¢\u0006\u0002\b\u00130\u00102\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"dialog", "", "F", "Landroidx/fragment/app/DialogFragment;", "Landroidx/navigation/NavGraphBuilder;", "id", "", "builder", "Lkotlin/Function1;", "Landroidx/navigation/fragment/DialogFragmentNavigatorDestinationBuilder;", "Lkotlin/ExtensionFunctionType;", "route", "", "T", "", "typeMap", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "navigation-fragment_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDialogFragmentNavigatorDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogFragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/fragment/DialogFragmentNavigatorDestinationBuilderKt\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n*L\n1#1,197:1\n57#1,3:198\n60#1,5:202\n84#1,3:208\n87#1,5:212\n116#1,3:218\n120#1,5:222\n116#1,9:227\n157#2:201\n157#2:207\n157#2:211\n157#2:217\n157#2:221\n157#2:236\n*S KotlinDebug\n*F\n+ 1 DialogFragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/fragment/DialogFragmentNavigatorDestinationBuilderKt\n*L\n40#1:198,3\n40#1:202,5\n72#1:208,3\n72#1:212,5\n102#1:218,3\n102#1:222,5\n102#1:227,9\n40#1:201\n59#1:207\n72#1:211\n86#1:217\n102#1:221\n118#1:236\n*E\n"})
public final class DialogFragmentNavigatorDestinationBuilderKt {
    @Deprecated(message = "Use routes to create your DialogFragmentDestination instead", replaceWith = @ReplaceWith(expression = "dialog<F>(route = id.toString())", imports = {}))
    public static final void dialog(NavGraphBuilder navGraphBuilder0, @IdRes int v) {
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        DialogFragmentNavigator dialogFragmentNavigator0 = (DialogFragmentNavigator)navGraphBuilder0.getProvider().getNavigator(DialogFragmentNavigator.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        navGraphBuilder0.destination(new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator0, v, Reflection.getOrCreateKotlinClass(DialogFragment.class)));
    }

    @Deprecated(message = "Use routes to create your DialogFragmentDestination instead", replaceWith = @ReplaceWith(expression = "dialog<F>(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void dialog(NavGraphBuilder navGraphBuilder0, @IdRes int v, Function1 function10) {
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "builder");
        DialogFragmentNavigator dialogFragmentNavigator0 = (DialogFragmentNavigator)navGraphBuilder0.getProvider().getNavigator(DialogFragmentNavigator.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        DialogFragmentNavigatorDestinationBuilder dialogFragmentNavigatorDestinationBuilder0 = new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator0, v, Reflection.getOrCreateKotlinClass(DialogFragment.class));
        function10.invoke(dialogFragmentNavigatorDestinationBuilder0);
        navGraphBuilder0.destination(dialogFragmentNavigatorDestinationBuilder0);
    }

    public static final void dialog(NavGraphBuilder navGraphBuilder0, String s) {
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(s, "route");
        DialogFragmentNavigator dialogFragmentNavigator0 = (DialogFragmentNavigator)navGraphBuilder0.getProvider().getNavigator(DialogFragmentNavigator.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        navGraphBuilder0.destination(new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator0, s, Reflection.getOrCreateKotlinClass(DialogFragment.class)));
    }

    public static final void dialog(NavGraphBuilder navGraphBuilder0, String s, Function1 function10) {
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(s, "route");
        Intrinsics.checkNotNullParameter(function10, "builder");
        DialogFragmentNavigator dialogFragmentNavigator0 = (DialogFragmentNavigator)navGraphBuilder0.getProvider().getNavigator(DialogFragmentNavigator.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        DialogFragmentNavigatorDestinationBuilder dialogFragmentNavigatorDestinationBuilder0 = new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator0, s, Reflection.getOrCreateKotlinClass(DialogFragment.class));
        function10.invoke(dialogFragmentNavigatorDestinationBuilder0);
        navGraphBuilder0.destination(dialogFragmentNavigatorDestinationBuilder0);
    }

    public static final void dialog(NavGraphBuilder navGraphBuilder0, Map map0) {
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        DialogFragmentNavigator dialogFragmentNavigator0 = (DialogFragmentNavigator)navGraphBuilder0.getProvider().getNavigator(DialogFragmentNavigator.class);
        Intrinsics.reifiedOperationMarker(4, "T");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        navGraphBuilder0.destination(new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator0, kClass0, map0, Reflection.getOrCreateKotlinClass(DialogFragment.class)));
    }

    public static final void dialog(NavGraphBuilder navGraphBuilder0, Map map0, Function1 function10) {
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        Intrinsics.checkNotNullParameter(function10, "builder");
        DialogFragmentNavigator dialogFragmentNavigator0 = (DialogFragmentNavigator)navGraphBuilder0.getProvider().getNavigator(DialogFragmentNavigator.class);
        Intrinsics.reifiedOperationMarker(4, "T");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        DialogFragmentNavigatorDestinationBuilder dialogFragmentNavigatorDestinationBuilder0 = new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator0, kClass0, map0, Reflection.getOrCreateKotlinClass(DialogFragment.class));
        function10.invoke(dialogFragmentNavigatorDestinationBuilder0);
        navGraphBuilder0.destination(dialogFragmentNavigatorDestinationBuilder0);
    }

    public static void dialog$default(NavGraphBuilder navGraphBuilder0, Map map0, int v, Object object0) {
        if((v & 1) != 0) {
            map0 = x.emptyMap();
        }
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        DialogFragmentNavigator dialogFragmentNavigator0 = (DialogFragmentNavigator)navGraphBuilder0.getProvider().getNavigator(DialogFragmentNavigator.class);
        Intrinsics.reifiedOperationMarker(4, "T");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        navGraphBuilder0.destination(new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator0, kClass0, map0, Reflection.getOrCreateKotlinClass(DialogFragment.class)));
    }

    public static void dialog$default(NavGraphBuilder navGraphBuilder0, Map map0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            map0 = x.emptyMap();
        }
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        Intrinsics.checkNotNullParameter(function10, "builder");
        DialogFragmentNavigator dialogFragmentNavigator0 = (DialogFragmentNavigator)navGraphBuilder0.getProvider().getNavigator(DialogFragmentNavigator.class);
        Intrinsics.reifiedOperationMarker(4, "T");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        DialogFragmentNavigatorDestinationBuilder dialogFragmentNavigatorDestinationBuilder0 = new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator0, kClass0, map0, Reflection.getOrCreateKotlinClass(DialogFragment.class));
        function10.invoke(dialogFragmentNavigatorDestinationBuilder0);
        navGraphBuilder0.destination(dialogFragmentNavigatorDestinationBuilder0);
    }
}

