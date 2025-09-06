package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\u001A\'\u0010\u0007\u001A\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00012\b\b\u0002\u0010\u0003\u001A\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\u000F\u001A\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u000E\u001A\u0004\b\u000B\u0010\f\" \u0010\u0013\u001A\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u0012\u0004\b\u0012\u0010\u000E\u001A\u0004\b\u0011\u0010\f¨\u0006\u0014"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/activity/SystemBarStyle;", "statusBarStyle", "navigationBarStyle", "", "enable", "(Landroidx/activity/ComponentActivity;Landroidx/activity/SystemBarStyle;Landroidx/activity/SystemBarStyle;)V", "enableEdgeToEdge", "", "a", "I", "getDefaultLightScrim", "()I", "getDefaultLightScrim$annotations", "()V", "DefaultLightScrim", "b", "getDefaultDarkScrim", "getDefaultDarkScrim$annotations", "DefaultDarkScrim", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "EdgeToEdge")
@SourceDebugExtension({"SMAP\nEdgeToEdge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EdgeToEdge.kt\nandroidx/activity/EdgeToEdge\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"})
public final class EdgeToEdge {
    public static final int a;
    public static final int b;

    static {
        EdgeToEdge.a = Color.argb(230, 0xFF, 0xFF, 0xFF);
        EdgeToEdge.b = Color.argb(0x80, 27, 27, 27);
    }

    @JvmName(name = "enable")
    @JvmOverloads
    public static final void enable(@NotNull ComponentActivity componentActivity0) {
        Intrinsics.checkNotNullParameter(componentActivity0, "<this>");
        EdgeToEdge.enable$default(componentActivity0, null, null, 3, null);
    }

    @JvmName(name = "enable")
    @JvmOverloads
    public static final void enable(@NotNull ComponentActivity componentActivity0, @NotNull SystemBarStyle systemBarStyle0) {
        Intrinsics.checkNotNullParameter(componentActivity0, "<this>");
        Intrinsics.checkNotNullParameter(systemBarStyle0, "statusBarStyle");
        EdgeToEdge.enable$default(componentActivity0, systemBarStyle0, null, 2, null);
    }

    @JvmName(name = "enable")
    @JvmOverloads
    public static final void enable(@NotNull ComponentActivity componentActivity0, @NotNull SystemBarStyle systemBarStyle0, @NotNull SystemBarStyle systemBarStyle1) {
        o o0;
        Intrinsics.checkNotNullParameter(componentActivity0, "<this>");
        Intrinsics.checkNotNullParameter(systemBarStyle0, "statusBarStyle");
        Intrinsics.checkNotNullParameter(systemBarStyle1, "navigationBarStyle");
        View view0 = componentActivity0.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(view0, "window.decorView");
        Resources resources0 = view0.getResources();
        Intrinsics.checkNotNullExpressionValue(resources0, "view.resources");
        boolean z = ((Boolean)systemBarStyle0.getDetectDarkMode$activity_release().invoke(resources0)).booleanValue();
        Resources resources1 = view0.getResources();
        Intrinsics.checkNotNullExpressionValue(resources1, "view.resources");
        boolean z1 = ((Boolean)systemBarStyle1.getDetectDarkMode$activity_release().invoke(resources1)).booleanValue();
        int v = Build.VERSION.SDK_INT;
        if(v >= 30) {
            o0 = new u();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        else if(v >= 29) {
            o0 = new t();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        else if(v >= 28) {
            o0 = new q();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        else {
            o0 = new o();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        Window window0 = componentActivity0.getWindow();
        Intrinsics.checkNotNullExpressionValue(window0, "window");
        o0.setUp(systemBarStyle0, systemBarStyle1, window0, view0, z, z1);
        Window window1 = componentActivity0.getWindow();
        Intrinsics.checkNotNullExpressionValue(window1, "window");
        o0.adjustLayoutInDisplayCutoutMode(window1);
    }

    public static void enable$default(ComponentActivity componentActivity0, SystemBarStyle systemBarStyle0, SystemBarStyle systemBarStyle1, int v, Object object0) {
        if((v & 1) != 0) {
            systemBarStyle0 = Companion.auto$default(SystemBarStyle.Companion, 0, 0, null, 4, null);
        }
        if((v & 2) != 0) {
            systemBarStyle1 = Companion.auto$default(SystemBarStyle.Companion, EdgeToEdge.a, EdgeToEdge.b, null, 4, null);
        }
        EdgeToEdge.enable(componentActivity0, systemBarStyle0, systemBarStyle1);
    }

    public static final int getDefaultDarkScrim() {
        return EdgeToEdge.b;
    }

    @VisibleForTesting
    public static void getDefaultDarkScrim$annotations() {
    }

    public static final int getDefaultLightScrim() {
        return EdgeToEdge.a;
    }

    @VisibleForTesting
    public static void getDefaultLightScrim$annotations() {
    }
}

