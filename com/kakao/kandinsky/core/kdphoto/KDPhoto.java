package com.kakao.kandinsky.core.kdphoto;

import android.graphics.Matrix;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.kakao.kandinsky.utils.MatrixValues;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.q;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.serialization.Contextual;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.SealedClassSerializer;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;
import zd.c;

@Immutable
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u008C\u00012\u00020\u0001:\u0004\u008D\u0001\u008C\u0001B\u00AF\u0001\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\r\b\u0002\u0010\n\u001A\u00070\b\u00A2\u0006\u0002\b\t\u0012\b\b\u0002\u0010\f\u001A\u00020\u000B\u0012\b\b\u0002\u0010\r\u001A\u00020\u0004\u0012\r\b\u0002\u0010\u000F\u001A\u00070\u000E\u00A2\u0006\u0002\b\t\u0012\r\b\u0002\u0010\u0011\u001A\u00070\u0010\u00A2\u0006\u0002\b\t\u0012\b\b\u0002\u0010\u0013\u001A\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001A\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001A\u00020\u0016\u0012\u0013\b\u0002\u0010\u001A\u001A\r\u0012\u0004\u0012\u00020\u00190\u0018\u00A2\u0006\u0002\b\t\u0012\b\b\u0002\u0010\u001C\u001A\u00020\u001B\u0012\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001D\u00A2\u0006\u0004\b\u001F\u0010 B\u00D1\u0001\b\u0011\u0012\u0006\u0010!\u001A\u00020\u0004\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\r\u0010\n\u001A\t\u0018\u00010\b\u00A2\u0006\u0002\b\t\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\u0006\u0010\r\u001A\u00020\u0004\u0012\r\u0010\u000F\u001A\t\u0018\u00010\u000E\u00A2\u0006\u0002\b\t\u0012\r\u0010\u0011\u001A\t\u0018\u00010\u0010\u00A2\u0006\u0002\b\t\u0012\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001A\u00020\u0014\u0012\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016\u0012\u0013\u0010\u001A\u001A\u000F\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u00A2\u0006\u0002\b\t\u0012\b\u0010\u001C\u001A\u0004\u0018\u00010\u001B\u0012\b\u0010\u001E\u001A\u0004\u0018\u00010\u001D\u0012\n\b\u0001\u0010#\u001A\u0004\u0018\u00010\"\u0012\n\b\u0001\u0010$\u001A\u0004\u0018\u00010\b\u0012\b\u0010&\u001A\u0004\u0018\u00010%\u00A2\u0006\u0004\b\u001F\u0010\'J\r\u0010(\u001A\u00020\u0000\u00A2\u0006\u0004\b(\u0010)J\u0012\u0010*\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b*\u0010+J\u0010\u0010,\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b,\u0010-J\u0010\u0010.\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b.\u0010/J\u001B\u00102\u001A\u00070\b\u00A2\u0006\u0002\b\tH\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b0\u00101J\u0010\u00103\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b3\u00104J\u0010\u00105\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b5\u0010-J\u001B\u00107\u001A\u00070\u0010\u00A2\u0006\u0002\b\tH\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b6\u00101J\u0010\u00108\u001A\u00020\u0012H\u00C6\u0003\u00A2\u0006\u0004\b8\u00109J\u0010\u0010:\u001A\u00020\u0014H\u00C6\u0003\u00A2\u0006\u0004\b:\u0010;J\u0010\u0010<\u001A\u00020\u0016H\u00C6\u0003\u00A2\u0006\u0004\b<\u0010=J\u001B\u0010>\u001A\r\u0012\u0004\u0012\u00020\u00190\u0018\u00A2\u0006\u0002\b\tH\u00C6\u0003\u00A2\u0006\u0004\b>\u0010?J\u0010\u0010@\u001A\u00020\u001BH\u00C6\u0003\u00A2\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001A\u0004\u0018\u00010\u001DH\u00C6\u0003\u00A2\u0006\u0004\bB\u0010CJ\u00BD\u0001\u0010F\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\r\b\u0002\u0010\n\u001A\u00070\b\u00A2\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\r\u001A\u00020\u00042\r\b\u0002\u0010\u000F\u001A\u00070\u000E\u00A2\u0006\u0002\b\t2\r\b\u0002\u0010\u0011\u001A\u00070\u0010\u00A2\u0006\u0002\b\t2\b\b\u0002\u0010\u0013\u001A\u00020\u00122\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u00162\u0013\b\u0002\u0010\u001A\u001A\r\u0012\u0004\u0012\u00020\u00190\u0018\u00A2\u0006\u0002\b\t2\b\b\u0002\u0010\u001C\u001A\u00020\u001B2\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001DH\u00C6\u0001\u00F8\u0001\u0001\u00A2\u0006\u0004\bD\u0010EJ\u0010\u0010G\u001A\u00020\u0006H\u00D6\u0001\u00A2\u0006\u0004\bG\u0010/J\u0010\u0010H\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\bH\u0010-J\u001A\u0010J\u001A\u00020\u000B2\b\u0010I\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\bJ\u0010KJ(\u0010T\u001A\u00020Q2\u0006\u0010L\u001A\u00020\u00002\u0006\u0010N\u001A\u00020M2\u0006\u0010P\u001A\u00020OH\u00C1\u0001\u00A2\u0006\u0004\bR\u0010SR\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\bU\u0010V\u001A\u0004\bW\u0010+R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bX\u0010Y\u001A\u0004\bZ\u0010-R\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b[\u0010\\\u001A\u0004\b]\u0010/R\"\u0010\n\u001A\u00070\b\u00A2\u0006\u0002\b\t8\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b^\u0010_\u001A\u0004\b`\u00101R\u0017\u0010\f\u001A\u00020\u000B8\u0006\u00A2\u0006\f\n\u0004\ba\u0010b\u001A\u0004\bc\u00104R\u0017\u0010\r\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bd\u0010Y\u001A\u0004\be\u0010-R\"\u0010\u0011\u001A\u00070\u0010\u00A2\u0006\u0002\b\t8\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bf\u0010_\u001A\u0004\bg\u00101R\u0017\u0010\u0013\u001A\u00020\u00128\u0006\u00A2\u0006\f\n\u0004\bh\u0010i\u001A\u0004\bj\u00109R\u0017\u0010\u0015\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\bk\u0010l\u001A\u0004\bm\u0010;R\u0017\u0010\u0017\u001A\u00020\u00168\u0006\u00A2\u0006\f\n\u0004\bn\u0010o\u001A\u0004\bp\u0010=R\"\u0010\u001A\u001A\r\u0012\u0004\u0012\u00020\u00190\u0018\u00A2\u0006\u0002\b\t8\u0006\u00A2\u0006\f\n\u0004\bq\u0010r\u001A\u0004\bs\u0010?R\u0017\u0010\u001C\u001A\u00020\u001B8\u0006\u00A2\u0006\f\n\u0004\bt\u0010u\u001A\u0004\bv\u0010AR\u0019\u0010\u001E\u001A\u0004\u0018\u00010\u001D8\u0006\u00A2\u0006\f\n\u0004\bw\u0010x\u001A\u0004\by\u0010CR&\u0010#\u001A\u00020\"8\u0006X\u0087\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0012\n\u0004\bz\u0010_\u0012\u0004\b|\u0010}\u001A\u0004\b{\u00101R\'\u0010$\u001A\u00020\b8\u0006X\u0087\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0013\n\u0004\b~\u0010_\u0012\u0005\b\u0080\u0001\u0010}\u001A\u0004\b\u007F\u00101R\u0015\u0010\u0084\u0001\u001A\u00030\u0081\u00018F\u00A2\u0006\b\u001A\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0013\u0010\u0085\u0001\u001A\u00020\u000B8F\u00A2\u0006\u0007\u001A\u0005\b\u0085\u0001\u00104R\u0015\u0010\u0089\u0001\u001A\u00030\u0086\u00018F\u00A2\u0006\b\u001A\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0013\u0010\u008B\u0001\u001A\u00020\u00048F\u00A2\u0006\u0007\u001A\u0005\b\u008A\u0001\u0010-\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006\u008E\u0001"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "", "", "id", "", "step", "", "originalUri", "Landroidx/compose/ui/unit/IntSize;", "Lkotlinx/serialization/Contextual;", "bitmapSize", "", "tooLargeImage", "requireWidth", "Lcom/kakao/kandinsky/utils/MatrixValues;", "matrixValues", "Landroidx/compose/ui/geometry/Size;", "cropSize", "Lcom/kakao/kandinsky/core/kdphoto/Filter;", "filter", "", "filterIntensity", "Lcom/kakao/kandinsky/core/kdphoto/Effect;", "effect", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/kakao/kandinsky/core/kdphoto/Decoration$Absolute;", "decorationList", "Lcom/kakao/kandinsky/core/kdphoto/Border;", "border", "Lcom/kakao/kandinsky/core/kdphoto/Signature;", "signature", "<init>", "(Ljava/lang/Long;ILjava/lang/String;JZILkotlinx/collections/immutable/ImmutableList;JLcom/kakao/kandinsky/core/kdphoto/Filter;FLcom/kakao/kandinsky/core/kdphoto/Effect;Lkotlinx/collections/immutable/PersistentList;Lcom/kakao/kandinsky/core/kdphoto/Border;Lcom/kakao/kandinsky/core/kdphoto/Signature;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen1", "Landroidx/compose/ui/geometry/Offset;", "cropCenter", "cropIntSize", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Long;ILjava/lang/String;Landroidx/compose/ui/unit/IntSize;ZILkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/geometry/Size;Lcom/kakao/kandinsky/core/kdphoto/Filter;FLcom/kakao/kandinsky/core/kdphoto/Effect;Lkotlinx/collections/immutable/PersistentList;Lcom/kakao/kandinsky/core/kdphoto/Border;Lcom/kakao/kandinsky/core/kdphoto/Signature;Landroidx/compose/ui/geometry/Offset;Landroidx/compose/ui/unit/IntSize;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "reset", "()Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "component1", "()Ljava/lang/Long;", "component2", "()I", "component3", "()Ljava/lang/String;", "component4-YbymL2g", "()J", "component4", "component5", "()Z", "component6", "component8-NH-jbRc", "component8", "component9", "()Lcom/kakao/kandinsky/core/kdphoto/Filter;", "component10", "()F", "component11", "()Lcom/kakao/kandinsky/core/kdphoto/Effect;", "component12", "()Lkotlinx/collections/immutable/PersistentList;", "component13", "()Lcom/kakao/kandinsky/core/kdphoto/Border;", "component14", "()Lcom/kakao/kandinsky/core/kdphoto/Signature;", "copy-2Ycw6ww", "(Ljava/lang/Long;ILjava/lang/String;JZILkotlinx/collections/immutable/ImmutableList;JLcom/kakao/kandinsky/core/kdphoto/Filter;FLcom/kakao/kandinsky/core/kdphoto/Effect;Lkotlinx/collections/immutable/PersistentList;Lcom/kakao/kandinsky/core/kdphoto/Border;Lcom/kakao/kandinsky/core/kdphoto/Signature;)Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "copy", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$kdphoto_release", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "a", "Ljava/lang/Long;", "getId", "b", "I", "getStep", "c", "Ljava/lang/String;", "getOriginalUri", "d", "J", "getBitmapSize-YbymL2g", "e", "Z", "getTooLargeImage", "f", "getRequireWidth", "h", "getCropSize-NH-jbRc", "i", "Lcom/kakao/kandinsky/core/kdphoto/Filter;", "getFilter", "j", "F", "getFilterIntensity", "k", "Lcom/kakao/kandinsky/core/kdphoto/Effect;", "getEffect", "l", "Lkotlinx/collections/immutable/PersistentList;", "getDecorationList", "m", "Lcom/kakao/kandinsky/core/kdphoto/Border;", "getBorder", "n", "Lcom/kakao/kandinsky/core/kdphoto/Signature;", "getSignature", "o", "getCropCenter-F1C5BW0", "getCropCenter-F1C5BW0$annotations", "()V", "p", "getCropIntSize-YbymL2g", "getCropIntSize-YbymL2g$annotations", "Landroid/graphics/Matrix;", "getMatrix", "()Landroid/graphics/Matrix;", "matrix", "isEdited", "Landroidx/compose/ui/geometry/Rect;", "getImageRect", "()Landroidx/compose/ui/geometry/Rect;", "imageRect", "getNewDecoNo", "newDecoNo", "Companion", "$serializer", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKDPhoto.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KDPhoto.kt\ncom/kakao/kandinsky/core/kdphoto/KDPhoto\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
@Serializable
public final class KDPhoto {
    @StabilityInferred(parameters = 1)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/kandinsky/core/kdphoto/KDPhoto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        public static final int $stable;
        @NotNull
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer kDPhoto$$serializer0 = new .serializer();  // 初始化器: Ljava/lang/Object;-><init>()V
            .serializer.INSTANCE = kDPhoto$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.kandinsky.core.kdphoto.KDPhoto", kDPhoto$$serializer0, 16);
            pluginGeneratedSerialDescriptor0.addElement("id", true);
            pluginGeneratedSerialDescriptor0.addElement("step", true);
            pluginGeneratedSerialDescriptor0.addElement("originalUri", false);
            pluginGeneratedSerialDescriptor0.addElement("bitmapSize", true);
            pluginGeneratedSerialDescriptor0.addElement("tooLargeImage", true);
            pluginGeneratedSerialDescriptor0.addElement("requireWidth", true);
            pluginGeneratedSerialDescriptor0.addElement("matrixValues", true);
            pluginGeneratedSerialDescriptor0.addElement("cropSize", true);
            pluginGeneratedSerialDescriptor0.addElement("filter", true);
            pluginGeneratedSerialDescriptor0.addElement("filterIntensity", true);
            pluginGeneratedSerialDescriptor0.addElement("effect", true);
            pluginGeneratedSerialDescriptor0.addElement("decorationList", true);
            pluginGeneratedSerialDescriptor0.addElement("border", true);
            pluginGeneratedSerialDescriptor0.addElement("signature", true);
            pluginGeneratedSerialDescriptor0.addElement("cropCenter", true);
            pluginGeneratedSerialDescriptor0.addElement("cropIntSize", true);
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            KSerializer[] arr_kSerializer = KDPhoto.q;
            KSerializer kSerializer0 = BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE);
            KSerializer kSerializer1 = arr_kSerializer[3];
            KSerializer kSerializer2 = arr_kSerializer[6];
            KSerializer kSerializer3 = arr_kSerializer[7];
            KSerializer kSerializer4 = arr_kSerializer[11];
            KSerializer kSerializer5 = BuiltinSerializersKt.getNullable(arr_kSerializer[13]);
            return new KSerializer[]{kSerializer0, IntSerializer.INSTANCE, StringSerializer.INSTANCE, kSerializer1, BooleanSerializer.INSTANCE, IntSerializer.INSTANCE, kSerializer2, kSerializer3, com.kakao.kandinsky.core.kdphoto.Filter..serializer.INSTANCE, FloatSerializer.INSTANCE, com.kakao.kandinsky.core.kdphoto.Effect..serializer.INSTANCE, kSerializer4, com.kakao.kandinsky.core.kdphoto.Border..serializer.INSTANCE, kSerializer5, arr_kSerializer[14], arr_kSerializer[15]};
        }

        @NotNull
        public KDPhoto deserialize(@NotNull Decoder decoder0) {
            PersistentList persistentList1;
            Long long2;
            Border border1;
            Signature signature1;
            int v4;
            Size size1;
            IntSize intSize2;
            ImmutableList immutableList0;
            String s1;
            boolean z1;
            Filter filter1;
            int v3;
            float f1;
            Effect effect1;
            int v2;
            Offset offset1;
            IntSize intSize1;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            KSerializer[] arr_kSerializer = KDPhoto.q;
            Long long0 = null;
            if(compositeDecoder0.decodeSequentially()) {
                Long long1 = (Long)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 0, LongSerializer.INSTANCE, null);
                int v = compositeDecoder0.decodeIntElement(serialDescriptor0, 1);
                String s = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                IntSize intSize0 = (IntSize)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 3, arr_kSerializer[3], null);
                boolean z = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 4);
                int v1 = compositeDecoder0.decodeIntElement(serialDescriptor0, 5);
                MatrixValues matrixValues0 = (MatrixValues)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 6, arr_kSerializer[6], null);
                Size size0 = (Size)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 7, arr_kSerializer[7], null);
                Filter filter0 = (Filter)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 8, com.kakao.kandinsky.core.kdphoto.Filter..serializer.INSTANCE, null);
                float f = compositeDecoder0.decodeFloatElement(serialDescriptor0, 9);
                Effect effect0 = (Effect)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 10, com.kakao.kandinsky.core.kdphoto.Effect..serializer.INSTANCE, null);
                PersistentList persistentList0 = (PersistentList)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 11, arr_kSerializer[11], null);
                Border border0 = (Border)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 12, com.kakao.kandinsky.core.kdphoto.Border..serializer.INSTANCE, null);
                Signature signature0 = (Signature)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 13, arr_kSerializer[13], null);
                Offset offset0 = (Offset)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 14, arr_kSerializer[14], null);
                intSize1 = (IntSize)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 15, arr_kSerializer[15], null);
                offset1 = offset0;
                v2 = v;
                effect1 = effect0;
                f1 = f;
                v3 = v1;
                filter1 = filter0;
                z1 = z;
                s1 = s;
                immutableList0 = matrixValues0 == null ? null : matrixValues0.unbox-impl();
                intSize2 = intSize0;
                size1 = size0;
                v4 = 0xFFFF;
                signature1 = signature0;
                border1 = border0;
                long2 = long1;
                persistentList1 = persistentList0;
            }
            else {
                float f2 = 0.0f;
                int v5 = 0;
                int v6 = 0;
                int v7 = 0;
                boolean z2 = false;
                IntSize intSize3 = null;
                PersistentList persistentList2 = null;
                Filter filter2 = null;
                Effect effect2 = null;
                Signature signature2 = null;
                Size size2 = null;
                Offset offset2 = null;
                Border border2 = null;
                String s2 = null;
                ImmutableList immutableList1 = null;
                IntSize intSize4 = null;
                boolean z3 = true;
                while(z3) {
                    int v8 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                    switch(v8) {
                        case -1: {
                            z3 = false;
                            break;
                        }
                        case 0: {
                            long0 = (Long)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 0, LongSerializer.INSTANCE, long0);
                            v5 |= 1;
                            break;
                        }
                        case 1: {
                            v6 = compositeDecoder0.decodeIntElement(serialDescriptor0, 1);
                            v5 |= 2;
                            break;
                        }
                        case 2: {
                            s2 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                            v5 |= 4;
                            break;
                        }
                        case 3: {
                            intSize4 = (IntSize)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 3, arr_kSerializer[3], intSize4);
                            v5 |= 8;
                            break;
                        }
                        case 4: {
                            z2 = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 4);
                            v5 |= 16;
                            break;
                        }
                        case 5: {
                            v7 = compositeDecoder0.decodeIntElement(serialDescriptor0, 5);
                            v5 |= 0x20;
                            break;
                        }
                        case 6: {
                            MatrixValues matrixValues1 = (MatrixValues)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 6, arr_kSerializer[6], (immutableList1 == null ? null : MatrixValues.box-impl(immutableList1)));
                            immutableList1 = matrixValues1 == null ? null : matrixValues1.unbox-impl();
                            v5 |= 0x40;
                            break;
                        }
                        case 7: {
                            size2 = (Size)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 7, arr_kSerializer[7], size2);
                            v5 |= 0x80;
                            break;
                        }
                        case 8: {
                            filter2 = (Filter)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 8, com.kakao.kandinsky.core.kdphoto.Filter..serializer.INSTANCE, filter2);
                            v5 |= 0x100;
                            break;
                        }
                        case 9: {
                            f2 = compositeDecoder0.decodeFloatElement(serialDescriptor0, 9);
                            v5 |= 0x200;
                            break;
                        }
                        case 10: {
                            effect2 = (Effect)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 10, com.kakao.kandinsky.core.kdphoto.Effect..serializer.INSTANCE, effect2);
                            v5 |= 0x400;
                            break;
                        }
                        case 11: {
                            persistentList2 = (PersistentList)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 11, arr_kSerializer[11], persistentList2);
                            v5 |= 0x800;
                            break;
                        }
                        case 12: {
                            border2 = (Border)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 12, com.kakao.kandinsky.core.kdphoto.Border..serializer.INSTANCE, border2);
                            v5 |= 0x1000;
                            break;
                        }
                        case 13: {
                            signature2 = (Signature)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 13, arr_kSerializer[13], signature2);
                            v5 |= 0x2000;
                            break;
                        }
                        case 14: {
                            offset2 = (Offset)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 14, arr_kSerializer[14], offset2);
                            v5 |= 0x4000;
                            break;
                        }
                        case 15: {
                            intSize3 = (IntSize)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 15, arr_kSerializer[15], intSize3);
                            v5 |= 0x8000;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v8);
                        }
                    }
                }
                intSize1 = intSize3;
                persistentList1 = persistentList2;
                filter1 = filter2;
                intSize2 = intSize4;
                effect1 = effect2;
                signature1 = signature2;
                size1 = size2;
                offset1 = offset2;
                border1 = border2;
                long2 = long0;
                v4 = v5;
                v2 = v6;
                f1 = f2;
                v3 = v7;
                z1 = z2;
                s1 = s2;
                immutableList0 = immutableList1;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new KDPhoto(v4, long2, v2, s1, intSize2, z1, v3, immutableList0, size1, filter1, f1, effect1, persistentList1, border1, signature1, offset1, intSize1, null, null);
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

        public void serialize(@NotNull Encoder encoder0, @NotNull KDPhoto kDPhoto0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(kDPhoto0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            KDPhoto.write$Self$kdphoto_release(kDPhoto0, compositeEncoder0, serialDescriptor0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((KDPhoto)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\tR\u0014\u0010\u000B\u001A\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/KDPhoto$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Empty", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "getEmpty", "()Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "", "BITMAP_MAX_SIZE", "I", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final KDPhoto getEmpty() {
            return KDPhoto.r;
        }

        @NotNull
        public final KSerializer serializer() {
            return .serializer.INSTANCE;
        }
    }

    public static final int $stable = 0;
    public static final int BITMAP_MAX_SIZE = 3000;
    @NotNull
    public static final Companion Companion;
    public final Long a;
    public final int b;
    public final String c;
    public final long d;
    public final boolean e;
    public final int f;
    public final ImmutableList g;
    public final long h;
    public final Filter i;
    public final float j;
    public final Effect k;
    public final PersistentList l;
    public final Border m;
    public final Signature n;
    public final long o;
    public final long p;
    public static final KSerializer[] q;
    public static final KDPhoto r;

    static {
        KDPhoto.Companion = new Companion(null);
        KDPhoto.q = new KSerializer[]{null, null, null, new ContextualSerializer(Reflection.getOrCreateKotlinClass(IntSize.class), null, new KSerializer[0]), null, null, new ContextualSerializer(Reflection.getOrCreateKotlinClass(MatrixValues.class), null, new KSerializer[0]), new ContextualSerializer(Reflection.getOrCreateKotlinClass(Size.class), null, new KSerializer[0]), null, null, null, new ContextualSerializer(Reflection.getOrCreateKotlinClass(PersistentList.class), new PolymorphicSerializer(Reflection.getOrCreateKotlinClass(PersistentList.class), new Annotation[0]), new KSerializer[]{new SealedClassSerializer("com.kakao.kandinsky.core.kdphoto.Decoration.Absolute", Reflection.getOrCreateKotlinClass(Absolute.class), new KClass[]{Reflection.getOrCreateKotlinClass(Blur.class), Reflection.getOrCreateKotlinClass(Mosaic.class), Reflection.getOrCreateKotlinClass(Sticker.class), Reflection.getOrCreateKotlinClass(Text.class)}, new KSerializer[]{com.kakao.kandinsky.core.kdphoto.Blur..serializer.INSTANCE, com.kakao.kandinsky.core.kdphoto.Mosaic..serializer.INSTANCE, com.kakao.kandinsky.core.kdphoto.Sticker..serializer.INSTANCE, com.kakao.kandinsky.core.kdphoto.Text..serializer.INSTANCE}, new Annotation[0])}), null, Signature.Companion.serializer(), new ContextualSerializer(Reflection.getOrCreateKotlinClass(Offset.class), null, new KSerializer[0]), new ContextualSerializer(Reflection.getOrCreateKotlinClass(IntSize.class), null, new KSerializer[0])};
        KDPhoto.r = new KDPhoto(null, 0, "", 0L, false, 0, null, 0L, null, 0.0f, null, null, null, null, 0x3FFB, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public KDPhoto(int v, Long long0, int v1, String s, IntSize intSize0, boolean z, int v2, ImmutableList immutableList0, Size size0, Filter filter0, float f, Effect effect0, PersistentList persistentList0, Border border0, Signature signature0, @Contextual Offset offset0, @Contextual IntSize intSize1, SerializationConstructorMarker serializationConstructorMarker0, DefaultConstructorMarker defaultConstructorMarker0) {
        if(4 != (v & 4)) {
            PluginExceptionsKt.throwMissingFieldException(v, 4, .serializer.INSTANCE.getDescriptor());
        }
        super();
        this.a = (v & 1) == 0 ? null : long0;
        this.b = (v & 2) == 0 ? 0 : v1;
        this.c = s;
        this.d = (v & 8) == 0 ? 0L : intSize0.unbox-impl();
        this.e = (v & 16) == 0 ? false : z;
        this.f = (v & 0x20) == 0 ? 0 : v2;
        this.g = (v & 0x40) == 0 ? MatrixValues.constructor-impl$default(null, 1, null) : immutableList0;
        this.h = (v & 0x80) == 0 ? 0L : size0.unbox-impl();
        this.i = (v & 0x100) == 0 ? Filter.Companion.getDefault() : filter0;
        this.j = (v & 0x200) == 0 ? 1.0f : f;
        this.k = (v & 0x400) == 0 ? Effect.Companion.getDefault() : effect0;
        this.l = (v & 0x800) == 0 ? ExtensionsKt.persistentListOf() : persistentList0;
        this.m = (v & 0x1000) == 0 ? Border.Companion.getORIGIN() : border0;
        this.n = (v & 0x2000) == 0 ? null : signature0;
        this.o = (v & 0x4000) == 0 ? SizeKt.getCenter-uvyYCjk(this.h) : offset0.unbox-impl();
        this.p = (v & 0x8000) == 0 ? IntSizeKt.IntSize(c.roundToInt(Size.getWidth-impl(this.h)), c.roundToInt(Size.getHeight-impl(this.h))) : intSize1.unbox-impl();
    }

    // 去混淆评级： 低(20)
    public KDPhoto(Long long0, int v, String s, long v1, boolean z, int v2, ImmutableList immutableList0, long v3, Filter filter0, float f, Effect effect0, PersistentList persistentList0, Border border0, Signature signature0, int v4, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v4 & 1) == 0 ? long0 : null), ((v4 & 2) == 0 ? v : 0), s, ((v4 & 8) == 0 ? v1 : 0L), ((v4 & 16) == 0 ? z : false), ((v4 & 0x20) == 0 ? v2 : 0), ((v4 & 0x40) == 0 ? immutableList0 : MatrixValues.constructor-impl$default(null, 1, null)), ((v4 & 0x80) == 0 ? v3 : 0L), ((v4 & 0x100) == 0 ? filter0 : Filter.Companion.getDefault()), ((v4 & 0x200) == 0 ? f : 1.0f), ((v4 & 0x400) == 0 ? effect0 : Effect.Companion.getDefault()), ((v4 & 0x800) == 0 ? persistentList0 : ExtensionsKt.persistentListOf()), ((v4 & 0x1000) == 0 ? border0 : Border.Companion.getORIGIN()), ((v4 & 0x2000) == 0 ? signature0 : null), null);
    }

    public KDPhoto(Long long0, int v, String s, long v1, boolean z, int v2, ImmutableList immutableList0, long v3, Filter filter0, float f, Effect effect0, PersistentList persistentList0, Border border0, Signature signature0, DefaultConstructorMarker defaultConstructorMarker0) {
        Intrinsics.checkNotNullParameter(s, "originalUri");
        Intrinsics.checkNotNullParameter(immutableList0, "matrixValues");
        Intrinsics.checkNotNullParameter(filter0, "filter");
        Intrinsics.checkNotNullParameter(effect0, "effect");
        Intrinsics.checkNotNullParameter(persistentList0, "decorationList");
        Intrinsics.checkNotNullParameter(border0, "border");
        super();
        this.a = long0;
        this.b = v;
        this.c = s;
        this.d = v1;
        this.e = z;
        this.f = v2;
        this.g = immutableList0;
        this.h = v3;
        this.i = filter0;
        this.j = f;
        this.k = effect0;
        this.l = persistentList0;
        this.m = border0;
        this.n = signature0;
        this.o = SizeKt.getCenter-uvyYCjk(v3);
        this.p = IntSizeKt.IntSize(c.roundToInt(Size.getWidth-impl(v3)), c.roundToInt(Size.getHeight-impl(v3)));
    }

    @Nullable
    public final Long component1() {
        return this.a;
    }

    public final float component10() {
        return this.j;
    }

    @NotNull
    public final Effect component11() {
        return this.k;
    }

    @NotNull
    public final PersistentList component12() {
        return this.l;
    }

    @NotNull
    public final Border component13() {
        return this.m;
    }

    @Nullable
    public final Signature component14() {
        return this.n;
    }

    public final int component2() {
        return this.b;
    }

    @NotNull
    public final String component3() {
        return this.c;
    }

    public final long component4-YbymL2g() {
        return this.d;
    }

    public final boolean component5() {
        return this.e;
    }

    public final int component6() {
        return this.f;
    }

    public final long component8-NH-jbRc() {
        return this.h;
    }

    @NotNull
    public final Filter component9() {
        return this.i;
    }

    @NotNull
    public final KDPhoto copy-2Ycw6ww(@Nullable Long long0, int v, @NotNull String s, long v1, boolean z, int v2, @NotNull ImmutableList immutableList0, long v3, @NotNull Filter filter0, float f, @NotNull Effect effect0, @NotNull PersistentList persistentList0, @NotNull Border border0, @Nullable Signature signature0) {
        Intrinsics.checkNotNullParameter(s, "originalUri");
        Intrinsics.checkNotNullParameter(immutableList0, "matrixValues");
        Intrinsics.checkNotNullParameter(filter0, "filter");
        Intrinsics.checkNotNullParameter(effect0, "effect");
        Intrinsics.checkNotNullParameter(persistentList0, "decorationList");
        Intrinsics.checkNotNullParameter(border0, "border");
        return new KDPhoto(long0, v, s, v1, z, v2, immutableList0, v3, filter0, f, effect0, persistentList0, border0, signature0, null);
    }

    public static KDPhoto copy-2Ycw6ww$default(KDPhoto kDPhoto0, Long long0, int v, String s, long v1, boolean z, int v2, ImmutableList immutableList0, long v3, Filter filter0, float f, Effect effect0, PersistentList persistentList0, Border border0, Signature signature0, int v4, Object object0) {
        Long long1 = (v4 & 1) == 0 ? long0 : kDPhoto0.a;
        int v5 = (v4 & 2) == 0 ? v : kDPhoto0.b;
        String s1 = (v4 & 4) == 0 ? s : kDPhoto0.c;
        long v6 = (v4 & 8) == 0 ? v1 : kDPhoto0.d;
        boolean z1 = (v4 & 16) == 0 ? z : kDPhoto0.e;
        int v7 = (v4 & 0x20) == 0 ? v2 : kDPhoto0.f;
        ImmutableList immutableList1 = (v4 & 0x40) == 0 ? immutableList0 : kDPhoto0.g;
        long v8 = (v4 & 0x80) == 0 ? v3 : kDPhoto0.h;
        Filter filter1 = (v4 & 0x100) == 0 ? filter0 : kDPhoto0.i;
        float f1 = (v4 & 0x200) == 0 ? f : kDPhoto0.j;
        Effect effect1 = (v4 & 0x400) == 0 ? effect0 : kDPhoto0.k;
        PersistentList persistentList1 = (v4 & 0x800) == 0 ? persistentList0 : kDPhoto0.l;
        Border border1 = (v4 & 0x1000) == 0 ? border0 : kDPhoto0.m;
        return (v4 & 0x2000) == 0 ? kDPhoto0.copy-2Ycw6ww(long1, v5, s1, v6, z1, v7, immutableList1, v8, filter1, f1, effect1, persistentList1, border1, signature0) : kDPhoto0.copy-2Ycw6ww(long1, v5, s1, v6, z1, v7, immutableList1, v8, filter1, f1, effect1, persistentList1, border1, kDPhoto0.n);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof KDPhoto)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((KDPhoto)object0).a)) {
            return false;
        }
        if(this.b != ((KDPhoto)object0).b) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((KDPhoto)object0).c)) {
            return false;
        }
        if(!IntSize.equals-impl0(this.d, ((KDPhoto)object0).d)) {
            return false;
        }
        if(this.e != ((KDPhoto)object0).e) {
            return false;
        }
        if(this.f != ((KDPhoto)object0).f) {
            return false;
        }
        if(!MatrixValues.equals-impl0(this.g, ((KDPhoto)object0).g)) {
            return false;
        }
        if(!Size.equals-impl0(this.h, ((KDPhoto)object0).h)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.i, ((KDPhoto)object0).i)) {
            return false;
        }
        if(Float.compare(this.j, ((KDPhoto)object0).j) != 0) {
            return false;
        }
        if(!Intrinsics.areEqual(this.k, ((KDPhoto)object0).k)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.l, ((KDPhoto)object0).l)) {
            return false;
        }
        return Intrinsics.areEqual(this.m, ((KDPhoto)object0).m) ? Intrinsics.areEqual(this.n, ((KDPhoto)object0).n) : false;
    }

    public final long getBitmapSize-YbymL2g() {
        return this.d;
    }

    @NotNull
    public final Border getBorder() {
        return this.m;
    }

    public final long getCropCenter-F1C5BW0() {
        return this.o;
    }

    @Contextual
    public static void getCropCenter-F1C5BW0$annotations() {
    }

    public final long getCropIntSize-YbymL2g() {
        return this.p;
    }

    @Contextual
    public static void getCropIntSize-YbymL2g$annotations() {
    }

    public final long getCropSize-NH-jbRc() {
        return this.h;
    }

    @NotNull
    public final PersistentList getDecorationList() {
        return this.l;
    }

    @NotNull
    public final Effect getEffect() {
        return this.k;
    }

    @NotNull
    public final Filter getFilter() {
        return this.i;
    }

    public final float getFilterIntensity() {
        return this.j;
    }

    @Nullable
    public final Long getId() {
        return this.a;
    }

    @NotNull
    public final Rect getImageRect() {
        return SizeKt.toRect-uvyYCjk(IntSizeKt.toSize-ozmzZPI(this.d));
    }

    @NotNull
    public final Matrix getMatrix() {
        return MatrixValues.toMatrix-impl(this.g);
    }

    public final int getNewDecoNo() {
        Iterator iterator0 = this.l.iterator();
        if(!iterator0.hasNext()) {
            throw new NullPointerException();
        }
        Object object0 = iterator0.next();
        Integer integer0 = ((Absolute)object0).getNo();
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Integer integer1 = ((Absolute)object1).getNo();
            if(integer0.compareTo(integer1) < 0) {
                integer0 = integer1;
            }
        }
        return integer0 == null ? 0 : ((int)integer0) + 1;
    }

    @NotNull
    public final String getOriginalUri() {
        return this.c;
    }

    public final int getRequireWidth() {
        return this.f;
    }

    @Nullable
    public final Signature getSignature() {
        return this.n;
    }

    public final int getStep() {
        return this.b;
    }

    public final boolean getTooLargeImage() {
        return this.e;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = a.b(this.j, (this.i.hashCode() + (Size.hashCode-impl(this.h) + (MatrixValues.hashCode-impl(this.g) + a.c(this.f, a.e((IntSize.hashCode-impl(this.d) + q.c(a.c(this.b, (this.a == null ? 0 : this.a.hashCode()) * 0x1F, 0x1F), 0x1F, this.c)) * 0x1F, 0x1F, this.e), 0x1F)) * 0x1F) * 0x1F) * 0x1F, 0x1F);
        int v2 = this.k.hashCode();
        int v3 = this.l.hashCode();
        int v4 = this.m.hashCode();
        Signature signature0 = this.n;
        if(signature0 != null) {
            v = signature0.hashCode();
        }
        return (v4 + (v3 + (v2 + v1) * 0x1F) * 0x1F) * 0x1F + v;
    }

    public final boolean isEdited() {
        return !Intrinsics.areEqual(KDPhoto.copy-2Ycw6ww$default(this, null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, null, null, null, 0x3FFC, null), this.reset());
    }

    @NotNull
    public final KDPhoto reset() {
        return KDPhoto.copy-2Ycw6ww$default(KDPhoto.r, null, 0, this.c, this.d, this.e, 0, null, IntSizeKt.toSize-ozmzZPI(this.d), null, 0.0f, null, null, null, null, 0x3F63, null);
    }

    @Override
    @NotNull
    public String toString() {
        String s = Size.toString-impl(this.h);
        StringBuilder stringBuilder0 = new StringBuilder("KDPhoto(id=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", step=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", originalUri=");
        androidx.room.a.w(stringBuilder0, this.c, ", bitmapSize=", IntSize.toString-impl(this.d), ", tooLargeImage=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", requireWidth=");
        wb.a.j(stringBuilder0, this.f, ", matrixValues=", "MatrixValues(values=" + this.g + ")", ", cropSize=");
        stringBuilder0.append(s);
        stringBuilder0.append(", filter=");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", filterIntensity=");
        stringBuilder0.append(this.j);
        stringBuilder0.append(", effect=");
        stringBuilder0.append(this.k);
        stringBuilder0.append(", decorationList=");
        stringBuilder0.append(this.l);
        stringBuilder0.append(", border=");
        stringBuilder0.append(this.m);
        stringBuilder0.append(", signature=");
        stringBuilder0.append(this.n);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    @JvmStatic
    public static final void write$Self$kdphoto_release(KDPhoto kDPhoto0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || kDPhoto0.a != null) {
            compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 0, LongSerializer.INSTANCE, kDPhoto0.a);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || kDPhoto0.b != 0) {
            compositeEncoder0.encodeIntElement(serialDescriptor0, 1, kDPhoto0.b);
        }
        compositeEncoder0.encodeStringElement(serialDescriptor0, 2, kDPhoto0.c);
        boolean z = compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3);
        KSerializer[] arr_kSerializer = KDPhoto.q;
        long v = kDPhoto0.d;
        if(z || !IntSize.equals-impl0(v, 0L)) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 3, arr_kSerializer[3], IntSize.box-impl(v));
        }
        boolean z1 = compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 4);
        boolean z2 = kDPhoto0.e;
        if(z1 || z2) {
            compositeEncoder0.encodeBooleanElement(serialDescriptor0, 4, z2);
        }
        boolean z3 = compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 5);
        int v1 = kDPhoto0.f;
        if(z3 || v1 != 0) {
            compositeEncoder0.encodeIntElement(serialDescriptor0, 5, v1);
        }
        boolean z4 = compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 6);
        ImmutableList immutableList0 = kDPhoto0.g;
        if(z4 || !MatrixValues.equals-impl0(immutableList0, MatrixValues.constructor-impl$default(null, 1, null))) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 6, arr_kSerializer[6], MatrixValues.box-impl(immutableList0));
        }
        boolean z5 = compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 7);
        long v2 = kDPhoto0.h;
        if(z5 || !Size.equals-impl0(v2, 0L)) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 7, arr_kSerializer[7], Size.box-impl(v2));
        }
        boolean z6 = compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 8);
        Filter filter0 = kDPhoto0.i;
        if(z6 || !Intrinsics.areEqual(filter0, Filter.Companion.getDefault())) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 8, com.kakao.kandinsky.core.kdphoto.Filter..serializer.INSTANCE, filter0);
        }
        boolean z7 = compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 9);
        float f = kDPhoto0.j;
        if(z7 || Float.compare(f, 1.0f) != 0) {
            compositeEncoder0.encodeFloatElement(serialDescriptor0, 9, f);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 10)) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 10, com.kakao.kandinsky.core.kdphoto.Effect..serializer.INSTANCE, kDPhoto0.k);
        }
        else {
            Effect effect0 = Effect.Companion.getDefault();
            if(!Intrinsics.areEqual(kDPhoto0.k, effect0)) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 10, com.kakao.kandinsky.core.kdphoto.Effect..serializer.INSTANCE, kDPhoto0.k);
            }
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 11)) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 11, arr_kSerializer[11], kDPhoto0.l);
        }
        else {
            PersistentList persistentList0 = ExtensionsKt.persistentListOf();
            if(!Intrinsics.areEqual(kDPhoto0.l, persistentList0)) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 11, arr_kSerializer[11], kDPhoto0.l);
            }
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 12)) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 12, com.kakao.kandinsky.core.kdphoto.Border..serializer.INSTANCE, kDPhoto0.m);
        }
        else {
            Border border0 = Border.Companion.getORIGIN();
            if(!Intrinsics.areEqual(kDPhoto0.m, border0)) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 12, com.kakao.kandinsky.core.kdphoto.Border..serializer.INSTANCE, kDPhoto0.m);
            }
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 13) || kDPhoto0.n != null) {
            compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 13, arr_kSerializer[13], kDPhoto0.n);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 14)) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 14, arr_kSerializer[14], Offset.box-impl(kDPhoto0.o));
        }
        else {
            long v3 = SizeKt.getCenter-uvyYCjk(v2);
            if(!Offset.equals-impl0(kDPhoto0.o, v3)) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 14, arr_kSerializer[14], Offset.box-impl(kDPhoto0.o));
            }
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 15)) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 15, arr_kSerializer[15], IntSize.box-impl(kDPhoto0.p));
        }
        else {
            long v4 = IntSizeKt.IntSize(c.roundToInt(Size.getWidth-impl(v2)), c.roundToInt(Size.getHeight-impl(v2)));
            if(!IntSize.equals-impl0(kDPhoto0.p, v4)) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 15, arr_kSerializer[15], IntSize.box-impl(kDPhoto0.p));
            }
        }
    }
}

