package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

public class WebMessagePayloadAdapter implements WebMessagePayloadBoundaryInterface {
    public final int a;
    public final String b;
    public final byte[] c;

    public WebMessagePayloadAdapter(@Nullable String s) {
        this.a = 0;
        this.b = s;
        this.c = null;
    }

    public WebMessagePayloadAdapter(@NonNull byte[] arr_b) {
        this.a = 1;
        this.b = null;
        this.c = arr_b;
    }

    public final void a(int v) {
        int v1 = this.a;
        if(v1 != v) {
            throw new IllegalStateException("Expected " + v + ", but type is " + v1);
        }
    }

    @Override  // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    @NonNull
    public byte[] getAsArrayBuffer() {
        this.a(1);
        Objects.requireNonNull(this.c);
        return this.c;
    }

    @Override  // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    @Nullable
    public String getAsString() {
        this.a(0);
        return this.b;
    }

    @Override  // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    public String[] getSupportedFeatures() {
        return new String[0];
    }

    @Override  // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public int getType() {
        return this.a;
    }
}

