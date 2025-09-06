package aa;

import a2.b;
import android.content.Context;
import android.graphics.Matrix;
import android.view.View;
import androidx.activity.FullyDrawnReporter;
import androidx.activity.compose.ReportDrawnKt.ReportDrawnWhen.1.1.invoke..inlined.onDispose.1;
import androidx.activity.compose.ReportDrawnKt.ReportDrawnWhen.1.1.invoke..inlined.onDispose.2;
import androidx.arch.core.util.Function;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider.2.1.invoke..inlined.onDispose.1;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt.contextMenuBuilder.1.invoke..inlined.TextItem.1;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt.contextMenuBuilder.1.invoke..inlined.TextItem.2;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.contextMenuBuilder.1.invoke..inlined.TextItem.1;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.contextMenuBuilder.1.invoke..inlined.TextItem.2;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.contextMenuBuilder.1.invoke..inlined.TextItem.3;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.contextMenuBuilder.1.invoke..inlined.TextItem.4;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DateRangePickerKt;
import androidx.compose.material3.ExposedDropdownMenu_androidKt.SoftKeyboardListener.1.1.invoke..inlined.onDispose.1;
import androidx.compose.material3.ExposedDropdownMenu_androidKt.SoftKeyboardListener.1.1.listener.1;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SelectedRangeInfo;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TooltipScopeImpl;
import androidx.compose.material3.f2;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.obtainImageVectorCache.1.1.invoke..inlined.onDispose.1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.obtainImageVectorCache.callbacks.1.1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.obtainResourceIdCache.1.1.invoke..inlined.onDispose.1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.obtainResourceIdCache.callbacks.1.1;
import androidx.compose.ui.platform.AndroidPlatformTextInputSession;
import androidx.compose.ui.platform.AndroidUiDispatcher;
import androidx.compose.ui.platform.AndroidUiFrameClock;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.ui.platform.c1;
import androidx.compose.ui.platform.l0;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.font.TypefaceRequest;
import androidx.compose.ui.text.font.TypefaceRequestCache;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.platform.SynchronizedObject;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.MotionMeasurer;
import androidx.constraintlayout.compose.Visibility;
import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.lifecycle.MediatorLiveData;
import androidx.room.j0;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.viewpager.widget.ViewPager;
import com.kakao.kandinsky.decoration.DecorationBoxKt;
import com.kakao.kemoticon.EmoticonKeyboard;
import com.kakao.kemoticon.a;
import d0.f0;
import j.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.MutexImpl;
import zd.c;

public final class o extends Lambda implements Function1 {
    public final int w;
    public final Object x;
    public final Object y;

    public o(int v, Object object0, Object object1) {
        this.w = v;
        this.x = object0;
        this.y = object1;
        super(1);
    }

    public o(j0 j00, Function1 function10) {
        this.w = 21;
        this.x = j00;
        this.y = (Lambda)function10;
        super(1);
    }

    public o(Function1 function10, ConstrainScope constrainScope0) {
        this.w = 16;
        this.x = (Lambda)function10;
        this.y = constrainScope0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        boolean z4;
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
                ((Matrix)object0).postScale(Offset.getX-impl(DecorationBoxKt.access$BasicDecorationBox_vzil_yM$lambda$11(((State)this.y)).getFlip-F1C5BW0()), Offset.getY-impl(DecorationBoxKt.access$BasicDecorationBox_vzil_yM$lambda$11(((State)this.y)).getFlip-F1C5BW0()));
                ((Matrix)object0).postRotate(DecorationBoxKt.access$BasicDecorationBox_vzil_yM$lambda$11(((State)this.y)).getRotate());
                ((Matrix)object0).postConcat(((Matrix)this.x));
                return Unit.INSTANCE;
            }
            case 1: {
                ((SelectionManager)this.x).setSelection(((Selection)object0));
                ((Function1)this.y).invoke(((Selection)object0));
                return Unit.INSTANCE;
            }
            case 2: {
                boolean z = ((SelectionManager)this.y).isNonEmptySelection$foundation_release();
                ContextMenuScope.item$default(((ContextMenuScope)object0), new androidx.compose.foundation.text.ContextMenu_androidKt.TextItem.1(TextContextMenuItems.Copy), null, z, null, new SelectionManager_androidKt.contextMenuBuilder.1.invoke..inlined.TextItem.1(((ContextMenuState)this.x), ((SelectionManager)this.y)), 10, null);
                boolean z1 = ((SelectionManager)this.y).isEntireContainerSelected$foundation_release();
                ContextMenuScope.item$default(((ContextMenuScope)object0), new androidx.compose.foundation.text.ContextMenu_androidKt.TextItem.1(TextContextMenuItems.SelectAll), null, !z1, null, new SelectionManager_androidKt.contextMenuBuilder.1.invoke..inlined.TextItem.2(((ContextMenuState)this.x), ((SelectionManager)this.y)), 10, null);
                CollectionsKt__CollectionsKt.listOf(new Unit[]{Unit.INSTANCE, Unit.INSTANCE});
                return Unit.INSTANCE;
            }
            case 3: {
                TextFieldSelectionManager textFieldSelectionManager0 = (TextFieldSelectionManager)this.x;
                VisualTransformation visualTransformation0 = textFieldSelectionManager0.getVisualTransformation$foundation_release();
                boolean z2 = TextRange.getCollapsed-impl(textFieldSelectionManager0.getValue$foundation_release().getSelection-d9O1mEE());
                boolean z3 = !z2 && textFieldSelectionManager0.getEditable() && !(visualTransformation0 instanceof PasswordVisualTransformation);
                androidx.compose.foundation.text.ContextMenu_androidKt.TextItem.1 contextMenu_androidKt$TextItem$10 = new androidx.compose.foundation.text.ContextMenu_androidKt.TextItem.1(TextContextMenuItems.Cut);
                ContextMenuState contextMenuState0 = (ContextMenuState)this.y;
                ContextMenuScope.item$default(((ContextMenuScope)object0), contextMenu_androidKt$TextItem$10, null, z3, null, new TextFieldSelectionManager_androidKt.contextMenuBuilder.1.invoke..inlined.TextItem.1(contextMenuState0, textFieldSelectionManager0), 10, null);
                ContextMenuScope.item$default(((ContextMenuScope)object0), new androidx.compose.foundation.text.ContextMenu_androidKt.TextItem.1(TextContextMenuItems.Copy), null, !z2 && !(visualTransformation0 instanceof PasswordVisualTransformation), null, new TextFieldSelectionManager_androidKt.contextMenuBuilder.1.invoke..inlined.TextItem.2(contextMenuState0, textFieldSelectionManager0), 10, null);
                TextContextMenuItems textContextMenuItems0 = TextContextMenuItems.Paste;
                if(textFieldSelectionManager0.getEditable()) {
                    ClipboardManager clipboardManager0 = textFieldSelectionManager0.getClipboardManager$foundation_release();
                    z4 = clipboardManager0 == null || !clipboardManager0.hasText() ? false : true;
                }
                else {
                    z4 = false;
                }
                ContextMenuScope.item$default(((ContextMenuScope)object0), new androidx.compose.foundation.text.ContextMenu_androidKt.TextItem.1(textContextMenuItems0), null, z4, null, new TextFieldSelectionManager_androidKt.contextMenuBuilder.1.invoke..inlined.TextItem.3(contextMenuState0, textFieldSelectionManager0), 10, null);
                boolean z5 = TextRange.getLength-impl(textFieldSelectionManager0.getValue$foundation_release().getSelection-d9O1mEE()) != textFieldSelectionManager0.getValue$foundation_release().getText().length();
                ContextMenuScope.item$default(((ContextMenuScope)object0), new androidx.compose.foundation.text.ContextMenu_androidKt.TextItem.1(TextContextMenuItems.SelectAll), null, z5, null, new TextFieldSelectionManager_androidKt.contextMenuBuilder.1.invoke..inlined.TextItem.4(contextMenuState0, textFieldSelectionManager0), 10, null);
                return Unit.INSTANCE;
            }
            case 4: {
                f2 f20 = new f2(((SheetState)this.y), ((Number)object0).floatValue(), null);
                BuildersKt.launch$default(((CoroutineScope)this.x), null, null, f20, 3, null);
                return Unit.INSTANCE;
            }
            case 5: {
                long v = ((DatePickerColors)this.y).getDayInSelectionRangeContainerColor-0d7_KjU();
                DateRangePickerKt.drawRangeBackground-mxwnekA(((ContentDrawScope)object0), ((SelectedRangeInfo)this.x), v);
                ((ContentDrawScope)object0).drawContent();
                return Unit.INSTANCE;
            }
            case 6: {
                DisposableEffectScope disposableEffectScope0 = (DisposableEffectScope)object0;
                return new ExposedDropdownMenu_androidKt.SoftKeyboardListener.1.1.invoke..inlined.onDispose.1(new ExposedDropdownMenu_androidKt.SoftKeyboardListener.1.1.listener.1(((Function0)this.y), ((View)this.x)));
            }
            case 7: {
                float f = ((SheetState)this.x).getAnchoredDraggableState$material3_release().getOffset();
                float f1 = Size.getHeight-impl(((GraphicsLayerScope)object0).getSize-NH-jbRc());
                if(!Float.isNaN(f) && !Float.isNaN(f1) && f1 != 0.0f) {
                    float f2 = ((Number)((Animatable)this.y).getValue()).floatValue();
                    ((GraphicsLayerScope)object0).setScaleX(ModalBottomSheetKt.access$calculatePredictiveBackScaleX(((GraphicsLayerScope)object0), f2));
                    ((GraphicsLayerScope)object0).setScaleY(ModalBottomSheetKt.access$calculatePredictiveBackScaleY(((GraphicsLayerScope)object0), f2));
                    ((GraphicsLayerScope)object0).setTransformOrigin-__ExYCQ(TransformOriginKt.TransformOrigin(0.5f, (f + f1) / f1));
                }
                return Unit.INSTANCE;
            }
            case 8: {
                KeyboardActionScope keyboardActionScope0 = (KeyboardActionScope)object0;
                ((Function1)this.x).invoke(((String)this.y));
                return Unit.INSTANCE;
            }
            case 9: {
                Object object1 = ((TooltipScopeImpl)this.y).getGetAnchorBounds().invoke();
                return (DrawResult)((Function2)this.x).invoke(((CacheDrawScope)object0), object1);
            }
            case 10: {
                DisposableEffectScope disposableEffectScope1 = (DisposableEffectScope)object0;
                ((Context)this.x).getApplicationContext().registerComponentCallbacks(((AndroidCompositionLocals_androidKt.obtainImageVectorCache.callbacks.1.1)this.y));
                return new AndroidCompositionLocals_androidKt.obtainImageVectorCache.1.1.invoke..inlined.onDispose.1(((Context)this.x), ((AndroidCompositionLocals_androidKt.obtainImageVectorCache.callbacks.1.1)this.y));
            }
            case 11: {
                DisposableEffectScope disposableEffectScope2 = (DisposableEffectScope)object0;
                ((Context)this.x).getApplicationContext().registerComponentCallbacks(((AndroidCompositionLocals_androidKt.obtainResourceIdCache.callbacks.1.1)this.y));
                return new AndroidCompositionLocals_androidKt.obtainResourceIdCache.1.1.invoke..inlined.onDispose.1(((Context)this.x), ((AndroidCompositionLocals_androidKt.obtainResourceIdCache.callbacks.1.1)this.y));
            }
            case 12: {
                CoroutineScope coroutineScope0 = (CoroutineScope)object0;
                b b0 = new b(((AndroidPlatformTextInputSession)this.y), 14);
                return new c1(((PlatformTextInputMethodRequest)this.x), b0);
            }
            case 13: {
                Throwable throwable0 = (Throwable)object0;
                c1 c10 = (c1)this.x;
                synchronized(c10.c) {
                    c10.e = true;
                    MutableVector mutableVector0 = c10.d;
                    int v2 = mutableVector0.getSize();
                    if(v2 > 0) {
                        Object[] arr_object = mutableVector0.getContent();
                        int v3 = 0;
                        while(true) {
                            NullableInputConnectionWrapper nullableInputConnectionWrapper0 = (NullableInputConnectionWrapper)((WeakReference)arr_object[v3]).get();
                            if(nullableInputConnectionWrapper0 != null) {
                                nullableInputConnectionWrapper0.disposeDelegate();
                            }
                            ++v3;
                            if(v3 >= v2) {
                                break;
                            }
                        }
                    }
                    c10.d.clear();
                }
                ((AndroidPlatformTextInputSession)this.y).b.stopInput();
                return Unit.INSTANCE;
            }
            case 14: {
                Throwable throwable1 = (Throwable)object0;
                ((AndroidUiDispatcher)this.x).removeFrameCallback$ui_release(((l0)this.y));
                return Unit.INSTANCE;
            }
            case 15: {
                Throwable throwable2 = (Throwable)object0;
                ((AndroidUiFrameClock)this.x).getChoreographer().removeFrameCallback(((l0)this.y));
                return Unit.INSTANCE;
            }
            case 16: {
                Intrinsics.checkNotNullParameter(((androidx.constraintlayout.compose.State)object0), "state");
                ConstraintReference constraintReference0 = ((androidx.constraintlayout.compose.State)object0).constraints(((ConstrainScope)this.y).getId$compose_release());
                Intrinsics.checkNotNullExpressionValue(constraintReference0, "state.constraints(id)");
                ((Function1)(((Lambda)this.x))).invoke(constraintReference0);
                return Unit.INSTANCE;
            }
            case 17: {
                Intrinsics.checkNotNullParameter(((androidx.constraintlayout.compose.State)object0), "state");
                ConstraintReference constraintReference1 = ((androidx.constraintlayout.compose.State)object0).constraints(((ConstrainScope)this.x).getId$compose_release());
                constraintReference1.visibility(((Visibility)this.y).getSolverValue$compose_release());
                if(Intrinsics.areEqual(((Visibility)this.y), Visibility.Companion.getInvisible())) {
                    constraintReference1.alpha(0.0f);
                }
                return Unit.INSTANCE;
            }
            case 18: {
                Intrinsics.checkNotNullParameter(((PlacementScope)object0), "$this$layout");
                ((MotionMeasurer)this.x).performLayout(((PlacementScope)object0), ((List)this.y));
                return Unit.INSTANCE;
            }
            case 19: {
                Object object3 = ((Function1)this.y).invoke(object0);
                ((MediatorLiveData)this.x).setValue(object3);
                return Unit.INSTANCE;
            }
            case 20: {
                Object object4 = ((Function)this.y).apply(object0);
                ((MediatorLiveData)this.x).setValue(object4);
                return Unit.INSTANCE;
            }
            case 21: {
                Intrinsics.checkNotNullParameter(((SupportSQLiteDatabase)object0), "db");
                SupportSQLiteStatement supportSQLiteStatement0 = ((SupportSQLiteDatabase)object0).compileStatement(((j0)this.x).a);
                ArrayList arrayList0 = ((j0)this.x).c;
                Iterator iterator0 = arrayList0.iterator();
                for(int v4 = 0; iterator0.hasNext(); ++v4) {
                    iterator0.next();
                    if(v4 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    Object object5 = arrayList0.get(v4);
                    if(object5 == null) {
                        supportSQLiteStatement0.bindNull(v4 + 1);
                    }
                    else if(object5 instanceof Long) {
                        supportSQLiteStatement0.bindLong(v4 + 1, ((Number)object5).longValue());
                    }
                    else if(object5 instanceof Double) {
                        supportSQLiteStatement0.bindDouble(v4 + 1, ((Number)object5).doubleValue());
                    }
                    else if(object5 instanceof String) {
                        supportSQLiteStatement0.bindString(v4 + 1, ((String)object5));
                    }
                    else if(object5 instanceof byte[]) {
                        supportSQLiteStatement0.bindBlob(v4 + 1, ((byte[])object5));
                    }
                }
                return ((Function1)(((Lambda)this.y))).invoke(supportSQLiteStatement0);
            }
            case 22: {
                DisposableEffectScope disposableEffectScope3 = (DisposableEffectScope)object0;
                ((f0)this.x).c.remove(this.y);
                return new LazySaveableStateHolder.SaveableStateProvider.2.1.invoke..inlined.onDispose.1(((f0)this.x), this.y);
            }
            case 23: {
                Throwable throwable3 = (Throwable)object0;
                ((MutexImpl)this.x).unlock(this.y);
                return Unit.INSTANCE;
            }
            case 24: {
                int v5 = c.roundToInt((((f0.j0)this.x).b.getPageSizeWithSpacing$foundation_release() == 0 ? 0.0f : ((Number)object0).floatValue() / ((float)((f0.j0)this.x).b.getPageSizeWithSpacing$foundation_release())));
                int v6 = ((f0.j0)this.x).b.getCurrentPage();
                ((f0.j0)this.x).b.updateTargetPage(((ScrollScope)this.y), v6 + v5);
                return Unit.INSTANCE;
            }
            case 25: {
                FontFamilyResolverImpl fontFamilyResolverImpl0 = (FontFamilyResolverImpl)this.x;
                TypefaceRequest typefaceRequest0 = (TypefaceRequest)this.y;
                TypefaceResult typefaceResult0 = fontFamilyResolverImpl0.d.resolve(typefaceRequest0, fontFamilyResolverImpl0.getPlatformFontLoader$ui_text_release(), ((Function1)object0), fontFamilyResolverImpl0.f);
                if(typefaceResult0 == null) {
                    typefaceResult0 = fontFamilyResolverImpl0.e.resolve(typefaceRequest0, fontFamilyResolverImpl0.getPlatformFontLoader$ui_text_release(), ((Function1)object0), fontFamilyResolverImpl0.f);
                    if(typefaceResult0 == null) {
                        throw new IllegalStateException("Could not load font");
                    }
                }
                return typefaceResult0;
            }
            case 26: {
                SynchronizedObject synchronizedObject0 = ((TypefaceRequestCache)this.x).getLock$ui_text_release();
                TypefaceRequestCache typefaceRequestCache0 = (TypefaceRequestCache)this.x;
                TypefaceRequest typefaceRequest1 = (TypefaceRequest)this.y;
                synchronized(synchronizedObject0) {
                    if(((TypefaceResult)object0).getCacheable()) {
                        typefaceRequestCache0.b.put(typefaceRequest1, ((TypefaceResult)object0));
                    }
                    else {
                        typefaceRequestCache0.b.remove(typefaceRequest1);
                    }
                    return Unit.INSTANCE;
                }
            }
            case 27: {
                int v8 = ((Number)object0).intValue();
                ((ViewPager)this.x).setCurrentItem(v8);
                EmoticonKeyboard emoticonKeyboard0 = (EmoticonKeyboard)this.y;
                if(EmoticonKeyboard.access$getSendEventAfterInit$p(emoticonKeyboard0).getAndSet(true)) {
                    Function2 function20 = EmoticonKeyboard.access$get_toolbarClickListener$p(emoticonKeyboard0);
                    if(function20 != null) {
                        Integer integer0 = v8;
                        a a0 = EmoticonKeyboard.access$getKc$p(emoticonKeyboard0);
                        a0.getClass();
                        String s = (String)CollectionsKt___CollectionsKt.getOrNull(CollectionsKt___CollectionsKt.plus(k.listOf(".history"), a0.c), v8);
                        if(s == null) {
                            s = "";
                        }
                        function20.invoke(integer0, s);
                    }
                }
                return Unit.INSTANCE;
            }
            case 28: {
                DisposableEffectScope disposableEffectScope4 = (DisposableEffectScope)object0;
                FullyDrawnReporter fullyDrawnReporter0 = (FullyDrawnReporter)this.x;
                return fullyDrawnReporter0.isFullyDrawnReported() ? new ReportDrawnKt.ReportDrawnWhen.1.1.invoke..inlined.onDispose.1() : new ReportDrawnKt.ReportDrawnWhen.1.1.invoke..inlined.onDispose.2(new j(fullyDrawnReporter0, ((Function0)this.y)));
            }
            default: {
                if(!Intrinsics.areEqual(((TextFieldValue)this.x), ((TextFieldValue)object0))) {
                    ((Function1)this.y).invoke(((TextFieldValue)object0));
                }
                return Unit.INSTANCE;
            }
        }
    }
}

