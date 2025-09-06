package p1;

import android.graphics.ColorSpace.Named;
import android.graphics.ColorSpace.Rgb.TransferParameters;
import android.graphics.ColorSpace.Rgb;
import android.graphics.ColorSpace;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.TransferParameters;
import androidx.compose.ui.graphics.colorspace.WhitePoint;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class k {
    @DoNotInline
    @RequiresApi(26)
    @JvmStatic
    @NotNull
    public static final ColorSpace a(@NotNull androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace0) {
        ColorSpaces colorSpaces0 = ColorSpaces.INSTANCE;
        if(Intrinsics.areEqual(colorSpace0, colorSpaces0.getSrgb())) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if(Intrinsics.areEqual(colorSpace0, colorSpaces0.getAces())) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if(Intrinsics.areEqual(colorSpace0, colorSpaces0.getAcescg())) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if(Intrinsics.areEqual(colorSpace0, colorSpaces0.getAdobeRgb())) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if(Intrinsics.areEqual(colorSpace0, colorSpaces0.getBt2020())) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if(Intrinsics.areEqual(colorSpace0, colorSpaces0.getBt709())) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if(Intrinsics.areEqual(colorSpace0, colorSpaces0.getCieLab())) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if(Intrinsics.areEqual(colorSpace0, colorSpaces0.getCieXyz())) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if(Intrinsics.areEqual(colorSpace0, colorSpaces0.getDciP3())) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if(Intrinsics.areEqual(colorSpace0, colorSpaces0.getDisplayP3())) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if(Intrinsics.areEqual(colorSpace0, colorSpaces0.getExtendedSrgb())) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if(Intrinsics.areEqual(colorSpace0, colorSpaces0.getLinearExtendedSrgb())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if(Intrinsics.areEqual(colorSpace0, colorSpaces0.getLinearSrgb())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if(Intrinsics.areEqual(colorSpace0, colorSpaces0.getNtsc1953())) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if(Intrinsics.areEqual(colorSpace0, colorSpaces0.getProPhotoRgb())) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if(Intrinsics.areEqual(colorSpace0, colorSpaces0.getSmpteC())) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if(colorSpace0 instanceof Rgb) {
            float[] arr_f = ((Rgb)colorSpace0).getWhitePoint().toXyz$ui_graphics_release();
            TransferParameters transferParameters0 = ((Rgb)colorSpace0).getTransferParameters();
            ColorSpace.Rgb.TransferParameters colorSpace$Rgb$TransferParameters0 = transferParameters0 == null ? null : new ColorSpace.Rgb.TransferParameters(transferParameters0.getA(), transferParameters0.getB(), transferParameters0.getC(), transferParameters0.getD(), transferParameters0.getE(), transferParameters0.getF(), transferParameters0.getGamma());
            return colorSpace$Rgb$TransferParameters0 == null ? new ColorSpace.Rgb(colorSpace0.getName(), ((Rgb)colorSpace0).getPrimaries$ui_graphics_release(), arr_f, new i(((Rgb)colorSpace0).getOetf(), 0), new i(((Rgb)colorSpace0).getEotf(), 1), colorSpace0.getMinValue(0), colorSpace0.getMaxValue(0)) : new ColorSpace.Rgb(colorSpace0.getName(), ((Rgb)colorSpace0).getPrimaries$ui_graphics_release(), arr_f, colorSpace$Rgb$TransferParameters0);
        }
        return ColorSpace.get(ColorSpace.Named.SRGB);
    }

    @DoNotInline
    @RequiresApi(26)
    @JvmStatic
    @NotNull
    public static final androidx.compose.ui.graphics.colorspace.ColorSpace b(@NotNull ColorSpace colorSpace0) {
        int v = colorSpace0.getId();
        if(v == ColorSpace.Named.SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getSrgb();
        }
        if(v == ColorSpace.Named.ACES.ordinal()) {
            return ColorSpaces.INSTANCE.getAces();
        }
        if(v == ColorSpace.Named.ACESCG.ordinal()) {
            return ColorSpaces.INSTANCE.getAcescg();
        }
        if(v == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return ColorSpaces.INSTANCE.getAdobeRgb();
        }
        if(v == ColorSpace.Named.BT2020.ordinal()) {
            return ColorSpaces.INSTANCE.getBt2020();
        }
        if(v == ColorSpace.Named.BT709.ordinal()) {
            return ColorSpaces.INSTANCE.getBt709();
        }
        if(v == ColorSpace.Named.CIE_LAB.ordinal()) {
            return ColorSpaces.INSTANCE.getCieLab();
        }
        if(v == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return ColorSpaces.INSTANCE.getCieXyz();
        }
        if(v == ColorSpace.Named.DCI_P3.ordinal()) {
            return ColorSpaces.INSTANCE.getDciP3();
        }
        if(v == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return ColorSpaces.INSTANCE.getDisplayP3();
        }
        if(v == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getExtendedSrgb();
        }
        if(v == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getLinearExtendedSrgb();
        }
        if(v == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getLinearSrgb();
        }
        if(v == ColorSpace.Named.NTSC_1953.ordinal()) {
            return ColorSpaces.INSTANCE.getNtsc1953();
        }
        if(v == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return ColorSpaces.INSTANCE.getProPhotoRgb();
        }
        if(v == ColorSpace.Named.SMPTE_C.ordinal()) {
            return ColorSpaces.INSTANCE.getSmpteC();
        }
        if(colorSpace0 instanceof ColorSpace.Rgb) {
            ColorSpace.Rgb.TransferParameters colorSpace$Rgb$TransferParameters0 = ((ColorSpace.Rgb)colorSpace0).getTransferParameters();
            WhitePoint whitePoint0 = ((ColorSpace.Rgb)colorSpace0).getWhitePoint().length == 3 ? new WhitePoint(((ColorSpace.Rgb)colorSpace0).getWhitePoint()[0], ((ColorSpace.Rgb)colorSpace0).getWhitePoint()[1], ((ColorSpace.Rgb)colorSpace0).getWhitePoint()[2]) : new WhitePoint(((ColorSpace.Rgb)colorSpace0).getWhitePoint()[0], ((ColorSpace.Rgb)colorSpace0).getWhitePoint()[1]);
            if(colorSpace$Rgb$TransferParameters0 != null) {
                TransferParameters transferParameters0 = new TransferParameters(colorSpace$Rgb$TransferParameters0.g, colorSpace$Rgb$TransferParameters0.a, colorSpace$Rgb$TransferParameters0.b, colorSpace$Rgb$TransferParameters0.c, colorSpace$Rgb$TransferParameters0.d, colorSpace$Rgb$TransferParameters0.e, colorSpace$Rgb$TransferParameters0.f);
                return new Rgb(((ColorSpace.Rgb)colorSpace0).getName(), ((ColorSpace.Rgb)colorSpace0).getPrimaries(), whitePoint0, ((ColorSpace.Rgb)colorSpace0).getTransform(), new j(0, colorSpace0), new j(1, colorSpace0), colorSpace0.getMinValue(0), colorSpace0.getMaxValue(0), transferParameters0, ((ColorSpace.Rgb)colorSpace0).getId());
            }
            return new Rgb(((ColorSpace.Rgb)colorSpace0).getName(), ((ColorSpace.Rgb)colorSpace0).getPrimaries(), whitePoint0, ((ColorSpace.Rgb)colorSpace0).getTransform(), new j(0, colorSpace0), new j(1, colorSpace0), colorSpace0.getMinValue(0), colorSpace0.getMaxValue(0), null, ((ColorSpace.Rgb)colorSpace0).getId());
        }
        return ColorSpaces.INSTANCE.getSrgb();
    }
}

