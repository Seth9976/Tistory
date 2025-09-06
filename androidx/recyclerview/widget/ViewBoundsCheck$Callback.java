package androidx.recyclerview.widget;

import android.view.View;

interface ViewBoundsCheck.Callback {
    View getChildAt(int arg1);

    int getChildEnd(View arg1);

    int getChildStart(View arg1);

    int getParentEnd();

    int getParentStart();
}

