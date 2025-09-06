package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.string;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ActionProvider;

public class ShareActionProvider extends ActionProvider {
    public interface OnShareTargetSelectedListener {
        boolean onShareTargetSelected(ShareActionProvider arg1, Intent arg2);
    }

    public static final String DEFAULT_SHARE_HISTORY_FILE_NAME = "share_history.xml";
    public final int d;
    public final z2 e;
    public final Context f;
    public String g;
    public OnShareTargetSelectedListener h;
    public y2 i;

    public ShareActionProvider(Context context0) {
        super(context0);
        this.d = 4;
        this.e = new z2(this);
        this.g = "share_history.xml";
        this.f = context0;
    }

    public final void a() {
        if(this.h == null) {
            return;
        }
        if(this.i == null) {
            this.i = new y2(this);
        }
        t t0 = t.d(this.f, this.g);
        synchronized(t0.a) {
            t0.m = this.i;
        }
    }

    @Override  // androidx.core.view.ActionProvider
    public boolean hasSubMenu() {
        return true;
    }

    @Override  // androidx.core.view.ActionProvider
    public View onCreateActionView() {
        Context context0 = this.f;
        View view0 = new ActivityChooserView(context0);
        if(!view0.isInEditMode()) {
            ((ActivityChooserView)view0).setActivityChooserModel(t.d(context0, this.g));
        }
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(attr.actionModeShareDrawable, typedValue0, true);
        ((ActivityChooserView)view0).setExpandActivityOverflowButtonDrawable(AppCompatResources.getDrawable(context0, typedValue0.resourceId));
        ((ActivityChooserView)view0).setProvider(this);
        ((ActivityChooserView)view0).setDefaultActionButtonContentDescription(string.abc_shareactionprovider_share_with_application);
        ((ActivityChooserView)view0).setExpandActivityOverflowButtonContentDescription(string.abc_shareactionprovider_share_with);
        return view0;
    }

    @Override  // androidx.core.view.ActionProvider
    public void onPrepareSubMenu(SubMenu subMenu0) {
        z2 z20;
        subMenu0.clear();
        Context context0 = this.f;
        t t0 = t.d(context0, this.g);
        PackageManager packageManager0 = context0.getPackageManager();
        int v = t0.f();
        int v1 = Math.min(v, this.d);
        for(int v2 = 0; true; ++v2) {
            z20 = this.e;
            if(v2 >= v1) {
                break;
            }
            ResolveInfo resolveInfo0 = t0.e(v2);
            subMenu0.add(0, v2, v2, resolveInfo0.loadLabel(packageManager0)).setIcon(resolveInfo0.loadIcon(packageManager0)).setOnMenuItemClickListener(z20);
        }
        if(v1 < v) {
            SubMenu subMenu1 = subMenu0.addSubMenu(0, v1, v1, context0.getString(string.abc_activity_chooser_view_see_all));
            for(int v3 = 0; v3 < v; ++v3) {
                ResolveInfo resolveInfo1 = t0.e(v3);
                subMenu1.add(0, v3, v3, resolveInfo1.loadLabel(packageManager0)).setIcon(resolveInfo1.loadIcon(packageManager0)).setOnMenuItemClickListener(z20);
            }
        }
    }

    public void setOnShareTargetSelectedListener(OnShareTargetSelectedListener shareActionProvider$OnShareTargetSelectedListener0) {
        this.h = shareActionProvider$OnShareTargetSelectedListener0;
        this.a();
    }

    public void setShareHistoryFileName(String s) {
        this.g = s;
        this.a();
    }

    public void setShareIntent(Intent intent0) {
        if(intent0 != null) {
            String s = intent0.getAction();
            if("android.intent.action.SEND".equals(s) || "android.intent.action.SEND_MULTIPLE".equals(s)) {
                intent0.addFlags(0x8080000);
            }
        }
        t t0 = t.d(this.f, this.g);
        synchronized(t0.a) {
            if(t0.f == intent0) {
                return;
            }
            t0.f = intent0;
            t0.l = true;
            t0.c();
        }
    }
}

