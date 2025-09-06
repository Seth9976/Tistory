package com.kakao.tistory.presentation.view.entry.widget;

import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.material.ButtonColors;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString.Builder;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import c;
import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import com.kakao.tistory.presentation.widget.common.FunctionStateKt;
import d;
import e;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001A\u0091\u0001\u0010\u0013\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\u0014\b\u0002\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00052\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\f\u001A\u00020\b2\b\b\u0002\u0010\u000E\u001A\u00020\r2\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001A\u0087\u0001\u0010\u001A\u001A\u00020\u00032\b\b\u0002\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0001\u001A\u00020\u00002\u0014\b\u0002\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\u000E\u001A\u00020\r2\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00030\u00182\u0012\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u001A\u0010\u001B¨\u0006!²\u0006\u000E\u0010\u001C\u001A\u00020\b8\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\u001C\u001A\u00020\b8\n@\nX\u008A\u008E\u0002²\u0006\u0010\u0010\u001E\u001A\u0004\u0018\u00010\u001D8\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010 \u001A\u00020\u001F8\n@\nX\u008A\u008E\u0002"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "Lkotlin/Function1;", "", "setTextFieldValue", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "parent", "mention", "", "isSecret", "", "hintText", "enabled", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "Lcom/kakao/tistory/presentation/view/entry/widget/ReplyType;", "onClickRemove", "Lcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;", "onClickComplete", "CommentEditField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;ZLjava/lang/String;ZLandroidx/compose/ui/focus/FocusRequester;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "modifier", "showSecretButton", "Lkotlin/Function0;", "removeMention", "CommentModifyEditField", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;ZZLjava/lang/String;Landroidx/compose/ui/focus/FocusRequester;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "secret", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "", "height", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCommentEditField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommentEditField.kt\ncom/kakao/tistory/presentation/view/entry/widget/CommentEditFieldKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 11 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 12 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,435:1\n1223#2,6:436\n1223#2,6:480\n1223#2,6:523\n1223#2,6:566\n1223#2,6:585\n1223#2,6:666\n1223#2,6:774\n1223#2,6:780\n1223#2,6:786\n1223#2,6:793\n1223#2,6:799\n1223#2,6:805\n1223#2,6:811\n77#3:442\n77#3:591\n85#4:443\n81#4,7:444\n88#4:479\n92#4:584\n85#4:593\n82#4,6:594\n88#4:628\n92#4:680\n78#5,6:451\n85#5,4:466\n89#5,2:476\n78#5,6:494\n85#5,4:509\n89#5,2:519\n78#5,6:537\n85#5,4:552\n89#5,2:562\n93#5:575\n93#5:579\n93#5:583\n78#5,6:600\n85#5,4:615\n89#5,2:625\n78#5,6:637\n85#5,4:652\n89#5,2:662\n93#5:675\n93#5:679\n78#5,6:689\n85#5,4:704\n89#5,2:714\n78#5,6:728\n85#5,4:743\n89#5,2:753\n93#5:767\n93#5:771\n368#6,9:457\n377#6:478\n368#6,9:500\n377#6:521\n368#6,9:543\n377#6:564\n378#6,2:573\n378#6,2:577\n378#6,2:581\n368#6,9:606\n377#6:627\n368#6,9:643\n377#6:664\n378#6,2:673\n378#6,2:677\n368#6,9:695\n377#6:716\n368#6,9:734\n377#6:755\n378#6,2:765\n378#6,2:769\n4032#7,6:470\n4032#7,6:513\n4032#7,6:556\n4032#7,6:619\n4032#7,6:656\n4032#7,6:708\n4032#7,6:747\n148#8:486\n148#8:529\n148#8:572\n148#8:592\n148#8:629\n148#8:672\n158#8:718\n148#8:719\n148#8:720\n148#8:764\n148#8:792\n148#8:817\n148#8:818\n148#8:819\n98#9:487\n95#9,6:488\n101#9:522\n98#9:530\n95#9,6:531\n101#9:565\n105#9:576\n105#9:580\n98#9:630\n95#9,6:631\n101#9:665\n105#9:676\n98#9:721\n95#9,6:722\n101#9:756\n105#9:768\n71#10:681\n67#10,7:682\n74#10:717\n78#10:772\n1240#11:757\n1039#11,6:758\n1#12:773\n81#13:820\n107#13,2:821\n81#13:823\n107#13,2:824\n81#13:826\n107#13,2:827\n81#13:829\n107#13,2:830\n*S KotlinDebug\n*F\n+ 1 CommentEditField.kt\ncom/kakao/tistory/presentation/view/entry/widget/CommentEditFieldKt\n*L\n78#1:436,6\n84#1:480,6\n99#1:523,6\n125#1:566,6\n147#1:585,6\n184#1:666,6\n305#1:774,6\n310#1:780,6\n317#1:786,6\n342#1:793,6\n349#1:799,6\n377#1:805,6\n396#1:811,6\n80#1:442\n148#1:591\n82#1:443\n82#1:444,7\n82#1:479\n82#1:584\n150#1:593\n150#1:594,6\n150#1:628\n150#1:680\n82#1:451,6\n82#1:466,4\n82#1:476,2\n87#1:494,6\n87#1:509,4\n87#1:519,2\n106#1:537,6\n106#1:552,4\n106#1:562,2\n106#1:575\n87#1:579\n82#1:583\n150#1:600,6\n150#1:615,4\n150#1:625,2\n167#1:637,6\n167#1:652,4\n167#1:662,2\n167#1:675\n150#1:679\n195#1:689,6\n195#1:704,4\n195#1:714,2\n197#1:728,6\n197#1:743,4\n197#1:753,2\n197#1:767\n195#1:771\n82#1:457,9\n82#1:478\n87#1:500,9\n87#1:521\n106#1:543,9\n106#1:564\n106#1:573,2\n87#1:577,2\n82#1:581,2\n150#1:606,9\n150#1:627\n167#1:643,9\n167#1:664\n167#1:673,2\n150#1:677,2\n195#1:695,9\n195#1:716\n197#1:734,9\n197#1:755\n197#1:765,2\n195#1:769,2\n82#1:470,6\n87#1:513,6\n106#1:556,6\n150#1:619,6\n167#1:656,6\n195#1:708,6\n197#1:747,6\n87#1:486\n108#1:529\n126#1:572\n153#1:592\n168#1:629\n185#1:672\n196#1:718\n199#1:719\n201#1:720\n218#1:764\n341#1:792\n415#1:817\n421#1:818\n424#1:819\n87#1:487\n87#1:488,6\n87#1:522\n106#1:530\n106#1:531,6\n106#1:565\n106#1:576\n87#1:580\n167#1:630\n167#1:631,6\n167#1:665\n167#1:676\n197#1:721\n197#1:722,6\n197#1:756\n197#1:768\n195#1:681\n195#1:682,7\n195#1:717\n195#1:772\n204#1:757\n205#1:758,6\n78#1:820\n78#1:821,2\n147#1:823\n147#1:824,2\n310#1:826\n310#1:827,2\n317#1:829\n317#1:830,2\n*E\n"})
public final class CommentEditFieldKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void CommentEditField(@NotNull TextFieldValue textFieldValue0, @Nullable Function1 function10, @Nullable CommentItem commentItemType$CommentItem0, @Nullable CommentItem commentItemType$CommentItem1, boolean z, @NotNull String s, boolean z1, @Nullable FocusRequester focusRequester0, @NotNull Function1 function11, @NotNull Function1 function12, @Nullable Composer composer0, int v, int v1) {
        CommentItem commentItemType$CommentItem3;
        boolean z3;
        FocusRequester focusRequester1;
        Function1 function13;
        CommentItem commentItemType$CommentItem2;
        CommentItem commentItemType$CommentItem5;
        CommentItem commentItemType$CommentItem4;
        boolean z4;
        FocusRequester focusRequester2;
        Function1 function14;
        boolean z2;
        int v2;
        Intrinsics.checkNotNullParameter(textFieldValue0, "textFieldValue");
        Intrinsics.checkNotNullParameter(s, "hintText");
        Intrinsics.checkNotNullParameter(function11, "onClickRemove");
        Intrinsics.checkNotNullParameter(function12, "onClickComplete");
        Composer composer1 = composer0.startRestartGroup(-928789805);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? v | (composer1.changed(textFieldValue0) ? 4 : 2) : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x80;
        }
        if((v1 & 8) != 0) {
            v2 |= 0x400;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0xE000) == 0) {
            v2 |= (composer1.changed(z) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x70000) == 0) {
            v2 |= (composer1.changed(s) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) == 0) {
            z2 = z1;
            if((v & 0x380000) == 0) {
                v2 |= (composer1.changed(z2) ? 0x100000 : 0x80000);
            }
        }
        else {
            v2 |= 0x180000;
            z2 = z1;
        }
        if((v & 0x1C00000) == 0) {
            v2 |= ((v1 & 0x80) != 0 || !composer1.changed(focusRequester0) ? 0x400000 : 0x800000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0xE000000) == 0) {
            v2 |= (composer1.changedInstance(function11) ? 0x4000000 : 0x2000000);
        }
        if((v1 & 0x200) != 0) {
            v2 |= 0x30000000;
        }
        else if((v & 0x70000000) == 0) {
            v2 |= (composer1.changedInstance(function12) ? 0x20000000 : 0x10000000);
        }
        if((v1 & 12) != 12 || (0x5B6DB6DB & v2) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Function1 function15 = (v1 & 2) == 0 ? function10 : n.a;
                CommentItem commentItemType$CommentItem6 = (v1 & 4) == 0 ? commentItemType$CommentItem0 : null;
                CommentItem commentItemType$CommentItem7 = (v1 & 8) == 0 ? commentItemType$CommentItem1 : null;
                if((v1 & 0x40) != 0) {
                    z2 = true;
                }
                if((v1 & 0x80) == 0) {
                    function14 = function15;
                    focusRequester2 = focusRequester0;
                    z4 = z2;
                    commentItemType$CommentItem4 = commentItemType$CommentItem6;
                    commentItemType$CommentItem5 = commentItemType$CommentItem7;
                }
                else {
                    v2 &= 0xFE3FFFFF;
                    function14 = function15;
                    commentItemType$CommentItem5 = commentItemType$CommentItem7;
                    focusRequester2 = FocusRequester.Companion.getDefault();
                    z4 = z2;
                    commentItemType$CommentItem4 = commentItemType$CommentItem6;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x80) != 0) {
                    v2 &= 0xFE3FFFFF;
                }
                function14 = function10;
                focusRequester2 = focusRequester0;
                z4 = z2;
                commentItemType$CommentItem4 = commentItemType$CommentItem0;
                commentItemType$CommentItem5 = commentItemType$CommentItem1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-928789805, v2, -1, "com.kakao.tistory.presentation.view.entry.widget.CommentEditField (CommentEditField.kt:68)");
            }
            Pair pair0 = (Pair)SnapshotStateKt.derivedStateOf(new o(commentItemType$CommentItem5, commentItemType$CommentItem4)).getValue();
            ReplyType replyType0 = (ReplyType)pair0.component1();
            CommentItem commentItemType$CommentItem8 = (CommentItem)pair0.component2();
            composer1.startReplaceGroup(0x1CF032F3);
            MutableState mutableState0 = composer1.rememberedValue();
            if((v2 & 0xE000) == 0x4000 || mutableState0 == Composer.Companion.getEmpty()) {
                MutableState mutableState1 = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
                composer1.updateRememberedValue(mutableState1);
                mutableState0 = mutableState1;
            }
            composer1.endReplaceGroup();
            Object object0 = composer1.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            Companion modifier$Companion0 = Modifier.Companion;
            Arrangement arrangement0 = Arrangement.INSTANCE;
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function00);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            r0.a.z(composeUiNode$Companion0, composer1, modifier0, composer1, 0xC7F8F262);
            if(commentItemType$CommentItem8 != null) {
                String s1 = commentItemType$CommentItem8.getWriterName();
                if(s1 == null) {
                    s1 = "";
                }
                composer1.startReplaceGroup(1088200382);
                boolean z5 = composer1.changed(replyType0);
                p p0 = composer1.rememberedValue();
                if(z5 || (v2 & 0xE000000) == 0x4000000 || p0 == Composer.Companion.getEmpty()) {
                    p0 = new p(function11, replyType0);
                    composer1.updateRememberedValue(p0);
                }
                composer1.endReplaceGroup();
                CommentEditFieldKt.a(s1, p0, composer1, 0);
            }
            composer1.endReplaceGroup();
            Modifier modifier1 = PaddingKt.padding-VpY3zN4$default(modifier$Companion0, 20.0f, 0.0f, 2, null);
            MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getTop(), composer1, 0);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
            Function0 function01 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function01);
            }
            else {
                composer1.useNode();
            }
            Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                d.a(v4, composer1, v4, function21);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
            Modifier modifier3 = FocusRequesterModifierKt.focusRequester(rowScopeInstance0.align(RowScope.weight$default(rowScopeInstance0, modifier$Companion0, 1.0f, false, 2, null), alignment$Companion0.getCenterVertically()), focusRequester2);
            String s2 = commentItemType$CommentItem5 == null ? null : commentItemType$CommentItem5.getWriterName();
            composer1.startReplaceGroup(0x40DCE936);
            boolean z6 = composer1.changed(replyType0);
            q q0 = composer1.rememberedValue();
            if(z6 || (v2 & 0xE000000) == 0x4000000 || q0 == Composer.Companion.getEmpty()) {
                q0 = new q(replyType0, function11);
                composer1.updateRememberedValue(q0);
            }
            composer1.endReplaceGroup();
            focusRequester1 = focusRequester2;
            CommentEditFieldKt.a(modifier3, textFieldValue0, function14, 4, s, z4, s2, q0, composer1, v2 << 3 & 0x380 | (v2 << 3 & 0x70 | 0xC00) | v2 >> 3 & 0xE000 | v2 >> 3 & 0x70000, 0);
            Modifier modifier4 = rowScopeInstance0.align(SizeKt.heightIn-VpY3zN4$default(modifier$Companion0, 52.0f, 0.0f, 2, null), alignment$Companion0.getBottom());
            MeasurePolicy measurePolicy2 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
            Function0 function02 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function02);
            }
            else {
                composer1.useNode();
            }
            Function2 function22 = a.a(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap2);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                d.a(v5, composer1, v5, function22);
            }
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
            Function0 function03 = FunctionStateKt.rememberImmutableFunctionState(new s(((SoftwareKeyboardController)object0), function12, commentItemType$CommentItem4, commentItemType$CommentItem5, textFieldValue0, mutableState0), composer1, 0);
            boolean z7 = ((Boolean)mutableState0.getValue()).booleanValue();
            composer1.startReplaceGroup(0x4371BB30);
            boolean z8 = composer1.changed(mutableState0);
            r r0 = composer1.rememberedValue();
            if(z8 || r0 == Composer.Companion.getEmpty()) {
                r0 = new r(mutableState0);
                composer1.updateRememberedValue(r0);
            }
            composer1.endReplaceGroup();
            CommentEditFieldKt.a(z7, r0, composer1, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 4.0f), composer1, 6);
            CommentEditFieldKt.a(!kotlin.text.p.isBlank(textFieldValue0.getText()), function03, composer1, 0);
            composer1.endNode();
            composer1.endNode();
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function13 = function14;
            commentItemType$CommentItem2 = commentItemType$CommentItem5;
            commentItemType$CommentItem3 = commentItemType$CommentItem4;
            z3 = z4;
        }
        else {
            composer1.skipToGroupEnd();
            commentItemType$CommentItem2 = commentItemType$CommentItem1;
            function13 = function10;
            focusRequester1 = focusRequester0;
            z3 = z2;
            commentItemType$CommentItem3 = commentItemType$CommentItem0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t(textFieldValue0, function13, commentItemType$CommentItem3, commentItemType$CommentItem2, z, s, z3, focusRequester1, function11, function12, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void CommentModifyEditField(@Nullable Modifier modifier0, @NotNull TextFieldValue textFieldValue0, @Nullable Function1 function10, @Nullable CommentItem commentItemType$CommentItem0, boolean z, boolean z1, @NotNull String s, @Nullable FocusRequester focusRequester0, @NotNull Function0 function00, @NotNull Function1 function11, @Nullable Composer composer0, int v, int v1) {
        FocusRequester focusRequester2;
        CommentItem commentItemType$CommentItem1;
        Function1 function12;
        Modifier modifier1;
        MutableState mutableState2;
        CommentItem commentItemType$CommentItem2;
        Function1 function13;
        Modifier modifier2;
        int v3;
        FocusRequester focusRequester1;
        int v2;
        Intrinsics.checkNotNullParameter(textFieldValue0, "textFieldValue");
        Intrinsics.checkNotNullParameter(s, "hintText");
        Intrinsics.checkNotNullParameter(function00, "removeMention");
        Intrinsics.checkNotNullParameter(function11, "onClickComplete");
        Composer composer1 = composer0.startRestartGroup(0x1B621999);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(textFieldValue0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0x400;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0xE000) == 0) {
            v2 |= (composer1.changed(z) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x70000) == 0) {
            v2 |= (composer1.changed(z1) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x380000) == 0) {
            v2 |= (composer1.changed(s) ? 0x100000 : 0x80000);
        }
        if((v & 0x1C00000) == 0) {
            if((v1 & 0x80) == 0) {
                focusRequester1 = focusRequester0;
                v3 = composer1.changed(focusRequester1) ? 0x800000 : 0x400000;
            }
            else {
                focusRequester1 = focusRequester0;
                v3 = 0x400000;
            }
            v2 |= v3;
        }
        else {
            focusRequester1 = focusRequester0;
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((0xE000000 & v) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x4000000 : 0x2000000);
        }
        if((v1 & 0x200) != 0) {
            v2 |= 0x30000000;
        }
        else if((0x70000000 & v) == 0) {
            v2 |= (composer1.changedInstance(function11) ? 0x20000000 : 0x10000000);
        }
        if((v1 & 8) != 8 || (0x5B6DB6DB & v2) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
                Function1 function14 = (v1 & 4) == 0 ? function10 : u.a;
                if((v1 & 0x80) != 0) {
                    focusRequester1 = FocusRequester.Companion.getDefault();
                    v2 &= 0xFE3FFFFF;
                }
                modifier2 = modifier3;
                function13 = function14;
                commentItemType$CommentItem2 = (v1 & 8) == 0 ? commentItemType$CommentItem0 : null;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x80) != 0) {
                    v2 &= 0xFE3FFFFF;
                }
                modifier2 = modifier0;
                function13 = function10;
                commentItemType$CommentItem2 = commentItemType$CommentItem0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x1B621999, v2, -1, "com.kakao.tistory.presentation.view.entry.widget.CommentModifyEditField (CommentEditField.kt:145)");
            }
            composer1.startReplaceGroup(-130000615);
            MutableState mutableState0 = composer1.rememberedValue();
            if((v2 & 0x70000) == 0x20000 || mutableState0 == Composer.Companion.getEmpty()) {
                MutableState mutableState1 = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z1), null, 2, null);
                composer1.updateRememberedValue(mutableState1);
                mutableState0 = mutableState1;
            }
            composer1.endReplaceGroup();
            Object object0 = composer1.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            Modifier modifier4 = PaddingKt.padding-VpY3zN4$default(BackgroundKt.background-bw27NRU$default(modifier2, ColorResources_androidKt.colorResource(color.white, composer1, 0), null, 2, null), 20.0f, 0.0f, 2, null);
            Arrangement arrangement0 = Arrangement.INSTANCE;
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function01 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function01);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting()) {
                mutableState2 = mutableState0;
                d.a(v4, composer1, v4, function20);
            }
            else {
                mutableState2 = mutableState0;
                if(!Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                    d.a(v4, composer1, v4, function20);
                }
            }
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
            Companion modifier$Companion0 = Modifier.Companion;
            CommentEditFieldKt.a(FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), 0.0f, 1, null), focusRequester1), textFieldValue0, function13, 0, s, false, (commentItemType$CommentItem2 == null ? null : commentItemType$CommentItem2.getWriterName()), function00, composer1, v2 & 0x3F0 | v2 >> 6 & 0xE000 | v2 >> 3 & 0x1C00000, 40);
            Modifier modifier6 = SizeKt.heightIn-VpY3zN4$default(modifier$Companion0, 52.0f, 0.0f, 2, null);
            MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier7 = ComposedModifierKt.materializeModifier(composer1, modifier6);
            Function0 function02 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function02);
            }
            else {
                composer1.useNode();
            }
            Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                d.a(v5, composer1, v5, function21);
            }
            Updater.set-impl(composer1, modifier7, composeUiNode$Companion0.getSetModifier());
            Function0 function03 = FunctionStateKt.rememberImmutableFunctionState(new w(((SoftwareKeyboardController)object0), function11, commentItemType$CommentItem2, textFieldValue0, mutableState2), composer1, 0);
            SpacerKt.Spacer(RowScope.weight$default(RowScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), composer1, 0);
            composer1.startReplaceGroup(0xEFDD72A1);
            if(z) {
                boolean z2 = ((Boolean)mutableState2.getValue()).booleanValue();
                composer1.startReplaceGroup(0xEFDD7A97);
                boolean z3 = composer1.changed(mutableState2);
                v v6 = composer1.rememberedValue();
                if(z3 || v6 == Composer.Companion.getEmpty()) {
                    v6 = new v(mutableState2);
                    composer1.updateRememberedValue(v6);
                }
                composer1.endReplaceGroup();
                CommentEditFieldKt.a(z2, v6, composer1, 0);
                c.a(4.0f, modifier$Companion0, composer1, 6);
            }
            composer1.endReplaceGroup();
            CommentEditFieldKt.a(!kotlin.text.p.isBlank(textFieldValue0.getText()), function03, composer1, 0);
            composer1.endNode();
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            focusRequester2 = focusRequester1;
            modifier1 = modifier2;
            function12 = function13;
            commentItemType$CommentItem1 = commentItemType$CommentItem2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            function12 = function10;
            commentItemType$CommentItem1 = commentItemType$CommentItem0;
            focusRequester2 = focusRequester1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new x(modifier1, textFieldValue0, function12, commentItemType$CommentItem1, z, z1, s, focusRequester2, function00, function11, v, v1));
        }
    }

    public static final void a(Modifier modifier0, TextFieldValue textFieldValue0, Function1 function10, int v, String s, boolean z, String s1, Function0 function00, Composer composer0, int v1, int v2) {
        boolean z1;
        int v4;
        int v6;
        z1 z10;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0xD0878B50);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changed(textFieldValue0) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v3 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v3 |= (composer1.changed(v) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((0xE000 & v1) == 0) {
            v3 |= (composer1.changed(s) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v1 & 0x70000) == 0) {
            v3 |= (composer1.changed(z) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x40) != 0) {
            v3 |= 0x180000;
        }
        else if((v1 & 0x380000) == 0) {
            v3 |= (composer1.changed(s1) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x80) != 0) {
            v3 |= 0xC00000;
        }
        else if((v1 & 0x1C00000) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x800000 : 0x400000);
        }
        if((0x16DB6DB & v3) != 4793490 || !composer1.getSkipping()) {
            int v5 = (v2 & 8) == 0 ? v : 0x7FFFFFFF;
            boolean z2 = (v2 & 0x20) == 0 ? z : true;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD0878B50, v3, -1, "com.kakao.tistory.presentation.view.entry.widget.TextFieldWithMention (CommentEditField.kt:301)");
            }
            String s2 = s1 == null ? null : androidx.room.a.j(" @", StringUtils.INSTANCE.getEllipsisText(s1, 12));
            composer1.startReplaceGroup(363110062);
            boolean z3 = composer1.changed(s2);
            MentionVisualTransformation mentionVisualTransformation0 = composer1.rememberedValue();
            if(z3 || mentionVisualTransformation0 == Composer.Companion.getEmpty()) {
                mentionVisualTransformation0 = new MentionVisualTransformation((s2 == null ? "" : s2));
                composer1.updateRememberedValue(mentionVisualTransformation0);
            }
            composer1.endReplaceGroup();
            Object object0 = RememberSaveableKt.rememberSaveable(new Object[0], z1.e.getSaver(), null, h0.a, composer1, 0xC48, 4);
            composer1.startReplaceGroup(363117086);
            MutableState mutableState0 = composer1.rememberedValue();
            androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
            if(mutableState0 == composer$Companion0.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            composer1.endReplaceGroup();
            TextStyle textStyle0 = TextStyle.copy-p1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getH5(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x141A80000L, null, new PlatformTextStyle(false), null, 0, 0, null, 0xF5FFFF, null);
            composer1.startReplaceGroup(0x15A4D6E8);
            MutableState mutableState1 = composer1.rememberedValue();
            if(mutableState1 == composer$Companion0.getEmpty()) {
                MutableState mutableState2 = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                composer1.updateRememberedValue(mutableState2);
                mutableState1 = mutableState2;
            }
            composer1.endReplaceGroup();
            Modifier modifier1 = PaddingKt.padding-qDBjuR0$default(modifier0, 0.0f, 8.0f, 0.0f, 7.0f, 5, null);
            composer1.startReplaceGroup(0x15A54FC7);
            boolean z4 = composer1.changed(((z1)object0));
            boolean z5 = composer1.changed(mentionVisualTransformation0);
            c0 c00 = composer1.rememberedValue();
            if((z4 | z5 | ((v3 & 0x70) == 0x20 ? 1 : 0)) != 0 || c00 == composer$Companion0.getEmpty()) {
                z10 = (z1)object0;
                v6 = v3;
                c00 = new c0(mutableState1, mutableState0, z10, mentionVisualTransformation0, textFieldValue0);
                composer1.updateRememberedValue(c00);
            }
            else {
                z10 = (z1)object0;
                v6 = v3;
            }
            composer1.endReplaceGroup();
            Modifier modifier2 = OnRemeasuredModifierKt.onSizeChanged(modifier1, c00);
            composer1.startReplaceGroup(0x15A5679F);
            d0 d00 = composer1.rememberedValue();
            if((((v3 & 0x70) == 0x20 ? 1 : 0) | ((v6 & 0x1C00000) == 0x800000 ? 1 : 0)) != 0 || d00 == composer$Companion0.getEmpty()) {
                d00 = new d0(textFieldValue0, function00);
                composer1.updateRememberedValue(d00);
            }
            composer1.endReplaceGroup();
            Modifier modifier3 = MentionVisualTransformationKt.drawMention-xwkQ0AY(NestedScrollModifierKt.nestedScroll$default(KeyInputModifierKt.onPreviewKeyEvent(modifier2, d00), new CommentEditFieldKt.TextFieldWithMention.3(z10), null, 2, null), -z10.a(), mentionVisualTransformation0, ((TextLayoutResult)mutableState0.getValue()), ColorResources_androidKt.colorResource(color.gray4, composer1, 0));
            TextStyle textStyle1 = TextStyle.copy-p1EtxEg$default(textStyle0, ColorResources_androidKt.colorResource(color.gray1, composer1, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null);
            composer1.startReplaceGroup(0x15A5F97F);
            boolean z6 = composer1.changed(z10);
            boolean z7 = composer1.changed(mentionVisualTransformation0);
            e0 e00 = composer1.rememberedValue();
            if((z6 | z7 | ((v3 & 0x70) == 0x20 ? 1 : 0)) != 0 || e00 == composer$Companion0.getEmpty()) {
                e0 e01 = new e0(mutableState0, mutableState1, z10, mentionVisualTransformation0, textFieldValue0);
                composer1.updateRememberedValue(e01);
                e00 = e01;
            }
            composer1.endReplaceGroup();
            BasicTextFieldKt.BasicTextField(textFieldValue0, function10, modifier3, z2, false, textStyle1, null, null, false, v5, 0, mentionVisualTransformation0, e00, null, null, ComposableLambdaKt.rememberComposableLambda(0x9C62C15A, true, new f0(textFieldValue0, s2, textStyle0, s), composer1, 54), composer1, v6 >> 3 & 0x7E | v6 >> 6 & 0x1C00 | v6 << 18 & 0x70000000, 0x30000, 0x65D0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v4 = v5;
            z1 = z2;
        }
        else {
            composer1.skipToGroupEnd();
            v4 = v;
            z1 = z;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g0(modifier0, textFieldValue0, function10, v4, s, z1, s1, function00, v1, v2));
        }
    }

    public static final void a(String s, Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1180144998);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1180144998, v1, -1, "com.kakao.tistory.presentation.view.entry.widget.ReplyTargetBanner (CommentEditField.kt:193)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function01 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function01);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                d.a(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
            DividerKt.Divider-oMI9zvI(null, ColorResources_androidKt.colorResource(color.gray4, composer1, 0), 0.5f, 0.0f, composer1, 0x180, 9);
            Modifier modifier1 = PaddingKt.padding-qDBjuR0$default(BackgroundKt.background-bw27NRU$default(SizeKt.height-3ABfNKs(modifier$Companion0, 36.0f), ColorResources_androidKt.colorResource(color.gray6, composer1, 0), null, 2, null), 20.0f, 0.0f, 10.0f, 0.0f, 10, null);
            MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
            Function0 function02 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function02);
            }
            else {
                composer1.useNode();
            }
            Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function21);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            composer1.startReplaceGroup(0x908F07D1);
            Builder annotatedString$Builder0 = new Builder(0, 1, null);
            int v4 = annotatedString$Builder0.pushStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFB, null));
            try {
                annotatedString$Builder0.append(StringUtils.INSTANCE.getEllipsisText(s, 12));
            }
            finally {
                annotatedString$Builder0.pop(v4);
            }
            annotatedString$Builder0.append(StringResources_androidKt.stringResource(string.label_comment_write_sub_comment, composer1, 0));
            AnnotatedString annotatedString0 = annotatedString$Builder0.toAnnotatedString();
            composer1.endReplaceGroup();
            ExcludeFontPaddingTextKt.Text-edWjEy0(annotatedString0, RowScope.weight$default(RowScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, false, 1, 0, null, null, TextStyle.copy-p1EtxEg$default(TypeKt.getSubtext2(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), ColorResources_androidKt.colorResource(color.gray1, composer1, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null), composer1, 0, 0x6030, 0x3B7FC);
            c.a(10.0f, modifier$Companion0, composer1, 6);
            IconButtonKt.IconButton(function00, null, false, null, ComposableSingletons.CommentEditFieldKt.INSTANCE.getLambda-1$presentation_prodRelease(), composer1, v1 >> 3 & 14 | 0x6000, 14);
            if(e.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b0(s, function00, v));
        }
    }

    public static final void a(boolean z, Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-382295077);
        int v1 = (v & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-382295077, v1, -1, "com.kakao.tistory.presentation.view.entry.widget.CommentCompletionButton (CommentEditField.kt:410)");
            }
            Modifier modifier0 = SizeKt.size-VpY3zN4(Modifier.Companion, 60.0f, 32.0f);
            ButtonColors buttonColors0 = ButtonDefaults.INSTANCE.textButtonColors-RGew2ao(ColorResources_androidKt.colorResource((z ? color.black : color.white), composer1, 0), 0L, 0L, composer1, ButtonDefaults.$stable << 9, 6);
            composer1.startReplaceGroup(0xF56CF199);
            BorderStroke borderStroke0 = z ? null : BorderStrokeKt.BorderStroke-cXLIe8U(1.0f, ColorResources_androidKt.colorResource(color.gray8, composer1, 0));
            composer1.endReplaceGroup();
            ButtonKt.TextButton(function00, modifier0, z, null, null, RoundedCornerShapeKt.getCircleShape(), borderStroke0, buttonColors0, PaddingKt.PaddingValues-0680j_4(0.0f), ComposableLambdaKt.rememberComposableLambda(0xC48DD27E, true, new l(z), composer1, 54), composer1, v1 >> 3 & 14 | 0x36000030 | v1 << 6 & 0x380, 24);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m(z, function00, v));
        }
    }

    public static final void a(boolean z, Function1 function10, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xF9F4DA66);
        int v1 = (v & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF9F4DA66, v1, -1, "com.kakao.tistory.presentation.view.entry.widget.CommentSecretButton (CommentEditField.kt:394)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            composer1.startReplaceGroup(-1757715002);
            y y0 = composer1.rememberedValue();
            if((((v1 & 0x70) == 0x20 ? 1 : 0) | ((v1 & 14) == 4 ? 1 : 0)) != 0 || y0 == Composer.Companion.getEmpty()) {
                y0 = new y(function10, z);
                composer1.updateRememberedValue(y0);
            }
            composer1.endReplaceGroup();
            IconButtonKt.IconButton(y0, modifier$Companion0, false, null, ComposableLambdaKt.rememberComposableLambda(0x4415124A, true, new z(z), composer1, 54), composer1, 0x6030, 12);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a0(z, function10, v));
        }
    }

    public static final boolean access$CommentEditField$lambda$1(MutableState mutableState0) {
        return ((Boolean)mutableState0.getValue()).booleanValue();
    }

    public static final void access$CommentEditField$lambda$2(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final boolean access$CommentModifyEditField$lambda$11(MutableState mutableState0) {
        return ((Boolean)mutableState0.getValue()).booleanValue();
    }

    public static final void access$CommentModifyEditField$lambda$12(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final TextLayoutResult access$TextFieldWithMention$lambda$23(MutableState mutableState0) {
        return (TextLayoutResult)mutableState0.getValue();
    }

    public static final void access$TextFieldWithMention$lambda$24(MutableState mutableState0, TextLayoutResult textLayoutResult0) {
        mutableState0.setValue(textLayoutResult0);
    }

    public static final int access$TextFieldWithMention$lambda$26(MutableState mutableState0) {
        return ((Number)mutableState0.getValue()).intValue();
    }

    public static final void access$TextFieldWithMention$lambda$27(MutableState mutableState0, int v) {
        mutableState0.setValue(v);
    }

    public static final void access$TextFieldWithMention$updateMentionScroll(z1 z10, MentionVisualTransformation mentionVisualTransformation0, TextFieldValue textFieldValue0, TextLayoutResult textLayoutResult0, int v) {
        float f5;
        int v5;
        if(v != 0) {
            int v1 = (int)textLayoutResult0.getMultiParagraph().getHeight();
            int v2 = Math.min(v1, v);
            int v3 = kotlin.ranges.c.coerceAtLeast(StringsKt__StringsKt.getLastIndex(mentionVisualTransformation0.filter(textFieldValue0.getAnnotatedString()).getText()), 0);
            long v4 = textFieldValue0.getSelection-d9O1mEE();
            z10.getClass();
            if(TextRange.getStart-impl(v4) == TextRange.getStart-impl(z10.d)) {
                v5 = TextRange.getEnd-impl(v4) == TextRange.getEnd-impl(z10.d) ? TextRange.getMin-impl(v4) : TextRange.getEnd-impl(v4);
            }
            else {
                v5 = TextRange.getStart-impl(v4);
            }
            Rect rect0 = textLayoutResult0.getCursorRect(Math.min(v3, kotlin.ranges.c.coerceAtLeast(mentionVisualTransformation0.originalToTransformed(v5), 0)));
            Intrinsics.checkNotNullParameter(rect0, "cursorRect");
            float f = (float)(v1 - v2);
            z10.b.setValue(f);
            if(Float.compare(rect0.getLeft(), z10.c.getLeft()) != 0 || rect0.getTop() != z10.c.getTop()) {
                float f1 = rect0.getTop();
                float f2 = rect0.getBottom();
                float f3 = ((Number)z10.a.getValue()).floatValue();
                float f4 = f3 + ((float)v2);
                if(f2 <= f4) {
                    int v6 = Float.compare(f1, f3);
                    if(v6 >= 0 || f2 - f1 <= ((float)v2)) {
                        f5 = v6 >= 0 || f2 - f1 > ((float)v2) ? 0.0f : f1 - f3;
                    }
                    else {
                        f5 = f2 - f4;
                    }
                }
                else {
                    f5 = f2 - f4;
                }
                Float float0 = (float)(((Number)z10.a.getValue()).floatValue() + f5);
                z10.a.setValue(float0);
                z10.c = rect0;
            }
            Float float1 = kotlin.ranges.c.coerceIn(((Number)z10.a.getValue()).floatValue(), 0.0f, f);
            z10.a.setValue(float1);
        }
    }
}

