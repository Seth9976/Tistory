package androidx.core.view;

import android.graphics.Point;
import android.view.Display.Mode;

public abstract class h {
    // 去混淆评级： 低(20)
    public static boolean a(Display.Mode display$Mode0, Point point0) {
        return display$Mode0.getPhysicalWidth() == point0.x && display$Mode0.getPhysicalHeight() == point0.y || display$Mode0.getPhysicalWidth() == point0.y && display$Mode0.getPhysicalHeight() == point0.x;
    }
}

