package t3;

import android.widget.TabHost.OnTabChangeListener;
import androidx.databinding.InverseBindingListener;

public final class i implements TabHost.OnTabChangeListener {
    public final TabHost.OnTabChangeListener a;
    public final InverseBindingListener b;

    public i(TabHost.OnTabChangeListener tabHost$OnTabChangeListener0, InverseBindingListener inverseBindingListener0) {
        this.a = tabHost$OnTabChangeListener0;
        this.b = inverseBindingListener0;
    }

    @Override  // android.widget.TabHost$OnTabChangeListener
    public final void onTabChanged(String s) {
        TabHost.OnTabChangeListener tabHost$OnTabChangeListener0 = this.a;
        if(tabHost$OnTabChangeListener0 != null) {
            tabHost$OnTabChangeListener0.onTabChanged(s);
        }
        this.b.onChange();
    }
}

