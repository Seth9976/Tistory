package com.kakao.tistory.presentation.common.glide;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.bumptech.glide.load.resource.bitmap.TransformationUtils;
import com.bumptech.glide.util.Util;
import com.kakao.android.base.BaseKt;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.common.utils.ScaleUtils;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001EB/\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0010\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u000F\u001A\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0017\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001C\u001A\u00020\u001B2\u0006\u0010\u001A\u001A\u00020\u0019H\u0016¢\u0006\u0004\b\u001C\u0010\u001D¨\u0006\u001F"}, d2 = {"Lcom/kakao/tistory/presentation/common/glide/BorderTransformation;", "Lcom/bumptech/glide/load/resource/bitmap/BitmapTransformation;", "Lcom/kakao/tistory/presentation/common/glide/BorderTransformation$CornerType;", "cornerType", "", "cornerRadiusDp", "borderWidth", "borderColor", "<init>", "(Lcom/kakao/tistory/presentation/common/glide/BorderTransformation$CornerType;III)V", "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;", "pool", "Landroid/graphics/Bitmap;", "toTransform", "outWidth", "outHeight", "transform", "(Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/security/MessageDigest;", "messageDigest", "", "updateDiskCacheKey", "(Ljava/security/MessageDigest;)V", "CornerType", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BorderTransformation extends BitmapTransformation {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/common/glide/BorderTransformation$CornerType;", "", "NONE", "ROUNDED", "CIRCLE", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum CornerType {
        NONE,
        ROUNDED,
        CIRCLE;

        public static final CornerType[] a;
        public static final EnumEntries b;

        static {
            CornerType.a = arr_borderTransformation$CornerType;
            Intrinsics.checkNotNullParameter(arr_borderTransformation$CornerType, "entries");
            CornerType.b = new a(arr_borderTransformation$CornerType);
        }

        @NotNull
        public static EnumEntries getEntries() {
            return CornerType.b;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[CornerType.values().length];
            try {
                arr_v[CornerType.NONE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[CornerType.ROUNDED.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[CornerType.CIRCLE.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 8;
    public final CornerType a;
    public final int b;
    public final int c;
    public final String d;
    public final byte[] e;
    public final int f;
    public final int g;

    public BorderTransformation() {
        this(null, 0, 0, 0, 15, null);
    }

    public BorderTransformation(@NotNull CornerType borderTransformation$CornerType0, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(borderTransformation$CornerType0, "cornerType");
        super();
        this.a = borderTransformation$CornerType0;
        this.b = v1;
        this.c = v2;
        this.d = "com.kakao.tistory.presentation.common.glide.BorderTransformation1";
        byte[] arr_b = "com.kakao.tistory.presentation.common.glide.BorderTransformation1".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(arr_b, "getBytes(...)");
        this.e = arr_b;
        this.f = ScaleUtils.dp2px$default(ScaleUtils.INSTANCE, ((float)v), null, 2, null);
        this.g = v1 / 2;
    }

    public BorderTransformation(CornerType borderTransformation$CornerType0, int v, int v1, int v2, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v3 & 1) != 0) {
            borderTransformation$CornerType0 = CornerType.NONE;
        }
        if((v3 & 2) != 0) {
            v = 0;
        }
        if((v3 & 4) != 0) {
            v1 = ScaleUtils.dp2px$default(ScaleUtils.INSTANCE, 1.0f, null, 2, null);
        }
        if((v3 & 8) != 0) {
            v2 = ContextCompat.getColor(BaseKt.getAppContext(), color.black_4);
        }
        this(borderTransformation$CornerType0, v, v1, v2);
    }

    @Override  // com.bumptech.glide.load.Key
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof BorderTransformation && this.a == ((BorderTransformation)object0).a && this.f == ((BorderTransformation)object0).f && this.b == ((BorderTransformation)object0).b && this.c == ((BorderTransformation)object0).c;
    }

    @Override  // com.bumptech.glide.load.Key
    public int hashCode() {
        return Util.hashCode(this.d.hashCode(), Util.hashCode(this.f));
    }

    @Override  // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    @NotNull
    public Bitmap transform(@NotNull BitmapPool bitmapPool0, @NotNull Bitmap bitmap0, int v, int v1) {
        Bitmap bitmap1;
        Intrinsics.checkNotNullParameter(bitmapPool0, "pool");
        Intrinsics.checkNotNullParameter(bitmap0, "toTransform");
        int[] arr_v = WhenMappings.$EnumSwitchMapping$0;
        switch(arr_v[this.a.ordinal()]) {
            case 1: {
                break;
            }
            case 2: {
                bitmap0 = TransformationUtils.roundedCorners(bitmapPool0, bitmap0, this.f);
                break;
            }
            case 3: {
                bitmap0 = TransformationUtils.circleCrop(bitmapPool0, bitmap0, v, v1);
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        Intrinsics.checkNotNull(bitmap0);
        Bitmap.Config bitmap$Config0 = Bitmap.Config.RGBA_F16;
        Bitmap.Config bitmap$Config1 = bitmap$Config0 == bitmap0.getConfig() ? bitmap$Config0 : Bitmap.Config.ARGB_8888;
        if(bitmap$Config0 != bitmap0.getConfig()) {
            bitmap$Config0 = Bitmap.Config.ARGB_8888;
        }
        if(bitmap$Config0 == bitmap0.getConfig()) {
            bitmap1 = bitmap0;
        }
        else {
            bitmap1 = bitmapPool0.get(bitmap0.getWidth(), bitmap0.getHeight(), bitmap$Config0);
            Intrinsics.checkNotNullExpressionValue(bitmap1, "get(...)");
            new Canvas(bitmap1).drawBitmap(bitmap0, 0.0f, 0.0f, null);
        }
        Bitmap bitmap2 = bitmapPool0.get(v, v1, bitmap$Config1);
        Intrinsics.checkNotNullExpressionValue(bitmap2, "get(...)");
        bitmap2.setHasAlpha(true);
        Canvas canvas0 = new Canvas(bitmap2);
        canvas0.drawBitmap(bitmap1, null, new Rect(this.g, this.g, v - this.g, v1 - this.g), null);
        Paint paint0 = new Paint();
        paint0.setAntiAlias(true);
        paint0.setColor(this.c);
        paint0.setStyle(Paint.Style.STROKE);
        paint0.setStrokeWidth(((float)this.b));
        switch(arr_v[this.a.ordinal()]) {
            case 1: {
                canvas0.drawRect(new Rect(this.g, this.g, v, v1), paint0);
                break;
            }
            case 2: {
                float f = (float)this.g;
                RectF rectF0 = new RectF(f, f, ((float)(v - this.g)), ((float)(v1 - this.g)));
                float f1 = (float)this.f;
                canvas0.drawRoundRect(rectF0, f1, f1, paint0);
                break;
            }
            case 3: {
                float f2 = ((float)canvas0.getWidth()) / 2.0f;
                canvas0.drawCircle(f2, f2, f2 - ((float)this.g), paint0);
            }
        }
        canvas0.setBitmap(null);
        bitmap0.recycle();
        bitmap1.recycle();
        return bitmap2;
    }

    @Override  // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NotNull MessageDigest messageDigest0) {
        Intrinsics.checkNotNullParameter(messageDigest0, "messageDigest");
        messageDigest0.update(this.e);
    }
}

