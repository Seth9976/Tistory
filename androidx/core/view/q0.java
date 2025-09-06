package androidx.core.view;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.R.id;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class q0 {
    public WeakHashMap a;
    public SparseArray b;
    public WeakReference c;
    public static final ArrayList d;

    static {
        q0.d = new ArrayList();
    }

    public final View a(View view0, KeyEvent keyEvent0) {
        if(this.a != null && this.a.containsKey(view0)) {
            if(view0 instanceof ViewGroup) {
                for(int v = ((ViewGroup)view0).getChildCount() - 1; v >= 0; --v) {
                    View view1 = this.a(((ViewGroup)view0).getChildAt(v), keyEvent0);
                    if(view1 != null) {
                        return view1;
                    }
                }
            }
            return q0.b(view0, keyEvent0) ? view0 : null;
        }
        return null;
    }

    public static boolean b(View view0, KeyEvent keyEvent0) {
        ArrayList arrayList0 = (ArrayList)view0.getTag(id.tag_unhandled_key_listeners);
        if(arrayList0 != null) {
            for(int v = arrayList0.size() - 1; v >= 0; --v) {
                if(((OnUnhandledKeyEventListenerCompat)arrayList0.get(v)).onUnhandledKeyEvent(view0, keyEvent0)) {
                    return true;
                }
            }
        }
        return false;
    }
}

