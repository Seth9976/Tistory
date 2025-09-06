package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.RemoteViews;
import androidx.annotation.AnimRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.BundleCompat;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;

public final class CustomTabsIntent {
    public static final class Builder {
        public final Intent a;
        public ArrayList b;
        public Bundle c;
        public ArrayList d;
        public boolean e;

        public Builder() {
            this(null);
        }

        public Builder(@Nullable CustomTabsSession customTabsSession0) {
            Intent intent0 = new Intent("android.intent.action.VIEW");
            this.a = intent0;
            IBinder iBinder0 = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = true;
            if(customTabsSession0 != null) {
                intent0.setPackage(customTabsSession0.d.getPackageName());
            }
            Bundle bundle0 = new Bundle();
            if(customTabsSession0 != null) {
                iBinder0 = customTabsSession0.c.asBinder();
            }
            BundleCompat.putBinder(bundle0, "android.support.customtabs.extra.SESSION", iBinder0);
            intent0.putExtras(bundle0);
        }

        public Builder addDefaultShareMenuItem() {
            this.a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            return this;
        }

        public Builder addMenuItem(@NonNull String s, @NonNull PendingIntent pendingIntent0) {
            if(this.b == null) {
                this.b = new ArrayList();
            }
            Bundle bundle0 = new Bundle();
            bundle0.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", s);
            bundle0.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent0);
            this.b.add(bundle0);
            return this;
        }

        @Deprecated
        public Builder addToolbarItem(int v, @NonNull Bitmap bitmap0, @NonNull String s, PendingIntent pendingIntent0) throws IllegalStateException {
            if(this.d == null) {
                this.d = new ArrayList();
            }
            if(this.d.size() >= 5) {
                throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
            }
            Bundle bundle0 = new Bundle();
            bundle0.putInt("android.support.customtabs.customaction.ID", v);
            bundle0.putParcelable("android.support.customtabs.customaction.ICON", bitmap0);
            bundle0.putString("android.support.customtabs.customaction.DESCRIPTION", s);
            bundle0.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent0);
            this.d.add(bundle0);
            return this;
        }

        public CustomTabsIntent build() {
            ArrayList arrayList0 = this.b;
            Intent intent0 = this.a;
            if(arrayList0 != null) {
                intent0.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList0);
            }
            ArrayList arrayList1 = this.d;
            if(arrayList1 != null) {
                intent0.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList1);
            }
            intent0.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.e);
            return new CustomTabsIntent(intent0, this.c);
        }

        public Builder enableUrlBarHiding() {
            this.a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
            return this;
        }

        public Builder setActionButton(@NonNull Bitmap bitmap0, @NonNull String s, @NonNull PendingIntent pendingIntent0) {
            return this.setActionButton(bitmap0, s, pendingIntent0, false);
        }

        public Builder setActionButton(@NonNull Bitmap bitmap0, @NonNull String s, @NonNull PendingIntent pendingIntent0, boolean z) {
            Bundle bundle0 = new Bundle();
            bundle0.putInt("android.support.customtabs.customaction.ID", 0);
            bundle0.putParcelable("android.support.customtabs.customaction.ICON", bitmap0);
            bundle0.putString("android.support.customtabs.customaction.DESCRIPTION", s);
            bundle0.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent0);
            this.a.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle0);
            this.a.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", z);
            return this;
        }

        public Builder setCloseButtonIcon(@NonNull Bitmap bitmap0) {
            this.a.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", bitmap0);
            return this;
        }

        public Builder setExitAnimations(@NonNull Context context0, @AnimRes int v, @AnimRes int v1) {
            Bundle bundle0 = ActivityOptionsCompat.makeCustomAnimation(context0, v, v1).toBundle();
            this.a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", bundle0);
            return this;
        }

        public Builder setInstantAppsEnabled(boolean z) {
            this.e = z;
            return this;
        }

        public Builder setSecondaryToolbarColor(@ColorInt int v) {
            this.a.putExtra("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", v);
            return this;
        }

        public Builder setSecondaryToolbarViews(@NonNull RemoteViews remoteViews0, @Nullable int[] arr_v, @Nullable PendingIntent pendingIntent0) {
            this.a.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", remoteViews0);
            this.a.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", arr_v);
            this.a.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", pendingIntent0);
            return this;
        }

        public Builder setShowTitle(boolean z) {
            this.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", ((int)z));
            return this;
        }

        public Builder setStartAnimations(@NonNull Context context0, @AnimRes int v, @AnimRes int v1) {
            this.c = ActivityOptionsCompat.makeCustomAnimation(context0, v, v1).toBundle();
            return this;
        }

        public Builder setToolbarColor(@ColorInt int v) {
            this.a.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", v);
            return this;
        }
    }

    public static final String EXTRA_ACTION_BUTTON_BUNDLE = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE";
    public static final String EXTRA_CLOSE_BUTTON_ICON = "android.support.customtabs.extra.CLOSE_BUTTON_ICON";
    public static final String EXTRA_DEFAULT_SHARE_MENU_ITEM = "android.support.customtabs.extra.SHARE_MENU_ITEM";
    public static final String EXTRA_ENABLE_INSTANT_APPS = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS";
    public static final String EXTRA_ENABLE_URLBAR_HIDING = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING";
    public static final String EXTRA_EXIT_ANIMATION_BUNDLE = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE";
    public static final String EXTRA_MENU_ITEMS = "android.support.customtabs.extra.MENU_ITEMS";
    public static final String EXTRA_REMOTEVIEWS = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS";
    public static final String EXTRA_REMOTEVIEWS_CLICKED_ID = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID";
    public static final String EXTRA_REMOTEVIEWS_PENDINGINTENT = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT";
    public static final String EXTRA_REMOTEVIEWS_VIEW_IDS = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS";
    public static final String EXTRA_SECONDARY_TOOLBAR_COLOR = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR";
    public static final String EXTRA_SESSION = "android.support.customtabs.extra.SESSION";
    public static final String EXTRA_TINT_ACTION_BUTTON = "android.support.customtabs.extra.TINT_ACTION_BUTTON";
    public static final String EXTRA_TITLE_VISIBILITY_STATE = "android.support.customtabs.extra.TITLE_VISIBILITY";
    public static final String EXTRA_TOOLBAR_COLOR = "android.support.customtabs.extra.TOOLBAR_COLOR";
    public static final String EXTRA_TOOLBAR_ITEMS = "android.support.customtabs.extra.TOOLBAR_ITEMS";
    public static final String KEY_DESCRIPTION = "android.support.customtabs.customaction.DESCRIPTION";
    public static final String KEY_ICON = "android.support.customtabs.customaction.ICON";
    public static final String KEY_ID = "android.support.customtabs.customaction.ID";
    public static final String KEY_MENU_ITEM_TITLE = "android.support.customtabs.customaction.MENU_ITEM_TITLE";
    public static final String KEY_PENDING_INTENT = "android.support.customtabs.customaction.PENDING_INTENT";
    public static final int NO_TITLE = 0;
    public static final int SHOW_PAGE_TITLE = 1;
    public static final int TOOLBAR_ACTION_BUTTON_ID;
    @NonNull
    public final Intent intent;
    @Nullable
    public final Bundle startAnimationBundle;

    public CustomTabsIntent(Intent intent0, Bundle bundle0) {
        this.intent = intent0;
        this.startAnimationBundle = bundle0;
    }

    public static int getMaxToolbarItems() {
        return 5;
    }

    public void launchUrl(Context context0, Uri uri0) {
        this.intent.setData(uri0);
        ContextCompat.startActivity(context0, this.intent, this.startAnimationBundle);
    }

    public static Intent setAlwaysUseBrowserUI(Intent intent0) {
        if(intent0 == null) {
            intent0 = new Intent("android.intent.action.VIEW");
        }
        intent0.addFlags(0x10000000);
        intent0.putExtra("android.support.customtabs.extra.user_opt_out", true);
        return intent0;
    }

    public static boolean shouldAlwaysUseBrowserUI(Intent intent0) {
        return intent0.getBooleanExtra("android.support.customtabs.extra.user_opt_out", false) && (intent0.getFlags() & 0x10000000) != 0;
    }
}

