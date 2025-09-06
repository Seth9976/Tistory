package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;

public final class p0 implements AdapterView.OnItemClickListener {
    public final int a;
    public final Object b;

    public p0(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        switch(this.a) {
            case 0: {
                r0 r00 = (r0)this.b;
                r00.M.setSelection(v);
                if(r00.M.getOnItemClickListener() != null) {
                    long v2 = r00.J.getItemId(v);
                    r00.M.performItemClick(view0, v, v2);
                }
                r00.dismiss();
                return;
            }
            case 1: {
                ((SearchView)this.b).g(v);
                return;
            }
            default: {
                MaterialAutoCompleteTextView materialAutoCompleteTextView0 = (MaterialAutoCompleteTextView)this.b;
                MaterialAutoCompleteTextView.a(materialAutoCompleteTextView0, (v >= 0 ? materialAutoCompleteTextView0.getAdapter().getItem(v) : materialAutoCompleteTextView0.e.getSelectedItem()));
                AdapterView.OnItemClickListener adapterView$OnItemClickListener0 = materialAutoCompleteTextView0.getOnItemClickListener();
                if(adapterView$OnItemClickListener0 != null) {
                    if(view0 == null || v < 0) {
                        view0 = materialAutoCompleteTextView0.e.getSelectedView();
                        v = materialAutoCompleteTextView0.e.getSelectedItemPosition();
                        v1 = materialAutoCompleteTextView0.e.getSelectedItemId();
                    }
                    adapterView$OnItemClickListener0.onItemClick(materialAutoCompleteTextView0.e.getListView(), view0, v, v1);
                }
                materialAutoCompleteTextView0.e.dismiss();
            }
        }
    }
}

