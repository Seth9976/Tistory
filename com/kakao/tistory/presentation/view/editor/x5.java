package com.kakao.tistory.presentation.view.editor;

import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.DividerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.lifecycle.compose.FlowExtKt;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.design.ui.list.m;
import com.kakao.tistory.presentation.viewmodel.EditorTagViewModel;
import d;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class x5 extends Lambda implements Function2 {
    public final EditorTagViewModel a;
    public final EditorTagFragment b;

    public x5(EditorTagViewModel editorTagViewModel0, EditorTagFragment editorTagFragment0) {
        this.a = editorTagViewModel0;
        this.b = editorTagFragment0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Composer composer0 = (Composer)object0;
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x6AFBC59E, v, -1, "com.kakao.tistory.presentation.view.editor.EditorTagFragment.TagScreen.<anonymous> (EditorTagFragment.kt:97)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = ScrollKt.verticalScroll$default(BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null), ColorResources_androidKt.colorResource(color.white, composer0, 0), null, 2, null), ScrollKt.rememberScrollState(0, composer0, 0, 1), false, null, false, 14, null);
        EditorTagViewModel editorTagViewModel0 = this.a;
        EditorTagFragment editorTagFragment0 = this.b;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer0, 0);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer0, modifier0);
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
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            d.a(v1, composer0, v1, function20);
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 13.0f), composer0, 6);
        State state0 = LiveDataAdapterKt.observeAsState(editorTagViewModel0.getInputTagList(), CollectionsKt__CollectionsKt.emptyList(), composer0, 56);
        State state1 = FlowExtKt.collectAsStateWithLifecycle(editorTagViewModel0.getEnableEditField(), Boolean.FALSE, null, null, null, composer0, 56, 14);
        List list0 = (List)state0.getValue();
        Intrinsics.checkNotNullExpressionValue(list0, "invoke$lambda$4$lambda$0(...)");
        EditorTagFragment.access$TagList(editorTagFragment0, list0, ((Boolean)state1.getValue()).booleanValue(), new t5(editorTagViewModel0), new u5(editorTagViewModel0), composer0, 0x8008);
        DividerKt.Divider-oMI9zvI(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 15.0f, 0.0f, 0.0f, 13, null), ColorResources_androidKt.colorResource(color.gray4, composer0, 0), 0.5f, 0.0f, composer0, 390, 8);
        State state2 = LiveDataAdapterKt.observeAsState(editorTagViewModel0.getRecentTagList(), CollectionsKt__CollectionsKt.emptyList(), composer0, 56);
        composer0.startReplaceGroup(0x6F160993);
        List list1 = (List)state2.getValue();
        Intrinsics.checkNotNullExpressionValue(list1, "invoke$lambda$4$lambda$2(...)");
        if(!list1.isEmpty()) {
            Object object2 = state2.getValue();
            Intrinsics.checkNotNullExpressionValue(((List)object2), "invoke$lambda$4$lambda$2(...)");
            v5 v50 = new v5(editorTagViewModel0);
            composer0.startReplaceGroup(0x6F162425);
            boolean z = composer0.changed(state0);
            w5 w50 = composer0.rememberedValue();
            if(z || w50 == Composer.Companion.getEmpty()) {
                w50 = new w5(state0);
                composer0.updateRememberedValue(w50);
            }
            composer0.endReplaceGroup();
            EditorTagFragment.access$RecentTagList(editorTagFragment0, ((List)object2), v50, w50, composer0, 0x1008);
        }
        if(m.a(composer0)) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

