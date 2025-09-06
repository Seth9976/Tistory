package com.kakao.kandinsky.core.kdphoto;

import android.content.Context;
import android.graphics.Paint.Align;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.annotation.FontRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.StaticLayoutFactory;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.core.content.res.ResourcesCompat;
import com.kakao.kandinsky.utils.Logger;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;
import zd.c;

@Immutable
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b,\b\u0087\b\u0018\u0000 y2\u00020\u0001:\u0002zyB\u00AC\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\r\b\u0002\u0010\u0006\u001A\u00070\u0004\u00A2\u0006\u0002\b\u0005\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007\u0012\r\b\u0002\u0010\t\u001A\u00070\u0004\u00A2\u0006\u0002\b\u0005\u0012\b\b\u0002\u0010\n\u001A\u00020\u0007\u0012\r\b\u0002\u0010\f\u001A\u00070\u000B\u00A2\u0006\u0002\b\u0005\u0012\r\b\u0002\u0010\r\u001A\u00070\u000B\u00A2\u0006\u0002\b\u0005\u0012\b\b\u0002\u0010\u000F\u001A\u00020\u000E\u0012\b\b\u0002\u0010\u0010\u001A\u00020\u000E\u0012\b\b\u0002\u0010\u0011\u001A\u00020\u000E\u0012\r\b\u0002\u0010\u0013\u001A\u00070\u0012\u00A2\u0006\u0002\b\u0005\u0012\n\b\u0003\u0010\u0015\u001A\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001A\u00020\u0007\u0012\b\b\u0002\u0010\u0017\u001A\u00020\u0007\u00A2\u0006\u0004\b\u0018\u0010\u0019B\u00B2\u0001\b\u0011\u0012\u0006\u0010\u001A\u001A\u00020\u0014\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\r\u0010\u0006\u001A\t\u0018\u00010\u0004\u00A2\u0006\u0002\b\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\r\u0010\t\u001A\t\u0018\u00010\u0004\u00A2\u0006\u0002\b\u0005\u0012\u0006\u0010\n\u001A\u00020\u0007\u0012\r\u0010\f\u001A\t\u0018\u00010\u000B\u00A2\u0006\u0002\b\u0005\u0012\r\u0010\r\u001A\t\u0018\u00010\u000B\u00A2\u0006\u0002\b\u0005\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u0012\u0006\u0010\u0010\u001A\u00020\u000E\u0012\u0006\u0010\u0011\u001A\u00020\u000E\u0012\r\u0010\u0013\u001A\t\u0018\u00010\u0012\u00A2\u0006\u0002\b\u0005\u0012\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001A\u00020\u0007\u0012\u0006\u0010\u0017\u001A\u00020\u0007\u0012\b\u0010\u001C\u001A\u0004\u0018\u00010\u001B\u00A2\u0006\u0004\b\u0018\u0010\u001DJ\u000F\u0010\u001F\u001A\u00020\u001EH\u0007\u00A2\u0006\u0004\b\u001F\u0010 J\u0015\u0010$\u001A\u00020#2\u0006\u0010\"\u001A\u00020!\u00A2\u0006\u0004\b$\u0010%J\r\u0010\'\u001A\u00020&\u00A2\u0006\u0004\b\'\u0010(J\u0010\u0010)\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b)\u0010*J\u001B\u0010-\u001A\u00070\u0004\u00A2\u0006\u0002\b\u0005H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b+\u0010,J\u0010\u0010.\u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b.\u0010/J\u001B\u00101\u001A\u00070\u0004\u00A2\u0006\u0002\b\u0005H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b0\u0010,J\u0010\u00102\u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b2\u0010/J\u001B\u00104\u001A\u00070\u000B\u00A2\u0006\u0002\b\u0005H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b3\u0010,J\u001B\u00106\u001A\u00070\u000B\u00A2\u0006\u0002\b\u0005H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b5\u0010,J\u0010\u00107\u001A\u00020\u000EH\u00C6\u0003\u00A2\u0006\u0004\b7\u00108J\u0010\u00109\u001A\u00020\u000EH\u00C6\u0003\u00A2\u0006\u0004\b9\u00108J\u0010\u0010:\u001A\u00020\u000EH\u00C6\u0003\u00A2\u0006\u0004\b:\u00108J\u001B\u0010=\u001A\u00070\u0012\u00A2\u0006\u0002\b\u0005H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b;\u0010<J\u0012\u0010>\u001A\u0004\u0018\u00010\u0014H\u00C6\u0003\u00A2\u0006\u0004\b>\u0010?J\u0010\u0010@\u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b@\u0010/J\u0010\u0010A\u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\bA\u0010/J\u00BA\u0001\u0010D\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\r\b\u0002\u0010\u0006\u001A\u00070\u0004\u00A2\u0006\u0002\b\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\r\b\u0002\u0010\t\u001A\u00070\u0004\u00A2\u0006\u0002\b\u00052\b\b\u0002\u0010\n\u001A\u00020\u00072\r\b\u0002\u0010\f\u001A\u00070\u000B\u00A2\u0006\u0002\b\u00052\r\b\u0002\u0010\r\u001A\u00070\u000B\u00A2\u0006\u0002\b\u00052\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u000E2\r\b\u0002\u0010\u0013\u001A\u00070\u0012\u00A2\u0006\u0002\b\u00052\n\b\u0003\u0010\u0015\u001A\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001A\u00020\u00072\b\b\u0002\u0010\u0017\u001A\u00020\u0007H\u00C6\u0001\u00F8\u0001\u0001\u00A2\u0006\u0004\bB\u0010CJ\u0010\u0010E\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\bE\u0010*J\u0010\u0010F\u001A\u00020\u0014H\u00D6\u0001\u00A2\u0006\u0004\bF\u0010<J\u001A\u0010H\u001A\u00020\u000E2\b\u0010G\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\bH\u0010IJ(\u0010R\u001A\u00020O2\u0006\u0010J\u001A\u00020\u00002\u0006\u0010L\u001A\u00020K2\u0006\u0010N\u001A\u00020MH\u00C1\u0001\u00A2\u0006\u0004\bP\u0010QR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bS\u0010T\u001A\u0004\bU\u0010*R\"\u0010\u0006\u001A\u00070\u0004\u00A2\u0006\u0002\b\u00058\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bV\u0010W\u001A\u0004\bX\u0010,R\u0017\u0010\b\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\bY\u0010Z\u001A\u0004\b[\u0010/R\"\u0010\t\u001A\u00070\u0004\u00A2\u0006\u0002\b\u00058\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b\\\u0010W\u001A\u0004\b]\u0010,R\u0017\u0010\n\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\b^\u0010Z\u001A\u0004\b_\u0010/R\"\u0010\f\u001A\u00070\u000B\u00A2\u0006\u0002\b\u00058\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b`\u0010W\u001A\u0004\ba\u0010,R\"\u0010\r\u001A\u00070\u000B\u00A2\u0006\u0002\b\u00058\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bb\u0010W\u001A\u0004\bc\u0010,R\u0017\u0010\u000F\u001A\u00020\u000E8\u0006\u00A2\u0006\f\n\u0004\bd\u0010e\u001A\u0004\bf\u00108R\u0017\u0010\u0010\u001A\u00020\u000E8\u0006\u00A2\u0006\f\n\u0004\bg\u0010e\u001A\u0004\bh\u00108R\u0017\u0010\u0011\u001A\u00020\u000E8\u0006\u00A2\u0006\f\n\u0004\bi\u0010e\u001A\u0004\bj\u00108R\"\u0010\u0013\u001A\u00070\u0012\u00A2\u0006\u0002\b\u00058\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bk\u0010l\u001A\u0004\bm\u0010<R\u0019\u0010\u0015\u001A\u0004\u0018\u00010\u00148\u0006\u00A2\u0006\f\n\u0004\bn\u0010o\u001A\u0004\bp\u0010?R\u0017\u0010\u0016\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\bq\u0010Z\u001A\u0004\br\u0010/R\u0017\u0010\u0017\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\bs\u0010Z\u001A\u0004\bt\u0010/R\u0017\u0010v\u001A\u00020\u00048F\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0006\u001A\u0004\bu\u0010,R\u0017\u0010x\u001A\u00020\u000B8F\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0006\u001A\u0004\bw\u0010,\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006{"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/TextData;", "", "", "text", "Landroidx/compose/ui/graphics/Color;", "Lkotlinx/serialization/Contextual;", "color", "", "alpha", "background", "backgroundAlpha", "Landroidx/compose/ui/geometry/Size;", "contentSize", "padding", "", "bold", "italic", "underLine", "Landroidx/compose/ui/text/style/TextAlign;", "align", "", "font", "fontSize", "lineHeight", "<init>", "(Ljava/lang/String;JFJFJJZZZILjava/lang/Integer;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Landroidx/compose/ui/graphics/Color;FLandroidx/compose/ui/graphics/Color;FLandroidx/compose/ui/geometry/Size;Landroidx/compose/ui/geometry/Size;ZZZLandroidx/compose/ui/text/style/TextAlign;Ljava/lang/Integer;FFLkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/text/TextStyle;", "getTextStyle", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "Landroid/content/Context;", "context", "Landroid/text/StaticLayout;", "getStaticLayout", "(Landroid/content/Context;)Landroid/text/StaticLayout;", "Landroid/graphics/Paint;", "getBackgroundPaint", "()Landroid/graphics/Paint;", "component1", "()Ljava/lang/String;", "component2-0d7_KjU", "()J", "component2", "component3", "()F", "component4-0d7_KjU", "component4", "component5", "component6-NH-jbRc", "component6", "component7-NH-jbRc", "component7", "component8", "()Z", "component9", "component10", "component11-e0LSkKk", "()I", "component11", "component12", "()Ljava/lang/Integer;", "component13", "component14", "copy-A15cKkk", "(Ljava/lang/String;JFJFJJZZZILjava/lang/Integer;FF)Lcom/kakao/kandinsky/core/kdphoto/TextData;", "copy", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$kdphoto_release", "(Lcom/kakao/kandinsky/core/kdphoto/TextData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "a", "Ljava/lang/String;", "getText", "b", "J", "getColor-0d7_KjU", "c", "F", "getAlpha", "d", "getBackground-0d7_KjU", "e", "getBackgroundAlpha", "f", "getContentSize-NH-jbRc", "g", "getPadding-NH-jbRc", "h", "Z", "getBold", "i", "getItalic", "j", "getUnderLine", "k", "I", "getAlign-e0LSkKk", "l", "Ljava/lang/Integer;", "getFont", "m", "getFontSize", "n", "getLineHeight", "getBackgroundWithAlpha-0d7_KjU", "backgroundWithAlpha", "getBoundsSize-NH-jbRc", "boundsSize", "Companion", "$serializer", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextData.kt\ncom/kakao/kandinsky/core/kdphoto/TextData\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,107:1\n74#2:108\n74#2:110\n1#3:109\n154#4:111\n154#4:112\n*S KotlinDebug\n*F\n+ 1 TextData.kt\ncom/kakao/kandinsky/core/kdphoto/TextData\n*L\n57#1:108\n64#1:110\n104#1:111\n105#1:112\n*E\n"})
@Serializable
public final class TextData {
    @StabilityInferred(parameters = 1)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/kandinsky/core/kdphoto/TextData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/kandinsky/core/kdphoto/TextData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/kandinsky/core/kdphoto/TextData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/kandinsky/core/kdphoto/TextData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        public static final int $stable;
        @NotNull
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer textData$$serializer0 = new .serializer();  // 初始化器: Ljava/lang/Object;-><init>()V
            .serializer.INSTANCE = textData$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.kandinsky.core.kdphoto.TextData", textData$$serializer0, 14);
            pluginGeneratedSerialDescriptor0.addElement("text", false);
            pluginGeneratedSerialDescriptor0.addElement("color", true);
            pluginGeneratedSerialDescriptor0.addElement("alpha", true);
            pluginGeneratedSerialDescriptor0.addElement("background", true);
            pluginGeneratedSerialDescriptor0.addElement("backgroundAlpha", true);
            pluginGeneratedSerialDescriptor0.addElement("contentSize", true);
            pluginGeneratedSerialDescriptor0.addElement("padding", true);
            pluginGeneratedSerialDescriptor0.addElement("bold", true);
            pluginGeneratedSerialDescriptor0.addElement("italic", true);
            pluginGeneratedSerialDescriptor0.addElement("underLine", true);
            pluginGeneratedSerialDescriptor0.addElement("align", true);
            pluginGeneratedSerialDescriptor0.addElement("font", true);
            pluginGeneratedSerialDescriptor0.addElement("fontSize", true);
            pluginGeneratedSerialDescriptor0.addElement("lineHeight", true);
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            KSerializer[] arr_kSerializer = TextData.o;
            KSerializer kSerializer0 = arr_kSerializer[1];
            KSerializer kSerializer1 = arr_kSerializer[3];
            KSerializer kSerializer2 = arr_kSerializer[5];
            KSerializer kSerializer3 = arr_kSerializer[6];
            KSerializer kSerializer4 = arr_kSerializer[10];
            KSerializer kSerializer5 = BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE);
            return new KSerializer[]{StringSerializer.INSTANCE, kSerializer0, FloatSerializer.INSTANCE, kSerializer1, FloatSerializer.INSTANCE, kSerializer2, kSerializer3, BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE, kSerializer4, kSerializer5, FloatSerializer.INSTANCE, FloatSerializer.INSTANCE};
        }

        @NotNull
        public TextData deserialize(@NotNull Decoder decoder0) {
            int v;
            float f5;
            Size size3;
            Size size2;
            float f4;
            Color color3;
            float f3;
            boolean z5;
            boolean z4;
            boolean z3;
            Integer integer0;
            float f2;
            Color color2;
            String s2;
            TextAlign textAlign0;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            KSerializer[] arr_kSerializer = TextData.o;
            String s = null;
            if(compositeDecoder0.decodeSequentially()) {
                String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                Color color0 = (Color)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], null);
                float f = compositeDecoder0.decodeFloatElement(serialDescriptor0, 2);
                Color color1 = (Color)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 3, arr_kSerializer[3], null);
                float f1 = compositeDecoder0.decodeFloatElement(serialDescriptor0, 4);
                Size size0 = (Size)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 5, arr_kSerializer[5], null);
                Size size1 = (Size)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 6, arr_kSerializer[6], null);
                boolean z = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 7);
                boolean z1 = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 8);
                boolean z2 = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 9);
                textAlign0 = (TextAlign)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 10, arr_kSerializer[10], null);
                s2 = s1;
                color2 = color0;
                f2 = f;
                integer0 = (Integer)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 11, IntSerializer.INSTANCE, null);
                z3 = z2;
                z4 = z;
                z5 = z1;
                f3 = f1;
                color3 = color1;
                f4 = compositeDecoder0.decodeFloatElement(serialDescriptor0, 12);
                size2 = size1;
                size3 = size0;
                f5 = compositeDecoder0.decodeFloatElement(serialDescriptor0, 13);
                v = 0x3FFF;
            }
            else {
                float f6 = 0.0f;
                int v1 = 0;
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                Color color4 = null;
                Color color5 = null;
                TextAlign textAlign1 = null;
                Size size4 = null;
                Integer integer1 = null;
                Size size5 = null;
                float f7 = 0.0f;
                float f8 = 0.0f;
                float f9 = 0.0f;
                boolean z9 = true;
                while(z9) {
                    int v2 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                    switch(v2) {
                        case -1: {
                            z9 = false;
                            break;
                        }
                        case 0: {
                            s = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                            v1 |= 1;
                            break;
                        }
                        case 1: {
                            color5 = (Color)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], color5);
                            v1 |= 2;
                            break;
                        }
                        case 2: {
                            f6 = compositeDecoder0.decodeFloatElement(serialDescriptor0, 2);
                            v1 |= 4;
                            break;
                        }
                        case 3: {
                            color4 = (Color)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 3, arr_kSerializer[3], color4);
                            v1 |= 8;
                            break;
                        }
                        case 4: {
                            f7 = compositeDecoder0.decodeFloatElement(serialDescriptor0, 4);
                            v1 |= 16;
                            break;
                        }
                        case 5: {
                            size4 = (Size)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 5, arr_kSerializer[5], size4);
                            v1 |= 0x20;
                            break;
                        }
                        case 6: {
                            size5 = (Size)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 6, arr_kSerializer[6], size5);
                            v1 |= 0x40;
                            break;
                        }
                        case 7: {
                            z7 = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 7);
                            v1 |= 0x80;
                            break;
                        }
                        case 8: {
                            z8 = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 8);
                            v1 |= 0x100;
                            break;
                        }
                        case 9: {
                            z6 = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 9);
                            v1 |= 0x200;
                            break;
                        }
                        case 10: {
                            textAlign1 = (TextAlign)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 10, arr_kSerializer[10], textAlign1);
                            v1 |= 0x400;
                            break;
                        }
                        case 11: {
                            integer1 = (Integer)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 11, IntSerializer.INSTANCE, integer1);
                            v1 |= 0x800;
                            break;
                        }
                        case 12: {
                            f8 = compositeDecoder0.decodeFloatElement(serialDescriptor0, 12);
                            v1 |= 0x1000;
                            break;
                        }
                        case 13: {
                            f9 = compositeDecoder0.decodeFloatElement(serialDescriptor0, 13);
                            v1 |= 0x2000;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v2);
                        }
                    }
                }
                color3 = color4;
                color2 = color5;
                s2 = s;
                textAlign0 = textAlign1;
                size3 = size4;
                v = v1;
                integer0 = integer1;
                size2 = size5;
                f2 = f6;
                z3 = z6;
                z4 = z7;
                z5 = z8;
                f3 = f7;
                f4 = f8;
                f5 = f9;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new TextData(v, s2, color2, f2, color3, f3, size3, size2, z4, z5, z3, textAlign0, integer0, f4, f5, null, null);
        }

        @Override  // kotlinx.serialization.DeserializationStrategy
        public Object deserialize(Decoder decoder0) {
            return this.deserialize(decoder0);
        }

        @Override  // kotlinx.serialization.KSerializer
        @NotNull
        public SerialDescriptor getDescriptor() {
            return .serializer.a;
        }

        public void serialize(@NotNull Encoder encoder0, @NotNull TextData textData0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(textData0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            TextData.write$Self$kdphoto_release(textData0, compositeEncoder0, serialDescriptor0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((TextData)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u001D\u0010\u0007\u001A\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\nR\u001D\u0010\u000B\u001A\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000B\u0010\b\u001A\u0004\b\f\u0010\n\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/TextData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/kandinsky/core/kdphoto/TextData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Landroidx/compose/ui/unit/Dp;", "fontSizeDp", "F", "getFontSizeDp-D9Ej5fM", "()F", "lineHeightDp", "getLineHeightDp-D9Ej5fM", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final float getFontSizeDp-D9Ej5fM() {
            return TextData.p;
        }

        public final float getLineHeightDp-D9Ej5fM() {
            return TextData.q;
        }

        @NotNull
        public final KSerializer serializer() {
            return .serializer.INSTANCE;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final String a;
    public final long b;
    public final float c;
    public final long d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final Integer l;
    public final float m;
    public final float n;
    public static final KSerializer[] o;
    public static final float p;
    public static final float q;

    static {
        TextData.Companion = new Companion(null);
        TextData.o = new KSerializer[]{null, new ContextualSerializer(Reflection.getOrCreateKotlinClass(Color.class), null, new KSerializer[0]), null, new ContextualSerializer(Reflection.getOrCreateKotlinClass(Color.class), null, new KSerializer[0]), null, new ContextualSerializer(Reflection.getOrCreateKotlinClass(Size.class), null, new KSerializer[0]), new ContextualSerializer(Reflection.getOrCreateKotlinClass(Size.class), null, new KSerializer[0]), null, null, null, new ContextualSerializer(Reflection.getOrCreateKotlinClass(TextAlign.class), null, new KSerializer[0]), null, null, null};
        TextData.p = 30.0f;
        TextData.q = 39.0f;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public TextData(int v, String s, Color color0, float f, Color color1, float f1, Size size0, Size size1, boolean z, boolean z1, boolean z2, TextAlign textAlign0, Integer integer0, float f2, float f3, SerializationConstructorMarker serializationConstructorMarker0, DefaultConstructorMarker defaultConstructorMarker0) {
        if(1 != (v & 1)) {
            PluginExceptionsKt.throwMissingFieldException(v, 1, .serializer.INSTANCE.getDescriptor());
        }
        super();
        this.a = s;
        this.b = (v & 2) == 0 ? 0xFFFFFFFF00000000L : color0.unbox-impl();
        this.c = (v & 4) == 0 ? 100.0f : f;
        this.d = (v & 8) == 0 ? 0xFF17171700000000L : color1.unbox-impl();
        this.e = (v & 16) == 0 ? 0.0f : f1;
        this.f = (v & 0x20) == 0 ? 0L : size0.unbox-impl();
        this.g = (v & 0x40) == 0 ? 0x4120000041200000L : size1.unbox-impl();
        this.h = (v & 0x80) == 0 ? false : z;
        this.i = (v & 0x100) == 0 ? false : z1;
        this.j = (v & 0x200) == 0 ? false : z2;
        this.k = (v & 0x400) == 0 ? 3 : textAlign0.unbox-impl();
        this.l = (v & 0x800) == 0 ? null : integer0;
        this.m = (v & 0x1000) == 0 ? 10.0f : f2;
        this.n = (v & 0x2000) == 0 ? 15.0f : f3;
    }

    // 去混淆评级： 中等(50)
    public TextData(String s, long v, float f, long v1, float f1, long v2, long v3, boolean z, boolean z1, boolean z2, int v4, Integer integer0, float f2, float f3, int v5, DefaultConstructorMarker defaultConstructorMarker0) {
        this(s, ((v5 & 2) == 0 ? v : 0xFFFFFFFF00000000L), ((v5 & 4) == 0 ? f : 100.0f), ((v5 & 8) == 0 ? v1 : 0xFF17171700000000L), ((v5 & 16) == 0 ? f1 : 0.0f), ((v5 & 0x20) == 0 ? v2 : 0L), ((v5 & 0x40) == 0 ? v3 : 0x4120000041200000L), ((v5 & 0x80) == 0 ? z : false), ((v5 & 0x100) == 0 ? z1 : false), ((v5 & 0x200) == 0 ? z2 : false), ((v5 & 0x400) == 0 ? v4 : 3), ((v5 & 0x800) == 0 ? integer0 : null), ((v5 & 0x1000) == 0 ? f2 : 10.0f), ((v5 & 0x2000) == 0 ? f3 : 15.0f), null);
    }

    public TextData(String s, long v, float f, long v1, float f1, long v2, long v3, boolean z, boolean z1, boolean z2, int v4, @FontRes Integer integer0, float f2, float f3, DefaultConstructorMarker defaultConstructorMarker0) {
        Intrinsics.checkNotNullParameter(s, "text");
        super();
        this.a = s;
        this.b = v;
        this.c = f;
        this.d = v1;
        this.e = f1;
        this.f = v2;
        this.g = v3;
        this.h = z;
        this.i = z1;
        this.j = z2;
        this.k = v4;
        this.l = integer0;
        this.m = f2;
        this.n = f3;
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    public final boolean component10() {
        return this.j;
    }

    public final int component11-e0LSkKk() {
        return this.k;
    }

    @Nullable
    public final Integer component12() {
        return this.l;
    }

    public final float component13() {
        return this.m;
    }

    public final float component14() {
        return this.n;
    }

    public final long component2-0d7_KjU() {
        return this.b;
    }

    public final float component3() {
        return this.c;
    }

    public final long component4-0d7_KjU() {
        return this.d;
    }

    public final float component5() {
        return this.e;
    }

    public final long component6-NH-jbRc() {
        return this.f;
    }

    public final long component7-NH-jbRc() {
        return this.g;
    }

    public final boolean component8() {
        return this.h;
    }

    public final boolean component9() {
        return this.i;
    }

    @NotNull
    public final TextData copy-A15cKkk(@NotNull String s, long v, float f, long v1, float f1, long v2, long v3, boolean z, boolean z1, boolean z2, int v4, @FontRes @Nullable Integer integer0, float f2, float f3) {
        Intrinsics.checkNotNullParameter(s, "text");
        return new TextData(s, v, f, v1, f1, v2, v3, z, z1, z2, v4, integer0, f2, f3, null);
    }

    public static TextData copy-A15cKkk$default(TextData textData0, String s, long v, float f, long v1, float f1, long v2, long v3, boolean z, boolean z1, boolean z2, int v4, Integer integer0, float f2, float f3, int v5, Object object0) {
        String s1 = (v5 & 1) == 0 ? s : textData0.a;
        long v6 = (v5 & 2) == 0 ? v : textData0.b;
        float f4 = (v5 & 4) == 0 ? f : textData0.c;
        long v7 = (v5 & 8) == 0 ? v1 : textData0.d;
        float f5 = (v5 & 16) == 0 ? f1 : textData0.e;
        long v8 = (v5 & 0x20) == 0 ? v2 : textData0.f;
        long v9 = (v5 & 0x40) == 0 ? v3 : textData0.g;
        boolean z3 = (v5 & 0x80) == 0 ? z : textData0.h;
        boolean z4 = (v5 & 0x100) == 0 ? z1 : textData0.i;
        boolean z5 = (v5 & 0x200) == 0 ? z2 : textData0.j;
        int v10 = (v5 & 0x400) == 0 ? v4 : textData0.k;
        Integer integer1 = (v5 & 0x800) == 0 ? integer0 : textData0.l;
        float f6 = (v5 & 0x1000) == 0 ? f2 : textData0.m;
        return (v5 & 0x2000) == 0 ? textData0.copy-A15cKkk(s1, v6, f4, v7, f5, v8, v9, z3, z4, z5, v10, integer1, f6, f3) : textData0.copy-A15cKkk(s1, v6, f4, v7, f5, v8, v9, z3, z4, z5, v10, integer1, f6, textData0.n);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TextData)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((TextData)object0).a)) {
            return false;
        }
        if(!Color.equals-impl0(this.b, ((TextData)object0).b)) {
            return false;
        }
        if(Float.compare(this.c, ((TextData)object0).c) != 0) {
            return false;
        }
        if(!Color.equals-impl0(this.d, ((TextData)object0).d)) {
            return false;
        }
        if(Float.compare(this.e, ((TextData)object0).e) != 0) {
            return false;
        }
        if(!Size.equals-impl0(this.f, ((TextData)object0).f)) {
            return false;
        }
        if(!Size.equals-impl0(this.g, ((TextData)object0).g)) {
            return false;
        }
        if(this.h != ((TextData)object0).h) {
            return false;
        }
        if(this.i != ((TextData)object0).i) {
            return false;
        }
        if(this.j != ((TextData)object0).j) {
            return false;
        }
        if(!TextAlign.equals-impl0(this.k, ((TextData)object0).k)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.l, ((TextData)object0).l)) {
            return false;
        }
        return Float.compare(this.m, ((TextData)object0).m) == 0 ? Float.compare(this.n, ((TextData)object0).n) == 0 : false;
    }

    public final int getAlign-e0LSkKk() {
        return this.k;
    }

    public final float getAlpha() {
        return this.c;
    }

    public final long getBackground-0d7_KjU() {
        return this.d;
    }

    public final float getBackgroundAlpha() {
        return this.e;
    }

    @NotNull
    public final Paint getBackgroundPaint() {
        Paint paint0 = new Paint();
        paint0.setColor(ColorKt.toArgb-8_81llA(this.getBackgroundWithAlpha-0d7_KjU()));
        return paint0;
    }

    public final long getBackgroundWithAlpha-0d7_KjU() {
        return Color.copy-wmQWz5c$default(this.d, this.e / 100.0f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public final boolean getBold() {
        return this.h;
    }

    public final long getBoundsSize-NH-jbRc() {
        float f = Size.getWidth-impl(this.f);
        float f1 = Size.getWidth-impl(this.g);
        float f2 = Size.getHeight-impl(this.f);
        return SizeKt.Size(f1 * 2.0f + f, Size.getHeight-impl(this.g) * 2.0f + f2);
    }

    public final long getColor-0d7_KjU() {
        return this.b;
    }

    public final long getContentSize-NH-jbRc() {
        return this.f;
    }

    @Nullable
    public final Integer getFont() {
        return this.l;
    }

    public final float getFontSize() {
        return this.m;
    }

    public final boolean getItalic() {
        return this.i;
    }

    public final float getLineHeight() {
        return this.n;
    }

    public final long getPadding-NH-jbRc() {
        return this.g;
    }

    @NotNull
    public final StaticLayout getStaticLayout(@NotNull Context context0) {
        Paint.Align paint$Align0;
        int v;
        Intrinsics.checkNotNullParameter(context0, "context");
        StaticLayoutFactory staticLayoutFactory0 = StaticLayoutFactory.INSTANCE;
        TextPaint textPaint0 = new TextPaint();
        Typeface typeface0 = this.l == null ? null : ResourcesCompat.getFont(context0, this.l.intValue());
        boolean z = true;
        textPaint0.setAntiAlias(true);
        textPaint0.setTextSize(this.m);
        textPaint0.setColor(ColorKt.toArgb-8_81llA(Color.copy-wmQWz5c$default(this.b, this.c / 100.0f, 0.0f, 0.0f, 0.0f, 14, null)));
        boolean z1 = this.i;
        boolean z2 = this.h;
        if(z2 && z1) {
            v = 3;
        }
        else if(z2) {
            v = 1;
        }
        else {
            v = z1 ? 2 : 0;
        }
        textPaint0.setTypeface(Typeface.create(typeface0, v));
        textPaint0.setUnderlineText(this.j);
        int v1 = this.k;
        if((TextAlign.equals-impl0(v1, 5) ? true : TextAlign.equals-impl0(v1, 1))) {
            paint$Align0 = Paint.Align.LEFT;
        }
        else {
            if(!TextAlign.equals-impl0(v1, 6)) {
                z = TextAlign.equals-impl0(v1, 2);
            }
            paint$Align0 = z ? Paint.Align.RIGHT : Paint.Align.CENTER;
        }
        textPaint0.setTextAlign(paint$Align0);
        int v2 = c.roundToInt(Size.getWidth-impl(this.f));
        StaticLayout staticLayout0 = StaticLayoutFactory.create$default(staticLayoutFactory0, this.a, textPaint0, v2, 0, 0, null, null, 0, null, 0, 0.0f, 0.0f, 0, false, false, 0, 0, 0, 0, null, null, 0x1FFFF8, null);
        StringBuilder stringBuilder0 = q.u("staticLayout ", staticLayout0.getLineCount(), " ", staticLayout0.getHeight(), " ");
        stringBuilder0.append(staticLayout0);
        Logger.INSTANCE.log(stringBuilder0.toString());
        return staticLayout0;
    }

    @NotNull
    public final String getText() {
        return this.a;
    }

    @Composable
    @NotNull
    public final TextStyle getTextStyle(@Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(0x76468742);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x76468742, v, -1, "com.kakao.kandinsky.core.kdphoto.TextData.getTextStyle (TextData.kt:54)");
        }
        long v1 = Color.copy-wmQWz5c$default(this.b, this.c / 100.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v2 = ((Density)composer0.consume(CompositionLocalsKt.getLocalDensity())).toSp-kPz2Gy4(this.m);
        FontWeight fontWeight0 = this.h ? FontWeight.Companion.getBold() : FontWeight.Companion.getNormal();
        FontFamily fontFamily0 = this.l == null ? null : FontFamilyKt.FontFamily(new Font[]{FontKt.Font-YpTlLL0$default(this.l.intValue(), null, 0, 0, 14, null)});
        TextDecoration textDecoration0 = this.j ? TextDecoration.Companion.getUnderline() : TextDecoration.Companion.getNone();
        PlatformTextStyle platformTextStyle0 = new PlatformTextStyle(false);
        long v3 = ((Density)composer0.consume(CompositionLocalsKt.getLocalDensity())).toSp-kPz2Gy4(this.n);
        TextStyle textStyle0 = new TextStyle(v1, v2, fontWeight0, FontStyle.box-impl((this.i ? 1 : 0)), null, fontFamily0, null, 0L, null, null, null, 0L, textDecoration0, null, null, this.k, 0, v3, null, platformTextStyle0, null, 0, 0, null, 0xF56FD0, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return textStyle0;
    }

    public final boolean getUnderLine() {
        return this.j;
    }

    @Override
    public int hashCode() {
        int v = a.e(a.e(a.e((Size.hashCode-impl(this.g) + (Size.hashCode-impl(this.f) + a.b(this.e, wb.a.a(this.d, a.b(this.c, wb.a.a(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F)) * 0x1F) * 0x1F, 0x1F, this.h), 0x1F, this.i), 0x1F, this.j);
        int v1 = TextAlign.hashCode-impl(this.k);
        return this.l == null ? Float.hashCode(this.n) + a.b(this.m, (v1 + v) * 961, 0x1F) : Float.hashCode(this.n) + a.b(this.m, ((v1 + v) * 0x1F + this.l.hashCode()) * 0x1F, 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        String s = Color.toString-impl(this.b);
        String s1 = Color.toString-impl(this.d);
        String s2 = Size.toString-impl(this.f);
        String s3 = Size.toString-impl(this.g);
        String s4 = TextAlign.toString-impl(this.k);
        StringBuilder stringBuilder0 = new StringBuilder("TextData(text=");
        androidx.room.a.w(stringBuilder0, this.a, ", color=", s, ", alpha=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", background=");
        stringBuilder0.append(s1);
        stringBuilder0.append(", backgroundAlpha=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", contentSize=");
        stringBuilder0.append(s2);
        stringBuilder0.append(", padding=");
        stringBuilder0.append(s3);
        stringBuilder0.append(", bold=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", italic=");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", underLine=");
        stringBuilder0.append(this.j);
        stringBuilder0.append(", align=");
        stringBuilder0.append(s4);
        stringBuilder0.append(", font=");
        stringBuilder0.append(this.l);
        stringBuilder0.append(", fontSize=");
        stringBuilder0.append(this.m);
        stringBuilder0.append(", lineHeight=");
        return androidx.room.a.h(this.n, ")", stringBuilder0);
    }

    @JvmStatic
    public static final void write$Self$kdphoto_release(TextData textData0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        compositeEncoder0.encodeStringElement(serialDescriptor0, 0, textData0.a);
        boolean z = compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1);
        KSerializer[] arr_kSerializer = TextData.o;
        long v = textData0.b;
        if(z || !Color.equals-impl0(v, 0xFFFFFFFF00000000L)) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], Color.box-impl(v));
        }
        boolean z1 = compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2);
        float f = textData0.c;
        if(z1 || Float.compare(f, 100.0f) != 0) {
            compositeEncoder0.encodeFloatElement(serialDescriptor0, 2, f);
        }
        boolean z2 = compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3);
        long v1 = textData0.d;
        if(z2 || !Color.equals-impl0(v1, 0xFF17171700000000L)) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 3, arr_kSerializer[3], Color.box-impl(v1));
        }
        boolean z3 = compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 4);
        float f1 = textData0.e;
        if(z3 || Float.compare(f1, 0.0f) != 0) {
            compositeEncoder0.encodeFloatElement(serialDescriptor0, 4, f1);
        }
        boolean z4 = compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 5);
        long v2 = textData0.f;
        if(z4 || !Size.equals-impl0(v2, 0L)) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 5, arr_kSerializer[5], Size.box-impl(v2));
        }
        boolean z5 = compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 6);
        long v3 = textData0.g;
        if(z5 || !Size.equals-impl0(v3, 0x4120000041200000L)) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 6, arr_kSerializer[6], Size.box-impl(v3));
        }
        boolean z6 = compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 7);
        boolean z7 = textData0.h;
        if(z6 || z7) {
            compositeEncoder0.encodeBooleanElement(serialDescriptor0, 7, z7);
        }
        boolean z8 = compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 8);
        boolean z9 = textData0.i;
        if(z8 || z9) {
            compositeEncoder0.encodeBooleanElement(serialDescriptor0, 8, z9);
        }
        boolean z10 = compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 9);
        boolean z11 = textData0.j;
        if(z10 || z11) {
            compositeEncoder0.encodeBooleanElement(serialDescriptor0, 9, z11);
        }
        boolean z12 = compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 10);
        int v4 = textData0.k;
        if(z12 || !TextAlign.equals-impl0(v4, 3)) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 10, arr_kSerializer[10], TextAlign.box-impl(v4));
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 11) || textData0.l != null) {
            compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 11, IntSerializer.INSTANCE, textData0.l);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 12) || Float.compare(textData0.m, 10.0f) != 0) {
            compositeEncoder0.encodeFloatElement(serialDescriptor0, 12, textData0.m);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 13) || Float.compare(textData0.n, 15.0f) != 0) {
            compositeEncoder0.encodeFloatElement(serialDescriptor0, 13, textData0.n);
        }
    }
}

