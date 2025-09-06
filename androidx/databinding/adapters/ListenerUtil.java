package androidx.databinding.adapters;

import android.util.SparseArray;
import android.view.View;

public class ListenerUtil {
    static {
        new SparseArray();
    }

    public static Object getListener(View view0, int v) {
        return view0.getTag(v);
    }

    public static Object trackListener(View view0, Object object0, int v) {
        Object object1 = view0.getTag(v);
        view0.setTag(v, object0);
        return object1;
    }
}

