package androidx.appcompat.widget;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import q.d;

public final class w0 implements Runnable {
    public final int a;
    public final int b;
    public final Object c;
    public final Object d;

    public w0(BottomSheetBehavior bottomSheetBehavior0, View view0, int v) {
        this.a = 5;
        super();
        this.d = bottomSheetBehavior0;
        this.c = view0;
        this.b = v;
    }

    public w0(Object object0, int v, Parcelable parcelable0, int v1) {
        this.a = v1;
        this.d = object0;
        this.b = v;
        this.c = parcelable0;
        super();
    }

    public w0(Object object0, Object object1, int v, int v1) {
        this.a = v1;
        this.c = object0;
        this.d = object1;
        this.b = v;
        super();
    }

    @Override
    public final void run() {
        int v = this.b;
        Object object0 = this.c;
        Object object1 = this.d;
        switch(this.a) {
            case 0: {
                ((TextView)object0).setTypeface(((Typeface)object1), v);
                return;
            }
            case 1: {
                ((SystemAlarmDispatcher)object0).add(((Intent)object1), v);
                return;
            }
            case 2: {
                ((SystemForegroundService)object1).e.notify(v, ((Notification)object0));
                return;
            }
            case 3: {
                return;
            }
            case 4: {
                ((d)object1).b.onNavigationEvent(v, ((Bundle)object0));
                return;
            }
            default: {
                ((BottomSheetBehavior)object1).n(((View)object0), v, false);
            }
        }
    }
}

