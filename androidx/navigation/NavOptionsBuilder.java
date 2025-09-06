package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.p;
import n4.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@NavOptionsDsl
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b-\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000B\u001A\u00020\b2\b\b\u0001\u0010\u0005\u001A\u00020\u00042\u0019\b\u0002\u0010\n\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00A2\u0006\u0002\b\t\u00A2\u0006\u0004\b\u000B\u0010\fJ0\u0010\u000B\u001A\u00020\b2\u0006\u0010\u000E\u001A\u00020\r2\u0019\b\u0002\u0010\n\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00A2\u0006\u0002\b\t\u00A2\u0006\u0004\b\u000B\u0010\u000FJ:\u0010\u000B\u001A\u00020\b\"\n\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00012\u0019\b\n\u0010\n\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00A2\u0006\u0002\b\tH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000B\u0010\u0011J@\u0010\u000B\u001A\u00020\b\"\b\b\u0000\u0010\u0010*\u00020\u00012\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u00122\u0017\u0010\n\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00A2\u0006\u0002\b\tH\u0007\u00A2\u0006\u0004\b\u000B\u0010\u0014J:\u0010\u000B\u001A\u00020\b\"\b\b\u0000\u0010\u0010*\u00020\u00012\u0006\u0010\u000E\u001A\u00028\u00002\u0019\b\u0002\u0010\n\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00A2\u0006\u0002\b\t\u00A2\u0006\u0004\b\u000B\u0010\u0015J&\u0010\u0018\u001A\u00020\b2\u0017\u0010\u0017\u001A\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u0006\u00A2\u0006\u0002\b\t\u00A2\u0006\u0004\b\u0018\u0010\u0011J\u000F\u0010\u001C\u001A\u00020\u0019H\u0000\u00A2\u0006\u0004\b\u001A\u0010\u001BR\"\u0010$\u001A\u00020\u001D8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010)\u001A\u00020\u001D2\u0006\u0010%\u001A\u00020\u001D8F@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\b&\u0010\u001F\u001A\u0004\b\'\u0010!\"\u0004\b(\u0010#R*\u00101\u001A\u00020\u00042\u0006\u0010*\u001A\u00020\u00048\u0006@@X\u0087\u000E\u00A2\u0006\u0012\n\u0004\b+\u0010,\u001A\u0004\b-\u0010.\"\u0004\b/\u00100R.\u00108\u001A\u0004\u0018\u00010\r2\b\u0010*\u001A\u0004\u0018\u00010\r8\u0006@BX\u0086\u000E\u00A2\u0006\u0012\n\u0004\b2\u00103\u001A\u0004\b4\u00105\"\u0004\b6\u00107R6\u0010?\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u00122\f\u0010*\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u00128F@BX\u0086\u000E\u00A2\u0006\u0012\n\u0004\b9\u0010:\u001A\u0004\b;\u0010<\"\u0004\b=\u0010>R.\u0010F\u001A\u0004\u0018\u00010\u00012\b\u0010*\u001A\u0004\u0018\u00010\u00018F@BX\u0086\u000E\u00A2\u0006\u0012\n\u0004\b@\u0010A\u001A\u0004\bB\u0010C\"\u0004\bD\u0010ER*\u0010\u000B\u001A\u00020\u00042\u0006\u0010*\u001A\u00020\u00048F@GX\u0087\u000E\u00A2\u0006\u0012\u0012\u0004\bI\u0010\u0003\u001A\u0004\bG\u0010.\"\u0004\bH\u00100\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006J"}, d2 = {"Landroidx/navigation/NavOptionsBuilder;", "", "<init>", "()V", "", "id", "Lkotlin/Function1;", "Landroidx/navigation/PopUpToBuilder;", "", "Lkotlin/ExtensionFunctionType;", "popUpToBuilder", "popUpTo", "(ILkotlin/jvm/functions/Function1;)V", "", "route", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "T", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/reflect/KClass;", "klass", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Landroidx/navigation/AnimBuilder;", "animBuilder", "anim", "Landroidx/navigation/NavOptions;", "build$navigation_common_release", "()Landroidx/navigation/NavOptions;", "build", "", "b", "Z", "getLaunchSingleTop", "()Z", "setLaunchSingleTop", "(Z)V", "launchSingleTop", "<set-?>", "c", "getRestoreState", "setRestoreState", "restoreState", "value", "d", "I", "getPopUpToId", "()I", "setPopUpToId$navigation_common_release", "(I)V", "popUpToId", "e", "Ljava/lang/String;", "getPopUpToRoute", "()Ljava/lang/String;", "setPopUpToRoute", "(Ljava/lang/String;)V", "popUpToRoute", "h", "Lkotlin/reflect/KClass;", "getPopUpToRouteClass", "()Lkotlin/reflect/KClass;", "setPopUpToRouteClass", "(Lkotlin/reflect/KClass;)V", "popUpToRouteClass", "i", "Ljava/lang/Object;", "getPopUpToRouteObject", "()Ljava/lang/Object;", "setPopUpToRouteObject", "(Ljava/lang/Object;)V", "popUpToRouteObject", "getPopUpTo", "setPopUpTo", "getPopUpTo$annotations", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavOptionsBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavOptionsBuilder.kt\nandroidx/navigation/NavOptionsBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
public final class NavOptionsBuilder {
    public final Builder a;
    public boolean b;
    public boolean c;
    public int d;
    public String e;
    public boolean f;
    public boolean g;
    public KClass h;
    public Object i;

    public NavOptionsBuilder() {
        this.a = new Builder();
        this.d = -1;
    }

    public final void anim(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "animBuilder");
        AnimBuilder animBuilder0 = new AnimBuilder();
        function10.invoke(animBuilder0);
        this.a.setEnterAnim(animBuilder0.getEnter()).setExitAnim(animBuilder0.getExit()).setPopEnterAnim(animBuilder0.getPopEnter()).setPopExitAnim(animBuilder0.getPopExit());
    }

    @NotNull
    public final NavOptions build$navigation_common_release() {
        Builder navOptions$Builder0 = this.a;
        navOptions$Builder0.setLaunchSingleTop(this.b);
        navOptions$Builder0.setRestoreState(this.c);
        String s = this.e;
        if(s != null) {
            navOptions$Builder0.setPopUpTo(s, this.f, this.g);
            return navOptions$Builder0.build();
        }
        KClass kClass0 = this.h;
        if(kClass0 != null) {
            Intrinsics.checkNotNull(kClass0);
            navOptions$Builder0.setPopUpTo(kClass0, this.f, this.g);
            return navOptions$Builder0.build();
        }
        Object object0 = this.i;
        if(object0 != null) {
            Intrinsics.checkNotNull(object0);
            navOptions$Builder0.setPopUpTo(object0, this.f, this.g);
            return navOptions$Builder0.build();
        }
        navOptions$Builder0.setPopUpTo(this.d, this.f, this.g);
        return navOptions$Builder0.build();
    }

    public final boolean getLaunchSingleTop() {
        return this.b;
    }

    public final int getPopUpTo() {
        return this.d;
    }

    @Deprecated(message = "Use the popUpToId property.")
    public static void getPopUpTo$annotations() {
    }

    public final int getPopUpToId() {
        return this.d;
    }

    @Nullable
    public final String getPopUpToRoute() {
        return this.e;
    }

    @Nullable
    public final KClass getPopUpToRouteClass() {
        return this.h;
    }

    @Nullable
    public final Object getPopUpToRouteObject() {
        return this.i;
    }

    public final boolean getRestoreState() {
        return this.c;
    }

    public final void popUpTo(@IdRes int v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "popUpToBuilder");
        this.setPopUpToId$navigation_common_release(v);
        PopUpToBuilder popUpToBuilder0 = new PopUpToBuilder();
        function10.invoke(popUpToBuilder0);
        this.f = popUpToBuilder0.getInclusive();
        this.g = popUpToBuilder0.getSaveState();
    }

    public final void popUpTo(@NotNull Object object0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(object0, "route");
        Intrinsics.checkNotNullParameter(function10, "popUpToBuilder");
        if(object0 != null) {
            this.i = object0;
            this.f = false;
        }
        this.setPopUpToId$navigation_common_release(-1);
        PopUpToBuilder popUpToBuilder0 = new PopUpToBuilder();
        function10.invoke(popUpToBuilder0);
        this.f = popUpToBuilder0.getInclusive();
        this.g = popUpToBuilder0.getSaveState();
    }

    public final void popUpTo(@NotNull String s, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "route");
        Intrinsics.checkNotNullParameter(function10, "popUpToBuilder");
        if(s != null) {
            if(p.isBlank(s)) {
                throw new IllegalArgumentException("Cannot pop up to an empty route");
            }
            this.e = s;
            this.f = false;
        }
        this.setPopUpToId$navigation_common_release(-1);
        PopUpToBuilder popUpToBuilder0 = new PopUpToBuilder();
        function10.invoke(popUpToBuilder0);
        this.f = popUpToBuilder0.getInclusive();
        this.g = popUpToBuilder0.getSaveState();
    }

    public final void popUpTo(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "popUpToBuilder");
        Intrinsics.reifiedOperationMarker(4, "T");
        this.popUpTo(Reflection.getOrCreateKotlinClass(Object.class), function10);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final void popUpTo(@NotNull KClass kClass0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(kClass0, "klass");
        Intrinsics.checkNotNullParameter(function10, "popUpToBuilder");
        if(kClass0 != null) {
            this.h = kClass0;
            this.f = false;
        }
        this.setPopUpToId$navigation_common_release(-1);
        PopUpToBuilder popUpToBuilder0 = new PopUpToBuilder();
        function10.invoke(popUpToBuilder0);
        this.f = popUpToBuilder0.getInclusive();
        this.g = popUpToBuilder0.getSaveState();
    }

    public static void popUpTo$default(NavOptionsBuilder navOptionsBuilder0, int v, Function1 function10, int v1, Object object0) {
        if((v1 & 2) != 0) {
            function10 = a.F;
        }
        navOptionsBuilder0.popUpTo(v, function10);
    }

    public static void popUpTo$default(NavOptionsBuilder navOptionsBuilder0, Object object0, Function1 function10, int v, Object object1) {
        if((v & 2) != 0) {
            function10 = a.H;
        }
        navOptionsBuilder0.popUpTo(object0, function10);
    }

    public static void popUpTo$default(NavOptionsBuilder navOptionsBuilder0, String s, Function1 function10, int v, Object object0) {
        if((v & 2) != 0) {
            function10 = a.G;
        }
        navOptionsBuilder0.popUpTo(s, function10);
    }

    public static void popUpTo$default(NavOptionsBuilder navOptionsBuilder0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = androidx.navigation.NavOptionsBuilder.popUpTo.3.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(function10, "popUpToBuilder");
        Intrinsics.reifiedOperationMarker(4, "T");
        navOptionsBuilder0.popUpTo(Reflection.getOrCreateKotlinClass(Object.class), function10);

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "", "Landroidx/navigation/PopUpToBuilder;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nNavOptionsBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavOptionsBuilder.kt\nandroidx/navigation/NavOptionsBuilder$popUpTo$3\n*L\n1#1,272:1\n*E\n"})
        public final class androidx.navigation.NavOptionsBuilder.popUpTo.3 extends Lambda implements Function1 {
            public static final androidx.navigation.NavOptionsBuilder.popUpTo.3 INSTANCE;

            static {
                androidx.navigation.NavOptionsBuilder.popUpTo.3.INSTANCE = new androidx.navigation.NavOptionsBuilder.popUpTo.3();
            }

            public androidx.navigation.NavOptionsBuilder.popUpTo.3() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((PopUpToBuilder)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PopUpToBuilder popUpToBuilder0) {
                Intrinsics.checkNotNullParameter(popUpToBuilder0, "$this$null");
            }
        }

    }

    public final void setLaunchSingleTop(boolean z) {
        this.b = z;
    }

    @Deprecated(message = "Use the popUpTo function and passing in the id.")
    public final void setPopUpTo(int v) {
        NavOptionsBuilder.popUpTo$default(this, v, null, 2, null);
    }

    public final void setPopUpToId$navigation_common_release(int v) {
        this.d = v;
        this.f = false;
    }

    public final void setRestoreState(boolean z) {
        this.c = z;
    }
}

