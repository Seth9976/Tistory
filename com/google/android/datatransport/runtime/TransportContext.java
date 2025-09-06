package com.google.android.datatransport.runtime;

import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;
import r0.a;

@AutoValue
public abstract class TransportContext {
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract TransportContext build();

        public abstract Builder setBackendName(String arg1);

        public abstract Builder setExtras(@Nullable byte[] arg1);

        @RestrictTo({Scope.LIBRARY_GROUP})
        public abstract Builder setPriority(Priority arg1);
    }

    public static Builder builder() {
        Builder transportContext$Builder0 = new l();  // 初始化器: Lcom/google/android/datatransport/runtime/TransportContext$Builder;-><init>()V
        ((l)transportContext$Builder0).setPriority(Priority.DEFAULT);
        return transportContext$Builder0;
    }

    public abstract String getBackendName();

    @Nullable
    public abstract byte[] getExtras();

    @RestrictTo({Scope.LIBRARY_GROUP})
    public abstract Priority getPriority();

    public boolean shouldUploadClientHealthMetrics() {
        return this.getExtras() != null;
    }

    @Override
    public final String toString() {
        String s = this.getBackendName();
        Priority priority0 = this.getPriority();
        String s1 = this.getExtras() == null ? "" : Base64.encodeToString(this.getExtras(), 2);
        StringBuilder stringBuilder0 = new StringBuilder("TransportContext(");
        stringBuilder0.append(s);
        stringBuilder0.append(", ");
        stringBuilder0.append(priority0);
        stringBuilder0.append(", ");
        return a.o(stringBuilder0, s1, ")");
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public TransportContext withPriority(Priority priority0) {
        return TransportContext.builder().setBackendName(this.getBackendName()).setPriority(priority0).setExtras(this.getExtras()).build();
    }
}

