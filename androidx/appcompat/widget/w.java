package androidx.appcompat.widget;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R.id;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.string;

public final class w extends BaseAdapter {
    public t a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final ActivityChooserView f;

    public w(ActivityChooserView activityChooserView0) {
        this.f = activityChooserView0;
        super();
        this.b = 4;
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        int v = this.a.f();
        if(!this.c && this.a.g() != null) {
            --v;
        }
        int v1 = Math.min(v, this.b);
        return this.e ? v1 + 1 : v1;
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        switch(this.getItemViewType(v)) {
            case 0: {
                if(!this.c && this.a.g() != null) {
                    ++v;
                }
                return this.a.e(v);
            }
            case 1: {
                return null;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return (long)v;
    }

    @Override  // android.widget.BaseAdapter
    public final int getItemViewType(int v) {
        return !this.e || v != this.getCount() - 1 ? 0 : 1;
    }

    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        int v1 = this.getItemViewType(v);
        ActivityChooserView activityChooserView0 = this.f;
        switch(v1) {
            case 0: {
                if(view0 == null || view0.getId() != id.list_item) {
                    view0 = LayoutInflater.from(activityChooserView0.getContext()).inflate(layout.abc_activity_chooser_view_list_item, viewGroup0, false);
                }
                PackageManager packageManager0 = activityChooserView0.getContext().getPackageManager();
                ImageView imageView0 = (ImageView)view0.findViewById(id.icon);
                ResolveInfo resolveInfo0 = (ResolveInfo)this.getItem(v);
                imageView0.setImageDrawable(resolveInfo0.loadIcon(packageManager0));
                ((TextView)view0.findViewById(id.title)).setText(resolveInfo0.loadLabel(packageManager0));
                if(this.c && v == 0 && this.d) {
                    view0.setActivated(true);
                    return view0;
                }
                view0.setActivated(false);
                return view0;
            }
            case 1: {
                if(view0 == null || view0.getId() != 1) {
                    view0 = LayoutInflater.from(activityChooserView0.getContext()).inflate(layout.abc_activity_chooser_view_list_item, viewGroup0, false);
                    view0.setId(1);
                    ((TextView)view0.findViewById(id.title)).setText(activityChooserView0.getContext().getString(string.abc_activity_chooser_view_see_all));
                }
                return view0;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }

    @Override  // android.widget.BaseAdapter
    public final int getViewTypeCount() {
        return 3;
    }
}

