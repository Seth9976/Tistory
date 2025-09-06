package androidx.appcompat.widget;

import android.view.View.OnClickListener;
import android.view.View;
import android.view.Window.Callback;
import androidx.appcompat.view.menu.ActionMenuItem;

public final class n3 implements View.OnClickListener {
    public final ActionMenuItem a;
    public final ToolbarWidgetWrapper b;

    public n3(ToolbarWidgetWrapper toolbarWidgetWrapper0) {
        this.b = toolbarWidgetWrapper0;
        this.a = new ActionMenuItem(toolbarWidgetWrapper0.a.getContext(), 0, 0x102002C, 0, 0, toolbarWidgetWrapper0.j);
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        Window.Callback window$Callback0 = this.b.m;
        if(window$Callback0 != null && this.b.n) {
            window$Callback0.onMenuItemSelected(0, this.a);
        }
    }
}

