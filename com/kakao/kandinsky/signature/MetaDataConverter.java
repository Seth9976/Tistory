package com.kakao.kandinsky.signature;

import android.content.res.Resources;
import android.graphics.Matrix;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import com.kakao.kandinsky.core.kdphoto.SignatureMetaData;
import com.kakao.kandinsky.designsystem.util.SizeExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zd.c;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001J#\u0010\t\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\u0004¢\u0006\u0004\b\u000E\u0010\u000FJ(\u0010\u0016\u001A\u00020\u00132\u0006\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0011\u001A\u00020\u00042\u0006\u0010\u0012\u001A\u00020\u0004ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u001A\u001A\u00020\u00042\u0006\u0010\u0017\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\u0006ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001C\u001A\u00020\u00042\u0006\u0010\u0017\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\u0006ø\u0001\u0001¢\u0006\u0004\b\u001B\u0010\u0019\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006\u001D"}, d2 = {"Lcom/kakao/kandinsky/signature/MetaDataConverter;", "", "", "displayWidth", "Lcom/kakao/kandinsky/core/kdphoto/SignatureMetaData;", "meta", "Landroidx/compose/ui/geometry/Size;", "createSize-xjbvk4A", "(FLcom/kakao/kandinsky/core/kdphoto/SignatureMetaData;)J", "createSize", "Landroidx/compose/ui/geometry/Rect;", "displayRect", "metaData", "Landroid/graphics/Matrix;", "createMatrixForPhoto", "(Landroidx/compose/ui/geometry/Rect;Lcom/kakao/kandinsky/core/kdphoto/SignatureMetaData;)Landroid/graphics/Matrix;", "displaySize", "old", "new", "Landroidx/compose/ui/geometry/Offset;", "calculatePaddingDiff-jT60Xlo", "(JLcom/kakao/kandinsky/core/kdphoto/SignatureMetaData;Lcom/kakao/kandinsky/core/kdphoto/SignatureMetaData;)J", "calculatePaddingDiff", "signOriginalSize", "createImageInitMetaData-iLBOSCw", "(JJ)Lcom/kakao/kandinsky/core/kdphoto/SignatureMetaData;", "createImageInitMetaData", "createTextInitMetaData-iLBOSCw", "createTextInitMetaData", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class MetaDataConverter {
    public static final int $stable;
    @NotNull
    public static final MetaDataConverter INSTANCE;
    public static final int a;

    static {
        MetaDataConverter.INSTANCE = new MetaDataConverter();  // 初始化器: Ljava/lang/Object;-><init>()V
        MetaDataConverter.a = c.roundToInt(Resources.getSystem().getDisplayMetrics().density * 12.0f);
    }

    public static SignatureMetaData a(long v, long v1, long v2) {
        if(!Size.isEmpty-impl(v) && !Size.isEmpty-impl(v2)) {
            float f = Size.getWidth-impl(Size.div-7Ah8Wj8(v, Math.max(Size.getWidth-impl(v) / Size.getWidth-impl(v1), Size.getHeight-impl(v) / Size.getHeight-impl(v1))));
            float f1 = Size.getWidth-impl(v2);
            float f2 = Size.getWidth-impl(v2);
            float f3 = Size.getWidth-impl(v2);
            return new SignatureMetaData(v, f / f1, 0.0f, ((float)MetaDataConverter.a) / f2, ((float)MetaDataConverter.a) / f3, null);
        }
        return new SignatureMetaData(0L, 0.0f, 0.0f, 0.0f, 0.0f, 0x1F, null);
    }

    public final long calculatePaddingDiff-jT60Xlo(long v, @NotNull SignatureMetaData signatureMetaData0, @NotNull SignatureMetaData signatureMetaData1) {
        Intrinsics.checkNotNullParameter(signatureMetaData0, "old");
        Intrinsics.checkNotNullParameter(signatureMetaData1, "new");
        long v1 = this.createSize-xjbvk4A(Size.getWidth-impl(v), signatureMetaData0);
        long v2 = this.createSize-xjbvk4A(Size.getWidth-impl(v), signatureMetaData1);
        return OffsetKt.Offset((Size.getWidth-impl(v2) - Size.getWidth-impl(v1)) / 2.0f / Size.getWidth-impl(v), (Size.getHeight-impl(v2) - Size.getHeight-impl(v1)) / 2.0f / Size.getWidth-impl(v));
    }

    @NotNull
    public final SignatureMetaData createImageInitMetaData-iLBOSCw(long v, long v1) {
        return MetaDataConverter.a(v, SizeKt.Size(Size.getWidth-impl(v1) * 0.25f, Size.getWidth-impl(v1) * 0.25f), v1);
    }

    @NotNull
    public final Matrix createMatrixForPhoto(@NotNull Rect rect0, @NotNull SignatureMetaData signatureMetaData0) {
        Intrinsics.checkNotNullParameter(rect0, "displayRect");
        Intrinsics.checkNotNullParameter(signatureMetaData0, "metaData");
        long v = this.createSize-xjbvk4A(rect0.getWidth(), signatureMetaData0);
        Matrix matrix0 = new Matrix();
        matrix0.postRotate(signatureMetaData0.getRotate());
        matrix0.postTranslate(rect0.getWidth() - Size.getWidth-impl(v) / 2.0f - rect0.getWidth() * signatureMetaData0.getHorizontalPaddingRatio(), rect0.getHeight() - Size.getHeight-impl(v) / 2.0f - rect0.getWidth() * signatureMetaData0.getVerticalPaddingRatio());
        matrix0.postTranslate(rect0.getLeft(), rect0.getTop());
        return matrix0;
    }

    public final long createSize-xjbvk4A(float f, @NotNull SignatureMetaData signatureMetaData0) {
        Intrinsics.checkNotNullParameter(signatureMetaData0, "meta");
        float f1 = signatureMetaData0.getWidthRatio() * f;
        return Size.isEmpty-impl(signatureMetaData0.getOriginalSize-NH-jbRc()) ? SizeKt.Size(f1, f1) : SizeKt.Size(f1, f1 / SizeExtensionKt.getAspectRatio-uvyYCjk(signatureMetaData0.getOriginalSize-NH-jbRc()));
    }

    @NotNull
    public final SignatureMetaData createTextInitMetaData-iLBOSCw(long v, long v1) {
        return MetaDataConverter.a(v, SizeKt.Size(Size.getWidth-impl(v1) * 0.9f, Size.getWidth-impl(v1) * 0.06f), v1);
    }
}

