package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;

@RequiresApi(21)
public final class ParcelFileDescriptorBitmapDecoder implements ResourceDecoder {
    public final Downsampler a;

    public ParcelFileDescriptorBitmapDecoder(Downsampler downsampler0) {
        this.a = downsampler0;
    }

    @Nullable
    public Resource decode(@NonNull ParcelFileDescriptor parcelFileDescriptor0, int v, int v1, @NonNull Options options0) throws IOException {
        return this.a.decode(parcelFileDescriptor0, v, v1, options0);
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    @Nullable
    public Resource decode(@NonNull Object object0, int v, int v1, @NonNull Options options0) throws IOException {
        return this.decode(((ParcelFileDescriptor)object0), v, v1, options0);
    }

    // 去混淆评级： 低(30)
    public boolean handles(@NonNull ParcelFileDescriptor parcelFileDescriptor0, @NonNull Options options0) {
        return (!"HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) && !"HONOR".equalsIgnoreCase(Build.MANUFACTURER) || parcelFileDescriptor0.getStatSize() <= 0x20000000L) && this.a.handles(parcelFileDescriptor0);
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull Object object0, @NonNull Options options0) throws IOException {
        return this.handles(((ParcelFileDescriptor)object0), options0);
    }
}

