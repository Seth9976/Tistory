package t3;

import android.widget.CalendarView.OnDateChangeListener;
import android.widget.CalendarView;
import androidx.databinding.InverseBindingListener;

public final class a implements CalendarView.OnDateChangeListener {
    public final CalendarView.OnDateChangeListener a;
    public final InverseBindingListener b;

    public a(CalendarView.OnDateChangeListener calendarView$OnDateChangeListener0, InverseBindingListener inverseBindingListener0) {
        this.a = calendarView$OnDateChangeListener0;
        this.b = inverseBindingListener0;
    }

    @Override  // android.widget.CalendarView$OnDateChangeListener
    public final void onSelectedDayChange(CalendarView calendarView0, int v, int v1, int v2) {
        CalendarView.OnDateChangeListener calendarView$OnDateChangeListener0 = this.a;
        if(calendarView$OnDateChangeListener0 != null) {
            calendarView$OnDateChangeListener0.onSelectedDayChange(calendarView0, v, v1, v2);
        }
        this.b.onChange();
    }
}

