package com.google.accompanist.navigation.material;

import android.annotation.SuppressLint;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraphBuilder;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001Al\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\t0\u000621\u0010\n\u001A-\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\u000B¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"bottomSheet", "", "Landroidx/navigation/NavGraphBuilder;", "route", "", "arguments", "", "Landroidx/navigation/NamedNavArgument;", "deepLinks", "Landroidx/navigation/NavDeepLink;", "content", "Lkotlin/Function2;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/navigation/NavBackStackEntry;", "Lkotlin/ParameterName;", "name", "backstackEntry", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function4;)V", "navigation-material_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavGraphBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphBuilder.kt\ncom/google/accompanist/navigation/material/NavGraphBuilderKt\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n161#2:60\n1855#3,2:61\n1855#3,2:63\n*S KotlinDebug\n*F\n+ 1 NavGraphBuilder.kt\ncom/google/accompanist/navigation/material/NavGraphBuilderKt\n*L\n46#1:60\n50#1:61,2\n53#1:63,2\n*E\n"})
public final class NavGraphBuilderKt {
    @SuppressLint({"NewApi"})
    @ExperimentalMaterialNavigationApi
    public static final void bottomSheet(@NotNull NavGraphBuilder navGraphBuilder0, @NotNull String s, @NotNull List list0, @NotNull List list1, @NotNull Function4 function40) {
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(s, "route");
        Intrinsics.checkNotNullParameter(list0, "arguments");
        Intrinsics.checkNotNullParameter(list1, "deepLinks");
        Intrinsics.checkNotNullParameter(function40, "content");
        Destination bottomSheetNavigator$Destination0 = new Destination(((BottomSheetNavigator)navGraphBuilder0.getProvider().getNavigator(BottomSheetNavigator.class)), function40);
        bottomSheetNavigator$Destination0.setRoute(s);
        for(Object object0: list0) {
            bottomSheetNavigator$Destination0.addArgument(((NamedNavArgument)object0).component1(), ((NamedNavArgument)object0).component2());
        }
        for(Object object1: list1) {
            bottomSheetNavigator$Destination0.addDeepLink(((NavDeepLink)object1));
        }
        navGraphBuilder0.addDestination(bottomSheetNavigator$Destination0);
    }

    public static void bottomSheet$default(NavGraphBuilder navGraphBuilder0, String s, List list0, List list1, Function4 function40, int v, Object object0) {
        if((v & 2) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        if((v & 4) != 0) {
            list1 = CollectionsKt__CollectionsKt.emptyList();
        }
        NavGraphBuilderKt.bottomSheet(navGraphBuilder0, s, list0, list1, function40);
    }
}

