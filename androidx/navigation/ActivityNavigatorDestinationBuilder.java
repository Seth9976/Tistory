package androidx.navigation;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.IdRes;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@NavDestinationDsl
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001B\b\u0017\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u0007\u0010\u000BB>\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u000E\u0010\n\u001A\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\u0012\u001B\u0010\u0012\u001A\u0017\u0012\u0004\u0012\u00020\u000F\u0012\r\u0012\u000B\u0012\u0002\b\u00030\u0010¢\u0006\u0002\b\u00110\u000E¢\u0006\u0004\b\u0007\u0010\u0013J\u000F\u0010\u0014\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u001C\u001A\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\u001BR,\u0010$\u001A\f\u0012\u0006\b\u0001\u0012\u00020\u001D\u0018\u00010\f8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010(\u001A\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b%\u0010\u0017\u001A\u0004\b&\u0010\u0019\"\u0004\b\'\u0010\u001BR$\u00100\u001A\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00104\u001A\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b1\u0010\u0017\u001A\u0004\b2\u0010\u0019\"\u0004\b3\u0010\u001B¨\u00065"}, d2 = {"Landroidx/navigation/ActivityNavigatorDestinationBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/ActivityNavigator$Destination;", "Landroidx/navigation/ActivityNavigator;", "navigator", "", "id", "<init>", "(Landroidx/navigation/ActivityNavigator;I)V", "", "route", "(Landroidx/navigation/ActivityNavigator;Ljava/lang/String;)V", "Lkotlin/reflect/KClass;", "", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "typeMap", "(Landroidx/navigation/ActivityNavigator;Lkotlin/reflect/KClass;Ljava/util/Map;)V", "build", "()Landroidx/navigation/ActivityNavigator$Destination;", "j", "Ljava/lang/String;", "getTargetPackage", "()Ljava/lang/String;", "setTargetPackage", "(Ljava/lang/String;)V", "targetPackage", "Landroid/app/Activity;", "k", "Lkotlin/reflect/KClass;", "getActivityClass", "()Lkotlin/reflect/KClass;", "setActivityClass", "(Lkotlin/reflect/KClass;)V", "activityClass", "l", "getAction", "setAction", "action", "Landroid/net/Uri;", "m", "Landroid/net/Uri;", "getData", "()Landroid/net/Uri;", "setData", "(Landroid/net/Uri;)V", "data", "n", "getDataPattern", "setDataPattern", "dataPattern", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ActivityNavigatorDestinationBuilder extends NavDestinationBuilder {
    public final Context i;
    public String j;
    public KClass k;
    public String l;
    public Uri m;
    public String n;

    @Deprecated(message = "Use routes to create your ActivityNavigatorDestinationBuilder instead", replaceWith = @ReplaceWith(expression = "ActivityNavigatorDestinationBuilder(navigator, route = id.toString())", imports = {}))
    public ActivityNavigatorDestinationBuilder(@NotNull ActivityNavigator activityNavigator0, @IdRes int v) {
        Intrinsics.checkNotNullParameter(activityNavigator0, "navigator");
        super(activityNavigator0, v);
        this.i = activityNavigator0.getContext();
    }

    public ActivityNavigatorDestinationBuilder(@NotNull ActivityNavigator activityNavigator0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(activityNavigator0, "navigator");
        Intrinsics.checkNotNullParameter(s, "route");
        super(activityNavigator0, s);
        this.i = activityNavigator0.getContext();
    }

    public ActivityNavigatorDestinationBuilder(@NotNull ActivityNavigator activityNavigator0, @NotNull KClass kClass0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(activityNavigator0, "navigator");
        Intrinsics.checkNotNullParameter(kClass0, "route");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        super(activityNavigator0, kClass0, map0);
        this.i = activityNavigator0.getContext();
    }

    @NotNull
    public Destination build() {
        Destination activityNavigator$Destination0 = (Destination)super.build();
        activityNavigator$Destination0.setTargetPackage(this.j);
        KClass kClass0 = this.k;
        if(kClass0 != null) {
            Class class0 = JvmClassMappingKt.getJavaClass(kClass0);
            activityNavigator$Destination0.setComponentName(new ComponentName(this.i, class0));
        }
        activityNavigator$Destination0.setAction(this.l);
        activityNavigator$Destination0.setData(this.m);
        activityNavigator$Destination0.setDataPattern(this.n);
        return activityNavigator$Destination0;
    }

    @Override  // androidx.navigation.NavDestinationBuilder
    public NavDestination build() {
        return this.build();
    }

    @Nullable
    public final String getAction() {
        return this.l;
    }

    @Nullable
    public final KClass getActivityClass() {
        return this.k;
    }

    @Nullable
    public final Uri getData() {
        return this.m;
    }

    @Nullable
    public final String getDataPattern() {
        return this.n;
    }

    @Nullable
    public final String getTargetPackage() {
        return this.j;
    }

    public final void setAction(@Nullable String s) {
        this.l = s;
    }

    public final void setActivityClass(@Nullable KClass kClass0) {
        this.k = kClass0;
    }

    public final void setData(@Nullable Uri uri0) {
        this.m = uri0;
    }

    public final void setDataPattern(@Nullable String s) {
        this.n = s;
    }

    public final void setTargetPackage(@Nullable String s) {
        this.j = s;
    }
}

