package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display.Mode;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

public final class DisplayCompat {
    public static final class ModeCompat {
        public final Display.Mode a;
        public final Point b;
        public final boolean c;

        public ModeCompat(Display.Mode display$Mode0, Point point0) {
            Preconditions.checkNotNull(display$Mode0, "mode == null, can\'t wrap a null reference");
            Preconditions.checkNotNull(point0, "physicalSize == null");
            this.b = point0;
            this.a = display$Mode0;
            this.c = true;
        }

        public ModeCompat(Display.Mode display$Mode0, boolean z) {
            Preconditions.checkNotNull(display$Mode0, "mode == null, can\'t wrap a null reference");
            this.b = new Point(i.b(display$Mode0), i.a(display$Mode0));
            this.a = display$Mode0;
            this.c = z;
        }

        public int getPhysicalHeight() {
            return this.b.y;
        }

        public int getPhysicalWidth() {
            return this.b.x;
        }

        @Deprecated
        public boolean isNative() {
            return this.c;
        }

        @Nullable
        @RequiresApi(23)
        public Display.Mode toMode() {
            return this.a;
        }
    }

    public static Point a(Context context0, Display display0) {
        Point point0 = Build.VERSION.SDK_INT >= 28 ? DisplayCompat.b("vendor.display-size", display0) : DisplayCompat.b("sys.display-size", display0);
        if(point0 != null) {
            return point0;
        }
        UiModeManager uiModeManager0 = (UiModeManager)context0.getSystemService("uimode");
        if(uiModeManager0 != null && uiModeManager0.getCurrentModeType() == 4 && "Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context0.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
            Display.Mode display$Mode0 = display0.getMode();
            Display.Mode[] arr_display$Mode = display0.getSupportedModes();
            for(int v = 0; v < arr_display$Mode.length; ++v) {
                Display.Mode display$Mode1 = arr_display$Mode[v];
                if(display$Mode0.getPhysicalHeight() < display$Mode1.getPhysicalHeight() || display$Mode0.getPhysicalWidth() < display$Mode1.getPhysicalWidth()) {
                    return null;
                }
            }
            return new Point(0xF00, 0x870);
        }
        return null;
    }

    public static Point b(String s, Display display0) {
        String s1;
        if(display0.getDisplayId() != 0) {
            return null;
        }
        try {
            Class class0 = Class.forName("android.os.SystemProperties");
            s1 = null;
            s1 = (String)class0.getMethod("get", String.class).invoke(class0, s);
        }
        catch(Exception unused_ex) {
        }
        if(!TextUtils.isEmpty(s1) && s1 != null) {
            try {
                String[] arr_s = s1.trim().split("x", -1);
                if(arr_s.length == 2) {
                    int v = Integer.parseInt(arr_s[0]);
                    int v1 = Integer.parseInt(arr_s[1]);
                    return v <= 0 || v1 <= 0 ? null : new Point(v, v1);
                }
                return null;
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        return null;
    }

    @NonNull
    public static ModeCompat getMode(@NonNull Context context0, @NonNull Display display0) {
        Display.Mode display$Mode0 = display0.getMode();
        Point point0 = DisplayCompat.a(context0, display0);
        return point0 == null || h.a(display$Mode0, point0) ? new ModeCompat(display$Mode0, true) : new ModeCompat(display$Mode0, point0);
    }

    @SuppressLint({"ArrayReturn"})
    @NonNull
    public static ModeCompat[] getSupportedModes(@NonNull Context context0, @NonNull Display display0) {
        Display.Mode[] arr_display$Mode = display0.getSupportedModes();
        ModeCompat[] arr_displayCompat$ModeCompat = new ModeCompat[arr_display$Mode.length];
        Display.Mode display$Mode0 = display0.getMode();
        Point point0 = DisplayCompat.a(context0, display0);
        if(point0 != null && !h.a(display$Mode0, point0)) {
            for(int v = 0; v < arr_display$Mode.length; ++v) {
                Display.Mode display$Mode1 = arr_display$Mode[v];
                arr_displayCompat$ModeCompat[v] = display$Mode1.getPhysicalWidth() != display$Mode0.getPhysicalWidth() || display$Mode1.getPhysicalHeight() != display$Mode0.getPhysicalHeight() ? new ModeCompat(arr_display$Mode[v], false) : new ModeCompat(arr_display$Mode[v], point0);
            }
            return arr_displayCompat$ModeCompat;
        }
        for(int v1 = 0; v1 < arr_display$Mode.length; ++v1) {
            Display.Mode display$Mode2 = arr_display$Mode[v1];
            boolean z = display$Mode2.getPhysicalWidth() == display$Mode0.getPhysicalWidth() && display$Mode2.getPhysicalHeight() == display$Mode0.getPhysicalHeight();
            arr_displayCompat$ModeCompat[v1] = new ModeCompat(arr_display$Mode[v1], z);
        }
        return arr_displayCompat$ModeCompat;
    }
}

