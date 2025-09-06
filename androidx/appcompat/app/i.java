package androidx.appcompat.app;

import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;

public final class i implements AdapterView.OnItemClickListener {
    public final AlertController.RecycleListView a;
    public final l b;
    public final AlertController.AlertParams c;

    public i(AlertController.AlertParams alertController$AlertParams0, AlertController.RecycleListView alertController$RecycleListView0, l l0) {
        this.c = alertController$AlertParams0;
        this.a = alertController$RecycleListView0;
        this.b = l0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        AlertController.AlertParams alertController$AlertParams0 = this.c;
        boolean[] arr_z = alertController$AlertParams0.mCheckedItems;
        AlertController.RecycleListView alertController$RecycleListView0 = this.a;
        if(arr_z != null) {
            arr_z[v] = alertController$RecycleListView0.isItemChecked(v);
        }
        DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0 = alertController$AlertParams0.mOnCheckboxClickListener;
        boolean z = alertController$RecycleListView0.isItemChecked(v);
        dialogInterface$OnMultiChoiceClickListener0.onClick(this.b.b, v, z);
    }
}

