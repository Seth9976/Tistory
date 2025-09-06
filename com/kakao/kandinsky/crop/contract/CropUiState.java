package com.kakao.kandinsky.crop.contract;

import android.graphics.Matrix;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.designsystem.util.RectExtensionKt;
import com.kakao.kandinsky.preview.PreviewUiState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y9.a;
import y9.b;
import y9.c;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u008E\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u000F\b\u0087\b\u0018\u00002\u00020\u0001B\u00AF\u0003\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007\u0012\b\b\u0002\u0010\t\u001A\u00020\u0007\u0012\b\b\u0002\u0010\u000B\u001A\u00020\n\u0012\u0014\b\u0002\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u000E\u001A\u00020\r\u0012\u0014\b\u0002\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0010\u001A\u00020\r\u0012\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0013\u001A\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001A\u00020\u0012\u0012\u0014\b\u0002\u0010\u0016\u001A\u000E\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0002\u0010\u0018\u001A\u000E\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u0004\u0012#\b\u0002\u0010\u001C\u001A\u001D\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\u0019\u0012\b\b\u001A\u0012\u0004\b\b(\u001B\u0012\u0004\u0012\u00020\u00050\u0004\u0012#\b\u0002\u0010\u001F\u001A\u001D\u0012\u0013\u0012\u00110\u001D\u00A2\u0006\f\b\u0019\u0012\b\b\u001A\u0012\u0004\b\b(\u001E\u0012\u0004\u0012\u00020\u00050\u0004\u00128\b\u0002\u0010#\u001A2\u0012\u0013\u0012\u00110\u001D\u00A2\u0006\f\b\u0019\u0012\b\b\u001A\u0012\u0004\b\b(\u001E\u0012\u0013\u0012\u00110!\u00A2\u0006\f\b\u0019\u0012\b\b\u001A\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00050 \u0012\u000E\b\u0002\u0010%\u001A\b\u0012\u0004\u0012\u00020\u00050$\u0012\b\b\u0002\u0010\'\u001A\u00020&\u0012\u0014\b\u0002\u0010(\u001A\u000E\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010)\u001A\u00020\n\u0012\u000E\b\u0002\u0010*\u001A\b\u0012\u0004\u0012\u00020\u00050$\u0012\u000E\b\u0002\u0010+\u001A\b\u0012\u0004\u0012\u00020\u00050$\u00A2\u0006\u0004\b,\u0010-J\u0010\u0010.\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b.\u0010/J\u001C\u00100\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u00C6\u0003\u00A2\u0006\u0004\b0\u00101J\u0010\u00102\u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b2\u00103J\u0010\u00104\u001A\u00020\nH\u00C6\u0003\u00A2\u0006\u0004\b4\u00105J\u001C\u00106\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0004H\u00C6\u0003\u00A2\u0006\u0004\b6\u00101J\u0010\u00107\u001A\u00020\rH\u00C6\u0003\u00A2\u0006\u0004\b7\u00108J\u001C\u00109\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0004H\u00C6\u0003\u00A2\u0006\u0004\b9\u00101J\u0010\u0010:\u001A\u00020\rH\u00C6\u0003\u00A2\u0006\u0004\b:\u00108J\u0012\u0010;\u001A\u0004\u0018\u00010\rH\u00C6\u0003\u00A2\u0006\u0004\b;\u00108J\u0010\u0010<\u001A\u00020\u0012H\u00C6\u0003\u00A2\u0006\u0004\b<\u0010=J\u0010\u0010>\u001A\u00020\u0012H\u00C6\u0003\u00A2\u0006\u0004\b>\u0010=J\u001C\u0010?\u001A\u000E\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u0004H\u00C6\u0003\u00A2\u0006\u0004\b?\u00101J\u001C\u0010@\u001A\u000E\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u0004H\u00C6\u0003\u00A2\u0006\u0004\b@\u00101J+\u0010A\u001A\u001D\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\u0019\u0012\b\b\u001A\u0012\u0004\b\b(\u001B\u0012\u0004\u0012\u00020\u00050\u0004H\u00C6\u0003\u00A2\u0006\u0004\bA\u00101J+\u0010B\u001A\u001D\u0012\u0013\u0012\u00110\u001D\u00A2\u0006\f\b\u0019\u0012\b\b\u001A\u0012\u0004\b\b(\u001E\u0012\u0004\u0012\u00020\u00050\u0004H\u00C6\u0003\u00A2\u0006\u0004\bB\u00101J@\u0010C\u001A2\u0012\u0013\u0012\u00110\u001D\u00A2\u0006\f\b\u0019\u0012\b\b\u001A\u0012\u0004\b\b(\u001E\u0012\u0013\u0012\u00110!\u00A2\u0006\f\b\u0019\u0012\b\b\u001A\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00050 H\u00C6\u0003\u00A2\u0006\u0004\bC\u0010DJ\u0016\u0010E\u001A\b\u0012\u0004\u0012\u00020\u00050$H\u00C6\u0003\u00A2\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001A\u00020&H\u00C6\u0003\u00A2\u0006\u0004\bG\u0010HJ\u001C\u0010I\u001A\u000E\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00050\u0004H\u00C6\u0003\u00A2\u0006\u0004\bI\u00101J\u0010\u0010J\u001A\u00020\nH\u00C6\u0003\u00A2\u0006\u0004\bJ\u00105J\u0016\u0010K\u001A\b\u0012\u0004\u0012\u00020\u00050$H\u00C6\u0003\u00A2\u0006\u0004\bK\u0010FJ\u0016\u0010L\u001A\b\u0012\u0004\u0012\u00020\u00050$H\u00C6\u0003\u00A2\u0006\u0004\bL\u0010FJ\u00B8\u0003\u0010M\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00072\b\b\u0002\u0010\u000B\u001A\u00020\n2\u0014\b\u0002\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u000E\u001A\u00020\r2\u0014\b\u0002\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0010\u001A\u00020\r2\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0013\u001A\u00020\u00122\b\b\u0002\u0010\u0014\u001A\u00020\u00122\u0014\b\u0002\u0010\u0016\u001A\u000E\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\u0018\u001A\u000E\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u00042#\b\u0002\u0010\u001C\u001A\u001D\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\u0019\u0012\b\b\u001A\u0012\u0004\b\b(\u001B\u0012\u0004\u0012\u00020\u00050\u00042#\b\u0002\u0010\u001F\u001A\u001D\u0012\u0013\u0012\u00110\u001D\u00A2\u0006\f\b\u0019\u0012\b\b\u001A\u0012\u0004\b\b(\u001E\u0012\u0004\u0012\u00020\u00050\u000428\b\u0002\u0010#\u001A2\u0012\u0013\u0012\u00110\u001D\u00A2\u0006\f\b\u0019\u0012\b\b\u001A\u0012\u0004\b\b(\u001E\u0012\u0013\u0012\u00110!\u00A2\u0006\f\b\u0019\u0012\b\b\u001A\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00050 2\u000E\b\u0002\u0010%\u001A\b\u0012\u0004\u0012\u00020\u00050$2\b\b\u0002\u0010\'\u001A\u00020&2\u0014\b\u0002\u0010(\u001A\u000E\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010)\u001A\u00020\n2\u000E\b\u0002\u0010*\u001A\b\u0012\u0004\u0012\u00020\u00050$2\u000E\b\u0002\u0010+\u001A\b\u0012\u0004\u0012\u00020\u00050$H\u00C6\u0001\u00A2\u0006\u0004\bM\u0010NJ\u0010\u0010P\u001A\u00020OH\u00D6\u0001\u00A2\u0006\u0004\bP\u0010QJ\u0010\u0010S\u001A\u00020RH\u00D6\u0001\u00A2\u0006\u0004\bS\u0010TJ\u001A\u0010W\u001A\u00020\u00122\b\u0010V\u001A\u0004\u0018\u00010UH\u00D6\u0003\u00A2\u0006\u0004\bW\u0010XR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bY\u0010Z\u001A\u0004\b[\u0010/R#\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00A2\u0006\f\n\u0004\b\\\u0010]\u001A\u0004\b^\u00101R\u001A\u0010\b\u001A\u00020\u00078\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b_\u0010`\u001A\u0004\ba\u00103R\u0017\u0010\u000B\u001A\u00020\n8\u0006\u00A2\u0006\f\n\u0004\bb\u0010c\u001A\u0004\bd\u00105R#\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00A2\u0006\f\n\u0004\be\u0010]\u001A\u0004\bf\u00101R\u001A\u0010\u000E\u001A\u00020\r8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bg\u0010h\u001A\u0004\bi\u00108R#\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00A2\u0006\f\n\u0004\bj\u0010]\u001A\u0004\bk\u00101R\u0017\u0010\u0010\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\bl\u0010h\u001A\u0004\bm\u00108R\u0019\u0010\u0011\u001A\u0004\u0018\u00010\r8\u0006\u00A2\u0006\f\n\u0004\bn\u0010h\u001A\u0004\bo\u00108R\u0017\u0010\u0013\u001A\u00020\u00128\u0006\u00A2\u0006\f\n\u0004\bp\u0010q\u001A\u0004\br\u0010=R\u0017\u0010\u0014\u001A\u00020\u00128\u0006\u00A2\u0006\f\n\u0004\bs\u0010q\u001A\u0004\bt\u0010=R#\u0010\u0016\u001A\u000E\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00A2\u0006\f\n\u0004\bu\u0010]\u001A\u0004\bv\u00101R#\u0010\u0018\u001A\u000E\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00A2\u0006\f\n\u0004\bc\u0010]\u001A\u0004\bw\u00101R2\u0010\u001C\u001A\u001D\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\u0019\u0012\b\b\u001A\u0012\u0004\b\b(\u001B\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00A2\u0006\f\n\u0004\bx\u0010]\u001A\u0004\by\u00101R2\u0010\u001F\u001A\u001D\u0012\u0013\u0012\u00110\u001D\u00A2\u0006\f\b\u0019\u0012\b\b\u001A\u0012\u0004\b\b(\u001E\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00A2\u0006\f\n\u0004\bz\u0010]\u001A\u0004\b{\u00101RG\u0010#\u001A2\u0012\u0013\u0012\u00110\u001D\u00A2\u0006\f\b\u0019\u0012\b\b\u001A\u0012\u0004\b\b(\u001E\u0012\u0013\u0012\u00110!\u00A2\u0006\f\b\u0019\u0012\b\b\u001A\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00050 8\u0006\u00A2\u0006\f\n\u0004\b|\u0010}\u001A\u0004\b~\u0010DR\u001F\u0010%\u001A\b\u0012\u0004\u0012\u00020\u00050$8\u0006\u00A2\u0006\u000E\n\u0005\b\u007F\u0010\u0080\u0001\u001A\u0005\b\u0081\u0001\u0010FR\u001A\u0010\'\u001A\u00020&8\u0006\u00A2\u0006\u000F\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001A\u0005\b\u0084\u0001\u0010HR%\u0010(\u001A\u000E\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00A2\u0006\u000E\n\u0005\b\u0085\u0001\u0010]\u001A\u0005\b\u0086\u0001\u00101R\u0019\u0010)\u001A\u00020\n8\u0006\u00A2\u0006\u000E\n\u0005\b\u0087\u0001\u0010c\u001A\u0005\b\u0088\u0001\u00105R \u0010*\u001A\b\u0012\u0004\u0012\u00020\u00050$8\u0006\u00A2\u0006\u000F\n\u0006\b\u0089\u0001\u0010\u0080\u0001\u001A\u0005\b\u008A\u0001\u0010FR \u0010+\u001A\b\u0012\u0004\u0012\u00020\u00050$8\u0006\u00A2\u0006\u000F\n\u0006\b\u008B\u0001\u0010\u0080\u0001\u001A\u0005\b\u008C\u0001\u0010FR\u001A\u0010\u008F\u0001\u001A\u00020\u00128\u0006\u00A2\u0006\u000E\n\u0005\b\u008D\u0001\u0010q\u001A\u0005\b\u008E\u0001\u0010=R\u001D\u0010\u0095\u0001\u001A\u00030\u0090\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001A\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001A\u0010\u0098\u0001\u001A\u00020\r8\u0006\u00A2\u0006\u000E\n\u0005\b\u0096\u0001\u0010h\u001A\u0005\b\u0097\u0001\u00108R\u001C\u0010\u009B\u0001\u001A\u0004\u0018\u00010\r8\u0006\u00A2\u0006\u000E\n\u0005\b\u0099\u0001\u0010h\u001A\u0005\b\u009A\u0001\u00108R\u001A\u0010\u009E\u0001\u001A\u00020\u00128\u0006\u00A2\u0006\u000E\n\u0005\b\u009C\u0001\u0010q\u001A\u0005\b\u009D\u0001\u0010=\u00A8\u0006\u009F\u0001"}, d2 = {"Lcom/kakao/kandinsky/crop/contract/CropUiState;", "Lcom/kakao/kandinsky/preview/PreviewUiState;", "Lcom/kakao/kandinsky/crop/contract/CropViewType;", "viewType", "Lkotlin/Function1;", "", "onChangeViewType", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "photo", "savedPhoto", "", "angle", "onRotate", "Landroidx/compose/ui/geometry/Rect;", "contentBounds", "onChangedContentBounds", "cropRect", "rubberRect", "", "showCropBox", "showGuideLine", "Lcom/kakao/kandinsky/crop/contract/RotateType;", "onClickRotate", "Lcom/kakao/kandinsky/crop/contract/FlipType;", "onClickFlip", "Lkotlin/ParameterName;", "name", "zoom", "onZoom", "Landroidx/compose/ui/geometry/Offset;", "offset", "onMove", "Lkotlin/Function2;", "Lcom/kakao/kandinsky/crop/contract/TouchDragPoint;", "touchPoint", "onDrag", "Lkotlin/Function0;", "onFinishInteraction", "Lcom/kakao/kandinsky/crop/contract/CropRatioType;", "cropRatioType", "onChangeCropRatioType", "manualScale", "onClickCancel", "onClickConfirm", "<init>", "(Lcom/kakao/kandinsky/crop/contract/CropViewType;Lkotlin/jvm/functions/Function1;Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lcom/kakao/kandinsky/crop/contract/CropRatioType;Lkotlin/jvm/functions/Function1;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "component1", "()Lcom/kakao/kandinsky/crop/contract/CropViewType;", "component2", "()Lkotlin/jvm/functions/Function1;", "component3", "()Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "component5", "()F", "component6", "component7", "()Landroidx/compose/ui/geometry/Rect;", "component8", "component9", "component10", "component11", "()Z", "component12", "component13", "component14", "component15", "component16", "component17", "()Lkotlin/jvm/functions/Function2;", "component18", "()Lkotlin/jvm/functions/Function0;", "component19", "()Lcom/kakao/kandinsky/crop/contract/CropRatioType;", "component20", "component21", "component22", "component23", "copy", "(Lcom/kakao/kandinsky/crop/contract/CropViewType;Lkotlin/jvm/functions/Function1;Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lcom/kakao/kandinsky/crop/contract/CropRatioType;Lkotlin/jvm/functions/Function1;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/kakao/kandinsky/crop/contract/CropUiState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "s", "Lcom/kakao/kandinsky/crop/contract/CropViewType;", "getViewType", "t", "Lkotlin/jvm/functions/Function1;", "getOnChangeViewType", "u", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "getPhoto", "w", "F", "getAngle", "x", "getOnRotate", "y", "Landroidx/compose/ui/geometry/Rect;", "getContentBounds", "z", "getOnChangedContentBounds", "A", "getCropRect", "B", "getRubberRect", "C", "Z", "getShowCropBox", "D", "getShowGuideLine", "E", "getOnClickRotate", "getOnClickFlip", "G", "getOnZoom", "H", "getOnMove", "I", "Lkotlin/jvm/functions/Function2;", "getOnDrag", "J", "Lkotlin/jvm/functions/Function0;", "getOnFinishInteraction", "K", "Lcom/kakao/kandinsky/crop/contract/CropRatioType;", "getCropRatioType", "L", "getOnChangeCropRatioType", "M", "getManualScale", "N", "getOnClickCancel", "O", "getOnClickConfirm", "P", "getChanged", "changed", "Landroid/graphics/Matrix;", "Q", "Landroid/graphics/Matrix;", "getDisplayInverseMatrix", "()Landroid/graphics/Matrix;", "displayInverseMatrix", "R", "getDraggingCropRect", "draggingCropRect", "S", "getDraggingRubberRect", "draggingRubberRect", "T", "getEnabledDrag", "enabledDrag", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCropUiState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropUiState.kt\ncom/kakao/kandinsky/crop/contract/CropUiState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
public final class CropUiState extends PreviewUiState {
    public static final int $stable = 8;
    public final Rect A;
    public final Rect B;
    public final boolean C;
    public final boolean D;
    public final Function1 E;
    public final Function1 F;
    public final Function1 G;
    public final Function1 H;
    public final Function2 I;
    public final Function0 J;
    public final CropRatioType K;
    public final Function1 L;
    public final float M;
    public final Function0 N;
    public final Function0 O;
    public final boolean P;
    public final Matrix Q;
    public final Rect R;
    public final Rect S;
    public final boolean T;
    public final CropViewType s;
    public final Function1 t;
    public final KDPhoto u;
    public final KDPhoto v;
    public final float w;
    public final Function1 x;
    public final Rect y;
    public final Function1 z;

    public CropUiState() {
        this(null, null, null, null, 0.0f, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, null, null, 0x7FFFFF, null);
    }

    public CropUiState(@NotNull CropViewType cropViewType0, @NotNull Function1 function10, @NotNull KDPhoto kDPhoto0, @NotNull KDPhoto kDPhoto1, float f, @NotNull Function1 function11, @NotNull Rect rect0, @NotNull Function1 function12, @NotNull Rect rect1, @Nullable Rect rect2, boolean z, boolean z1, @NotNull Function1 function13, @NotNull Function1 function14, @NotNull Function1 function15, @NotNull Function1 function16, @NotNull Function2 function20, @NotNull Function0 function00, @NotNull CropRatioType cropRatioType0, @NotNull Function1 function17, float f1, @NotNull Function0 function01, @NotNull Function0 function02) {
        Intrinsics.checkNotNullParameter(cropViewType0, "viewType");
        Intrinsics.checkNotNullParameter(function10, "onChangeViewType");
        Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
        Intrinsics.checkNotNullParameter(kDPhoto1, "savedPhoto");
        Intrinsics.checkNotNullParameter(function11, "onRotate");
        Intrinsics.checkNotNullParameter(rect0, "contentBounds");
        Intrinsics.checkNotNullParameter(function12, "onChangedContentBounds");
        Intrinsics.checkNotNullParameter(rect1, "cropRect");
        Intrinsics.checkNotNullParameter(function13, "onClickRotate");
        Intrinsics.checkNotNullParameter(function14, "onClickFlip");
        Intrinsics.checkNotNullParameter(function15, "onZoom");
        Intrinsics.checkNotNullParameter(function16, "onMove");
        Intrinsics.checkNotNullParameter(function20, "onDrag");
        Intrinsics.checkNotNullParameter(function00, "onFinishInteraction");
        Intrinsics.checkNotNullParameter(cropRatioType0, "cropRatioType");
        Intrinsics.checkNotNullParameter(function17, "onChangeCropRatioType");
        Intrinsics.checkNotNullParameter(function01, "onClickCancel");
        Intrinsics.checkNotNullParameter(function02, "onClickConfirm");
        super();
        this.s = cropViewType0;
        this.t = function10;
        this.u = kDPhoto0;
        this.v = kDPhoto1;
        this.w = f;
        this.x = function11;
        this.y = rect0;
        this.z = function12;
        this.A = rect1;
        this.B = rect2;
        this.C = z;
        this.D = z1;
        this.E = function13;
        this.F = function14;
        this.G = function15;
        this.H = function16;
        this.I = function20;
        this.J = function00;
        this.K = cropRatioType0;
        this.L = function17;
        this.M = f1;
        this.N = function01;
        this.O = function02;
        boolean z2 = true;
        this.P = !Intrinsics.areEqual(this.getPhoto(), kDPhoto1);
        Matrix matrix0 = new Matrix();
        this.getDisplayMatrix().invert(matrix0);
        this.Q = matrix0;
        this.R = RectExtensionKt.mapRect(this.getDisplayMatrix(), rect1);
        this.S = rect2 == null ? null : RectExtensionKt.mapRect(this.getDisplayMatrix(), rect2);
        if(cropViewType0 != CropViewType.Crop) {
            z2 = false;
        }
        this.T = z2;
    }

    public CropUiState(CropViewType cropViewType0, Function1 function10, KDPhoto kDPhoto0, KDPhoto kDPhoto1, float f, Function1 function11, Rect rect0, Function1 function12, Rect rect1, Rect rect2, boolean z, boolean z1, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function2 function20, Function0 function00, CropRatioType cropRatioType0, Function1 function17, float f1, Function0 function01, Function0 function02, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        CropViewType cropViewType1 = (v & 1) == 0 ? cropViewType0 : CropViewType.Crop;
        Function1 function18 = (v & 2) == 0 ? function10 : a.y;
        KDPhoto kDPhoto2 = (v & 4) == 0 ? kDPhoto0 : KDPhoto.Companion.getEmpty();
        KDPhoto kDPhoto3 = (v & 8) == 0 ? kDPhoto1 : KDPhoto.Companion.getEmpty();
        Function1 function19 = (v & 0x20) == 0 ? function11 : a.z;
        Rect rect3 = (v & 0x40) == 0 ? rect0 : Rect.Companion.getZero();
        Function1 function110 = (v & 0x80) == 0 ? function12 : a.A;
        Rect rect4 = (v & 0x100) == 0 ? rect1 : Rect.Companion.getZero();
        Function1 function111 = (v & 0x1000) == 0 ? function13 : a.B;
        Function1 function112 = (v & 0x2000) == 0 ? function14 : a.C;
        Function1 function113 = (v & 0x4000) == 0 ? function15 : a.D;
        Function1 function114 = (v & 0x8000) == 0 ? function16 : a.E;
        Function2 function21 = (v & 0x10000) == 0 ? function20 : c.w;
        Function0 function03 = (v & 0x20000) == 0 ? function00 : b.z;
        CropRatioType cropRatioType1 = (v & 0x40000) == 0 ? cropRatioType0 : CropRatioType.Original;
        Function1 function115 = (v & 0x80000) == 0 ? function17 : a.x;
        Function0 function04 = (v & 0x200000) == 0 ? function01 : b.x;
        Function0 function05 = (v & 0x400000) == 0 ? function02 : b.y;
        this(cropViewType1, function18, kDPhoto2, kDPhoto3, ((v & 16) == 0 ? f : 0.0f), function19, rect3, function110, rect4, ((v & 0x200) == 0 ? rect2 : null), ((v & 0x400) == 0 ? z : false), ((v & 0x800) == 0 ? z1 : false), function111, function112, function113, function114, function21, function03, cropRatioType1, function115, ((v & 0x100000) == 0 ? f1 : 1.0f), function04, function05);
    }

    @NotNull
    public final CropViewType component1() {
        return this.s;
    }

    @Nullable
    public final Rect component10() {
        return this.B;
    }

    public final boolean component11() {
        return this.C;
    }

    public final boolean component12() {
        return this.D;
    }

    @NotNull
    public final Function1 component13() {
        return this.E;
    }

    @NotNull
    public final Function1 component14() {
        return this.F;
    }

    @NotNull
    public final Function1 component15() {
        return this.G;
    }

    @NotNull
    public final Function1 component16() {
        return this.H;
    }

    @NotNull
    public final Function2 component17() {
        return this.I;
    }

    @NotNull
    public final Function0 component18() {
        return this.J;
    }

    @NotNull
    public final CropRatioType component19() {
        return this.K;
    }

    @NotNull
    public final Function1 component2() {
        return this.t;
    }

    @NotNull
    public final Function1 component20() {
        return this.L;
    }

    public final float component21() {
        return this.M;
    }

    @NotNull
    public final Function0 component22() {
        return this.N;
    }

    @NotNull
    public final Function0 component23() {
        return this.O;
    }

    @NotNull
    public final KDPhoto component3() {
        return this.u;
    }

    public final float component5() {
        return this.w;
    }

    @NotNull
    public final Function1 component6() {
        return this.x;
    }

    @NotNull
    public final Rect component7() {
        return this.y;
    }

    @NotNull
    public final Function1 component8() {
        return this.z;
    }

    @NotNull
    public final Rect component9() {
        return this.A;
    }

    @NotNull
    public final CropUiState copy(@NotNull CropViewType cropViewType0, @NotNull Function1 function10, @NotNull KDPhoto kDPhoto0, @NotNull KDPhoto kDPhoto1, float f, @NotNull Function1 function11, @NotNull Rect rect0, @NotNull Function1 function12, @NotNull Rect rect1, @Nullable Rect rect2, boolean z, boolean z1, @NotNull Function1 function13, @NotNull Function1 function14, @NotNull Function1 function15, @NotNull Function1 function16, @NotNull Function2 function20, @NotNull Function0 function00, @NotNull CropRatioType cropRatioType0, @NotNull Function1 function17, float f1, @NotNull Function0 function01, @NotNull Function0 function02) {
        Intrinsics.checkNotNullParameter(cropViewType0, "viewType");
        Intrinsics.checkNotNullParameter(function10, "onChangeViewType");
        Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
        Intrinsics.checkNotNullParameter(kDPhoto1, "savedPhoto");
        Intrinsics.checkNotNullParameter(function11, "onRotate");
        Intrinsics.checkNotNullParameter(rect0, "contentBounds");
        Intrinsics.checkNotNullParameter(function12, "onChangedContentBounds");
        Intrinsics.checkNotNullParameter(rect1, "cropRect");
        Intrinsics.checkNotNullParameter(function13, "onClickRotate");
        Intrinsics.checkNotNullParameter(function14, "onClickFlip");
        Intrinsics.checkNotNullParameter(function15, "onZoom");
        Intrinsics.checkNotNullParameter(function16, "onMove");
        Intrinsics.checkNotNullParameter(function20, "onDrag");
        Intrinsics.checkNotNullParameter(function00, "onFinishInteraction");
        Intrinsics.checkNotNullParameter(cropRatioType0, "cropRatioType");
        Intrinsics.checkNotNullParameter(function17, "onChangeCropRatioType");
        Intrinsics.checkNotNullParameter(function01, "onClickCancel");
        Intrinsics.checkNotNullParameter(function02, "onClickConfirm");
        return new CropUiState(cropViewType0, function10, kDPhoto0, kDPhoto1, f, function11, rect0, function12, rect1, rect2, z, z1, function13, function14, function15, function16, function20, function00, cropRatioType0, function17, f1, function01, function02);
    }

    public static CropUiState copy$default(CropUiState cropUiState0, CropViewType cropViewType0, Function1 function10, KDPhoto kDPhoto0, KDPhoto kDPhoto1, float f, Function1 function11, Rect rect0, Function1 function12, Rect rect1, Rect rect2, boolean z, boolean z1, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function2 function20, Function0 function00, CropRatioType cropRatioType0, Function1 function17, float f1, Function0 function01, Function0 function02, int v, Object object0) {
        CropViewType cropViewType1 = (v & 1) == 0 ? cropViewType0 : cropUiState0.s;
        Function1 function18 = (v & 2) == 0 ? function10 : cropUiState0.t;
        KDPhoto kDPhoto2 = (v & 4) == 0 ? kDPhoto0 : cropUiState0.u;
        KDPhoto kDPhoto3 = (v & 8) == 0 ? kDPhoto1 : cropUiState0.v;
        float f2 = (v & 16) == 0 ? f : cropUiState0.w;
        Function1 function19 = (v & 0x20) == 0 ? function11 : cropUiState0.x;
        Rect rect3 = (v & 0x40) == 0 ? rect0 : cropUiState0.y;
        Function1 function110 = (v & 0x80) == 0 ? function12 : cropUiState0.z;
        Rect rect4 = (v & 0x100) == 0 ? rect1 : cropUiState0.A;
        Rect rect5 = (v & 0x200) == 0 ? rect2 : cropUiState0.B;
        boolean z2 = (v & 0x400) == 0 ? z : cropUiState0.C;
        boolean z3 = (v & 0x800) == 0 ? z1 : cropUiState0.D;
        Function1 function111 = (v & 0x1000) == 0 ? function13 : cropUiState0.E;
        Function1 function112 = (v & 0x2000) == 0 ? function14 : cropUiState0.F;
        Function1 function113 = (v & 0x4000) == 0 ? function15 : cropUiState0.G;
        Function1 function114 = (v & 0x8000) == 0 ? function16 : cropUiState0.H;
        Function2 function21 = (v & 0x10000) == 0 ? function20 : cropUiState0.I;
        Function0 function03 = (v & 0x20000) == 0 ? function00 : cropUiState0.J;
        CropRatioType cropRatioType1 = (v & 0x40000) == 0 ? cropRatioType0 : cropUiState0.K;
        Function1 function115 = (v & 0x80000) == 0 ? function17 : cropUiState0.L;
        float f3 = (v & 0x100000) == 0 ? f1 : cropUiState0.M;
        Function0 function04 = (v & 0x200000) == 0 ? function01 : cropUiState0.N;
        return (v & 0x400000) == 0 ? cropUiState0.copy(cropViewType1, function18, kDPhoto2, kDPhoto3, f2, function19, rect3, function110, rect4, rect5, z2, z3, function111, function112, function113, function114, function21, function03, cropRatioType1, function115, f3, function04, function02) : cropUiState0.copy(cropViewType1, function18, kDPhoto2, kDPhoto3, f2, function19, rect3, function110, rect4, rect5, z2, z3, function111, function112, function113, function114, function21, function03, cropRatioType1, function115, f3, function04, cropUiState0.O);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CropUiState)) {
            return false;
        }
        CropUiState cropUiState0 = (CropUiState)object0;
        if(this.s != cropUiState0.s) {
            return false;
        }
        if(!Intrinsics.areEqual(this.t, cropUiState0.t)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.u, cropUiState0.u)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.v, cropUiState0.v)) {
            return false;
        }
        if(Float.compare(this.w, cropUiState0.w) != 0) {
            return false;
        }
        if(!Intrinsics.areEqual(this.x, cropUiState0.x)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.y, cropUiState0.y)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.z, cropUiState0.z)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.A, cropUiState0.A)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.B, cropUiState0.B)) {
            return false;
        }
        if(this.C != cropUiState0.C) {
            return false;
        }
        if(this.D != cropUiState0.D) {
            return false;
        }
        if(!Intrinsics.areEqual(this.E, cropUiState0.E)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.F, cropUiState0.F)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.G, cropUiState0.G)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.H, cropUiState0.H)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.I, cropUiState0.I)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.J, cropUiState0.J)) {
            return false;
        }
        if(this.K != cropUiState0.K) {
            return false;
        }
        if(!Intrinsics.areEqual(this.L, cropUiState0.L)) {
            return false;
        }
        if(Float.compare(this.M, cropUiState0.M) != 0) {
            return false;
        }
        return Intrinsics.areEqual(this.N, cropUiState0.N) ? Intrinsics.areEqual(this.O, cropUiState0.O) : false;
    }

    public final float getAngle() {
        return this.w;
    }

    public final boolean getChanged() {
        return this.P;
    }

    @Override  // com.kakao.kandinsky.preview.PreviewUiState
    @NotNull
    public Rect getContentBounds() {
        return this.y;
    }

    @NotNull
    public final CropRatioType getCropRatioType() {
        return this.K;
    }

    @NotNull
    public final Rect getCropRect() {
        return this.A;
    }

    @NotNull
    public final Matrix getDisplayInverseMatrix() {
        return this.Q;
    }

    @NotNull
    public final Rect getDraggingCropRect() {
        return this.R;
    }

    @Nullable
    public final Rect getDraggingRubberRect() {
        return this.S;
    }

    public final boolean getEnabledDrag() {
        return this.T;
    }

    public final float getManualScale() {
        return this.M;
    }

    @NotNull
    public final Function1 getOnChangeCropRatioType() {
        return this.L;
    }

    @NotNull
    public final Function1 getOnChangeViewType() {
        return this.t;
    }

    @NotNull
    public final Function1 getOnChangedContentBounds() {
        return this.z;
    }

    @NotNull
    public final Function0 getOnClickCancel() {
        return this.N;
    }

    @NotNull
    public final Function0 getOnClickConfirm() {
        return this.O;
    }

    @NotNull
    public final Function1 getOnClickFlip() {
        return this.F;
    }

    @NotNull
    public final Function1 getOnClickRotate() {
        return this.E;
    }

    @NotNull
    public final Function2 getOnDrag() {
        return this.I;
    }

    @NotNull
    public final Function0 getOnFinishInteraction() {
        return this.J;
    }

    @NotNull
    public final Function1 getOnMove() {
        return this.H;
    }

    @NotNull
    public final Function1 getOnRotate() {
        return this.x;
    }

    @NotNull
    public final Function1 getOnZoom() {
        return this.G;
    }

    @Override  // com.kakao.kandinsky.preview.PreviewUiState
    @NotNull
    public KDPhoto getPhoto() {
        return this.u;
    }

    @Nullable
    public final Rect getRubberRect() {
        return this.B;
    }

    public final boolean getShowCropBox() {
        return this.C;
    }

    public final boolean getShowGuideLine() {
        return this.D;
    }

    @NotNull
    public final CropViewType getViewType() {
        return this.s;
    }

    @Override
    public int hashCode() {
        int v = r0.a.d((this.y.hashCode() + r0.a.d(r0.a.b(this.w, (this.v.hashCode() + (this.u.hashCode() + r0.a.d(this.s.hashCode() * 0x1F, 0x1F, this.t)) * 0x1F) * 0x1F, 0x1F), 0x1F, this.x)) * 0x1F, 0x1F, this.z);
        int v1 = this.A.hashCode();
        return this.B == null ? this.O.hashCode() + r0.a.g(this.N, r0.a.b(this.M, r0.a.d((this.K.hashCode() + r0.a.g(this.J, (this.I.hashCode() + r0.a.d(r0.a.d(r0.a.d(r0.a.d(r0.a.e(r0.a.e((v1 + v) * 961, 0x1F, this.C), 0x1F, this.D), 0x1F, this.E), 0x1F, this.F), 0x1F, this.G), 0x1F, this.H)) * 0x1F, 0x1F)) * 0x1F, 0x1F, this.L), 0x1F), 0x1F) : this.O.hashCode() + r0.a.g(this.N, r0.a.b(this.M, r0.a.d((this.K.hashCode() + r0.a.g(this.J, (this.I.hashCode() + r0.a.d(r0.a.d(r0.a.d(r0.a.d(r0.a.e(r0.a.e(((v1 + v) * 0x1F + this.B.hashCode()) * 0x1F, 0x1F, this.C), 0x1F, this.D), 0x1F, this.E), 0x1F, this.F), 0x1F, this.G), 0x1F, this.H)) * 0x1F, 0x1F)) * 0x1F, 0x1F, this.L), 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("CropUiState(viewType=");
        stringBuilder0.append(this.s);
        stringBuilder0.append(", onChangeViewType=");
        stringBuilder0.append(this.t);
        stringBuilder0.append(", photo=");
        stringBuilder0.append(this.u);
        stringBuilder0.append(", savedPhoto=");
        stringBuilder0.append(this.v);
        stringBuilder0.append(", angle=");
        stringBuilder0.append(this.w);
        stringBuilder0.append(", onRotate=");
        stringBuilder0.append(this.x);
        stringBuilder0.append(", contentBounds=");
        stringBuilder0.append(this.y);
        stringBuilder0.append(", onChangedContentBounds=");
        stringBuilder0.append(this.z);
        stringBuilder0.append(", cropRect=");
        stringBuilder0.append(this.A);
        stringBuilder0.append(", rubberRect=");
        stringBuilder0.append(this.B);
        stringBuilder0.append(", showCropBox=");
        stringBuilder0.append(this.C);
        stringBuilder0.append(", showGuideLine=");
        stringBuilder0.append(this.D);
        stringBuilder0.append(", onClickRotate=");
        stringBuilder0.append(this.E);
        stringBuilder0.append(", onClickFlip=");
        stringBuilder0.append(this.F);
        stringBuilder0.append(", onZoom=");
        stringBuilder0.append(this.G);
        stringBuilder0.append(", onMove=");
        stringBuilder0.append(this.H);
        stringBuilder0.append(", onDrag=");
        stringBuilder0.append(this.I);
        stringBuilder0.append(", onFinishInteraction=");
        stringBuilder0.append(this.J);
        stringBuilder0.append(", cropRatioType=");
        stringBuilder0.append(this.K);
        stringBuilder0.append(", onChangeCropRatioType=");
        stringBuilder0.append(this.L);
        stringBuilder0.append(", manualScale=");
        stringBuilder0.append(this.M);
        stringBuilder0.append(", onClickCancel=");
        stringBuilder0.append(this.N);
        stringBuilder0.append(", onClickConfirm=");
        return q.q(stringBuilder0, this.O, ")");
    }
}

