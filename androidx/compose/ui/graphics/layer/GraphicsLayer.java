package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Outline;
import android.os.Build.VERSION;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Outline.Generic;
import androidx.compose.ui.graphics.Outline.Rectangle;
import androidx.compose.ui.graphics.Outline.Rounded;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.DrawContextKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import lc.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;
import s1.b;
import s1.h;

@Metadata(d1 = {"\u0000\u00AE\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u009C\u00012\u00020\u0001:\u0002\u009C\u0001B\u001B\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007JA\u0010\u0015\u001A\u00020\u00102\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f2\u0017\u0010\u0012\u001A\u0013\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u00100\u000E\u00A2\u0006\u0002\b\u0011\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u001A\u001A\u00020\u00102\u0006\u0010\u0017\u001A\u00020\u0016H\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001E\u001A\u00020\u00102\u0006\u0010\u0017\u001A\u00020\u00162\b\u0010\u001B\u001A\u0004\u0018\u00010\u0000H\u0000\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u000F\u0010!\u001A\u00020\u0010H\u0000\u00A2\u0006\u0004\b\u001F\u0010 J\u000F\u0010#\u001A\u00020\u0010H\u0000\u00A2\u0006\u0004\b\"\u0010 J\u000F\u0010%\u001A\u00020\u0010H\u0001\u00A2\u0006\u0004\b$\u0010 J\u0015\u0010(\u001A\u00020\u00102\u0006\u0010\'\u001A\u00020&\u00A2\u0006\u0004\b(\u0010)J.\u00101\u001A\u00020\u00102\b\b\u0002\u0010+\u001A\u00020*2\b\b\u0002\u0010\r\u001A\u00020,2\b\b\u0002\u0010.\u001A\u00020-\u00F8\u0001\u0000\u00A2\u0006\u0004\b/\u00100J$\u00104\u001A\u00020\u00102\b\b\u0002\u0010+\u001A\u00020*2\b\b\u0002\u0010\r\u001A\u00020,\u00F8\u0001\u0000\u00A2\u0006\u0004\b2\u00103J\u0010\u00106\u001A\u000205H\u0086@\u00A2\u0006\u0004\b6\u00107R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010;R$\u0010@\u001A\u00020<2\u0006\u0010=\u001A\u00020<8\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\b>\u0010?\u001A\u0004\b@\u0010AR0\u0010+\u001A\u00020B2\u0006\u0010C\u001A\u00020B8\u0006@FX\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\bD\u0010E\u001A\u0004\bF\u0010G\"\u0004\bH\u0010IR0\u0010\r\u001A\u00020\f2\u0006\u0010C\u001A\u00020\f8\u0006@BX\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\bJ\u0010E\u001A\u0004\bK\u0010G\"\u0004\bL\u0010IR0\u0010P\u001A\u00020*2\u0006\u0010C\u001A\u00020*8\u0006@FX\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\bM\u0010E\u001A\u0004\bN\u0010G\"\u0004\bO\u0010IR*\u0010V\u001A\u00020Q2\u0006\u0010C\u001A\u00020Q8F@FX\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u001A\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010[\u001A\u00020-2\u0006\u0010C\u001A\u00020-8F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\bW\u0010X\"\u0004\bY\u0010ZR*\u0010_\u001A\u00020\\2\u0006\u0010C\u001A\u00020\\8F@FX\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u001A\u0004\b]\u0010S\"\u0004\b^\u0010UR(\u0010e\u001A\u0004\u0018\u00010`2\b\u0010C\u001A\u0004\u0018\u00010`8F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\ba\u0010b\"\u0004\bc\u0010dR$\u0010h\u001A\u00020-2\u0006\u0010C\u001A\u00020-8F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\bf\u0010X\"\u0004\bg\u0010ZR$\u0010k\u001A\u00020-2\u0006\u0010C\u001A\u00020-8F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\bi\u0010X\"\u0004\bj\u0010ZR$\u0010n\u001A\u00020-2\u0006\u0010C\u001A\u00020-8F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\bl\u0010X\"\u0004\bm\u0010ZR$\u0010q\u001A\u00020-2\u0006\u0010C\u001A\u00020-8F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\bo\u0010X\"\u0004\bp\u0010ZR$\u0010t\u001A\u00020-2\u0006\u0010C\u001A\u00020-8F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\br\u0010X\"\u0004\bs\u0010ZR$\u0010w\u001A\u00020-2\u0006\u0010C\u001A\u00020-8F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\bu\u0010X\"\u0004\bv\u0010ZR$\u0010z\u001A\u00020-2\u0006\u0010C\u001A\u00020-8F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\bx\u0010X\"\u0004\by\u0010ZR$\u0010}\u001A\u00020-2\u0006\u0010C\u001A\u00020-8F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\b{\u0010X\"\u0004\b|\u0010ZR%\u0010\u0080\u0001\u001A\u00020-2\u0006\u0010C\u001A\u00020-8F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\b~\u0010X\"\u0004\b\u007F\u0010ZR/\u0010\u0085\u0001\u001A\u00020<2\u0006\u0010C\u001A\u00020<8F@FX\u0086\u000E\u00A2\u0006\u0016\u0012\u0005\b\u0084\u0001\u0010 \u001A\u0005\b\u0081\u0001\u0010A\"\u0006\b\u0082\u0001\u0010\u0083\u0001R/\u0010\u008B\u0001\u001A\u0005\u0018\u00010\u0086\u00012\t\u0010C\u001A\u0005\u0018\u00010\u0086\u00018F@FX\u0086\u000E\u00A2\u0006\u0010\u001A\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008A\u0001R\u0014\u0010\u008E\u0001\u001A\u00030\u008C\u00018F\u00A2\u0006\u0007\u001A\u0005\b\u008D\u0001\u0010GR\u0014\u0010\u0090\u0001\u001A\u00030\u008C\u00018F\u00A2\u0006\u0007\u001A\u0005\b\u008F\u0001\u0010GR\u0015\u0010\u0094\u0001\u001A\u00030\u0091\u00018F\u00A2\u0006\b\u001A\u0006\b\u0092\u0001\u0010\u0093\u0001R/\u0010\u0098\u0001\u001A\u00030\u0095\u00012\u0007\u0010C\u001A\u00030\u0095\u00018F@FX\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\u001A\u0005\b\u0096\u0001\u0010G\"\u0005\b\u0097\u0001\u0010IR/\u0010\u009B\u0001\u001A\u00030\u0095\u00012\u0007\u0010C\u001A\u00030\u0095\u00018F@FX\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\u001A\u0005\b\u0099\u0001\u0010G\"\u0005\b\u009A\u0001\u0010I\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u009D\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "impl", "Landroidx/compose/ui/graphics/layer/LayerManager;", "layerManager", "<init>", "(Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;Landroidx/compose/ui/graphics/layer/LayerManager;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/IntSize;", "size", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "block", "record-mL-hObY", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;JLkotlin/jvm/functions/Function1;)V", "record", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "drawForPersistence$ui_graphics_release", "(Landroidx/compose/ui/graphics/Canvas;)V", "drawForPersistence", "parentLayer", "draw$ui_graphics_release", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "draw", "release$ui_graphics_release", "()V", "release", "discardDisplayList$ui_graphics_release", "discardDisplayList", "emulateTrimMemory$ui_graphics_release", "emulateTrimMemory", "Landroidx/compose/ui/graphics/Path;", "path", "setPathOutline", "(Landroidx/compose/ui/graphics/Path;)V", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "Landroidx/compose/ui/geometry/Size;", "", "cornerRadius", "setRoundRectOutline-TNW_H78", "(JJF)V", "setRoundRectOutline", "setRectOutline-tz77jQw", "(JJ)V", "setRectOutline", "Landroidx/compose/ui/graphics/ImageBitmap;", "toImageBitmap", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "getImpl$ui_graphics_release", "()Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "", "<set-?>", "r", "Z", "isReleased", "()Z", "Landroidx/compose/ui/unit/IntOffset;", "value", "s", "J", "getTopLeft-nOcc-ac", "()J", "setTopLeft--gyyYBs", "(J)V", "t", "getSize-YbymL2g", "setSize-ozmzZPI", "u", "getPivotOffset-F1C5BW0", "setPivotOffset-k-4lQ0M", "pivotOffset", "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "getCompositingStrategy-ke2Ky5w", "()I", "setCompositingStrategy-Wpw9cng", "(I)V", "compositingStrategy", "getAlpha", "()F", "setAlpha", "(F)V", "alpha", "Landroidx/compose/ui/graphics/BlendMode;", "getBlendMode-0nO6VwU", "setBlendMode-s9anfk8", "blendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "colorFilter", "getScaleX", "setScaleX", "scaleX", "getScaleY", "setScaleY", "scaleY", "getTranslationX", "setTranslationX", "translationX", "getTranslationY", "setTranslationY", "translationY", "getShadowElevation", "setShadowElevation", "shadowElevation", "getRotationX", "setRotationX", "rotationX", "getRotationY", "setRotationY", "rotationY", "getRotationZ", "setRotationZ", "rotationZ", "getCameraDistance", "setCameraDistance", "cameraDistance", "getClip", "setClip", "(Z)V", "getClip$annotations", "clip", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "", "getLayerId", "layerId", "getOwnerViewId", "ownerViewId", "Landroidx/compose/ui/graphics/Outline;", "getOutline", "()Landroidx/compose/ui/graphics/Outline;", "outline", "Landroidx/compose/ui/graphics/Color;", "getAmbientShadowColor-0d7_KjU", "setAmbientShadowColor-8_81llA", "ambientShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "spotShadowColor", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidGraphicsLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGraphicsLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayer\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 ChildLayerDependenciesTracker.kt\nandroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,1023:1\n603#1,5:1077\n608#1,5:1083\n603#1,5:1134\n608#1,5:1140\n205#2:1024\n205#2:1082\n205#2:1092\n205#2:1139\n44#3,20:1025\n64#3,4:1072\n107#3,6:1098\n113#3,3:1131\n267#4,4:1045\n237#4,7:1049\n248#4,3:1057\n251#4,2:1061\n272#4,2:1063\n254#4,6:1065\n274#4:1071\n267#4,4:1104\n237#4,7:1108\n248#4,3:1116\n251#4,2:1120\n272#4,2:1122\n254#4,6:1124\n274#4:1130\n1810#5:1056\n1672#5:1060\n1810#5:1115\n1672#5:1119\n1#6:1076\n26#7:1088\n26#7:1089\n26#7:1090\n26#7:1091\n38#8,5:1093\n*S KotlinDebug\n*F\n+ 1 AndroidGraphicsLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayer\n*L\n583#1:1077,5\n583#1:1083,5\n709#1:1134,5\n709#1:1140,5\n138#1:1024\n583#1:1082\n607#1:1092\n709#1:1139\n427#1:1025,20\n427#1:1072,4\n670#1:1098,6\n670#1:1131,3\n427#1:1045,4\n427#1:1049,7\n427#1:1057,3\n427#1:1061,2\n427#1:1063,2\n427#1:1065,6\n427#1:1071\n670#1:1104,4\n670#1:1108,7\n670#1:1116,3\n670#1:1120,2\n670#1:1122,2\n670#1:1124,6\n670#1:1130\n427#1:1056\n427#1:1060\n670#1:1115\n670#1:1119\n585#1:1088\n586#1:1089\n587#1:1090\n588#1:1091\n624#1:1093,5\n*E\n"})
public final class GraphicsLayer {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayer$Companion;", "", "Landroidx/compose/ui/graphics/layer/LayerSnapshotImpl;", "SnapshotImpl", "Landroidx/compose/ui/graphics/layer/LayerSnapshotImpl;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final GraphicsLayerImpl a;
    public final LayerManager b;
    public Density c;
    public LayoutDirection d;
    public Function1 e;
    public Outline f;
    public boolean g;
    public long h;
    public long i;
    public float j;
    public androidx.compose.ui.graphics.Outline k;
    public Path l;
    public Path m;
    public boolean n;
    public Paint o;
    public int p;
    public final ChildLayerDependenciesTracker q;
    public boolean r;
    public long s;
    public long t;
    public long u;
    public static final LayerSnapshotImpl v;

    static {
        GraphicsLayer.Companion = new Companion(null);
        LayerSnapshotV28 layerSnapshotV280 = Build.VERSION.SDK_INT >= 28 ? (/* 缺少Lambda参数 */, /* 缺少Lambda参数 */) -> a.b(new h(graphicsLayer0)) : LayerSnapshotV22.INSTANCE;
        GraphicsLayer.v = layerSnapshotV280;
    }

    public GraphicsLayer(@NotNull GraphicsLayerImpl graphicsLayerImpl0, @Nullable LayerManager layerManager0) {
        this.a = graphicsLayerImpl0;
        this.b = layerManager0;
        this.c = DrawContextKt.getDefaultDensity();
        this.d = LayoutDirection.Ltr;
        this.e = s1.a.w;
        this.g = true;
        this.h = 0L;
        this.i = 0x7FC000007FC00000L;
        this.q = new ChildLayerDependenciesTracker();
        graphicsLayerImpl0.setClip(false);
        this.s = 0L;
        this.t = 0L;
        this.u = 0x7FC000007FC00000L;
    }

    public final void a() {
        if(this.g) {
            boolean z = this.getClip();
            GraphicsLayerImpl graphicsLayerImpl0 = this.a;
            if(z || this.getShadowElevation() > 0.0f) {
                Path path0 = this.l;
                if(path0 == null) {
                    Outline outline2 = this.f;
                    if(outline2 == null) {
                        outline2 = new Outline();
                        this.f = outline2;
                    }
                    long v1 = IntSizeKt.toSize-ozmzZPI(this.t);
                    long v2 = this.h;
                    long v3 = this.i;
                    if(v3 != 0x7FC000007FC00000L) {
                        v1 = v3;
                    }
                    outline2.setRoundRect(Math.round(Offset.getX-impl(v2)), Math.round(Offset.getY-impl(v2)), Math.round(Size.getWidth-impl(v1) + Offset.getX-impl(v2)), Math.round(Size.getHeight-impl(v1) + Offset.getY-impl(v2)), this.j);
                    outline2.setAlpha(this.getAlpha());
                    graphicsLayerImpl0.setOutline(outline2);
                }
                else {
                    Outline outline0 = this.f;
                    if(outline0 == null) {
                        outline0 = new Outline();
                        this.f = outline0;
                    }
                    int v = Build.VERSION.SDK_INT;
                    if(v <= 28 && !path0.isConvex()) {
                        Outline outline1 = this.f;
                        if(outline1 != null) {
                            outline1.setEmpty();
                        }
                        this.n = true;
                        graphicsLayerImpl0.setInvalidated(true);
                        goto label_27;
                    }
                    else if(v > 30) {
                        OutlineVerificationHelper.INSTANCE.setPath(outline0, path0);
                        this.n = !outline0.canClip();
                        goto label_27;
                    }
                    else {
                        if(!(path0 instanceof AndroidPath)) {
                            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                        }
                        outline0.setConvexPath(((AndroidPath)path0).getInternalPath());
                        this.n = !outline0.canClip();
                    label_27:
                        this.l = path0;
                        outline0.setAlpha(this.getAlpha());
                        graphicsLayerImpl0.setOutline(outline0);
                    }
                }
            }
            else {
                graphicsLayerImpl0.setOutline(null);
            }
        }
        this.g = false;
    }

    public final void b() {
        ChildLayerDependenciesTracker childLayerDependenciesTracker0 = this.q;
        childLayerDependenciesTracker0.b = childLayerDependenciesTracker0.a;
        MutableScatterSet mutableScatterSet0 = childLayerDependenciesTracker0.c;
        if(mutableScatterSet0 != null && mutableScatterSet0.isNotEmpty()) {
            MutableScatterSet mutableScatterSet1 = childLayerDependenciesTracker0.d;
            if(mutableScatterSet1 == null) {
                mutableScatterSet1 = ScatterSetKt.mutableScatterSetOf();
                childLayerDependenciesTracker0.d = mutableScatterSet1;
            }
            mutableScatterSet1.addAll(mutableScatterSet0);
            mutableScatterSet0.clear();
        }
        childLayerDependenciesTracker0.e = true;
        this.a.record(this.c, this.d, this, this.e);
        childLayerDependenciesTracker0.e = false;
        GraphicsLayer graphicsLayer0 = childLayerDependenciesTracker0.b;
        if(graphicsLayer0 != null) {
            int v = graphicsLayer0.p - 1;
            graphicsLayer0.p = v;
            if(graphicsLayer0.r && v == 0) {
                LayerManager layerManager0 = graphicsLayer0.b;
                if(layerManager0 == null) {
                    graphicsLayer0.discardDisplayList$ui_graphics_release();
                }
                else {
                    layerManager0.release(graphicsLayer0);
                }
            }
        }
        MutableScatterSet mutableScatterSet2 = childLayerDependenciesTracker0.d;
        if(mutableScatterSet2 != null && mutableScatterSet2.isNotEmpty()) {
            Object[] arr_object = mutableScatterSet2.elements;
            long[] arr_v = mutableScatterSet2.metadata;
            int v1 = arr_v.length - 2;
            if(v1 >= 0) {
                for(int v2 = 0; true; ++v2) {
                    long v3 = arr_v[v2];
                    if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                        int v4 = 8 - (~(v2 - v1) >>> 0x1F);
                        for(int v5 = 0; v5 < v4; ++v5) {
                            if((0xFFL & v3) < 0x80L) {
                                GraphicsLayer graphicsLayer1 = (GraphicsLayer)arr_object[(v2 << 3) + v5];
                                int v6 = graphicsLayer1.p - 1;
                                graphicsLayer1.p = v6;
                                if(graphicsLayer1.r && v6 == 0) {
                                    LayerManager layerManager1 = graphicsLayer1.b;
                                    if(layerManager1 == null) {
                                        graphicsLayer1.discardDisplayList$ui_graphics_release();
                                    }
                                    else {
                                        layerManager1.release(graphicsLayer1);
                                    }
                                }
                            }
                            v3 >>= 8;
                        }
                        if(v4 != 8) {
                            mutableScatterSet2.clear();
                            return;
                        }
                    }
                    if(v2 == v1) {
                        break;
                    }
                }
                mutableScatterSet2.clear();
                return;
            }
            mutableScatterSet2.clear();
        }
    }

    public final void c() {
        this.k = null;
        this.l = null;
        this.i = 0x7FC000007FC00000L;
        this.h = 0L;
        this.j = 0.0f;
        this.g = true;
        this.n = false;
    }

    public final void discardDisplayList$ui_graphics_release() {
        ChildLayerDependenciesTracker childLayerDependenciesTracker0 = this.q;
        GraphicsLayer graphicsLayer0 = childLayerDependenciesTracker0.a;
        if(graphicsLayer0 != null) {
            int v = graphicsLayer0.p - 1;
            graphicsLayer0.p = v;
            if(graphicsLayer0.r && v == 0) {
                LayerManager layerManager0 = graphicsLayer0.b;
                if(layerManager0 == null) {
                    graphicsLayer0.discardDisplayList$ui_graphics_release();
                }
                else {
                    layerManager0.release(graphicsLayer0);
                }
            }
            childLayerDependenciesTracker0.a = null;
        }
        MutableScatterSet mutableScatterSet0 = childLayerDependenciesTracker0.c;
        if(mutableScatterSet0 != null) {
            Object[] arr_object = mutableScatterSet0.elements;
            long[] arr_v = mutableScatterSet0.metadata;
            int v1 = arr_v.length - 2;
            if(v1 >= 0) {
                int v2 = 0;
                while(true) {
                    long v3 = arr_v[v2];
                    if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                        goto label_40;
                    }
                    int v4 = 8 - (~(v2 - v1) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L) {
                            GraphicsLayer graphicsLayer1 = (GraphicsLayer)arr_object[(v2 << 3) + v5];
                            int v6 = graphicsLayer1.p - 1;
                            graphicsLayer1.p = v6;
                            if(graphicsLayer1.r && v6 == 0) {
                                LayerManager layerManager1 = graphicsLayer1.b;
                                if(layerManager1 == null) {
                                    graphicsLayer1.discardDisplayList$ui_graphics_release();
                                }
                                else {
                                    layerManager1.release(graphicsLayer1);
                                }
                            }
                        }
                        v3 >>= 8;
                    }
                    if(v4 == 8) {
                    label_40:
                        if(v2 != v1) {
                            ++v2;
                            continue;
                        }
                        break;
                    }
                    else {
                        mutableScatterSet0.clear();
                    }
                    this.a.discardDisplayList();
                    return;
                }
            }
            mutableScatterSet0.clear();
        }
        this.a.discardDisplayList();
    }

    public final void draw$ui_graphics_release(@NotNull Canvas canvas0, @Nullable GraphicsLayer graphicsLayer0) {
        float f5;
        if(this.r) {
            return;
        }
        GraphicsLayerImpl graphicsLayerImpl0 = this.a;
        if(!graphicsLayerImpl0.getHasDisplayList()) {
            try {
                this.b();
            }
            catch(Throwable unused_ex) {
            }
        }
        this.a();
        boolean z = this.getShadowElevation() > 0.0f;
        if(z) {
            canvas0.enableZ();
        }
        android.graphics.Canvas canvas1 = AndroidCanvas_androidKt.getNativeCanvas(canvas0);
        boolean z1 = canvas1.isHardwareAccelerated();
        if(!z1) {
            canvas1.save();
            float f = (float)IntOffset.getX-impl(this.s);
            float f1 = (float)IntOffset.getY-impl(this.s);
            float f2 = ((float)IntOffset.getX-impl(this.s)) + ((float)IntSize.getWidth-impl(this.t));
            float f3 = ((float)IntOffset.getY-impl(this.s)) + ((float)IntSize.getHeight-impl(this.t));
            float f4 = this.getAlpha();
            ColorFilter colorFilter0 = this.getColorFilter();
            int v = this.getBlendMode-0nO6VwU();
            if(f4 < 1.0f || !BlendMode.equals-impl0(v, 3) || colorFilter0 != null || CompositingStrategy.equals-impl0(this.getCompositingStrategy-ke2Ky5w(), 1)) {
                Paint paint0 = this.o;
                if(paint0 == null) {
                    paint0 = AndroidPaint_androidKt.Paint();
                    this.o = paint0;
                }
                paint0.setAlpha(f4);
                paint0.setBlendMode-s9anfk8(v);
                paint0.setColorFilter(colorFilter0);
                f5 = f1;
                canvas1.saveLayer(f, f1, f2, f3, paint0.asFrameworkPaint());
            }
            else {
                canvas1.save();
                f5 = f1;
            }
            canvas1.translate(f, f5);
            canvas1.concat(graphicsLayerImpl0.calculateMatrix());
        }
        boolean z2 = this.n || !z1 && this.getClip();
        if(z2) {
            canvas0.save();
            androidx.compose.ui.graphics.Outline outline0 = this.getOutline();
            if(outline0 instanceof Rectangle) {
                Canvas.clipRect-mtrdD-E$default(canvas0, outline0.getBounds(), 0, 2, null);
            }
            else if(outline0 instanceof Rounded) {
                Path path0 = this.m;
                if(path0 == null) {
                    path0 = AndroidPath_androidKt.Path();
                    this.m = path0;
                }
                else {
                    path0.rewind();
                }
                Path.addRoundRect$default(path0, ((Rounded)outline0).getRoundRect(), null, 2, null);
                Canvas.clipPath-mtrdD-E$default(canvas0, path0, 0, 2, null);
            }
            else if(outline0 instanceof Generic) {
                Canvas.clipPath-mtrdD-E$default(canvas0, ((Generic)outline0).getPath(), 0, 2, null);
            }
        }
        if(graphicsLayer0 != null && graphicsLayer0.q.onDependencyAdded(this)) {
            ++this.p;
        }
        graphicsLayerImpl0.draw(canvas0);
        if(z2) {
            canvas0.restore();
        }
        if(z) {
            canvas0.disableZ();
        }
        if(!z1) {
            canvas1.restore();
        }
    }

    public final void drawForPersistence$ui_graphics_release(@NotNull Canvas canvas0) {
        if(AndroidCanvas_androidKt.getNativeCanvas(canvas0).isHardwareAccelerated()) {
            GraphicsLayerImpl graphicsLayerImpl0 = this.a;
            if(!graphicsLayerImpl0.getHasDisplayList()) {
                try {
                    this.b();
                }
                catch(Throwable unused_ex) {
                }
            }
            graphicsLayerImpl0.draw(canvas0);
        }
    }

    @TestOnly
    public final void emulateTrimMemory$ui_graphics_release() {
        this.a.discardDisplayList();
    }

    public final float getAlpha() {
        return this.a.getAlpha();
    }

    public final long getAmbientShadowColor-0d7_KjU() {
        return this.a.getAmbientShadowColor-0d7_KjU();
    }

    public final int getBlendMode-0nO6VwU() {
        return this.a.getBlendMode-0nO6VwU();
    }

    public final float getCameraDistance() {
        return this.a.getCameraDistance();
    }

    public final boolean getClip() {
        return this.a.getClip();
    }

    public static void getClip$annotations() {
    }

    @Nullable
    public final ColorFilter getColorFilter() {
        return this.a.getColorFilter();
    }

    public final int getCompositingStrategy-ke2Ky5w() {
        return this.a.getCompositingStrategy-ke2Ky5w();
    }

    @NotNull
    public final GraphicsLayerImpl getImpl$ui_graphics_release() {
        return this.a;
    }

    public final long getLayerId() {
        return this.a.getLayerId();
    }

    @NotNull
    public final androidx.compose.ui.graphics.Outline getOutline() {
        androidx.compose.ui.graphics.Outline outline0 = this.k;
        Path path0 = this.l;
        if(outline0 == null) {
            if(path0 != null) {
                outline0 = new Generic(path0);
                this.k = outline0;
                return outline0;
            }
            long v = IntSizeKt.toSize-ozmzZPI(this.t);
            long v1 = this.h;
            long v2 = this.i;
            if(v2 != 0x7FC000007FC00000L) {
                v = v2;
            }
            float f = Offset.getX-impl(v1);
            float f1 = Offset.getY-impl(v1);
            float f2 = Size.getWidth-impl(v) + f;
            float f3 = Size.getHeight-impl(v) + f1;
            float f4 = this.j;
            outline0 = f4 > 0.0f ? new Rounded(RoundRectKt.RoundRect-gG7oq9Y(f, f1, f2, f3, CornerRadiusKt.CornerRadius$default(f4, 0.0f, 2, null))) : new Rectangle(new Rect(f, f1, f2, f3));
            this.k = outline0;
        }
        return outline0;
    }

    public final long getOwnerViewId() {
        return this.a.getOwnerId();
    }

    public final long getPivotOffset-F1C5BW0() {
        return this.u;
    }

    @Nullable
    public final RenderEffect getRenderEffect() {
        return this.a.getRenderEffect();
    }

    public final float getRotationX() {
        return this.a.getRotationX();
    }

    public final float getRotationY() {
        return this.a.getRotationY();
    }

    public final float getRotationZ() {
        return this.a.getRotationZ();
    }

    public final float getScaleX() {
        return this.a.getScaleX();
    }

    public final float getScaleY() {
        return this.a.getScaleY();
    }

    public final float getShadowElevation() {
        return this.a.getShadowElevation();
    }

    public final long getSize-YbymL2g() {
        return this.t;
    }

    public final long getSpotShadowColor-0d7_KjU() {
        return this.a.getSpotShadowColor-0d7_KjU();
    }

    public final long getTopLeft-nOcc-ac() {
        return this.s;
    }

    public final float getTranslationX() {
        return this.a.getTranslationX();
    }

    public final float getTranslationY() {
        return this.a.getTranslationY();
    }

    public final boolean isReleased() {
        return this.r;
    }

    public final void record-mL-hObY(@NotNull Density density0, @NotNull LayoutDirection layoutDirection0, long v, @NotNull Function1 function10) {
        GraphicsLayerImpl graphicsLayerImpl0 = this.a;
        if(!IntSize.equals-impl0(this.t, v)) {
            this.t = v;
            graphicsLayerImpl0.setPosition-H0pRuoY(IntOffset.getX-impl(this.s), IntOffset.getY-impl(this.s), v);
            if(this.i == 0x7FC000007FC00000L) {
                this.g = true;
                this.a();
            }
        }
        this.c = density0;
        this.d = layoutDirection0;
        this.e = function10;
        graphicsLayerImpl0.setInvalidated(true);
        this.b();
    }

    public final void release$ui_graphics_release() {
        if(!this.r) {
            this.r = true;
            if(this.p == 0) {
                LayerManager layerManager0 = this.b;
                if(layerManager0 != null) {
                    layerManager0.release(this);
                    return;
                }
                this.discardDisplayList$ui_graphics_release();
            }
        }
    }

    public final void setAlpha(float f) {
        GraphicsLayerImpl graphicsLayerImpl0 = this.a;
        if(graphicsLayerImpl0.getAlpha() != f) {
            graphicsLayerImpl0.setAlpha(f);
        }
    }

    public final void setAmbientShadowColor-8_81llA(long v) {
        GraphicsLayerImpl graphicsLayerImpl0 = this.a;
        if(!Color.equals-impl0(v, graphicsLayerImpl0.getAmbientShadowColor-0d7_KjU())) {
            graphicsLayerImpl0.setAmbientShadowColor-8_81llA(v);
        }
    }

    public final void setBlendMode-s9anfk8(int v) {
        GraphicsLayerImpl graphicsLayerImpl0 = this.a;
        if(!BlendMode.equals-impl0(graphicsLayerImpl0.getBlendMode-0nO6VwU(), v)) {
            graphicsLayerImpl0.setBlendMode-s9anfk8(v);
        }
    }

    public final void setCameraDistance(float f) {
        GraphicsLayerImpl graphicsLayerImpl0 = this.a;
        if(graphicsLayerImpl0.getCameraDistance() != f) {
            graphicsLayerImpl0.setCameraDistance(f);
        }
    }

    public final void setClip(boolean z) {
        GraphicsLayerImpl graphicsLayerImpl0 = this.a;
        if(graphicsLayerImpl0.getClip() != z) {
            graphicsLayerImpl0.setClip(z);
            this.g = true;
            this.a();
        }
    }

    public final void setColorFilter(@Nullable ColorFilter colorFilter0) {
        GraphicsLayerImpl graphicsLayerImpl0 = this.a;
        if(!Intrinsics.areEqual(graphicsLayerImpl0.getColorFilter(), colorFilter0)) {
            graphicsLayerImpl0.setColorFilter(colorFilter0);
        }
    }

    public final void setCompositingStrategy-Wpw9cng(int v) {
        GraphicsLayerImpl graphicsLayerImpl0 = this.a;
        if(!CompositingStrategy.equals-impl0(graphicsLayerImpl0.getCompositingStrategy-ke2Ky5w(), v)) {
            graphicsLayerImpl0.setCompositingStrategy-Wpw9cng(v);
        }
    }

    public final void setPathOutline(@NotNull Path path0) {
        this.c();
        this.l = path0;
        this.a();
    }

    public final void setPivotOffset-k-4lQ0M(long v) {
        if(!Offset.equals-impl0(this.u, v)) {
            this.u = v;
            this.a.setPivotOffset-k-4lQ0M(v);
        }
    }

    public final void setRectOutline-tz77jQw(long v, long v1) {
        this.setRoundRectOutline-TNW_H78(v, v1, 0.0f);
    }

    public static void setRectOutline-tz77jQw$default(GraphicsLayer graphicsLayer0, long v, long v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0L;
        }
        if((v2 & 2) != 0) {
            v1 = 0x7FC000007FC00000L;
        }
        graphicsLayer0.setRectOutline-tz77jQw(v, v1);
    }

    public final void setRenderEffect(@Nullable RenderEffect renderEffect0) {
        GraphicsLayerImpl graphicsLayerImpl0 = this.a;
        if(!Intrinsics.areEqual(graphicsLayerImpl0.getRenderEffect(), renderEffect0)) {
            graphicsLayerImpl0.setRenderEffect(renderEffect0);
        }
    }

    public final void setRotationX(float f) {
        GraphicsLayerImpl graphicsLayerImpl0 = this.a;
        if(graphicsLayerImpl0.getRotationX() != f) {
            graphicsLayerImpl0.setRotationX(f);
        }
    }

    public final void setRotationY(float f) {
        GraphicsLayerImpl graphicsLayerImpl0 = this.a;
        if(graphicsLayerImpl0.getRotationY() != f) {
            graphicsLayerImpl0.setRotationY(f);
        }
    }

    public final void setRotationZ(float f) {
        GraphicsLayerImpl graphicsLayerImpl0 = this.a;
        if(graphicsLayerImpl0.getRotationZ() != f) {
            graphicsLayerImpl0.setRotationZ(f);
        }
    }

    public final void setRoundRectOutline-TNW_H78(long v, long v1, float f) {
        if(!Offset.equals-impl0(this.h, v) || !Size.equals-impl0(this.i, v1) || this.j != f || this.l != null) {
            this.c();
            this.h = v;
            this.i = v1;
            this.j = f;
            this.a();
        }
    }

    public static void setRoundRectOutline-TNW_H78$default(GraphicsLayer graphicsLayer0, long v, long v1, float f, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0L;
        }
        if((v2 & 2) != 0) {
            v1 = 0x7FC000007FC00000L;
        }
        if((v2 & 4) != 0) {
            f = 0.0f;
        }
        graphicsLayer0.setRoundRectOutline-TNW_H78(v, v1, f);
    }

    public final void setScaleX(float f) {
        GraphicsLayerImpl graphicsLayerImpl0 = this.a;
        if(graphicsLayerImpl0.getScaleX() != f) {
            graphicsLayerImpl0.setScaleX(f);
        }
    }

    public final void setScaleY(float f) {
        GraphicsLayerImpl graphicsLayerImpl0 = this.a;
        if(graphicsLayerImpl0.getScaleY() != f) {
            graphicsLayerImpl0.setScaleY(f);
        }
    }

    public final void setShadowElevation(float f) {
        GraphicsLayerImpl graphicsLayerImpl0 = this.a;
        if(graphicsLayerImpl0.getShadowElevation() != f) {
            graphicsLayerImpl0.setShadowElevation(f);
            graphicsLayerImpl0.setClip(this.getClip() || f > 0.0f);
            this.g = true;
            this.a();
        }
    }

    public final void setSpotShadowColor-8_81llA(long v) {
        GraphicsLayerImpl graphicsLayerImpl0 = this.a;
        if(!Color.equals-impl0(v, graphicsLayerImpl0.getSpotShadowColor-0d7_KjU())) {
            graphicsLayerImpl0.setSpotShadowColor-8_81llA(v);
        }
    }

    public final void setTopLeft--gyyYBs(long v) {
        if(!IntOffset.equals-impl0(this.s, v)) {
            this.s = v;
            this.a.setPosition-H0pRuoY(IntOffset.getX-impl(v), IntOffset.getY-impl(v), this.t);
        }
    }

    public final void setTranslationX(float f) {
        GraphicsLayerImpl graphicsLayerImpl0 = this.a;
        if(graphicsLayerImpl0.getTranslationX() != f) {
            graphicsLayerImpl0.setTranslationX(f);
        }
    }

    public final void setTranslationY(float f) {
        GraphicsLayerImpl graphicsLayerImpl0 = this.a;
        if(graphicsLayerImpl0.getTranslationY() != f) {
            graphicsLayerImpl0.setTranslationY(f);
        }
    }

    @Nullable
    public final Object toImageBitmap(@NotNull Continuation continuation0) {
        b b0;
        if(continuation0 instanceof b) {
            b0 = (b)continuation0;
            int v = b0.q;
            if((v & 0x80000000) == 0) {
                b0 = new b(this, continuation0);
            }
            else {
                b0.q = v ^ 0x80000000;
            }
        }
        else {
            b0 = new b(this, continuation0);
        }
        Object object0 = b0.o;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(b0.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                b0.q = 1;
                object0 = GraphicsLayer.v.toBitmap(this, b0);
                return object0 == object1 ? object1 : AndroidImageBitmap_androidKt.asImageBitmap(((Bitmap)object0));
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return AndroidImageBitmap_androidKt.asImageBitmap(((Bitmap)object0));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

