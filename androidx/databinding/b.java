package androidx.databinding;

public abstract class b extends BaseObservable {
    public b() {
    }

    public b(Observable[] arr_observable) {
        if(arr_observable != null && arr_observable.length != 0) {
            a a0 = new a(this);
            for(int v = 0; v < arr_observable.length; ++v) {
                arr_observable[v].addOnPropertyChangedCallback(a0);
            }
        }
    }
}

