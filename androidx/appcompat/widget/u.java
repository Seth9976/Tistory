package androidx.appcompat.widget;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;

public final class u extends DataSetObserver {
    public final int a;
    public final ActivityChooserView b;

    public u(ActivityChooserView activityChooserView0, int v) {
        this.a = v;
        this.b = activityChooserView0;
        super();
    }

    @Override  // android.database.DataSetObserver
    public final void onChanged() {
        if(this.a != 0) {
            super.onChanged();
            ActivityChooserView activityChooserView0 = this.b;
            if(activityChooserView0.a.getCount() > 0) {
                activityChooserView0.e.setEnabled(true);
            }
            else {
                activityChooserView0.e.setEnabled(false);
            }
            int v = activityChooserView0.a.a.f();
            t t0 = activityChooserView0.a.a;
            synchronized(t0.a) {
                t0.c();
            }
            if(v == 1 || v > 1 && t0.c.size() > 0) {
                activityChooserView0.g.setVisibility(0);
                ResolveInfo resolveInfo0 = activityChooserView0.a.a.g();
                PackageManager packageManager0 = activityChooserView0.getContext().getPackageManager();
                Drawable drawable0 = resolveInfo0.loadIcon(packageManager0);
                activityChooserView0.h.setImageDrawable(drawable0);
                if(activityChooserView0.r != 0) {
                    CharSequence charSequence0 = resolveInfo0.loadLabel(packageManager0);
                    String s = activityChooserView0.getContext().getString(activityChooserView0.r, new Object[]{charSequence0});
                    activityChooserView0.g.setContentDescription(s);
                }
            }
            else {
                activityChooserView0.g.setVisibility(8);
            }
            if(activityChooserView0.g.getVisibility() == 0) {
                activityChooserView0.c.setBackgroundDrawable(activityChooserView0.d);
                return;
            }
            activityChooserView0.c.setBackgroundDrawable(null);
            return;
        }
        super.onChanged();
        this.b.a.notifyDataSetChanged();
    }

    @Override  // android.database.DataSetObserver
    public void onInvalidated() {
        if(this.a != 0) {
            super.onInvalidated();
            return;
        }
        super.onInvalidated();
        this.b.a.notifyDataSetInvalidated();
    }
}

