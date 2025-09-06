package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.browser.R.id;
import androidx.browser.R.layout;
import androidx.core.content.ContextCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BrowserActionsIntent {
    @RestrictTo({Scope.LIBRARY_GROUP})
    @VisibleForTesting
    interface BrowserActionsFallDialogListener {
        void onDialogShown();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface BrowserActionsItemId {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface BrowserActionsUrlType {
    }

    public static final class Builder {
        public final Intent a;
        public final Context b;
        public final Uri c;
        public int d;
        public final ArrayList e;
        public PendingIntent f;

        public Builder(Context context0, Uri uri0) {
            this.a = new Intent("androidx.browser.browseractions.browser_action_open");
            this.f = null;
            this.b = context0;
            this.c = uri0;
            this.d = 0;
            this.e = new ArrayList();
        }

        public BrowserActionsIntent build() {
            Intent intent0 = this.a;
            intent0.setData(this.c);
            intent0.putExtra("androidx.browser.browseractions.extra.TYPE", this.d);
            intent0.putParcelableArrayListExtra("androidx.browser.browseractions.extra.MENU_ITEMS", this.e);
            Intent intent1 = new Intent();
            intent0.putExtra("androidx.browser.browseractions.APP_ID", PendingIntent.getActivity(this.b, 0, intent1, 0));
            PendingIntent pendingIntent0 = this.f;
            if(pendingIntent0 != null) {
                intent0.putExtra("androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT", pendingIntent0);
            }
            return new BrowserActionsIntent(intent0);
        }

        public Builder setCustomItems(ArrayList arrayList0) {
            if(arrayList0.size() > 5) {
                throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
            }
            for(int v = 0; v < arrayList0.size(); ++v) {
                if(TextUtils.isEmpty(((BrowserActionItem)arrayList0.get(v)).getTitle()) || ((BrowserActionItem)arrayList0.get(v)).getAction() == null) {
                    throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
                }
                ArrayList arrayList1 = this.e;
                BrowserActionItem browserActionItem0 = (BrowserActionItem)arrayList0.get(v);
                Bundle bundle0 = new Bundle();
                bundle0.putString("androidx.browser.browseractions.TITLE", browserActionItem0.getTitle());
                bundle0.putParcelable("androidx.browser.browseractions.ACTION", browserActionItem0.getAction());
                if(browserActionItem0.getIconId() != 0) {
                    bundle0.putInt("androidx.browser.browseractions.ICON_ID", browserActionItem0.getIconId());
                }
                arrayList1.add(bundle0);
            }
            return this;
        }

        public Builder setCustomItems(BrowserActionItem[] arr_browserActionItem) {
            return this.setCustomItems(new ArrayList(Arrays.asList(arr_browserActionItem)));
        }

        public Builder setOnItemSelectedAction(PendingIntent pendingIntent0) {
            this.f = pendingIntent0;
            return this;
        }

        public Builder setUrlType(int v) {
            this.d = v;
            return this;
        }
    }

    public static final String ACTION_BROWSER_ACTIONS_OPEN = "androidx.browser.browseractions.browser_action_open";
    public static final String EXTRA_APP_ID = "androidx.browser.browseractions.APP_ID";
    public static final String EXTRA_MENU_ITEMS = "androidx.browser.browseractions.extra.MENU_ITEMS";
    public static final String EXTRA_SELECTED_ACTION_PENDING_INTENT = "androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT";
    public static final String EXTRA_TYPE = "androidx.browser.browseractions.extra.TYPE";
    public static final int ITEM_COPY = 3;
    public static final int ITEM_DOWNLOAD = 2;
    public static final int ITEM_INVALID_ITEM = -1;
    public static final int ITEM_OPEN_IN_INCOGNITO = 1;
    public static final int ITEM_OPEN_IN_NEW_TAB = 0;
    public static final int ITEM_SHARE = 4;
    public static final String KEY_ACTION = "androidx.browser.browseractions.ACTION";
    public static final String KEY_ICON_ID = "androidx.browser.browseractions.ICON_ID";
    public static final String KEY_TITLE = "androidx.browser.browseractions.TITLE";
    public static final int MAX_CUSTOM_ITEMS = 5;
    public static final int URL_TYPE_AUDIO = 3;
    public static final int URL_TYPE_FILE = 4;
    public static final int URL_TYPE_IMAGE = 1;
    public static final int URL_TYPE_NONE = 0;
    public static final int URL_TYPE_PLUGIN = 5;
    public static final int URL_TYPE_VIDEO = 2;
    public final Intent a;

    public BrowserActionsIntent(Intent intent0) {
        this.a = intent0;
    }

    public static String getCreatorPackageName(Intent intent0) {
        PendingIntent pendingIntent0 = (PendingIntent)intent0.getParcelableExtra("androidx.browser.browseractions.APP_ID");
        return pendingIntent0 == null ? null : pendingIntent0.getCreatorPackage();
    }

    @NonNull
    public Intent getIntent() {
        return this.a;
    }

    public static void launchIntent(Context context0, Intent intent0) {
        Intent intent1 = new Intent("androidx.browser.browseractions.browser_action_open", Uri.parse("https://www.example.com"));
        List list0 = context0.getPackageManager().queryIntentActivities(intent1, 0x20000);
        if(list0 != null) {
            switch(list0.size()) {
                case 0: {
                    break;
                }
                case 1: {
                    intent0.setPackage(((ResolveInfo)list0.get(0)).activityInfo.packageName);
                    ContextCompat.startActivity(context0, intent0, null);
                    return;
                }
                default: {
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com"));
                    ResolveInfo resolveInfo0 = context0.getPackageManager().resolveActivity(intent2, 0x10000);
                    if(resolveInfo0 != null) {
                        String s = resolveInfo0.activityInfo.packageName;
                        for(int v = 0; v < list0.size(); ++v) {
                            if(s.equals(((ResolveInfo)list0.get(v)).activityInfo.packageName)) {
                                intent0.setPackage(s);
                                break;
                            }
                        }
                    }
                    ContextCompat.startActivity(context0, intent0, null);
                    return;
                }
            }
        }
        Uri uri0 = intent0.getData();
        intent0.getIntExtra("androidx.browser.browseractions.extra.TYPE", 0);
        ArrayList arrayList0 = intent0.getParcelableArrayListExtra("androidx.browser.browseractions.extra.MENU_ITEMS");
        List list1 = arrayList0 == null ? null : BrowserActionsIntent.parseBrowserActionItems(arrayList0);
        f f0 = new f(context0, uri0, list1);
        View view0 = LayoutInflater.from(context0).inflate(layout.browser_actions_context_menu_page, null);
        BrowserActionsFallbackMenuView browserActionsFallbackMenuView0 = (BrowserActionsFallbackMenuView)view0.findViewById(id.browser_actions_menu_view);
        TextView textView0 = (TextView)view0.findViewById(id.browser_actions_header_text);
        textView0.setText(uri0.toString());
        textView0.setOnClickListener(new e(textView0));
        ListView listView0 = (ListView)view0.findViewById(id.browser_actions_menu_items);
        listView0.setAdapter(new b(context0, list1));
        listView0.setOnItemClickListener(f0);
        d d0 = new d(context0, browserActionsFallbackMenuView0);
        f0.b = d0;
        d0.setContentView(view0);
        f0.b.show();
    }

    public static void openBrowserAction(Context context0, Uri uri0) {
        BrowserActionsIntent.launchIntent(context0, new Builder(context0, uri0).build().getIntent());
    }

    public static void openBrowserAction(Context context0, Uri uri0, int v, ArrayList arrayList0, PendingIntent pendingIntent0) {
        BrowserActionsIntent.launchIntent(context0, new Builder(context0, uri0).setUrlType(v).setCustomItems(arrayList0).setOnItemSelectedAction(pendingIntent0).build().getIntent());
    }

    public static List parseBrowserActionItems(ArrayList arrayList0) {
        List list0 = new ArrayList();
        for(int v = 0; v < arrayList0.size(); ++v) {
            Bundle bundle0 = (Bundle)arrayList0.get(v);
            String s = bundle0.getString("androidx.browser.browseractions.TITLE");
            PendingIntent pendingIntent0 = (PendingIntent)bundle0.getParcelable("androidx.browser.browseractions.ACTION");
            int v1 = bundle0.getInt("androidx.browser.browseractions.ICON_ID");
            if(TextUtils.isEmpty(s) || pendingIntent0 == null) {
                throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
            }
            ((ArrayList)list0).add(new BrowserActionItem(s, pendingIntent0, v1));
        }
        return list0;
    }
}

