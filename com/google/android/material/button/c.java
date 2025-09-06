package com.google.android.material.button;

import fe.g;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

public final class c implements Comparator {
    public final int a;
    public final Object b;

    public c(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        Object object2 = this.b;
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(((g)object2), "$tmp0");
            return ((Number)((g)object2).invoke(object0, object1)).intValue();
        }
        int v = Boolean.valueOf(((MaterialButton)object0).isChecked()).compareTo(Boolean.valueOf(((MaterialButton)object1).isChecked()));
        if(v == 0) {
            v = Boolean.valueOf(((MaterialButton)object0).isPressed()).compareTo(Boolean.valueOf(((MaterialButton)object1).isPressed()));
            return v == 0 ? ((MaterialButtonToggleGroup)object2).indexOfChild(((MaterialButton)object0)).compareTo(((MaterialButtonToggleGroup)object2).indexOfChild(((MaterialButton)object1))) : v;
        }
        return v;
    }
}

