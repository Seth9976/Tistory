package com.bumptech.glide.load.resource;

import android.graphics.ColorSpace.Named;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder.ImageInfo;
import android.graphics.ImageDecoder.OnHeaderDecodedListener;
import android.graphics.ImageDecoder.Source;
import android.graphics.ImageDecoder;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.work.impl.background.systemjob.a;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.load.resource.bitmap.HardwareConfigState;

@RequiresApi(api = 28)
public final class DefaultOnHeaderDecodedListener implements ImageDecoder.OnHeaderDecodedListener {
    public final HardwareConfigState a;
    public final int b;
    public final int c;
    public final DecodeFormat d;
    public final DownsampleStrategy e;
    public final boolean f;
    public final PreferredColorSpace g;

    public DefaultOnHeaderDecodedListener(int v, int v1, @NonNull Options options0) {
        this.a = HardwareConfigState.getInstance();
        this.b = v;
        this.c = v1;
        this.d = (DecodeFormat)options0.get(Downsampler.DECODE_FORMAT);
        this.e = (DownsampleStrategy)options0.get(DownsampleStrategy.OPTION);
        this.f = options0.get(Downsampler.ALLOW_HARDWARE_CONFIG) != null && ((Boolean)options0.get(Downsampler.ALLOW_HARDWARE_CONFIG)).booleanValue();
        this.g = (PreferredColorSpace)options0.get(Downsampler.PREFERRED_COLOR_SPACE);
    }

    @Override  // android.graphics.ImageDecoder$OnHeaderDecodedListener
    public void onHeaderDecoded(@NonNull ImageDecoder imageDecoder0, @NonNull ImageDecoder.ImageInfo imageDecoder$ImageInfo0, @NonNull ImageDecoder.Source imageDecoder$Source0) {
        if(this.a.isHardwareConfigAllowed(this.b, this.c, this.f, false)) {
            a.s(imageDecoder0);
        }
        else {
            a.A(imageDecoder0);
        }
        if(this.d == DecodeFormat.PREFER_RGB_565) {
            a.D(imageDecoder0);
        }
        imageDecoder0.setOnPartialImageListener(new com.bumptech.glide.load.resource.a());  // 初始化器: Ljava/lang/Object;-><init>()V
        Size size0 = imageDecoder$ImageInfo0.getSize();
        int v = this.b == 0x80000000 ? size0.getWidth() : this.b;
        int v1 = this.c == 0x80000000 ? size0.getHeight() : this.c;
        int v2 = size0.getWidth();
        int v3 = size0.getHeight();
        float f = this.e.getScaleFactor(v2, v3, v, v1);
        int v4 = Math.round(((float)size0.getWidth()) * f);
        int v5 = Math.round(((float)size0.getHeight()) * f);
        if(Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size0.getWidth() + "x" + size0.getHeight() + "] to [" + v4 + "x" + v5 + "] scaleFactor: " + f);
        }
        imageDecoder0.setTargetSize(v4, v5);
        PreferredColorSpace preferredColorSpace0 = this.g;
        if(preferredColorSpace0 != null) {
            if(Build.VERSION.SDK_INT >= 28) {
                imageDecoder0.setTargetColorSpace(ColorSpace.get((preferredColorSpace0 != PreferredColorSpace.DISPLAY_P3 || imageDecoder$ImageInfo0.getColorSpace() == null || !imageDecoder$ImageInfo0.getColorSpace().isWideGamut() ? ColorSpace.Named.SRGB : ColorSpace.Named.DISPLAY_P3)));
                return;
            }
            imageDecoder0.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
        }
    }
}

