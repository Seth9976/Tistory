package androidx.navigation.ui;

import android.view.Menu;
import androidx.customview.widget.Openable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import java.util.HashSet;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u001E\u001FJ\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001D\u0010\r\u001A\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u0019\u0010\u0013\u001A\u0004\u0018\u00010\u000E8\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0019\u001A\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R\u0013\u0010\u001D\u001A\u0004\u0018\u00010\u001A8G¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u001C¨\u0006 "}, d2 = {"Landroidx/navigation/ui/AppBarConfiguration;", "", "Landroidx/navigation/NavDestination;", "destination", "", "isTopLevelDestination", "(Landroidx/navigation/NavDestination;)Z", "", "", "a", "Ljava/util/Set;", "getTopLevelDestinations", "()Ljava/util/Set;", "topLevelDestinations", "Landroidx/customview/widget/Openable;", "b", "Landroidx/customview/widget/Openable;", "getOpenableLayout", "()Landroidx/customview/widget/Openable;", "openableLayout", "Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;", "c", "Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;", "getFallbackOnNavigateUpListener", "()Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;", "fallbackOnNavigateUpListener", "Landroidx/drawerlayout/widget/DrawerLayout;", "getDrawerLayout", "()Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout", "Builder", "OnNavigateUpListener", "navigation-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAppBarConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfiguration\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,306:1\n1229#2,2:307\n*S KotlinDebug\n*F\n+ 1 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfiguration\n*L\n103#1:307,2\n*E\n"})
public final class AppBarConfiguration {
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0015\b\u0016\u0012\n\u0010\u000B\u001A\u00020\t\"\u00020\n¢\u0006\u0004\b\u0004\u0010\fB\u0017\b\u0016\u0012\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u0004\u0010\u000EJ\u0019\u0010\u0011\u001A\u00020\u00002\b\u0010\u0010\u001A\u0004\u0018\u00010\u000FH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001A\u00020\u00002\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001A\u00020\u00002\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001AJ\r\u0010\u001C\u001A\u00020\u001B¢\u0006\u0004\b\u001C\u0010\u001D¨\u0006\u001E"}, d2 = {"Landroidx/navigation/ui/AppBarConfiguration$Builder;", "", "Landroidx/navigation/NavGraph;", "navGraph", "<init>", "(Landroidx/navigation/NavGraph;)V", "Landroid/view/Menu;", "topLevelMenu", "(Landroid/view/Menu;)V", "", "", "topLevelDestinationIds", "([I)V", "", "(Ljava/util/Set;)V", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout", "setDrawerLayout", "(Landroidx/drawerlayout/widget/DrawerLayout;)Landroidx/navigation/ui/AppBarConfiguration$Builder;", "Landroidx/customview/widget/Openable;", "openableLayout", "setOpenableLayout", "(Landroidx/customview/widget/Openable;)Landroidx/navigation/ui/AppBarConfiguration$Builder;", "Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;", "fallbackOnNavigateUpListener", "setFallbackOnNavigateUpListener", "(Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;)Landroidx/navigation/ui/AppBarConfiguration$Builder;", "Landroidx/navigation/ui/AppBarConfiguration;", "build", "()Landroidx/navigation/ui/AppBarConfiguration;", "navigation-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Builder {
        public final HashSet a;
        public Openable b;
        public OnNavigateUpListener c;

        public Builder(@NotNull Menu menu0) {
            Intrinsics.checkNotNullParameter(menu0, "topLevelMenu");
            super();
            this.a = new HashSet();
            int v = menu0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                Integer integer0 = menu0.getItem(v1).getItemId();
                this.a.add(integer0);
            }
        }

        public Builder(@NotNull NavGraph navGraph0) {
            Intrinsics.checkNotNullParameter(navGraph0, "navGraph");
            super();
            HashSet hashSet0 = new HashSet();
            this.a = hashSet0;
            hashSet0.add(NavGraph.Companion.findStartDestination(navGraph0).getId());
        }

        public Builder(@NotNull Set set0) {
            Intrinsics.checkNotNullParameter(set0, "topLevelDestinationIds");
            super();
            HashSet hashSet0 = new HashSet();
            this.a = hashSet0;
            hashSet0.addAll(set0);
        }

        public Builder(@NotNull int[] arr_v) {
            Intrinsics.checkNotNullParameter(arr_v, "topLevelDestinationIds");
            super();
            this.a = new HashSet();
            for(int v = 0; v < arr_v.length; ++v) {
                this.a.add(((int)arr_v[v]));
            }
        }

        @NotNull
        public final AppBarConfiguration build() {
            return new AppBarConfiguration(this.a, this.b, this.c, null);
        }

        @Deprecated(message = "Use {@link #setOpenableLayout(Openable)}.")
        @NotNull
        public final Builder setDrawerLayout(@Nullable DrawerLayout drawerLayout0) {
            this.b = drawerLayout0;
            return this;
        }

        @NotNull
        public final Builder setFallbackOnNavigateUpListener(@Nullable OnNavigateUpListener appBarConfiguration$OnNavigateUpListener0) {
            this.c = appBarConfiguration$OnNavigateUpListener0;
            return this;
        }

        @NotNull
        public final Builder setOpenableLayout(@Nullable Openable openable0) {
            this.b = openable0;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;", "", "onNavigateUp", "", "navigation-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface OnNavigateUpListener {
        boolean onNavigateUp();
    }

    public final Set a;
    public final Openable b;
    public final OnNavigateUpListener c;

    public AppBarConfiguration(Set set0, Openable openable0, OnNavigateUpListener appBarConfiguration$OnNavigateUpListener0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = set0;
        this.b = openable0;
        this.c = appBarConfiguration$OnNavigateUpListener0;
    }

    // 去混淆评级： 低(20)
    @Deprecated(message = "Use {@link #getOpenableLayout()}.")
    @Nullable
    public final DrawerLayout getDrawerLayout() {
        return this.b instanceof DrawerLayout ? ((DrawerLayout)this.b) : null;
    }

    @Nullable
    public final OnNavigateUpListener getFallbackOnNavigateUpListener() {
        return this.c;
    }

    @Nullable
    public final Openable getOpenableLayout() {
        return this.b;
    }

    @NotNull
    public final Set getTopLevelDestinations() {
        return this.a;
    }

    public final boolean isTopLevelDestination(@NotNull NavDestination navDestination0) {
        Intrinsics.checkNotNullParameter(navDestination0, "destination");
        for(Object object0: NavDestination.Companion.getHierarchy(navDestination0)) {
            NavDestination navDestination1 = (NavDestination)object0;
            if(this.a.contains(navDestination1.getId()) && (!(navDestination1 instanceof NavGraph) || navDestination0.getId() == NavGraph.Companion.findStartDestination(((NavGraph)navDestination1)).getId())) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }
}

