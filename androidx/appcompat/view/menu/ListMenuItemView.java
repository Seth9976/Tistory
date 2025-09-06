package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.SelectionBoundsAdjuster;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.id;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.string;
import androidx.appcompat.R.styleable;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.ViewCompat;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class ListMenuItemView extends LinearLayout implements AbsListView.SelectionBoundsAdjuster, ItemView {
    public MenuItemImpl a;
    public ImageView b;
    public RadioButton c;
    public TextView d;
    public CheckBox e;
    public TextView f;
    public ImageView g;
    public ImageView h;
    public LinearLayout i;
    public final Drawable j;
    public final int k;
    public final Context l;
    public boolean m;
    public final Drawable n;
    public final boolean o;
    public LayoutInflater p;
    public boolean q;

    public ListMenuItemView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.listMenuViewStyle);
    }

    public ListMenuItemView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0);
        TintTypedArray tintTypedArray0 = TintTypedArray.obtainStyledAttributes(this.getContext(), attributeSet0, styleable.MenuView, v, 0);
        this.j = tintTypedArray0.getDrawable(styleable.MenuView_android_itemBackground);
        this.k = tintTypedArray0.getResourceId(styleable.MenuView_android_itemTextAppearance, -1);
        this.m = tintTypedArray0.getBoolean(styleable.MenuView_preserveIconSpacing, false);
        this.l = context0;
        this.n = tintTypedArray0.getDrawable(styleable.MenuView_subMenuArrow);
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(null, new int[]{0x1010129}, attr.dropDownListViewStyle, 0);
        this.o = typedArray0.hasValue(0);
        tintTypedArray0.recycle();
        typedArray0.recycle();
    }

    @Override  // android.widget.AbsListView$SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect0) {
        if(this.h != null && this.h.getVisibility() == 0) {
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)this.h.getLayoutParams();
            int v = rect0.top;
            rect0.top = this.h.getHeight() + linearLayout$LayoutParams0.topMargin + linearLayout$LayoutParams0.bottomMargin + v;
        }
    }

    private LayoutInflater getInflater() {
        if(this.p == null) {
            this.p = LayoutInflater.from(this.getContext());
        }
        return this.p;
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public MenuItemImpl getItemData() {
        return this.a;
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void initialize(MenuItemImpl menuItemImpl0, int v) {
        this.a = menuItemImpl0;
        boolean z = false;
        this.setVisibility((menuItemImpl0.isVisible() ? 0 : 8));
        this.setTitle((this.prefersCondensedTitle() ? menuItemImpl0.getTitleCondensed() : menuItemImpl0.getTitle()));
        this.setCheckable(menuItemImpl0.isCheckable());
        if(menuItemImpl0.n.isShortcutsVisible() && (menuItemImpl0.n.isQwertyMode() ? menuItemImpl0.j : menuItemImpl0.h) != 0) {
            z = true;
        }
        this.setShortcut(z, (menuItemImpl0.n.isQwertyMode() ? menuItemImpl0.j : menuItemImpl0.h));
        this.setIcon(menuItemImpl0.getIcon());
        this.setEnabled(menuItemImpl0.isEnabled());
        this.setSubMenuArrowVisible(menuItemImpl0.hasSubMenu());
        this.setContentDescription(menuItemImpl0.getContentDescription());
    }

    @Override  // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        ViewCompat.setBackground(this, this.j);
        TextView textView0 = (TextView)this.findViewById(id.title);
        this.d = textView0;
        int v = this.k;
        if(v != -1) {
            textView0.setTextAppearance(this.l, v);
        }
        this.f = (TextView)this.findViewById(id.shortcut);
        ImageView imageView0 = (ImageView)this.findViewById(id.submenuarrow);
        this.g = imageView0;
        if(imageView0 != null) {
            imageView0.setImageDrawable(this.n);
        }
        this.h = (ImageView)this.findViewById(id.group_divider);
        this.i = (LinearLayout)this.findViewById(id.content);
    }

    @Override  // android.widget.LinearLayout
    public void onMeasure(int v, int v1) {
        if(this.b != null && this.m) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)this.b.getLayoutParams();
            int v2 = viewGroup$LayoutParams0.height;
            if(v2 > 0 && linearLayout$LayoutParams0.width <= 0) {
                linearLayout$LayoutParams0.width = v2;
            }
        }
        super.onMeasure(v, v1);
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public boolean prefersCondensedTitle() {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setCheckable(boolean z) {
        CheckBox checkBox0;
        RadioButton radioButton1;
        if(!z && this.c == null && this.e == null) {
            return;
        }
        if(this.a.isExclusiveCheckable()) {
            if(this.c == null) {
                RadioButton radioButton0 = (RadioButton)this.getInflater().inflate(layout.abc_list_menu_item_radio, this, false);
                this.c = radioButton0;
                LinearLayout linearLayout0 = this.i;
                if(linearLayout0 == null) {
                    this.addView(radioButton0, -1);
                }
                else {
                    linearLayout0.addView(radioButton0, -1);
                }
            }
            radioButton1 = this.c;
            checkBox0 = this.e;
        }
        else {
            if(this.e == null) {
                CheckBox checkBox1 = (CheckBox)this.getInflater().inflate(layout.abc_list_menu_item_checkbox, this, false);
                this.e = checkBox1;
                LinearLayout linearLayout1 = this.i;
                if(linearLayout1 == null) {
                    this.addView(checkBox1, -1);
                }
                else {
                    linearLayout1.addView(checkBox1, -1);
                }
            }
            radioButton1 = this.e;
            checkBox0 = this.c;
        }
        if(z) {
            radioButton1.setChecked(this.a.isChecked());
            if(radioButton1.getVisibility() != 0) {
                radioButton1.setVisibility(0);
            }
            if(checkBox0 != null && checkBox0.getVisibility() != 8) {
                checkBox0.setVisibility(8);
            }
        }
        else {
            CheckBox checkBox2 = this.e;
            if(checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            RadioButton radioButton2 = this.c;
            if(radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setChecked(boolean z) {
        RadioButton radioButton1;
        if(this.a.isExclusiveCheckable()) {
            if(this.c == null) {
                RadioButton radioButton0 = (RadioButton)this.getInflater().inflate(layout.abc_list_menu_item_radio, this, false);
                this.c = radioButton0;
                LinearLayout linearLayout0 = this.i;
                if(linearLayout0 == null) {
                    this.addView(radioButton0, -1);
                }
                else {
                    linearLayout0.addView(radioButton0, -1);
                }
            }
            radioButton1 = this.c;
        }
        else {
            if(this.e == null) {
                CheckBox checkBox0 = (CheckBox)this.getInflater().inflate(layout.abc_list_menu_item_checkbox, this, false);
                this.e = checkBox0;
                LinearLayout linearLayout1 = this.i;
                if(linearLayout1 == null) {
                    this.addView(checkBox0, -1);
                }
                else {
                    linearLayout1.addView(checkBox0, -1);
                }
            }
            radioButton1 = this.e;
        }
        radioButton1.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.q = z;
        this.m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView0 = this.h;
        if(imageView0 != null) {
            imageView0.setVisibility((this.o || !z ? 8 : 0));
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setIcon(Drawable drawable0) {
        boolean z = this.a.shouldShowIcon() || this.q;
        if(!z && !this.m) {
            return;
        }
        ImageView imageView0 = this.b;
        if(imageView0 == null && drawable0 == null && !this.m) {
            return;
        }
        if(imageView0 == null) {
            ImageView imageView1 = (ImageView)this.getInflater().inflate(layout.abc_list_menu_item_icon, this, false);
            this.b = imageView1;
            LinearLayout linearLayout0 = this.i;
            if(linearLayout0 == null) {
                this.addView(imageView1, 0);
            }
            else {
                linearLayout0.addView(imageView1, 0);
            }
        }
        if(drawable0 == null && !this.m) {
            this.b.setVisibility(8);
            return;
        }
        ImageView imageView2 = this.b;
        if(!z) {
            drawable0 = null;
        }
        imageView2.setImageDrawable(drawable0);
        if(this.b.getVisibility() != 0) {
            this.b.setVisibility(0);
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setShortcut(boolean z, char c) {
        String s;
        int v;
        if(z) {
            MenuItemImpl menuItemImpl0 = this.a;
            v = 0;
            if(!menuItemImpl0.n.isShortcutsVisible() || (menuItemImpl0.n.isQwertyMode() ? menuItemImpl0.j : menuItemImpl0.h) == 0) {
                v = 8;
            }
            else {
                TextView textView0 = this.f;
                MenuItemImpl menuItemImpl1 = this.a;
                int v1 = menuItemImpl1.n.isQwertyMode() ? menuItemImpl1.j : menuItemImpl1.h;
                if(v1 == 0) {
                    s = "";
                }
                else {
                    MenuBuilder menuBuilder0 = menuItemImpl1.n;
                    Resources resources0 = menuBuilder0.getContext().getResources();
                    StringBuilder stringBuilder0 = new StringBuilder();
                    if(ViewConfiguration.get(menuBuilder0.getContext()).hasPermanentMenuKey()) {
                        stringBuilder0.append(resources0.getString(string.abc_prepend_shortcut_label));
                    }
                    int v2 = menuBuilder0.isQwertyMode() ? menuItemImpl1.k : menuItemImpl1.i;
                    MenuItemImpl.a(v2, 0x10000, resources0.getString(string.abc_menu_meta_shortcut_label), stringBuilder0);
                    MenuItemImpl.a(v2, 0x1000, resources0.getString(string.abc_menu_ctrl_shortcut_label), stringBuilder0);
                    MenuItemImpl.a(v2, 2, resources0.getString(string.abc_menu_alt_shortcut_label), stringBuilder0);
                    MenuItemImpl.a(v2, 1, resources0.getString(string.abc_menu_shift_shortcut_label), stringBuilder0);
                    MenuItemImpl.a(v2, 4, resources0.getString(string.abc_menu_sym_shortcut_label), stringBuilder0);
                    MenuItemImpl.a(v2, 8, resources0.getString(string.abc_menu_function_shortcut_label), stringBuilder0);
                    switch(v1) {
                        case 8: {
                            stringBuilder0.append(resources0.getString(string.abc_menu_delete_shortcut_label));
                            break;
                        }
                        case 10: {
                            stringBuilder0.append(resources0.getString(string.abc_menu_enter_shortcut_label));
                            break;
                        }
                        case 0x20: {
                            stringBuilder0.append(resources0.getString(string.abc_menu_space_shortcut_label));
                            break;
                        }
                        default: {
                            stringBuilder0.append(((char)v1));
                        }
                    }
                    s = stringBuilder0.toString();
                }
                textView0.setText(s);
            }
        }
        else {
            v = 8;
        }
        if(this.f.getVisibility() != v) {
            this.f.setVisibility(v);
        }
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView0 = this.g;
        if(imageView0 != null) {
            imageView0.setVisibility((z ? 0 : 8));
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setTitle(CharSequence charSequence0) {
        if(charSequence0 != null) {
            this.d.setText(charSequence0);
            if(this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
        }
        else if(this.d.getVisibility() != 8) {
            this.d.setVisibility(8);
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public boolean showsIcon() {
        return this.q;
    }
}

