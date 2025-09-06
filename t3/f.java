package t3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.databinding.ObservableList;
import java.util.List;

public final class f extends BaseAdapter {
    public List a;
    public e b;
    public final Context c;
    public final int d;
    public final int e;
    public final LayoutInflater f;

    public f(Context context0, List list0) {
        this.c = context0;
        this.e = 0x1090008;
        this.d = 0x1090009;
        this.f = (LayoutInflater)context0.getSystemService("layout_inflater");
        this.b(list0);
    }

    public final View a(int v, int v1, View view0, ViewGroup viewGroup0) {
        if(view0 == null) {
            view0 = v == 0 ? new TextView(this.c) : this.f.inflate(v, viewGroup0, false);
        }
        Object object0 = this.a.get(v1);
        CharSequence charSequence0 = object0 instanceof CharSequence ? ((CharSequence)object0) : String.valueOf(object0);
        ((TextView)view0).setText(charSequence0);
        return view0;
    }

    public final void b(List list0) {
        List list1 = this.a;
        if(list1 == list0) {
            return;
        }
        if(list1 instanceof ObservableList) {
            ((ObservableList)list1).removeOnListChangedCallback(this.b);
        }
        this.a = list0;
        if(list0 instanceof ObservableList) {
            if(this.b == null) {
                this.b = new e(this);
            }
            ((ObservableList)this.a).addOnListChangedCallback(this.b);
        }
        this.notifyDataSetChanged();
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    @Override  // android.widget.BaseAdapter
    public final View getDropDownView(int v, View view0, ViewGroup viewGroup0) {
        return this.a(this.d, v, view0, viewGroup0);
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.a.get(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return (long)v;
    }

    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        return this.a(this.e, v, view0, viewGroup0);
    }
}

