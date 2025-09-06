package androidx.appcompat.widget;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.appcompat.graphics.drawable.StateListDrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.AutoScrollHelper;
import androidx.customview.widget.ViewDragHelper;
import androidx.drawerlayout.widget.DrawerLayout.LayoutParams;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.drawerlayout.widget.b;
import androidx.lifecycle.LiveData;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.engine.c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.sidesheet.g;
import com.google.android.material.textfield.TextInputLayout;
import com.kakao.tiara.f;
import io.reactivex.android.MainThreadDisposable;
import io.reactivex.internal.operators.flowable.f6;
import io.reactivex.internal.operators.observable.j4;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;

public final class a implements Runnable {
    public final int a;
    public Object b;

    public a() {
        this.a = 12;
        super();
    }

    public a(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override
    public final void run() {
        Object object1;
        URL uRL0;
        int v5;
        View view0;
        int v = 3;
        OutputStream outputStream0 = null;
        switch(this.a) {
            case 0: {
                ((ActionBarContextView)this.b).showOverflowMenu();
                return;
            }
            case 1: {
                ((s1)this.b).l = null;
                ((s1)this.b).drawableStateChanged();
                return;
            }
            case 2: {
                ((Toolbar)this.b).showOverflowMenu();
                return;
            }
            case 3: {
                ((View)this.b).setNestedScrollingEnabled(true);
                return;
            }
            case 4: {
                synchronized(((LiveData)this.b).d) {
                    object1 = ((LiveData)this.b).i;
                    ((LiveData)this.b).i = LiveData.n;
                }
                ((LiveData)this.b).setValue(object1);
                return;
            }
            case 5: {
                b b0 = (b)this.b;
                int v3 = b0.b.getEdgeSize();
                int v4 = b0.a;
                DrawerLayout drawerLayout0 = b0.d;
                if(v4 == 3) {
                    view0 = drawerLayout0.c(3);
                    v5 = (view0 == null ? 0 : -view0.getWidth()) + v3;
                }
                else {
                    view0 = drawerLayout0.c(5);
                    v5 = drawerLayout0.getWidth() - v3;
                }
                if(view0 != null && (v4 == 3 && view0.getLeft() < v5 || v4 != 3 && view0.getLeft() > v5) && drawerLayout0.getDrawerLockMode(view0) == 0) {
                    LayoutParams drawerLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                    b0.b.smoothSlideViewTo(view0, v5, view0.getTop());
                    drawerLayout$LayoutParams0.b = true;
                    drawerLayout0.invalidate();
                    if(v4 == 3) {
                        v = 5;
                    }
                    View view1 = drawerLayout0.c(v);
                    if(view1 != null) {
                        drawerLayout0.closeDrawer(view1);
                    }
                    if(!drawerLayout0.r) {
                        long v6 = SystemClock.uptimeMillis();
                        MotionEvent motionEvent0 = MotionEvent.obtain(v6, v6, 3, 0.0f, 0.0f, 0);
                        int v7 = drawerLayout0.getChildCount();
                        for(int v1 = 0; v1 < v7; ++v1) {
                            drawerLayout0.getChildAt(v1).dispatchTouchEvent(motionEvent0);
                        }
                        motionEvent0.recycle();
                        drawerLayout0.r = true;
                    }
                }
                return;
            }
            case 6: {
                ((RequestManager)this.b).a.addListener(((RequestManager)this.b));
                return;
            }
            case 7: {
                c c0 = (c)this.b;
                while(!c0.f) {
                    try {
                        c0.b(((com.bumptech.glide.load.engine.b)c0.d.remove()));
                    }
                    catch(InterruptedException unused_ex) {
                        Thread.currentThread().interrupt();
                    }
                }
                return;
            }
            case 8: {
                ((zaaw)this.b).d.cancelAvailabilityErrorNotifications(((zaaw)this.b).c);
                return;
            }
            case 9: {
                ((zabq)this.b).f();
                return;
            }
            case 10: {
                ((zact)this.b).g.zae(new ConnectionResult(4));
                return;
            }
            case 11: {
                com.google.android.gms.common.api.internal.b b1 = (com.google.android.gms.common.api.internal.b)this.b;
                b1.m.lock();
                try {
                    com.google.android.gms.common.api.internal.b.d(b1);
                }
                finally {
                    b1.m.unlock();
                }
                return;
            }
            case 12: {
                try {
                    uRL0 = null;
                    uRL0 = new URL((f.a.d.k == null ? "https://stat.tiara.daum.net/track" : f.a.d.k));
                }
                catch(MalformedURLException unused_ex) {
                }
                if(uRL0 != null) {
                    com.kakao.tiara.a.c(3, "a", "server url is : " + uRL0.toString(), new Object[0]);
                    try {
                        byte[] arr_b = ((String)this.b).getBytes("UTF-8");
                        if(arr_b.length <= 80000) {
                            String s = f.a.c();
                            com.kakao.tiara.a.c(3, "a", "tiara cookie : %s", new Object[]{s});
                            HttpURLConnection httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
                            httpURLConnection0.setRequestMethod("POST");
                            httpURLConnection0.setDoOutput(true);
                            httpURLConnection0.setDoInput(false);
                            httpURLConnection0.setReadTimeout(5000);
                            httpURLConnection0.setConnectTimeout(5000);
                            httpURLConnection0.setRequestProperty("Connection", "Close");
                            httpURLConnection0.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
                            if(!TextUtils.isEmpty(s)) {
                                httpURLConnection0.addRequestProperty("Cookie", s);
                            }
                            Locale locale0 = Locale.getDefault();
                            if(locale0 != null) {
                                httpURLConnection0.setRequestProperty("Accept-Language", locale0.toString());
                            }
                            outputStream0 = httpURLConnection0.getOutputStream();
                            outputStream0.write(arr_b);
                            outputStream0.close();
                            com.kakao.tiara.a.c(3, "a", "server response code : %d", new Object[]{httpURLConnection0.getResponseCode()});
                            httpURLConnection0.disconnect();
                            goto label_107;
                        }
                    }
                    catch(Throwable unused_ex) {
                        if(outputStream0 != null) {
                            goto label_107;
                        }
                    }
                    return;
                    try {
                    label_107:
                        outputStream0.close();
                        return;
                    }
                    catch(Exception unused_ex) {
                    }
                }
                return;
            }
            case 13: {
                ViewPager viewPager0 = (ViewPager)this.b;
                viewPager0.setScrollState(0);
                viewPager0.o();
                return;
            }
            case 14: {
                ((FragmentStateAdapter)this.b).n = false;
                ((FragmentStateAdapter)this.b).b();
                return;
            }
            case 15: {
                CheckableImageButton checkableImageButton0 = ((TextInputLayout)this.b).g.g;
                checkableImageButton0.performClick();
                checkableImageButton0.jumpDrawablesToCurrentState();
                return;
            }
            case 16: {
                ((f6)this.b).c.cancel();
                return;
            }
            case 17: {
                ((j4)this.b).c.dispose();
                return;
            }
            case 18: {
                StateListDrawableCompat stateListDrawableCompat0 = (StateListDrawableCompat)this.b;
                stateListDrawableCompat0.a(true);
                stateListDrawableCompat0.invalidateSelf();
                return;
            }
            case 19: {
                AutoScrollHelper autoScrollHelper0 = (AutoScrollHelper)this.b;
                if(autoScrollHelper0.o) {
                    p3.a a0 = autoScrollHelper0.a;
                    if(autoScrollHelper0.m) {
                        autoScrollHelper0.m = false;
                        long v9 = AnimationUtils.currentAnimationTimeMillis();
                        a0.e = v9;
                        a0.g = -1L;
                        a0.f = v9;
                        a0.h = 0.5f;
                    }
                    if(a0.g > 0L && AnimationUtils.currentAnimationTimeMillis() > a0.g + ((long)a0.i) || !autoScrollHelper0.e()) {
                        autoScrollHelper0.o = false;
                        return;
                    }
                    View view2 = autoScrollHelper0.c;
                    if(autoScrollHelper0.n) {
                        autoScrollHelper0.n = false;
                        long v10 = SystemClock.uptimeMillis();
                        MotionEvent motionEvent1 = MotionEvent.obtain(v10, v10, 3, 0.0f, 0.0f, 0);
                        view2.onTouchEvent(motionEvent1);
                        motionEvent1.recycle();
                    }
                    if(a0.f == 0L) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long v11 = AnimationUtils.currentAnimationTimeMillis();
                    float f = a0.a(v11);
                    long v12 = v11 - a0.f;
                    a0.f = v11;
                    float f1 = ((float)v12) * (f * 4.0f + -4.0f * f * f);
                    autoScrollHelper0.scrollTargetBy(((int)(a0.c * f1)), ((int)(f1 * a0.d)));
                    ViewCompat.postOnAnimation(view2, this);
                    return;
                }
                return;
            }
            case 20: {
                g g0 = (g)this.b;
                g0.c = false;
                ViewDragHelper viewDragHelper0 = ((BottomSheetBehavior)g0.e).c0;
                if(viewDragHelper0 != null && viewDragHelper0.continueSettling(true)) {
                    g0.a(g0.b);
                    return;
                }
                BottomSheetBehavior bottomSheetBehavior0 = (BottomSheetBehavior)g0.e;
                if(bottomSheetBehavior0.a0 == 2) {
                    bottomSheetBehavior0.l(g0.b);
                }
                return;
            }
            case 21: {
                ((ViewDragHelper)this.b).k(0);
                return;
            }
            default: {
                ((MainThreadDisposable)this.b).onDispose();
            }
        }
    }
}

