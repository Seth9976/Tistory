package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;

interface ChildHelper.Callback {
    void addView(View arg1, int arg2);

    void attachViewToParent(View arg1, int arg2, ViewGroup.LayoutParams arg3);

    void detachViewFromParent(int arg1);

    View getChildAt(int arg1);

    int getChildCount();

    ViewHolder getChildViewHolder(View arg1);

    int indexOfChild(View arg1);

    void onEnteredHiddenState(View arg1);

    void onLeftHiddenState(View arg1);

    void removeAllViews();

    void removeViewAt(int arg1);
}

