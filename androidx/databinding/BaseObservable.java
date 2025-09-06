package androidx.databinding;

import androidx.annotation.NonNull;

public class BaseObservable implements Observable {
    private transient PropertyChangeRegistry mCallbacks;

    @Override  // androidx.databinding.Observable
    public void addOnPropertyChangedCallback(@NonNull OnPropertyChangedCallback observable$OnPropertyChangedCallback0) {
        synchronized(this) {
            if(this.mCallbacks == null) {
                this.mCallbacks = new PropertyChangeRegistry();
            }
        }
        this.mCallbacks.add(observable$OnPropertyChangedCallback0);
    }

    public void notifyChange() {
        PropertyChangeRegistry propertyChangeRegistry0;
        synchronized(this) {
            propertyChangeRegistry0 = this.mCallbacks;
            if(propertyChangeRegistry0 == null) {
                return;
            }
        }
        propertyChangeRegistry0.notifyCallbacks(this, 0, null);
    }

    public void notifyPropertyChanged(int v) {
        PropertyChangeRegistry propertyChangeRegistry0;
        synchronized(this) {
            propertyChangeRegistry0 = this.mCallbacks;
            if(propertyChangeRegistry0 == null) {
                return;
            }
        }
        propertyChangeRegistry0.notifyCallbacks(this, v, null);
    }

    @Override  // androidx.databinding.Observable
    public void removeOnPropertyChangedCallback(@NonNull OnPropertyChangedCallback observable$OnPropertyChangedCallback0) {
        PropertyChangeRegistry propertyChangeRegistry0;
        synchronized(this) {
            propertyChangeRegistry0 = this.mCallbacks;
            if(propertyChangeRegistry0 == null) {
                return;
            }
        }
        propertyChangeRegistry0.remove(observable$OnPropertyChangedCallback0);
    }
}

