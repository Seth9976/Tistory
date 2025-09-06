package androidx.core.widget;

import android.view.View.OnTouchListener;
import android.widget.PopupMenu;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class PopupMenuCompat {
    @Nullable
    public static View.OnTouchListener getDragToOpenListener(@NonNull Object object0) {
        return ((PopupMenu)object0).getDragToOpenListener();
    }
}

