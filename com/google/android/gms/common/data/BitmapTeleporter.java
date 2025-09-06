package com.google.android.gms.common.data;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

@KeepForSdk
@ShowFirstParty
@Class(creator = "BitmapTeleporterCreator")
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public ParcelFileDescriptor b;
    public final int c;
    public Bitmap d;
    public boolean e;
    public File f;

    static {
        BitmapTeleporter.CREATOR = new zaa();
    }

    public BitmapTeleporter(int v, ParcelFileDescriptor parcelFileDescriptor0, int v1) {
        this.a = v;
        this.b = parcelFileDescriptor0;
        this.c = v1;
        this.d = null;
        this.e = false;
    }

    @KeepForSdk
    public BitmapTeleporter(@NonNull Bitmap bitmap0) {
        this.a = 1;
        this.b = null;
        this.c = 0;
        this.d = bitmap0;
        this.e = true;
    }

    public static final void a(Closeable closeable0) {
        try {
            closeable0.close();
        }
        catch(IOException iOException0) {
            Log.w("BitmapTeleporter", "Could not close stream", iOException0);
        }
    }

    @Nullable
    @KeepForSdk
    public Bitmap get() {
        Bitmap.Config bitmap$Config0;
        int v2;
        int v1;
        byte[] arr_b;
        if(!this.e) {
            DataInputStream dataInputStream0 = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(((ParcelFileDescriptor)Preconditions.checkNotNull(this.b))));
            try {
                arr_b = new byte[dataInputStream0.readInt()];
                v1 = dataInputStream0.readInt();
                v2 = dataInputStream0.readInt();
                bitmap$Config0 = Bitmap.Config.valueOf(dataInputStream0.readUTF());
                dataInputStream0.read(arr_b);
            }
            catch(IOException iOException0) {
                throw new IllegalStateException("Could not read from parcel file descriptor", iOException0);
            }
            finally {
                BitmapTeleporter.a(dataInputStream0);
            }
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
            Bitmap bitmap0 = Bitmap.createBitmap(v1, v2, bitmap$Config0);
            bitmap0.copyPixelsFromBuffer(byteBuffer0);
            this.d = bitmap0;
            this.e = true;
            return this.d;
        }
        return this.d;
    }

    @KeepForSdk
    public void release() {
        if(!this.e) {
            try {
                ((ParcelFileDescriptor)Preconditions.checkNotNull(this.b)).close();
            }
            catch(IOException iOException0) {
                Log.w("BitmapTeleporter", "Could not close PFD", iOException0);
            }
        }
    }

    @KeepForSdk
    public void setTempDir(@NonNull File file0) {
        if(file0 == null) {
            throw new NullPointerException("Cannot set null temp directory");
        }
        this.f = file0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel0, int v) {
        FileOutputStream fileOutputStream0;
        File file1;
        if(this.b == null) {
            Bitmap bitmap0 = (Bitmap)Preconditions.checkNotNull(this.d);
            int v1 = bitmap0.getRowBytes();
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(bitmap0.getHeight() * v1);
            bitmap0.copyPixelsToBuffer(byteBuffer0);
            byte[] arr_b = byteBuffer0.array();
            File file0 = this.f;
            if(file0 == null) {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
            }
            try {
                file1 = File.createTempFile("teleporter", ".tmp", file0);
            }
            catch(IOException iOException0) {
                throw new IllegalStateException("Could not create temporary file", iOException0);
            }
            try {
                fileOutputStream0 = new FileOutputStream(file1);
                this.b = ParcelFileDescriptor.open(file1, 0x10000000);
            }
            catch(FileNotFoundException unused_ex) {
                throw new IllegalStateException("Temporary file is somehow already deleted");
            }
            file1.delete();
            DataOutputStream dataOutputStream0 = new DataOutputStream(new BufferedOutputStream(fileOutputStream0));
            try {
                dataOutputStream0.writeInt(arr_b.length);
                dataOutputStream0.writeInt(bitmap0.getWidth());
                dataOutputStream0.writeInt(bitmap0.getHeight());
                dataOutputStream0.writeUTF(bitmap0.getConfig().toString());
                dataOutputStream0.write(arr_b);
            }
            catch(IOException iOException1) {
                throw new IllegalStateException("Could not write into unlinked file", iOException1);
            }
            finally {
                BitmapTeleporter.a(dataOutputStream0);
            }
        }
        int v3 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.a);
        SafeParcelWriter.writeParcelable(parcel0, 2, this.b, v | 1, false);
        SafeParcelWriter.writeInt(parcel0, 3, this.c);
        SafeParcelWriter.finishObjectHeader(parcel0, v3);
        this.b = null;
    }
}

