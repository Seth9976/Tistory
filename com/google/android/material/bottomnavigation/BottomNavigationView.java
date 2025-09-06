package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView.OnItemReselectedListener;
import com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener;
import com.google.android.material.navigation.NavigationBarView;
import q7.a;

public class BottomNavigationView extends NavigationBarView {
    @Deprecated
    public interface OnNavigationItemReselectedListener extends OnItemReselectedListener {
    }

    @Deprecated
    public interface OnNavigationItemSelectedListener extends OnItemSelectedListener {
    }

    public BottomNavigationView(@NonNull Context context0) {
        this(context0, null);
    }

    public BottomNavigationView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.bottomNavigationStyle);
    }

    public BottomNavigationView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, style.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        TintTypedArray tintTypedArray0 = ThemeEnforcement.obtainTintedStyledAttributes(this.getContext(), attributeSet0, styleable.BottomNavigationView, v, v1, new int[0]);
        this.setItemHorizontalTranslationEnabled(tintTypedArray0.getBoolean(styleable.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        if(tintTypedArray0.hasValue(styleable.BottomNavigationView_android_minHeight)) {
            this.setMinimumHeight(tintTypedArray0.getDimensionPixelSize(styleable.BottomNavigationView_android_minHeight, 0));
        }
        tintTypedArray0.getBoolean(styleable.BottomNavigationView_compatShadowEnabled, true);
        tintTypedArray0.recycle();
        ViewUtils.doOnApplyWindowInsets(this, new a());  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.material.navigation.NavigationBarView
    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public NavigationBarMenuView createNavigationBarMenuView(@NonNull Context context0) {
        return new BottomNavigationMenuView(context0);
    }

    @Override  // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 5;
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return ((BottomNavigationMenuView)this.getMenuView()).isItemHorizontalTranslationEnabled();
    }

    @Override  // android.widget.FrameLayout
    public void onMeasure(int v, int v1) {
        int v2 = this.getSuggestedMinimumHeight();
        if(View.MeasureSpec.getMode(v1) != 0x40000000 && v2 > 0) {
            int v3 = this.getPaddingTop();
            int v4 = this.getPaddingBottom();
            v1 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(v1), v4 + v3 + v2), 0x40000000);
        }
        super.onMeasure(v, v1);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        BottomNavigationMenuView bottomNavigationMenuView0 = (BottomNavigationMenuView)this.getMenuView();
        if(bottomNavigationMenuView0.isItemHorizontalTranslationEnabled() != z) {
            bottomNavigationMenuView0.setItemHorizontalTranslationEnabled(z);
            this.getPresenter().updateMenuView(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(@Nullable OnNavigationItemReselectedListener bottomNavigationView$OnNavigationItemReselectedListener0) {
        this.setOnItemReselectedListener(bottomNavigationView$OnNavigationItemReselectedListener0);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(@Nullable OnNavigationItemSelectedListener bottomNavigationView$OnNavigationItemSelectedListener0) {
        this.setOnItemSelectedListener(bottomNavigationView$OnNavigationItemSelectedListener0);
    }
}

