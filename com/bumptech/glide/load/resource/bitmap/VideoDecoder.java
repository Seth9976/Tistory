package com.bumptech.glide.load.resource.bitmap;

import a7.c;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build.VERSION;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import bd.a;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class VideoDecoder implements ResourceDecoder {
    @VisibleForTesting
    interface MediaInitializer {
        void initializeExtractor(MediaExtractor arg1, Object arg2) throws IOException;

        void initializeRetriever(MediaMetadataRetriever arg1, Object arg2);
    }

    public static final long DEFAULT_FRAME = -1L;
    public static final Option FRAME_OPTION;
    public static final Option TARGET_FRAME;
    public final MediaInitializer a;
    public final BitmapPool b;
    public final c c;
    public static final c d;
    public static final List e;

    static {
        VideoDecoder.TARGET_FRAME = Option.disk("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new q());
        VideoDecoder.FRAME_OPTION = Option.disk("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new r());
        VideoDecoder.d = new c(8);
        VideoDecoder.e = Collections.unmodifiableList(Arrays.asList(new String[]{"TP1A", "TD1A.220804.031"}));
    }

    public VideoDecoder(BitmapPool bitmapPool0, MediaInitializer videoDecoder$MediaInitializer0) {
        this.b = bitmapPool0;
        this.a = videoDecoder$MediaInitializer0;
        this.c = VideoDecoder.d;
    }

    public final Bitmap a(Object object0, MediaMetadataRetriever mediaMetadataRetriever0, long v, int v1, int v2, int v3, DownsampleStrategy downsampleStrategy0) {
        int v5;
        MediaExtractor mediaExtractor0;
        Bitmap bitmap0 = null;
        if(Build.DEVICE != null && Build.DEVICE.matches(".+_cheets|cheets_.+")) {
            try {
                if("video/webm".equals(mediaMetadataRetriever0.extractMetadata(12))) {
                    mediaExtractor0 = new MediaExtractor();
                    goto label_8;
                }
                goto label_29;
            }
            catch(Throwable throwable0) {
                mediaExtractor0 = null;
                goto label_15;
            }
            try {
            label_8:
                this.a.initializeExtractor(mediaExtractor0, object0);
                int v4 = mediaExtractor0.getTrackCount();
                v5 = 0;
                while(true) {
                    if(v5 >= v4) {
                        goto label_28;
                    }
                    if("video/x-vnd.on2.vp8".equals(mediaExtractor0.getTrackFormat(v5).getString("mime"))) {
                        goto label_26;
                    }
                    ++v5;
                }
            }
            catch(Throwable throwable0) {
            }
            try {
            label_15:
                if(Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", throwable0);
                }
            }
            catch(Throwable throwable1) {
                if(mediaExtractor0 != null) {
                    mediaExtractor0.release();
                }
                throw throwable1;
            }
            if(mediaExtractor0 == null) {
                goto label_29;
            }
            goto label_28;
        label_26:
            mediaExtractor0.release();
            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
        label_28:
            mediaExtractor0.release();
        }
    label_29:
        if(Build.VERSION.SDK_INT >= 27 && v2 != 0x80000000 && v3 != 0x80000000 && downsampleStrategy0 != DownsampleStrategy.NONE) {
            try {
                int v6 = Integer.parseInt(mediaMetadataRetriever0.extractMetadata(18));
                int v7 = Integer.parseInt(mediaMetadataRetriever0.extractMetadata(19));
                switch(Integer.parseInt(mediaMetadataRetriever0.extractMetadata(24))) {
                    case 90: 
                    case 270: {
                        int v8 = v7;
                        v7 = v6;
                        v6 = v8;
                    }
                }
                float f = downsampleStrategy0.getScaleFactor(v6, v7, v2, v3);
                bitmap0 = mediaMetadataRetriever0.getScaledFrameAtTime(v, v1, Math.round(((float)v6) * f), Math.round(f * ((float)v7)));
            }
            catch(Throwable throwable2) {
                if(Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", throwable2);
                }
            }
        }
        if(bitmap0 == null) {
            bitmap0 = mediaMetadataRetriever0.getFrameAtTime(v, v1);
        }
        if(Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            for(Object object1: VideoDecoder.e) {
                if(!Build.ID.startsWith(((String)object1))) {
                    continue;
                }
                goto label_52;
            }
        }
        else if(Build.VERSION.SDK_INT >= 30 && Build.VERSION.SDK_INT < 33) {
            try {
            label_52:
                String s = mediaMetadataRetriever0.extractMetadata(36);
                String s1 = mediaMetadataRetriever0.extractMetadata(35);
                int v9 = Integer.parseInt(s);
                if((v9 == 6 || v9 == 7) && Integer.parseInt(s1) == 6 && Math.abs(Integer.parseInt(mediaMetadataRetriever0.extractMetadata(24))) == 180) {
                    goto label_60;
                }
            }
            catch(NumberFormatException unused_ex) {
                if(Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
                }
            }
            goto label_65;
        label_60:
            if(Log.isLoggable("VideoDecoder", 3)) {
                Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
            }
            Matrix matrix0 = new Matrix();
            matrix0.postRotate(180.0f, ((float)bitmap0.getWidth()) / 2.0f, ((float)bitmap0.getHeight()) / 2.0f);
            bitmap0 = Bitmap.createBitmap(bitmap0, 0, 0, bitmap0.getWidth(), bitmap0.getHeight(), matrix0, true);
        }
    label_65:
        if(bitmap0 == null) {
            throw new a("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
        return bitmap0;
    }

    public static ResourceDecoder asset(BitmapPool bitmapPool0) {
        return new VideoDecoder(bitmapPool0, new s());  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @RequiresApi(api = 23)
    public static ResourceDecoder byteBuffer(BitmapPool bitmapPool0) {
        return new VideoDecoder(bitmapPool0, new u());  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public Resource decode(@NonNull Object object0, int v, int v1, @NonNull Options options0) throws IOException {
        Bitmap bitmap0;
        long v2 = (long)(((Long)options0.get(VideoDecoder.TARGET_FRAME)));
        if(v2 < 0L && v2 != -1L) {
            throw new IllegalArgumentException(kotlin.text.q.n(v2, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
        }
        Integer integer0 = (Integer)options0.get(VideoDecoder.FRAME_OPTION);
        if(integer0 == null) {
            integer0 = 2;
        }
        DownsampleStrategy downsampleStrategy0 = (DownsampleStrategy)options0.get(DownsampleStrategy.OPTION);
        if(downsampleStrategy0 == null) {
            downsampleStrategy0 = DownsampleStrategy.DEFAULT;
        }
        this.c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever0 = new MediaMetadataRetriever();
        try {
            this.a.initializeRetriever(mediaMetadataRetriever0, object0);
            bitmap0 = this.a(object0, mediaMetadataRetriever0, v2, ((int)integer0), v, v1, downsampleStrategy0);
        }
        catch(Throwable throwable0) {
            if(Build.VERSION.SDK_INT < 29) {
            }
            mediaMetadataRetriever0.release();
            throw throwable0;
        }
        if(Build.VERSION.SDK_INT >= 29) {
            mediaMetadataRetriever0.release();
            return BitmapResource.obtain(bitmap0, this.b);
        }
        mediaMetadataRetriever0.release();
        return BitmapResource.obtain(bitmap0, this.b);
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull Object object0, @NonNull Options options0) {
        return true;
    }

    public static ResourceDecoder parcel(BitmapPool bitmapPool0) {
        return new VideoDecoder(bitmapPool0, new v());  // 初始化器: Ljava/lang/Object;-><init>()V
    }
}

