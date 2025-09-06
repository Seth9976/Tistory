package androidx.fragment.app;

import android.content.Context;
import android.view.View;
import android.widget.TabHost.TabContentFactory;

public final class m1 implements TabHost.TabContentFactory {
    public final Context a;

    public m1(Context context0) {
        this.a = context0;
    }

    @Override  // android.widget.TabHost$TabContentFactory
    public final View createTabContent(String s) {
        View view0 = new View(this.a);
        view0.setMinimumWidth(0);
        view0.setMinimumHeight(0);
        return view0;
    }
}

