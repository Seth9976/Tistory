package androidx.appcompat.widget;

import android.view.View.OnClickListener;
import android.view.View;

public final class j3 implements View.OnClickListener {
    public final Toolbar a;

    public j3(Toolbar toolbar0) {
        this.a = toolbar0;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        this.a.collapseActionView();
    }
}

