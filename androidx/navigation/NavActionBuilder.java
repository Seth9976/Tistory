package androidx.navigation;

import androidx.core.os.BundleKt;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.z;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@NavDestinationDsl
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u000E\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\t\u001A\u00020\u00062\u0017\u0010\b\u001A\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000E\u001A\u00020\u000BH\u0000¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0016\u001A\u00020\u000F8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R%\u0010\u001D\u001A\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C¨\u0006\u001E"}, d2 = {"Landroidx/navigation/NavActionBuilder;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/navigation/NavOptionsBuilder;", "", "Lkotlin/ExtensionFunctionType;", "optionsBuilder", "navOptions", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/navigation/NavAction;", "build$navigation_common_release", "()Landroidx/navigation/NavAction;", "build", "", "a", "I", "getDestinationId", "()I", "setDestinationId", "(I)V", "destinationId", "", "", "b", "Ljava/util/Map;", "getDefaultArguments", "()Ljava/util/Map;", "defaultArguments", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestinationBuilder.kt\nandroidx/navigation/NavActionBuilder\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,398:1\n37#2,2:399\n*S KotlinDebug\n*F\n+ 1 NavDestinationBuilder.kt\nandroidx/navigation/NavActionBuilder\n*L\n335#1:399,2\n*E\n"})
public final class NavActionBuilder {
    public int a;
    public final LinkedHashMap b;
    public NavOptions c;

    public NavActionBuilder() {
        this.b = new LinkedHashMap();
    }

    @NotNull
    public final NavAction build$navigation_common_release() {
        int v = this.a;
        NavOptions navOptions0 = this.c;
        LinkedHashMap linkedHashMap0 = this.b;
        if(linkedHashMap0.isEmpty()) {
            return new NavAction(v, navOptions0, null);
        }
        Pair[] arr_pair = (Pair[])z.toList(linkedHashMap0).toArray(new Pair[0]);
        return new NavAction(v, navOptions0, BundleKt.bundleOf(((Pair[])Arrays.copyOf(arr_pair, arr_pair.length))));
    }

    @NotNull
    public final Map getDefaultArguments() {
        return this.b;
    }

    public final int getDestinationId() {
        return this.a;
    }

    public final void navOptions(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "optionsBuilder");
        NavOptionsBuilder navOptionsBuilder0 = new NavOptionsBuilder();
        function10.invoke(navOptionsBuilder0);
        this.c = navOptionsBuilder0.build$navigation_common_release();
    }

    public final void setDestinationId(int v) {
        this.a = v;
    }
}

