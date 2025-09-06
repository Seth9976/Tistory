package com.kakao.tistory.presentation.view.editor;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q5 extends Lambda implements Function2 {
    public final List a;
    public final boolean b;
    public final EditorTagFragment c;
    public final Function1 d;
    public final Function0 e;
    public final MutableState f;

    public q5(List list0, boolean z, EditorTagFragment editorTagFragment0, Function1 function10, Function0 function00, MutableState mutableState0) {
        this.a = list0;
        this.b = z;
        this.c = editorTagFragment0;
        this.d = function10;
        this.e = function00;
        this.f = mutableState0;
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
            ComposerKt.traceEventStart(-1433623770, v, -1, "com.kakao.tistory.presentation.view.editor.EditorTagFragment.TagList.<anonymous> (EditorTagFragment.kt:152)");
        }
        composer0.startReplaceGroup(599508707);
        EditorTagFragment editorTagFragment0 = this.c;
        MutableState mutableState0 = this.f;
        for(Object object2: this.a) {
            String s = (String)object2;
            boolean z = Intrinsics.areEqual(EditorTagFragment.access$TagList$lambda$1(mutableState0), s);
            composer0.startReplaceGroup(0xEAFB6F3F);
            boolean z1 = composer0.changed(s);
            m5 m50 = composer0.rememberedValue();
            if(z1 || m50 == Composer.Companion.getEmpty()) {
                m50 = new m5(s, mutableState0);
                composer0.updateRememberedValue(m50);
            }
            composer0.endReplaceGroup();
            editorTagFragment0.a(s, z, m50, composer0, 0x1000);
        }
        composer0.endReplaceGroup();
        if(this.b) {
            composer0.startReplaceGroup(0x53C005F9);
            String s1 = EditorTagFragment.access$TagList$lambda$1(this.f);
            EditorTagFragment.access$TagInput(this.c, Modifier.Companion, s1, this.d, this.e, composer0, 0x8006, 0);
        }
        else {
            composer0.startReplaceGroup(1405322707);
            Object object3 = composer0.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            composer0.startReplaceGroup(0x23BC061D);
            FocusRequester focusRequester0 = composer0.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(focusRequester0 == composer$Companion0.getEmpty()) {
                focusRequester0 = new FocusRequester();
                composer0.updateRememberedValue(focusRequester0);
            }
            composer0.endReplaceGroup();
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            composer0.startReplaceGroup(0x23BC18FC);
            boolean z2 = composer0.changed(this.e);
            Function0 function00 = this.e;
            n5 n50 = composer0.rememberedValue();
            if(z2 || n50 == composer$Companion0.getEmpty()) {
                n50 = new n5(function00);
                composer0.updateRememberedValue(n50);
            }
            composer0.endReplaceGroup();
            Modifier modifier0 = FocusRequesterModifierKt.focusRequester(SizeKt.height-3ABfNKs(KeyInputModifierKt.onPreviewKeyEvent(modifier$Companion0, n50), 0.0f), focusRequester0);
            BasicTextFieldKt.BasicTextField("", o5.a, modifier0, false, false, null, null, null, false, 0, 0, null, null, null, null, null, composer0, 54, 0, 0xFFF8);
            String s2 = EditorTagFragment.access$TagList$lambda$1(this.f);
            composer0.startReplaceGroup(0x23BC4B90);
            boolean z3 = composer0.changed(((SoftwareKeyboardController)object3));
            MutableState mutableState1 = this.f;
            p5 p50 = composer0.rememberedValue();
            if(z3 || p50 == composer$Companion0.getEmpty()) {
                p50 = new p5(focusRequester0, ((SoftwareKeyboardController)object3), mutableState1, null);
                composer0.updateRememberedValue(p50);
            }
            composer0.endReplaceGroup();
            EffectsKt.LaunchedEffect(s2, p50, composer0, 0x40);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

