package com.kakao.tistory.presentation.view.common.recyclerview;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001AB!\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001D\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\n¢\u0006\u0004\b\u000E\u0010\u000FJ-\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001B"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/recyclerview/CommonSwipeButton;", "", "Landroid/content/Context;", "context", "", "drawableResourceId", "Lcom/kakao/tistory/presentation/view/common/recyclerview/CommonSwipeButton$OnClickListener;", "onClickListener", "<init>", "(Landroid/content/Context;ILcom/kakao/tistory/presentation/view/common/recyclerview/CommonSwipeButton$OnClickListener;)V", "", "x", "y", "", "hasClickArea", "(FF)Z", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/RectF;", "rectF", "position", "", "onDraw", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/RectF;I)V", "OnClickListener", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CommonSwipeButton {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/recyclerview/CommonSwipeButton$OnClickListener;", "", "onClick", "", "position", "", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public interface OnClickListener {
        void onClick(int arg1);
    }

    public static final int $stable = 8;
    public final Context a;
    public final int b;
    public final OnClickListener c;
    public int d;
    public RectF e;

    public CommonSwipeButton(@NotNull Context context0, @DrawableRes int v, @NotNull OnClickListener commonSwipeButton$OnClickListener0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(commonSwipeButton$OnClickListener0, "onClickListener");
        super();
        this.a = context0;
        this.b = v;
        this.c = commonSwipeButton$OnClickListener0;
        this.d = -1;
    }

    public final boolean hasClickArea(float f, float f1) {
        RectF rectF0 = this.e;
        if(rectF0 != null) {
            if(!rectF0.contains(f, f1)) {
                rectF0 = null;
            }
            if(rectF0 != null) {
                this.c.onClick(this.d);
                return true;
            }
        }
        return false;
    }

    public final void onDraw(@NotNull Canvas canvas0, @NotNull Paint paint0, @NotNull RectF rectF0, int v) {
        Bitmap bitmap0;
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        Intrinsics.checkNotNullParameter(paint0, "paint");
        Intrinsics.checkNotNullParameter(rectF0, "rectF");
        this.d = v;
        this.e = rectF0;
        Drawable drawable0 = ContextCompat.getDrawable(this.a, this.b);
        if(drawable0 == null) {
            bitmap0 = null;
        }
        else {
            bitmap0 = Bitmap.createBitmap(drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmap0, "createBitmap(...)");
            Canvas canvas1 = new Canvas(bitmap0);
            drawable0.setBounds(0, 0, canvas1.getWidth(), canvas1.getHeight());
            drawable0.draw(canvas1);
        }
        if(bitmap0 != null) {
            canvas0.drawBitmap(bitmap0, null, rectF0, paint0);
        }
    }
}

