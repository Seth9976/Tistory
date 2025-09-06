package androidx.viewpager2.adapter;

import android.os.Parcelable;
import androidx.annotation.NonNull;

public interface StatefulAdapter {
    void restoreState(@NonNull Parcelable arg1);

    @NonNull
    Parcelable saveState();
}

