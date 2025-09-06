package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\".\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00008\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "a", "Lkotlin/jvm/functions/Function1;", "getPlatformTextInputServiceInterceptor", "()Lkotlin/jvm/functions/Function1;", "setPlatformTextInputServiceInterceptor", "(Lkotlin/jvm/functions/Function1;)V", "platformTextInputServiceInterceptor", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,2769:1\n42#2,2:2770\n42#2,2:2772\n42#2,2:2774\n42#2,2:2776\n42#2,2:2778\n42#2,2:2780\n42#2,2:2782\n42#2,2:2784\n42#2,2:2786\n42#2,2:2788\n42#2,2:2790\n42#2,2:2792\n42#2,2:2794\n42#2,2:2796\n42#2,2:2798\n42#2,2:2800\n39#2:2802\n39#2:2803\n39#2:2804\n39#2:2805\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n*L\n2527#1:2770,2\n2528#1:2772,2\n2529#1:2774,2\n2530#1:2776,2\n2531#1:2778,2\n2532#1:2780,2\n2533#1:2782,2\n2534#1:2784,2\n2535#1:2786,2\n2536#1:2788,2\n2537#1:2790,2\n2538#1:2792,2\n2539#1:2794,2\n2540#1:2796,2\n2541#1:2798,2\n2542#1:2800,2\n2556#1:2802\n2557#1:2803\n2558#1:2804\n2559#1:2805\n*E\n"})
public final class AndroidComposeView_androidKt {
    public static Function1 a;

    static {
        AndroidComposeView_androidKt.a = f.E;
    }

    public static final float a(float[] arr_f, int v, float[] arr_f1, int v1) {
        return arr_f[v * 4 + 3] * arr_f1[v1 + 12] + (arr_f[v * 4 + 2] * arr_f1[v1 + 8] + (arr_f[v * 4 + 1] * arr_f1[v1 + 4] + arr_f[v * 4] * arr_f1[v1]));
    }

    public static final boolean access$containsDescendant(View view0, View view1) {
        if(!Intrinsics.areEqual(view1, view0)) {
            for(ViewParent viewParent0 = view1.getParent(); viewParent0 != null; viewParent0 = viewParent0.getParent()) {
                if(viewParent0 == view0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final ContentCaptureSessionCompat access$getContentCaptureSessionCompat(View view0) {
        ViewCompatShims.setImportantForContentCapture(view0, 1);
        return ViewCompatShims.getContentCaptureSession(view0);
    }

    public static final void access$preTranslate-cG2Xzmc(float[] arr_f, float f, float f1, float[] arr_f1) {
        Matrix.reset-impl(arr_f1);
        Matrix.translate-impl$default(arr_f1, f, f1, 0.0f, 4, null);
        AndroidComposeView_androidKt.b(arr_f, arr_f1);
    }

    public static final void b(float[] arr_f, float[] arr_f1) {
        float f = AndroidComposeView_androidKt.a(arr_f1, 0, arr_f, 0);
        float f1 = AndroidComposeView_androidKt.a(arr_f1, 0, arr_f, 1);
        float f2 = AndroidComposeView_androidKt.a(arr_f1, 0, arr_f, 2);
        float f3 = AndroidComposeView_androidKt.a(arr_f1, 0, arr_f, 3);
        float f4 = AndroidComposeView_androidKt.a(arr_f1, 1, arr_f, 0);
        float f5 = AndroidComposeView_androidKt.a(arr_f1, 1, arr_f, 1);
        float f6 = AndroidComposeView_androidKt.a(arr_f1, 1, arr_f, 2);
        float f7 = AndroidComposeView_androidKt.a(arr_f1, 1, arr_f, 3);
        float f8 = AndroidComposeView_androidKt.a(arr_f1, 2, arr_f, 0);
        float f9 = AndroidComposeView_androidKt.a(arr_f1, 2, arr_f, 1);
        float f10 = AndroidComposeView_androidKt.a(arr_f1, 2, arr_f, 2);
        float f11 = AndroidComposeView_androidKt.a(arr_f1, 2, arr_f, 3);
        float f12 = AndroidComposeView_androidKt.a(arr_f1, 3, arr_f, 0);
        float f13 = AndroidComposeView_androidKt.a(arr_f1, 3, arr_f, 1);
        float f14 = AndroidComposeView_androidKt.a(arr_f1, 3, arr_f, 2);
        float f15 = AndroidComposeView_androidKt.a(arr_f1, 3, arr_f, 3);
        arr_f[0] = f;
        arr_f[1] = f1;
        arr_f[2] = f2;
        arr_f[3] = f3;
        arr_f[4] = f4;
        arr_f[5] = f5;
        arr_f[6] = f6;
        arr_f[7] = f7;
        arr_f[8] = f8;
        arr_f[9] = f9;
        arr_f[10] = f10;
        arr_f[11] = f11;
        arr_f[12] = f12;
        arr_f[13] = f13;
        arr_f[14] = f14;
        arr_f[15] = f15;
    }

    @NotNull
    public static final Function1 getPlatformTextInputServiceInterceptor() {
        return AndroidComposeView_androidKt.a;
    }

    public static final void setPlatformTextInputServiceInterceptor(@NotNull Function1 function10) {
        AndroidComposeView_androidKt.a = function10;
    }
}

