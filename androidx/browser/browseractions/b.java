package androidx.browser.browseractions;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.browser.R.id;
import androidx.browser.R.layout;
import androidx.core.content.res.ResourcesCompat;
import java.util.List;

public final class b extends BaseAdapter {
    public final List a;
    public final Context b;

    public b(Context context0, List list0) {
        this.a = list0;
        this.b = context0;
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.a.get(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return (long)v;
    }

    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        a a0;
        BrowserActionItem browserActionItem0 = (BrowserActionItem)this.a.get(v);
        Context context0 = this.b;
        if(view0 == null) {
            view0 = LayoutInflater.from(context0).inflate(layout.browser_actions_context_menu_row, null);
            a0 = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
            a0.a = (ImageView)view0.findViewById(id.browser_actions_menu_item_icon);
            a0.b = (TextView)view0.findViewById(id.browser_actions_menu_item_text);
            view0.setTag(a0);
        }
        else {
            a0 = (a)view0.getTag();
        }
        a0.b.setText(browserActionItem0.getTitle());
        if(browserActionItem0.getIconId() != 0) {
            Drawable drawable0 = ResourcesCompat.getDrawable(context0.getResources(), browserActionItem0.getIconId(), null);
            a0.a.setImageDrawable(drawable0);
            return view0;
        }
        a0.a.setImageDrawable(null);
        return view0;
    }
}

