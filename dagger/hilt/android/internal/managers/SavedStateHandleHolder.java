package dagger.hilt.android.internal.managers;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.viewmodel.CreationExtras;

public final class SavedStateHandleHolder {
    public CreationExtras a;
    public SavedStateHandle b;
    public final boolean c;

    public SavedStateHandleHolder(CreationExtras creationExtras0) {
        this.c = creationExtras0 == null;
        this.a = creationExtras0;
    }

    public void clear() {
        this.a = null;
    }

    public boolean isInvalid() {
        return this.b == null && this.a == null;
    }

    public void setExtras(CreationExtras creationExtras0) {
        if(this.b != null) {
            return;
        }
        this.a = creationExtras0;
    }
}

