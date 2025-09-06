package com.google.android.gms.tasks;

import java.util.ArrayList;
import java.util.Collection;

public final class a implements Continuation {
    public final int a;
    public final Collection b;

    public a(Collection collection0, int v) {
        this.a = v;
        this.b = collection0;
        super();
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        if(this.a != 0) {
            ArrayList arrayList0 = new ArrayList();
            arrayList0.addAll(this.b);
            return Tasks.forResult(arrayList0);
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: this.b) {
            arrayList1.add(((Task)object0).getResult());
        }
        return arrayList1;
    }
}

