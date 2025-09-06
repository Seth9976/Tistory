package androidx.databinding;

public interface Observable {
    public static abstract class OnPropertyChangedCallback {
        public abstract void onPropertyChanged(Observable arg1, int arg2);
    }

    void addOnPropertyChangedCallback(OnPropertyChangedCallback arg1);

    void removeOnPropertyChangedCallback(OnPropertyChangedCallback arg1);
}

