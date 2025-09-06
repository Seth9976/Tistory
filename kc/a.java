package kc;

import android.widget.CalendarView.OnDateChangeListener;
import android.widget.CalendarView;
import com.kakao.tistory.presentation.view.common.dialog.CommonDatePickerDialog;

public final class a implements CalendarView.OnDateChangeListener {
    public final CommonDatePickerDialog a;

    public a(CommonDatePickerDialog commonDatePickerDialog0) {
        this.a = commonDatePickerDialog0;
    }

    @Override  // android.widget.CalendarView$OnDateChangeListener
    public final void onSelectedDayChange(CalendarView calendarView0, int v, int v1, int v2) {
        CommonDatePickerDialog.a(this.a, calendarView0, v, v1, v2);
    }
}

