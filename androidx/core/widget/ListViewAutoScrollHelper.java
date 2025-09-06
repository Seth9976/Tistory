package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.NonNull;

public class ListViewAutoScrollHelper extends AutoScrollHelper {
    public final ListView s;

    public ListViewAutoScrollHelper(@NonNull ListView listView0) {
        super(listView0);
        this.s = listView0;
    }

    @Override  // androidx.core.widget.AutoScrollHelper
    public boolean canTargetScrollHorizontally(int v) {
        return false;
    }

    @Override  // androidx.core.widget.AutoScrollHelper
    public boolean canTargetScrollVertically(int v) {
        ListView listView0 = this.s;
        int v1 = listView0.getCount();
        if(v1 == 0) {
            return false;
        }
        int v2 = listView0.getChildCount();
        int v3 = listView0.getFirstVisiblePosition();
        return v <= 0 ? v < 0 && (v3 > 0 || listView0.getChildAt(0).getTop() < 0) : v3 + v2 < v1 || listView0.getChildAt(v2 - 1).getBottom() > listView0.getHeight();
    }

    @Override  // androidx.core.widget.AutoScrollHelper
    public void scrollTargetBy(int v, int v1) {
        this.s.scrollListBy(v1);
    }
}

