package androidx.databinding;

import androidx.annotation.Nullable;
import java.io.Serializable;

public class ObservableField extends b implements Serializable {
    public Object g;

    public ObservableField() {
    }

    public ObservableField(Object object0) {
        this.g = object0;
    }

    public ObservableField(Observable[] arr_observable) {
        super(arr_observable);
    }

    @Nullable
    public Object get() {
        return this.g;
    }

    public void set(Object object0) {
        if(object0 != this.g) {
            this.g = object0;
            this.notifyChange();
        }
    }
}

