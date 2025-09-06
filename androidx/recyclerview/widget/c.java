package androidx.recyclerview.widget;

public final class c extends Callback {
    public final e a;

    public c(e e0) {
        this.a = e0;
        super();
    }

    @Override  // androidx.recyclerview.widget.DiffUtil$Callback
    public final boolean areContentsTheSame(int v, int v1) {
        e e0 = this.a;
        Object object0 = e0.a.get(v);
        Object object1 = e0.b.get(v1);
        if(object0 != null && object1 != null) {
            return e0.e.b.getDiffCallback().areContentsTheSame(object0, object1);
        }
        if(object0 != null || object1 != null) {
            throw new AssertionError();
        }
        return true;
    }

    @Override  // androidx.recyclerview.widget.DiffUtil$Callback
    public final boolean areItemsTheSame(int v, int v1) {
        Object object0 = this.a.a.get(v);
        Object object1 = this.a.b.get(v1);
        return object0 == null || object1 == null ? object0 == null && object1 == null : this.a.e.b.getDiffCallback().areItemsTheSame(object0, object1);
    }

    @Override  // androidx.recyclerview.widget.DiffUtil$Callback
    public final Object getChangePayload(int v, int v1) {
        e e0 = this.a;
        Object object0 = e0.a.get(v);
        Object object1 = e0.b.get(v1);
        if(object0 == null || object1 == null) {
            throw new AssertionError();
        }
        return e0.e.b.getDiffCallback().getChangePayload(object0, object1);
    }

    @Override  // androidx.recyclerview.widget.DiffUtil$Callback
    public final int getNewListSize() {
        return this.a.b.size();
    }

    @Override  // androidx.recyclerview.widget.DiffUtil$Callback
    public final int getOldListSize() {
        return this.a.a.size();
    }
}

