package androidx.recyclerview.widget;

import a5.b;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public final class j1 implements ChildHelper.Callback {
    public final RecyclerView a;

    public j1(RecyclerView recyclerView0) {
        this.a = recyclerView0;
    }

    @Override  // androidx.recyclerview.widget.ChildHelper$Callback
    public final void addView(View view0, int v) {
        this.a.addView(view0, v);
        this.a.dispatchChildAttached(view0);
    }

    @Override  // androidx.recyclerview.widget.ChildHelper$Callback
    public final void attachViewToParent(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
        RecyclerView recyclerView0 = this.a;
        boolean z = false;
        if(recyclerView$ViewHolder0 != null) {
            z = true;
            if(!recyclerView$ViewHolder0.isTmpDetached() && !recyclerView$ViewHolder0.shouldIgnore()) {
                StringBuilder stringBuilder0 = new StringBuilder("Called attach on a child which is not detached: ");
                stringBuilder0.append(recyclerView$ViewHolder0);
                throw new IllegalArgumentException(b.h(recyclerView0, stringBuilder0));
            }
            if(RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "reAttach " + recyclerView$ViewHolder0);
            }
            recyclerView$ViewHolder0.clearTmpDetachFlag();
        }
        else if(!RecyclerView.sDebugAssertionsEnabled) {
            z = true;
        }
        if(z) {
            recyclerView0.attachViewToParent(view0, v, viewGroup$LayoutParams0);
            return;
        }
        StringBuilder stringBuilder1 = new StringBuilder("No ViewHolder found for child: ");
        stringBuilder1.append(view0);
        stringBuilder1.append(", index: ");
        stringBuilder1.append(v);
        throw new IllegalArgumentException(b.h(recyclerView0, stringBuilder1));
    }

    @Override  // androidx.recyclerview.widget.ChildHelper$Callback
    public final void detachViewFromParent(int v) {
        RecyclerView recyclerView0 = this.a;
        View view0 = recyclerView0.getChildAt(v);
        boolean z = false;
        if(view0 != null) {
            z = true;
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
            if(recyclerView$ViewHolder0 == null) {
                recyclerView0.detachViewFromParent(v);
                return;
            }
            if(recyclerView$ViewHolder0.isTmpDetached() && !recyclerView$ViewHolder0.shouldIgnore()) {
                StringBuilder stringBuilder0 = new StringBuilder("called detach on an already detached child ");
                stringBuilder0.append(recyclerView$ViewHolder0);
                throw new IllegalArgumentException(b.h(recyclerView0, stringBuilder0));
            }
            if(RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "tmpDetach " + recyclerView$ViewHolder0);
            }
            recyclerView$ViewHolder0.addFlags(0x100);
        }
        else if(!RecyclerView.sDebugAssertionsEnabled) {
            z = true;
        }
        if(z) {
            recyclerView0.detachViewFromParent(v);
            return;
        }
        StringBuilder stringBuilder1 = new StringBuilder("No view at offset ");
        stringBuilder1.append(v);
        throw new IllegalArgumentException(b.h(recyclerView0, stringBuilder1));
    }

    @Override  // androidx.recyclerview.widget.ChildHelper$Callback
    public final View getChildAt(int v) {
        return this.a.getChildAt(v);
    }

    @Override  // androidx.recyclerview.widget.ChildHelper$Callback
    public final int getChildCount() {
        return this.a.getChildCount();
    }

    @Override  // androidx.recyclerview.widget.ChildHelper$Callback
    public final ViewHolder getChildViewHolder(View view0) {
        return RecyclerView.getChildViewHolderInt(view0);
    }

    @Override  // androidx.recyclerview.widget.ChildHelper$Callback
    public final int indexOfChild(View view0) {
        return this.a.indexOfChild(view0);
    }

    @Override  // androidx.recyclerview.widget.ChildHelper$Callback
    public final void onEnteredHiddenState(View view0) {
        ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
        if(recyclerView$ViewHolder0 != null) {
            recyclerView$ViewHolder0.onEnteredHiddenState(this.a);
        }
    }

    @Override  // androidx.recyclerview.widget.ChildHelper$Callback
    public final void onLeftHiddenState(View view0) {
        ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
        if(recyclerView$ViewHolder0 != null) {
            recyclerView$ViewHolder0.onLeftHiddenState(this.a);
        }
    }

    @Override  // androidx.recyclerview.widget.ChildHelper$Callback
    public final void removeAllViews() {
        RecyclerView recyclerView0 = this.a;
        int v = recyclerView0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = recyclerView0.getChildAt(v1);
            recyclerView0.dispatchChildDetached(view0);
            view0.clearAnimation();
        }
        recyclerView0.removeAllViews();
    }

    @Override  // androidx.recyclerview.widget.ChildHelper$Callback
    public final void removeViewAt(int v) {
        RecyclerView recyclerView0 = this.a;
        View view0 = recyclerView0.getChildAt(v);
        if(view0 != null) {
            recyclerView0.dispatchChildDetached(view0);
            view0.clearAnimation();
        }
        recyclerView0.removeViewAt(v);
    }
}

