package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.accessibility.e;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u0002H\u0001¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u0002H\u0001¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000F\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u0002H\u0001¢\u0006\u0004\b\u000E\u0010\nJ\u0017\u0010\u0011\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u0002H\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0017\u001A\u00020\u00142\u0006\u0010\u0013\u001A\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/window/layout/WindowMetricsCalculatorCompat;", "Landroidx/window/layout/WindowMetricsCalculator;", "Landroid/app/Activity;", "activity", "Landroidx/window/layout/WindowMetrics;", "computeCurrentWindowMetrics", "(Landroid/app/Activity;)Landroidx/window/layout/WindowMetrics;", "computeMaximumWindowMetrics", "Landroid/graphics/Rect;", "computeWindowBoundsQ$window_release", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "computeWindowBoundsQ", "computeWindowBoundsP$window_release", "computeWindowBoundsP", "computeWindowBoundsN$window_release", "computeWindowBoundsN", "computeWindowBoundsIceCreamSandwich$window_release", "computeWindowBoundsIceCreamSandwich", "Landroid/view/Display;", "display", "Landroid/graphics/Point;", "getRealSizeForDisplay$window_release", "(Landroid/view/Display;)Landroid/graphics/Point;", "getRealSizeForDisplay", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class WindowMetricsCalculatorCompat implements WindowMetricsCalculator {
    @NotNull
    public static final WindowMetricsCalculatorCompat INSTANCE;
    public static final String a;

    static {
        WindowMetricsCalculatorCompat.INSTANCE = new WindowMetricsCalculatorCompat();  // 初始化器: Ljava/lang/Object;-><init>()V
        Intrinsics.checkNotNullExpressionValue("WindowMetricsCalculatorCompat", "WindowMetricsCalculatorC…at::class.java.simpleName");
        WindowMetricsCalculatorCompat.a = "WindowMetricsCalculatorCompat";
    }

    @Override  // androidx.window.layout.WindowMetricsCalculator
    @NotNull
    public WindowMetrics computeCurrentWindowMetrics(@NotNull Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        int v = Build.VERSION.SDK_INT;
        if(v >= 30) {
            return new WindowMetrics(ActivityCompatHelperApi30.INSTANCE.currentWindowBounds(activity0));
        }
        if(v >= 29) {
            return new WindowMetrics(this.computeWindowBoundsQ$window_release(activity0));
        }
        return v < 28 ? new WindowMetrics(this.computeWindowBoundsN$window_release(activity0)) : new WindowMetrics(this.computeWindowBoundsP$window_release(activity0));
    }

    @Override  // androidx.window.layout.WindowMetricsCalculator
    @NotNull
    public WindowMetrics computeMaximumWindowMetrics(@NotNull Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        if(Build.VERSION.SDK_INT >= 30) {
            return new WindowMetrics(ActivityCompatHelperApi30.INSTANCE.maximumWindowBounds(activity0));
        }
        Display display0 = activity0.getWindowManager().getDefaultDisplay();
        Intrinsics.checkNotNullExpressionValue(display0, "display");
        Point point0 = this.getRealSizeForDisplay$window_release(display0);
        return new WindowMetrics(new Rect(0, 0, point0.x, point0.y));
    }

    @RequiresApi(14)
    @NotNull
    public final Rect computeWindowBoundsIceCreamSandwich$window_release(@NotNull Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Display display0 = activity0.getWindowManager().getDefaultDisplay();
        Intrinsics.checkNotNullExpressionValue(display0, "defaultDisplay");
        Point point0 = this.getRealSizeForDisplay$window_release(display0);
        Rect rect0 = new Rect();
        int v = point0.x;
        if(v != 0) {
            int v1 = point0.y;
            if(v1 != 0) {
                rect0.right = v;
                rect0.bottom = v1;
                return rect0;
            }
        }
        display0.getRectSize(rect0);
        return rect0;
    }

    @RequiresApi(24)
    @NotNull
    public final Rect computeWindowBoundsN$window_release(@NotNull Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Rect rect0 = new Rect();
        Display display0 = activity0.getWindowManager().getDefaultDisplay();
        display0.getRectSize(rect0);
        if(!ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity0)) {
            Intrinsics.checkNotNullExpressionValue(display0, "defaultDisplay");
            Point point0 = this.getRealSizeForDisplay$window_release(display0);
            Resources resources0 = activity0.getResources();
            int v = resources0.getIdentifier("navigation_bar_height", "dimen", "android");
            int v1 = v <= 0 ? 0 : resources0.getDimensionPixelSize(v);
            int v2 = rect0.bottom + v1;
            if(v2 == point0.y) {
                rect0.bottom = v2;
                return rect0;
            }
            int v3 = rect0.right + v1;
            if(v3 == point0.x) {
                rect0.right = v3;
            }
        }
        return rect0;
    }

    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    @RequiresApi(28)
    @NotNull
    public final Rect computeWindowBoundsP$window_release(@NotNull Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Rect rect0 = new Rect();
        Configuration configuration0 = activity0.getResources().getConfiguration();
        DisplayCutout displayCutout0 = null;
        try {
            Field field0 = Configuration.class.getDeclaredField("windowConfiguration");
            field0.setAccessible(true);
            Object object0 = field0.get(configuration0);
            if(ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity0)) {
                Object object1 = object0.getClass().getDeclaredMethod("getBounds", null).invoke(object0, null);
                if(object1 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect0.set(((Rect)object1));
            }
            else {
                Object object2 = object0.getClass().getDeclaredMethod("getAppBounds", null).invoke(object0, null);
                if(object2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect0.set(((Rect)object2));
            }
            goto label_36;
        }
        catch(NoSuchFieldException noSuchFieldException0) {
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            Log.w("WindowMetricsCalculatorCompat", noSuchMethodException0);
            activity0.getWindowManager().getDefaultDisplay().getRectSize(rect0);
            goto label_36;
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.w("WindowMetricsCalculatorCompat", illegalAccessException0);
            activity0.getWindowManager().getDefaultDisplay().getRectSize(rect0);
            goto label_36;
        }
        catch(InvocationTargetException invocationTargetException0) {
            goto label_34;
        }
        Log.w("WindowMetricsCalculatorCompat", noSuchFieldException0);
        activity0.getWindowManager().getDefaultDisplay().getRectSize(rect0);
        goto label_36;
    label_34:
        Log.w("WindowMetricsCalculatorCompat", invocationTargetException0);
        activity0.getWindowManager().getDefaultDisplay().getRectSize(rect0);
    label_36:
        Display display0 = activity0.getWindowManager().getDefaultDisplay();
        Point point0 = new Point();
        Intrinsics.checkNotNullExpressionValue(display0, "currentDisplay");
        DisplayCompatHelperApi17.INSTANCE.getRealSize(display0, point0);
        ActivityCompatHelperApi24 activityCompatHelperApi240 = ActivityCompatHelperApi24.INSTANCE;
        if(!activityCompatHelperApi240.isInMultiWindowMode(activity0)) {
            Resources resources0 = activity0.getResources();
            int v = resources0.getIdentifier("navigation_bar_height", "dimen", "android");
            int v1 = v <= 0 ? 0 : resources0.getDimensionPixelSize(v);
            int v2 = rect0.bottom + v1;
            if(v2 == point0.y) {
                rect0.bottom = v2;
            }
            else {
                int v3 = rect0.right + v1;
                if(v3 == point0.x) {
                    rect0.right = v3;
                }
                else if(rect0.left == v1) {
                    rect0.left = 0;
                }
            }
        }
        if((rect0.width() < point0.x || rect0.height() < point0.y) && !activityCompatHelperApi240.isInMultiWindowMode(activity0)) {
            try {
                Constructor constructor0 = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor0.setAccessible(true);
                Object object3 = constructor0.newInstance(null);
                Method method0 = display0.getClass().getDeclaredMethod("getDisplayInfo", object3.getClass());
                method0.setAccessible(true);
                method0.invoke(display0, object3);
                Field field1 = object3.getClass().getDeclaredField("displayCutout");
                field1.setAccessible(true);
                Object object4 = field1.get(object3);
                if(e.w(object4)) {
                    displayCutout0 = (DisplayCutout)object4;
                }
            }
            catch(ClassNotFoundException classNotFoundException0) {
                Log.w("WindowMetricsCalculatorCompat", classNotFoundException0);
            }
            catch(NoSuchMethodException noSuchMethodException1) {
                Log.w("WindowMetricsCalculatorCompat", noSuchMethodException1);
            }
            catch(NoSuchFieldException noSuchFieldException1) {
                Log.w("WindowMetricsCalculatorCompat", noSuchFieldException1);
            }
            catch(IllegalAccessException illegalAccessException1) {
                Log.w("WindowMetricsCalculatorCompat", illegalAccessException1);
            }
            catch(InvocationTargetException invocationTargetException1) {
                Log.w("WindowMetricsCalculatorCompat", invocationTargetException1);
            }
            catch(InstantiationException instantiationException0) {
                Log.w("WindowMetricsCalculatorCompat", instantiationException0);
            }
            if(displayCutout0 != null) {
                DisplayCompatHelperApi28 displayCompatHelperApi280 = DisplayCompatHelperApi28.INSTANCE;
                if(rect0.left == displayCompatHelperApi280.safeInsetLeft(displayCutout0)) {
                    rect0.left = 0;
                }
                if(point0.x - rect0.right == displayCompatHelperApi280.safeInsetRight(displayCutout0)) {
                    int v4 = rect0.right;
                    rect0.right = displayCompatHelperApi280.safeInsetRight(displayCutout0) + v4;
                }
                if(rect0.top == displayCompatHelperApi280.safeInsetTop(displayCutout0)) {
                    rect0.top = 0;
                }
                if(point0.y - rect0.bottom == displayCompatHelperApi280.safeInsetBottom(displayCutout0)) {
                    int v5 = rect0.bottom;
                    rect0.bottom = displayCompatHelperApi280.safeInsetBottom(displayCutout0) + v5;
                }
            }
        }
        return rect0;
    }

    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    @RequiresApi(29)
    @NotNull
    public final Rect computeWindowBoundsQ$window_release(@NotNull Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Configuration configuration0 = activity0.getResources().getConfiguration();
        try {
            Field field0 = Configuration.class.getDeclaredField("windowConfiguration");
            field0.setAccessible(true);
            Object object0 = field0.get(configuration0);
            Object object1 = object0.getClass().getDeclaredMethod("getBounds", null).invoke(object0, null);
            if(object1 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
            }
            return new Rect(((Rect)object1));
        }
        catch(NoSuchFieldException noSuchFieldException0) {
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            Log.w("WindowMetricsCalculatorCompat", noSuchMethodException0);
            return this.computeWindowBoundsP$window_release(activity0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.w("WindowMetricsCalculatorCompat", illegalAccessException0);
            return this.computeWindowBoundsP$window_release(activity0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            Log.w("WindowMetricsCalculatorCompat", invocationTargetException0);
            return this.computeWindowBoundsP$window_release(activity0);
        }
        Log.w("WindowMetricsCalculatorCompat", noSuchFieldException0);
        return this.computeWindowBoundsP$window_release(activity0);
    }

    @RequiresApi(14)
    @VisibleForTesting
    @NotNull
    public final Point getRealSizeForDisplay$window_release(@NotNull Display display0) {
        Intrinsics.checkNotNullParameter(display0, "display");
        Point point0 = new Point();
        DisplayCompatHelperApi17.INSTANCE.getRealSize(display0, point0);
        return point0;
    }
}

