package com.kakao.keditor.plugin.attrs.text.spans;

import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.kakao.keditor.cdm.ImageAttribute;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/text/spans/KeImageSpan;", "Landroid/text/style/ImageSpan;", "Lcom/kakao/keditor/plugin/attrs/text/spans/KeAttributeSpan;", "drawable", "Landroid/graphics/drawable/Drawable;", "imageAttr", "Lcom/kakao/keditor/cdm/ImageAttribute;", "(Landroid/graphics/drawable/Drawable;Lcom/kakao/keditor/cdm/ImageAttribute;)V", "getImageAttr", "()Lcom/kakao/keditor/cdm/ImageAttribute;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class KeImageSpan extends ImageSpan implements KeAttributeSpan {
    @NotNull
    private final ImageAttribute imageAttr;

    public KeImageSpan(@NotNull Drawable drawable0, @NotNull ImageAttribute imageAttribute0) {
        Intrinsics.checkNotNullParameter(drawable0, "drawable");
        Intrinsics.checkNotNullParameter(imageAttribute0, "imageAttr");
        super(drawable0);
        this.imageAttr = imageAttribute0;
    }

    @NotNull
    public final ImageAttribute getImageAttr() {
        return this.imageAttr;
    }
}

