package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.SpinnerAdapter;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.R.styleable;
import androidx.appcompat.view.ActionMode.Callback;
import androidx.appcompat.view.ActionMode;
import androidx.fragment.app.FragmentTransaction;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class ActionBar {
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface DisplayOptions {
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int gravity;

        public LayoutParams(int v) {
            this(-2, -1, v);
        }

        public LayoutParams(int v, int v1) {
            super(v, v1);
            this.gravity = 0x800013;
        }

        public LayoutParams(int v, int v1, int v2) {
            super(v, v1);
            this.gravity = v2;
        }

        public LayoutParams(@NonNull Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.gravity = 0;
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ActionBarLayout);
            this.gravity = typedArray0.getInt(styleable.ActionBarLayout_android_layout_gravity, 0);
            typedArray0.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.gravity = 0;
        }

        public LayoutParams(LayoutParams actionBar$LayoutParams0) {
            super(actionBar$LayoutParams0);
            this.gravity = actionBar$LayoutParams0.gravity;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface NavigationMode {
    }

    public interface OnMenuVisibilityListener {
        void onMenuVisibilityChanged(boolean arg1);
    }

    @Deprecated
    public interface OnNavigationListener {
        boolean onNavigationItemSelected(int arg1, long arg2);
    }

    @Deprecated
    public static abstract class Tab {
        public static final int INVALID_POSITION = -1;

        public abstract CharSequence getContentDescription();

        public abstract View getCustomView();

        public abstract Drawable getIcon();

        public abstract int getPosition();

        public abstract Object getTag();

        public abstract CharSequence getText();

        public abstract void select();

        public abstract Tab setContentDescription(@StringRes int arg1);

        public abstract Tab setContentDescription(CharSequence arg1);

        public abstract Tab setCustomView(int arg1);

        public abstract Tab setCustomView(View arg1);

        public abstract Tab setIcon(@DrawableRes int arg1);

        public abstract Tab setIcon(Drawable arg1);

        public abstract Tab setTabListener(TabListener arg1);

        public abstract Tab setTag(Object arg1);

        public abstract Tab setText(int arg1);

        public abstract Tab setText(CharSequence arg1);
    }

    @Deprecated
    public interface TabListener {
        void onTabReselected(Tab arg1, FragmentTransaction arg2);

        void onTabSelected(Tab arg1, FragmentTransaction arg2);

        void onTabUnselected(Tab arg1, FragmentTransaction arg2);
    }

    public static final int DISPLAY_HOME_AS_UP = 4;
    public static final int DISPLAY_SHOW_CUSTOM = 16;
    public static final int DISPLAY_SHOW_HOME = 2;
    public static final int DISPLAY_SHOW_TITLE = 8;
    public static final int DISPLAY_USE_LOGO = 1;
    @Deprecated
    public static final int NAVIGATION_MODE_LIST = 1;
    @Deprecated
    public static final int NAVIGATION_MODE_STANDARD = 0;
    @Deprecated
    public static final int NAVIGATION_MODE_TABS = 2;

    public void a() {
    }

    public abstract void addOnMenuVisibilityListener(OnMenuVisibilityListener arg1);

    @Deprecated
    public abstract void addTab(Tab arg1);

    @Deprecated
    public abstract void addTab(Tab arg1, int arg2);

    @Deprecated
    public abstract void addTab(Tab arg1, int arg2, boolean arg3);

    @Deprecated
    public abstract void addTab(Tab arg1, boolean arg2);

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public boolean closeOptionsMenu() {
        return false;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public boolean collapseActionView() {
        return false;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void dispatchMenuVisibilityChanged(boolean z) {
    }

    public abstract View getCustomView();

    public abstract int getDisplayOptions();

    public float getElevation() {
        return 0.0f;
    }

    public abstract int getHeight();

    public int getHideOffset() {
        return 0;
    }

    @Deprecated
    public abstract int getNavigationItemCount();

    @Deprecated
    public abstract int getNavigationMode();

    @Deprecated
    public abstract int getSelectedNavigationIndex();

    @Nullable
    @Deprecated
    public abstract Tab getSelectedTab();

    @Nullable
    public abstract CharSequence getSubtitle();

    @Deprecated
    public abstract Tab getTabAt(int arg1);

    @Deprecated
    public abstract int getTabCount();

    public Context getThemedContext() {
        return null;
    }

    @Nullable
    public abstract CharSequence getTitle();

    public abstract void hide();

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public boolean invalidateOptionsMenu() {
        return false;
    }

    public boolean isHideOnContentScrollEnabled() {
        return false;
    }

    public abstract boolean isShowing();

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public boolean isTitleTruncated() {
        return false;
    }

    @Deprecated
    public abstract Tab newTab();

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void onConfigurationChanged(Configuration configuration0) {
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public boolean onKeyShortcut(int v, KeyEvent keyEvent0) {
        return false;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public boolean onMenuKeyEvent(KeyEvent keyEvent0) {
        return false;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public boolean openOptionsMenu() {
        return false;
    }

    @Deprecated
    public abstract void removeAllTabs();

    public abstract void removeOnMenuVisibilityListener(OnMenuVisibilityListener arg1);

    @Deprecated
    public abstract void removeTab(Tab arg1);

    @Deprecated
    public abstract void removeTabAt(int arg1);

    @Deprecated
    public abstract void selectTab(Tab arg1);

    public abstract void setBackgroundDrawable(@Nullable Drawable arg1);

    public abstract void setCustomView(int arg1);

    public abstract void setCustomView(View arg1);

    public abstract void setCustomView(View arg1, LayoutParams arg2);

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setDefaultDisplayHomeAsUpEnabled(boolean z) {
    }

    public abstract void setDisplayHomeAsUpEnabled(boolean arg1);

    public abstract void setDisplayOptions(int arg1);

    public abstract void setDisplayOptions(int arg1, int arg2);

    public abstract void setDisplayShowCustomEnabled(boolean arg1);

    public abstract void setDisplayShowHomeEnabled(boolean arg1);

    public abstract void setDisplayShowTitleEnabled(boolean arg1);

    public abstract void setDisplayUseLogoEnabled(boolean arg1);

    public void setElevation(float f) {
        if(f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    public void setHideOffset(int v) {
        if(v != 0) {
            throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
        }
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if(z) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    public void setHomeActionContentDescription(@StringRes int v) {
    }

    public void setHomeActionContentDescription(@Nullable CharSequence charSequence0) {
    }

    public void setHomeAsUpIndicator(@DrawableRes int v) {
    }

    public void setHomeAsUpIndicator(@Nullable Drawable drawable0) {
    }

    public void setHomeButtonEnabled(boolean z) {
    }

    public abstract void setIcon(@DrawableRes int arg1);

    public abstract void setIcon(Drawable arg1);

    @Deprecated
    public abstract void setListNavigationCallbacks(SpinnerAdapter arg1, OnNavigationListener arg2);

    public abstract void setLogo(@DrawableRes int arg1);

    public abstract void setLogo(Drawable arg1);

    @Deprecated
    public abstract void setNavigationMode(int arg1);

    @Deprecated
    public abstract void setSelectedNavigationItem(int arg1);

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setShowHideAnimationEnabled(boolean z) {
    }

    public void setSplitBackgroundDrawable(Drawable drawable0) {
    }

    public void setStackedBackgroundDrawable(Drawable drawable0) {
    }

    public abstract void setSubtitle(int arg1);

    public abstract void setSubtitle(CharSequence arg1);

    public abstract void setTitle(@StringRes int arg1);

    public abstract void setTitle(CharSequence arg1);

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setWindowTitle(CharSequence charSequence0) {
    }

    public abstract void show();

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public ActionMode startActionMode(Callback actionMode$Callback0) {
        return null;
    }
}

