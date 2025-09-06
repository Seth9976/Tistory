package androidx.databinding.adapters;

import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingAdapter;
import androidx.databinding.InverseBindingListener;
import t3.i;

@RestrictTo({Scope.LIBRARY})
public class TabHostBindingAdapter {
    @InverseBindingAdapter(attribute = "android:currentTab")
    public static int getCurrentTab(TabHost tabHost0) {
        return tabHost0.getCurrentTab();
    }

    @InverseBindingAdapter(attribute = "android:currentTab")
    public static String getCurrentTabTag(TabHost tabHost0) {
        return tabHost0.getCurrentTabTag();
    }

    @BindingAdapter({"android:currentTab"})
    public static void setCurrentTab(TabHost tabHost0, int v) {
        if(tabHost0.getCurrentTab() != v) {
            tabHost0.setCurrentTab(v);
        }
    }

    @BindingAdapter({"android:currentTab"})
    public static void setCurrentTabTag(TabHost tabHost0, String s) {
        String s1 = tabHost0.getCurrentTabTag();
        if(s1 != null && !s1.equals(s) || s1 == null && s != null) {
            tabHost0.setCurrentTabByTag(s);
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onTabChanged", "android:currentTabAttrChanged"})
    public static void setListeners(TabHost tabHost0, TabHost.OnTabChangeListener tabHost$OnTabChangeListener0, InverseBindingListener inverseBindingListener0) {
        if(inverseBindingListener0 == null) {
            tabHost0.setOnTabChangedListener(tabHost$OnTabChangeListener0);
            return;
        }
        tabHost0.setOnTabChangedListener(new i(tabHost$OnTabChangeListener0, inverseBindingListener0));
    }
}

