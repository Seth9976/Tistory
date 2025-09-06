package androidx.appcompat.app;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;

public final class g extends CursorAdapter {
    public final int a;
    public final int b;
    public final AlertController.RecycleListView c;
    public final l d;
    public final AlertController.AlertParams e;

    public g(AlertController.AlertParams alertController$AlertParams0, Context context0, Cursor cursor0, AlertController.RecycleListView alertController$RecycleListView0, l l0) {
        this.e = alertController$AlertParams0;
        this.c = alertController$RecycleListView0;
        this.d = l0;
        super(context0, cursor0, false);
        Cursor cursor1 = this.getCursor();
        this.a = cursor1.getColumnIndexOrThrow(alertController$AlertParams0.mLabelColumn);
        this.b = cursor1.getColumnIndexOrThrow(alertController$AlertParams0.mIsCheckedColumn);
    }

    @Override  // android.widget.CursorAdapter
    public final void bindView(View view0, Context context0, Cursor cursor0) {
        ((CheckedTextView)view0.findViewById(0x1020014)).setText(cursor0.getString(this.a));
        int v = cursor0.getPosition();
        boolean z = cursor0.getInt(this.b) == 1;
        this.c.setItemChecked(v, z);
    }

    @Override  // android.widget.CursorAdapter
    public final View newView(Context context0, Cursor cursor0, ViewGroup viewGroup0) {
        return this.e.mInflater.inflate(this.d.L, viewGroup0, false);
    }
}

