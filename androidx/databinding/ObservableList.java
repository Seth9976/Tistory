package androidx.databinding;

import java.util.List;

public interface ObservableList extends List {
    public static abstract class OnListChangedCallback {
        public abstract void onChanged(ObservableList arg1);

        public abstract void onItemRangeChanged(ObservableList arg1, int arg2, int arg3);

        public abstract void onItemRangeInserted(ObservableList arg1, int arg2, int arg3);

        public abstract void onItemRangeMoved(ObservableList arg1, int arg2, int arg3, int arg4);

        public abstract void onItemRangeRemoved(ObservableList arg1, int arg2, int arg3);
    }

    void addOnListChangedCallback(OnListChangedCallback arg1);

    void removeOnListChangedCallback(OnListChangedCallback arg1);
}

