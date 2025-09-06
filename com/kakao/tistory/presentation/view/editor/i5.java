package com.kakao.tistory.presentation.view.editor;

import a;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i5 extends Lambda implements Function3 {
    public final MutableState a;

    public i5(MutableState mutableState0) {
        this.a = mutableState0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v2;
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((Function2)object0), "innerTextField");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changedInstance(((Function2)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE0A732B5, v, -1, "com.kakao.tistory.presentation.view.editor.EditorTagFragment.TagInput.<anonymous>.<anonymous> (EditorTagFragment.kt:272)");
        }
        MutableState mutableState0 = this.a;
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenterStart(), false);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object1), 0);
        CompositionLocalMap compositionLocalMap0 = ((Composer)object1).getCurrentCompositionLocalMap();
        Modifier modifier0 = ComposedModifierKt.materializeModifier(((Composer)object1), Modifier.Companion);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(((Composer)object1).getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        ((Composer)object1).startReusableNode();
        if(((Composer)object1).getInserting()) {
            ((Composer)object1).createNode(function00);
        }
        else {
            ((Composer)object1).useNode();
        }
        Composer composer0 = Updater.constructor-impl(((Composer)object1));
        Function2 function20 = a.a(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            d.a(v1, composer0, v1, function20);
        }
        r0.a.z(composeUiNode$Companion0, composer0, modifier0, ((Composer)object1), 0x100C2FE0);
        if(EditorTagFragment.access$TagInput$lambda$5(mutableState0).length() == 0) {
            v2 = v;
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(StringResources_androidKt.stringResource(string.label_editor_setting_tag_input, ((Composer)object1), 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, TextStyle.copy-p1EtxEg$default(MaterialTheme.INSTANCE.getTypography(((Composer)object1), MaterialTheme.$stable).getBody1(), ColorResources_androidKt.colorResource(color.gray9, ((Composer)object1), 0), 0x141700000L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFC, null), ((Composer)object1), 0, 0, 0x1FFFE);
        }
        else {
            v2 = v;
        }
        ((Composer)object1).endReplaceGroup();
        ((Function2)object0).invoke(((Composer)object1), ((int)(v2 & 14)));
        ((Composer)object1).endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

