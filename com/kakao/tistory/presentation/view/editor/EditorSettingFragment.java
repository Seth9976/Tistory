package com.kakao.tistory.presentation.view.editor;

import a5.b;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.q;
import c;
import com.kakao.android.base.utils.ImageUtils;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.kphotopicker.GalleryPicker;
import com.kakao.tistory.domain.blog.entity.EntryCategoryVisibilityType;
import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.coil.ImageModifiers;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.common.utils.DateUtils.DateTimeFormat;
import com.kakao.tistory.presentation.common.utils.PermissionUtils;
import com.kakao.tistory.presentation.design.ui.list.m;
import com.kakao.tistory.presentation.editor.contract.EditorChallenge;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.view.common.dialog.EntryPasswordDialogFragment;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel.ReservedType;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import com.kakao.tistory.presentation.widget.common.CommonImageKt;
import com.kakao.tistory.presentation.widget.common.DateTimeTextKt;
import d;
import dagger.hilt.android.AndroidEntryPoint;
import e;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import mc.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@AndroidEntryPoint
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00042\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\bH\u0017¢\u0006\u0004\b\u000B\u0010\fJ!\u0010\u0011\u001A\u00020\b2\b\b\u0002\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\u000FH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006*²\u0006\u000E\u0010\u0015\u001A\u0004\u0018\u00010\u00148\nX\u008A\u0084\u0002²\u0006\u0014\u0010\u0018\u001A\n \u0017*\u0004\u0018\u00010\u00160\u00168\nX\u008A\u0084\u0002²\u0006\f\u0010\u001A\u001A\u00020\u00198\nX\u008A\u0084\u0002²\u0006\u000E\u0010\u001C\u001A\u0004\u0018\u00010\u001B8\nX\u008A\u0084\u0002²\u0006 \u0010\u001E\u001A\u0016\u0012\u0004\u0012\u00020\u001B \u0017*\n\u0012\u0004\u0012\u00020\u001B\u0018\u00010\u001D0\u001D8\nX\u008A\u0084\u0002²\u0006\u000E\u0010\u001F\u001A\u0004\u0018\u00010\u001B8\nX\u008A\u0084\u0002²\u0006\u000E\u0010 \u001A\u0004\u0018\u00010\u001B8\nX\u008A\u0084\u0002²\u0006\u000E\u0010!\u001A\u0004\u0018\u00010\u001B8\nX\u008A\u0084\u0002²\u0006\u000E\u0010\"\u001A\u0004\u0018\u00010\u001B8\nX\u008A\u0084\u0002²\u0006\f\u0010$\u001A\u00020#8\nX\u008A\u0084\u0002²\u0006\u000E\u0010&\u001A\u0004\u0018\u00010%8\nX\u008A\u0084\u0002²\u0006\u000E\u0010(\u001A\u0004\u0018\u00010\'8\nX\u008A\u0084\u0002²\u0006\u0014\u0010)\u001A\n \u0017*\u0004\u0018\u00010#0#8\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/editor/EditorSettingFragment;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryComposeFragment;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Content", "(Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/kakao/tistory/presentation/viewmodel/EditorViewModel;", "viewModel", "TitleAndTagContainer", "(Landroidx/compose/ui/Modifier;Lcom/kakao/tistory/presentation/viewmodel/EditorViewModel;Landroidx/compose/runtime/Composer;II)V", "Companion", "Lcom/kakao/tistory/presentation/editor/contract/EditorChallenge;", "challenge", "Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;", "kotlin.jvm.PlatformType", "entryVisibilityType", "", "categoryVisibility", "", "titleString", "", "tagList", "coverImageUrl", "selectedCategory", "daumLikeName", "password", "", "isPressed", "Lcom/kakao/tistory/presentation/viewmodel/EditorViewModel$ReservedType;", "reserveType", "", "reserveTime", "commentPermit", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEditorSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorSettingFragment.kt\ncom/kakao/tistory/presentation/view/editor/EditorSettingFragment\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 12 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 13 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n+ 14 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 15 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,901:1\n21#2,4:902\n1#3:906\n1#3:1047\n172#4,9:907\n77#5:916\n1223#6,6:917\n1223#6,6:1087\n1223#6,6:1141\n1223#6,6:1232\n1223#6,6:1283\n1223#6,6:1373\n1223#6,6:1379\n85#7:923\n82#7,6:924\n88#7:958\n92#7:963\n85#7:965\n82#7,6:966\n88#7:1000\n92#7:1046\n85#7:1048\n82#7,6:1049\n88#7:1083\n92#7:1140\n85#7:1186\n82#7,6:1187\n88#7:1221\n92#7:1226\n85#7:1240\n82#7,6:1241\n88#7:1275\n92#7:1280\n78#8,6:930\n85#8,4:945\n89#8,2:955\n93#8:962\n78#8,6:972\n85#8,4:987\n89#8,2:997\n78#8,6:1009\n85#8,4:1024\n89#8,2:1034\n93#8:1040\n93#8:1045\n78#8,6:1055\n85#8,4:1070\n89#8,2:1080\n78#8,6:1102\n85#8,4:1117\n89#8,2:1127\n93#8:1135\n93#8:1139\n78#8,6:1157\n85#8,4:1172\n89#8,2:1182\n78#8,6:1193\n85#8,4:1208\n89#8,2:1218\n93#8:1225\n93#8:1229\n78#8,6:1247\n85#8,4:1262\n89#8,2:1272\n93#8:1279\n78#8,6:1297\n85#8,4:1312\n89#8,2:1322\n93#8:1331\n78#8,6:1340\n85#8,4:1355\n89#8,2:1365\n93#8:1371\n368#9,9:936\n377#9:957\n378#9,2:960\n368#9,9:978\n377#9:999\n368#9,9:1015\n377#9:1036\n378#9,2:1038\n378#9,2:1043\n368#9,9:1061\n377#9:1082\n368#9,9:1108\n377#9:1129\n378#9,2:1133\n378#9,2:1137\n368#9,9:1163\n377#9:1184\n368#9,9:1199\n377#9:1220\n378#9,2:1223\n378#9,2:1227\n368#9,9:1253\n377#9:1274\n378#9,2:1277\n368#9,9:1303\n377#9:1324\n378#9,2:1329\n368#9,9:1346\n377#9:1367\n378#9,2:1369\n4032#10,6:949\n4032#10,6:991\n4032#10,6:1028\n4032#10,6:1074\n4032#10,6:1121\n4032#10,6:1176\n4032#10,6:1212\n4032#10,6:1266\n4032#10,6:1316\n4032#10,6:1359\n158#11:959\n148#11:964\n148#11:1001\n158#11:1042\n148#11:1084\n148#11:1093\n148#11:1094\n148#11:1147\n148#11:1148\n148#11:1149\n148#11:1222\n148#11:1231\n148#11:1238\n148#11:1239\n148#11:1276\n148#11:1281\n148#11:1282\n148#11:1289\n148#11:1326\n148#11:1327\n148#11:1328\n148#11:1333\n148#11:1389\n148#11:1390\n98#12:1002\n95#12,6:1003\n101#12:1037\n105#12:1041\n98#12:1290\n95#12,6:1291\n101#12:1325\n105#12:1332\n95#13,2:1085\n95#13,2:1131\n95#13,2:1385\n95#13,2:1387\n71#14:1095\n68#14,6:1096\n74#14:1130\n78#14:1136\n71#14:1150\n68#14,6:1151\n74#14:1185\n78#14:1230\n71#14:1334\n69#14,5:1335\n74#14:1368\n78#14:1372\n81#15:1391\n81#15:1392\n81#15:1393\n81#15:1394\n81#15:1395\n81#15:1396\n81#15:1397\n81#15:1398\n81#15:1399\n81#15:1400\n81#15:1401\n81#15:1402\n*S KotlinDebug\n*F\n+ 1 EditorSettingFragment.kt\ncom/kakao/tistory/presentation/view/editor/EditorSettingFragment\n*L\n79#1:902,4\n79#1:906\n79#1:907,9\n130#1:916\n132#1:917,6\n238#1:1087,6\n274#1:1141,6\n382#1:1232,6\n487#1:1283,6\n674#1:1373,6\n675#1:1379,6\n136#1:923\n136#1:924,6\n136#1:958\n136#1:963\n191#1:965\n191#1:966,6\n191#1:1000\n191#1:1046\n218#1:1048\n218#1:1049,6\n218#1:1083\n218#1:1140\n294#1:1186\n294#1:1187,6\n294#1:1221\n294#1:1226\n380#1:1240\n380#1:1241,6\n380#1:1275\n380#1:1280\n136#1:930,6\n136#1:945,4\n136#1:955,2\n136#1:962\n191#1:972,6\n191#1:987,4\n191#1:997,2\n196#1:1009,6\n196#1:1024,4\n196#1:1034,2\n196#1:1040\n191#1:1045\n218#1:1055,6\n218#1:1070,4\n218#1:1080,2\n236#1:1102,6\n236#1:1117,4\n236#1:1127,2\n236#1:1135\n218#1:1139\n272#1:1157,6\n272#1:1172,4\n272#1:1182,2\n294#1:1193,6\n294#1:1208,4\n294#1:1218,2\n294#1:1225\n272#1:1229\n380#1:1247,6\n380#1:1262,4\n380#1:1272,2\n380#1:1279\n604#1:1297,6\n604#1:1312,4\n604#1:1322,2\n604#1:1331\n636#1:1340,6\n636#1:1355,4\n636#1:1365,2\n636#1:1371\n136#1:936,9\n136#1:957\n136#1:960,2\n191#1:978,9\n191#1:999\n196#1:1015,9\n196#1:1036\n196#1:1038,2\n191#1:1043,2\n218#1:1061,9\n218#1:1082\n236#1:1108,9\n236#1:1129\n236#1:1133,2\n218#1:1137,2\n272#1:1163,9\n272#1:1184\n294#1:1199,9\n294#1:1220\n294#1:1223,2\n272#1:1227,2\n380#1:1253,9\n380#1:1274\n380#1:1277,2\n604#1:1303,9\n604#1:1324\n604#1:1329,2\n636#1:1346,9\n636#1:1367\n636#1:1369,2\n136#1:949,6\n191#1:991,6\n196#1:1028,6\n218#1:1074,6\n236#1:1121,6\n272#1:1176,6\n294#1:1212,6\n380#1:1266,6\n604#1:1316,6\n636#1:1359,6\n141#1:959\n186#1:964\n199#1:1001\n205#1:1042\n220#1:1084\n239#1:1093\n241#1:1094\n275#1:1147\n276#1:1148\n281#1:1149\n303#1:1222\n329#1:1231\n384#1:1238\n385#1:1239\n393#1:1276\n404#1:1281\n454#1:1282\n558#1:1289\n610#1:1326\n616#1:1327\n620#1:1328\n641#1:1333\n734#1:1389\n735#1:1390\n196#1:1002\n196#1:1003,6\n196#1:1037\n196#1:1041\n604#1:1290\n604#1:1291,6\n604#1:1325\n604#1:1332\n228#1:1085,2\n250#1:1131,2\n713#1:1385,2\n726#1:1387,2\n236#1:1095\n236#1:1096,6\n236#1:1130\n236#1:1136\n272#1:1150\n272#1:1151,6\n272#1:1185\n272#1:1230\n636#1:1334\n636#1:1335,5\n636#1:1368\n636#1:1372\n150#1:1391\n160#1:1392\n161#1:1393\n213#1:1394\n214#1:1395\n258#1:1396\n444#1:1397\n459#1:1398\n508#1:1399\n550#1:1400\n605#1:1401\n687#1:1402\n*E\n"})
public final class EditorSettingFragment extends Hilt_EditorSettingFragment {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/view/editor/EditorSettingFragment$Companion;", "", "Lcom/kakao/tistory/presentation/view/editor/EditorSettingFragment;", "newInstance", "()Lcom/kakao/tistory/presentation/view/editor/EditorSettingFragment;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final EditorSettingFragment newInstance() {
            return new EditorSettingFragment();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[EntryVisibilityType.values().length];
            try {
                arr_v[EntryVisibilityType.PUBLIC.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[EntryVisibilityType.PROTECTED.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final long k;
    public final BaseViewModelLazy l;
    public final ActivityResultLauncher m;
    public final ActivityResultLauncher n;

    static {
        EditorSettingFragment.Companion = new Companion(null);
        EditorSettingFragment.$stable = 8;
    }

    public EditorSettingFragment() {
        this.k = 0x1400000L;
        this.l = new BaseViewModelLazy(this, FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(EditorViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.1(this), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.2(null, this), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.3(this)));
        ActivityResultLauncher activityResultLauncher0 = this.registerForActivityResult(new StartActivityForResult(), new a(this, 0));
        Intrinsics.checkNotNullExpressionValue(activityResultLauncher0, "registerForActivityResult(...)");
        this.m = activityResultLauncher0;
        ActivityResultLauncher activityResultLauncher1 = this.registerForActivityResult(new RequestMultiplePermissions(), new a(this, 1));
        Intrinsics.checkNotNullExpressionValue(activityResultLauncher1, "registerForActivityResult(...)");
        this.n = activityResultLauncher1;
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryComposeFragment
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public void Content(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xC51E703F);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xC51E703F, v, -1, "com.kakao.tistory.presentation.view.editor.EditorSettingFragment.Content (EditorSettingFragment.kt:122)");
        }
        this.e(((EditorViewModel)this.l.getValue()), composer1, 72);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f2(this, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void TitleAndTagContainer(@Nullable Modifier modifier0, @NotNull EditorViewModel editorViewModel0, @Nullable Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(editorViewModel0, "viewModel");
        Composer composer1 = composer0.startRestartGroup(784909240);
        Modifier modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(784909240, v, -1, "com.kakao.tistory.presentation.view.editor.EditorSettingFragment.TitleAndTagContainer (EditorSettingFragment.kt:211)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(editorViewModel0.getTitleString(), composer1, 8);
        State state1 = LiveDataAdapterKt.observeAsState(editorViewModel0.getTagList(), CollectionsKt__CollectionsKt.emptyList(), composer1, 56);
        Object object0 = state1.getValue();
        Intrinsics.checkNotNullExpressionValue(((List)object0), "TitleAndTagContainer$lambda$13(...)");
        String s = CollectionsKt___CollectionsKt.joinToString$default(((List)object0), " ", null, null, 0, null, n3.a, 30, null);
        if(p.isBlank(s)) {
            s = null;
        }
        composer1.startReplaceGroup(0x7A0831B9);
        if(s == null) {
            s = StringResources_androidKt.stringResource(string.label_editor_setting_tag_placeholder, composer1, 0);
        }
        composer1.endReplaceGroup();
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), alignment$Companion0.getStart(), composer1, 0);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
            d.a(v2, composer1, v2, function20);
        }
        Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier3 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 22.0f, 0.0f, 0.0f, 13, null);
        String s1 = (String)state0.getValue();
        if(s1 == null) {
            s1 = "";
        }
        TextStyle textStyle0 = MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getH1();
        TextUnitKt.checkArithmetic--R2X_6o(0x13E800000L);
        MaterialTheme materialTheme0 = MaterialTheme.INSTANCE;
        int v3 = MaterialTheme.$stable;
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(s1, modifier3, 0L, 0x141880000L, null, null, null, 0x1BE800000L, null, null, 0x141B80000L, 2, false, false, 2, 0, null, textStyle0, composer1, 0xC30, 27702, 103284);
        composer1.startReplaceGroup(0xEE028E5A);
        String s2 = ((List)state1.getValue()).isEmpty() ? s : StringResources_androidKt.stringResource(string.content_desc_change_tag, new Object[]{s}, composer1, 0x40);
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(0xEE02AC81);
        boolean z = composer1.changed(s2);
        k3 k30 = composer1.rememberedValue();
        if(z || k30 == Composer.Companion.getEmpty()) {
            k30 = new k3(s2);
            composer1.updateRememberedValue(k30);
        }
        composer1.endReplaceGroup();
        Modifier modifier4 = ClickableKt.clickable-XHw0xAI$default(SizeKt.defaultMinSize-VpY3zN4$default(SizeKt.fillMaxWidth$default(PaddingKt.padding-qDBjuR0$default(SemanticsModifierKt.clearAndSetSemantics(modifier$Companion0, k30), 0.0f, 6.0f, 0.0f, 0.0f, 13, null), 0.0f, 1, null), 0.0f, 60.0f, 1, null), false, null, null, new l3(editorViewModel0), 7, null);
        MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
        int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
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
        Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
        TextStyle textStyle1 = TypeKt.getSubtext1(materialTheme0.getTypography(composer1, v3));
        TextUnitKt.checkArithmetic--R2X_6o(5336832410L);
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, null, 0L, 0L, null, null, null, 7484316058L, null, null, 0L, 2, false, false, 2, 0, null, textStyle1, composer1, 0, 0x6C30, 104318);
        if(e.a(composer1)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m3(this, modifier1, editorViewModel0, v, v1));
        }
    }

    public static final void a(EditorSettingFragment editorSettingFragment0, ActivityResult activityResult0) {
        Intrinsics.checkNotNullParameter(editorSettingFragment0, "this$0");
        Intrinsics.checkNotNullParameter(activityResult0, "result");
        if(activityResult0.getResultCode() == -1) {
            Intent intent0 = activityResult0.getData();
            if(intent0 != null) {
                Uri uri0 = intent0.getData();
                if(uri0 != null) {
                    String s = uri0.getPath();
                    if(s != null) {
                        Logger.INSTANCE.log("image " + s + " ?: null");
                        Intrinsics.checkNotNull(s);
                        if(ImageUtils.INSTANCE.checkImageSize(s, editorSettingFragment0.k)) {
                            ((EditorViewModel)editorSettingFragment0.l.getValue()).onClickChangeImage(s);
                            return;
                        }
                        FragmentActivity fragmentActivity0 = editorSettingFragment0.getActivity();
                        if(fragmentActivity0 != null) {
                            Intrinsics.checkNotNull(fragmentActivity0);
                            String s1 = editorSettingFragment0.getString(string.label_dialog_image_size_MB);
                            Intrinsics.checkNotNullExpressionValue(s1, "getString(...)");
                            String s2 = b.f(1, s1, "format(...)", new Object[]{((long)(editorSettingFragment0.k / 0x400L / 0x400L))});
                            TistoryDialog.showOk$default(TistoryDialog.INSTANCE, fragmentActivity0, s2, null, false, null, y3.a, null, 92, null);
                        }
                    }
                }
            }
        }
    }

    public static final void a(EditorSettingFragment editorSettingFragment0, Boolean boolean0) {
        Intrinsics.checkNotNullParameter(editorSettingFragment0, "this$0");
        if(editorSettingFragment0.getActivity() != null) {
            Intrinsics.checkNotNull(boolean0);
            if(boolean0.booleanValue()) {
                editorSettingFragment0.getLoadingDialog().show();
                return;
            }
            editorSettingFragment0.getLoadingDialog().dismiss();
        }
    }

    public static final void a(EditorSettingFragment editorSettingFragment0, Map map0) {
        Intrinsics.checkNotNullParameter(editorSettingFragment0, "this$0");
        Intrinsics.checkNotNullParameter(map0, "it");
        Context context0 = editorSettingFragment0.requireContext();
        Intrinsics.checkNotNullExpressionValue(context0, "requireContext(...)");
        if(PermissionUtils.INSTANCE.hasGalleryPermission(context0)) {
            Context context1 = editorSettingFragment0.requireContext();
            Intrinsics.checkNotNullExpressionValue(context1, "requireContext(...)");
            Intent intent0 = GalleryPicker.INSTANCE.newIntent(context1, 1, x3.a);
            editorSettingFragment0.m.launch(intent0);
        }
    }

    public final void a() {
        EditorViewModel editorViewModel0 = (EditorViewModel)this.l.getValue();
        LifecycleOwner lifecycleOwner0 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner0, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(editorViewModel0.getTrackPageViewSetting(), lifecycleOwner0, new f4(this));
        LifecycleOwner lifecycleOwner1 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner1, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(editorViewModel0.getShowPasswordDialog(), lifecycleOwner1, new g4(this));
        LifecycleOwner lifecycleOwner2 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner2, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(editorViewModel0.getShowToast(), lifecycleOwner2, new h4(this));
        LifecycleOwner lifecycleOwner3 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner3, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(editorViewModel0.getShowBlogCategoryDialog(), lifecycleOwner3, new j4(editorViewModel0, this));
        LifecycleOwner lifecycleOwner4 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner4, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(editorViewModel0.getShowDaumCategoryDialog(), lifecycleOwner4, new l4(this, editorViewModel0));
        LifecycleOwner lifecycleOwner5 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner5, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(editorViewModel0.getShowCameraBottomDialog(), lifecycleOwner5, new n4(this, editorViewModel0));
        LifecycleOwner lifecycleOwner6 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner6, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(editorViewModel0.getGoToPhotoPicker(), lifecycleOwner6, new o4(this));
        editorViewModel0.isShowProgress().observe(this.getViewLifecycleOwner(), new q(this, 6));
        LifecycleOwner lifecycleOwner7 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner7, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(editorViewModel0.getShowCalendarDialog(), lifecycleOwner7, new q4(this));
        LifecycleOwner lifecycleOwner8 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner8, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(editorViewModel0.getShowTimePickerDialog(), lifecycleOwner8, new a4(this));
        LifecycleOwner lifecycleOwner9 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner9, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(editorViewModel0.getDeleteThumbnailDialog(), lifecycleOwner9, new c4(this));
        LifecycleOwner lifecycleOwner10 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner10, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(editorViewModel0.getShowChallengeCategoryDialog(), lifecycleOwner10, new e4(this, editorViewModel0));
    }

    public final void a(int v, String s, int v1, boolean z, Function0 function00, Composer composer0, int v2, int v3) {
        Composer composer1 = composer0.startRestartGroup(997109362);
        boolean z1 = (v3 & 8) == 0 ? z : true;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(997109362, v2, -1, "com.kakao.tistory.presentation.view.editor.EditorSettingFragment.SelectionItem (EditorSettingFragment.kt:475)");
        }
        composer1.startReplaceGroup(0xD8A0186F);
        String s1 = s == null ? StringResources_androidKt.stringResource(string.label_editor_setting_no_category_select, composer1, 0) : s;
        composer1.endReplaceGroup();
        String s2 = StringResources_androidKt.stringResource(string.content_desc_button, new Object[]{b.m(StringResources_androidKt.stringResource(v1, composer1, v2 >> 6 & 14), " ", s1)}, composer1, 0x40);
        Modifier modifier0 = ClickableKt.clickable-XHw0xAI$default(Modifier.Companion, false, null, null, function00, 7, null);
        composer1.startReplaceGroup(0xD8A048A9);
        boolean z2 = composer1.changed(s2);
        a3 a30 = composer1.rememberedValue();
        if(z2 || a30 == Composer.Companion.getEmpty()) {
            a30 = new a3(s2);
            composer1.updateRememberedValue(a30);
        }
        composer1.endReplaceGroup();
        this.a(SemanticsModifierKt.clearAndSetSemantics(modifier0, a30), 0.0f, z1, null, ComposableLambdaKt.rememberComposableLambda(0x7E221FFB, true, new b3(this, v, s1), composer1, 54), composer1, v2 >> 3 & 0x380 | 0x46000, 10);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c3(this, v, s, v1, z1, function00, v2, v3));
        }
    }

    public final void a(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xF92F0E95);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF92F0E95, v, -1, "com.kakao.tistory.presentation.view.editor.EditorSettingFragment.CommentPermitContainer (EditorSettingFragment.kt:685)");
        }
        this.a(null, 0.0f, false, null, ComposableLambdaKt.rememberComposableLambda(1445487404, true, new d2(this, LiveDataAdapterKt.observeAsState(((EditorViewModel)this.l.getValue()).getCommentPermit(), Boolean.FALSE, composer1, 56)), composer1, 54), composer1, 0x46000, 15);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e2(this, v));
        }
    }

    public final void a(Modifier modifier0, float f, boolean z, Vertical alignment$Vertical0, Function3 function30, Composer composer0, int v, int v1) {
        Vertical alignment$Vertical1;
        boolean z1;
        float f1;
        Modifier modifier1;
        Vertical alignment$Vertical3;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x2796073C);
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
            v2 |= (composer1.changed(f) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(alignment$Vertical0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v2) != 9362 || !composer1.getSkipping()) {
            modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
            float f2 = (v1 & 2) == 0 ? f : 52.0f;
            boolean z2 = (v1 & 4) == 0 ? z : true;
            Vertical alignment$Vertical2 = (v1 & 8) == 0 ? alignment$Vertical0 : Alignment.Companion.getCenterVertically();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x2796073C, v2, -1, "com.kakao.tistory.presentation.view.editor.EditorSettingFragment.ItemContainer (EditorSettingFragment.kt:189)");
            }
            Modifier modifier2 = SizeKt.fillMaxWidth$default(SizeKt.height-3ABfNKs(modifier1, f2), 0.0f, 1, null);
            Arrangement arrangement0 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), Alignment.Companion.getStart(), composer1, 0);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
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
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            Modifier modifier4 = PaddingKt.padding-VpY3zN4$default(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, Modifier.Companion, 1.0f, false, 2, null), 20.0f, 0.0f, 2, null);
            int v4 = v2 >> 3 & 0x1F80;
            MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Vertical2, composer1, v4 >> 3 & 0x70);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                d.a(v5, composer1, v5, function21);
            }
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
            function30.invoke(RowScopeInstance.INSTANCE, composer1, ((int)(v4 >> 6 & 0x70 | 6)));
            composer1.endNode();
            composer1.startReplaceGroup(0xAFE1A471);
            if(z2) {
                alignment$Vertical3 = alignment$Vertical2;
                DividerKt.Divider-oMI9zvI(null, ColorResources_androidKt.colorResource(color.gray4, composer1, 0), 0.5f, 0.0f, composer1, 0x180, 9);
            }
            else {
                alignment$Vertical3 = alignment$Vertical2;
            }
            if(m.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
            alignment$Vertical1 = alignment$Vertical3;
            f1 = f2;
            z1 = z2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            f1 = f;
            z1 = z;
            alignment$Vertical1 = alignment$Vertical0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n2(this, modifier1, f1, z1, alignment$Vertical1, function30, v, v1));
        }
    }

    public final void a(Modifier modifier0, Date date0, DateTimeFormat dateUtils$DateTimeFormat0, Function0 function00, Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(0xDA3FE3B5);
        Modifier modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDA3FE3B5, v, -1, "com.kakao.tistory.presentation.view.editor.EditorSettingFragment.DateTimeItem (EditorSettingFragment.kt:634)");
        }
        Modifier modifier2 = ModifierKt.noRippleClickable(ModifierKt.roundedBackground-oZzcvok$default(SemanticsModifierKt.semantics(modifier1, true, j2.a), 0, color.color_d0d0d0, 0.0f, 1.0f, 5, null), function00);
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
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
        Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
        DateTimeTextKt.DateTimeText-Vc6wB30(date0, dateUtils$DateTimeFormat0, false, null, null, 0L, 0L, new TextStyle(0L, 0x141600000L, FontWeight.Companion.getLight(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD8, null), composer1, v >> 3 & 0x70 | 8, 0x7C);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k2(this, modifier1, date0, dateUtils$DateTimeFormat0, function00, v, v1));
        }
    }

    public final void a(EditorViewModel editorViewModel0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x59E768FC);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x59E768FC, v, -1, "com.kakao.tistory.presentation.view.editor.EditorSettingFragment.CategorySelector (EditorSettingFragment.kt:442)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(editorViewModel0.getCategoryName(), composer1, 8);
        this.a(string.label_editor_setting_category, ((String)state0.getValue()), string.label_editor_setting_category, false, new x1(editorViewModel0), composer1, 0x40C00, 0);
        DividerKt.Divider-oMI9zvI(null, ColorResources_androidKt.colorResource(color.gray6, composer1, 0), 10.0f, 0.0f, composer1, 0x180, 9);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y1(this, editorViewModel0, v));
        }
    }

    public final void a(EditorViewModel editorViewModel0, EntryVisibilityType entryVisibilityType0, int v, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0x69C407A5);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x69C407A5, v1, -1, "com.kakao.tistory.presentation.view.editor.EditorSettingFragment.VisibilitySelector (EditorSettingFragment.kt:327)");
        }
        this.a(null, 80.0f, false, null, ComposableLambdaKt.rememberComposableLambda(0xB1F473AE, true, new v3(this, entryVisibilityType0, v, editorViewModel0), composer1, 54), composer1, 0x46030, 13);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new w3(this, editorViewModel0, entryVisibilityType0, v, v1));
        }
    }

    public final void a(String s, FontWeight fontWeight0, Composer composer0, int v, int v1) {
        FontWeight fontWeight1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x61EC6599);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? v | (composer1.changed(s) ? 4 : 2) : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(fontWeight0) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            FontWeight fontWeight2 = (v1 & 2) == 0 ? fontWeight0 : FontWeight.Companion.getLight();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x61EC6599, v2, -1, "com.kakao.tistory.presentation.view.editor.EditorSettingFragment.BodyText (EditorSettingFragment.kt:717)");
            }
            TextStyle textStyle0 = TypeKt.getSubtext1(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable));
            TextUnitKt.checkArithmetic--R2X_6o(0x13DCCCCCDL);
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, null, 0L, 0L, null, fontWeight2, null, 0x1BDCCCCCDL, null, null, 0L, 2, false, false, 1, 0, null, textStyle0, composer1, v2 & 14 | v2 << 12 & 0x70000, 0x6C30, 104286);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            fontWeight1 = fontWeight2;
        }
        else {
            composer1.skipToGroupEnd();
            fontWeight1 = fontWeight0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new w1(this, s, fontWeight1, v, v1));
        }
    }

    public final void a(String s, Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x6430B610);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x6430B610, v, -1, "com.kakao.tistory.presentation.view.editor.EditorSettingFragment.ChallengeTagButton (EditorSettingFragment.kt:401)");
        }
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(-1055596505, true, new a2(function00, s), composer1, 54);
        this.a(null, 60.0f, false, Alignment.Companion.getTop(), composableLambda0, composer1, 0x46C30, 5);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b2(this, s, function00, v));
        }
    }

    public static final Boolean access$CommentPermitContainer$lambda$39(State state0) {
        return (Boolean)state0.getValue();
    }

    public static final void access$DateSelectItem(EditorSettingFragment editorSettingFragment0, boolean z, int v, Function1 function10, Composer composer0, int v1) {
        editorSettingFragment0.getClass();
        Composer composer1 = composer0.startRestartGroup(0x6416247D);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x6416247D, v2, -1, "com.kakao.tistory.presentation.view.editor.EditorSettingFragment.DateSelectItem (EditorSettingFragment.kt:663)");
            }
            int v3 = v2 >> 3 & 14;
            String s = StringResources_androidKt.stringResource(v, composer1, v3);
            String s1 = StringResources_androidKt.stringResource((z ? string.content_desc_select_already : string.content_desc_select_none_already), new Object[]{s}, composer1, 0x40);
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            composer1.startReplaceGroup(0xAB73BC19);
            boolean z1 = composer1.changed(s1);
            g2 g20 = composer1.rememberedValue();
            if(z1 || g20 == Composer.Companion.getEmpty()) {
                g20 = new g2(s1);
                composer1.updateRememberedValue(g20);
            }
            composer1.endReplaceGroup();
            boolean z2 = true;
            Modifier modifier0 = SemanticsModifierKt.semantics$default(modifier$Companion0, false, g20, 1, null);
            composer1.startReplaceGroup(0xAB73C537);
            if((v2 & 0x380) != 0x100) {
                z2 = false;
            }
            boolean z3 = composer1.changed(s);
            h2 h20 = composer1.rememberedValue();
            if(z3 || z2 || h20 == Composer.Companion.getEmpty()) {
                h20 = new h2(function10, s);
                composer1.updateRememberedValue(h20);
            }
            composer1.endReplaceGroup();
            Modifier modifier1 = ModifierKt.noRippleClickable(modifier0, h20);
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(StringResources_androidKt.stringResource(v, composer1, v3), modifier1, ColorResources_androidKt.colorResource((z ? color.gray1 : color.gray2), composer1, 0), 0x141500000L, null, (z ? FontWeight.Companion.getSemiBold() : FontWeight.Companion.getLight()), TypeKt.getTFont(), 0L, null, null, 0L, 0, false, false, 0, 0, null, null, composer1, 0x180C00, 0xC00, 0x3DF90);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i2(editorSettingFragment0, z, v, function10, v1));
        }
    }

    public static final String access$PasswordContainer$lambda$31(State state0) {
        return (String)state0.getValue();
    }

    public static final void access$ReserveTimeContainer(EditorSettingFragment editorSettingFragment0, Modifier modifier0, EditorViewModel editorViewModel0, Composer composer0, int v, int v1) {
        editorSettingFragment0.getClass();
        Composer composer1 = composer0.startRestartGroup(52201126);
        Modifier modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(52201126, v, -1, "com.kakao.tistory.presentation.view.editor.EditorSettingFragment.ReserveTimeContainer (EditorSettingFragment.kt:602)");
        }
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer1, 0);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
            d.a(v2, composer1, v2, function20);
        }
        Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
        State state0 = LiveDataAdapterKt.observeAsState(editorViewModel0.getReserverTime(), composer1, 8);
        Long long0 = (Long)state0.getValue();
        Date date0 = new Date((long0 == null ? Calendar.getInstance().getTimeInMillis() : ((long)long0)));
        Long long1 = (Long)state0.getValue();
        composer1.startReplaceGroup(0x4CD674AA);
        if(long1 != null) {
            Modifier modifier3 = SizeKt.size-VpY3zN4(Modifier.Companion, 107.0f, 32.0f);
            x2 x20 = new x2(editorViewModel0);
            editorSettingFragment0.a(modifier3, date0, DateTimeFormat.DATE_TIME_FORMAT_yyyy_M_d, x20, composer1, 0x81C6, 0);
            c.a(8.0f, Modifier.Companion, composer1, 6);
            Modifier modifier4 = SizeKt.size-VpY3zN4(Modifier.Companion, 60.0f, 32.0f);
            y2 y20 = new y2(editorViewModel0);
            editorSettingFragment0.a(modifier4, date0, DateTimeFormat.DATE_TIME_FORMAT_HH_mm, y20, composer1, 0x81C6, 0);
        }
        if(m.a(composer1)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new z2(editorSettingFragment0, modifier1, editorViewModel0, v, v1));
        }
    }

    public static final void access$ThumbnailImage(EditorSettingFragment editorSettingFragment0, EditorViewModel editorViewModel0, Composer composer0, int v) {
        androidx.compose.ui.Modifier.Companion modifier$Companion1;
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion1;
        BoxScopeInstance boxScopeInstance1;
        editorSettingFragment0.getClass();
        Composer composer1 = composer0.startRestartGroup(1707273678);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1707273678, v, -1, "com.kakao.tistory.presentation.view.editor.EditorSettingFragment.ThumbnailImage (EditorSettingFragment.kt:256)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(editorViewModel0.getCoverImageUrl(), composer1, 8);
        boolean z = ((String)state0.getValue()) == null;
        composer1.startReplaceGroup(0x117EFEE1);
        String s = StringResources_androidKt.stringResource(string.label_editor_setting_thumbnail, composer1, 0);
        String s1 = (String)state0.getValue();
        if(s1 == null || p.isBlank(s1)) {
            s1 = null;
        }
        composer1.startReplaceGroup(0x117F11C6);
        if(s1 != null) {
            s = b.f(1, StringResources_androidKt.stringResource(string.content_desc_set_already, composer1, 0), "format(...)", new Object[]{StringResources_androidKt.stringResource(string.content_desc_change_representative_image, composer1, 0)});
        }
        composer1.endReplaceGroup();
        String s2 = StringResources_androidKt.stringResource(string.content_desc_button, new Object[]{s}, composer1, 0x40);
        composer1.endReplaceGroup();
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        composer1.startReplaceGroup(0x117F446B);
        boolean z1 = composer1.changed(s2);
        h3 h30 = composer1.rememberedValue();
        if(z1 || h30 == Composer.Companion.getEmpty()) {
            h30 = new h3(s2);
            composer1.updateRememberedValue(h30);
        }
        composer1.endReplaceGroup();
        Modifier modifier0 = ModifierKt.roundedBackground-oZzcvok$default(ClickableKt.clickable-XHw0xAI$default(SizeKt.size-3ABfNKs(PaddingKt.padding-qDBjuR0$default(SemanticsModifierKt.clearAndSetSemantics(modifier$Companion0, h30), 0.0f, 8.0f, 0.0f, 0.0f, 13, null), 88.0f), false, null, null, new i3(editorViewModel0), 7, null), color.black_10, color.black_4, 0.0f, 1.0f, 4, null);
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
            d.a(v1, composer1, v1, function20);
        }
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
        String s3 = (String)state0.getValue();
        composer1.startReplaceGroup(0xF5AF5FBB);
        if(s3 == null) {
            boxScopeInstance1 = boxScopeInstance0;
            composeUiNode$Companion1 = composeUiNode$Companion0;
            modifier$Companion1 = modifier$Companion0;
        }
        else {
            File file0 = new File(s3).isFile() ? new File(s3) : s3;
            boxScopeInstance1 = boxScopeInstance0;
            composeUiNode$Companion1 = composeUiNode$Companion0;
            modifier$Companion1 = modifier$Companion0;
            CommonImageKt.CommonImage(file0, null, ImageModifiers.INSTANCE.getDEFAULT(composer1, 6), null, null, null, composer1, 56, 56);
        }
        composer1.endReplaceGroup();
        Modifier modifier2 = boxScopeInstance1.align(modifier$Companion1, alignment$Companion0.getCenter());
        MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), alignment$Companion0.getCenterHorizontally(), composer1, 0x30);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
        Function0 function01 = composeUiNode$Companion1.getConstructor();
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
        Function2 function21 = a.a(composeUiNode$Companion1, composer1, measurePolicy1, composer1, compositionLocalMap1);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
            d.a(v2, composer1, v2, function21);
        }
        Updater.set-impl(composer1, modifier3, composeUiNode$Companion1.getSetModifier());
        int v3 = z ? drawable.ic_input_cam_w : drawable.ic_input_imagepicker_cam_w;
        Modifier modifier4 = SizeKt.wrapContentSize$default(PaddingKt.padding-qDBjuR0$default(modifier$Companion1, 0.0f, 0.0f, 0.0f, 0.0f, 13, null), null, false, 3, null);
        ImageKt.Image(PainterResources_androidKt.painterResource(v3, composer1, 0), null, modifier4, null, ContentScale.Companion.getCrop(), 0.0f, null, composer1, 25016, 104);
        composer1.startReplaceGroup(0xE0CDBA0E);
        if(z) {
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(StringResources_androidKt.stringResource(string.label_editor_setting_thumbnail, composer1, 0), null, ColorResources_androidKt.colorResource(color.color_bbbbbb, composer1, 0), 0x141300000L, null, FontWeight.Companion.getNormal(), TypeKt.getTFont(), 0L, null, null, 0L, 0, false, false, 0, 0, null, null, composer1, 0x1B0C00, 0xC00, 0x3DF92);
        }
        composer1.endReplaceGroup();
        composer1.endNode();
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j3(editorSettingFragment0, editorViewModel0, v));
        }
    }

    public static final void access$TitleText(EditorSettingFragment editorSettingFragment0, int v, Composer composer0, int v1) {
        editorSettingFragment0.getClass();
        Composer composer1 = composer0.startRestartGroup(0x21F8FAE0);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        if((v2 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x21F8FAE0, v2, -1, "com.kakao.tistory.presentation.view.editor.EditorSettingFragment.TitleText (EditorSettingFragment.kt:708)");
            }
            String s = StringResources_androidKt.stringResource(v, composer1, v2 & 14);
            TextStyle textStyle0 = MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getH3();
            TextUnitKt.checkArithmetic--R2X_6o(0x13CA3D70AL);
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, null, 0L, 0L, null, null, null, 0x1BCA3D70AL, null, null, 0L, 0, false, false, 0, 0, null, textStyle0, composer1, 0, 0, 0x1FF7E);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o3(editorSettingFragment0, v, v1));
        }
    }

    public static final void access$VerticalLine(EditorSettingFragment editorSettingFragment0, Composer composer0, int v) {
        editorSettingFragment0.getClass();
        Composer composer1 = composer0.startRestartGroup(0xCBB7A872);
        if((v & 1) != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xCBB7A872, v, -1, "com.kakao.tistory.presentation.view.editor.EditorSettingFragment.VerticalLine (EditorSettingFragment.kt:730)");
            }
            BoxKt.Box(BackgroundKt.background-bw27NRU$default(SizeKt.size-VpY3zN4(PaddingKt.padding-VpY3zN4$default(Modifier.Companion, 15.0f, 0.0f, 2, null), 1.0f, 12.0f), ColorResources_androidKt.colorResource(color.gray8, composer1, 0), null, 2, null), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new p3(editorSettingFragment0, v));
        }
    }

    public static final void access$VisibilityItem(EditorSettingFragment editorSettingFragment0, int v, int v1, int v2, boolean z, boolean z1, Function0 function00, Composer composer0, int v3) {
        editorSettingFragment0.getClass();
        Composer composer1 = composer0.startRestartGroup(0x60C83D26);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x60C83D26, v3, -1, "com.kakao.tistory.presentation.view.editor.EditorSettingFragment.VisibilityItem (EditorSettingFragment.kt:372)");
        }
        String s = StringResources_androidKt.stringResource((z ? string.content_desc_select_already : string.content_desc_select_none_already), new Object[]{StringResources_androidKt.stringResource(v, composer1, v3 & 14)}, composer1, 0x40);
        String s1 = StringResources_androidKt.stringResource(v, composer1, v3 & 14);
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        composer1.startReplaceGroup(893005153);
        boolean z2 = composer1.changed(s);
        q3 q30 = composer1.rememberedValue();
        if(z2 || q30 == Composer.Companion.getEmpty()) {
            q30 = new q3(s);
            composer1.updateRememberedValue(q30);
        }
        composer1.endReplaceGroup();
        Modifier modifier0 = AlphaKt.alpha(SizeKt.width-3ABfNKs(PaddingKt.padding-qDBjuR0$default(ClickableKt.clickable-XHw0xAI$default(SemanticsModifierKt.clearAndSetSemantics(modifier$Companion0, q30), z1, null, null, function00, 6, null), 0.0f, 1.0f, 0.0f, 0.0f, 13, null), 36.0f), (z1 ? 1.0f : 0.5f));
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composer1, 0x30);
        int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
            d.a(v4, composer1, v4, function20);
        }
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        ImageKt.Image(PainterResources_androidKt.painterResource((z ? v1 : v2), composer1, 0), null, null, null, null, 0.0f, null, composer1, 56, 0x7C);
        b.a(3.0f, modifier$Companion0, composer1, 6);
        editorSettingFragment0.a(s1, (z ? FontWeight.Companion.getSemiBold() : FontWeight.Companion.getLight()), composer1, 0x200, 0);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r3(editorSettingFragment0, v, v1, v2, z, z1, function00, v3));
        }
    }

    public static final EditorViewModel access$getEditorViewModel(EditorSettingFragment editorSettingFragment0) {
        return (EditorViewModel)editorSettingFragment0.l.getValue();
    }

    public static final void access$goToPhotoPicker(EditorSettingFragment editorSettingFragment0) {
        Context context0 = editorSettingFragment0.requireContext();
        Intrinsics.checkNotNullExpressionValue(context0, "requireContext(...)");
        Intent intent0 = GalleryPicker.INSTANCE.newIntent(context0, 1, x3.a);
        editorSettingFragment0.m.launch(intent0);
    }

    public static final void access$showProtectedDialog(EditorSettingFragment editorSettingFragment0, String s) {
        editorSettingFragment0.getClass();
        EntryPasswordDialogFragment entryPasswordDialogFragment0 = EntryPasswordDialogFragment.Companion.newInstance(s);
        entryPasswordDialogFragment0.setOnClickOkCallback(new r4(editorSettingFragment0));
        entryPasswordDialogFragment0.setOnClickCancelCallback(s4.a);
        entryPasswordDialogFragment0.show(editorSettingFragment0.getChildFragmentManager(), "EditorSettingFragment");
    }

    public final void b(EditorViewModel editorViewModel0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x68F400BB);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x68F400BB, v, -1, "com.kakao.tistory.presentation.view.editor.EditorSettingFragment.HomeCategorySelector (EditorSettingFragment.kt:457)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(editorViewModel0.getDaumLikeName(), composer1, 8);
        this.a(string.label_editor_setting_home_category, ((String)state0.getValue()), string.label_editor_setting_home_category, false, new l2(editorViewModel0), composer1, 0x40000, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m2(this, editorViewModel0, v));
        }
    }

    public final void c(EditorViewModel editorViewModel0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x99CC11C9);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x99CC11C9, v, -1, "com.kakao.tistory.presentation.view.editor.EditorSettingFragment.PasswordContainer (EditorSettingFragment.kt:506)");
        }
        this.a(null, 0.0f, false, null, ComposableLambdaKt.rememberComposableLambda(0xB111D5A0, true, new q2(this, editorViewModel0, LiveDataAdapterKt.observeAsState(editorViewModel0.getPassword(), "", composer1, 56)), composer1, 54), composer1, 0x46000, 15);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r2(this, editorViewModel0, v));
        }
    }

    public final void d(EditorViewModel editorViewModel0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1950892957);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1950892957, v, -1, "com.kakao.tistory.presentation.view.editor.EditorSettingFragment.PublishDateContainer (EditorSettingFragment.kt:548)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(editorViewModel0.getReserveType(), composer1, 8);
        boolean z = ((ReservedType)state0.getValue()) == ReservedType.PUBLISHED;
        boolean z1 = ((ReservedType)state0.getValue()) == ReservedType.PUBLISH_NOW;
        boolean z2 = ((ReservedType)state0.getValue()) == ReservedType.RESERVE;
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(-883370708, true, new v2(z2, this, editorViewModel0, editorViewModel0.getReservedOrPublishedDate(), z1, z), composer1, 54);
        this.a(null, (z2 ? 96.0f : 52.0f), false, Alignment.Companion.getTop(), composableLambda0, composer1, 0x46C00, 5);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new w2(this, editorViewModel0, v));
        }
    }

    public final void e(EditorViewModel editorViewModel0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xBA70CEFF);
        int v1 = -1;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xBA70CEFF, v, -1, "com.kakao.tistory.presentation.view.editor.EditorSettingFragment.SettingScreen (EditorSettingFragment.kt:127)");
        }
        SoftwareKeyboardController softwareKeyboardController0 = (SoftwareKeyboardController)composer1.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
        Unit unit0 = Unit.INSTANCE;
        composer1.startReplaceGroup(0xFDD36E2D);
        boolean z = composer1.changed(softwareKeyboardController0);
        d3 d30 = composer1.rememberedValue();
        if(z || d30 == Composer.Companion.getEmpty()) {
            d30 = new d3(softwareKeyboardController0, null);
            composer1.updateRememberedValue(d30);
        }
        composer1.endReplaceGroup();
        EffectsKt.LaunchedEffect(unit0, d30, composer1, 70);
        Modifier modifier0 = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer1, 0, 1), false, null, false, 14, null);
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
            d.a(v2, composer1, v2, function20);
        }
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        this.a(null, 136.5f, false, null, ComposableLambdaKt.rememberComposableLambda(0xA240FDCC, true, new e3(this, editorViewModel0), composer1, 54), composer1, 0x46030, 13);
        EditorChallenge editorChallenge0 = (EditorChallenge)SnapshotStateKt.collectAsState(editorViewModel0.getChallenge(), null, null, composer1, 56, 2).getValue();
        composer1.startReplaceGroup(0x409F666);
        if(editorChallenge0 != null) {
            this.a(editorChallenge0.getTagLabel(), new f3(editorViewModel0), composer1, 0x200);
        }
        composer1.endReplaceGroup();
        this.a(editorViewModel0, composer1, 72);
        State state0 = LiveDataAdapterKt.observeAsState(editorViewModel0.getEntryVisibilityType(), EntryVisibilityType.PUBLIC, composer1, 56);
        State state1 = LiveDataAdapterKt.observeAsState(editorViewModel0.getCategoryVisibility(), EntryCategoryVisibilityType.PUBLIC.getValue(), composer1, 8);
        Object object0 = state0.getValue();
        Intrinsics.checkNotNullExpressionValue(((EntryVisibilityType)object0), "SettingScreen$lambda$10$lambda$8(...)");
        this.a(editorViewModel0, ((EntryVisibilityType)object0), ((Number)state1.getValue()).intValue(), composer1, 0x1008);
        EntryVisibilityType entryVisibilityType0 = (EntryVisibilityType)state0.getValue();
        if(entryVisibilityType0 != null) {
            v1 = WhenMappings.$EnumSwitchMapping$0[entryVisibilityType0.ordinal()];
        }
        switch(v1) {
            case 1: {
                composer1.startReplaceGroup(2101231245);
                this.b(editorViewModel0, composer1, 72);
                this.d(editorViewModel0, composer1, 72);
                composer1.endReplaceGroup();
                break;
            }
            case 2: {
                composer1.startReplaceGroup(0x7D40E070);
                this.c(editorViewModel0, composer1, 72);
                this.d(editorViewModel0, composer1, 72);
                composer1.endReplaceGroup();
                break;
            }
            default: {
                composer1.startReplaceGroup(0x7D4307E6);
                composer1.endReplaceGroup();
            }
        }
        this.a(composer1, 8);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g3(this, editorViewModel0, v));
        }
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryComposeFragment
    public void onViewCreated(@NotNull View view0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        super.onViewCreated(view0, bundle0);
        this.a();
        EditorSettingTiara.INSTANCE.trackPage();
    }
}

