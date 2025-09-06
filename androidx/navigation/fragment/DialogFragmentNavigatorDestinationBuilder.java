package androidx.navigation.fragment;

import androidx.annotation.IdRes;
import androidx.navigation.NavDestination;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.NavDestinationDsl;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@NavDestinationDsl
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\b\u0017\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001A\u00020\u0005\u0012\u000E\u0010\t\u001A\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000BB)\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u000E\u0010\t\u001A\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000EBN\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u000E\u0010\r\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u000F0\u0007\u0012\u001B\u0010\u0014\u001A\u0017\u0012\u0004\u0012\u00020\u0011\u0012\r\u0012\u000B\u0012\u0002\b\u00030\u0012¢\u0006\u0002\b\u00130\u0010\u0012\u000E\u0010\t\u001A\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u0015J\u000F\u0010\u0016\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/navigation/fragment/DialogFragmentNavigatorDestinationBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/fragment/DialogFragmentNavigator$Destination;", "Landroidx/navigation/fragment/DialogFragmentNavigator;", "navigator", "", "id", "Lkotlin/reflect/KClass;", "Landroidx/fragment/app/DialogFragment;", "fragmentClass", "<init>", "(Landroidx/navigation/fragment/DialogFragmentNavigator;ILkotlin/reflect/KClass;)V", "", "route", "(Landroidx/navigation/fragment/DialogFragmentNavigator;Ljava/lang/String;Lkotlin/reflect/KClass;)V", "", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "typeMap", "(Landroidx/navigation/fragment/DialogFragmentNavigator;Lkotlin/reflect/KClass;Ljava/util/Map;Lkotlin/reflect/KClass;)V", "build", "()Landroidx/navigation/fragment/DialogFragmentNavigator$Destination;", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDialogFragmentNavigatorDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogFragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/fragment/DialogFragmentNavigatorDestinationBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,197:1\n1#2:198\n*E\n"})
public final class DialogFragmentNavigatorDestinationBuilder extends NavDestinationBuilder {
    public final KClass i;

    @Deprecated(message = "Use routes to build your DialogFragmentNavigatorDestination instead", replaceWith = @ReplaceWith(expression = "DialogFragmentNavigatorDestinationBuilder(navigator, route = id.toString(), fragmentClass) ", imports = {}))
    public DialogFragmentNavigatorDestinationBuilder(@NotNull DialogFragmentNavigator dialogFragmentNavigator0, @IdRes int v, @NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(dialogFragmentNavigator0, "navigator");
        Intrinsics.checkNotNullParameter(kClass0, "fragmentClass");
        super(dialogFragmentNavigator0, v);
        this.i = kClass0;
    }

    public DialogFragmentNavigatorDestinationBuilder(@NotNull DialogFragmentNavigator dialogFragmentNavigator0, @NotNull String s, @NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(dialogFragmentNavigator0, "navigator");
        Intrinsics.checkNotNullParameter(s, "route");
        Intrinsics.checkNotNullParameter(kClass0, "fragmentClass");
        super(dialogFragmentNavigator0, s);
        this.i = kClass0;
    }

    public DialogFragmentNavigatorDestinationBuilder(@NotNull DialogFragmentNavigator dialogFragmentNavigator0, @NotNull KClass kClass0, @NotNull Map map0, @NotNull KClass kClass1) {
        Intrinsics.checkNotNullParameter(dialogFragmentNavigator0, "navigator");
        Intrinsics.checkNotNullParameter(kClass0, "route");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        Intrinsics.checkNotNullParameter(kClass1, "fragmentClass");
        super(dialogFragmentNavigator0, kClass0, map0);
        this.i = kClass1;
    }

    @Override  // androidx.navigation.NavDestinationBuilder
    public NavDestination build() {
        return this.build();
    }

    @NotNull
    public Destination build() {
        Destination dialogFragmentNavigator$Destination0 = (Destination)super.build();
        String s = JvmClassMappingKt.getJavaClass(this.i).getName();
        Intrinsics.checkNotNullExpressionValue(s, "fragmentClass.java.name");
        dialogFragmentNavigator$Destination0.setClassName(s);
        return dialogFragmentNavigator$Destination0;
    }
}

