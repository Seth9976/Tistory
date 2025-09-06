package androidx.appcompat.widget;

import android.view.View.OnClickListener;
import android.view.View;
import androidx.appcompat.view.ActionMode;

public final class d implements View.OnClickListener {
    public final ActionMode a;

    public d(ActionMode actionMode0) {
        this.a = actionMode0;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        this.a.finish();
    }
}

