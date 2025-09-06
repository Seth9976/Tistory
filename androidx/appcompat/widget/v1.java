package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;

public final class v1 implements AdapterView.OnItemSelectedListener {
    public final int a;
    public final Object b;

    public v1(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    private final void a(AdapterView adapterView0) {
    }

    private final void b(AdapterView adapterView0) {
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView0, View view0, int v, long v1) {
        if(this.a != 0) {
            ((SearchView)this.b).h(v);
            return;
        }
        if(v != -1) {
            s1 s10 = ((ListPopupWindow)this.b).c;
            if(s10 != null) {
                s10.setListSelectionHidden(false);
            }
        }
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView0) {
    }
}

