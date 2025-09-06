package androidx.appcompat.view.menu;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.r0;
import androidx.core.view.ActionProvider;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.WindowUtils;
import com.google.android.material.navigation.NavigationView;
import java.util.ArrayList;

public final class c implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int a;
    public final Object b;

    public c(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch(this.a) {
            case 0: {
                h h0 = (h)this.b;
                if(h0.isShowing()) {
                    ArrayList arrayList0 = h0.i;
                    if(arrayList0.size() > 0 && !((g)arrayList0.get(0)).a.isModal()) {
                        if(h0.p != null && h0.p.isShown()) {
                            for(Object object0: arrayList0) {
                                ((g)object0).a.show();
                            }
                            return;
                        }
                        h0.dismiss();
                    }
                }
                return;
            }
            case 1: {
                t t0 = (t)this.b;
                if(t0.isShowing() && !t0.i.isModal()) {
                    if(t0.n != null && t0.n.isShown()) {
                        t0.i.show();
                        return;
                    }
                    t0.dismiss();
                }
                return;
            }
            case 2: {
                ActivityChooserView activityChooserView0 = (ActivityChooserView)this.b;
                if(activityChooserView0.isShowingPopup()) {
                    if(!activityChooserView0.isShown()) {
                        activityChooserView0.getListPopupWindow().dismiss();
                        return;
                    }
                    activityChooserView0.getListPopupWindow().show();
                    ActionProvider actionProvider0 = activityChooserView0.j;
                    if(actionProvider0 != null) {
                        actionProvider0.subUiVisibilityChanged(true);
                    }
                }
                return;
            }
            case 3: {
                r0 r00 = (r0)this.b;
                r00.getClass();
                if(ViewCompat.isAttachedToWindow(r00.M) && r00.M.getGlobalVisibleRect(r00.K)) {
                    r00.c();
                    r00.super.show();
                    return;
                }
                r00.dismiss();
                return;
            }
            default: {
                NavigationView navigationView0 = (NavigationView)this.b;
                navigationView0.getLocationOnScreen(navigationView0.l);
                boolean z = true;
                boolean z1 = navigationView0.l[1] == 0;
                navigationView0.i.setBehindStatusBar(z1);
                navigationView0.setDrawTopInsetForeground(z1 && navigationView0.isTopInsetScrimEnabled());
                int v = navigationView0.l[0];
                navigationView0.setDrawLeftInsetForeground(v == 0 || navigationView0.getWidth() + v == 0);
                Activity activity0 = ContextUtils.getActivity(navigationView0.getContext());
                if(activity0 != null) {
                    Rect rect0 = WindowUtils.getCurrentWindowBounds(activity0);
                    navigationView0.setDrawBottomInsetForeground(rect0.height() - navigationView0.getHeight() == navigationView0.l[1] && Color.alpha(activity0.getWindow().getNavigationBarColor()) != 0 && navigationView0.isBottomInsetScrimEnabled());
                    if(rect0.width() != navigationView0.l[0] && rect0.width() - navigationView0.getWidth() != navigationView0.l[0]) {
                        z = false;
                    }
                    navigationView0.setDrawRightInsetForeground(z);
                }
            }
        }
    }
}

