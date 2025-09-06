package k4;

import androidx.collection.SparseArrayCompat;
import androidx.lifecycle.ViewModel;
import androidx.loader.app.LoaderManagerImpl.LoaderInfo;

public final class b extends ViewModel {
    public final SparseArrayCompat H0;
    public boolean I0;
    public static final a J0;

    static {
        b.J0 = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public b() {
        this.H0 = new SparseArrayCompat();
        this.I0 = false;
    }

    @Override  // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        SparseArrayCompat sparseArrayCompat0 = this.H0;
        int v = sparseArrayCompat0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((LoaderManagerImpl.LoaderInfo)sparseArrayCompat0.valueAt(v1)).d(true);
        }
        sparseArrayCompat0.clear();
    }
}

