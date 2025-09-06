package j8;

import com.google.android.play.core.install.InstallState;

public final class a extends InstallState {
    public final int a;
    public final long b;
    public final long c;
    public final int d;
    public final String e;

    public a(int v, long v1, long v2, int v3, String s) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        if(s == null) {
            throw new NullPointerException("Null packageName");
        }
        this.e = s;
    }

    @Override  // com.google.android.play.core.install.InstallState
    public final long bytesDownloaded() {
        return this.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof InstallState) {
            int v = ((InstallState)object0).installStatus();
            if(this.a == v) {
                long v1 = ((InstallState)object0).bytesDownloaded();
                if(this.b == v1) {
                    long v2 = ((InstallState)object0).totalBytesToDownload();
                    if(this.c == v2) {
                        int v3 = ((InstallState)object0).installErrorCode();
                        if(this.d == v3) {
                            String s = ((InstallState)object0).packageName();
                            return this.e.equals(s);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003 ^ ((int)(this.b ^ this.b >>> 0x20))) * 1000003 ^ ((int)(this.c >>> 0x20 ^ this.c))) * 1000003 ^ this.d) * 1000003 ^ this.e.hashCode();
    }

    @Override  // com.google.android.play.core.install.InstallState
    public final int installErrorCode() {
        return this.d;
    }

    @Override  // com.google.android.play.core.install.InstallState
    public final int installStatus() {
        return this.a;
    }

    @Override  // com.google.android.play.core.install.InstallState
    public final String packageName() {
        return this.e;
    }

    @Override
    public final String toString() {
        return "InstallState{installStatus=" + this.a + ", bytesDownloaded=" + this.b + ", totalBytesToDownload=" + this.c + ", installErrorCode=" + this.d + ", packageName=" + this.e + "}";
    }

    @Override  // com.google.android.play.core.install.InstallState
    public final long totalBytesToDownload() {
        return this.c;
    }
}

