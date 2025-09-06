package androidx.compose.ui.graphics;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p1.g;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J\u001F\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/CanvasUtils;", "", "Landroid/graphics/Canvas;", "canvas", "", "enable", "", "enableZ", "(Landroid/graphics/Canvas;Z)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCanvasUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasUtils.android.kt\nandroidx/compose/ui/graphics/CanvasUtils\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,102:1\n26#2:103\n26#2:104\n*S KotlinDebug\n*F\n+ 1 CanvasUtils.android.kt\nandroidx/compose/ui/graphics/CanvasUtils\n*L\n54#1:103\n59#1:104\n*E\n"})
public final class CanvasUtils {
    @NotNull
    public static final CanvasUtils INSTANCE;
    public static Method a;
    public static Method b;
    public static boolean c;

    static {
        CanvasUtils.INSTANCE = new CanvasUtils();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public final void enableZ(@NotNull Canvas canvas0, boolean z) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 29) {
            g.a.a(canvas0, z);
            return;
        }
        if(!CanvasUtils.c) {
            try {
                Class class0 = Canvas.class;
                if(v == 28) {
                    Class class1 = new Class[0].getClass();
                    Method method0 = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, class1);
                    CanvasUtils.a = (Method)method0.invoke(class0, "insertReorderBarrier");
                    CanvasUtils.b = (Method)method0.invoke(class0, "insertInorderBarrier");
                }
                else {
                    CanvasUtils.a = class0.getDeclaredMethod("insertReorderBarrier", null);
                    CanvasUtils.b = class0.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method1 = CanvasUtils.a;
                if(method1 != null) {
                    method1.setAccessible(true);
                }
                Method method2 = CanvasUtils.b;
                if(method2 != null) {
                    method2.setAccessible(true);
                }
            }
            catch(IllegalAccessException | InvocationTargetException | NoSuchMethodException unused_ex) {
            }
            CanvasUtils.c = true;
        }
        try {
            if(z) {
                Method method3 = CanvasUtils.a;
                if(method3 != null) {
                    Intrinsics.checkNotNull(method3);
                    method3.invoke(canvas0, null);
                }
            }
            if(!z) {
                Method method4 = CanvasUtils.b;
                if(method4 != null) {
                    Intrinsics.checkNotNull(method4);
                    method4.invoke(canvas0, null);
                }
            }
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
        }
    }
}

