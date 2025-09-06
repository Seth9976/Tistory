package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.TintTypedArray;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, ItemInvoker, MenuView {
    public MenuBuilder a;
    public static final int[] b;

    static {
        ExpandedMenuView.b = new int[]{0x10100D4, 0x1010129};
    }

    public ExpandedMenuView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x1010074);
    }

    public ExpandedMenuView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0);
        this.setOnItemClickListener(this);
        TintTypedArray tintTypedArray0 = TintTypedArray.obtainStyledAttributes(context0, attributeSet0, ExpandedMenuView.b, v, 0);
        if(tintTypedArray0.hasValue(0)) {
            this.setBackgroundDrawable(tintTypedArray0.getDrawable(0));
        }
        if(tintTypedArray0.hasValue(1)) {
            this.setDivider(tintTypedArray0.getDrawable(1));
        }
        tintTypedArray0.recycle();
    }

    @Override  // androidx.appcompat.view.menu.MenuView
    public int getWindowAnimations() {
        return 0;
    }

    @Override  // androidx.appcompat.view.menu.MenuView
    public void initialize(MenuBuilder menuBuilder0) {
        this.a = menuBuilder0;
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder$ItemInvoker
    public boolean invokeItem(MenuItemImpl menuItemImpl0) {
        return this.a.performItemAction(menuItemImpl0, 0);
    }

    @Override  // android.widget.ListView
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.setChildrenDrawingCacheEnabled(false);
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        this.invokeItem(((MenuItemImpl)this.getAdapter().getItem(v)));
    }
}

