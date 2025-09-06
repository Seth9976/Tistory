package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;

public final class h implements AdapterView.OnItemClickListener {
    public final l a;
    public final AlertController.AlertParams b;

    public h(AlertController.AlertParams alertController$AlertParams0, l l0) {
        this.b = alertController$AlertParams0;
        this.a = l0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        l l0 = this.a;
        this.b.mOnClickListener.onClick(l0.b, v);
        if(!this.b.mIsSingleChoice) {
            l0.b.dismiss();
        }
    }
}

