package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.graphics.Color.Companion;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h0 extends Lambda implements Function1 {
    public static final h0 w;

    static {
        h0.w = new h0(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        TextDecoration textDecoration0;
        Color color1;
        LocaleList localeList0;
        TextGeometricTransform textGeometricTransform0;
        BaselineShift baselineShift0;
        TextUnit textUnit1;
        FontWeight fontWeight0;
        TextUnit textUnit0;
        Color color0;
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        Object object1 = ((List)object0).get(0);
        Companion color$Companion0 = Color.Companion;
        Saver saver0 = SaversKt.getSaver(color$Companion0);
        if(Intrinsics.areEqual(object1, Boolean.FALSE) && !(saver0 instanceof NonNullValueClassSaver)) {
            color0 = null;
        }
        else if(object1 != null) {
            color0 = (Color)saver0.restore(object1);
        }
        else {
            color0 = null;
        }
        Intrinsics.checkNotNull(color0);
        long v = color0.unbox-impl();
        Object object2 = ((List)object0).get(1);
        androidx.compose.ui.unit.TextUnit.Companion textUnit$Companion0 = TextUnit.Companion;
        Saver saver1 = SaversKt.getSaver(textUnit$Companion0);
        if(Intrinsics.areEqual(object2, Boolean.FALSE) && !(saver1 instanceof NonNullValueClassSaver)) {
            textUnit0 = null;
        }
        else if(object2 != null) {
            textUnit0 = (TextUnit)saver1.restore(object2);
        }
        else {
            textUnit0 = null;
        }
        Intrinsics.checkNotNull(textUnit0);
        long v1 = textUnit0.unbox-impl();
        Object object3 = ((List)object0).get(2);
        Saver saver2 = SaversKt.getSaver(FontWeight.Companion);
        if(Intrinsics.areEqual(object3, Boolean.FALSE) && !(saver2 instanceof NonNullValueClassSaver)) {
            fontWeight0 = null;
        }
        else if(object3 != null) {
            fontWeight0 = (FontWeight)saver2.restore(object3);
        }
        else {
            fontWeight0 = null;
        }
        Object object4 = ((List)object0).get(3);
        FontStyle fontStyle0 = object4 == null ? null : ((FontStyle)object4);
        Object object5 = ((List)object0).get(4);
        FontSynthesis fontSynthesis0 = object5 == null ? null : ((FontSynthesis)object5);
        Object object6 = ((List)object0).get(6);
        String s = object6 == null ? null : ((String)object6);
        Object object7 = ((List)object0).get(7);
        Saver saver3 = SaversKt.getSaver(textUnit$Companion0);
        if(Intrinsics.areEqual(object7, Boolean.FALSE) && !(saver3 instanceof NonNullValueClassSaver)) {
            textUnit1 = null;
        }
        else if(object7 != null) {
            textUnit1 = (TextUnit)saver3.restore(object7);
        }
        else {
            textUnit1 = null;
        }
        Intrinsics.checkNotNull(textUnit1);
        long v2 = textUnit1.unbox-impl();
        Object object8 = ((List)object0).get(8);
        Saver saver4 = SaversKt.getSaver(BaselineShift.Companion);
        if(Intrinsics.areEqual(object8, Boolean.FALSE) && !(saver4 instanceof NonNullValueClassSaver)) {
            baselineShift0 = null;
        }
        else if(object8 != null) {
            baselineShift0 = (BaselineShift)saver4.restore(object8);
        }
        else {
            baselineShift0 = null;
        }
        Object object9 = ((List)object0).get(9);
        Saver saver5 = SaversKt.getSaver(TextGeometricTransform.Companion);
        if(Intrinsics.areEqual(object9, Boolean.FALSE) && !(saver5 instanceof NonNullValueClassSaver)) {
            textGeometricTransform0 = null;
        }
        else if(object9 != null) {
            textGeometricTransform0 = (TextGeometricTransform)saver5.restore(object9);
        }
        else {
            textGeometricTransform0 = null;
        }
        Object object10 = ((List)object0).get(10);
        Saver saver6 = SaversKt.getSaver(LocaleList.Companion);
        if(Intrinsics.areEqual(object10, Boolean.FALSE) && !(saver6 instanceof NonNullValueClassSaver)) {
            localeList0 = null;
        }
        else if(object10 != null) {
            localeList0 = (LocaleList)saver6.restore(object10);
        }
        else {
            localeList0 = null;
        }
        Object object11 = ((List)object0).get(11);
        Saver saver7 = SaversKt.getSaver(color$Companion0);
        if(Intrinsics.areEqual(object11, Boolean.FALSE) && !(saver7 instanceof NonNullValueClassSaver)) {
            color1 = null;
        }
        else if(object11 != null) {
            color1 = (Color)saver7.restore(object11);
        }
        else {
            color1 = null;
        }
        Intrinsics.checkNotNull(color1);
        long v3 = color1.unbox-impl();
        Object object12 = ((List)object0).get(12);
        Saver saver8 = SaversKt.getSaver(TextDecoration.Companion);
        if(Intrinsics.areEqual(object12, Boolean.FALSE) && !(saver8 instanceof NonNullValueClassSaver)) {
            textDecoration0 = null;
        }
        else if(object12 != null) {
            textDecoration0 = (TextDecoration)saver8.restore(object12);
        }
        else {
            textDecoration0 = null;
        }
        Object object13 = ((List)object0).get(13);
        Saver saver9 = SaversKt.getSaver(Shadow.Companion);
        if(Intrinsics.areEqual(object13, Boolean.FALSE) && !(saver9 instanceof NonNullValueClassSaver)) {
            return new SpanStyle(v, v1, fontWeight0, fontStyle0, fontSynthesis0, null, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, null, null, null, 0xC020, null);
        }
        return object13 == null ? new SpanStyle(v, v1, fontWeight0, fontStyle0, fontSynthesis0, null, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, null, null, null, 0xC020, null) : new SpanStyle(v, v1, fontWeight0, fontStyle0, fontSynthesis0, null, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, ((Shadow)saver9.restore(object13)), null, null, 0xC020, null);
    }
}

