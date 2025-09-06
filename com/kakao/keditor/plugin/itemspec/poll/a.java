package com.kakao.keditor.plugin.itemspec.poll;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import com.kakao.common.util.UnitConversionKt;
import kotlin.jvm.internal.Intrinsics;

public final class a implements Runnable {
    public final int a;
    public final ImageView b;
    public final float c;

    public a(ImageView imageView0, float f, int v) {
        this.a = v;
        this.b = imageView0;
        this.c = f;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            ImageView imageView0 = this.b;
            Intrinsics.checkNotNullParameter(imageView0, "$this_convertRoundedDrawable");
            Drawable drawable0 = imageView0.getDrawable();
            if(drawable0 != null && drawable0 instanceof BitmapDrawable) {
                RoundedBitmapDrawable roundedBitmapDrawable0 = RoundedBitmapDrawableFactory.create(imageView0.getContext().getResources(), ((BitmapDrawable)drawable0).getBitmap());
                roundedBitmapDrawable0.setCornerRadius(UnitConversionKt.dp2px(this.c));
                Intrinsics.checkNotNullExpressionValue(roundedBitmapDrawable0, "apply(...)");
                imageView0.setImageDrawable(roundedBitmapDrawable0);
            }
            return;
        }
        PollItemSpec.convertRoundedDrawable$lambda$11(this.b, this.c);
    }
}

