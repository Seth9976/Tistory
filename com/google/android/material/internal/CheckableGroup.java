package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestrictTo({Scope.LIBRARY_GROUP})
@UiThread
public class CheckableGroup {
    public interface OnCheckedStateChangeListener {
        void onCheckedStateChanged(@NonNull Set arg1);
    }

    public final HashMap a;
    public final HashSet b;
    public OnCheckedStateChangeListener c;
    public boolean d;
    public boolean e;

    public CheckableGroup() {
        this.a = new HashMap();
        this.b = new HashSet();
    }

    public final boolean a(MaterialCheckable materialCheckable0) {
        int v = materialCheckable0.getId();
        HashSet hashSet0 = this.b;
        if(hashSet0.contains(v)) {
            return false;
        }
        Integer integer0 = this.getSingleCheckedId();
        MaterialCheckable materialCheckable1 = (MaterialCheckable)this.a.get(integer0);
        if(materialCheckable1 != null) {
            this.b(materialCheckable1, false);
        }
        boolean z = hashSet0.add(v);
        if(!materialCheckable0.isChecked()) {
            materialCheckable0.setChecked(true);
        }
        return z;
    }

    public void addCheckable(MaterialCheckable materialCheckable0) {
        Integer integer0 = materialCheckable0.getId();
        this.a.put(integer0, materialCheckable0);
        if(materialCheckable0.isChecked()) {
            this.a(materialCheckable0);
        }
        materialCheckable0.setInternalOnCheckedChangeListener(new a(this));
    }

    public final boolean b(MaterialCheckable materialCheckable0, boolean z) {
        int v = materialCheckable0.getId();
        HashSet hashSet0 = this.b;
        if(!hashSet0.contains(v)) {
            return false;
        }
        if(z && hashSet0.size() == 1 && hashSet0.contains(v)) {
            materialCheckable0.setChecked(true);
            return false;
        }
        boolean z1 = hashSet0.remove(v);
        if(materialCheckable0.isChecked()) {
            materialCheckable0.setChecked(false);
        }
        return z1;
    }

    public void check(@IdRes int v) {
        MaterialCheckable materialCheckable0 = (MaterialCheckable)this.a.get(v);
        if(materialCheckable0 == null) {
            return;
        }
        if(this.a(materialCheckable0)) {
            OnCheckedStateChangeListener checkableGroup$OnCheckedStateChangeListener0 = this.c;
            if(checkableGroup$OnCheckedStateChangeListener0 != null) {
                checkableGroup$OnCheckedStateChangeListener0.onCheckedStateChanged(this.getCheckedIds());
            }
        }
    }

    public void clearCheck() {
        boolean z = this.b.isEmpty();
        for(Object object0: this.a.values()) {
            this.b(((MaterialCheckable)object0), false);
        }
        if(!z) {
            OnCheckedStateChangeListener checkableGroup$OnCheckedStateChangeListener0 = this.c;
            if(checkableGroup$OnCheckedStateChangeListener0 != null) {
                checkableGroup$OnCheckedStateChangeListener0.onCheckedStateChanged(this.getCheckedIds());
            }
        }
    }

    @NonNull
    public Set getCheckedIds() {
        return new HashSet(this.b);
    }

    @NonNull
    public List getCheckedIdsSortedByChildOrder(@NonNull ViewGroup viewGroup0) {
        Set set0 = this.getCheckedIds();
        List list0 = new ArrayList();
        for(int v = 0; v < viewGroup0.getChildCount(); ++v) {
            View view0 = viewGroup0.getChildAt(v);
            if(view0 instanceof MaterialCheckable && set0.contains(view0.getId())) {
                ((ArrayList)list0).add(view0.getId());
            }
        }
        return list0;
    }

    @IdRes
    public int getSingleCheckedId() {
        if(this.d) {
            HashSet hashSet0 = this.b;
            if(!hashSet0.isEmpty()) {
                return hashSet0.iterator().next();
            }
        }
        return -1;
    }

    public boolean isSelectionRequired() {
        return this.e;
    }

    public boolean isSingleSelection() {
        return this.d;
    }

    public void removeCheckable(MaterialCheckable materialCheckable0) {
        materialCheckable0.setInternalOnCheckedChangeListener(null);
        Integer integer0 = materialCheckable0.getId();
        this.a.remove(integer0);
        Integer integer1 = materialCheckable0.getId();
        this.b.remove(integer1);
    }

    public void setOnCheckedStateChangeListener(@Nullable OnCheckedStateChangeListener checkableGroup$OnCheckedStateChangeListener0) {
        this.c = checkableGroup$OnCheckedStateChangeListener0;
    }

    public void setSelectionRequired(boolean z) {
        this.e = z;
    }

    public void setSingleSelection(boolean z) {
        if(this.d != z) {
            this.d = z;
            this.clearCheck();
        }
    }

    public void uncheck(@IdRes int v) {
        MaterialCheckable materialCheckable0 = (MaterialCheckable)this.a.get(v);
        if(materialCheckable0 == null) {
            return;
        }
        if(this.b(materialCheckable0, this.e)) {
            OnCheckedStateChangeListener checkableGroup$OnCheckedStateChangeListener0 = this.c;
            if(checkableGroup$OnCheckedStateChangeListener0 != null) {
                checkableGroup$OnCheckedStateChangeListener0.onCheckedStateChanged(this.getCheckedIds());
            }
        }
    }
}

