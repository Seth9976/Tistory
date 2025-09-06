package androidx.databinding;

import java.util.Map;

public interface ObservableMap extends Map {
    public static abstract class OnMapChangedCallback {
        public abstract void onMapChanged(ObservableMap arg1, Object arg2);
    }

    void addOnMapChangedCallback(OnMapChangedCallback arg1);

    void removeOnMapChangedCallback(OnMapChangedCallback arg1);
}

