package androidx.navigation.ui;

import android.view.Menu;
import androidx.customview.widget.Openable;
import androidx.navigation.NavGraph;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\u001A0\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\u000E\b\n\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086\bø\u0001\u0000\u001A0\u0010\u0000\u001A\u00020\u00012\u0006\u0010\t\u001A\u00020\n2\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\u000E\b\n\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086\bø\u0001\u0000\u001A6\u0010\u0000\u001A\u00020\u00012\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\u000E\b\n\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000E"}, d2 = {"AppBarConfiguration", "Landroidx/navigation/ui/AppBarConfiguration;", "topLevelMenu", "Landroid/view/Menu;", "drawerLayout", "Landroidx/customview/widget/Openable;", "fallbackOnNavigateUpListener", "Lkotlin/Function0;", "", "navGraph", "Landroidx/navigation/NavGraph;", "topLevelDestinationIds", "", "", "navigation-ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AppBarConfigurationKt {
    @NotNull
    public static final AppBarConfiguration AppBarConfiguration(@NotNull Menu menu0, @Nullable Openable openable0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(menu0, "topLevelMenu");
        Intrinsics.checkNotNullParameter(function00, "fallbackOnNavigateUpListener");
        return new Builder(menu0).setOpenableLayout(openable0).setFallbackOnNavigateUpListener(new AppBarConfigurationKt.sam.i.androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener.0(function00)).build();
    }

    @NotNull
    public static final AppBarConfiguration AppBarConfiguration(@NotNull NavGraph navGraph0, @Nullable Openable openable0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(navGraph0, "navGraph");
        Intrinsics.checkNotNullParameter(function00, "fallbackOnNavigateUpListener");
        return new Builder(navGraph0).setOpenableLayout(openable0).setFallbackOnNavigateUpListener(new AppBarConfigurationKt.sam.i.androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener.0(function00)).build();
    }

    @NotNull
    public static final AppBarConfiguration AppBarConfiguration(@NotNull Set set0, @Nullable Openable openable0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(set0, "topLevelDestinationIds");
        Intrinsics.checkNotNullParameter(function00, "fallbackOnNavigateUpListener");
        return new Builder(set0).setOpenableLayout(openable0).setFallbackOnNavigateUpListener(new AppBarConfigurationKt.sam.i.androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener.0(function00)).build();
    }

    public static AppBarConfiguration AppBarConfiguration$default(Menu menu0, Openable openable0, Function0 function00, int v, Object object0) {
        if((v & 2) != 0) {
            openable0 = null;
        }
        if((v & 4) != 0) {
            function00 = androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.2.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(menu0, "topLevelMenu");
        Intrinsics.checkNotNullParameter(function00, "fallbackOnNavigateUpListener");
        return new Builder(menu0).setOpenableLayout(openable0).setFallbackOnNavigateUpListener(new AppBarConfigurationKt.sam.i.androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener.0(function00)).build();

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nAppBarConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt$AppBarConfiguration$2\n*L\n1#1,306:1\n*E\n"})
        public final class androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.2 extends Lambda implements Function0 {
            public static final androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.2 INSTANCE;

            static {
                androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.2.INSTANCE = new androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.2();
            }

            public androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.2() {
                super(0);
            }

            @NotNull
            public final Boolean invoke() {
                return false;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        }

    }

    public static AppBarConfiguration AppBarConfiguration$default(NavGraph navGraph0, Openable openable0, Function0 function00, int v, Object object0) {
        if((v & 2) != 0) {
            openable0 = null;
        }
        if((v & 4) != 0) {
            function00 = androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.1.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(navGraph0, "navGraph");
        Intrinsics.checkNotNullParameter(function00, "fallbackOnNavigateUpListener");
        return new Builder(navGraph0).setOpenableLayout(openable0).setFallbackOnNavigateUpListener(new AppBarConfigurationKt.sam.i.androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener.0(function00)).build();

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nAppBarConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt$AppBarConfiguration$1\n*L\n1#1,306:1\n*E\n"})
        public final class androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.1 extends Lambda implements Function0 {
            public static final androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.1 INSTANCE;

            static {
                androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.1.INSTANCE = new androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.1();
            }

            public androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.1() {
                super(0);
            }

            @NotNull
            public final Boolean invoke() {
                return false;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        }

    }

    public static AppBarConfiguration AppBarConfiguration$default(Set set0, Openable openable0, Function0 function00, int v, Object object0) {
        if((v & 2) != 0) {
            openable0 = null;
        }
        if((v & 4) != 0) {
            function00 = androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.3.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(set0, "topLevelDestinationIds");
        Intrinsics.checkNotNullParameter(function00, "fallbackOnNavigateUpListener");
        return new Builder(set0).setOpenableLayout(openable0).setFallbackOnNavigateUpListener(new AppBarConfigurationKt.sam.i.androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener.0(function00)).build();

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nAppBarConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt$AppBarConfiguration$3\n*L\n1#1,306:1\n*E\n"})
        public final class androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.3 extends Lambda implements Function0 {
            public static final androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.3 INSTANCE;

            static {
                androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.3.INSTANCE = new androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.3();
            }

            public androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.3() {
                super(0);
            }

            @NotNull
            public final Boolean invoke() {
                return false;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        }

    }
}

