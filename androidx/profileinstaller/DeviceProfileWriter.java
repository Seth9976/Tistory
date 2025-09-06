package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build.VERSION;
import androidx.activity.j;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.Executor;
import v4.a;
import v4.d;

@RequiresApi(19)
@RestrictTo({Scope.LIBRARY})
public class DeviceProfileWriter {
    public final AssetManager a;
    public final Executor b;
    public final DiagnosticsCallback c;
    public final byte[] d;
    public final File e;
    public final String f;
    public final String g;
    public final String h;
    public boolean i;
    public a[] j;
    public byte[] k;

    @RestrictTo({Scope.LIBRARY})
    public DeviceProfileWriter(@NonNull AssetManager assetManager0, @NonNull Executor executor0, @NonNull DiagnosticsCallback profileInstaller$DiagnosticsCallback0, @NonNull String s, @NonNull String s1, @NonNull String s2, @NonNull File file0) {
        this.i = false;
        this.a = assetManager0;
        this.b = executor0;
        this.c = profileInstaller$DiagnosticsCallback0;
        this.f = s;
        this.g = s1;
        this.h = s2;
        this.e = file0;
        int v = Build.VERSION.SDK_INT;
        byte[] arr_b = null;
        if(v <= 34) {
            switch(v) {
                case 26: {
                    arr_b = ProfileVersion.d;
                    break;
                }
                case 27: {
                    arr_b = ProfileVersion.c;
                    break;
                }
                case 28: 
                case 29: 
                case 30: {
                    arr_b = ProfileVersion.b;
                    break;
                }
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: {
                    arr_b = ProfileVersion.a;
                }
            }
        }
        this.d = arr_b;
    }

    public final FileInputStream a(AssetManager assetManager0, String s) {
        try {
            return assetManager0.openFd(s).createInputStream();
        }
        catch(FileNotFoundException fileNotFoundException0) {
            String s1 = fileNotFoundException0.getMessage();
            if(s1 != null && s1.contains("compressed")) {
                this.c.onDiagnosticReceived(5, null);
            }
            return null;
        }
    }

    public final void b(Serializable serializable0, int v) {
        j j0 = new j(this, v, serializable0, 4);
        this.b.execute(j0);
    }

    @RestrictTo({Scope.LIBRARY})
    public boolean deviceAllowsProfileInstallerAotWrites() {
        if(this.d == null) {
            this.b(Build.VERSION.SDK_INT, 3);
            return false;
        }
        File file0 = this.e;
        if(!file0.exists()) {
            try {
                file0.createNewFile();
            }
            catch(IOException unused_ex) {
                this.b(null, 4);
                return false;
            }
        }
        else if(!file0.canWrite()) {
            this.b(null, 4);
            return false;
        }
        this.i = true;
        return true;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY})
    public DeviceProfileWriter read() {
        a[] arr_a;
        FileInputStream fileInputStream0;
        AssetManager assetManager0 = this.a;
        DiagnosticsCallback profileInstaller$DiagnosticsCallback0 = this.c;
        if(!this.i) {
            throw new IllegalStateException("This device doesn\'t support aot. Did you call deviceSupportsAotProfile()?");
        }
        byte[] arr_b = this.d;
        if(arr_b == null) {
            return this;
        }
        try {
            fileInputStream0 = this.a(assetManager0, this.g);
            goto label_14;
        }
        catch(FileNotFoundException fileNotFoundException0) {
            profileInstaller$DiagnosticsCallback0.onResultReceived(6, fileNotFoundException0);
        }
        catch(IOException iOException0) {
            profileInstaller$DiagnosticsCallback0.onResultReceived(7, iOException0);
        }
        fileInputStream0 = null;
    label_14:
        if(fileInputStream0 != null) {
            try {
                try {
                    byte[] arr_b1 = d.e(fileInputStream0, 4);
                    if(!Arrays.equals(d.a, arr_b1)) {
                        throw new IllegalStateException("Invalid magic");
                    }
                    arr_a = d.k(fileInputStream0, d.e(fileInputStream0, 4), this.f);
                    goto label_37;
                }
                catch(IOException iOException1) {
                    profileInstaller$DiagnosticsCallback0.onResultReceived(7, iOException1);
                }
                catch(IllegalStateException illegalStateException0) {
                    profileInstaller$DiagnosticsCallback0.onResultReceived(8, illegalStateException0);
                }
            }
            catch(Throwable throwable0) {
                goto label_32;
            }
            try {
                fileInputStream0.close();
            }
            catch(IOException iOException2) {
                profileInstaller$DiagnosticsCallback0.onResultReceived(7, iOException2);
            }
            arr_a = null;
            goto label_41;
            try {
            label_32:
                fileInputStream0.close();
            }
            catch(IOException iOException3) {
                profileInstaller$DiagnosticsCallback0.onResultReceived(7, iOException3);
            }
            throw throwable0;
            try {
            label_37:
                fileInputStream0.close();
            }
            catch(IOException iOException4) {
                profileInstaller$DiagnosticsCallback0.onResultReceived(7, iOException4);
            }
        label_41:
            this.j = arr_a;
        }
        a[] arr_a1 = this.j;
        if(arr_a1 != null && (Build.VERSION.SDK_INT <= 34 && (Build.VERSION.SDK_INT == 0x1F || Build.VERSION.SDK_INT == 0x20 || Build.VERSION.SDK_INT == 33 || Build.VERSION.SDK_INT == 34))) {
            try(FileInputStream fileInputStream1 = this.a(assetManager0, this.h)) {
                if(fileInputStream1 != null) {
                    byte[] arr_b2 = d.e(fileInputStream1, 4);
                    if(!Arrays.equals(d.b, arr_b2)) {
                        throw new IllegalStateException("Invalid magic");
                    }
                    this.j = d.h(fileInputStream1, d.e(fileInputStream1, 4), arr_b, arr_a1);
                    return this;
                }
            }
            catch(FileNotFoundException fileNotFoundException1) {
                profileInstaller$DiagnosticsCallback0.onResultReceived(9, fileNotFoundException1);
            }
            catch(IOException iOException5) {
                profileInstaller$DiagnosticsCallback0.onResultReceived(7, iOException5);
            }
            catch(IllegalStateException illegalStateException1) {
                this.j = null;
                profileInstaller$DiagnosticsCallback0.onResultReceived(8, illegalStateException1);
            }
            return this;
        }
        return this;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY})
    public DeviceProfileWriter transcodeIfNeeded() {
        DiagnosticsCallback profileInstaller$DiagnosticsCallback0 = this.c;
        a[] arr_a = this.j;
        if(arr_a != null) {
            byte[] arr_b = this.d;
            if(arr_b != null) {
                if(!this.i) {
                    throw new IllegalStateException("This device doesn\'t support aot. Did you call deviceSupportsAotProfile()?");
                }
                try(ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream()) {
                    byteArrayOutputStream0.write(d.a);
                    byteArrayOutputStream0.write(arr_b);
                    if(!d.n(byteArrayOutputStream0, arr_b, arr_a)) {
                        profileInstaller$DiagnosticsCallback0.onResultReceived(5, null);
                        this.j = null;
                        return this;
                    }
                    this.k = byteArrayOutputStream0.toByteArray();
                }
                catch(IOException iOException0) {
                    profileInstaller$DiagnosticsCallback0.onResultReceived(7, iOException0);
                }
                catch(IllegalStateException illegalStateException0) {
                    profileInstaller$DiagnosticsCallback0.onResultReceived(8, illegalStateException0);
                }
                this.j = null;
                return this;
            }
        }
        return this;
    }

    @RestrictTo({Scope.LIBRARY})
    public boolean write() {
        byte[] arr_b = this.k;
        if(arr_b == null) {
            return false;
        }
        if(this.i) {
            try {
                try(ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b); FileOutputStream fileOutputStream0 = new FileOutputStream(this.e)) {
                    byte[] arr_b1 = new byte[0x200];
                    int v;
                    while((v = byteArrayInputStream0.read(arr_b1)) > 0) {
                        fileOutputStream0.write(arr_b1, 0, v);
                    }
                    this.b(null, 1);
                    this.k = null;
                    this.j = null;
                    return true;
                }
                catch(FileNotFoundException fileNotFoundException0) {
                    this.b(fileNotFoundException0, 6);
                }
                catch(IOException iOException0) {
                    this.b(iOException0, 7);
                }
                this.k = null;
                this.j = null;
                return false;
            }
            catch(Throwable throwable0) {
                this.k = null;
                this.j = null;
                throw throwable0;
            }
        }
        throw new IllegalStateException("This device doesn\'t support aot. Did you call deviceSupportsAotProfile()?");
    }
}

