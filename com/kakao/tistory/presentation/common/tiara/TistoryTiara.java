package com.kakao.tistory.presentation.common.tiara;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.a;
import com.kakao.android.base.tiara.TiaraAnnotationUtil;
import com.kakao.android.base.tiara.TiaraBaseEnum;
import com.kakao.android.base.tiara.TiaraListener;
import com.kakao.android.base.utils.ADIDUtils;
import com.kakao.tiara.TiaraTracker;
import com.kakao.tiara.data.ActionKind;
import com.kakao.tiara.data.Click.Builder;
import com.kakao.tiara.data.Click;
import com.kakao.tiara.data.ContentList;
import com.kakao.tiara.data.Ecommerce;
import com.kakao.tiara.data.LogBuilder;
import com.kakao.tiara.data.Meta;
import com.kakao.tiara.data.Search;
import com.kakao.tiara.data.Usage;
import com.kakao.tiara.data.ViewImpContent;
import java.util.HashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u009C\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b<\b\u00C7\u0002\u0018\u00002\u00020\u0001J5\u0010\t\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0004\u00A2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\u0004\u00A2\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000F\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\u000E\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0015\u0010\u0012\u001A\u00020\b2\u0006\u0010\u0011\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0012\u0010\rJ\u0015\u0010\u0015\u001A\u00020\b2\u0006\u0010\u0014\u001A\u00020\u0013\u00A2\u0006\u0004\b\u0015\u0010\u0016JG\u0010\u001D\u001A\u00020\b2\u0006\u0010\u0014\u001A\u00020\u00132\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u00172\u0016\b\u0002\u0010\u001A\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u001BH\u0007\u00A2\u0006\u0004\b\u001D\u0010\u001EJe\u0010\u001D\u001A\u00020\b2\u0006\u0010\u001F\u001A\u00020\u00042\u0006\u0010 \u001A\u00020\u00042\n\b\u0002\u0010!\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010#\u001A\u0004\u0018\u00010\"2\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u00172\u0016\b\u0002\u0010\u001A\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u001B\u00A2\u0006\u0004\b\u001D\u0010$Jq\u0010)\u001A\u00020\b2\b\u0010\u001F\u001A\u0004\u0018\u00010\u00042\u0006\u0010 \u001A\u00020\u00042\u0006\u0010!\u001A\u00020%2\n\b\u0002\u0010#\u001A\u0004\u0018\u00010\"2\n\b\u0002\u0010\'\u001A\u0004\u0018\u00010&2\n\b\u0002\u0010(\u001A\u0004\u0018\u00010\u00172\u0016\b\u0002\u0010\u001A\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u0017H\u0007\u00A2\u0006\u0004\b)\u0010*Jo\u0010)\u001A\u00020\b2\b\u0010\u001F\u001A\u0004\u0018\u00010\u00042\u0006\u0010 \u001A\u00020\u00042\u0006\u0010!\u001A\u00020+2\n\b\u0002\u0010#\u001A\u0004\u0018\u00010\"2\n\b\u0002\u0010\'\u001A\u0004\u0018\u00010&2\n\b\u0002\u0010(\u001A\u0004\u0018\u00010\u00172\u0016\b\u0002\u0010\u001A\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u0017\u00A2\u0006\u0004\b)\u0010,Jo\u0010)\u001A\u00020\b2\b\u0010\u001F\u001A\u0004\u0018\u00010\u00042\u0006\u0010 \u001A\u00020\u00042\u0006\u0010!\u001A\u00020\u00042\n\b\u0002\u0010#\u001A\u0004\u0018\u00010\"2\n\b\u0002\u0010\'\u001A\u0004\u0018\u00010&2\n\b\u0002\u0010(\u001A\u0004\u0018\u00010\u00172\u0016\b\u0002\u0010\u001A\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u0017\u00A2\u0006\u0004\b)\u0010-Jc\u00100\u001A\u00020\b2\b\u0010\u001F\u001A\u0004\u0018\u00010\u00042\u0006\u0010 \u001A\u00020\u00042\u0006\u0010!\u001A\u00020+2\n\b\u0002\u0010#\u001A\u0004\u0018\u00010\"2\n\b\u0002\u0010/\u001A\u0004\u0018\u00010.2\n\b\u0002\u0010(\u001A\u0004\u0018\u00010\u00172\u0016\b\u0002\u0010\u001A\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0019\u00A2\u0006\u0004\b0\u00101Jc\u00100\u001A\u00020\b2\b\u0010\u001F\u001A\u0004\u0018\u00010\u00042\u0006\u0010 \u001A\u00020\u00042\u0006\u0010!\u001A\u00020\u00042\n\b\u0002\u0010#\u001A\u0004\u0018\u00010\"2\n\b\u0002\u0010/\u001A\u0004\u0018\u00010.2\n\b\u0002\u0010(\u001A\u0004\u0018\u00010\u00172\u0016\b\u0002\u0010\u001A\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0019\u00A2\u0006\u0004\b0\u00102Jc\u00107\u001A\u00020\b2\b\u0010\u001F\u001A\u0004\u0018\u00010\u00042\u0006\u0010 \u001A\u00020\u00042\u0006\u0010!\u001A\u00020%2\n\b\u0002\u0010#\u001A\u0004\u0018\u00010\"2\b\u00103\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u00104\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u00106\u001A\u0004\u0018\u0001052\n\b\u0002\u0010\'\u001A\u0004\u0018\u00010&H\u0007\u00A2\u0006\u0004\b7\u00108Ja\u00107\u001A\u00020\b2\b\u0010\u001F\u001A\u0004\u0018\u00010\u00042\u0006\u0010 \u001A\u00020\u00042\u0006\u0010!\u001A\u00020+2\n\b\u0002\u0010#\u001A\u0004\u0018\u00010\"2\b\u00103\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u00104\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u00106\u001A\u0004\u0018\u0001052\n\b\u0002\u0010\'\u001A\u0004\u0018\u00010&\u00A2\u0006\u0004\b7\u00109JY\u0010=\u001A\u00020\b2\u0006\u0010 \u001A\u00020\u00042\u0006\u0010\u001F\u001A\u00020\u00042\n\b\u0002\u0010:\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010<\u001A\u0004\u0018\u00010;2\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u00172\u0016\b\u0002\u0010\u001A\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0019\u00A2\u0006\u0004\b=\u0010>J=\u0010B\u001A\u00020\b2\b\u0010\u001F\u001A\u0004\u0018\u00010\u00042\u0006\u0010 \u001A\u00020\u00042\n\b\u0002\u0010#\u001A\u0004\u0018\u00010\"2\u0010\b\u0002\u0010A\u001A\n\u0012\u0004\u0012\u00020@\u0018\u00010?\u00A2\u0006\u0004\bB\u0010CJW\u0010L\u001A\u00020\b2\u0006\u0010!\u001A\u00020\u00042\u0006\u0010E\u001A\u00020D2\u0006\u0010G\u001A\u00020F2\u0006\u0010H\u001A\u00020F2(\b\u0002\u0010K\u001A\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010Ij\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u0001`J\u00A2\u0006\u0004\bL\u0010MJ\u00C1\u0001\u0010]\u001A\u00020\u00172\n\b\u0002\u0010N\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010O\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010P\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010Q\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010R\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010S\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010T\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010U\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010V\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010W\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010X\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010Y\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010Z\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010[\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\\\u001A\u0004\u0018\u00010\u0004\u00A2\u0006\u0004\b]\u0010^J\u0085\u0001\u0010h\u001A\u00020&2\n\b\u0002\u0010_\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010`\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010a\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010b\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010c\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010d\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010e\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010Z\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010f\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010g\u001A\u0004\u0018\u00010\u0004\u00A2\u0006\u0004\bh\u0010iJQ\u0010p\u001A\u00020;2\u0006\u0010j\u001A\u00020\u00042\n\b\u0002\u0010k\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010l\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010m\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010n\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010o\u001A\u0004\u0018\u00010\u0004\u00A2\u0006\u0004\bp\u0010qJ\u0091\u0001\u0010}\u001A\u00020.2\n\b\u0002\u0010r\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010s\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010t\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010u\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010v\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010w\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010x\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010y\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010z\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010{\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010|\u001A\u0004\u0018\u00010D\u00A2\u0006\u0004\b}\u0010~Jr\u0010\u0082\u0001\u001A\u00020@2\n\b\u0002\u0010\u007F\u001A\u0004\u0018\u00010\u00042\u000B\b\u0002\u0010\u0080\u0001\u001A\u0004\u0018\u00010\u00042\u000B\b\u0002\u0010\u0081\u0001\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010N\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010O\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010P\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010Q\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010S\u001A\u0004\u0018\u00010\u0004\u00A2\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J0\u0010\u0084\u0001\u001A\u00020\u001B2\u0006\u00103\u001A\u00020\u00042\n\b\u0002\u00104\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u00106\u001A\u0004\u0018\u000105\u00A2\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001\u00A8\u0006\u0086\u0001"}, d2 = {"Lcom/kakao/tistory/presentation/common/tiara/TistoryTiara;", "", "Landroid/app/Application;", "application", "", "serviceDomain", "kakaoAppKey", "cookieDomain", "", "init", "(Landroid/app/Application;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "userId", "setBrunchUserId", "(Ljava/lang/String;)V", "", "setAppUserId", "(J)V", "token", "setAccessToken", "Lcom/kakao/android/base/tiara/TiaraListener;", "tiaraListener", "updatePageInfo", "(Lcom/kakao/android/base/tiara/TiaraListener;)V", "Lcom/kakao/tiara/data/Meta;", "pageMeta", "", "customProperties", "Lcom/kakao/tiara/data/Search;", "search", "trackPage", "(Lcom/kakao/android/base/tiara/TiaraListener;Lcom/kakao/tiara/data/Meta;Ljava/util/Map;Lcom/kakao/tiara/data/Search;)V", "section", "page", "action", "Lcom/kakao/tiara/data/ActionKind;", "actionKind", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tiara/data/ActionKind;Lcom/kakao/tiara/data/Meta;Ljava/util/Map;Lcom/kakao/tiara/data/Search;)V", "Lcom/kakao/android/base/tiara/TiaraBaseEnum;", "Lcom/kakao/tiara/data/Click;", "click", "eventMeta", "trackClick", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/android/base/tiara/TiaraBaseEnum;Lcom/kakao/tiara/data/ActionKind;Lcom/kakao/tiara/data/Click;Lcom/kakao/tiara/data/Meta;Ljava/util/Map;Lcom/kakao/tiara/data/Meta;)V", "Lcom/kakao/tistory/presentation/common/tiara/TistoryTiaraActionType;", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/common/tiara/TistoryTiaraActionType;Lcom/kakao/tiara/data/ActionKind;Lcom/kakao/tiara/data/Click;Lcom/kakao/tiara/data/Meta;Ljava/util/Map;Lcom/kakao/tiara/data/Meta;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tiara/data/ActionKind;Lcom/kakao/tiara/data/Click;Lcom/kakao/tiara/data/Meta;Ljava/util/Map;Lcom/kakao/tiara/data/Meta;)V", "Lcom/kakao/tiara/data/Ecommerce;", "ecommerce", "trackEvent", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/common/tiara/TistoryTiaraActionType;Lcom/kakao/tiara/data/ActionKind;Lcom/kakao/tiara/data/Ecommerce;Lcom/kakao/tiara/data/Meta;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tiara/data/ActionKind;Lcom/kakao/tiara/data/Ecommerce;Lcom/kakao/tiara/data/Meta;Ljava/util/Map;)V", "searchKeyword", "searchType", "", "searchResultsNum", "trackSearch", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/android/base/tiara/TiaraBaseEnum;Lcom/kakao/tiara/data/ActionKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/kakao/tiara/data/Click;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/common/tiara/TistoryTiaraActionType;Lcom/kakao/tiara/data/ActionKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/kakao/tiara/data/Click;)V", "actionName", "Lcom/kakao/tiara/data/Usage;", "usage", "trackUsage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tiara/data/Usage;Lcom/kakao/tiara/data/Meta;Ljava/util/Map;)V", "Lcom/kakao/tiara/data/ContentList;", "Lcom/kakao/tiara/data/ViewImpContent;", "viewImpContents", "trackViewableImpression", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tiara/data/ActionKind;Lcom/kakao/tiara/data/ContentList;)V", "", "agreement", "", "latitude", "longitude", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "propertyMap", "trackLocation", "(Ljava/lang/String;ZDDLjava/util/HashMap;)V", "id", "type", "name", "category", "categoryId", "provider", "providerId", "providerType", "series", "seriesId", "author", "authorId", "image", "pLink", "tags", "createMeta", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tiara/data/Meta;", "layer1", "layer2", "layer3", "clickUrl", "setNum", "orderNum", "copy", "posX", "posY", "createClick", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tiara/data/Click;", "duration", "scrollPercent", "scrollHeight", "scrollTop", "scrollBottom", "scrollInnerHeight", "createUsage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tiara/data/Usage;", "orderNo", "paymentId", "payment", "priceAmt", "couponAmt", "shipAmt", "totalAmt", "feeAmt", "pointAmt", "currency", "subscribe", "createEcommerce", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kakao/tiara/data/Ecommerce;", "impId", "impType", "impArea", "createViewImpContent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tiara/data/ViewImpContent;", "createSearch", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/kakao/tiara/data/Search;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTistoryTiara.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TistoryTiara.kt\ncom/kakao/tistory/presentation/common/tiara/TistoryTiara\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,616:1\n1#2:617\n*E\n"})
public final class TistoryTiara {
    public static final int $stable = 8;
    @NotNull
    public static final TistoryTiara INSTANCE;
    public static TiaraTracker a;
    public static String b;
    public static boolean c;

    static {
        TistoryTiara.INSTANCE = new TistoryTiara();
    }

    public static LogBuilder a(String s, String s1, String s2, ActionKind actionKind0) {
        TiaraTracker tiaraTracker0 = TistoryTiara.a;
        if(tiaraTracker0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tiaraTracker");
            tiaraTracker0 = null;
        }
        LogBuilder logBuilder0 = tiaraTracker0.trackEvent(s2).page(s1);
        if(s != null) {
            logBuilder0.section(s);
        }
        if(actionKind0 != null) {
            logBuilder0.actionKind(actionKind0);
        }
        return logBuilder0;
    }

    public static void a(TistoryTiara tistoryTiara0, String s, String s1, String s2, String s3, ActionKind actionKind0, Click click0, Meta meta0, Map map0, int v) {
        tistoryTiara0.getClass();
        TistoryTiara.a(s, s1, s2, s3, actionKind0, ((v & 0x20) == 0 ? click0 : null), ((v & 0x40) == 0 ? meta0 : null), ((v & 0x80) == 0 ? map0 : null), null);
    }

    public static void a(String s, String s1, String s2, String s3, ActionKind actionKind0, Click click0, Meta meta0, Map map0, Meta meta1) {
        String s4 = click0 == null ? s + ", section=" + s1 + ", page=" + s2 + ", action=" + s3 + ", actionKind=" + actionKind0 : s + ", section=" + s1 + ", page=" + s2 + ", action=" + s3 + ", actionKind=" + actionKind0 + ", click=" + click0;
        if(meta0 != null) {
            s4 = s4 + ", eventMeta=" + meta0;
        }
        if(meta1 != null) {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(s4);
            stringBuilder0.append(", pageMeta=");
            stringBuilder0.append(meta1);
        }
        if(map0 != null) {
            map0.toString();
        }
    }

    public static boolean a() {
        String s = TistoryTiara.b;
        if(s != null) {
            if(TiaraTracker.get(s) == null) {
                s = null;
            }
            return s != null;
        }
        return false;
    }

    @NotNull
    public final Click createClick(@Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5, @Nullable String s6, @Nullable String s7, @Nullable String s8, @Nullable String s9) {
        Builder click$Builder0 = new Builder();
        if(s != null) {
            click$Builder0.layer1(s);
        }
        if(s1 != null) {
            click$Builder0.layer2(s1);
        }
        if(s2 != null) {
            click$Builder0.layer3(s2);
        }
        if(s3 != null) {
            click$Builder0.clickUrl(s3);
        }
        if(s4 != null) {
            click$Builder0.setNum(s4);
        }
        if(s5 != null) {
            click$Builder0.ordNum(s5);
        }
        if(s6 != null) {
            click$Builder0.copy(s6);
        }
        if(s7 != null) {
            click$Builder0.image(s7);
        }
        if(s8 != null) {
            click$Builder0.posX(s8);
        }
        if(s9 != null) {
            click$Builder0.posY(s9);
        }
        Click click0 = click$Builder0.build();
        Intrinsics.checkNotNullExpressionValue(click0, "build(...)");
        return click0;
    }

    public static Click createClick$default(TistoryTiara tistoryTiara0, String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 4) != 0) {
            s2 = null;
        }
        if((v & 8) != 0) {
            s3 = null;
        }
        if((v & 16) != 0) {
            s4 = null;
        }
        if((v & 0x20) != 0) {
            s5 = null;
        }
        if((v & 0x40) != 0) {
            s6 = null;
        }
        if((v & 0x80) != 0) {
            s7 = null;
        }
        if((v & 0x100) != 0) {
            s8 = null;
        }
        if((v & 0x200) != 0) {
            s9 = null;
        }
        return tistoryTiara0.createClick(s, s1, s2, s3, s4, s5, s6, s7, s8, s9);
    }

    @NotNull
    public final Ecommerce createEcommerce(@Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5, @Nullable String s6, @Nullable String s7, @Nullable String s8, @Nullable String s9, @Nullable Boolean boolean0) {
        com.kakao.tiara.data.Ecommerce.Builder ecommerce$Builder0 = new com.kakao.tiara.data.Ecommerce.Builder();
        if(s != null) {
            ecommerce$Builder0.orderNo(s);
        }
        if(s1 != null) {
            ecommerce$Builder0.paymentId(s1);
        }
        if(s2 != null) {
            ecommerce$Builder0.payment(s2);
        }
        if(s3 != null) {
            ecommerce$Builder0.priceAmt(s3);
        }
        if(s4 != null) {
            ecommerce$Builder0.couponAmt(s4);
        }
        if(s5 != null) {
            ecommerce$Builder0.shipAmt(s5);
        }
        if(s6 != null) {
            ecommerce$Builder0.totalAmt(s6);
        }
        if(s7 != null) {
            ecommerce$Builder0.feeAmt(s7);
        }
        if(s8 != null) {
            ecommerce$Builder0.pointAmt(s8);
        }
        if(s9 != null) {
            ecommerce$Builder0.currency(s9);
        }
        if(boolean0 != null) {
            ecommerce$Builder0.subscription(boolean0.booleanValue());
        }
        Ecommerce ecommerce0 = ecommerce$Builder0.build();
        Intrinsics.checkNotNullExpressionValue(ecommerce0, "build(...)");
        return ecommerce0;
    }

    public static Ecommerce createEcommerce$default(TistoryTiara tistoryTiara0, String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, Boolean boolean0, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 4) != 0) {
            s2 = null;
        }
        if((v & 8) != 0) {
            s3 = null;
        }
        if((v & 16) != 0) {
            s4 = null;
        }
        if((v & 0x20) != 0) {
            s5 = null;
        }
        if((v & 0x40) != 0) {
            s6 = null;
        }
        if((v & 0x80) != 0) {
            s7 = null;
        }
        if((v & 0x100) != 0) {
            s8 = null;
        }
        if((v & 0x200) != 0) {
            s9 = null;
        }
        if((v & 0x400) != 0) {
            boolean0 = null;
        }
        return tistoryTiara0.createEcommerce(s, s1, s2, s3, s4, s5, s6, s7, s8, s9, boolean0);
    }

    @NotNull
    public final Meta createMeta(@Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5, @Nullable String s6, @Nullable String s7, @Nullable String s8, @Nullable String s9, @Nullable String s10, @Nullable String s11, @Nullable String s12, @Nullable String s13, @Nullable String s14) {
        com.kakao.tiara.data.Meta.Builder meta$Builder0 = new com.kakao.tiara.data.Meta.Builder();
        if(s != null) {
            meta$Builder0.id(s);
        }
        if(s1 != null) {
            meta$Builder0.type(s1);
        }
        if(s2 != null) {
            meta$Builder0.name(s2);
        }
        if(s3 != null) {
            meta$Builder0.category(s3);
        }
        if(s4 != null) {
            meta$Builder0.categoryId(s4);
        }
        if(s5 != null) {
            meta$Builder0.provider(s5);
        }
        if(s6 != null) {
            meta$Builder0.providerId(s6);
        }
        if(s7 != null) {
            meta$Builder0.providerType(s7);
        }
        if(s8 != null) {
            meta$Builder0.series(s8);
        }
        if(s9 != null) {
            meta$Builder0.seriesId(s9);
        }
        if(s10 != null) {
            meta$Builder0.author(s10);
        }
        if(s11 != null) {
            meta$Builder0.authorId(s11);
        }
        if(s12 != null) {
            meta$Builder0.image(s12);
        }
        if(s13 != null) {
            meta$Builder0.plink(s13);
        }
        if(s14 != null) {
            meta$Builder0.tags(s14);
        }
        Meta meta0 = meta$Builder0.build();
        Intrinsics.checkNotNullExpressionValue(meta0, "build(...)");
        return meta0;
    }

    public static Meta createMeta$default(TistoryTiara tistoryTiara0, String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10, String s11, String s12, String s13, String s14, int v, Object object0) {
        return tistoryTiara0.createMeta(((v & 1) == 0 ? s : null), ((v & 2) == 0 ? s1 : null), ((v & 4) == 0 ? s2 : null), ((v & 8) == 0 ? s3 : null), ((v & 16) == 0 ? s4 : null), ((v & 0x20) == 0 ? s5 : null), ((v & 0x40) == 0 ? s6 : null), ((v & 0x80) == 0 ? s7 : null), ((v & 0x100) == 0 ? s8 : null), ((v & 0x200) == 0 ? s9 : null), ((v & 0x400) == 0 ? s10 : null), ((v & 0x800) == 0 ? s11 : null), ((v & 0x1000) == 0 ? s12 : null), ((v & 0x2000) == 0 ? s13 : null), ((v & 0x4000) == 0 ? s14 : null));
    }

    @NotNull
    public final Search createSearch(@NotNull String s, @Nullable String s1, @Nullable Integer integer0) {
        Intrinsics.checkNotNullParameter(s, "searchKeyword");
        com.kakao.tiara.data.Search.Builder search$Builder0 = new com.kakao.tiara.data.Search.Builder();
        search$Builder0.searchTerm(s);
        if(s1 != null) {
            search$Builder0.searchType(s1);
        }
        if(integer0 != null) {
            search$Builder0.searchResultsNum(((int)integer0));
        }
        Search search0 = search$Builder0.build();
        Intrinsics.checkNotNullExpressionValue(search0, "build(...)");
        return search0;
    }

    public static Search createSearch$default(TistoryTiara tistoryTiara0, String s, String s1, Integer integer0, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 4) != 0) {
            integer0 = null;
        }
        return tistoryTiara0.createSearch(s, s1, integer0);
    }

    @NotNull
    public final Usage createUsage(@NotNull String s, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5) {
        Intrinsics.checkNotNullParameter(s, "duration");
        com.kakao.tiara.data.Usage.Builder usage$Builder0 = new com.kakao.tiara.data.Usage.Builder().duration(s);
        if(s1 != null) {
            usage$Builder0.scrollPercent(s1);
        }
        if(s2 != null) {
            usage$Builder0.scrollHeight(s2);
        }
        if(s3 != null) {
            usage$Builder0.scrollTop(s3);
        }
        if(s4 != null) {
            usage$Builder0.scrollBottom(s4);
        }
        if(s5 != null) {
            usage$Builder0.scrollInnerHeight(s5);
        }
        Usage usage0 = usage$Builder0.build();
        Intrinsics.checkNotNullExpressionValue(usage0, "build(...)");
        return usage0;
    }

    public static Usage createUsage$default(TistoryTiara tistoryTiara0, String s, String s1, String s2, String s3, String s4, String s5, int v, Object object0) {
        return tistoryTiara0.createUsage(s, ((v & 2) == 0 ? s1 : null), ((v & 4) == 0 ? s2 : null), ((v & 8) == 0 ? s3 : null), ((v & 16) == 0 ? s4 : null), ((v & 0x20) == 0 ? s5 : null));
    }

    @NotNull
    public final ViewImpContent createViewImpContent(@Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5, @Nullable String s6, @Nullable String s7) {
        com.kakao.tiara.data.ViewImpContent.Builder viewImpContent$Builder0 = new com.kakao.tiara.data.ViewImpContent.Builder();
        if(s != null) {
            viewImpContent$Builder0.impId(s);
        }
        if(s1 != null) {
            viewImpContent$Builder0.impType(s1);
        }
        if(s2 != null) {
            viewImpContent$Builder0.impArea(s2);
        }
        if(s3 != null) {
            viewImpContent$Builder0.id(s3);
        }
        if(s4 != null) {
            viewImpContent$Builder0.type(s4);
        }
        if(s5 != null) {
            viewImpContent$Builder0.name(s5);
        }
        if(s6 != null) {
            viewImpContent$Builder0.category(s6);
        }
        if(s7 != null) {
            viewImpContent$Builder0.provider(s7);
        }
        ViewImpContent viewImpContent0 = viewImpContent$Builder0.build();
        Intrinsics.checkNotNullExpressionValue(viewImpContent0, "build(...)");
        return viewImpContent0;
    }

    public static ViewImpContent createViewImpContent$default(TistoryTiara tistoryTiara0, String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 4) != 0) {
            s2 = null;
        }
        if((v & 8) != 0) {
            s3 = null;
        }
        if((v & 16) != 0) {
            s4 = null;
        }
        if((v & 0x20) != 0) {
            s5 = null;
        }
        if((v & 0x40) != 0) {
            s6 = null;
        }
        if((v & 0x80) != 0) {
            s7 = null;
        }
        return tistoryTiara0.createViewImpContent(s, s1, s2, s3, s4, s5, s6, s7);
    }

    public final void init(@NotNull Application application0, @NotNull String s, @Nullable String s1, @Nullable String s2) {
        Intrinsics.checkNotNullParameter(application0, "application");
        Intrinsics.checkNotNullParameter(s, "serviceDomain");
        TistoryTiara.b = s;
        TistoryTiara.c = (s1 == null || p.isBlank(s1) ? 1 : 0) ^ 1;
        com.kakao.tiara.TiaraConfiguration.Builder tiaraConfiguration$Builder0 = new com.kakao.tiara.TiaraConfiguration.Builder().sessionTimeout(300).syncTiaraUserToWebview(true);
        if(s2 != null) {
            tiaraConfiguration$Builder0.cookieDomains(new String[]{s2});
        }
        TiaraTracker.initialize(application0, tiaraConfiguration$Builder0.build());
        TiaraTracker tiaraTracker0 = TiaraTracker.get(s);
        if(tiaraTracker0 == null) {
            com.kakao.tiara.TiaraSettings.Builder tiaraSettings$Builder0 = new com.kakao.tiara.TiaraSettings.Builder();
            tiaraSettings$Builder0.deployment("production");
            tiaraSettings$Builder0.batchSize(1);
            tiaraSettings$Builder0.batchInterval(30);
            if(TistoryTiara.c) {
                tiaraSettings$Builder0.kakaoAppKey(s1);
            }
            tiaraTracker0 = TiaraTracker.newInstance(s, tiaraSettings$Builder0.build());
            Intrinsics.checkNotNullExpressionValue(tiaraTracker0, "newInstance(...)");
        }
        TistoryTiara.a = tiaraTracker0;
        ADIDUtils.INSTANCE.requestAdInfo(e.a);
    }

    public static void init$default(TistoryTiara tistoryTiara0, Application application0, String s, String s1, String s2, int v, Object object0) {
        if((v & 4) != 0) {
            s1 = null;
        }
        if((v & 8) != 0) {
            s2 = null;
        }
        tistoryTiara0.init(application0, s, s1, s2);
    }

    public final void setAccessToken(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "token");
        TiaraTracker tiaraTracker0 = TistoryTiara.a;
        if(tiaraTracker0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tiaraTracker");
            tiaraTracker0 = null;
        }
        tiaraTracker0.getSettings().setAccessToken(s);
    }

    public final void setAppUserId(long v) {
        if(TistoryTiara.c) {
            TiaraTracker tiaraTracker0 = TistoryTiara.a;
            if(tiaraTracker0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tiaraTracker");
                tiaraTracker0 = null;
            }
            tiaraTracker0.getSettings().setAppUserId(String.valueOf(v));
        }
    }

    public final void setBrunchUserId(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "userId");
        TiaraTracker tiaraTracker0 = TistoryTiara.a;
        if(tiaraTracker0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tiaraTracker");
            tiaraTracker0 = null;
        }
        tiaraTracker0.getSettings().setUserExAccount(x.hashMapOf(new Pair[]{TuplesKt.to("brunch_user_id", "@@" + s)}));
    }

    @Deprecated(message = "don\'t use", replaceWith = @ReplaceWith(expression = "trackClick(.. action: TistoryTiaraActionType", imports = {}))
    public final void trackClick(@Nullable String s, @NotNull String s1, @NotNull TiaraBaseEnum tiaraBaseEnum0, @Nullable ActionKind actionKind0, @Nullable Click click0, @Nullable Meta meta0, @Nullable Map map0, @Nullable Meta meta1) {
        Intrinsics.checkNotNullParameter(s1, "page");
        Intrinsics.checkNotNullParameter(tiaraBaseEnum0, "action");
        this.trackClick(s, s1, tiaraBaseEnum0.getValue(), actionKind0, click0, meta0, map0, meta1);
    }

    public final void trackClick(@Nullable String s, @NotNull String s1, @NotNull TistoryTiaraActionType tistoryTiaraActionType0, @Nullable ActionKind actionKind0, @Nullable Click click0, @Nullable Meta meta0, @Nullable Map map0, @Nullable Meta meta1) {
        Intrinsics.checkNotNullParameter(s1, "page");
        Intrinsics.checkNotNullParameter(tistoryTiaraActionType0, "action");
        if(!TistoryTiara.a()) {
            return;
        }
        this.trackClick(s, s1, tistoryTiaraActionType0.getActionTypeValue(), actionKind0, click0, meta0, map0, meta1);
    }

    public final void trackClick(@Nullable String s, @NotNull String s1, @NotNull String s2, @Nullable ActionKind actionKind0, @Nullable Click click0, @Nullable Meta meta0, @Nullable Map map0, @Nullable Meta meta1) {
        Intrinsics.checkNotNullParameter(s1, "page");
        Intrinsics.checkNotNullParameter(s2, "action");
        if(!TistoryTiara.a()) {
            return;
        }
        TistoryTiara.a(this, "trackClick()", s, s1, s2, actionKind0, click0, meta0, map0, 0x100);
        LogBuilder logBuilder0 = TistoryTiara.a(s, s1, s2, actionKind0);
        if(click0 != null) {
            logBuilder0.click(click0);
        }
        if(meta0 != null) {
            logBuilder0.eventMeta(meta0);
        }
        if(map0 != null) {
            Map map1 = map0.isEmpty() ? null : map0;
            if(map1 != null) {
                logBuilder0.customProps(map1);
            }
        }
        if(meta1 != null) {
            logBuilder0.pageMeta(meta1);
        }
        logBuilder0.track();
    }

    public static void trackClick$default(TistoryTiara tistoryTiara0, String s, String s1, TiaraBaseEnum tiaraBaseEnum0, ActionKind actionKind0, Click click0, Meta meta0, Map map0, Meta meta1, int v, Object object0) {
        tistoryTiara0.trackClick(s, s1, tiaraBaseEnum0, ((v & 8) == 0 ? actionKind0 : null), ((v & 16) == 0 ? click0 : null), ((v & 0x20) == 0 ? meta0 : null), ((v & 0x40) == 0 ? map0 : null), ((v & 0x80) == 0 ? meta1 : null));
    }

    public static void trackClick$default(TistoryTiara tistoryTiara0, String s, String s1, TistoryTiaraActionType tistoryTiaraActionType0, ActionKind actionKind0, Click click0, Meta meta0, Map map0, Meta meta1, int v, Object object0) {
        tistoryTiara0.trackClick(s, s1, tistoryTiaraActionType0, ((v & 8) == 0 ? actionKind0 : null), ((v & 16) == 0 ? click0 : null), ((v & 0x20) == 0 ? meta0 : null), ((v & 0x40) == 0 ? map0 : null), ((v & 0x80) == 0 ? meta1 : null));
    }

    public static void trackClick$default(TistoryTiara tistoryTiara0, String s, String s1, String s2, ActionKind actionKind0, Click click0, Meta meta0, Map map0, Meta meta1, int v, Object object0) {
        tistoryTiara0.trackClick(s, s1, s2, ((v & 8) == 0 ? actionKind0 : null), ((v & 16) == 0 ? click0 : null), ((v & 0x20) == 0 ? meta0 : null), ((v & 0x40) == 0 ? map0 : null), ((v & 0x80) == 0 ? meta1 : null));
    }

    public final void trackEvent(@Nullable String s, @NotNull String s1, @NotNull TistoryTiaraActionType tistoryTiaraActionType0, @Nullable ActionKind actionKind0, @Nullable Ecommerce ecommerce0, @Nullable Meta meta0, @Nullable Map map0) {
        Intrinsics.checkNotNullParameter(s1, "page");
        Intrinsics.checkNotNullParameter(tistoryTiaraActionType0, "action");
        if(!TistoryTiara.a()) {
            return;
        }
        this.trackEvent(s, s1, tistoryTiaraActionType0.getActionTypeValue(), actionKind0, ecommerce0, meta0, map0);
    }

    public final void trackEvent(@Nullable String s, @NotNull String s1, @NotNull String s2, @Nullable ActionKind actionKind0, @Nullable Ecommerce ecommerce0, @Nullable Meta meta0, @Nullable Map map0) {
        Intrinsics.checkNotNullParameter(s1, "page");
        Intrinsics.checkNotNullParameter(s2, "action");
        if(!TistoryTiara.a()) {
            return;
        }
        TistoryTiara.a(this, "trackEvent()", s, s1, s2, actionKind0, null, meta0, map0, 0x120);
        LogBuilder logBuilder0 = TistoryTiara.a(s, s1, s2, actionKind0);
        if(ecommerce0 != null) {
            logBuilder0.ecommerce(ecommerce0);
        }
        if(meta0 != null) {
            logBuilder0.eventMeta(meta0);
        }
        if(map0 != null) {
            Map map1 = map0.isEmpty() ? null : map0;
            if(map1 != null) {
                logBuilder0.customProps(map1);
            }
        }
        logBuilder0.track();
    }

    public static void trackEvent$default(TistoryTiara tistoryTiara0, String s, String s1, TistoryTiaraActionType tistoryTiaraActionType0, ActionKind actionKind0, Ecommerce ecommerce0, Meta meta0, Map map0, int v, Object object0) {
        tistoryTiara0.trackEvent(s, s1, tistoryTiaraActionType0, ((v & 8) == 0 ? actionKind0 : null), ((v & 16) == 0 ? ecommerce0 : null), ((v & 0x20) == 0 ? meta0 : null), ((v & 0x40) == 0 ? map0 : null));
    }

    public static void trackEvent$default(TistoryTiara tistoryTiara0, String s, String s1, String s2, ActionKind actionKind0, Ecommerce ecommerce0, Meta meta0, Map map0, int v, Object object0) {
        tistoryTiara0.trackEvent(s, s1, s2, ((v & 8) == 0 ? actionKind0 : null), ((v & 16) == 0 ? ecommerce0 : null), ((v & 0x20) == 0 ? meta0 : null), ((v & 0x40) == 0 ? map0 : null));
    }

    public final void trackLocation(@NotNull String s, boolean z, double f, double f1, @Nullable HashMap hashMap0) {
        Intrinsics.checkNotNullParameter(s, "action");
        if(!TistoryTiara.a()) {
            return;
        }
        TiaraTracker tiaraTracker0 = TistoryTiara.a;
        if(tiaraTracker0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tiaraTracker");
            tiaraTracker0 = null;
        }
        tiaraTracker0.trackLocation(s).location(z, f, f1, hashMap0).track();
    }

    public static void trackLocation$default(TistoryTiara tistoryTiara0, String s, boolean z, double f, double f1, HashMap hashMap0, int v, Object object0) {
        tistoryTiara0.trackLocation(s, z, f, f1, ((v & 16) == 0 ? hashMap0 : null));
    }

    @Deprecated(message = "tiaraListener 사용 안함")
    public final void trackPage(@NotNull TiaraListener tiaraListener0, @Nullable Meta meta0, @Nullable Map map0, @Nullable Search search0) {
        Intrinsics.checkNotNullParameter(tiaraListener0, "tiaraListener");
        if(!TistoryTiara.a()) {
            return;
        }
        this.updatePageInfo(tiaraListener0);
        String s = tiaraListener0.getSection();
        String s1 = tiaraListener0.getPage();
        if(p.isBlank(s1)) {
            return;
        }
        String s2 = tiaraListener0.getAction();
        ActionKind actionKind0 = tiaraListener0.getActionKind();
        TistoryTiara.a(this, "trackPage()", s, s1, s2, actionKind0, null, null, null, 480);
        TiaraTracker tiaraTracker0 = TistoryTiara.a;
        if(tiaraTracker0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tiaraTracker");
            tiaraTracker0 = null;
        }
        LogBuilder logBuilder0 = tiaraTracker0.trackPage(s2).page(s1);
        if(s != null) {
            logBuilder0.section(s);
        }
        if(actionKind0 != null) {
            logBuilder0.actionKind(actionKind0);
        }
        if(meta0 != null) {
            logBuilder0.pageMeta(meta0);
        }
        if(map0 != null) {
            logBuilder0.customProps(map0);
        }
        if(search0 != null) {
            logBuilder0.search(search0);
        }
        logBuilder0.track();
    }

    public final void trackPage(@NotNull String s, @NotNull String s1, @Nullable String s2, @Nullable ActionKind actionKind0, @Nullable Meta meta0, @Nullable Map map0, @Nullable Search search0) {
        Intrinsics.checkNotNullParameter(s, "section");
        Intrinsics.checkNotNullParameter(s1, "page");
        TistoryTiara.a(this, "trackPage()", s, s1, s2, actionKind0, null, null, null, 480);
        TiaraTracker tiaraTracker0 = TistoryTiara.a;
        if(tiaraTracker0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tiaraTracker");
            tiaraTracker0 = null;
        }
        LogBuilder logBuilder0 = tiaraTracker0.trackPage((s2 == null ? s1 + "_보기" : s2)).page(s1).section(s);
        if(actionKind0 != null) {
            logBuilder0.actionKind(actionKind0);
        }
        if(meta0 != null) {
            logBuilder0.pageMeta(meta0);
        }
        if(map0 != null) {
            logBuilder0.customProps(map0);
        }
        if(search0 != null) {
            logBuilder0.search(search0);
        }
        logBuilder0.track();
    }

    public static void trackPage$default(TistoryTiara tistoryTiara0, TiaraListener tiaraListener0, Meta meta0, Map map0, Search search0, int v, Object object0) {
        if((v & 2) != 0) {
            meta0 = null;
        }
        if((v & 4) != 0) {
            map0 = null;
        }
        if((v & 8) != 0) {
            search0 = null;
        }
        tistoryTiara0.trackPage(tiaraListener0, meta0, map0, search0);
    }

    public static void trackPage$default(TistoryTiara tistoryTiara0, String s, String s1, String s2, ActionKind actionKind0, Meta meta0, Map map0, Search search0, int v, Object object0) {
        tistoryTiara0.trackPage(s, s1, ((v & 4) == 0 ? s2 : null), ((v & 8) == 0 ? actionKind0 : null), ((v & 16) == 0 ? meta0 : null), ((v & 0x20) == 0 ? map0 : null), ((v & 0x40) == 0 ? search0 : null));
    }

    @Deprecated(message = "don\'t use")
    public final void trackSearch(@Nullable String s, @NotNull String s1, @NotNull TiaraBaseEnum tiaraBaseEnum0, @Nullable ActionKind actionKind0, @Nullable String s2, @Nullable String s3, @Nullable Integer integer0, @Nullable Click click0) {
        Intrinsics.checkNotNullParameter(s1, "page");
        Intrinsics.checkNotNullParameter(tiaraBaseEnum0, "action");
        if(!TistoryTiara.a()) {
            return;
        }
        String s4 = tiaraBaseEnum0.getValue();
        if(TistoryTiara.a()) {
            LogBuilder logBuilder0 = TistoryTiara.a(s, s1, s4, actionKind0);
            if(click0 != null) {
                logBuilder0.click(click0);
            }
            if(s2 != null) {
                com.kakao.tiara.data.Search.Builder search$Builder0 = new com.kakao.tiara.data.Search.Builder().searchTerm(s2);
                if(s3 != null) {
                    search$Builder0.searchType(s3);
                }
                if(integer0 != null) {
                    search$Builder0.searchResultsNum(((int)integer0));
                }
                logBuilder0.search(search$Builder0.build());
            }
            logBuilder0.track();
        }
    }

    public final void trackSearch(@Nullable String s, @NotNull String s1, @NotNull TistoryTiaraActionType tistoryTiaraActionType0, @Nullable ActionKind actionKind0, @Nullable String s2, @Nullable String s3, @Nullable Integer integer0, @Nullable Click click0) {
        Intrinsics.checkNotNullParameter(s1, "page");
        Intrinsics.checkNotNullParameter(tistoryTiaraActionType0, "action");
        if(!TistoryTiara.a()) {
            return;
        }
        String s4 = tistoryTiaraActionType0.getActionTypeValue();
        if(TistoryTiara.a()) {
            LogBuilder logBuilder0 = TistoryTiara.a(s, s1, s4, actionKind0);
            if(click0 != null) {
                logBuilder0.click(click0);
            }
            if(s2 != null) {
                com.kakao.tiara.data.Search.Builder search$Builder0 = new com.kakao.tiara.data.Search.Builder().searchTerm(s2);
                if(s3 != null) {
                    search$Builder0.searchType(s3);
                }
                if(integer0 != null) {
                    search$Builder0.searchResultsNum(((int)integer0));
                }
                logBuilder0.search(search$Builder0.build());
            }
            logBuilder0.track();
        }
    }

    public static void trackSearch$default(TistoryTiara tistoryTiara0, String s, String s1, TiaraBaseEnum tiaraBaseEnum0, ActionKind actionKind0, String s2, String s3, Integer integer0, Click click0, int v, Object object0) {
        tistoryTiara0.trackSearch(s, s1, tiaraBaseEnum0, ((v & 8) == 0 ? actionKind0 : null), s2, ((v & 0x20) == 0 ? s3 : null), ((v & 0x40) == 0 ? integer0 : null), ((v & 0x80) == 0 ? click0 : null));
    }

    public static void trackSearch$default(TistoryTiara tistoryTiara0, String s, String s1, TistoryTiaraActionType tistoryTiaraActionType0, ActionKind actionKind0, String s2, String s3, Integer integer0, Click click0, int v, Object object0) {
        tistoryTiara0.trackSearch(s, s1, tistoryTiaraActionType0, ((v & 8) == 0 ? actionKind0 : null), s2, ((v & 0x20) == 0 ? s3 : null), ((v & 0x40) == 0 ? integer0 : null), ((v & 0x80) == 0 ? click0 : null));
    }

    public final void trackUsage(@NotNull String s, @NotNull String s1, @Nullable String s2, @Nullable Usage usage0, @Nullable Meta meta0, @Nullable Map map0) {
        com.kakao.tiara.track.Usage usage1;
        TiaraTracker tiaraTracker0 = null;
        Intrinsics.checkNotNullParameter(s, "page");
        Intrinsics.checkNotNullParameter(s1, "section");
        if(!TistoryTiara.a()) {
            return;
        }
        if(s2 == null || p.isBlank(s2)) {
            TiaraTracker tiaraTracker2 = TistoryTiara.a;
            if(tiaraTracker2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tiaraTracker");
            }
            else {
                tiaraTracker0 = tiaraTracker2;
            }
            usage1 = tiaraTracker0.trackUsage();
        }
        else {
            TiaraTracker tiaraTracker1 = TistoryTiara.a;
            if(tiaraTracker1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tiaraTracker");
            }
            else {
                tiaraTracker0 = tiaraTracker1;
            }
            usage1 = tiaraTracker0.trackUsage(s2);
        }
        Intrinsics.checkNotNull(usage1);
        LogBuilder logBuilder0 = usage1.section(s1).page(s);
        if(usage0 != null) {
            logBuilder0.usage(usage0);
        }
        if(meta0 != null) {
            logBuilder0.pageMeta(meta0);
        }
        if(map0 != null) {
            logBuilder0.customProps(map0);
        }
        logBuilder0.track();
    }

    public static void trackUsage$default(TistoryTiara tistoryTiara0, String s, String s1, String s2, Usage usage0, Meta meta0, Map map0, int v, Object object0) {
        tistoryTiara0.trackUsage(s, s1, ((v & 4) == 0 ? s2 : null), ((v & 8) == 0 ? usage0 : null), ((v & 16) == 0 ? meta0 : null), ((v & 0x20) == 0 ? map0 : null));
    }

    public final void trackViewableImpression(@Nullable String s, @NotNull String s1, @Nullable ActionKind actionKind0, @Nullable ContentList contentList0) {
        Intrinsics.checkNotNullParameter(s1, "page");
        if(!TistoryTiara.a()) {
            return;
        }
        TiaraTracker tiaraTracker0 = TistoryTiara.a;
        if(tiaraTracker0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tiaraTracker");
            tiaraTracker0 = null;
        }
        LogBuilder logBuilder0 = tiaraTracker0.trackViewImp().section(s).page(s1);
        if(actionKind0 != null) {
            logBuilder0.actionKind(actionKind0);
        }
        if(contentList0 != null) {
            logBuilder0.viewImpContents(contentList0);
        }
        logBuilder0.track();
    }

    public static void trackViewableImpression$default(TistoryTiara tistoryTiara0, String s, String s1, ActionKind actionKind0, ContentList contentList0, int v, Object object0) {
        if((v & 4) != 0) {
            actionKind0 = null;
        }
        if((v & 8) != 0) {
            contentList0 = null;
        }
        tistoryTiara0.trackViewableImpression(s, s1, actionKind0, contentList0);
    }

    public final void updatePageInfo(@NotNull TiaraListener tiaraListener0) {
        Class class0;
        Intrinsics.checkNotNullParameter(tiaraListener0, "tiaraListener");
        String s = tiaraListener0.getSection();
        String s1 = null;
        if(s == null) {
            class0 = tiaraListener0.getClass();
            s = TiaraAnnotationUtil.INSTANCE.getSection(class0);
        }
        else {
            if(p.isBlank(s)) {
                s = null;
            }
            if(s == null) {
                class0 = tiaraListener0.getClass();
                s = TiaraAnnotationUtil.INSTANCE.getSection(class0);
            }
        }
        tiaraListener0.setSection(s);
        String s2 = tiaraListener0.getPage();
        if(p.isBlank(s2)) {
            s2 = null;
        }
        if(s2 == null) {
            Class class1 = tiaraListener0.getClass();
            s2 = TiaraAnnotationUtil.INSTANCE.getPage(class1);
            if(s2 == null) {
                s2 = "";
            }
        }
        tiaraListener0.setPage(s2);
        String s3 = tiaraListener0.getAction();
        if(!p.isBlank(s3)) {
            s1 = s3;
        }
        if(s1 == null) {
            Class class2 = tiaraListener0.getClass();
            s1 = TiaraAnnotationUtil.INSTANCE.getAction(class2);
            if(s1 == null) {
                s1 = a.z(tiaraListener0.getPage(), "_보기");
            }
        }
        tiaraListener0.setAction(s1);
        ActionKind actionKind0 = tiaraListener0.getActionKind();
        if(actionKind0 == null) {
            Class class3 = tiaraListener0.getClass();
            actionKind0 = TiaraAnnotationUtil.INSTANCE.getActionKind(class3);
        }
        tiaraListener0.setActionKind(actionKind0);
    }
}

