package com.kakao.kandinsky.signature.database;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.style.TextAlign;
import com.kakao.kandinsky.core.kdphoto.Signature.Image;
import com.kakao.kandinsky.core.kdphoto.Signature.Text;
import com.kakao.kandinsky.core.kdphoto.Signature;
import com.kakao.kandinsky.core.kdphoto.SignatureMetaData;
import com.kakao.kandinsky.core.kdphoto.TextData;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A!\u0010\u0005\u001A\u00020\u0004*\u00020\u00002\u000E\u0010\u0003\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001A\u0011\u0010\u0007\u001A\u00020\u0000*\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/kakao/kandinsky/signature/database/SignatureEntity;", "", "", "fontResIds", "Lcom/kakao/kandinsky/core/kdphoto/Signature;", "toSignature", "(Lcom/kakao/kandinsky/signature/database/SignatureEntity;Ljava/util/List;)Lcom/kakao/kandinsky/core/kdphoto/Signature;", "toEntity", "(Lcom/kakao/kandinsky/core/kdphoto/Signature;)Lcom/kakao/kandinsky/signature/database/SignatureEntity;", "signature_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSignatureEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignatureEntity.kt\ncom/kakao/kandinsky/signature/database/SignatureEntityKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1#2:179\n*E\n"})
public final class SignatureEntityKt {
    public static final long a(String s) {
        List list0 = StringsKt__StringsKt.split$default(s, new String[]{","}, false, 0, 6, null);
        return SizeKt.Size(Float.parseFloat(((String)list0.get(0))), Float.parseFloat(((String)list0.get(1))));
    }

    public static final String b(long v) {
        return Size.getWidth-impl(v) + "," + Size.getHeight-impl(v);
    }

    @NotNull
    public static final SignatureEntity toEntity(@NotNull Signature signature0) {
        Intrinsics.checkNotNullParameter(signature0, "<this>");
        if(signature0 instanceof Text) {
            int v = signature0.getNo();
            float f = signature0.getMetaData().getWidthRatio();
            float f1 = signature0.getMetaData().getHorizontalPaddingRatio();
            float f2 = signature0.getMetaData().getVerticalPaddingRatio();
            float f3 = signature0.getMetaData().getRotate();
            String s = SignatureEntityKt.b(signature0.getMetaData().getOriginalSize-NH-jbRc());
            int v1 = ColorKt.toArgb-8_81llA(((Text)signature0).getEditTextData().getColor-0d7_KjU());
            float f4 = ((Text)signature0).getEditTextData().getAlpha();
            int v2 = ColorKt.toArgb-8_81llA(((Text)signature0).getEditTextData().getBackground-0d7_KjU());
            float f5 = ((Text)signature0).getEditTextData().getBackgroundAlpha();
            String s1 = SignatureEntityKt.b(((Text)signature0).getEditTextData().getContentSize-NH-jbRc());
            String s2 = SignatureEntityKt.b(((Text)signature0).getEditTextData().getPadding-NH-jbRc());
            boolean z = ((Text)signature0).getEditTextData().getBold();
            boolean z1 = ((Text)signature0).getEditTextData().getItalic();
            boolean z2 = ((Text)signature0).getEditTextData().getUnderLine();
            int v3 = ((Text)signature0).getEditTextData().getAlign-e0LSkKk();
            return new SignatureEntity(v, "text", System.currentTimeMillis(), ((Text)signature0).getEditTextData().getText(), f, f3, f1, f2, s, ((Text)signature0).getEditTextData().getFontSize(), ((Text)signature0).getEditTextData().getLineHeight(), v1, f4, v2, f5, s1, s2, z, z1, z2, TextAlign.Companion.values().indexOf(TextAlign.box-impl(v3)), ((Text)signature0).getEditTextData().getFont(), ((Text)signature0).getWatermark());
        }
        if(!(signature0 instanceof Image)) {
            throw new NoWhenBranchMatchedException();
        }
        int v4 = signature0.getNo();
        String s3 = ((Image)signature0).getUri();
        float f6 = ((Image)signature0).getAlpha();
        float f7 = signature0.getMetaData().getWidthRatio();
        float f8 = signature0.getMetaData().getHorizontalPaddingRatio();
        float f9 = signature0.getMetaData().getVerticalPaddingRatio();
        return new SignatureEntity(v4, "image", System.currentTimeMillis(), s3, f7, signature0.getMetaData().getRotate(), f8, f9, SignatureEntityKt.b(signature0.getMetaData().getOriginalSize-NH-jbRc()), 0.0f, 0.0f, 0, f6, 0, 0.0f, null, null, false, false, false, 0, null, false, 0x7FEE00, null);
    }

    @NotNull
    public static final Signature toSignature(@NotNull SignatureEntity signatureEntity0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(signatureEntity0, "<this>");
        Intrinsics.checkNotNullParameter(list0, "fontResIds");
        String s = signatureEntity0.getType();
        if(Intrinsics.areEqual(s, "text")) {
            String s1 = signatureEntity0.getData();
            long v = ColorKt.Color(signatureEntity0.getColor());
            float f = signatureEntity0.getAlpha();
            long v1 = ColorKt.Color(signatureEntity0.getBackground());
            float f1 = signatureEntity0.getBackgroundAlpha();
            long v2 = SignatureEntityKt.a(signatureEntity0.getBoundsSize());
            long v3 = SignatureEntityKt.a(signatureEntity0.getTextPadding());
            boolean z = signatureEntity0.getBold();
            boolean z1 = signatureEntity0.getItalic();
            boolean z2 = signatureEntity0.getUnderLine();
            int v4 = ((TextAlign)TextAlign.Companion.values().get(signatureEntity0.getAlign())).unbox-impl();
            return list0.contains(signatureEntity0.getFont()) ? new Text(signatureEntity0.getUid(), new TextData(s1, v, f, v1, f1, v2, v3, z, z1, z2, v4, signatureEntity0.getFont(), signatureEntity0.getFontSize(), signatureEntity0.getLineHeight(), null), signatureEntity0.getWatermark(), new SignatureMetaData(SignatureEntityKt.a(signatureEntity0.getOriginalSize()), signatureEntity0.getSize(), signatureEntity0.getAngle(), signatureEntity0.getHorizontalPaddingRatio(), signatureEntity0.getVerticalPaddingRatio(), null)) : new Text(signatureEntity0.getUid(), new TextData(s1, v, f, v1, f1, v2, v3, z, z1, z2, v4, ((Integer)CollectionsKt___CollectionsKt.firstOrNull(list0)), signatureEntity0.getFontSize(), signatureEntity0.getLineHeight(), null), signatureEntity0.getWatermark(), new SignatureMetaData(SignatureEntityKt.a(signatureEntity0.getOriginalSize()), signatureEntity0.getSize(), signatureEntity0.getAngle(), signatureEntity0.getHorizontalPaddingRatio(), signatureEntity0.getVerticalPaddingRatio(), null));
        }
        if(!Intrinsics.areEqual(s, "image")) {
            throw new IllegalArgumentException("Unknown type: " + signatureEntity0.getType());
        }
        return new Image(signatureEntity0.getUid(), signatureEntity0.getData(), signatureEntity0.getAlpha(), new SignatureMetaData(SignatureEntityKt.a(signatureEntity0.getOriginalSize()), signatureEntity0.getSize(), signatureEntity0.getAngle(), signatureEntity0.getHorizontalPaddingRatio(), signatureEntity0.getVerticalPaddingRatio(), null));
    }
}

