package p1;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.view.View;

public abstract class a {
    public static BlendMode A() {
        return BlendMode.SATURATION;
    }

    public static BlendMode B() {
        return BlendMode.CLEAR;
    }

    public static BlendMode C() {
        return BlendMode.COLOR;
    }

    public static BlendMode D() {
        return BlendMode.LUMINOSITY;
    }

    public static long a(View view0) {
        return view0.getUniqueDrawingId();
    }

    public static BlendMode b() {
        return BlendMode.HARD_LIGHT;
    }

    public static BlendModeColorFilter c(ColorFilter colorFilter0) [...] // Inlined contents

    public static boolean d(ColorFilter colorFilter0) {
        return colorFilter0 instanceof BlendModeColorFilter;
    }

    public static BlendMode[] e() {
        return BlendMode.values();
    }

    public static BlendMode f() {
        return BlendMode.SOFT_LIGHT;
    }

    public static BlendMode g() {
        return BlendMode.SRC_OVER;
    }

    public static BlendMode h() {
        return BlendMode.DST;
    }

    public static BlendMode i() {
        return BlendMode.DST_OVER;
    }

    public static BlendMode j() {
        return BlendMode.SRC_IN;
    }

    public static BlendMode k() {
        return BlendMode.DST_IN;
    }

    public static BlendMode l() {
        return BlendMode.SRC_OUT;
    }

    public static BlendMode m() {
        return BlendMode.DST_OUT;
    }

    public static BlendMode n() {
        return BlendMode.SRC_ATOP;
    }

    public static BlendMode o() {
        return BlendMode.DST_ATOP;
    }

    public static BlendMode p() {
        return BlendMode.XOR;
    }

    public static BlendMode q() {
        return BlendMode.DIFFERENCE;
    }

    public static BlendMode r() {
        return BlendMode.PLUS;
    }

    public static BlendMode s() {
        return BlendMode.MODULATE;
    }

    public static BlendMode t() {
        return BlendMode.SCREEN;
    }

    public static BlendMode u() {
        return BlendMode.OVERLAY;
    }

    public static BlendMode v() {
        return BlendMode.DARKEN;
    }

    public static BlendMode w() {
        return BlendMode.LIGHTEN;
    }

    public static BlendMode x() {
        return BlendMode.EXCLUSION;
    }

    public static BlendMode y() {
        return BlendMode.MULTIPLY;
    }

    public static BlendMode z() {
        return BlendMode.HUE;
    }
}

