package com.google.android.material.bottomnavigation;

import android.content.Context;
import androidx.annotation.DimenRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.android.material.R.dimen;
import com.google.android.material.R.layout;
import com.google.android.material.navigation.NavigationBarItemView;

@RestrictTo({Scope.LIBRARY_GROUP})
public class BottomNavigationItemView extends NavigationBarItemView {
    public BottomNavigationItemView(@NonNull Context context0) {
        super(context0);
    }

    @Override  // com.google.android.material.navigation.NavigationBarItemView
    @DimenRes
    public int getItemDefaultMarginResId() {
        return dimen.design_bottom_navigation_margin;
    }

    @Override  // com.google.android.material.navigation.NavigationBarItemView
    @LayoutRes
    public int getItemLayoutResId() {
        return layout.design_bottom_navigation_item;
    }
}

