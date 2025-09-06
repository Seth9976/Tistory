package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.ActionMode.Callback;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NavUtils;
import androidx.core.app.TaskStackBuilder.SupportParentable;
import androidx.core.app.TaskStackBuilder;
import androidx.core.os.LocaleListCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;

public class AppCompatActivity extends FragmentActivity implements DelegateProvider, AppCompatCallback, SupportParentable {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private AppCompatDelegate mDelegate;
    private Resources mResources;

    public AppCompatActivity() {
        this.getSavedStateRegistry().registerSavedStateProvider("androidx:appcompat", new m(this));
        this.addOnContextAvailableListener(new n(this));
    }

    @ContentView
    public AppCompatActivity(@LayoutRes int v) {
        super(v);
        this.getSavedStateRegistry().registerSavedStateProvider("androidx:appcompat", new m(this));
        this.addOnContextAvailableListener(new n(this));
    }

    @Override  // androidx.activity.ComponentActivity
    public void addContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.f();
        this.getDelegate().addContentView(view0, viewGroup$LayoutParams0);
    }

    @Override  // android.app.Activity
    public void attachBaseContext(Context context0) {
        super.attachBaseContext(this.getDelegate().attachBaseContext2(context0));
    }

    @Override  // android.app.Activity
    public void closeOptionsMenu() {
        ActionBar actionBar0 = this.getSupportActionBar();
        if(this.getWindow().hasFeature(0) && (actionBar0 == null || !actionBar0.closeOptionsMenu())) {
            super.closeOptionsMenu();
        }
    }

    @Override  // androidx.core.app.ComponentActivity
    public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        int v = keyEvent0.getKeyCode();
        ActionBar actionBar0 = this.getSupportActionBar();
        return v != 82 || actionBar0 == null || !actionBar0.onMenuKeyEvent(keyEvent0) ? super.dispatchKeyEvent(keyEvent0) : true;
    }

    public final void f() {
        ViewTreeLifecycleOwner.set(this.getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.set(this.getWindow().getDecorView(), this);
        ViewTreeSavedStateRegistryOwner.set(this.getWindow().getDecorView(), this);
        ViewTreeOnBackPressedDispatcherOwner.set(this.getWindow().getDecorView(), this);
    }

    @Override  // android.app.Activity
    public View findViewById(@IdRes int v) {
        return this.getDelegate().findViewById(v);
    }

    @NonNull
    public AppCompatDelegate getDelegate() {
        if(this.mDelegate == null) {
            this.mDelegate = AppCompatDelegate.create(this, this);
        }
        return this.mDelegate;
    }

    @Override  // androidx.appcompat.app.ActionBarDrawerToggle$DelegateProvider
    @Nullable
    public Delegate getDrawerToggleDelegate() {
        return this.getDelegate().getDrawerToggleDelegate();
    }

    @Override  // android.app.Activity
    @NonNull
    public MenuInflater getMenuInflater() {
        return this.getDelegate().getMenuInflater();
    }

    // 去混淆评级： 低(40)
    @Override  // android.view.ContextThemeWrapper
    public Resources getResources() {
        return this.mResources == null ? super.getResources() : this.mResources;
    }

    @Nullable
    public ActionBar getSupportActionBar() {
        return this.getDelegate().getSupportActionBar();
    }

    @Override  // androidx.core.app.TaskStackBuilder$SupportParentable
    @Nullable
    public Intent getSupportParentActivityIntent() {
        return NavUtils.getParentActivityIntent(this);
    }

    @Override  // android.app.Activity
    public void invalidateOptionsMenu() {
        this.getDelegate().invalidateOptionsMenu();
    }

    @Override  // androidx.activity.ComponentActivity
    public void onConfigurationChanged(@NonNull Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.getDelegate().onConfigurationChanged(configuration0);
        if(this.mResources != null) {
            Configuration configuration1 = super.getResources().getConfiguration();
            DisplayMetrics displayMetrics0 = super.getResources().getDisplayMetrics();
            this.mResources.updateConfiguration(configuration1, displayMetrics0);
        }
    }

    @Override  // android.app.Activity
    public void onContentChanged() {
    }

    public void onCreateSupportNavigateUpTaskStack(@NonNull TaskStackBuilder taskStackBuilder0) {
        taskStackBuilder0.addParentStack(this);
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void onDestroy() {
        super.onDestroy();
        this.getDelegate().onDestroy();
    }

    @Override  // android.app.Activity
    public boolean onKeyDown(int v, KeyEvent keyEvent0) {
        return super.onKeyDown(v, keyEvent0);
    }

    public void onLocalesChanged(@NonNull LocaleListCompat localeListCompat0) {
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public final boolean onMenuItemSelected(int v, @NonNull MenuItem menuItem0) {
        if(super.onMenuItemSelected(v, menuItem0)) {
            return true;
        }
        ActionBar actionBar0 = this.getSupportActionBar();
        return menuItem0.getItemId() != 0x102002C || actionBar0 == null || (actionBar0.getDisplayOptions() & 4) == 0 ? false : this.onSupportNavigateUp();
    }

    @Override  // android.app.Activity
    public boolean onMenuOpened(int v, Menu menu0) {
        return super.onMenuOpened(v, menu0);
    }

    public void onNightModeChanged(int v) {
    }

    @Override  // androidx.activity.ComponentActivity
    public void onPanelClosed(int v, @NonNull Menu menu0) {
        super.onPanelClosed(v, menu0);
    }

    @Override  // android.app.Activity
    public void onPostCreate(@Nullable Bundle bundle0) {
        super.onPostCreate(bundle0);
        this.getDelegate().onPostCreate(bundle0);
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void onPostResume() {
        super.onPostResume();
        this.getDelegate().onPostResume();
    }

    public void onPrepareSupportNavigateUpTaskStack(@NonNull TaskStackBuilder taskStackBuilder0) {
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void onStart() {
        super.onStart();
        this.getDelegate().onStart();
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void onStop() {
        super.onStop();
        this.getDelegate().onStop();
    }

    @Override  // androidx.appcompat.app.AppCompatCallback
    @CallSuper
    public void onSupportActionModeFinished(@NonNull ActionMode actionMode0) {
    }

    @Override  // androidx.appcompat.app.AppCompatCallback
    @CallSuper
    public void onSupportActionModeStarted(@NonNull ActionMode actionMode0) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent intent0 = this.getSupportParentActivityIntent();
        if(intent0 != null) {
            if(this.supportShouldUpRecreateTask(intent0)) {
                TaskStackBuilder taskStackBuilder0 = TaskStackBuilder.create(this);
                this.onCreateSupportNavigateUpTaskStack(taskStackBuilder0);
                taskStackBuilder0.startActivities();
                try {
                    ActivityCompat.finishAffinity(this);
                }
                catch(IllegalStateException unused_ex) {
                    this.finish();
                }
                return true;
            }
            this.supportNavigateUpTo(intent0);
            return true;
        }
        return false;
    }

    @Override  // android.app.Activity
    public void onTitleChanged(CharSequence charSequence0, int v) {
        super.onTitleChanged(charSequence0, v);
        this.getDelegate().setTitle(charSequence0);
    }

    @Override  // androidx.appcompat.app.AppCompatCallback
    @Nullable
    public ActionMode onWindowStartingSupportActionMode(@NonNull Callback actionMode$Callback0) {
        return null;
    }

    @Override  // android.app.Activity
    public void openOptionsMenu() {
        ActionBar actionBar0 = this.getSupportActionBar();
        if(this.getWindow().hasFeature(0) && (actionBar0 == null || !actionBar0.openOptionsMenu())) {
            super.openOptionsMenu();
        }
    }

    @Override  // androidx.activity.ComponentActivity
    public void setContentView(@LayoutRes int v) {
        this.f();
        this.getDelegate().setContentView(v);
    }

    @Override  // androidx.activity.ComponentActivity
    public void setContentView(View view0) {
        this.f();
        this.getDelegate().setContentView(view0);
    }

    @Override  // androidx.activity.ComponentActivity
    public void setContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.f();
        this.getDelegate().setContentView(view0, viewGroup$LayoutParams0);
    }

    public void setSupportActionBar(@Nullable Toolbar toolbar0) {
        this.getDelegate().setSupportActionBar(toolbar0);
    }

    @Deprecated
    public void setSupportProgress(int v) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    @Override  // android.app.Activity
    public void setTheme(@StyleRes int v) {
        super.setTheme(v);
        this.getDelegate().setTheme(v);
    }

    @Nullable
    public ActionMode startSupportActionMode(@NonNull Callback actionMode$Callback0) {
        return this.getDelegate().startSupportActionMode(actionMode$Callback0);
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
        this.getDelegate().invalidateOptionsMenu();
    }

    public void supportNavigateUpTo(@NonNull Intent intent0) {
        NavUtils.navigateUpTo(this, intent0);
    }

    public boolean supportRequestWindowFeature(int v) {
        return this.getDelegate().requestWindowFeature(v);
    }

    public boolean supportShouldUpRecreateTask(@NonNull Intent intent0) {
        return NavUtils.shouldUpRecreateTask(this, intent0);
    }
}

