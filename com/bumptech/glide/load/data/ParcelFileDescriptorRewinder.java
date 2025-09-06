package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.IOException;

public final class ParcelFileDescriptorRewinder implements DataRewinder {
    @RequiresApi(21)
    public static final class Factory implements com.bumptech.glide.load.data.DataRewinder.Factory {
        @NonNull
        public DataRewinder build(@NonNull ParcelFileDescriptor parcelFileDescriptor0) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor0);
        }

        @Override  // com.bumptech.glide.load.data.DataRewinder$Factory
        @NonNull
        public DataRewinder build(@NonNull Object object0) {
            return this.build(((ParcelFileDescriptor)object0));
        }

        @Override  // com.bumptech.glide.load.data.DataRewinder$Factory
        @NonNull
        public Class getDataClass() {
            return ParcelFileDescriptor.class;
        }
    }

    @RequiresApi(21)
    static final class InternalRewinder {
        public final ParcelFileDescriptor a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor0) {
            this.a = parcelFileDescriptor0;
        }

        public ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.a;
            }
            catch(ErrnoException errnoException0) {
                throw new IOException(errnoException0);
            }
        }
    }

    public final InternalRewinder a;

    @RequiresApi(21)
    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor0) {
        this.a = new InternalRewinder(parcelFileDescriptor0);
    }

    @Override  // com.bumptech.glide.load.data.DataRewinder
    public void cleanup() {
    }

    // 去混淆评级： 低(30)
    public static boolean isSupported() [...] // 潜在的解密器

    @NonNull
    @RequiresApi(21)
    public ParcelFileDescriptor rewindAndGet() throws IOException {
        return this.a.rewind();
    }

    @Override  // com.bumptech.glide.load.data.DataRewinder
    @NonNull
    @RequiresApi(21)
    public Object rewindAndGet() throws IOException {
        return this.rewindAndGet();
    }
}

