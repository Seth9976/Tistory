package com.kakao.keditor.plugin.pluginspec.poll.creator;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;

public final class c implements DatePickerDialog.OnDateSetListener {
    public final int a;
    public final PollCreatorAdapter b;

    public c(PollCreatorAdapter pollCreatorAdapter0, int v) {
        this.a = v;
        this.b = pollCreatorAdapter0;
        super();
    }

    @Override  // android.app.DatePickerDialog$OnDateSetListener
    public final void onDateSet(DatePicker datePicker0, int v, int v1, int v2) {
        if(this.a != 0) {
            com.kakao.keditor.plugin.pluginspec.poll.creator.PollCreatorAdapter.createPollItemListener.1.clickStartDate$lambda$1(this.b, datePicker0, v, v1, v2);
            return;
        }
        com.kakao.keditor.plugin.pluginspec.poll.creator.PollCreatorAdapter.createPollItemListener.1.clickEndDate$lambda$3(this.b, datePicker0, v, v1, v2);
    }
}

