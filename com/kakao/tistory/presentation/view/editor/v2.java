package com.kakao.tistory.presentation.view.editor;

import a;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.design.ui.list.m;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class v2 extends Lambda implements Function3 {
    public final boolean a;
    public final EditorSettingFragment b;
    public final EditorViewModel c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public v2(boolean z, EditorSettingFragment editorSettingFragment0, EditorViewModel editorViewModel0, String s, boolean z1, boolean z2) {
        this.a = z;
        this.b = editorSettingFragment0;
        this.c = editorViewModel0;
        this.d = s;
        this.e = z1;
        this.f = z2;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        boolean z3;
        EditorViewModel editorViewModel1;
        Companion modifier$Companion1;
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$ItemContainer");
        if((v & 81) == 16 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-883370708, v, -1, "com.kakao.tistory.presentation.view.editor.EditorSettingFragment.PublishDateContainer.<anonymous> (EditorSettingFragment.kt:560)");
        }
        boolean z = this.a;
        EditorSettingFragment editorSettingFragment0 = this.b;
        EditorViewModel editorViewModel0 = this.c;
        String s = this.d;
        boolean z1 = this.e;
        boolean z2 = this.f;
        Companion modifier$Companion0 = Modifier.Companion;
        Arrangement arrangement0 = Arrangement.INSTANCE;
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer0, 0);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
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
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            d.a(v1, composer0, v1, function20);
        }
        Updater.set-impl(composer0, modifier0, composeUiNode$Companion0.getSetModifier());
        ColumnScopeInstance columnScopeInstance0 = ColumnScopeInstance.INSTANCE;
        Modifier modifier1 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 14.0f, 0.0f, 0.0f, 13, null);
        MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer0, 0x30);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap1 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier2 = ComposedModifierKt.materializeModifier(composer0, modifier1);
        Function0 function01 = composeUiNode$Companion0.getConstructor();
        if(composer0.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function01);
        }
        else {
            composer0.useNode();
        }
        Function2 function21 = a.a(composeUiNode$Companion0, composer0, measurePolicy1, composer0, compositionLocalMap1);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            d.a(v2, composer0, v2, function21);
        }
        Updater.set-impl(composer0, modifier2, composeUiNode$Companion0.getSetModifier());
        EditorSettingFragment.access$TitleText(editorSettingFragment0, string.label_editor_setting_publish_date, composer0, 0x40);
        SpacerKt.Spacer(RowScope.weight$default(RowScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), composer0, 0);
        composer0.startReplaceGroup(0x5EE00CE);
        if(s == null) {
            modifier$Companion1 = modifier$Companion0;
            editorViewModel1 = editorViewModel0;
            z3 = z1;
        }
        else {
            modifier$Companion1 = modifier$Companion0;
            editorViewModel1 = editorViewModel0;
            z3 = z1;
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, ModifierKt.noRippleClickable(modifier$Companion0, new s2(editorViewModel0)), ColorResources_androidKt.colorResource((z2 ? color.gray1 : color.gray2), composer0, 0), 0x141600000L, null, (z2 ? FontWeight.Companion.getNormal() : FontWeight.Companion.getLight()), TypeKt.getTFont(), 0L, null, null, 0L, 0, false, false, 0, 0, null, null, composer0, 0x180C00, 0, 0x3FF90);
            EditorSettingFragment.access$VerticalLine(editorSettingFragment0, composer0, 8);
        }
        composer0.endReplaceGroup();
        EditorSettingFragment.access$DateSelectItem(editorSettingFragment0, z3, string.label_editor_setting_publish_now, new t2(editorViewModel1), composer0, 0x1000);
        EditorSettingFragment.access$VerticalLine(editorSettingFragment0, composer0, 8);
        EditorSettingFragment.access$DateSelectItem(editorSettingFragment0, z, string.label_editor_setting_publish_reserve, new u2(editorViewModel1), composer0, 0x1000);
        composer0.endNode();
        composer0.startReplaceGroup(-928809099);
        if(z) {
            EditorSettingFragment.access$ReserveTimeContainer(editorSettingFragment0, columnScopeInstance0.align(PaddingKt.padding-qDBjuR0$default(modifier$Companion1, 0.0f, 12.0f, 0.0f, 0.0f, 13, null), alignment$Companion0.getEnd()), editorViewModel1, composer0, 0x240, 0);
        }
        if(m.a(composer0)) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

