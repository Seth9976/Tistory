package androidx.appcompat.widget;

import android.widget.AbsListView;
import androidx.annotation.DoNotInline;

public abstract class p1 {
    @DoNotInline
    public static boolean a(AbsListView absListView0) {
        return absListView0.isSelectedChildViewEnabled();
    }

    @DoNotInline
    public static void b(AbsListView absListView0, boolean z) {
        absListView0.setSelectedChildViewEnabled(z);
    }
}

