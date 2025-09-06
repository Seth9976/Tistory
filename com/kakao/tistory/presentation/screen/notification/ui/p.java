package com.kakao.tistory.presentation.screen.notification.ui;

import a;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.DividerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.tistory.domain.entity.NotificationItem.Empty;
import com.kakao.tistory.domain.entity.NotificationItem.Notification;
import com.kakao.tistory.domain.entity.NotificationItem;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.screen.notification.NotificationViewModel;
import com.kakao.tistory.presentation.widget.common.CommonEmptyViewKt;
import d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.c;

public final class p extends Lambda implements Function4 {
    public final LazyPagingItems a;
    public final int b;
    public final NotificationViewModel c;

    public p(LazyPagingItems lazyPagingItems0, int v, NotificationViewModel notificationViewModel0) {
        this.a = lazyPagingItems0;
        this.b = v;
        this.c = notificationViewModel0;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object1).intValue();
        Composer composer0 = (Composer)object2;
        int v1 = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((LazyItemScope)object0), "$this$items");
        if((v1 & 0x70) == 0) {
            v1 |= (composer0.changed(v) ? 0x20 : 16);
        }
        if((v1 & 721) == 0x90 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x34A240B, v1, -1, "com.kakao.tistory.presentation.screen.notification.ui.NotificationList.<anonymous>.<anonymous> (NotificationList.kt:63)");
        }
        NotificationItem notificationItem0 = (NotificationItem)this.a.get(v);
        boolean z = v >= 0 && (v < this.b && notificationItem0 instanceof Notification && this.a.get(c.coerceAtMost(v + 1, this.b)) instanceof Notification);
        if(notificationItem0 != null) {
            NotificationViewModel notificationViewModel0 = this.c;
            Companion modifier$Companion0 = Modifier.Companion;
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
            CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer0, modifier$Companion0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            if(composer0.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer0.startReusableNode();
            if(composer0.getInserting()) {
                composer0.createNode(function00);
            }
            else {
                composer0.useNode();
            }
            Function2 function20 = a.a(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
            if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
                d.a(v2, composer0, v2, function20);
            }
            Updater.set-impl(composer0, modifier0, composeUiNode$Companion0.getSetModifier());
            BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
            if(notificationItem0 instanceof Notification) {
                composer0.startReplaceGroup(0x81C3A27C);
                composer0.startReplaceGroup(-899600520);
                boolean z1 = composer0.changed(notificationItem0);
                MutableState mutableState0 = composer0.rememberedValue();
                if(z1 || mutableState0 == Composer.Companion.getEmpty()) {
                    mutableState0 = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(((Notification)notificationItem0).getRead()), null, 2, null);
                    composer0.updateRememberedValue(mutableState0);
                }
                composer0.endReplaceGroup();
                HapticFeedback hapticFeedback0 = (HapticFeedback)composer0.consume(CompositionLocalsKt.getLocalHapticFeedback());
                NotificationListKt.access$Notification(Notification.copy$default(((Notification)notificationItem0), null, ((Boolean)mutableState0.getValue()).booleanValue(), null, null, null, null, null, null, 0xFD, null), new n(notificationViewModel0, notificationItem0, mutableState0), new o(hapticFeedback0, notificationViewModel0, notificationItem0), composer0, 8, 0);
            }
            else if(notificationItem0 instanceof Empty) {
                composer0.startReplaceGroup(0x81D046F5);
                CommonEmptyViewKt.CommonEmptyView(string.label_notification_empty, PaddingKt.PaddingValues-a9UjIt4(20.0f, 40.0f, 20.0f, 6.0f), composer0, 0, 0);
            }
            else {
                composer0.startReplaceGroup(0x81D7C990);
            }
            composer0.endReplaceGroup();
            composer0.startReplaceGroup(0xCA61D382);
            if(z) {
                DividerKt.HorizontalDivider-9IZ8Weo(boxScopeInstance0.align(modifier$Companion0, alignment$Companion0.getBottomCenter()), 0.5f, ColorResources_androidKt.colorResource(color.gray4, composer0, 0), composer0, 0x30, 0);
            }
            composer0.endReplaceGroup();
            composer0.endNode();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

