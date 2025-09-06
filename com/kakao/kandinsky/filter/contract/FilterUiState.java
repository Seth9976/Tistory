package com.kakao.kandinsky.filter.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.core.kdphoto.Effect;
import com.kakao.kandinsky.core.kdphoto.Filter;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.preview.PreviewUiState;
import fa.a;
import fa.b;
import fa.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b]\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u00EE\u0002\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007\u0012\u000E\b\u0002\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0014\b\u0002\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000E0\f\u0012\b\b\u0002\u0010\u0011\u001A\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001A\u00020\u0012\u0012_\b\u0002\u0010\u001E\u001AY\b\u0001\u0012\u0013\u0012\u00110\r\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001A\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001C0\u001B\u0012\u0006\u0012\u0004\u0018\u00010\u001D0\u0014\u0012\u0014\b\u0002\u0010!\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020 0\u001F\u0012\u0014\b\u0002\u0010\"\u001A\u000E\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020 0\u001F\u0012\u0014\b\u0002\u0010#\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0\u001F\u0012\u0014\b\u0002\u0010$\u001A\u000E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020 0\u001F\u0012\u0014\b\u0002\u0010%\u001A\u000E\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020 0\u001F\u0012\u000E\b\u0002\u0010\'\u001A\b\u0012\u0004\u0012\u00020 0&\u0012\u0014\b\u0002\u0010(\u001A\u000E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020 0\u001F\u0012\u000E\b\u0002\u0010)\u001A\b\u0012\u0004\u0012\u00020 0&\u00A2\u0006\u0004\b*\u0010+J\r\u0010,\u001A\u00020\u000E\u00A2\u0006\u0004\b,\u0010-J\u0010\u0010.\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b.\u0010/J\u0010\u00100\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b0\u00101J\u0010\u00102\u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b2\u00103J\u0016\u00104\u001A\b\u0012\u0004\u0012\u00020\n0\tH\u00C6\u0003\u00A2\u0006\u0004\b4\u00105J\u001C\u00106\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000E0\fH\u00C6\u0003\u00A2\u0006\u0004\b6\u00107J\u0010\u00108\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0004\b8\u00109J\u0010\u0010:\u001A\u00020\u0012H\u00C6\u0003\u00A2\u0006\u0004\b:\u0010;Jg\u0010<\u001AY\b\u0001\u0012\u0013\u0012\u00110\r\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001A\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001C0\u001B\u0012\u0006\u0012\u0004\u0018\u00010\u001D0\u0014H\u00C6\u0003\u00A2\u0006\u0004\b<\u0010=J\u001C\u0010>\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020 0\u001FH\u00C6\u0003\u00A2\u0006\u0004\b>\u0010?J\u001C\u0010@\u001A\u000E\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020 0\u001FH\u00C6\u0003\u00A2\u0006\u0004\b@\u0010?J\u001C\u0010A\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0\u001FH\u00C6\u0003\u00A2\u0006\u0004\bA\u0010?J\u001C\u0010B\u001A\u000E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020 0\u001FH\u00C6\u0003\u00A2\u0006\u0004\bB\u0010?J\u001C\u0010C\u001A\u000E\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020 0\u001FH\u00C6\u0003\u00A2\u0006\u0004\bC\u0010?J\u0016\u0010D\u001A\b\u0012\u0004\u0012\u00020 0&H\u00C6\u0003\u00A2\u0006\u0004\bD\u0010EJ\u001C\u0010F\u001A\u000E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020 0\u001FH\u00C6\u0003\u00A2\u0006\u0004\bF\u0010?J\u0016\u0010G\u001A\b\u0012\u0004\u0012\u00020 0&H\u00C6\u0003\u00A2\u0006\u0004\bG\u0010EJ\u00F7\u0002\u0010H\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\u000E\b\u0002\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t2\u0014\b\u0002\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000E0\f2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0013\u001A\u00020\u00122_\b\u0002\u0010\u001E\u001AY\b\u0001\u0012\u0013\u0012\u00110\r\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001A\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001C0\u001B\u0012\u0006\u0012\u0004\u0018\u00010\u001D0\u00142\u0014\b\u0002\u0010!\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020 0\u001F2\u0014\b\u0002\u0010\"\u001A\u000E\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020 0\u001F2\u0014\b\u0002\u0010#\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0\u001F2\u0014\b\u0002\u0010$\u001A\u000E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020 0\u001F2\u0014\b\u0002\u0010%\u001A\u000E\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020 0\u001F2\u000E\b\u0002\u0010\'\u001A\b\u0012\u0004\u0012\u00020 0&2\u0014\b\u0002\u0010(\u001A\u000E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020 0\u001F2\u000E\b\u0002\u0010)\u001A\b\u0012\u0004\u0012\u00020 0&H\u00C6\u0001\u00A2\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001A\u00020\rH\u00D6\u0001\u00A2\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001A\u00020\u0019H\u00D6\u0001\u00A2\u0006\u0004\bL\u0010MJ\u001A\u0010O\u001A\u00020\u00072\b\u0010N\u001A\u0004\u0018\u00010\u001DH\u00D6\u0003\u00A2\u0006\u0004\bO\u0010PR\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bQ\u0010R\u001A\u0004\bS\u0010/R\u001A\u0010\u0006\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bT\u0010U\u001A\u0004\bV\u00101R\u0017\u0010\b\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\bW\u0010X\u001A\u0004\b\b\u00103R\u001D\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t8\u0006\u00A2\u0006\f\n\u0004\bY\u0010Z\u001A\u0004\b[\u00105R#\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000E0\f8\u0006\u00A2\u0006\f\n\u0004\b\\\u0010]\u001A\u0004\b^\u00107R\u0017\u0010\u0011\u001A\u00020\u00108\u0006\u00A2\u0006\f\n\u0004\b_\u0010`\u001A\u0004\ba\u00109R\u0017\u0010\u0013\u001A\u00020\u00128\u0006\u00A2\u0006\f\n\u0004\bb\u0010c\u001A\u0004\bd\u0010;Rn\u0010\u001E\u001AY\b\u0001\u0012\u0013\u0012\u00110\r\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001A\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001C0\u001B\u0012\u0006\u0012\u0004\u0018\u00010\u001D0\u00148\u0006\u00A2\u0006\f\n\u0004\be\u0010f\u001A\u0004\bg\u0010=R#\u0010!\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020 0\u001F8\u0006\u00A2\u0006\f\n\u0004\bh\u0010i\u001A\u0004\bj\u0010?R#\u0010\"\u001A\u000E\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020 0\u001F8\u0006\u00A2\u0006\f\n\u0004\bk\u0010i\u001A\u0004\bl\u0010?R#\u0010#\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0\u001F8\u0006\u00A2\u0006\f\n\u0004\bm\u0010i\u001A\u0004\bn\u0010?R#\u0010$\u001A\u000E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020 0\u001F8\u0006\u00A2\u0006\f\n\u0004\bo\u0010i\u001A\u0004\bp\u0010?R#\u0010%\u001A\u000E\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020 0\u001F8\u0006\u00A2\u0006\f\n\u0004\bq\u0010i\u001A\u0004\br\u0010?R\u001D\u0010\'\u001A\b\u0012\u0004\u0012\u00020 0&8\u0006\u00A2\u0006\f\n\u0004\bs\u0010t\u001A\u0004\bu\u0010ER#\u0010(\u001A\u000E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020 0\u001F8\u0006\u00A2\u0006\f\n\u0004\bv\u0010i\u001A\u0004\bw\u0010?R\u001D\u0010)\u001A\b\u0012\u0004\u0012\u00020 0&8\u0006\u00A2\u0006\f\n\u0004\bx\u0010t\u001A\u0004\by\u0010ER\u0017\u0010|\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\bz\u0010X\u001A\u0004\b{\u00103R\u0018\u0010\u0018\u001A\u00020\n8\u0006\u00A2\u0006\r\n\u0004\b}\u0010~\u001A\u0005\b\u007F\u0010\u0080\u0001R\u001A\u0010\u0083\u0001\u001A\u00020\u000E8\u0006\u00A2\u0006\u000E\n\u0005\b\u0081\u0001\u0010q\u001A\u0005\b\u0082\u0001\u0010-R\u001D\u0010\u0089\u0001\u001A\u00030\u0084\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001A\u0006\b\u0087\u0001\u0010\u0088\u0001\u00A8\u0006\u008A\u0001"}, d2 = {"Lcom/kakao/kandinsky/filter/contract/FilterUiState;", "Lcom/kakao/kandinsky/preview/PreviewUiState;", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "photo", "savedPhoto", "Landroidx/compose/ui/geometry/Rect;", "contentBounds", "", "isSingleImage", "", "Lcom/kakao/kandinsky/core/kdphoto/Filter;", "filterList", "", "", "", "filterIntensityMap", "Lcom/kakao/kandinsky/filter/contract/FeatureMenu;", "featureMenu", "Lcom/kakao/kandinsky/filter/contract/EffectMenu;", "effectMenu", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "imageUri", "filter", "", "size", "Lkotlin/coroutines/Continuation;", "Landroid/graphics/Bitmap;", "", "getThumbnail", "Lkotlin/Function1;", "", "updatePreviewBounds", "onClickFeatureMenu", "onClickFilter", "changeFilterIntensity", "onClickEffectMenu", "Lkotlin/Function0;", "onClickReset", "changeEffectValue", "onClickCancel", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Landroidx/compose/ui/geometry/Rect;ZLjava/util/List;Ljava/util/Map;Lcom/kakao/kandinsky/filter/contract/FeatureMenu;Lcom/kakao/kandinsky/filter/contract/EffectMenu;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "getEffectValue", "()F", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "component3", "()Landroidx/compose/ui/geometry/Rect;", "component4", "()Z", "component5", "()Ljava/util/List;", "component6", "()Ljava/util/Map;", "component7", "()Lcom/kakao/kandinsky/filter/contract/FeatureMenu;", "component8", "()Lcom/kakao/kandinsky/filter/contract/EffectMenu;", "component9", "()Lkotlin/jvm/functions/Function4;", "component10", "()Lkotlin/jvm/functions/Function1;", "component11", "component12", "component13", "component14", "component15", "()Lkotlin/jvm/functions/Function0;", "component16", "component17", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Landroidx/compose/ui/geometry/Rect;ZLjava/util/List;Ljava/util/Map;Lcom/kakao/kandinsky/filter/contract/FeatureMenu;Lcom/kakao/kandinsky/filter/contract/EffectMenu;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lcom/kakao/kandinsky/filter/contract/FilterUiState;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "s", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "getPhoto", "u", "Landroidx/compose/ui/geometry/Rect;", "getContentBounds", "v", "Z", "w", "Ljava/util/List;", "getFilterList", "x", "Ljava/util/Map;", "getFilterIntensityMap", "y", "Lcom/kakao/kandinsky/filter/contract/FeatureMenu;", "getFeatureMenu", "z", "Lcom/kakao/kandinsky/filter/contract/EffectMenu;", "getEffectMenu", "A", "Lkotlin/jvm/functions/Function4;", "getGetThumbnail", "B", "Lkotlin/jvm/functions/Function1;", "getUpdatePreviewBounds", "C", "getOnClickFeatureMenu", "D", "getOnClickFilter", "E", "getChangeFilterIntensity", "F", "getOnClickEffectMenu", "G", "Lkotlin/jvm/functions/Function0;", "getOnClickReset", "H", "getChangeEffectValue", "I", "getOnClickCancel", "J", "getChanged", "changed", "K", "Lcom/kakao/kandinsky/core/kdphoto/Filter;", "getFilter", "()Lcom/kakao/kandinsky/core/kdphoto/Filter;", "L", "getFilterIntensity", "filterIntensity", "Lcom/kakao/kandinsky/core/kdphoto/Effect;", "M", "Lcom/kakao/kandinsky/core/kdphoto/Effect;", "getEffect", "()Lcom/kakao/kandinsky/core/kdphoto/Effect;", "effect", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FilterUiState extends PreviewUiState {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[EffectMenu.values().length];
            try {
                arr_v[EffectMenu.Brightness.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[EffectMenu.Contrast.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[EffectMenu.Saturation.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[EffectMenu.Temperature.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[EffectMenu.Vignette.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 8;
    public final Function4 A;
    public final Function1 B;
    public final Function1 C;
    public final Function1 D;
    public final Function1 E;
    public final Function1 F;
    public final Function0 G;
    public final Function1 H;
    public final Function0 I;
    public final boolean J;
    public final Filter K;
    public final float L;
    public final Effect M;
    public final KDPhoto s;
    public final KDPhoto t;
    public final Rect u;
    public final boolean v;
    public final List w;
    public final Map x;
    public final FeatureMenu y;
    public final EffectMenu z;

    public FilterUiState() {
        this(null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFFF, null);
    }

    public FilterUiState(@NotNull KDPhoto kDPhoto0, @NotNull KDPhoto kDPhoto1, @NotNull Rect rect0, boolean z, @NotNull List list0, @NotNull Map map0, @NotNull FeatureMenu featureMenu0, @NotNull EffectMenu effectMenu0, @NotNull Function4 function40, @NotNull Function1 function10, @NotNull Function1 function11, @NotNull Function1 function12, @NotNull Function1 function13, @NotNull Function1 function14, @NotNull Function0 function00, @NotNull Function1 function15, @NotNull Function0 function01) {
        Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
        Intrinsics.checkNotNullParameter(kDPhoto1, "savedPhoto");
        Intrinsics.checkNotNullParameter(rect0, "contentBounds");
        Intrinsics.checkNotNullParameter(list0, "filterList");
        Intrinsics.checkNotNullParameter(map0, "filterIntensityMap");
        Intrinsics.checkNotNullParameter(featureMenu0, "featureMenu");
        Intrinsics.checkNotNullParameter(effectMenu0, "effectMenu");
        Intrinsics.checkNotNullParameter(function40, "getThumbnail");
        Intrinsics.checkNotNullParameter(function10, "updatePreviewBounds");
        Intrinsics.checkNotNullParameter(function11, "onClickFeatureMenu");
        Intrinsics.checkNotNullParameter(function12, "onClickFilter");
        Intrinsics.checkNotNullParameter(function13, "changeFilterIntensity");
        Intrinsics.checkNotNullParameter(function14, "onClickEffectMenu");
        Intrinsics.checkNotNullParameter(function00, "onClickReset");
        Intrinsics.checkNotNullParameter(function15, "changeEffectValue");
        Intrinsics.checkNotNullParameter(function01, "onClickCancel");
        super();
        this.s = kDPhoto0;
        this.t = kDPhoto1;
        this.u = rect0;
        this.v = z;
        this.w = list0;
        this.x = map0;
        this.y = featureMenu0;
        this.z = effectMenu0;
        this.A = function40;
        this.B = function10;
        this.C = function11;
        this.D = function12;
        this.E = function13;
        this.F = function14;
        this.G = function00;
        this.H = function15;
        this.I = function01;
        this.J = !Intrinsics.areEqual(this.getPhoto(), kDPhoto1);
        this.K = this.getPhoto().getFilter();
        this.L = this.getPhoto().getFilterIntensity();
        this.M = this.getPhoto().getEffect();
    }

    public FilterUiState(KDPhoto kDPhoto0, KDPhoto kDPhoto1, Rect rect0, boolean z, List list0, Map map0, FeatureMenu featureMenu0, EffectMenu effectMenu0, Function4 function40, Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function1 function14, Function0 function00, Function1 function15, Function0 function01, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        KDPhoto kDPhoto2 = (v & 1) == 0 ? kDPhoto0 : KDPhoto.Companion.getEmpty();
        KDPhoto kDPhoto3 = (v & 2) == 0 ? kDPhoto1 : KDPhoto.Companion.getEmpty();
        Rect rect1 = (v & 4) == 0 ? rect0 : Rect.Companion.getZero();
        List list1 = (v & 16) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList();
        Map map1 = (v & 0x20) == 0 ? map0 : x.emptyMap();
        FeatureMenu featureMenu1 = (v & 0x40) == 0 ? featureMenu0 : FeatureMenu.Filter;
        EffectMenu effectMenu1 = (v & 0x80) == 0 ? effectMenu0 : EffectMenu.Brightness;
        Function4 function41 = (v & 0x100) == 0 ? function40 : new a(4, null);  // 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
        Function1 function16 = (v & 0x200) == 0 ? function10 : b.x;
        Function1 function17 = (v & 0x400) == 0 ? function11 : b.y;
        Function1 function18 = (v & 0x800) == 0 ? function12 : b.z;
        Function1 function19 = (v & 0x1000) == 0 ? function13 : b.A;
        Function1 function110 = (v & 0x2000) == 0 ? function14 : b.B;
        Function0 function02 = (v & 0x4000) == 0 ? function00 : c.x;
        Function1 function111 = (v & 0x8000) == 0 ? function15 : b.C;
        Function0 function03 = (v & 0x10000) == 0 ? function01 : c.y;
        this(kDPhoto2, kDPhoto3, rect1, ((v & 8) == 0 ? z : true), list1, map1, featureMenu1, effectMenu1, function41, function16, function17, function18, function19, function110, function02, function111, function03);
    }

    @NotNull
    public final KDPhoto component1() {
        return this.s;
    }

    @NotNull
    public final Function1 component10() {
        return this.B;
    }

    @NotNull
    public final Function1 component11() {
        return this.C;
    }

    @NotNull
    public final Function1 component12() {
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
    public final Function0 component15() {
        return this.G;
    }

    @NotNull
    public final Function1 component16() {
        return this.H;
    }

    @NotNull
    public final Function0 component17() {
        return this.I;
    }

    @NotNull
    public final Rect component3() {
        return this.u;
    }

    public final boolean component4() {
        return this.v;
    }

    @NotNull
    public final List component5() {
        return this.w;
    }

    @NotNull
    public final Map component6() {
        return this.x;
    }

    @NotNull
    public final FeatureMenu component7() {
        return this.y;
    }

    @NotNull
    public final EffectMenu component8() {
        return this.z;
    }

    @NotNull
    public final Function4 component9() {
        return this.A;
    }

    @NotNull
    public final FilterUiState copy(@NotNull KDPhoto kDPhoto0, @NotNull KDPhoto kDPhoto1, @NotNull Rect rect0, boolean z, @NotNull List list0, @NotNull Map map0, @NotNull FeatureMenu featureMenu0, @NotNull EffectMenu effectMenu0, @NotNull Function4 function40, @NotNull Function1 function10, @NotNull Function1 function11, @NotNull Function1 function12, @NotNull Function1 function13, @NotNull Function1 function14, @NotNull Function0 function00, @NotNull Function1 function15, @NotNull Function0 function01) {
        Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
        Intrinsics.checkNotNullParameter(kDPhoto1, "savedPhoto");
        Intrinsics.checkNotNullParameter(rect0, "contentBounds");
        Intrinsics.checkNotNullParameter(list0, "filterList");
        Intrinsics.checkNotNullParameter(map0, "filterIntensityMap");
        Intrinsics.checkNotNullParameter(featureMenu0, "featureMenu");
        Intrinsics.checkNotNullParameter(effectMenu0, "effectMenu");
        Intrinsics.checkNotNullParameter(function40, "getThumbnail");
        Intrinsics.checkNotNullParameter(function10, "updatePreviewBounds");
        Intrinsics.checkNotNullParameter(function11, "onClickFeatureMenu");
        Intrinsics.checkNotNullParameter(function12, "onClickFilter");
        Intrinsics.checkNotNullParameter(function13, "changeFilterIntensity");
        Intrinsics.checkNotNullParameter(function14, "onClickEffectMenu");
        Intrinsics.checkNotNullParameter(function00, "onClickReset");
        Intrinsics.checkNotNullParameter(function15, "changeEffectValue");
        Intrinsics.checkNotNullParameter(function01, "onClickCancel");
        return new FilterUiState(kDPhoto0, kDPhoto1, rect0, z, list0, map0, featureMenu0, effectMenu0, function40, function10, function11, function12, function13, function14, function00, function15, function01);
    }

    public static FilterUiState copy$default(FilterUiState filterUiState0, KDPhoto kDPhoto0, KDPhoto kDPhoto1, Rect rect0, boolean z, List list0, Map map0, FeatureMenu featureMenu0, EffectMenu effectMenu0, Function4 function40, Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function1 function14, Function0 function00, Function1 function15, Function0 function01, int v, Object object0) {
        KDPhoto kDPhoto2 = (v & 1) == 0 ? kDPhoto0 : filterUiState0.s;
        KDPhoto kDPhoto3 = (v & 2) == 0 ? kDPhoto1 : filterUiState0.t;
        Rect rect1 = (v & 4) == 0 ? rect0 : filterUiState0.u;
        boolean z1 = (v & 8) == 0 ? z : filterUiState0.v;
        List list1 = (v & 16) == 0 ? list0 : filterUiState0.w;
        Map map1 = (v & 0x20) == 0 ? map0 : filterUiState0.x;
        FeatureMenu featureMenu1 = (v & 0x40) == 0 ? featureMenu0 : filterUiState0.y;
        EffectMenu effectMenu1 = (v & 0x80) == 0 ? effectMenu0 : filterUiState0.z;
        Function4 function41 = (v & 0x100) == 0 ? function40 : filterUiState0.A;
        Function1 function16 = (v & 0x200) == 0 ? function10 : filterUiState0.B;
        Function1 function17 = (v & 0x400) == 0 ? function11 : filterUiState0.C;
        Function1 function18 = (v & 0x800) == 0 ? function12 : filterUiState0.D;
        Function1 function19 = (v & 0x1000) == 0 ? function13 : filterUiState0.E;
        Function1 function110 = (v & 0x2000) == 0 ? function14 : filterUiState0.F;
        Function0 function02 = (v & 0x4000) == 0 ? function00 : filterUiState0.G;
        Function1 function111 = (v & 0x8000) == 0 ? function15 : filterUiState0.H;
        return (v & 0x10000) == 0 ? filterUiState0.copy(kDPhoto2, kDPhoto3, rect1, z1, list1, map1, featureMenu1, effectMenu1, function41, function16, function17, function18, function19, function110, function02, function111, function01) : filterUiState0.copy(kDPhoto2, kDPhoto3, rect1, z1, list1, map1, featureMenu1, effectMenu1, function41, function16, function17, function18, function19, function110, function02, function111, filterUiState0.I);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FilterUiState)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.s, ((FilterUiState)object0).s)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.t, ((FilterUiState)object0).t)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.u, ((FilterUiState)object0).u)) {
            return false;
        }
        if(this.v != ((FilterUiState)object0).v) {
            return false;
        }
        if(!Intrinsics.areEqual(this.w, ((FilterUiState)object0).w)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.x, ((FilterUiState)object0).x)) {
            return false;
        }
        if(this.y != ((FilterUiState)object0).y) {
            return false;
        }
        if(this.z != ((FilterUiState)object0).z) {
            return false;
        }
        if(!Intrinsics.areEqual(this.A, ((FilterUiState)object0).A)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.B, ((FilterUiState)object0).B)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.C, ((FilterUiState)object0).C)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.D, ((FilterUiState)object0).D)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.E, ((FilterUiState)object0).E)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.F, ((FilterUiState)object0).F)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.G, ((FilterUiState)object0).G)) {
            return false;
        }
        return Intrinsics.areEqual(this.H, ((FilterUiState)object0).H) ? Intrinsics.areEqual(this.I, ((FilterUiState)object0).I) : false;
    }

    @NotNull
    public final Function1 getChangeEffectValue() {
        return this.H;
    }

    @NotNull
    public final Function1 getChangeFilterIntensity() {
        return this.E;
    }

    public final boolean getChanged() {
        return this.J;
    }

    @Override  // com.kakao.kandinsky.preview.PreviewUiState
    @NotNull
    public Rect getContentBounds() {
        return this.u;
    }

    @NotNull
    public final Effect getEffect() {
        return this.M;
    }

    @NotNull
    public final EffectMenu getEffectMenu() {
        return this.z;
    }

    public final float getEffectValue() {
        EffectMenu effectMenu0 = this.z;
        Effect effect0 = this.M;
        switch(WhenMappings.$EnumSwitchMapping$0[effectMenu0.ordinal()]) {
            case 1: {
                return ((Number)effectMenu0.getRange().getEndInclusive()).floatValue() * effect0.getBrightness();
            }
            case 2: {
                return ((Number)effectMenu0.getRange().getEndInclusive()).floatValue() * effect0.getContrast();
            }
            case 3: {
                return ((Number)effectMenu0.getRange().getEndInclusive()).floatValue() * effect0.getSaturation();
            }
            case 4: {
                return ((Number)effectMenu0.getRange().getEndInclusive()).floatValue() * effect0.getTemperature();
            }
            case 5: {
                return ((Number)effectMenu0.getRange().getEndInclusive()).floatValue() * effect0.getVignette();
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public final FeatureMenu getFeatureMenu() {
        return this.y;
    }

    @NotNull
    public final Filter getFilter() {
        return this.K;
    }

    public final float getFilterIntensity() {
        return this.L;
    }

    @NotNull
    public final Map getFilterIntensityMap() {
        return this.x;
    }

    @NotNull
    public final List getFilterList() {
        return this.w;
    }

    @NotNull
    public final Function4 getGetThumbnail() {
        return this.A;
    }

    @NotNull
    public final Function0 getOnClickCancel() {
        return this.I;
    }

    @NotNull
    public final Function1 getOnClickEffectMenu() {
        return this.F;
    }

    @NotNull
    public final Function1 getOnClickFeatureMenu() {
        return this.C;
    }

    @NotNull
    public final Function1 getOnClickFilter() {
        return this.D;
    }

    @NotNull
    public final Function0 getOnClickReset() {
        return this.G;
    }

    @Override  // com.kakao.kandinsky.preview.PreviewUiState
    @NotNull
    public KDPhoto getPhoto() {
        return this.s;
    }

    @NotNull
    public final Function1 getUpdatePreviewBounds() {
        return this.B;
    }

    @Override
    public int hashCode() {
        return this.I.hashCode() + r0.a.d(r0.a.g(this.G, r0.a.d(r0.a.d(r0.a.d(r0.a.d(r0.a.d((this.A.hashCode() + (this.z.hashCode() + (this.y.hashCode() + (this.x.hashCode() + a5.b.c(this.w, r0.a.e((this.u.hashCode() + (this.t.hashCode() + this.s.hashCode() * 0x1F) * 0x1F) * 0x1F, 0x1F, this.v), 0x1F)) * 0x1F) * 0x1F) * 0x1F) * 0x1F, 0x1F, this.B), 0x1F, this.C), 0x1F, this.D), 0x1F, this.E), 0x1F, this.F), 0x1F), 0x1F, this.H);
    }

    public final boolean isSingleImage() {
        return this.v;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("FilterUiState(photo=");
        stringBuilder0.append(this.s);
        stringBuilder0.append(", savedPhoto=");
        stringBuilder0.append(this.t);
        stringBuilder0.append(", contentBounds=");
        stringBuilder0.append(this.u);
        stringBuilder0.append(", isSingleImage=");
        stringBuilder0.append(this.v);
        stringBuilder0.append(", filterList=");
        stringBuilder0.append(this.w);
        stringBuilder0.append(", filterIntensityMap=");
        stringBuilder0.append(this.x);
        stringBuilder0.append(", featureMenu=");
        stringBuilder0.append(this.y);
        stringBuilder0.append(", effectMenu=");
        stringBuilder0.append(this.z);
        stringBuilder0.append(", getThumbnail=");
        stringBuilder0.append(this.A);
        stringBuilder0.append(", updatePreviewBounds=");
        stringBuilder0.append(this.B);
        stringBuilder0.append(", onClickFeatureMenu=");
        stringBuilder0.append(this.C);
        stringBuilder0.append(", onClickFilter=");
        stringBuilder0.append(this.D);
        stringBuilder0.append(", changeFilterIntensity=");
        stringBuilder0.append(this.E);
        stringBuilder0.append(", onClickEffectMenu=");
        stringBuilder0.append(this.F);
        stringBuilder0.append(", onClickReset=");
        stringBuilder0.append(this.G);
        stringBuilder0.append(", changeEffectValue=");
        stringBuilder0.append(this.H);
        stringBuilder0.append(", onClickCancel=");
        return q.q(stringBuilder0, this.I, ")");
    }
}

