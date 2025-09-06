package com.google.android.material.datepicker;

import java.util.List;

public final class e implements Operator {
    @Override  // com.google.android.material.datepicker.CompositeDateValidator$Operator
    public final int getId() {
        return 2;
    }

    @Override  // com.google.android.material.datepicker.CompositeDateValidator$Operator
    public final boolean isValid(List list0, long v) {
        for(Object object0: list0) {
            if(((DateValidator)object0) != null && !((DateValidator)object0).isValid(v)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }
}

