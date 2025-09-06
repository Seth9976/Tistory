package com.kakao.keditor.databinding;

import android.util.SparseIntArray;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.BR;
import com.kakao.keditor.R.id;
import com.kakao.keditor.generated.callback.OnClickListener.Listener;
import com.kakao.keditor.generated.callback.OnClickListener;
import com.kakao.keditor.plugin.itemspec.horizontalrule.HorizontalRuleItem;
import com.kakao.keditor.plugin.itemspec.horizontalrule.HorizontalRuleMenuClickListener;
import com.kakao.keditor.standard.BindingAdapters;
import com.kakao.keditor.toolbar.category.ToolbarCategory;

public class KeToolbarHorizontalRuleMenuBindingImpl extends KeToolbarHorizontalRuleMenuBinding implements Listener {
    @Nullable
    private final View.OnClickListener mCallback55;
    @Nullable
    private final View.OnClickListener mCallback56;
    @Nullable
    private final View.OnClickListener mCallback57;
    @Nullable
    private final View.OnClickListener mCallback58;
    @Nullable
    private final View.OnClickListener mCallback59;
    @Nullable
    private final View.OnClickListener mCallback60;
    @Nullable
    private final View.OnClickListener mCallback61;
    @Nullable
    private final View.OnClickListener mCallback62;
    @Nullable
    private final View.OnClickListener mCallback63;
    private long mDirtyFlags;
    @NonNull
    private final LinearLayout mboundView0;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        KeToolbarHorizontalRuleMenuBindingImpl.sViewsWithIds = sparseIntArray0;
        sparseIntArray0.put(id.ke_menu_horizontal_rule_scroll_view, 10);
    }

    public KeToolbarHorizontalRuleMenuBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 11, KeToolbarHorizontalRuleMenuBindingImpl.sIncludes, KeToolbarHorizontalRuleMenuBindingImpl.sViewsWithIds));
    }

    private KeToolbarHorizontalRuleMenuBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((ImageView)arr_object[9]), ((HorizontalScrollView)arr_object[10]), ((ImageView)arr_object[1]), ((ImageView)arr_object[2]), ((ImageView)arr_object[3]), ((ImageView)arr_object[4]), ((ImageView)arr_object[5]), ((ImageView)arr_object[6]), ((ImageView)arr_object[7]), ((ImageView)arr_object[8]));
        this.mDirtyFlags = -1L;
        this.keBtnDelete.setTag(null);
        this.keMenuHorizontalRuleStyle1.setTag(null);
        this.keMenuHorizontalRuleStyle2.setTag(null);
        this.keMenuHorizontalRuleStyle3.setTag(null);
        this.keMenuHorizontalRuleStyle4.setTag(null);
        this.keMenuHorizontalRuleStyle5.setTag(null);
        this.keMenuHorizontalRuleStyle6.setTag(null);
        this.keMenuHorizontalRuleStyle7.setTag(null);
        this.keMenuHorizontalRuleStyle8.setTag(null);
        this.mboundView0 = (LinearLayout)arr_object[0];
        ((LinearLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.mCallback59 = new OnClickListener(this, 5);
        this.mCallback57 = new OnClickListener(this, 3);
        this.mCallback55 = new OnClickListener(this, 1);
        this.mCallback62 = new OnClickListener(this, 8);
        this.mCallback60 = new OnClickListener(this, 6);
        this.mCallback58 = new OnClickListener(this, 4);
        this.mCallback56 = new OnClickListener(this, 2);
        this.mCallback63 = new OnClickListener(this, 9);
        this.mCallback61 = new OnClickListener(this, 7);
        this.invalidateAll();
    }

    @Override  // com.kakao.keditor.generated.callback.OnClickListener$Listener
    public final void _internalCallbackOnClick(int v, View view0) {
        switch(v) {
            case 1: {
                HorizontalRuleItem horizontalRuleItem0 = this.mHorizontalRule;
                HorizontalRuleMenuClickListener horizontalRuleMenuClickListener0 = this.mListener;
                if(horizontalRuleMenuClickListener0 != null) {
                    horizontalRuleMenuClickListener0.setStyle(horizontalRuleItem0, "style1");
                    return;
                }
                break;
            }
            case 2: {
                HorizontalRuleItem horizontalRuleItem1 = this.mHorizontalRule;
                HorizontalRuleMenuClickListener horizontalRuleMenuClickListener1 = this.mListener;
                if(horizontalRuleMenuClickListener1 != null) {
                    horizontalRuleMenuClickListener1.setStyle(horizontalRuleItem1, "style2");
                    return;
                }
                break;
            }
            case 3: {
                HorizontalRuleItem horizontalRuleItem2 = this.mHorizontalRule;
                HorizontalRuleMenuClickListener horizontalRuleMenuClickListener2 = this.mListener;
                if(horizontalRuleMenuClickListener2 != null) {
                    horizontalRuleMenuClickListener2.setStyle(horizontalRuleItem2, "style3");
                    return;
                }
                break;
            }
            case 4: {
                HorizontalRuleItem horizontalRuleItem3 = this.mHorizontalRule;
                HorizontalRuleMenuClickListener horizontalRuleMenuClickListener3 = this.mListener;
                if(horizontalRuleMenuClickListener3 != null) {
                    horizontalRuleMenuClickListener3.setStyle(horizontalRuleItem3, "style4");
                    return;
                }
                break;
            }
            case 5: {
                HorizontalRuleItem horizontalRuleItem4 = this.mHorizontalRule;
                HorizontalRuleMenuClickListener horizontalRuleMenuClickListener4 = this.mListener;
                if(horizontalRuleMenuClickListener4 != null) {
                    horizontalRuleMenuClickListener4.setStyle(horizontalRuleItem4, "style5");
                    return;
                }
                break;
            }
            case 6: {
                HorizontalRuleItem horizontalRuleItem5 = this.mHorizontalRule;
                HorizontalRuleMenuClickListener horizontalRuleMenuClickListener5 = this.mListener;
                if(horizontalRuleMenuClickListener5 != null) {
                    horizontalRuleMenuClickListener5.setStyle(horizontalRuleItem5, "style6");
                    return;
                }
                break;
            }
            case 7: {
                HorizontalRuleItem horizontalRuleItem6 = this.mHorizontalRule;
                HorizontalRuleMenuClickListener horizontalRuleMenuClickListener6 = this.mListener;
                if(horizontalRuleMenuClickListener6 != null) {
                    horizontalRuleMenuClickListener6.setStyle(horizontalRuleItem6, "style7");
                    return;
                }
                break;
            }
            case 8: {
                HorizontalRuleItem horizontalRuleItem7 = this.mHorizontalRule;
                HorizontalRuleMenuClickListener horizontalRuleMenuClickListener7 = this.mListener;
                if(horizontalRuleMenuClickListener7 != null) {
                    horizontalRuleMenuClickListener7.setStyle(horizontalRuleItem7, "style8");
                    return;
                }
                break;
            }
            case 9: {
                HorizontalRuleMenuClickListener horizontalRuleMenuClickListener8 = this.mListener;
                if(horizontalRuleMenuClickListener8 != null) {
                    horizontalRuleMenuClickListener8.removeItem();
                    return;
                }
                break;
            }
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        boolean z8;
        boolean z7;
        boolean z6;
        boolean z5;
        boolean z4;
        boolean z3;
        boolean z2;
        boolean z1;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        boolean z = this.mDisplayMenu;
        HorizontalRuleItem horizontalRuleItem0 = this.mHorizontalRule;
        int v1 = Long.compare(17L & v, 0L);
        int v2 = Long.compare(20L & v, 0L);
        if(v2 == 0 || horizontalRuleItem0 == null) {
            z1 = false;
            z8 = false;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
            z7 = false;
        }
        else {
            z1 = horizontalRuleItem0.equals(3);
            z2 = horizontalRuleItem0.equals(8);
            z3 = horizontalRuleItem0.equals(1);
            z4 = horizontalRuleItem0.equals(4);
            z5 = horizontalRuleItem0.equals(5);
            z6 = horizontalRuleItem0.equals(6);
            z7 = horizontalRuleItem0.equals(2);
            z8 = horizontalRuleItem0.equals(7);
        }
        if((v & 16L) != 0L) {
            this.keBtnDelete.setOnClickListener(this.mCallback63);
            this.keMenuHorizontalRuleStyle1.setOnClickListener(this.mCallback55);
            this.keMenuHorizontalRuleStyle2.setOnClickListener(this.mCallback56);
            this.keMenuHorizontalRuleStyle3.setOnClickListener(this.mCallback57);
            this.keMenuHorizontalRuleStyle4.setOnClickListener(this.mCallback58);
            this.keMenuHorizontalRuleStyle5.setOnClickListener(this.mCallback59);
            this.keMenuHorizontalRuleStyle6.setOnClickListener(this.mCallback60);
            this.keMenuHorizontalRuleStyle7.setOnClickListener(this.mCallback61);
            this.keMenuHorizontalRuleStyle8.setOnClickListener(this.mCallback62);
        }
        if(v2 != 0) {
            BindingAdapters.setSelected(this.keMenuHorizontalRuleStyle1, z3);
            BindingAdapters.setSelected(this.keMenuHorizontalRuleStyle2, z7);
            BindingAdapters.setSelected(this.keMenuHorizontalRuleStyle3, z1);
            BindingAdapters.setSelected(this.keMenuHorizontalRuleStyle4, z4);
            BindingAdapters.setSelected(this.keMenuHorizontalRuleStyle5, z5);
            BindingAdapters.setSelected(this.keMenuHorizontalRuleStyle6, z6);
            BindingAdapters.setSelected(this.keMenuHorizontalRuleStyle7, z8);
            BindingAdapters.setSelected(this.keMenuHorizontalRuleStyle8, z2);
        }
        if(v1 != 0) {
            BindingAdapters.goneUnless(this.mboundView0, Boolean.valueOf(z));
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized(this) {
            if(this.mDirtyFlags != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized(this) {
            this.mDirtyFlags = 16L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        return false;
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarHorizontalRuleMenuBinding
    public void setActiveCategory(@Nullable ToolbarCategory toolbarCategory0) {
        this.mActiveCategory = toolbarCategory0;
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarHorizontalRuleMenuBinding
    public void setDisplayMenu(boolean z) {
        this.mDisplayMenu = z;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.displayMenu);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarHorizontalRuleMenuBinding
    public void setHorizontalRule(@Nullable HorizontalRuleItem horizontalRuleItem0) {
        this.mHorizontalRule = horizontalRuleItem0;
        synchronized(this) {
            this.mDirtyFlags |= 4L;
        }
        this.notifyPropertyChanged(BR.horizontalRule);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarHorizontalRuleMenuBinding
    public void setListener(@Nullable HorizontalRuleMenuClickListener horizontalRuleMenuClickListener0) {
        this.mListener = horizontalRuleMenuClickListener0;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.listener);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.displayMenu == v) {
            this.setDisplayMenu(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.listener == v) {
            this.setListener(((HorizontalRuleMenuClickListener)object0));
            return true;
        }
        if(BR.horizontalRule == v) {
            this.setHorizontalRule(((HorizontalRuleItem)object0));
            return true;
        }
        if(BR.activeCategory == v) {
            this.setActiveCategory(((ToolbarCategory)object0));
            return true;
        }
        return false;
    }
}

