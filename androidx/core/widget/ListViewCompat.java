package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.NonNull;

@Deprecated
public final class ListViewCompat {
    @Deprecated
    public static boolean canScrollList(@NonNull ListView listView0, int v) {
        return listView0.canScrollList(v);
    }

    @Deprecated
    public static void scrollListBy(@NonNull ListView listView0, int v) {
        listView0.scrollListBy(v);
    }
}

