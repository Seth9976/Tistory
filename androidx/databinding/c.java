package androidx.databinding;

public final class c extends NotifierCallback {
    @Override  // androidx.databinding.CallbackRegistry$NotifierCallback
    public final void onNotifyCallback(Object object0, Object object1, int v, Object object2) {
        switch(v) {
            case 1: {
                ((OnListChangedCallback)object0).onItemRangeChanged(((ObservableList)object1), ((d)object2).a, ((d)object2).b);
                return;
            }
            case 2: {
                ((OnListChangedCallback)object0).onItemRangeInserted(((ObservableList)object1), ((d)object2).a, ((d)object2).b);
                return;
            }
            case 3: {
                ((OnListChangedCallback)object0).onItemRangeMoved(((ObservableList)object1), ((d)object2).a, ((d)object2).c, ((d)object2).b);
                return;
            }
            case 4: {
                ((OnListChangedCallback)object0).onItemRangeRemoved(((ObservableList)object1), ((d)object2).a, ((d)object2).b);
                return;
            }
            default: {
                ((OnListChangedCallback)object0).onChanged(((ObservableList)object1));
            }
        }
    }
}

