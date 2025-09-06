package androidx.compose.runtime.saveable;

import androidx.compose.runtime.RememberObserver;
import d0.s;

public final class a implements RememberObserver, SaverScope {
    public Saver a;
    public SaveableStateRegistry b;
    public String c;
    public Object d;
    public Object[] e;
    public Entry f;
    public final s g;

    public a(Saver saver0, SaveableStateRegistry saveableStateRegistry0, String s, Object object0, Object[] arr_object) {
        this.a = saver0;
        this.b = saveableStateRegistry0;
        this.c = s;
        this.d = object0;
        this.e = arr_object;
        this.g = new s(this, 20);
    }

    public final void a() {
        SaveableStateRegistry saveableStateRegistry0 = this.b;
        if(this.f != null) {
            throw new IllegalArgumentException(("entry(" + this.f + ") is not null").toString());
        }
        if(saveableStateRegistry0 != null) {
            RememberSaveableKt.access$requireCanBeSaved(saveableStateRegistry0, this.g.invoke());
            this.f = saveableStateRegistry0.registerProvider(this.c, this.g);
        }
    }

    @Override  // androidx.compose.runtime.saveable.SaverScope
    public final boolean canBeSaved(Object object0) {
        return this.b == null || this.b.canBeSaved(object0);
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        Entry saveableStateRegistry$Entry0 = this.f;
        if(saveableStateRegistry$Entry0 != null) {
            saveableStateRegistry$Entry0.unregister();
        }
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        Entry saveableStateRegistry$Entry0 = this.f;
        if(saveableStateRegistry$Entry0 != null) {
            saveableStateRegistry$Entry0.unregister();
        }
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        this.a();
    }
}

