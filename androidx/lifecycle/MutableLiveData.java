package androidx.lifecycle;

public class MutableLiveData extends LiveData {
    public MutableLiveData() {
    }

    public MutableLiveData(Object object0) {
        super(object0);
    }

    @Override  // androidx.lifecycle.LiveData
    public void postValue(Object object0) {
        super.postValue(object0);
    }

    @Override  // androidx.lifecycle.LiveData
    public void setValue(Object object0) {
        super.setValue(object0);
    }
}

