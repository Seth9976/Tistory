package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.PopupWindow.OnDismissListener;
import androidx.core.view.ActionProvider;
import java.util.ArrayList;
import jeb.synthetic.FIN;

public final class x implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {
    public final ActivityChooserView a;

    public x(ActivityChooserView activityChooserView0) {
        this.a = activityChooserView0;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        ActivityChooserView activityChooserView0 = this.a;
        int v = 0;
        if(view0 == activityChooserView0.g) {
            activityChooserView0.dismissPopup();
            ResolveInfo resolveInfo0 = this.a.a.a.g();
            t t0 = this.a.a.a;
            Object object0 = t0.a;
            __monitor_enter(object0);
            int v1 = FIN.finallyOpen$NT();
            t0.c();
            ArrayList arrayList0 = t0.b;
            int v2 = arrayList0.size();
            while(true) {
                if(v >= v2) {
                    FIN.finallyCodeBegin$NT(v1);
                    __monitor_exit(object0);
                    FIN.finallyCodeEnd$NT(v1);
                    v = -1;
                    break;
                }
                if(((ActivityChooserModel.ActivityResolveInfo)arrayList0.get(v)).resolveInfo == resolveInfo0) {
                    FIN.finallyExec$NT(v1);
                    break;
                }
                ++v;
            }
            Intent intent0 = this.a.a.a.b(v);
            if(intent0 == null) {
                return;
            }
            intent0.addFlags(0x80000);
            this.a.getContext().startActivity(intent0);
            return;
        }
        if(view0 != activityChooserView0.e) {
            throw new IllegalArgumentException();
        }
        activityChooserView0.o = false;
        activityChooserView0.a(activityChooserView0.p);
    }

    @Override  // android.widget.PopupWindow$OnDismissListener
    public final void onDismiss() {
        ActivityChooserView activityChooserView0 = this.a;
        PopupWindow.OnDismissListener popupWindow$OnDismissListener0 = activityChooserView0.n;
        if(popupWindow$OnDismissListener0 != null) {
            popupWindow$OnDismissListener0.onDismiss();
        }
        ActionProvider actionProvider0 = activityChooserView0.j;
        if(actionProvider0 != null) {
            actionProvider0.subUiVisibilityChanged(false);
        }
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        switch(((w)adapterView0.getAdapter()).getItemViewType(v)) {
            case 0: {
                this.a.dismissPopup();
                ActivityChooserView activityChooserView0 = this.a;
                if(!activityChooserView0.o) {
                    w w0 = activityChooserView0.a;
                    if(!w0.c) {
                        ++v;
                    }
                    Intent intent0 = w0.a.b(v);
                    if(intent0 != null) {
                        intent0.addFlags(0x80000);
                        this.a.getContext().startActivity(intent0);
                    }
                }
                else if(v > 0) {
                    t t0 = activityChooserView0.a.a;
                    synchronized(t0.a) {
                        t0.c();
                        ActivityChooserModel.ActivityResolveInfo activityChooserModel$ActivityResolveInfo0 = (ActivityChooserModel.ActivityResolveInfo)t0.b.get(v);
                        ActivityChooserModel.ActivityResolveInfo activityChooserModel$ActivityResolveInfo1 = (ActivityChooserModel.ActivityResolveInfo)t0.b.get(0);
                        float f = activityChooserModel$ActivityResolveInfo1 == null ? 1.0f : activityChooserModel$ActivityResolveInfo1.weight - activityChooserModel$ActivityResolveInfo0.weight + 5.0f;
                        t0.a(new ActivityChooserModel.HistoricalRecord(new ComponentName(activityChooserModel$ActivityResolveInfo0.resolveInfo.activityInfo.packageName, activityChooserModel$ActivityResolveInfo0.resolveInfo.activityInfo.name), System.currentTimeMillis(), f));
                    }
                    return;
                }
                return;
            }
            case 1: {
                this.a.a(0x7FFFFFFF);
                return;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }

    @Override  // android.view.View$OnLongClickListener
    public final boolean onLongClick(View view0) {
        ActivityChooserView activityChooserView0 = this.a;
        if(view0 != activityChooserView0.g) {
            throw new IllegalArgumentException();
        }
        if(activityChooserView0.a.getCount() > 0) {
            activityChooserView0.o = true;
            activityChooserView0.a(activityChooserView0.p);
        }
        return true;
    }
}

