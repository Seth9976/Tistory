package androidx.recyclerview.widget;

interface AdapterHelper.Callback {
    ViewHolder findViewHolder(int arg1);

    void markViewHoldersUpdated(int arg1, int arg2, Object arg3);

    void offsetPositionsForAdd(int arg1, int arg2);

    void offsetPositionsForMove(int arg1, int arg2);

    void offsetPositionsForRemovingInvisible(int arg1, int arg2);

    void offsetPositionsForRemovingLaidOutOrNewView(int arg1, int arg2);

    void onDispatchFirstPass(a arg1);

    void onDispatchSecondPass(a arg1);
}

