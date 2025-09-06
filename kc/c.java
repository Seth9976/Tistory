package kc;

import android.widget.TimePicker.OnTimeChangedListener;
import android.widget.TimePicker;
import com.kakao.tistory.presentation.view.common.dialog.CommonTimePickerDialog;

public final class c implements TimePicker.OnTimeChangedListener {
    public final CommonTimePickerDialog a;

    public c(CommonTimePickerDialog commonTimePickerDialog0) {
        this.a = commonTimePickerDialog0;
    }

    @Override  // android.widget.TimePicker$OnTimeChangedListener
    public final void onTimeChanged(TimePicker timePicker0, int v, int v1) {
        CommonTimePickerDialog.a(this.a, timePicker0, v, v1);
    }
}

