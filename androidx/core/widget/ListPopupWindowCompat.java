package androidx.core.widget;

import android.view.View.OnTouchListener;
import android.view.View;
import android.widget.ListPopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class ListPopupWindowCompat {
    @Nullable
    public static View.OnTouchListener createDragToOpenListener(@NonNull ListPopupWindow listPopupWindow0, @NonNull View view0) {
        return listPopupWindow0.createDragToOpenListener(view0);
    }

    @Deprecated
    public static View.OnTouchListener createDragToOpenListener(Object object0, View view0) {
        return ListPopupWindowCompat.createDragToOpenListener(((ListPopupWindow)object0), view0);
    }
}

