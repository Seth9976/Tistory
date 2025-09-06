package androidx.activity;

import androidx.annotation.ColorInt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019J\u0017\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0006R\u001A\u0010\u000E\u001A\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR\u001A\u0010\u0011\u001A\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000F\u0010\u000B\u001A\u0004\b\u0010\u0010\rR&\u0010\u0018\u001A\u000E\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017¨\u0006\u001A"}, d2 = {"Landroidx/activity/SystemBarStyle;", "", "", "isDark", "", "getScrim$activity_release", "(Z)I", "getScrim", "getScrimWithEnforcedContrast$activity_release", "getScrimWithEnforcedContrast", "b", "I", "getDarkScrim$activity_release", "()I", "darkScrim", "c", "getNightMode$activity_release", "nightMode", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "d", "Lkotlin/jvm/functions/Function1;", "getDetectDarkMode$activity_release", "()Lkotlin/jvm/functions/Function1;", "detectDarkMode", "Companion", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SystemBarStyle {
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001J9\u0010\n\u001A\u00020\t2\b\b\u0001\u0010\u0003\u001A\u00020\u00022\b\b\u0001\u0010\u0004\u001A\u00020\u00022\u0014\b\u0002\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\n\u0010\u000BJ\u0019\u0010\r\u001A\u00020\t2\b\b\u0001\u0010\f\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000EJ#\u0010\u000F\u001A\u00020\t2\b\b\u0001\u0010\f\u001A\u00020\u00022\b\b\u0001\u0010\u0004\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/activity/SystemBarStyle$Companion;", "", "", "lightScrim", "darkScrim", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "detectDarkMode", "Landroidx/activity/SystemBarStyle;", "auto", "(IILkotlin/jvm/functions/Function1;)Landroidx/activity/SystemBarStyle;", "scrim", "dark", "(I)Landroidx/activity/SystemBarStyle;", "light", "(II)Landroidx/activity/SystemBarStyle;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmOverloads
        @JvmStatic
        @NotNull
        public final SystemBarStyle auto(@ColorInt int v, @ColorInt int v1) {
            return Companion.auto$default(this, v, v1, null, 4, null);
        }

        @JvmOverloads
        @JvmStatic
        @NotNull
        public final SystemBarStyle auto(@ColorInt int v, @ColorInt int v1, @NotNull Function1 function10) {
            Intrinsics.checkNotNullParameter(function10, "detectDarkMode");
            return new SystemBarStyle(v, v1, 0, function10, null);
        }

        public static SystemBarStyle auto$default(Companion systemBarStyle$Companion0, int v, int v1, Function1 function10, int v2, Object object0) {
            if((v2 & 4) != 0) {
                function10 = i0.w;
            }
            return systemBarStyle$Companion0.auto(v, v1, function10);
        }

        @JvmStatic
        @NotNull
        public final SystemBarStyle dark(@ColorInt int v) {
            return new SystemBarStyle(v, v, 2, j0.w, null);
        }

        @JvmStatic
        @NotNull
        public final SystemBarStyle light(@ColorInt int v, @ColorInt int v1) {
            return new SystemBarStyle(v, v1, 1, k0.w, null);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final int a;
    public final int b;
    public final int c;
    public final Function1 d;

    static {
        SystemBarStyle.Companion = new Companion(null);
    }

    public SystemBarStyle(int v, int v1, int v2, Function1 function10, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = function10;
    }

    @JvmOverloads
    @JvmStatic
    @NotNull
    public static final SystemBarStyle auto(@ColorInt int v, @ColorInt int v1) {
        return SystemBarStyle.Companion.auto(v, v1);
    }

    @JvmOverloads
    @JvmStatic
    @NotNull
    public static final SystemBarStyle auto(@ColorInt int v, @ColorInt int v1, @NotNull Function1 function10) {
        return SystemBarStyle.Companion.auto(v, v1, function10);
    }

    @JvmStatic
    @NotNull
    public static final SystemBarStyle dark(@ColorInt int v) {
        return SystemBarStyle.Companion.dark(v);
    }

    public final int getDarkScrim$activity_release() {
        return this.b;
    }

    @NotNull
    public final Function1 getDetectDarkMode$activity_release() {
        return this.d;
    }

    public final int getNightMode$activity_release() {
        return this.c;
    }

    // 去混淆评级： 低(20)
    public final int getScrim$activity_release(boolean z) {
        return z ? this.b : this.a;
    }

    public final int getScrimWithEnforcedContrast$activity_release(boolean z) {
        if(this.c == 0) {
            return 0;
        }
        return z ? this.b : this.a;
    }

    @JvmStatic
    @NotNull
    public static final SystemBarStyle light(@ColorInt int v, @ColorInt int v1) {
        return SystemBarStyle.Companion.light(v, v1);
    }
}

