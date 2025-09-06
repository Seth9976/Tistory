package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.core.util.Pair;
import com.google.android.material.R.layout;
import com.google.android.material.R.string;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;

public final class z extends BaseAdapter {
    public final y a;
    public final DateSelector b;
    public Collection c;
    public c d;
    public final CalendarConstraints e;
    public final DayViewDecorator f;
    public static final int g;
    public static final int h;

    static {
        z.g = i0.g(null).getMaximum(4);
        int v = i0.g(null).getMaximum(5);
        z.h = i0.g(null).getMaximum(7) + v - 1;
    }

    public z(y y0, DateSelector dateSelector0, CalendarConstraints calendarConstraints0, DayViewDecorator dayViewDecorator0) {
        this.a = y0;
        this.b = dateSelector0;
        this.e = calendarConstraints0;
        this.f = dayViewDecorator0;
        this.c = dateSelector0.getSelectedDays();
    }

    public final int a() {
        int v = this.e.e;
        y y0 = this.a;
        Calendar calendar0 = y0.a;
        int v1 = calendar0.get(7);
        if(v <= 0) {
            v = calendar0.getFirstDayOfWeek();
        }
        int v2 = v1 - v;
        return v2 >= 0 ? v2 : v2 + y0.d;
    }

    public final Long b(int v) {
        if(v >= this.a() && v <= this.c()) {
            int v1 = this.a();
            Calendar calendar0 = i0.c(this.a.a);
            calendar0.set(5, v - v1 + 1);
            return calendar0.getTimeInMillis();
        }
        return null;
    }

    public final int c() {
        return this.a() + this.a.e - 1;
    }

    public final void d(TextView textView0, long v, int v1) {
        b b0;
        if(textView0 == null) {
            return;
        }
        boolean z = false;
        Context context0 = textView0.getContext();
        boolean z1 = false;
        boolean z2 = Long.compare(i0.f().getTimeInMillis(), v) == 0;
        DateSelector dateSelector0 = this.b;
        for(Object object0: dateSelector0.getSelectedRanges()) {
            Object object1 = ((Pair)object0).first;
            if(object1 != null && ((long)(((Long)object1))) == v) {
                z = true;
                break;
            }
        }
        boolean z3 = false;
        for(Object object2: dateSelector0.getSelectedRanges()) {
            Object object3 = ((Pair)object2).second;
            if(object3 != null && ((long)(((Long)object3))) == v) {
                z3 = true;
                break;
            }
        }
        Calendar calendar0 = i0.f();
        Calendar calendar1 = i0.g(null);
        calendar1.setTimeInMillis(v);
        String s = calendar0.get(1) == calendar1.get(1) ? i0.b("MMMMEEEEd", Locale.getDefault()).format(new Date(v)) : i0.b("yMMMMEEEEd", Locale.getDefault()).format(new Date(v));
        if(z2) {
            s = String.format(context0.getString(string.mtrl_picker_today_description), s);
        }
        if(z) {
            s = String.format(context0.getString(string.mtrl_picker_start_date_description), s);
        }
        else if(z3) {
            s = String.format(context0.getString(string.mtrl_picker_end_date_description), s);
        }
        textView0.setContentDescription(s);
        if(this.e.getDateValidator().isValid(v)) {
            textView0.setEnabled(true);
            for(Object object4: dateSelector0.getSelectedDays()) {
                if(i0.a(v) == i0.a(((long)(((Long)object4))))) {
                    z1 = true;
                    break;
                }
                if(false) {
                    break;
                }
            }
            textView0.setSelected(z1);
            if(z1) {
                b0 = this.d.b;
            }
            else if(i0.f().getTimeInMillis() == v) {
                b0 = this.d.c;
            }
            else {
                b0 = this.d.a;
            }
        }
        else {
            textView0.setEnabled(false);
            b0 = this.d.g;
        }
        if(this.f != null && v1 != -1) {
            b0.b(textView0, null, null);
            textView0.setCompoundDrawables(null, null, null, null);
            textView0.setContentDescription(s);
            return;
        }
        b0.b(textView0, null, null);
    }

    public final void e(MaterialCalendarGridView materialCalendarGridView0, long v) {
        y y0 = y.c(v);
        y y1 = this.a;
        if(y0.equals(y1)) {
            Calendar calendar0 = i0.c(y1.a);
            calendar0.setTimeInMillis(v);
            int v1 = calendar0.get(5);
            this.d(((TextView)materialCalendarGridView0.getChildAt(materialCalendarGridView0.a().a() + (v1 - 1) - materialCalendarGridView0.getFirstVisiblePosition())), v, v1);
        }
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return z.h;
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.b(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return (long)(v / this.a.d);
    }

    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        int v2;
        Context context0 = viewGroup0.getContext();
        if(this.d == null) {
            this.d = new c(context0);
        }
        View view1 = (TextView)view0;
        if(view0 == null) {
            view1 = (TextView)LayoutInflater.from(viewGroup0.getContext()).inflate(layout.mtrl_calendar_day, viewGroup0, false);
        }
        int v1 = v - this.a();
        if(v1 >= 0) {
            y y0 = this.a;
            if(v1 < y0.e) {
                v2 = v1 + 1;
                view1.setTag(y0);
                ((TextView)view1).setText(String.format(view1.getResources().getConfiguration().locale, "%d", v2));
                view1.setVisibility(0);
                ((TextView)view1).setEnabled(true);
                goto label_19;
            }
            goto label_16;
        }
        else {
        label_16:
            view1.setVisibility(8);
            ((TextView)view1).setEnabled(false);
            v2 = -1;
        }
    label_19:
        Long long0 = this.b(v);
        if(long0 != null) {
            this.d(((TextView)view1), ((long)long0), v2);
        }
        return view1;
    }

    @Override  // android.widget.BaseAdapter
    public final boolean hasStableIds() {
        return true;
    }
}

