package com.kakao.kandinsky.signature.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.core.kdphoto.Decoration;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.core.kdphoto.Signature.Image;
import com.kakao.kandinsky.core.kdphoto.Signature.Text;
import com.kakao.kandinsky.core.kdphoto.Signature;
import com.kakao.kandinsky.decoration.DecorationStatus;
import com.kakao.kandinsky.preview.PreviewUiState;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ta.a;
import ta.b;
import ta.c;
import ta.d;
import ta.e;
import ta.f;
import ta.g;
import ta.h;
import ta.i;
import ta.j;
import ta.k;
import ta.l;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0000\n\u0002\b;\b\u0087\b\u0018\u00002\u00020\u0001B\u00D1\u0002\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u0012\u0014\b\u0002\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000B\u001A\u00020\n\u0012\b\b\u0002\u0010\r\u001A\u00020\f\u0012\u000E\b\u0002\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000E\u0012\b\b\u0002\u0010\u0012\u001A\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u0015\u0012\u000E\b\u0002\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\b0\u0017\u0012\u000E\b\u0002\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\b0\u0017\u0012\u000E\b\u0002\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\b0\u0017\u0012\u0016\b\u0002\u0010\u001C\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001B\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000E\b\u0002\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\b0\u0017\u0012\u000E\b\u0002\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\b0\u0017\u0012\u000E\b\u0002\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\b0\u0017\u0012\u0014\b\u0002\u0010!\u001A\u000E\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\b0\u0007\u0012\u0014\b\u0002\u0010\"\u001A\u000E\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0014\b\u0002\u0010$\u001A\u000E\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0014\b\u0002\u0010&\u001A\u000E\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0\u0007\u00A2\u0006\u0004\b\'\u0010(J\u0017\u0010,\u001A\u00020+2\u0006\u0010*\u001A\u00020)H\u0016\u00A2\u0006\u0004\b,\u0010-J\u0010\u0010.\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b.\u0010/J\u0010\u00100\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b0\u00101J\u001C\u00102\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007H\u00C6\u0003\u00A2\u0006\u0004\b2\u00103J\u0010\u00104\u001A\u00020\nH\u00C6\u0003\u00A2\u0006\u0004\b4\u00105J\u0010\u00106\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\b6\u00107J\u0016\u00108\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000EH\u00C6\u0003\u00A2\u0006\u0004\b8\u00109J\u0010\u0010:\u001A\u00020\u0011H\u00C6\u0003\u00A2\u0006\u0004\b:\u0010;J\u0012\u0010<\u001A\u0004\u0018\u00010\u0013H\u00C6\u0003\u00A2\u0006\u0004\b<\u0010=J\u0012\u0010>\u001A\u0004\u0018\u00010\u0015H\u00C6\u0003\u00A2\u0006\u0004\b>\u0010?J\u0016\u0010@\u001A\b\u0012\u0004\u0012\u00020\b0\u0017H\u00C6\u0003\u00A2\u0006\u0004\b@\u0010AJ\u0016\u0010B\u001A\b\u0012\u0004\u0012\u00020\b0\u0017H\u00C6\u0003\u00A2\u0006\u0004\bB\u0010AJ\u0016\u0010C\u001A\b\u0012\u0004\u0012\u00020\b0\u0017H\u00C6\u0003\u00A2\u0006\u0004\bC\u0010AJ\u001E\u0010D\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001B\u0012\u0004\u0012\u00020\b0\u0007H\u00C6\u0003\u00A2\u0006\u0004\bD\u00103J\u0016\u0010E\u001A\b\u0012\u0004\u0012\u00020\b0\u0017H\u00C6\u0003\u00A2\u0006\u0004\bE\u0010AJ\u0016\u0010F\u001A\b\u0012\u0004\u0012\u00020\b0\u0017H\u00C6\u0003\u00A2\u0006\u0004\bF\u0010AJ\u0016\u0010G\u001A\b\u0012\u0004\u0012\u00020\b0\u0017H\u00C6\u0003\u00A2\u0006\u0004\bG\u0010AJ\u001C\u0010H\u001A\u000E\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\b0\u0007H\u00C6\u0003\u00A2\u0006\u0004\bH\u00103J\u001C\u0010I\u001A\u000E\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0007H\u00C6\u0003\u00A2\u0006\u0004\bI\u00103J\u001C\u0010J\u001A\u000E\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b0\u0007H\u00C6\u0003\u00A2\u0006\u0004\bJ\u00103J\u001C\u0010K\u001A\u000E\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0\u0007H\u00C6\u0003\u00A2\u0006\u0004\bK\u00103J\u00DA\u0002\u0010L\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\u0014\b\u0002\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\u000E\b\u0002\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000E2\b\b\u0002\u0010\u0012\u001A\u00020\u00112\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\u000E\b\u0002\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\b0\u00172\u000E\b\u0002\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\b0\u00172\u000E\b\u0002\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\b0\u00172\u0016\b\u0002\u0010\u001C\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001B\u0012\u0004\u0012\u00020\b0\u00072\u000E\b\u0002\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\b0\u00172\u000E\b\u0002\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\b0\u00172\u000E\b\u0002\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\b0\u00172\u0014\b\u0002\u0010!\u001A\u000E\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\"\u001A\u000E\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010$\u001A\u000E\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010&\u001A\u000E\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0\u0007H\u00C6\u0001\u00A2\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001A\u00020\fH\u00D6\u0001\u00A2\u0006\u0004\bN\u00107J\u0010\u0010O\u001A\u00020%H\u00D6\u0001\u00A2\u0006\u0004\bO\u0010PJ\u001A\u0010S\u001A\u00020\n2\b\u0010R\u001A\u0004\u0018\u00010QH\u00D6\u0003\u00A2\u0006\u0004\bS\u0010TR\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bU\u0010V\u001A\u0004\bW\u0010/R\u001A\u0010\u0006\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bX\u0010Y\u001A\u0004\bZ\u00101R#\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0006\u00A2\u0006\f\n\u0004\b[\u0010\\\u001A\u0004\b]\u00103R\u0017\u0010\u000B\u001A\u00020\n8\u0006\u00A2\u0006\f\n\u0004\b^\u0010_\u001A\u0004\b\u000B\u00105R\u0017\u0010\r\u001A\u00020\f8\u0006\u00A2\u0006\f\n\u0004\b`\u0010a\u001A\u0004\bb\u00107R\u001D\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000E8\u0006\u00A2\u0006\f\n\u0004\bc\u0010d\u001A\u0004\be\u00109R\u0017\u0010\u0012\u001A\u00020\u00118\u0006\u00A2\u0006\f\n\u0004\bf\u0010g\u001A\u0004\bh\u0010;R\u0019\u0010\u0014\u001A\u0004\u0018\u00010\u00138\u0006\u00A2\u0006\f\n\u0004\bi\u0010j\u001A\u0004\bk\u0010=R\u0019\u0010\u0016\u001A\u0004\u0018\u00010\u00158\u0006\u00A2\u0006\f\n\u0004\bl\u0010m\u001A\u0004\bn\u0010?R\u001D\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\b0\u00178\u0006\u00A2\u0006\f\n\u0004\bo\u0010p\u001A\u0004\bq\u0010AR\u001D\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\b0\u00178\u0006\u00A2\u0006\f\n\u0004\br\u0010p\u001A\u0004\bs\u0010AR\u001D\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\b0\u00178\u0006\u00A2\u0006\f\n\u0004\bt\u0010p\u001A\u0004\bu\u0010AR%\u0010\u001C\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001B\u0012\u0004\u0012\u00020\b0\u00078\u0006\u00A2\u0006\f\n\u0004\bv\u0010\\\u001A\u0004\bw\u00103R\u001D\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\b0\u00178\u0006\u00A2\u0006\f\n\u0004\bx\u0010p\u001A\u0004\by\u0010AR\u001D\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\b0\u00178\u0006\u00A2\u0006\f\n\u0004\bz\u0010p\u001A\u0004\b{\u0010AR\u001D\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\b0\u00178\u0006\u00A2\u0006\f\n\u0004\b|\u0010p\u001A\u0004\b}\u0010AR#\u0010!\u001A\u000E\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\b0\u00078\u0006\u00A2\u0006\f\n\u0004\b~\u0010\\\u001A\u0004\b\u007F\u00103R%\u0010\"\u001A\u000E\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u00078\u0006\u00A2\u0006\u000E\n\u0005\b\u0080\u0001\u0010\\\u001A\u0005\b\u0081\u0001\u00103R%\u0010$\u001A\u000E\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b0\u00078\u0006\u00A2\u0006\u000E\n\u0005\b\u0082\u0001\u0010\\\u001A\u0005\b\u0083\u0001\u00103R%\u0010&\u001A\u000E\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0\u00078\u0006\u00A2\u0006\u000E\n\u0005\b\u0084\u0001\u0010\\\u001A\u0005\b\u0085\u0001\u00103R\u001A\u0010\u0088\u0001\u001A\u00020\n8\u0006\u00A2\u0006\u000E\n\u0005\b\u0086\u0001\u0010_\u001A\u0005\b\u0087\u0001\u00105R\u0016\u0010\u008B\u0001\u001A\u0004\u0018\u00010#8F\u00A2\u0006\b\u001A\u0006\b\u0089\u0001\u0010\u008A\u0001\u00A8\u0006\u008C\u0001"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureUiState;", "Lcom/kakao/kandinsky/preview/PreviewUiState;", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "photo", "savedPhoto", "Landroidx/compose/ui/geometry/Rect;", "contentBounds", "Lkotlin/Function1;", "", "onChangedContentBounds", "", "isSingleImage", "", "defaultSignature", "", "Lcom/kakao/kandinsky/textedit/contract/FontData;", "fonts", "Lcom/kakao/kandinsky/signature/contract/SignatureState;", "state", "Lcom/kakao/kandinsky/core/kdphoto/Signature$Image;", "savedImageSignature", "Lcom/kakao/kandinsky/core/kdphoto/Signature$Text;", "savedTextSignature", "Lkotlin/Function0;", "onClickMenuText", "onClickMenuImage", "onClickMenuHistory", "Lcom/kakao/kandinsky/core/kdphoto/TextData;", "onConfirmTextEdit", "onClickCancel", "onClickConfirm", "onClickMultipleConfirm", "", "onChangeSignAlpha", "addSignImage", "Lcom/kakao/kandinsky/core/kdphoto/Signature;", "changeSign", "", "deleteHistory", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;ZLjava/lang/String;Ljava/util/List;Lcom/kakao/kandinsky/signature/contract/SignatureState;Lcom/kakao/kandinsky/core/kdphoto/Signature$Image;Lcom/kakao/kandinsky/core/kdphoto/Signature$Text;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/kakao/kandinsky/core/kdphoto/Decoration;", "decoration", "Lcom/kakao/kandinsky/decoration/DecorationStatus;", "getDecorationStatus", "(Lcom/kakao/kandinsky/core/kdphoto/Decoration;)Lcom/kakao/kandinsky/decoration/DecorationStatus;", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "component3", "()Landroidx/compose/ui/geometry/Rect;", "component4", "()Lkotlin/jvm/functions/Function1;", "component5", "()Z", "component6", "()Ljava/lang/String;", "component7", "()Ljava/util/List;", "component8", "()Lcom/kakao/kandinsky/signature/contract/SignatureState;", "component9", "()Lcom/kakao/kandinsky/core/kdphoto/Signature$Image;", "component10", "()Lcom/kakao/kandinsky/core/kdphoto/Signature$Text;", "component11", "()Lkotlin/jvm/functions/Function0;", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;ZLjava/lang/String;Ljava/util/List;Lcom/kakao/kandinsky/signature/contract/SignatureState;Lcom/kakao/kandinsky/core/kdphoto/Signature$Image;Lcom/kakao/kandinsky/core/kdphoto/Signature$Text;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kakao/kandinsky/signature/contract/SignatureUiState;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "s", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "getPhoto", "u", "Landroidx/compose/ui/geometry/Rect;", "getContentBounds", "v", "Lkotlin/jvm/functions/Function1;", "getOnChangedContentBounds", "w", "Z", "x", "Ljava/lang/String;", "getDefaultSignature", "y", "Ljava/util/List;", "getFonts", "z", "Lcom/kakao/kandinsky/signature/contract/SignatureState;", "getState", "A", "Lcom/kakao/kandinsky/core/kdphoto/Signature$Image;", "getSavedImageSignature", "B", "Lcom/kakao/kandinsky/core/kdphoto/Signature$Text;", "getSavedTextSignature", "C", "Lkotlin/jvm/functions/Function0;", "getOnClickMenuText", "D", "getOnClickMenuImage", "E", "getOnClickMenuHistory", "F", "getOnConfirmTextEdit", "G", "getOnClickCancel", "H", "getOnClickConfirm", "I", "getOnClickMultipleConfirm", "J", "getOnChangeSignAlpha", "K", "getAddSignImage", "L", "getChangeSign", "M", "getDeleteHistory", "N", "getChanged", "changed", "getSelectedSignature", "()Lcom/kakao/kandinsky/core/kdphoto/Signature;", "selectedSignature", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SignatureUiState extends PreviewUiState {
    public static final int $stable = 8;
    public final Image A;
    public final Text B;
    public final Function0 C;
    public final Function0 D;
    public final Function0 E;
    public final Function1 F;
    public final Function0 G;
    public final Function0 H;
    public final Function0 I;
    public final Function1 J;
    public final Function1 K;
    public final Function1 L;
    public final Function1 M;
    public final boolean N;
    public final KDPhoto s;
    public final KDPhoto t;
    public final Rect u;
    public final Function1 v;
    public final boolean w;
    public final String x;
    public final List y;
    public final SignatureState z;

    public SignatureUiState() {
        this(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFFFF, null);
    }

    public SignatureUiState(@NotNull KDPhoto kDPhoto0, @NotNull KDPhoto kDPhoto1, @NotNull Rect rect0, @NotNull Function1 function10, boolean z, @NotNull String s, @NotNull List list0, @NotNull SignatureState signatureState0, @Nullable Image signature$Image0, @Nullable Text signature$Text0, @NotNull Function0 function00, @NotNull Function0 function01, @NotNull Function0 function02, @NotNull Function1 function11, @NotNull Function0 function03, @NotNull Function0 function04, @NotNull Function0 function05, @NotNull Function1 function12, @NotNull Function1 function13, @NotNull Function1 function14, @NotNull Function1 function15) {
        Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
        Intrinsics.checkNotNullParameter(kDPhoto1, "savedPhoto");
        Intrinsics.checkNotNullParameter(rect0, "contentBounds");
        Intrinsics.checkNotNullParameter(function10, "onChangedContentBounds");
        Intrinsics.checkNotNullParameter(s, "defaultSignature");
        Intrinsics.checkNotNullParameter(list0, "fonts");
        Intrinsics.checkNotNullParameter(signatureState0, "state");
        Intrinsics.checkNotNullParameter(function00, "onClickMenuText");
        Intrinsics.checkNotNullParameter(function01, "onClickMenuImage");
        Intrinsics.checkNotNullParameter(function02, "onClickMenuHistory");
        Intrinsics.checkNotNullParameter(function11, "onConfirmTextEdit");
        Intrinsics.checkNotNullParameter(function03, "onClickCancel");
        Intrinsics.checkNotNullParameter(function04, "onClickConfirm");
        Intrinsics.checkNotNullParameter(function05, "onClickMultipleConfirm");
        Intrinsics.checkNotNullParameter(function12, "onChangeSignAlpha");
        Intrinsics.checkNotNullParameter(function13, "addSignImage");
        Intrinsics.checkNotNullParameter(function14, "changeSign");
        Intrinsics.checkNotNullParameter(function15, "deleteHistory");
        super();
        this.s = kDPhoto0;
        this.t = kDPhoto1;
        this.u = rect0;
        this.v = function10;
        this.w = z;
        this.x = s;
        this.y = list0;
        this.z = signatureState0;
        this.A = signature$Image0;
        this.B = signature$Text0;
        this.C = function00;
        this.D = function01;
        this.E = function02;
        this.F = function11;
        this.G = function03;
        this.H = function04;
        this.I = function05;
        this.J = function12;
        this.K = function13;
        this.L = function14;
        this.M = function15;
        boolean z1 = true;
        boolean z2 = false;
        if((Intrinsics.areEqual(signatureState0, com.kakao.kandinsky.signature.contract.SignatureState.Text.INSTANCE) ? true : signatureState0 instanceof TextEditor)) {
            z2 = true;
            if(!Intrinsics.areEqual(kDPhoto1.getSignature(), signature$Text0)) {
            }
        }
        else if(Intrinsics.areEqual(signatureState0, com.kakao.kandinsky.signature.contract.SignatureState.Image.INSTANCE)) {
            z2 = true;
            if(!Intrinsics.areEqual(kDPhoto1.getSignature(), signature$Image0)) {
            }
        }
        else if(z2) {
            z1 = false;
        }
        else if(!Intrinsics.areEqual(signatureState0, None.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        else if(kDPhoto1.getSignature() == null) {
            z1 = false;
        }
        this.N = z1;
    }

    public SignatureUiState(KDPhoto kDPhoto0, KDPhoto kDPhoto1, Rect rect0, Function1 function10, boolean z, String s, List list0, SignatureState signatureState0, Image signature$Image0, Text signature$Text0, Function0 function00, Function0 function01, Function0 function02, Function1 function11, Function0 function03, Function0 function04, Function0 function05, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        KDPhoto kDPhoto2 = (v & 1) == 0 ? kDPhoto0 : KDPhoto.Companion.getEmpty();
        KDPhoto kDPhoto3 = (v & 2) == 0 ? kDPhoto1 : KDPhoto.Companion.getEmpty();
        Rect rect1 = (v & 4) == 0 ? rect0 : Rect.Companion.getZero();
        Function1 function16 = (v & 8) == 0 ? function10 : d.w;
        List list1 = (v & 0x40) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList();
        SignatureState signatureState1 = (v & 0x80) == 0 ? signatureState0 : None.INSTANCE;
        Function0 function06 = (v & 0x400) == 0 ? function00 : e.w;
        Function0 function07 = (v & 0x800) == 0 ? function01 : f.w;
        Function0 function08 = (v & 0x1000) == 0 ? function02 : g.w;
        Function1 function17 = (v & 0x2000) == 0 ? function11 : h.w;
        Function0 function09 = (v & 0x4000) == 0 ? function03 : i.w;
        Function0 function010 = (v & 0x8000) == 0 ? function04 : j.w;
        Function0 function011 = (v & 0x10000) == 0 ? function05 : k.w;
        Function1 function18 = (v & 0x20000) == 0 ? function12 : l.w;
        Function1 function19 = (v & 0x40000) == 0 ? function13 : a.w;
        Function1 function110 = (v & 0x80000) == 0 ? function14 : b.w;
        Function1 function111 = (v & 0x100000) == 0 ? function15 : c.w;
        this(kDPhoto2, kDPhoto3, rect1, function16, ((v & 16) == 0 ? z : true), ((v & 0x20) == 0 ? s : ""), list1, signatureState1, ((v & 0x100) == 0 ? signature$Image0 : null), ((v & 0x200) == 0 ? signature$Text0 : null), function06, function07, function08, function17, function09, function010, function011, function18, function19, function110, function111);
    }

    @NotNull
    public final KDPhoto component1() {
        return this.s;
    }

    @Nullable
    public final Text component10() {
        return this.B;
    }

    @NotNull
    public final Function0 component11() {
        return this.C;
    }

    @NotNull
    public final Function0 component12() {
        return this.D;
    }

    @NotNull
    public final Function0 component13() {
        return this.E;
    }

    @NotNull
    public final Function1 component14() {
        return this.F;
    }

    @NotNull
    public final Function0 component15() {
        return this.G;
    }

    @NotNull
    public final Function0 component16() {
        return this.H;
    }

    @NotNull
    public final Function0 component17() {
        return this.I;
    }

    @NotNull
    public final Function1 component18() {
        return this.J;
    }

    @NotNull
    public final Function1 component19() {
        return this.K;
    }

    @NotNull
    public final Function1 component20() {
        return this.L;
    }

    @NotNull
    public final Function1 component21() {
        return this.M;
    }

    @NotNull
    public final Rect component3() {
        return this.u;
    }

    @NotNull
    public final Function1 component4() {
        return this.v;
    }

    public final boolean component5() {
        return this.w;
    }

    @NotNull
    public final String component6() {
        return this.x;
    }

    @NotNull
    public final List component7() {
        return this.y;
    }

    @NotNull
    public final SignatureState component8() {
        return this.z;
    }

    @Nullable
    public final Image component9() {
        return this.A;
    }

    @NotNull
    public final SignatureUiState copy(@NotNull KDPhoto kDPhoto0, @NotNull KDPhoto kDPhoto1, @NotNull Rect rect0, @NotNull Function1 function10, boolean z, @NotNull String s, @NotNull List list0, @NotNull SignatureState signatureState0, @Nullable Image signature$Image0, @Nullable Text signature$Text0, @NotNull Function0 function00, @NotNull Function0 function01, @NotNull Function0 function02, @NotNull Function1 function11, @NotNull Function0 function03, @NotNull Function0 function04, @NotNull Function0 function05, @NotNull Function1 function12, @NotNull Function1 function13, @NotNull Function1 function14, @NotNull Function1 function15) {
        Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
        Intrinsics.checkNotNullParameter(kDPhoto1, "savedPhoto");
        Intrinsics.checkNotNullParameter(rect0, "contentBounds");
        Intrinsics.checkNotNullParameter(function10, "onChangedContentBounds");
        Intrinsics.checkNotNullParameter(s, "defaultSignature");
        Intrinsics.checkNotNullParameter(list0, "fonts");
        Intrinsics.checkNotNullParameter(signatureState0, "state");
        Intrinsics.checkNotNullParameter(function00, "onClickMenuText");
        Intrinsics.checkNotNullParameter(function01, "onClickMenuImage");
        Intrinsics.checkNotNullParameter(function02, "onClickMenuHistory");
        Intrinsics.checkNotNullParameter(function11, "onConfirmTextEdit");
        Intrinsics.checkNotNullParameter(function03, "onClickCancel");
        Intrinsics.checkNotNullParameter(function04, "onClickConfirm");
        Intrinsics.checkNotNullParameter(function05, "onClickMultipleConfirm");
        Intrinsics.checkNotNullParameter(function12, "onChangeSignAlpha");
        Intrinsics.checkNotNullParameter(function13, "addSignImage");
        Intrinsics.checkNotNullParameter(function14, "changeSign");
        Intrinsics.checkNotNullParameter(function15, "deleteHistory");
        return new SignatureUiState(kDPhoto0, kDPhoto1, rect0, function10, z, s, list0, signatureState0, signature$Image0, signature$Text0, function00, function01, function02, function11, function03, function04, function05, function12, function13, function14, function15);
    }

    public static SignatureUiState copy$default(SignatureUiState signatureUiState0, KDPhoto kDPhoto0, KDPhoto kDPhoto1, Rect rect0, Function1 function10, boolean z, String s, List list0, SignatureState signatureState0, Image signature$Image0, Text signature$Text0, Function0 function00, Function0 function01, Function0 function02, Function1 function11, Function0 function03, Function0 function04, Function0 function05, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int v, Object object0) {
        KDPhoto kDPhoto2 = (v & 1) == 0 ? kDPhoto0 : signatureUiState0.s;
        KDPhoto kDPhoto3 = (v & 2) == 0 ? kDPhoto1 : signatureUiState0.t;
        Rect rect1 = (v & 4) == 0 ? rect0 : signatureUiState0.u;
        Function1 function16 = (v & 8) == 0 ? function10 : signatureUiState0.v;
        boolean z1 = (v & 16) == 0 ? z : signatureUiState0.w;
        String s1 = (v & 0x20) == 0 ? s : signatureUiState0.x;
        List list1 = (v & 0x40) == 0 ? list0 : signatureUiState0.y;
        SignatureState signatureState1 = (v & 0x80) == 0 ? signatureState0 : signatureUiState0.z;
        Image signature$Image1 = (v & 0x100) == 0 ? signature$Image0 : signatureUiState0.A;
        Text signature$Text1 = (v & 0x200) == 0 ? signature$Text0 : signatureUiState0.B;
        Function0 function06 = (v & 0x400) == 0 ? function00 : signatureUiState0.C;
        Function0 function07 = (v & 0x800) == 0 ? function01 : signatureUiState0.D;
        Function0 function08 = (v & 0x1000) == 0 ? function02 : signatureUiState0.E;
        Function1 function17 = (v & 0x2000) == 0 ? function11 : signatureUiState0.F;
        Function0 function09 = (v & 0x4000) == 0 ? function03 : signatureUiState0.G;
        Function0 function010 = (v & 0x8000) == 0 ? function04 : signatureUiState0.H;
        Function0 function011 = (v & 0x10000) == 0 ? function05 : signatureUiState0.I;
        Function1 function18 = (v & 0x20000) == 0 ? function12 : signatureUiState0.J;
        Function1 function19 = (v & 0x40000) == 0 ? function13 : signatureUiState0.K;
        Function1 function110 = (v & 0x80000) == 0 ? function14 : signatureUiState0.L;
        return (v & 0x100000) == 0 ? signatureUiState0.copy(kDPhoto2, kDPhoto3, rect1, function16, z1, s1, list1, signatureState1, signature$Image1, signature$Text1, function06, function07, function08, function17, function09, function010, function011, function18, function19, function110, function15) : signatureUiState0.copy(kDPhoto2, kDPhoto3, rect1, function16, z1, s1, list1, signatureState1, signature$Image1, signature$Text1, function06, function07, function08, function17, function09, function010, function011, function18, function19, function110, signatureUiState0.M);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SignatureUiState)) {
            return false;
        }
        SignatureUiState signatureUiState0 = (SignatureUiState)object0;
        if(!Intrinsics.areEqual(this.s, signatureUiState0.s)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.t, signatureUiState0.t)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.u, signatureUiState0.u)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.v, signatureUiState0.v)) {
            return false;
        }
        if(this.w != signatureUiState0.w) {
            return false;
        }
        if(!Intrinsics.areEqual(this.x, signatureUiState0.x)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.y, signatureUiState0.y)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.z, signatureUiState0.z)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.A, signatureUiState0.A)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.B, signatureUiState0.B)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.C, signatureUiState0.C)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.D, signatureUiState0.D)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.E, signatureUiState0.E)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.F, signatureUiState0.F)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.G, signatureUiState0.G)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.H, signatureUiState0.H)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.I, signatureUiState0.I)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.J, signatureUiState0.J)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.K, signatureUiState0.K)) {
            return false;
        }
        return Intrinsics.areEqual(this.L, signatureUiState0.L) ? Intrinsics.areEqual(this.M, signatureUiState0.M) : false;
    }

    @NotNull
    public final Function1 getAddSignImage() {
        return this.K;
    }

    @NotNull
    public final Function1 getChangeSign() {
        return this.L;
    }

    public final boolean getChanged() {
        return this.N;
    }

    @Override  // com.kakao.kandinsky.preview.PreviewUiState
    @NotNull
    public Rect getContentBounds() {
        return this.u;
    }

    @Override  // com.kakao.kandinsky.preview.PreviewUiState
    @NotNull
    public DecorationStatus getDecorationStatus(@NotNull Decoration decoration0) {
        Intrinsics.checkNotNullParameter(decoration0, "decoration");
        if(decoration0 instanceof Text && (((Text)decoration0).getWatermark() || this.z instanceof TextEditor)) {
            return DecorationStatus.OnlyView;
        }
        return decoration0 instanceof Signature ? DecorationStatus.Selected : DecorationStatus.Disabled;
    }

    @NotNull
    public final String getDefaultSignature() {
        return this.x;
    }

    @NotNull
    public final Function1 getDeleteHistory() {
        return this.M;
    }

    @NotNull
    public final List getFonts() {
        return this.y;
    }

    @NotNull
    public final Function1 getOnChangeSignAlpha() {
        return this.J;
    }

    @NotNull
    public final Function1 getOnChangedContentBounds() {
        return this.v;
    }

    @NotNull
    public final Function0 getOnClickCancel() {
        return this.G;
    }

    @NotNull
    public final Function0 getOnClickConfirm() {
        return this.H;
    }

    @NotNull
    public final Function0 getOnClickMenuHistory() {
        return this.E;
    }

    @NotNull
    public final Function0 getOnClickMenuImage() {
        return this.D;
    }

    @NotNull
    public final Function0 getOnClickMenuText() {
        return this.C;
    }

    @NotNull
    public final Function0 getOnClickMultipleConfirm() {
        return this.I;
    }

    @NotNull
    public final Function1 getOnConfirmTextEdit() {
        return this.F;
    }

    @Override  // com.kakao.kandinsky.preview.PreviewUiState
    @NotNull
    public KDPhoto getPhoto() {
        return this.s;
    }

    @Nullable
    public final Image getSavedImageSignature() {
        return this.A;
    }

    @Nullable
    public final Text getSavedTextSignature() {
        return this.B;
    }

    @Nullable
    public final Signature getSelectedSignature() {
        SignatureState signatureState0 = this.z;
        if((signatureState0 instanceof com.kakao.kandinsky.signature.contract.SignatureState.Text ? true : signatureState0 instanceof TextEditor)) {
            return this.B;
        }
        return signatureState0 instanceof com.kakao.kandinsky.signature.contract.SignatureState.Image ? this.A : null;
    }

    @NotNull
    public final SignatureState getState() {
        return this.z;
    }

    @Override
    public int hashCode() {
        int v = a5.b.c(this.y, q.c(r0.a.e(r0.a.d((this.u.hashCode() + (this.t.hashCode() + this.s.hashCode() * 0x1F) * 0x1F) * 0x1F, 0x1F, this.v), 0x1F, this.w), 0x1F, this.x), 0x1F);
        int v1 = this.z.hashCode();
        int v2 = 0;
        int v3 = this.A == null ? 0 : this.A.hashCode();
        Text signature$Text0 = this.B;
        if(signature$Text0 != null) {
            v2 = signature$Text0.hashCode();
        }
        return this.M.hashCode() + r0.a.d(r0.a.d(r0.a.d(r0.a.g(this.I, r0.a.g(this.H, r0.a.g(this.G, r0.a.d(r0.a.g(this.E, r0.a.g(this.D, r0.a.g(this.C, (((v1 + v) * 0x1F + v3) * 0x1F + v2) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F, this.F), 0x1F), 0x1F), 0x1F), 0x1F, this.J), 0x1F, this.K), 0x1F, this.L);
    }

    public final boolean isSingleImage() {
        return this.w;
    }

    @Override
    @NotNull
    public String toString() {
        return "SignatureUiState(photo=" + this.s + ", savedPhoto=" + this.t + ", contentBounds=" + this.u + ", onChangedContentBounds=" + this.v + ", isSingleImage=" + this.w + ", defaultSignature=" + this.x + ", fonts=" + this.y + ", state=" + this.z + ", savedImageSignature=" + this.A + ", savedTextSignature=" + this.B + ", onClickMenuText=" + this.C + ", onClickMenuImage=" + this.D + ", onClickMenuHistory=" + this.E + ", onConfirmTextEdit=" + this.F + ", onClickCancel=" + this.G + ", onClickConfirm=" + this.H + ", onClickMultipleConfirm=" + this.I + ", onChangeSignAlpha=" + this.J + ", addSignImage=" + this.K + ", changeSign=" + this.L + ", deleteHistory=" + this.M + ")";
    }
}

