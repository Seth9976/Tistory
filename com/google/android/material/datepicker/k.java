package com.google.android.material.datepicker;

import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.R.layout;
import com.google.android.material.R.string;
import java.util.Calendar;
import java.util.Locale;

public final class k extends BaseAdapter {
    public final Calendar a;
    public final int b;
    public final int c;

    public k() {
        Calendar calendar0 = i0.g(null);
        this.a = calendar0;
        this.b = calendar0.getMaximum(7);
        this.c = calendar0.getFirstDayOfWeek();
    }

    public k(int v) {
        Calendar calendar0 = i0.g(null);
        this.a = calendar0;
        this.b = calendar0.getMaximum(7);
        this.c = v;
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.b;
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        int v1 = this.b;
        if(v >= v1) {
            return null;
        }
        int v2 = v + this.c;
        return (int)(v2 <= v1 ? v + this.c : v2 - v1);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return 0L;
    }

    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        View view1 = (TextView)view0;
        if(view0 == null) {
            view1 = (TextView)LayoutInflater.from(viewGroup0.getContext()).inflate(layout.mtrl_calendar_day_of_week, viewGroup0, false);
        }
        int v1 = v + this.c;
        int v2 = this.b;
        if(v1 > v2) {
            v1 -= v2;
        }
        this.a.set(7, v1);
        Configuration configuration0 = view1.getResources().getConfiguration();
        ((TextView)view1).setText(this.a.getDisplayName(7, 4, configuration0.locale));
        String s = viewGroup0.getContext().getString(string.mtrl_picker_day_of_week_column_header);
        Locale locale0 = Locale.getDefault();
        view1.setContentDescription(String.format(s, this.a.getDisplayName(7, 2, locale0)));
        return view1;
    }
}

