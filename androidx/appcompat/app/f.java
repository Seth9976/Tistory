package androidx.appcompat.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public final class f extends ArrayAdapter {
    public final AlertController.RecycleListView a;
    public final AlertController.AlertParams b;

    public f(AlertController.AlertParams alertController$AlertParams0, Context context0, int v, CharSequence[] arr_charSequence, AlertController.RecycleListView alertController$RecycleListView0) {
        this.b = alertController$AlertParams0;
        this.a = alertController$RecycleListView0;
        super(context0, v, 0x1020014, arr_charSequence);
    }

    @Override  // android.widget.ArrayAdapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        View view1 = super.getView(v, view0, viewGroup0);
        boolean[] arr_z = this.b.mCheckedItems;
        if(arr_z != null && arr_z[v]) {
            this.a.setItemChecked(v, true);
        }
        return view1;
    }
}

