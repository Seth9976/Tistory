package androidx.core.content;

import android.content.LocusId;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

public final class LocusIdCompat {
    public final String a;
    public final LocusId b;

    public LocusIdCompat(@NonNull String s) {
        this.a = (String)Preconditions.checkStringNotEmpty(s, "id cannot be empty");
        if(Build.VERSION.SDK_INT >= 29) {
            this.b = q.b(s);
            return;
        }
        this.b = null;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        Class class0 = object0.getClass();
        if(LocusIdCompat.class != class0) {
            return false;
        }
        String s = ((LocusIdCompat)object0).a;
        return this.a == null ? s == null : this.a.equals(s);
    }

    @NonNull
    public String getId() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a == null ? 0x1F : this.a.hashCode() + 0x1F;
    }

    @NonNull
    @RequiresApi(29)
    public LocusId toLocusId() {
        return this.b;
    }

    @NonNull
    @RequiresApi(29)
    public static LocusIdCompat toLocusIdCompat(@NonNull LocusId locusId0) {
        Preconditions.checkNotNull(locusId0, "locusId cannot be null");
        return new LocusIdCompat(((String)Preconditions.checkStringNotEmpty(q.d(locusId0), "id cannot be empty")));
    }

    @Override
    @NonNull
    public String toString() {
        return "LocusIdCompat[" + (this.a.length() + "_chars") + "]";
    }
}

