package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.b;
import c4.d;
import com.google.android.material.R.dimen;
import com.google.android.material.R.id;
import com.google.android.material.R.integer;
import com.google.android.material.R.layout;
import com.google.android.material.button.MaterialButton;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class MaterialCalendar extends c0 {
    interface OnDayClickListener {
        void onDayClick(long arg1);
    }

    public DateSelector A;
    public CalendarConstraints B;
    public DayViewDecorator C;
    public y D;
    public int E;
    public c F;
    public RecyclerView G;
    public RecyclerView H;
    public View I;
    public View J;
    public View K;
    public View L;
    public int z;

    @Override  // com.google.android.material.datepicker.c0
    public boolean addOnSelectionChangedListener(@NonNull OnSelectionChangedListener onSelectionChangedListener0) {
        return this.onSelectionChangedListeners.add(onSelectionChangedListener0);
    }

    @Nullable
    public DateSelector getDateSelector() {
        return this.A;
    }

    public final void h(y y0) {
        b0 b00 = (b0)this.H.getAdapter();
        int v = b00.g.a.e(y0);
        int v1 = v - b00.g.a.e(this.D);
        boolean z = false;
        boolean z1 = Math.abs(v1) > 3;
        if(v1 > 0) {
            z = true;
        }
        this.D = y0;
        if(z1 && z) {
            this.H.scrollToPosition(v - 3);
            this.H.post(new b(this, v, 2));
            return;
        }
        if(z1) {
            this.H.scrollToPosition(v + 3);
            this.H.post(new b(this, v, 2));
            return;
        }
        this.H.post(new b(this, v, 2));
    }

    public final void i(int v) {
        this.E = v;
        if(v == 2) {
            this.G.getLayoutManager().scrollToPosition(this.D.c - ((k0)this.G.getAdapter()).g.B.a.c);
            this.K.setVisibility(0);
            this.L.setVisibility(8);
            this.I.setVisibility(8);
            this.J.setVisibility(8);
            return;
        }
        if(v == 1) {
            this.K.setVisibility(8);
            this.L.setVisibility(0);
            this.I.setVisibility(0);
            this.J.setVisibility(0);
            this.h(this.D);
        }
    }

    @NonNull
    public static MaterialCalendar newInstance(@NonNull DateSelector dateSelector0, @StyleRes int v, @NonNull CalendarConstraints calendarConstraints0) {
        return MaterialCalendar.newInstance(dateSelector0, v, calendarConstraints0, null);
    }

    @NonNull
    public static MaterialCalendar newInstance(@NonNull DateSelector dateSelector0, @StyleRes int v, @NonNull CalendarConstraints calendarConstraints0, @Nullable DayViewDecorator dayViewDecorator0) {
        MaterialCalendar materialCalendar0 = new MaterialCalendar();
        Bundle bundle0 = new Bundle();
        bundle0.putInt("THEME_RES_ID_KEY", v);
        bundle0.putParcelable("GRID_SELECTOR_KEY", dateSelector0);
        bundle0.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints0);
        bundle0.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator0);
        bundle0.putParcelable("CURRENT_MONTH_KEY", calendarConstraints0.d);
        materialCalendar0.setArguments(bundle0);
        return materialCalendar0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 == null) {
            bundle0 = this.getArguments();
        }
        this.z = bundle0.getInt("THEME_RES_ID_KEY");
        this.A = (DateSelector)bundle0.getParcelable("GRID_SELECTOR_KEY");
        this.B = (CalendarConstraints)bundle0.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.C = (DayViewDecorator)bundle0.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.D = (y)bundle0.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override  // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0) {
        int v1;
        int v;
        ContextThemeWrapper contextThemeWrapper0 = new ContextThemeWrapper(this.getContext(), this.z);
        this.F = new c(contextThemeWrapper0);
        LayoutInflater layoutInflater1 = layoutInflater0.cloneInContext(contextThemeWrapper0);
        y y0 = this.B.a;
        if(MaterialDatePicker.k(contextThemeWrapper0, 0x101020D)) {
            v = layout.mtrl_calendar_vertical;
            v1 = 1;
        }
        else {
            v = layout.mtrl_calendar_horizontal;
            v1 = 0;
        }
        View view0 = layoutInflater1.inflate(v, viewGroup0, false);
        Resources resources0 = this.requireContext().getResources();
        int v2 = resources0.getDimensionPixelSize(dimen.mtrl_calendar_navigation_height);
        int v3 = resources0.getDimensionPixelOffset(dimen.mtrl_calendar_navigation_top_padding);
        int v4 = resources0.getDimensionPixelOffset(dimen.mtrl_calendar_navigation_bottom_padding);
        int v5 = resources0.getDimensionPixelSize(dimen.mtrl_calendar_days_of_week_height);
        int v6 = resources0.getDimensionPixelSize(dimen.mtrl_calendar_day_height);
        int v7 = resources0.getDimensionPixelOffset(dimen.mtrl_calendar_month_vertical_padding);
        int v8 = resources0.getDimensionPixelOffset(dimen.mtrl_calendar_bottom_padding);
        view0.setMinimumHeight(v4 + (v3 + v2) + v5 + (v7 * (z.g - 1) + v6 * z.g) + v8);
        GridView gridView0 = (GridView)view0.findViewById(id.mtrl_calendar_days_of_week);
        ViewCompat.setAccessibilityDelegate(gridView0, new d(1));
        int v9 = this.B.e;
        gridView0.setAdapter((v9 <= 0 ? new k() : new k(v9)));
        gridView0.setNumColumns(y0.d);
        gridView0.setEnabled(false);
        this.H = (RecyclerView)view0.findViewById(id.mtrl_calendar_months);
        m m0 = new m(this, this.getContext(), v1, v1);
        this.H.setLayoutManager(m0);
        this.H.setTag("MONTHS_VIEW_GROUP_TAG");
        b0 b00 = new b0(contextThemeWrapper0, this.A, this.B, this.C, new n(this));
        this.H.setAdapter(b00);
        int v10 = contextThemeWrapper0.getResources().getInteger(integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView0 = (RecyclerView)view0.findViewById(id.mtrl_calendar_year_selector_frame);
        this.G = recyclerView0;
        if(recyclerView0 != null) {
            recyclerView0.setHasFixedSize(true);
            this.G.setLayoutManager(new GridLayoutManager(contextThemeWrapper0, v10, 1, false));
            this.G.setAdapter(new k0(this));
            this.G.addItemDecoration(new o(this));
        }
        if(view0.findViewById(id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton0 = (MaterialButton)view0.findViewById(id.month_navigation_fragment_toggle);
            materialButton0.setTag("SELECTOR_TOGGLE_TAG");
            ViewCompat.setAccessibilityDelegate(materialButton0, new p(this));
            View view1 = view0.findViewById(id.month_navigation_previous);
            this.I = view1;
            view1.setTag("NAVIGATION_PREV_TAG");
            View view2 = view0.findViewById(id.month_navigation_next);
            this.J = view2;
            view2.setTag("NAVIGATION_NEXT_TAG");
            this.K = view0.findViewById(id.mtrl_calendar_year_selector_frame);
            this.L = view0.findViewById(id.mtrl_calendar_day_selector_frame);
            this.i(1);
            materialButton0.setText(this.D.d());
            this.H.addOnScrollListener(new q(this, b00, materialButton0));
            materialButton0.setOnClickListener(new r(this));
            this.J.setOnClickListener(new s(this, b00));
            this.I.setOnClickListener(new l(this, b00));
        }
        if(!MaterialDatePicker.k(contextThemeWrapper0, 0x101020D)) {
            new PagerSnapHelper().attachToRecyclerView(this.H);
        }
        this.H.scrollToPosition(b00.g.a.e(this.D));
        ViewCompat.setAccessibilityDelegate(this.H, new d(2));
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putInt("THEME_RES_ID_KEY", this.z);
        bundle0.putParcelable("GRID_SELECTOR_KEY", this.A);
        bundle0.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.B);
        bundle0.putParcelable("DAY_VIEW_DECORATOR_KEY", this.C);
        bundle0.putParcelable("CURRENT_MONTH_KEY", this.D);
    }
}

