package com.kakao.keditor;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kakao.common.view.SoftInputKt;
import com.kakao.common.view.SoftInputWindowFrameDetector;
import com.kakao.keditor.cdm.CDM.Item;
import com.kakao.keditor.cdm.CDM;
import com.kakao.keditor.cdm.CDMKt;
import com.kakao.keditor.config.KeditorConfigKt;
import com.kakao.keditor.delegate.InputMethodRequest.Hide;
import com.kakao.keditor.delegate.InputMethodRequest.Show;
import com.kakao.keditor.delegate.InputMethodRequest;
import com.kakao.keditor.delegate.JsonConverterKt;
import com.kakao.keditor.exception.InvalidInputException;
import com.kakao.keditor.exception.MissingJsonConverterException;
import com.kakao.keditor.exception.NotMatchedModelException;
import com.kakao.keditor.internal.KeditorAdapter;
import com.kakao.keditor.plugin.ActivityResultHandler;
import com.kakao.keditor.plugin.HasItemDecoration;
import com.kakao.keditor.plugin.attrs.Alignment.Justify;
import com.kakao.keditor.plugin.attrs.Alignment.Left;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.item.Aligned;
import com.kakao.keditor.plugin.attrs.item.HasExtraUploadable;
import com.kakao.keditor.plugin.attrs.item.Location;
import com.kakao.keditor.plugin.attrs.item.NoUpdateWhenAlignmentChanged;
import com.kakao.keditor.plugin.attrs.item.NoUpdateWhenGotFocus;
import com.kakao.keditor.plugin.attrs.item.RepresentativeImageProvider;
import com.kakao.keditor.plugin.attrs.item.Styled;
import com.kakao.keditor.plugin.attrs.item.Uploadable;
import com.kakao.keditor.plugin.itemspec.ItemSpecs;
import com.kakao.keditor.plugin.itemspec.RenderingRequestHandler.DefaultImpls;
import com.kakao.keditor.plugin.itemspec.RootItemSpec;
import com.kakao.keditor.plugin.itemspec.grammarcheck.GrammarViewRequest;
import com.kakao.keditor.plugin.itemspec.paragraph.GrammarCheckTextItem;
import com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItem.Companion;
import com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItem;
import com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItemKt;
import com.kakao.keditor.plugin.itemspec.paragraph.SingleTextItem;
import com.kakao.keditor.plugin.itemspec.paragraph.TextItem;
import com.kakao.keditor.plugin.itemspec.unsupport.UnSupportedItem;
import com.kakao.keditor.plugin.pluginspec.PluginSpec;
import com.kakao.keditor.plugin.pluginspec.PluginSpecRequester;
import com.kakao.keditor.plugin.pluginspec.PluginSpecs;
import com.kakao.keditor.request.common.ScrollTo;
import com.kakao.keditor.standard.IntStandardKt;
import com.kakao.keditor.standard.KeditorStandardKt;
import com.kakao.keditor.standard.ViewStandardKt;
import com.kakao.keditor.toolbar.category.ToolbarCategory.Idle;
import com.kakao.keditor.util.OnClickBetweenViewListener.OnClickListener;
import com.kakao.keditor.util.OnClickBetweenViewListener;
import com.kakao.keditor.util.eventbus.ItemSpecRequest.FocusCategory;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.ToolbarRequest.FocusChanged;
import com.kakao.keditor.util.eventbus.ToolbarRequest.InitToolbar;
import com.kakao.keditor.util.eventbus.ViewRequest.AddKeditorItems;
import com.kakao.keditor.util.eventbus.ViewRequest.AdjustItem;
import com.kakao.keditor.util.eventbus.ViewRequest.EditorSortRequest;
import com.kakao.keditor.util.eventbus.ViewRequest.GetFocusedItem;
import com.kakao.keditor.util.eventbus.ViewRequest.InsertKeditorItem;
import com.kakao.keditor.util.eventbus.ViewRequest.MergeText;
import com.kakao.keditor.util.eventbus.ViewRequest.RefreshAll;
import com.kakao.keditor.util.eventbus.ViewRequest.RefreshFocus;
import com.kakao.keditor.util.eventbus.ViewRequest.RefreshPosition;
import com.kakao.keditor.util.eventbus.ViewRequest.RemoveFocusItem;
import com.kakao.keditor.util.eventbus.ViewRequest.RemoveItem;
import com.kakao.keditor.util.eventbus.ViewRequest.ReplaceItems;
import com.kakao.keditor.util.eventbus.ViewRequest.RequestFocus;
import com.kakao.keditor.util.eventbus.ViewRequest.RequestFocusToFirstTextItem;
import com.kakao.keditor.util.eventbus.ViewRequest.ResetAllItems;
import com.kakao.keditor.util.eventbus.ViewRequest.ScrollToSpecificTextIndex;
import com.kakao.keditor.util.eventbus.ViewRequest.UpdateRepresentState;
import com.kakao.keditor.util.eventbus.ViewRequest;
import com.kakao.keditor.widget.KeditorLayoutManager;
import com.kakao.keditor.widget.extention.ItemTouchHelperCallback;
import com.kakao.keditor.widget.extention.KeditorRecyclerView;
import com.squareup.moshi.Moshi.Builder;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.collections.o;
import kotlin.collections.q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u009D\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n*\u0001;\u0018\u00002\u00020\u00012\u00020\u0002B\u000F\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u00A2\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007\u00A2\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001A\u00020\n\u00A2\u0006\u0002\u0010\u000BJ\f\u0010V\u001A\b\u0012\u0004\u0012\u00020\u00110WJ\u000F\u0010X\u001A\u0004\u0018\u00010YH\u0000\u00A2\u0006\u0002\bZJ\b\u0010[\u001A\u00020@H\u0002J\u0013\u0010\\\u001A\b\u0012\u0004\u0012\u00020]0\u000EH\u0000\u00A2\u0006\u0002\b^J\f\u0010_\u001A\b\u0012\u0004\u0012\u00020`0WJ\"\u0010a\u001A\u00020@2\u0006\u0010b\u001A\u00020\n2\u0006\u0010c\u001A\u00020\"2\b\b\u0002\u0010d\u001A\u00020\"H\u0002J\u0006\u0010e\u001A\u00020fJ\u0006\u0010g\u001A\u00020\u0011J\b\u0010h\u001A\u0004\u0018\u00010\u0011J\b\u0010i\u001A\u0004\u0018\u00010jJ\u0017\u0010k\u001A\u0004\u0018\u00010]2\u0006\u0010l\u001A\u00020\nH\u0000\u00A2\u0006\u0002\bmJ \u0010n\u001A\u00020@2\u0018\u0010o\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0W\u0012\u0004\u0012\u00020@0>J\u0015\u0010p\u001A\u00020\n\"\n\b\u0000\u0010q\u0018\u0001*\u00020]H\u0086\bJ\u000E\u0010p\u001A\u00020\n2\u0006\u0010r\u001A\u00020sJ\u0010\u0010t\u001A\u00020\n2\u0006\u0010u\u001A\u00020\nH\u0002J\u0011\u0010v\u001A\r\u0012\t\u0012\u00070w\u00A2\u0006\u0002\bx0WJ\u0006\u0010y\u001A\u00020\"J\u0015\u0010z\u001A\u00020\n2\u0006\u0010{\u001A\u00020]H\u0000\u00A2\u0006\u0002\b|J\b\u0010}\u001A\u00020@H\u0002J\u0016\u0010~\u001A\u00020@2\u0006\u0010G\u001A\u00020H2\u0006\u0010\'\u001A\u00020(J$\u0010\u007F\u001A\u00020@2\u0006\u0010l\u001A\u00020\n2\u0012\b\u0002\u0010\u0080\u0001\u001A\u000B\u0012\u0004\u0012\u00020@\u0018\u00010\u0081\u0001H\u0002J\u0007\u0010\u0082\u0001\u001A\u00020\"J\u0019\u0010\u0083\u0001\u001A\u00020\"2\b\u0010\u0084\u0001\u001A\u00030\u0085\u0001H\u0000\u00A2\u0006\u0003\b\u0086\u0001J\u0007\u0010\u0087\u0001\u001A\u00020\"J\u0007\u0010\u0088\u0001\u001A\u00020\"J\u0007\u0010\u0089\u0001\u001A\u00020\"J\u0011\u0010\u008A\u0001\u001A\u00020\"2\u0006\u0010l\u001A\u00020\nH\u0002J5\u0010\u008B\u0001\u001A\u00020@2\u0007\u0010\u008C\u0001\u001A\u00020f2#\b\u0002\u0010\u008D\u0001\u001A\u001C\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0W\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0W\u0018\u00010>J5\u0010\u008B\u0001\u001A\u00020@2\u0007\u0010\u008E\u0001\u001A\u00020\u00112#\b\u0002\u0010\u008F\u0001\u001A\u001C\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0W\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0W\u0018\u00010>J\u0010\u0010\u0090\u0001\u001A\u00020@2\u0007\u0010\u0091\u0001\u001A\u00020\u0011J\r\u0010\u0092\u0001\u001A\b\u0012\u0004\u0012\u00020`0WJ%\u0010\u0093\u0001\u001A\u00020@2\u0007\u0010\u0094\u0001\u001A\u00020\n2\u0007\u0010\u0095\u0001\u001A\u00020\n2\n\u0010\u0096\u0001\u001A\u0005\u0018\u00010\u0097\u0001J\u0013\u0010\u0098\u0001\u001A\u00020@2\b\u0010\u0099\u0001\u001A\u00030\u009A\u0001H\u0016J\u0013\u0010\u009B\u0001\u001A\u00020@2\b\u0010\u0099\u0001\u001A\u00030\u009A\u0001H\u0016J%\u0010\u009C\u0001\u001A\u00020@2\u0007\u0010\u009D\u0001\u001A\u00020\n2\u0007\u0010\u009E\u0001\u001A\u00020\n2\b\b\u0002\u0010d\u001A\u00020\"H\u0002J\u0007\u0010\u009F\u0001\u001A\u00020@J\u0013\u0010\u00A0\u0001\u001A\u00020@2\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007H\u0002J\t\u0010\u00A1\u0001\u001A\u00020@H\u0002J\t\u0010\u00A2\u0001\u001A\u00020@H\u0002J\t\u0010\u00A3\u0001\u001A\u00020@H\u0002J\u0007\u0010\u00A4\u0001\u001A\u00020@J\u000B\u0010\u00A5\u0001\u001A\u0004\u0018\u00010\u0011H\u0002J\u0007\u0010\u00A6\u0001\u001A\u00020@J\u0007\u0010\u00A7\u0001\u001A\u00020@J\u0013\u0010\u00A8\u0001\u001A\u00020@2\b\u0010\u00A9\u0001\u001A\u00030\u00AA\u0001H\u0002J\u0013\u0010\u00AB\u0001\u001A\u00020@2\b\u0010\u00AC\u0001\u001A\u00030\u00AD\u0001H\u0002J\u0010\u0010\u00AE\u0001\u001A\u00020@2\u0007\u0010\u00AF\u0001\u001A\u00020jJ\u0015\u0010\u00B0\u0001\u001A\u00020@2\n\u0010\u00B1\u0001\u001A\u0005\u0018\u00010\u00B2\u0001H\u0016J\u0007\u0010\u00B3\u0001\u001A\u00020@J\u0007\u0010\u00B4\u0001\u001A\u00020@J\u0010\u0010\u00B5\u0001\u001A\u00020@H\u0082@\u00A2\u0006\u0003\u0010\u00B6\u0001J\t\u0010\u00B7\u0001\u001A\u00020@H\u0002J\u000F\u0010\u00B8\u0001\u001A\b\u0012\u0004\u0012\u00020`0WH\u0002J\t\u0010\u00B9\u0001\u001A\u00020@H\u0002J\r\u0010\u00BA\u0001\u001A\b\u0012\u0004\u0012\u00020`0WJ\r\u0010\u00BB\u0001\u001A\b\u0012\u0004\u0012\u00020`0WR\u000E\u0010\f\u001A\u00020\nX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000EX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001A\u0004\u0018\u00010\u0011X\u0082\u000E\u00A2\u0006\u0002\n\u0000R(\u0010\u0012\u001A\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001A\u00020\n\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001A\u0010\u001BR\u0011\u0010\u001C\u001A\u00020\n8F\u00A2\u0006\u0006\u001A\u0004\b\u001D\u0010\u001BR\u000E\u0010\u001E\u001A\u00020\u001FX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010 \u001A\u00020\nX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001A\u0010!\u001A\u00020\"X\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001A\u0010\'\u001A\u00020(X\u0086.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0010\u0010-\u001A\u0004\u0018\u00010.X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001B\u0010/\u001A\u0002008BX\u0082\u0084\u0002\u00A2\u0006\f\n\u0004\b3\u00104\u001A\u0004\b1\u00102R\u001B\u00105\u001A\u0002068BX\u0082\u0084\u0002\u00A2\u0006\f\n\u0004\b9\u00104\u001A\u0004\b7\u00108R\u0010\u0010:\u001A\u00020;X\u0082\u0004\u00A2\u0006\u0004\n\u0002\u0010<R*\u0010=\u001A\u0012\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020@0>j\u0002`AX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0010\u0010F\u001A\u0004\u0018\u00010\u0011X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001A\u0010G\u001A\u00020HX\u0086.\u00A2\u0006\u000E\n\u0000\u001A\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001B\u0010M\u001A\u00020N8FX\u0086\u0084\u0002\u00A2\u0006\f\n\u0004\bQ\u00104\u001A\u0004\bO\u0010PR\u0014\u0010R\u001A\u00020S8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bT\u0010U\u00A8\u0006\u00BC\u0001"}, d2 = {"Lcom/kakao/keditor/KeditorView;", "Lcom/kakao/keditor/widget/extention/KeditorRecyclerView;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "_focusedPosition", "ativityResultHandlers", "", "Lcom/kakao/keditor/plugin/ActivityResultHandler;", "backupRepresentativeImage", "", "editorConfig", "", "", "getEditorConfig$keditor_release", "()Ljava/util/Map;", "setEditorConfig$keditor_release", "(Ljava/util/Map;)V", "editorId", "getEditorId", "()I", "focusedPosition", "getFocusedPosition", "internalGlobalFocusChangeListener", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "internalState", "isFocusBlocked", "", "isFocusBlocked$keditor_release", "()Z", "setFocusBlocked$keditor_release", "(Z)V", "itemSpecs", "Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;", "getItemSpecs", "()Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;", "setItemSpecs", "(Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;)V", "itemTouchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "keditorAdapter", "Lcom/kakao/keditor/internal/KeditorAdapter;", "getKeditorAdapter", "()Lcom/kakao/keditor/internal/KeditorAdapter;", "keditorAdapter$delegate", "Lkotlin/Lazy;", "keditorLayoutManager", "Lcom/kakao/keditor/widget/KeditorLayoutManager;", "getKeditorLayoutManager", "()Lcom/kakao/keditor/widget/KeditorLayoutManager;", "keditorLayoutManager$delegate", "onClickBetweenViewListener", "com/kakao/keditor/KeditorView$onClickBetweenViewListener$1", "Lcom/kakao/keditor/KeditorView$onClickBetweenViewListener$1;", "onInputMethodRequested", "Lkotlin/Function1;", "Lcom/kakao/keditor/delegate/InputMethodRequest;", "", "Lcom/kakao/keditor/delegate/OnInputMethodRequested;", "getOnInputMethodRequested", "()Lkotlin/jvm/functions/Function1;", "setOnInputMethodRequested", "(Lkotlin/jvm/functions/Function1;)V", "original", "pluginSpecs", "Lcom/kakao/keditor/plugin/pluginspec/PluginSpecs;", "getPluginSpecs", "()Lcom/kakao/keditor/plugin/pluginspec/PluginSpecs;", "setPluginSpecs", "(Lcom/kakao/keditor/plugin/pluginspec/PluginSpecs;)V", "softInputDetector", "Lcom/kakao/common/view/SoftInputWindowFrameDetector;", "getSoftInputDetector", "()Lcom/kakao/common/view/SoftInputWindowFrameDetector;", "softInputDetector$delegate", "state", "Lcom/kakao/keditor/KeditorState;", "getState$keditor_release", "()Lcom/kakao/keditor/KeditorState;", "activeAllPluginTypes", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "activity$keditor_release", "adjustItems", "allItems", "Lcom/kakao/keditor/KeditorItem;", "allItems$keditor_release", "allUploadableItems", "Lcom/kakao/keditor/plugin/attrs/item/Uploadable;", "applyFocusToView", "itemPosition", "focused", "isEditTextFocused", "export", "Lcom/kakao/keditor/cdm/CDM;", "exportToJson", "getFirstRepresentableImage", "getHeaderView", "Landroid/view/View;", "getItem", "position", "getItem$keditor_release", "getItems", "callback", "getPluginId", "T", "pluginSpec", "Lcom/kakao/keditor/plugin/pluginspec/PluginSpec;", "getTargetPosition", "requestPosition", "grammarCheckItems", "Lcom/kakao/keditor/plugin/itemspec/paragraph/GrammarCheckTextItem;", "Lkotlin/internal/NoInfer;", "hasLocalUploadableItems", "indexOf", "item", "indexOf$keditor_release", "initToolbar", "initWithPlugins", "internalSmoothScrollToPosition", "doAfterScroll", "Lkotlin/Function0;", "isEmpty", "isEnableDragAndDrop", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "isEnableDragAndDrop$keditor_release", "isModified", "isReadOnly", "isRequestOnly", "isValidPosition", "load", "input", "interceptor", "cdmJson", "interpreter", "loadWithKeepOriginal", "savedCdmJson", "localUploadableItems", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onDestroy", "onRequestFocus", "from", "to", "onUpdateConfigs", "readAttributes", "refreshFocus", "registerEditorWithSpecs", "registerLifecycleListener", "removeHeaderView", "representativeImage", "requestHideInput", "requestShowInput", "scrollTo", "request", "Lcom/kakao/keditor/request/common/ScrollTo;", "setAlignment", "alignment", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "setHeaderView", "view", "setItemAnimator", "animator", "Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;", "setReadOnly", "setRequestOnly", "startViewRequestCollector", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unregisterEditor", "unzipUploadableItems", "updateDragAndDropEnabled", "uploadFailedItems", "uploadedItems", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKeditorView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeditorView.kt\ncom/kakao/keditor/KeditorView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Keditor.kt\ncom/kakao/keditor/Keditor\n+ 5 KeEvent.kt\ncom/kakao/keditor/util/eventbus/KeEvent\n+ 6 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 7 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 8 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 9 JsonConverter.kt\ncom/kakao/keditor/delegate/JsonConverterKt\n*L\n1#1,839:1\n800#2,11:840\n1855#2,2:851\n766#2:853\n857#2,2:854\n1855#2:856\n1856#2:858\n1855#2,2:875\n766#2:877\n857#2,2:878\n1855#2,2:880\n800#2,11:882\n766#2:893\n857#2,2:894\n766#2:896\n857#2,2:897\n766#2:899\n857#2,2:900\n766#2:902\n857#2,2:903\n1549#2:905\n1620#2,3:906\n766#2:909\n857#2,2:910\n766#2:912\n857#2,2:913\n1549#2:915\n1620#2,3:916\n1360#2:919\n1446#2,5:920\n288#2,2:925\n1549#2:927\n1620#2,3:928\n1549#2:945\n1620#2,3:946\n288#2:956\n1747#2,3:957\n289#2:960\n1747#2,3:973\n1#3:857\n141#4,7:859\n141#4,7:949\n28#5:866\n21#6:867\n23#6:871\n53#6,3:872\n50#7:868\n55#7:870\n106#8:869\n26#9,14:931\n13#9,12:961\n*S KotlinDebug\n*F\n+ 1 KeditorView.kt\ncom/kakao/keditor/KeditorView\n*L\n220#1:840,11\n220#1:851,2\n225#1:853\n225#1:854,2\n225#1:856\n225#1:858\n603#1:875,2\n615#1:877\n615#1:878,2\n617#1:880,2\n652#1:882,11\n659#1:893\n659#1:894,2\n666#1:896\n666#1:897,2\n673#1:899\n673#1:900,2\n687#1:902\n687#1:903,2\n688#1:905\n688#1:906,3\n693#1:909\n693#1:910,2\n698#1:912\n698#1:913,2\n699#1:915\n699#1:916,3\n700#1:919\n700#1:920,5\n706#1:925,2\n723#1:927\n723#1:928,3\n748#1:945\n748#1:946,3\n771#1:956\n771#1:957,3\n771#1:960\n830#1:973,3\n285#1:859,7\n766#1:949,7\n338#1:866\n338#1:867\n338#1:871\n338#1:872,3\n338#1:868\n338#1:870\n338#1:869\n744#1:931,14\n793#1:961,12\n*E\n"})
public final class KeditorView extends KeditorRecyclerView implements DefaultLifecycleObserver {
    private int _focusedPosition;
    @NotNull
    private final List ativityResultHandlers;
    @Nullable
    private String backupRepresentativeImage;
    @Nullable
    private Map editorConfig;
    private final int editorId;
    @NotNull
    private final ViewTreeObserver.OnGlobalFocusChangeListener internalGlobalFocusChangeListener;
    private int internalState;
    private boolean isFocusBlocked;
    public ItemSpecs itemSpecs;
    @Nullable
    private ItemTouchHelper itemTouchHelper;
    @NotNull
    private final Lazy keditorAdapter$delegate;
    @NotNull
    private final Lazy keditorLayoutManager$delegate;
    @NotNull
    private final com.kakao.keditor.KeditorView.onClickBetweenViewListener.1 onClickBetweenViewListener;
    @NotNull
    private Function1 onInputMethodRequested;
    @Nullable
    private String original;
    public PluginSpecs pluginSpecs;
    @NotNull
    private final Lazy softInputDetector$delegate;

    public KeditorView(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0);
        this.registerLifecycleListener();
        this.editorId = Keditor.INSTANCE.getIdGenerator$keditor_release().getAndAdd(1);
        this.onInputMethodRequested = new Function1() {
            {
                KeditorView.this = keditorView0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InputMethodRequest)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InputMethodRequest inputMethodRequest0) {
                Intrinsics.checkNotNullParameter(inputMethodRequest0, "state");
                if(Intrinsics.areEqual(inputMethodRequest0, Show.INSTANCE)) {
                    Context context0 = KeditorView.this.getContext();
                    Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
                    SoftInputKt.showSoftInput$default(context0, false, 1, null);
                    return;
                }
                if(Intrinsics.areEqual(inputMethodRequest0, Hide.INSTANCE)) {
                    Context context1 = KeditorView.this.getContext();
                    Intrinsics.checkNotNullExpressionValue(context1, "getContext(...)");
                    SoftInputKt.hideSoftInput(context1);
                }
            }
        };
        this.softInputDetector$delegate = c.lazy(new Function0() {
            {
                KeditorView.this = keditorView0;
                super(0);
            }

            @NotNull
            public final SoftInputWindowFrameDetector invoke() {
                return SoftInputWindowFrameDetector.Companion.withRootViewOf(KeditorView.this);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        });
        this.keditorLayoutManager$delegate = c.lazy(new Function0() {
            {
                KeditorView.this = keditorView0;
                super(0);
            }

            @NotNull
            public final KeditorLayoutManager invoke() {
                Context context0 = KeditorView.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
                return new KeditorLayoutManager(context0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        });
        this.keditorAdapter$delegate = c.lazy(new Function0() {
            {
                KeditorView.this = keditorView0;
                super(0);
            }

            @NotNull
            public final KeditorAdapter invoke() {
                ItemSpecs itemSpecs0 = KeditorView.this.getItemSpecs();
                com.kakao.keditor.KeditorView.keditorAdapter.2.1 keditorView$keditorAdapter$2$10 = new Function0() {
                    {
                        KeditorView.this = keditorView0;
                        super(0);
                    }

                    @NotNull
                    public final Integer invoke() {
                        return KeditorView.access$getInternalState$p(KeditorView.this);
                    }

                    @Override  // kotlin.jvm.functions.Function0
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                com.kakao.keditor.KeditorView.keditorAdapter.2.2 keditorView$keditorAdapter$2$20 = new Function0() {
                    {
                        KeditorView.this = keditorView0;
                        super(0);
                    }

                    @NotNull
                    public final Integer invoke() {
                        return KeditorView.access$get_focusedPosition$p(KeditorView.this);
                    }

                    @Override  // kotlin.jvm.functions.Function0
                    public Object invoke() {
                        return this.invoke();
                    }
                };
                return new KeditorAdapter(KeditorView.this.getEditorId(), itemSpecs0, keditorView$keditorAdapter$2$10, keditorView$keditorAdapter$2$20);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        });
        this._focusedPosition = -1;
        this.ativityResultHandlers = new ArrayList();
        this.internalGlobalFocusChangeListener = (View view0, View view1) -> KeditorView.internalGlobalFocusChangeListener$lambda$2(this, view0, view1);
        this.internalState = 1;
        com.kakao.keditor.KeditorView.onClickBetweenViewListener.1 keditorView$onClickBetweenViewListener$10 = new OnClickListener() {
            @Override  // com.kakao.keditor.util.OnClickBetweenViewListener$OnClickListener
            public void onClickBetweenArea(@NotNull RecyclerView recyclerView0, @NotNull ViewHolder recyclerView$ViewHolder0, @NotNull ViewHolder recyclerView$ViewHolder1) {
                Intrinsics.checkNotNullParameter(recyclerView0, "rv");
                Intrinsics.checkNotNullParameter(recyclerView$ViewHolder0, "aboveVh");
                Intrinsics.checkNotNullParameter(recyclerView$ViewHolder1, "belowVh");
                if(!KeditorView.this.isReadOnly() && !KeditorView.this.isRequestOnly()) {
                    int v = KeditorView.access$getKeditorAdapter(KeditorView.this).itemIndexAt(recyclerView$ViewHolder0.getAdapterPosition());
                    int v1 = KeditorView.access$getKeditorAdapter(KeditorView.this).itemIndexAt(recyclerView$ViewHolder1.getAdapterPosition());
                    if(!(KeditorView.this.getItem$keditor_release(v) instanceof ParagraphItem) && !(KeditorView.this.getItem$keditor_release(v1) instanceof ParagraphItem)) {
                        InsertKeditorItem viewRequest$InsertKeditorItem0 = new InsertKeditorItem(Companion.newInstance$default(ParagraphItem.Companion, true, false, 2, null), v1, false, 4, null);
                        KeEvent.INSTANCE.postInScope(viewRequest$InsertKeditorItem0);
                    }
                }
            }

            @Override  // com.kakao.keditor.util.OnClickBetweenViewListener$OnClickListener
            public void onClickBottomArea(@NotNull RecyclerView recyclerView0, @NotNull ViewHolder recyclerView$ViewHolder0) {
                Intrinsics.checkNotNullParameter(recyclerView0, "rv");
                Intrinsics.checkNotNullParameter(recyclerView$ViewHolder0, "lastVh");
                KeditorItem keditorItem0 = (KeditorItem)KeditorView.access$getKeditorAdapter(KeditorView.this).last();
                if(keditorItem0 instanceof ParagraphItem) {
                    ((ParagraphItem)keditorItem0).setHasPendingFocus(true);
                    RefreshPosition viewRequest$RefreshPosition0 = new RefreshPosition(KeditorView.access$getKeditorAdapter(KeditorView.this).getKeditorItemCount() - 1);
                    KeEvent.INSTANCE.postInScope(viewRequest$RefreshPosition0);
                    return;
                }
                InsertKeditorItem viewRequest$InsertKeditorItem0 = new InsertKeditorItem(Companion.newInstance$default(ParagraphItem.Companion, true, false, 2, null), kotlin.ranges.c.coerceAtLeast(KeditorView.access$getKeditorAdapter(KeditorView.this).getKeditorItemCount(), 0), false, 4, null);
                KeEvent.INSTANCE.postInScope(viewRequest$InsertKeditorItem0);
            }

            @Override  // com.kakao.keditor.util.OnClickBetweenViewListener$OnClickListener
            public void onClickItem(@NotNull View view0) {
                Intrinsics.checkNotNullParameter(view0, "findChildView");
            }

            @Override  // com.kakao.keditor.util.OnClickBetweenViewListener$OnClickListener
            public void onClickTopArea(@NotNull RecyclerView recyclerView0, @NotNull ViewHolder recyclerView$ViewHolder0) {
                Intrinsics.checkNotNullParameter(recyclerView0, "rv");
                Intrinsics.checkNotNullParameter(recyclerView$ViewHolder0, "firstVh");
                if(!KeditorView.this.isReadOnly() && !KeditorView.this.isRequestOnly() && !(KeditorView.this.getItem$keditor_release(0) instanceof ParagraphItem)) {
                    InsertKeditorItem viewRequest$InsertKeditorItem0 = new InsertKeditorItem(Companion.newInstance$default(ParagraphItem.Companion, true, false, 2, null), 0, false, 4, null);
                    KeEvent.INSTANCE.postInScope(viewRequest$InsertKeditorItem0);
                }
            }
        };
        this.onClickBetweenViewListener = keditorView$onClickBetweenViewListener$10;
        super.setItemAnimator(null);
        this.setOverScrollMode(2);
        this.setLayoutManager(this.getKeditorLayoutManager());
        this.setClipChildren(false);
        this.setClipToPadding(false);
        this.addOnItemTouchListener(new OnClickBetweenViewListener(keditorView$onClickBetweenViewListener$10));
        this.setPadding(this.getPaddingLeft(), this.getPaddingTop(), this.getPaddingRight(), this.getContext().getResources().getDimensionPixelOffset(dimen.ke_bottom_default_padding));
        this.setBackground(new ColorDrawable(ContextCompat.getColor(this.getContext(), color.ke_color_primary_background)));
    }

    public KeditorView(@NotNull Context context0, @Nullable AttributeSet attributeSet0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, attributeSet0);
        this.registerLifecycleListener();
        this.editorId = Keditor.INSTANCE.getIdGenerator$keditor_release().getAndAdd(1);
        this.onInputMethodRequested = new com.kakao.keditor.KeditorView.onInputMethodRequested.1(this);
        this.softInputDetector$delegate = c.lazy(new com.kakao.keditor.KeditorView.softInputDetector.2(this));
        this.keditorLayoutManager$delegate = c.lazy(new com.kakao.keditor.KeditorView.keditorLayoutManager.2(this));
        this.keditorAdapter$delegate = c.lazy(new com.kakao.keditor.KeditorView.keditorAdapter.2(this));
        this._focusedPosition = -1;
        this.ativityResultHandlers = new ArrayList();
        this.internalGlobalFocusChangeListener = (View view0, View view1) -> KeditorView.internalGlobalFocusChangeListener$lambda$2(this, view0, view1);
        this.internalState = 1;
        com.kakao.keditor.KeditorView.onClickBetweenViewListener.1 keditorView$onClickBetweenViewListener$10 = new com.kakao.keditor.KeditorView.onClickBetweenViewListener.1(this);
        this.onClickBetweenViewListener = keditorView$onClickBetweenViewListener$10;
        super.setItemAnimator(null);
        this.setOverScrollMode(2);
        this.setLayoutManager(this.getKeditorLayoutManager());
        this.setClipChildren(false);
        this.setClipToPadding(false);
        this.addOnItemTouchListener(new OnClickBetweenViewListener(keditorView$onClickBetweenViewListener$10));
        this.setPadding(this.getPaddingLeft(), this.getPaddingTop(), this.getPaddingRight(), this.getContext().getResources().getDimensionPixelOffset(dimen.ke_bottom_default_padding));
        this.setBackground(new ColorDrawable(ContextCompat.getColor(this.getContext(), color.ke_color_primary_background)));
        this.readAttributes(attributeSet0);
    }

    public KeditorView(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, attributeSet0, v);
        this.registerLifecycleListener();
        this.editorId = Keditor.INSTANCE.getIdGenerator$keditor_release().getAndAdd(1);
        this.onInputMethodRequested = new com.kakao.keditor.KeditorView.onInputMethodRequested.1(this);
        this.softInputDetector$delegate = c.lazy(new com.kakao.keditor.KeditorView.softInputDetector.2(this));
        this.keditorLayoutManager$delegate = c.lazy(new com.kakao.keditor.KeditorView.keditorLayoutManager.2(this));
        this.keditorAdapter$delegate = c.lazy(new com.kakao.keditor.KeditorView.keditorAdapter.2(this));
        this._focusedPosition = -1;
        this.ativityResultHandlers = new ArrayList();
        this.internalGlobalFocusChangeListener = (View view0, View view1) -> KeditorView.internalGlobalFocusChangeListener$lambda$2(this, view0, view1);
        this.internalState = 1;
        com.kakao.keditor.KeditorView.onClickBetweenViewListener.1 keditorView$onClickBetweenViewListener$10 = new com.kakao.keditor.KeditorView.onClickBetweenViewListener.1(this);
        this.onClickBetweenViewListener = keditorView$onClickBetweenViewListener$10;
        super.setItemAnimator(null);
        this.setOverScrollMode(2);
        this.setLayoutManager(this.getKeditorLayoutManager());
        this.setClipChildren(false);
        this.setClipToPadding(false);
        this.addOnItemTouchListener(new OnClickBetweenViewListener(keditorView$onClickBetweenViewListener$10));
        this.setPadding(this.getPaddingLeft(), this.getPaddingTop(), this.getPaddingRight(), this.getContext().getResources().getDimensionPixelOffset(dimen.ke_bottom_default_padding));
        this.setBackground(new ColorDrawable(ContextCompat.getColor(this.getContext(), color.ke_color_primary_background)));
        this.readAttributes(attributeSet0);
    }

    public static final int access$getInternalState$p(KeditorView keditorView0) {
        return keditorView0.internalState;
    }

    @NotNull
    public final List activeAllPluginTypes() {
        return this.getPluginSpecs().allTypes();
    }

    @Nullable
    public final AppCompatActivity activity$keditor_release() {
        Context context0 = this.getContext();
        return context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
    }

    private final void adjustItems() {
        this.getKeditorAdapter().adjustItems$keditor_release();
    }

    @NotNull
    public final List allItems$keditor_release() {
        return this.getKeditorAdapter().getItems();
    }

    @NotNull
    public final List allUploadableItems() {
        Iterable iterable0 = this.allItems$keditor_release();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            if(((KeditorItem)object0) instanceof Uploadable) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(arrayList0, 10));
        for(Object object1: arrayList0) {
            Intrinsics.checkNotNull(((KeditorItem)object1), "null cannot be cast to non-null type com.kakao.keditor.plugin.attrs.item.Uploadable");
            arrayList1.add(((Uploadable)(((KeditorItem)object1))));
        }
        List list0 = CollectionsKt___CollectionsKt.toMutableList(arrayList1);
        Collection collection0 = this.unzipUploadableItems();
        if(collection0 != null && !collection0.isEmpty()) {
            list0.addAll(this.unzipUploadableItems());
        }
        List list1 = new ArrayList();
        for(Object object2: list0) {
            String s = ((Uploadable)object2).getPath();
            if(s != null && s.length() != 0) {
                list1.add(object2);
            }
        }
        return list1;
    }

    private final void applyFocusToView(int v, boolean z, boolean z1) {
        KeditorItem keditorItem0 = (KeditorItem)this.getKeditorAdapter().getOrNull(v);
        View view0 = null;
        if(keditorItem0 != null) {
            if(!(keditorItem0 instanceof NoUpdateWhenGotFocus)) {
                this.getKeditorAdapter().notifyItemChanged(this.getKeditorAdapter().viewPositionAt(v));
            }
            if(z) {
                KeEvent keEvent0 = KeEvent.INSTANCE;
                ViewHolder recyclerView$ViewHolder0 = this.findViewHolderForAdapterPosition(this.getKeditorAdapter().viewPositionAt(v));
                if(recyclerView$ViewHolder0 != null) {
                    view0 = recyclerView$ViewHolder0.itemView;
                }
                keEvent0.postInScope(new FocusCategory(keditorItem0, view0));
                keEvent0.postInScope(new FocusChanged(!z1));
            }
        }
        else if((z ? this : null) != null) {
            FocusCategory itemSpecRequest$FocusCategory0 = new FocusCategory(null, null, 3, null);
            KeEvent.INSTANCE.postInScope(itemSpecRequest$FocusCategory0);
        }
    }

    public static void applyFocusToView$default(KeditorView keditorView0, int v, boolean z, boolean z1, int v1, Object object0) {
        if((v1 & 4) != 0) {
            z1 = false;
        }
        keditorView0.applyFocusToView(v, z, z1);
    }

    @NotNull
    public final CDM export() {
        Iterable iterable0 = this.allItems$keditor_release();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(this.getItemSpecs().byType(((KeditorItem)object0).getType()).convertToCdmItem(((KeditorItem)object0)));
        }
        return new CDM("1.4", arrayList0, this.representativeImage(), null, 8, null);
    }

    @NotNull
    public final String exportToJson() {
        return CDMKt.toJson(this.export());
    }

    @Nullable
    public final Map getEditorConfig$keditor_release() {
        return this.editorConfig;
    }

    public final int getEditorId() {
        return this.editorId;
    }

    @Nullable
    public final String getFirstRepresentableImage() {
        RepresentativeImageProvider representativeImageProvider0 = (RepresentativeImageProvider)CollectionsKt___CollectionsKt.firstOrNull(q.filterIsInstance(this.allItems$keditor_release(), RepresentativeImageProvider.class));
        if(representativeImageProvider0 != null) {
            List list0 = representativeImageProvider0.getImageSrcList();
            return list0 == null ? null : ((String)CollectionsKt___CollectionsKt.firstOrNull(list0));
        }
        return null;
    }

    public final int getFocusedPosition() {
        return this._focusedPosition;
    }

    @Nullable
    public final View getHeaderView() {
        return this.getKeditorAdapter().getHeaderView();
    }

    // 去混淆评级： 低(20)
    @Nullable
    public final KeditorItem getItem$keditor_release(int v) {
        return this.isValidPosition(v) ? ((KeditorItem)this.getKeditorAdapter().get(v)) : null;
    }

    @NotNull
    public final ItemSpecs getItemSpecs() {
        ItemSpecs itemSpecs0 = this.itemSpecs;
        if(itemSpecs0 != null) {
            return itemSpecs0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("itemSpecs");
        return null;
    }

    public final void getItems(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "callback");
        function10.invoke(this.allItems$keditor_release());
    }

    private final KeditorAdapter getKeditorAdapter() {
        return (KeditorAdapter)this.keditorAdapter$delegate.getValue();
    }

    private final KeditorLayoutManager getKeditorLayoutManager() {
        return (KeditorLayoutManager)this.keditorLayoutManager$delegate.getValue();
    }

    @NotNull
    public final Function1 getOnInputMethodRequested() {
        return this.onInputMethodRequested;
    }

    public final int getPluginId() {
        PluginSpecs pluginSpecs0 = this.getPluginSpecs();
        Intrinsics.reifiedOperationMarker(4, "T");
        return pluginSpecs0.pluginId(KeditorItemKt.type(KeditorItem.class));
    }

    public final int getPluginId(@NotNull PluginSpec pluginSpec0) {
        Intrinsics.checkNotNullParameter(pluginSpec0, "pluginSpec");
        return this.getPluginSpecs().pluginId(pluginSpec0.type());
    }

    @NotNull
    public final PluginSpecs getPluginSpecs() {
        PluginSpecs pluginSpecs0 = this.pluginSpecs;
        if(pluginSpecs0 != null) {
            return pluginSpecs0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pluginSpecs");
        return null;
    }

    @NotNull
    public final SoftInputWindowFrameDetector getSoftInputDetector() {
        return (SoftInputWindowFrameDetector)this.softInputDetector$delegate.getValue();
    }

    @NotNull
    public final KeditorState getState$keditor_release() {
        return new KeditorState(this.internalState, this.getKeditorAdapter().getItemCount(), this._focusedPosition);
    }

    private final int getTargetPosition(int v) {
        int v1 = this.getKeditorAdapter().lastItemIndex();
        if(v <= v1) {
            if(v <= -1) {
                return this._focusedPosition > -1 && this._focusedPosition <= v1 ? this._focusedPosition : v1;
            }
            return v;
        }
        return v1;
    }

    @NotNull
    public final List grammarCheckItems() {
        Iterable iterable0 = this.allItems$keditor_release();
        List list0 = new ArrayList();
        for(Object object0: iterable0) {
            if(object0 instanceof GrammarCheckTextItem) {
                list0.add(object0);
            }
        }
        return list0;
    }

    public final boolean hasLocalUploadableItems() {
        Collection collection0 = this.localUploadableItems();
        return collection0 == null || collection0.isEmpty() ? 0 : 1;
    }

    public final int indexOf$keditor_release(@NotNull KeditorItem keditorItem0) {
        Intrinsics.checkNotNullParameter(keditorItem0, "item");
        return this.getKeditorAdapter().indexOf(keditorItem0);
    }

    private final void initToolbar() {
        KeEvent.INSTANCE.postInScope(InitToolbar.INSTANCE);
    }

    public final void initWithPlugins(@NotNull PluginSpecs pluginSpecs0, @NotNull ItemSpecs itemSpecs0) {
        Intrinsics.checkNotNullParameter(pluginSpecs0, "pluginSpecs");
        Intrinsics.checkNotNullParameter(itemSpecs0, "itemSpecs");
        this.setPluginSpecs(pluginSpecs0);
        this.setItemSpecs(itemSpecs0);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: itemSpecs0.getItemSpecList()) {
            if(object0 instanceof HasItemDecoration) {
                arrayList0.add(object0);
            }
        }
        for(Object object1: arrayList0) {
            this.addItemDecoration(((HasItemDecoration)object1).itemDecoration());
        }
        pluginSpecs0.initPlugins(this.editorId, itemSpecs0);
        ArrayList arrayList1 = new ArrayList();
        for(Object object2: pluginSpecs0.getPlugins()) {
            if(((PluginSpec)object2) instanceof ActivityResultHandler) {
                arrayList1.add(object2);
            }
        }
        for(Object object3: arrayList1) {
            Intrinsics.checkNotNull(((PluginSpec)object3), "null cannot be cast to non-null type com.kakao.keditor.plugin.ActivityResultHandler");
            ActivityResultHandler activityResultHandler0 = (ActivityResultHandler)(((PluginSpec)object3));
            this.ativityResultHandlers.add(activityResultHandler0);
            AppCompatActivity appCompatActivity0 = this.activity$keditor_release();
            if(appCompatActivity0 != null) {
                activityResultHandler0.registerForActivityResult(appCompatActivity0);
            }
        }
        this.initToolbar();
        Context context0 = this.getContext();
        LifecycleOwner lifecycleOwner0 = context0 instanceof LifecycleOwner ? ((LifecycleOwner)context0) : null;
        if(lifecycleOwner0 != null) {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner0), null, null, new Function2(this, null) {
                final LifecycleOwner $owner;
                int label;

                {
                    this.$owner = lifecycleOwner0;
                    KeditorView.this = keditorView0;
                    super(2, continuation0);
                }

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
                    return new com.kakao.keditor.KeditorView.initWithPlugins.4.1(this.$owner, KeditorView.this, continuation0);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
                }

                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope0, @Nullable Continuation continuation0) {
                    return ((com.kakao.keditor.KeditorView.initWithPlugins.4.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
                }

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object object0) {
                    Object object1 = a.getCOROUTINE_SUSPENDED();
                    switch(this.label) {
                        case 0: {
                            ResultKt.throwOnFailure(object0);
                            com.kakao.keditor.KeditorView.initWithPlugins.4.1.1 keditorView$initWithPlugins$4$1$10 = new Function2(null) {
                                int label;

                                {
                                    KeditorView.this = keditorView0;
                                    super(2, continuation0);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @NotNull
                                public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
                                    return new com.kakao.keditor.KeditorView.initWithPlugins.4.1.1(KeditorView.this, continuation0);
                                }

                                @Override  // kotlin.jvm.functions.Function2
                                public Object invoke(Object object0, Object object1) {
                                    return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
                                }

                                @Nullable
                                public final Object invoke(@NotNull CoroutineScope coroutineScope0, @Nullable Continuation continuation0) {
                                    return ((com.kakao.keditor.KeditorView.initWithPlugins.4.1.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object0) {
                                    if(this.label != 0) {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(object0);
                                    KeditorView.this.registerEditorWithSpecs();
                                    return Unit.INSTANCE;
                                }
                            };
                            this.label = 1;
                            return RepeatOnLifecycleKt.repeatOnLifecycle(this.$owner, State.CREATED, keditorView$initWithPlugins$4$1$10, this) == object1 ? object1 : Unit.INSTANCE;
                        }
                        case 1: {
                            ResultKt.throwOnFailure(object0);
                            return Unit.INSTANCE;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                }
            }, 3, null);
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner0), null, null, new Function2(this, pluginSpecs0, itemSpecs0, null) {
                final ItemSpecs $itemSpecs;
                final LifecycleOwner $owner;
                final PluginSpecs $pluginSpecs;
                int label;

                {
                    this.$owner = lifecycleOwner0;
                    KeditorView.this = keditorView0;
                    this.$pluginSpecs = pluginSpecs0;
                    this.$itemSpecs = itemSpecs0;
                    super(2, continuation0);
                }

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
                    return new com.kakao.keditor.KeditorView.initWithPlugins.4.2(this.$owner, KeditorView.this, this.$pluginSpecs, this.$itemSpecs, continuation0);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
                }

                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope0, @Nullable Continuation continuation0) {
                    return ((com.kakao.keditor.KeditorView.initWithPlugins.4.2)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
                }

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object object0) {
                    Object object1 = a.getCOROUTINE_SUSPENDED();
                    switch(this.label) {
                        case 0: {
                            ResultKt.throwOnFailure(object0);
                            com.kakao.keditor.KeditorView.initWithPlugins.4.2.1 keditorView$initWithPlugins$4$2$10 = new Function2(this.$pluginSpecs, this.$itemSpecs, null) {
                                final ItemSpecs $itemSpecs;
                                final PluginSpecs $pluginSpecs;
                                private Object L$0;
                                int label;

                                {
                                    KeditorView.this = keditorView0;
                                    this.$pluginSpecs = pluginSpecs0;
                                    this.$itemSpecs = itemSpecs0;
                                    super(2, continuation0);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @NotNull
                                public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
                                    Continuation continuation1 = new com.kakao.keditor.KeditorView.initWithPlugins.4.2.1(KeditorView.this, this.$pluginSpecs, this.$itemSpecs, continuation0);
                                    continuation1.L$0 = object0;
                                    return continuation1;
                                }

                                @Override  // kotlin.jvm.functions.Function2
                                public Object invoke(Object object0, Object object1) {
                                    return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
                                }

                                @Nullable
                                public final Object invoke(@NotNull CoroutineScope coroutineScope0, @Nullable Continuation continuation0) {
                                    return ((com.kakao.keditor.KeditorView.initWithPlugins.4.2.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object0) {
                                    if(this.label != 0) {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(object0);
                                    CoroutineScope coroutineScope0 = (CoroutineScope)this.L$0;
                                    BuildersKt.launch$default(coroutineScope0, null, null, new Function2(null) {
                                        int label;

                                        {
                                            KeditorView.this = keditorView0;
                                            super(2, continuation0);
                                        }

                                        @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @NotNull
                                        public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
                                            return new com.kakao.keditor.KeditorView.initWithPlugins.4.2.1.1(KeditorView.this, continuation0);
                                        }

                                        @Override  // kotlin.jvm.functions.Function2
                                        public Object invoke(Object object0, Object object1) {
                                            return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
                                        }

                                        @Nullable
                                        public final Object invoke(@NotNull CoroutineScope coroutineScope0, @Nullable Continuation continuation0) {
                                            return ((com.kakao.keditor.KeditorView.initWithPlugins.4.2.1.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @Nullable
                                        public final Object invokeSuspend(@NotNull Object object0) {
                                            Object object1 = a.getCOROUTINE_SUSPENDED();
                                            switch(this.label) {
                                                case 0: {
                                                    ResultKt.throwOnFailure(object0);
                                                    this.label = 1;
                                                    return KeditorView.this.startViewRequestCollector(this) == object1 ? object1 : Unit.INSTANCE;
                                                }
                                                case 1: {
                                                    ResultKt.throwOnFailure(object0);
                                                    return Unit.INSTANCE;
                                                }
                                                default: {
                                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                }
                                            }
                                        }
                                    }, 3, null);
                                    BuildersKt.launch$default(coroutineScope0, null, null, new Function2(null) {
                                        final PluginSpecs $pluginSpecs;
                                        int label;

                                        {
                                            this.$pluginSpecs = pluginSpecs0;
                                            super(2, continuation0);
                                        }

                                        @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @NotNull
                                        public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
                                            return new com.kakao.keditor.KeditorView.initWithPlugins.4.2.1.2(this.$pluginSpecs, continuation0);
                                        }

                                        @Override  // kotlin.jvm.functions.Function2
                                        public Object invoke(Object object0, Object object1) {
                                            return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
                                        }

                                        @Nullable
                                        public final Object invoke(@NotNull CoroutineScope coroutineScope0, @Nullable Continuation continuation0) {
                                            return ((com.kakao.keditor.KeditorView.initWithPlugins.4.2.1.2)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @Nullable
                                        public final Object invokeSuspend(@NotNull Object object0) {
                                            Object object1 = a.getCOROUTINE_SUSPENDED();
                                            switch(this.label) {
                                                case 0: {
                                                    ResultKt.throwOnFailure(object0);
                                                    this.label = 1;
                                                    return this.$pluginSpecs.startFlow(this) == object1 ? object1 : Unit.INSTANCE;
                                                }
                                                case 1: {
                                                    ResultKt.throwOnFailure(object0);
                                                    return Unit.INSTANCE;
                                                }
                                                default: {
                                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                }
                                            }
                                        }
                                    }, 3, null);
                                    BuildersKt.launch$default(coroutineScope0, null, null, new Function2(null) {
                                        final ItemSpecs $itemSpecs;
                                        int label;

                                        {
                                            this.$itemSpecs = itemSpecs0;
                                            super(2, continuation0);
                                        }

                                        @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @NotNull
                                        public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
                                            return new com.kakao.keditor.KeditorView.initWithPlugins.4.2.1.3(this.$itemSpecs, continuation0);
                                        }

                                        @Override  // kotlin.jvm.functions.Function2
                                        public Object invoke(Object object0, Object object1) {
                                            return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
                                        }

                                        @Nullable
                                        public final Object invoke(@NotNull CoroutineScope coroutineScope0, @Nullable Continuation continuation0) {
                                            return ((com.kakao.keditor.KeditorView.initWithPlugins.4.2.1.3)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @Nullable
                                        public final Object invokeSuspend(@NotNull Object object0) {
                                            Object object1 = a.getCOROUTINE_SUSPENDED();
                                            switch(this.label) {
                                                case 0: {
                                                    ResultKt.throwOnFailure(object0);
                                                    this.label = 1;
                                                    return this.$itemSpecs.startFlow(this) == object1 ? object1 : Unit.INSTANCE;
                                                }
                                                case 1: {
                                                    ResultKt.throwOnFailure(object0);
                                                    return Unit.INSTANCE;
                                                }
                                                default: {
                                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                }
                                            }
                                        }
                                    }, 3, null);
                                    return Unit.INSTANCE;
                                }
                            };
                            this.label = 1;
                            return RepeatOnLifecycleKt.repeatOnLifecycle(this.$owner, State.STARTED, keditorView$initWithPlugins$4$2$10, this) == object1 ? object1 : Unit.INSTANCE;
                        }
                        case 1: {
                            ResultKt.throwOnFailure(object0);
                            return Unit.INSTANCE;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                }
            }, 3, null);
        }
        this.itemTouchHelper = new ItemTouchHelper(new ItemTouchHelperCallback(this.getKeditorAdapter()));
        this.onUpdateConfigs();
        this.getKeditorAdapter().setItems(k.listOf(new ParagraphItem(new SpannableStringBuilder(), false, false, 6, null)));
        this.setAdapter(this.getKeditorAdapter());
        this.original = this.exportToJson();
    }

    private static final void internalGlobalFocusChangeListener$lambda$2(KeditorView keditorView0, View view0, View view1) {
        ViewHolder recyclerView$ViewHolder0 = null;
        Intrinsics.checkNotNullParameter(keditorView0, "this$0");
        if(keditorView0.isFocusBlocked) {
            return;
        }
        ViewHolder recyclerView$ViewHolder1 = view0 == null ? null : keditorView0.findContainingViewHolder(view0);
        if(view1 != null) {
            recyclerView$ViewHolder0 = keditorView0.findContainingViewHolder(view1);
        }
        int v = -1;
        int v1 = keditorView0.getKeditorAdapter().itemIndexAt((recyclerView$ViewHolder1 == null ? -1 : recyclerView$ViewHolder1.getAdapterPosition()));
        KeditorAdapter keditorAdapter0 = keditorView0.getKeditorAdapter();
        if(recyclerView$ViewHolder0 != null) {
            v = recyclerView$ViewHolder0.getAdapterPosition();
        }
        keditorView0.onRequestFocus(v1, keditorAdapter0.itemIndexAt(v), view1 instanceof EditText);
    }

    private final void internalSmoothScrollToPosition(int v, Function0 function00) {
        this.post(new com.kakao.keditor.c(this, v, function00, 2));
    }

    public static void internalSmoothScrollToPosition$default(KeditorView keditorView0, int v, Function0 function00, int v1, Object object0) {
        if((v1 & 2) != 0) {
            function00 = null;
        }
        keditorView0.internalSmoothScrollToPosition(v, function00);
    }

    private static final void internalSmoothScrollToPosition$lambda$13(KeditorView keditorView0, int v, Function0 function00) {
        Intrinsics.checkNotNullParameter(keditorView0, "this$0");
        keditorView0.scrollToPosition(keditorView0.getKeditorAdapter().viewPositionAt(v));
        if(function00 != null) {
            keditorView0.postDelayed(new b(function00, 1), 200L);
        }
    }

    private static final void internalSmoothScrollToPosition$lambda$13$lambda$12(Function0 function00) {
        function00.invoke();
    }

    public final boolean isEmpty() {
        KeditorItem keditorItem0 = (KeditorItem)CollectionsKt___CollectionsKt.singleOrNull(this.getKeditorAdapter().getItems());
        return keditorItem0 == null ? false : keditorItem0.isEmpty();
    }

    public final boolean isEnableDragAndDrop$keditor_release(@NotNull ViewHolder recyclerView$ViewHolder0) {
        Intrinsics.checkNotNullParameter(recyclerView$ViewHolder0, "viewHolder");
        if((!this.getKeditorAdapter().getHasHeaderView() || this.getKeditorAdapter().getItemViewType(recyclerView$ViewHolder0.getAdapterPosition()) != 0) && !this.isReadOnly() && !this.isRequestOnly()) {
            Intrinsics.checkNotNullExpressionValue(recyclerView$ViewHolder0.itemView, "itemView");
            Iterable iterable0 = ViewStandardKt.findAllEditText(recyclerView$ViewHolder0.itemView);
            if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                for(Object object0: iterable0) {
                    if(((EditText)object0).hasFocus()) {
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean isFocusBlocked$keditor_release() {
        return this.isFocusBlocked;
    }

    public final boolean isModified() {
        return !Intrinsics.areEqual(this.original, this.exportToJson());
    }

    public final boolean isReadOnly() {
        return IntStandardKt.containsFlag(this.internalState, 2);
    }

    public final boolean isRequestOnly() {
        return IntStandardKt.containsFlag(this.internalState, 4);
    }

    private final boolean isValidPosition(int v) {
        return v >= 0 && v < this.getKeditorAdapter().getItems().size();
    }

    public final void load(@NotNull CDM cDM0, @Nullable Function1 function10) {
        Boolean boolean0;
        UnSupportedItem unSupportedItem0;
        KeditorItem keditorItem0;
        RootItemSpec rootItemSpec0;
        String s;
        Intrinsics.checkNotNullParameter(cDM0, "input");
        if(!cDM0.isValidate()) {
            Class class0 = JsonConverterKt.jsonConverterClass();
            if(Intrinsics.areEqual(class0, Gson.class)) {
                s = new GsonBuilder().create().toJson(cDM0);
                Intrinsics.checkNotNull(s);
            }
            else {
                if(!Intrinsics.areEqual(class0, Moshi.class)) {
                    throw new MissingJsonConverterException();
                }
                s = new Builder().add(new KotlinJsonAdapterFactory()).build().adapter(CDM.class).toJson(cDM0);
                Intrinsics.checkNotNull(s);
                throw new InvalidInputException(s);
            }
            throw new InvalidInputException(s);
        }
        cDM0.restoreRepresentationImage();
        Iterable iterable0 = CollectionsKt___CollectionsKt.toMutableList(cDM0.getData());
        List list0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        Iterator iterator0 = iterable0.iterator();
        while(true) {
            rootItemSpec0 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            Item cDM$Item0 = (Item)object0;
            RootItemSpec rootItemSpec1 = this.getItemSpecs().byType(cDM$Item0.getType());
            if(rootItemSpec1.isSupport(cDM$Item0)) {
                rootItemSpec0 = rootItemSpec1;
            }
            if(rootItemSpec0 == null) {
                rootItemSpec0 = this.getItemSpecs().byType("unsupported");
            }
            try {
                Context context0 = this.getContext();
                Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
                keditorItem0 = rootItemSpec0.convertToKeditorItem(context0, cDM$Item0);
                goto label_35;
            }
            catch(NotMatchedModelException unused_ex) {
                unSupportedItem0 = new UnSupportedItem(cDM$Item0);
            }
            catch(ClassCastException unused_ex) {
                unSupportedItem0 = new UnSupportedItem(cDM$Item0);
            }
            catch(NullPointerException unused_ex) {
                unSupportedItem0 = new UnSupportedItem(cDM$Item0);
            }
            keditorItem0 = unSupportedItem0;
        label_35:
            list0.add(keditorItem0);
        }
        if(function10 != null) {
            List list1 = (List)function10.invoke(list0);
            if(list1 != null) {
                list0 = list1;
            }
        }
        this.getKeditorAdapter().setItems(list0);
        this.adjustItems();
        Keditor keditor0 = Keditor.INSTANCE;
        Integer integer0 = this.editorId;
        if(KeditorStandardKt.getOr(keditor0.getLocalConfigs(), integer0, null) == null || !((Map)androidx.room.a.g(keditor0, integer0)).containsKey("representative_image_enabled")) {
            Object object2 = keditor0.getConfig().get("representative_image_enabled");
            if(!(object2 instanceof Boolean)) {
                object2 = null;
            }
            boolean0 = (Boolean)object2;
        }
        else {
            Object object1 = ((Map)androidx.room.a.g(keditor0, integer0)).get("representative_image_enabled");
            if(!(object1 instanceof Boolean)) {
                object1 = null;
            }
            boolean0 = (Boolean)object1;
        }
        if(boolean0 == null) {
            boolean0 = Boolean.TRUE;
        }
        if(Intrinsics.areEqual(boolean0, Boolean.TRUE)) {
            Map map0 = cDM0.getRepresentation();
            if(map0 != null && map0.containsKey("image")) {
                String s1 = cDM0.getRepresentationImage();
                if(s1 != null) {
                    Iterator iterator1 = q.filterIsInstance(this.allItems$keditor_release(), RepresentativeImageProvider.class).iterator();
                label_63:
                    while(iterator1.hasNext()) {
                        Object object3 = iterator1.next();
                        Iterable iterable1 = ((RepresentativeImageProvider)object3).getImageSrcList();
                        if(!(iterable1 instanceof Collection) || !((Collection)iterable1).isEmpty()) {
                            for(Object object4: iterable1) {
                                if(!Intrinsics.areEqual(((String)object4), s1)) {
                                    continue;
                                }
                                rootItemSpec0 = object3;
                                break label_63;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                    if(((RepresentativeImageProvider)rootItemSpec0) != null) {
                        ((RepresentativeImageProvider)rootItemSpec0).setRepresentativeImage(s1);
                    }
                }
            }
        }
        this.post(new b(this, 2));
        this.original = this.exportToJson();
        this.backupRepresentativeImage = cDM0.getRepresentationImage();
    }

    public final void load(@NotNull String s, @Nullable Function1 function10) {
        Object object0;
        Intrinsics.checkNotNullParameter(s, "cdmJson");
        Class class0 = JsonConverterKt.jsonConverterClass();
        boolean z = Intrinsics.areEqual(class0, Moshi.class);
        Class class1 = CDM.class;
        if(z) {
            object0 = new Builder().add(new KotlinJsonAdapterFactory()).build().adapter(class1).fromJson(s);
        }
        else if(Intrinsics.areEqual(class0, Gson.class)) {
            object0 = new GsonBuilder().create().fromJson(s, class1);
        }
        else {
            throw new MissingJsonConverterException();
        }
        if(((CDM)object0) == null) {
            throw new InvalidInputException(s);
        }
        this.load(((CDM)object0), function10);
    }

    public static void load$default(KeditorView keditorView0, CDM cDM0, Function1 function10, int v, Object object0) {
        if((v & 2) != 0) {
            function10 = null;
        }
        keditorView0.load(cDM0, function10);
    }

    public static void load$default(KeditorView keditorView0, String s, Function1 function10, int v, Object object0) {
        if((v & 2) != 0) {
            function10 = null;
        }
        keditorView0.load(s, function10);
    }

    private static final void load$lambda$36(KeditorView keditorView0) {
        Intrinsics.checkNotNullParameter(keditorView0, "this$0");
        keditorView0.smoothScrollToPosition(0);
        keditorView0.scrollToPosition(0);
    }

    public final void loadWithKeepOriginal(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "savedCdmJson");
        String s1 = this.original;
        KeditorView.load$default(this, s, null, 2, null);
        this.original = s1;
    }

    @NotNull
    public final List localUploadableItems() {
        Iterable iterable0 = this.allUploadableItems();
        List list0 = new ArrayList();
        for(Object object0: iterable0) {
            if(((Uploadable)object0).getLocation() != Location.UPLOADED) {
                list0.add(object0);
            }
        }
        return list0;
    }

    public final void onActivityResult(int v, int v1, @Nullable Intent intent0) {
        for(Object object0: this.ativityResultHandlers) {
            ((ActivityResultHandler)object0).onActivityResult(v, v1, intent0);
        }
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner lifecycleOwner0) {
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "owner");
        DefaultLifecycleObserver.super.onCreate(lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner lifecycleOwner0) {
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "owner");
        DefaultLifecycleObserver.super.onDestroy(lifecycleOwner0);
        this.unregisterEditor();
    }

    private final void onRequestFocus(int v, int v1, boolean z) {
        this._focusedPosition = v1;
        Keditor.INSTANCE.log(this, "Requested focus " + v + " to " + v1);
        if(v != v1) {
            KeditorView.applyFocusToView$default(this, v, false, false, 4, null);
            this.getKeditorLayoutManager().onChangedFocus();
        }
        this.applyFocusToView(v1, true, z);
    }

    public static void onRequestFocus$default(KeditorView keditorView0, int v, int v1, boolean z, int v2, Object object0) {
        if((v2 & 4) != 0) {
            z = false;
        }
        keditorView0.onRequestFocus(v, v1, z);
    }

    public final void onUpdateConfigs() {
        this.updateDragAndDropEnabled();
    }

    public static void p(KeditorView keditorView0) {
        KeditorView.load$lambda$36(keditorView0);
    }

    // 检测为 Lambda 实现
    public static void q(KeditorView keditorView0, View view0, View view1) [...]

    public static void r(KeditorView keditorView0, int v, Function0 function00) {
        KeditorView.internalSmoothScrollToPosition$lambda$13(keditorView0, v, function00);
    }

    private final void readAttributes(AttributeSet attributeSet0) {
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.KeditorView);
        Intrinsics.checkNotNullExpressionValue(typedArray0, "obtainStyledAttributes(...)");
        String s = typedArray0.getString(styleable.KeditorView_ke_config);
        if(s != null) {
            this.editorConfig = KeditorConfigKt.loadConfig(Keditor.INSTANCE, s);
        }
        if(typedArray0.getBoolean(styleable.KeditorView_ke_read_only, false)) {
            this.setReadOnly();
        }
        typedArray0.recycle();
    }

    private final void refreshFocus() {
        KeditorView.applyFocusToView$default(this, this._focusedPosition, true, false, 4, null);
    }

    private final void registerEditorWithSpecs() {
        Keditor.INSTANCE.register$keditor_release(this);
        this.getItemSpecs().initItemSpecs(this.editorId);
        PluginSpecs pluginSpecs0 = this.getPluginSpecs();
        ItemSpecs itemSpecs0 = this.getItemSpecs();
        pluginSpecs0.initPlugins(this.editorId, itemSpecs0);
        PluginSpecs pluginSpecs1 = this.getPluginSpecs();
        PluginSpecRequester.INSTANCE.registerPlugins(this.editorId, pluginSpecs1);
        this.getViewTreeObserver().addOnGlobalFocusChangeListener(this.internalGlobalFocusChangeListener);
    }

    private final void registerLifecycleListener() {
        Context context0 = this.getContext();
        LifecycleOwner lifecycleOwner0 = context0 instanceof LifecycleOwner ? ((LifecycleOwner)context0) : null;
        if(lifecycleOwner0 != null) {
            Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
            if(lifecycle0 != null) {
                lifecycle0.addObserver(this);
            }
        }
    }

    public final void removeHeaderView() {
        this.getKeditorAdapter().removeHeaderView();
    }

    private final String representativeImage() {
        Object object0 = null;
        for(Object object1: q.filterIsInstance(this.allItems$keditor_release(), RepresentativeImageProvider.class)) {
            if(((RepresentativeImageProvider)object1).containsRepresentativeImage()) {
                object0 = object1;
                break;
            }
        }
        if(((RepresentativeImageProvider)object0) != null) {
            String s = ((RepresentativeImageProvider)object0).getRepresentativeImage();
            return s == null ? this.backupRepresentativeImage : s;
        }
        return this.backupRepresentativeImage;
    }

    public final void requestHideInput() {
        this.onInputMethodRequested.invoke(Hide.INSTANCE);
    }

    public final void requestShowInput() {
        this.onInputMethodRequested.invoke(Show.INSTANCE);
    }

    public static void s(Function0 function00) {
        KeditorView.internalSmoothScrollToPosition$lambda$13$lambda$12(function00);
    }

    private final void scrollTo(ScrollTo scrollTo0) {
        int v = this.getKeditorAdapter().viewPositionAt(scrollTo0.getPosition());
        LayoutManager recyclerView$LayoutManager0 = this.getLayoutManager();
        Intrinsics.checkNotNull(recyclerView$LayoutManager0, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int v1 = ((LinearLayoutManager)recyclerView$LayoutManager0).findFirstVisibleItemPosition();
        LayoutManager recyclerView$LayoutManager1 = this.getLayoutManager();
        Intrinsics.checkNotNull(recyclerView$LayoutManager1, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        if(v > ((LinearLayoutManager)recyclerView$LayoutManager1).findLastVisibleItemPosition() || v < v1) {
            this.internalSmoothScrollToPosition(scrollTo0.getPosition(), scrollTo0.getDoAfterScroll());
        }
        else {
            Function0 function00 = scrollTo0.getDoAfterScroll();
            if(function00 != null) {
                function00.invoke();
            }
        }
    }

    private final void setAlignment(Alignment alignment0) {
        Iterable iterable0 = this.allItems$keditor_release();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            if(((KeditorItem)object0) instanceof Aligned || ((KeditorItem)object0) instanceof Styled) {
                arrayList0.add(object0);
            }
        }
        for(Object object1: arrayList0) {
            KeditorItem keditorItem0 = (KeditorItem)object1;
            if(keditorItem0 instanceof Styled) {
                ((Styled)keditorItem0).setStyle(alignment0.toStyle());
            }
            else {
                Aligned aligned0 = keditorItem0 instanceof Aligned ? ((Aligned)keditorItem0) : null;
                if(aligned0 != null) {
                    if(keditorItem0 instanceof TextItem) {
                        aligned0.setAlignment(alignment0);
                    }
                    else {
                        Alignment alignment1 = Intrinsics.areEqual(alignment0, Justify.INSTANCE) ? Left.INSTANCE : alignment0;
                        aligned0.setAlignment(alignment1);
                    }
                }
            }
            if(!(keditorItem0 instanceof NoUpdateWhenAlignmentChanged)) {
                this.getKeditorAdapter().notifyItemChanged(this.getKeditorAdapter().viewPositionAt(this.indexOf$keditor_release(keditorItem0)));
            }
        }
    }

    public final void setEditorConfig$keditor_release(@Nullable Map map0) {
        this.editorConfig = map0;
    }

    public final void setFocusBlocked$keditor_release(boolean z) {
        this.isFocusBlocked = z;
    }

    public final void setHeaderView(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        this.getKeditorAdapter().setHeaderView(view0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView
    public void setItemAnimator(@Nullable ItemAnimator recyclerView$ItemAnimator0) {
    }

    public final void setItemSpecs(@NotNull ItemSpecs itemSpecs0) {
        Intrinsics.checkNotNullParameter(itemSpecs0, "<set-?>");
        this.itemSpecs = itemSpecs0;
    }

    public final void setOnInputMethodRequested(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "<set-?>");
        this.onInputMethodRequested = function10;
    }

    public final void setPluginSpecs(@NotNull PluginSpecs pluginSpecs0) {
        Intrinsics.checkNotNullParameter(pluginSpecs0, "<set-?>");
        this.pluginSpecs = pluginSpecs0;
    }

    public final void setReadOnly() {
        this.internalState |= 2;
        Adapter recyclerView$Adapter0 = this.getAdapter();
        if(recyclerView$Adapter0 != null) {
            recyclerView$Adapter0.notifyDataSetChanged();
        }
    }

    public final void setRequestOnly() {
        this.internalState |= 4;
        Adapter recyclerView$Adapter0 = this.getAdapter();
        if(recyclerView$Adapter0 != null) {
            recyclerView$Adapter0.notifyDataSetChanged();
        }
    }

    private final Object startViewRequestCollector(Continuation continuation0) {
        Object object0 = new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                com.kakao.keditor.KeditorView.startViewRequestCollector..inlined.subscribe.2.2 keditorView$startViewRequestCollector$$inlined$subscribe$2$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        com.kakao.keditor.KeditorView.startViewRequestCollector..inlined.subscribe.2.2.1 keditorView$startViewRequestCollector$$inlined$subscribe$2$2$10;
                        if(continuation0 instanceof com.kakao.keditor.KeditorView.startViewRequestCollector..inlined.subscribe.2.2.1) {
                            keditorView$startViewRequestCollector$$inlined$subscribe$2$2$10 = (com.kakao.keditor.KeditorView.startViewRequestCollector..inlined.subscribe.2.2.1)continuation0;
                            int v = keditorView$startViewRequestCollector$$inlined$subscribe$2$2$10.label;
                            if((v & 0x80000000) == 0) {
                                keditorView$startViewRequestCollector$$inlined$subscribe$2$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                    Object L$0;
                                    int label;
                                    Object result;

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object0) {
                                        this.result = object0;
                                        this.label |= 0x80000000;
                                        return continuation0.emit(null, this);
                                    }
                                };
                            }
                            else {
                                keditorView$startViewRequestCollector$$inlined$subscribe$2$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            keditorView$startViewRequestCollector$$inlined$subscribe$2$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                Object L$0;
                                int label;
                                Object result;

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object0) {
                                    this.result = object0;
                                    this.label |= 0x80000000;
                                    return continuation0.emit(null, this);
                                }
                            };
                        }
                        Object object1 = keditorView$startViewRequestCollector$$inlined$subscribe$2$2$10.result;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(keditorView$startViewRequestCollector$$inlined$subscribe$2$2$10.label) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                FlowCollector flowCollector0 = this.$this_unsafeFlow;
                                if(object0 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type com.kakao.keditor.util.eventbus.ViewRequest");
                                }
                                keditorView$startViewRequestCollector$$inlined$subscribe$2$2$10.label = 1;
                                return flowCollector0.emit(((ViewRequest)object0), keditorView$startViewRequestCollector$$inlined$subscribe$2$2$10) == object2 ? object2 : Unit.INSTANCE;
                            }
                            case 1: {
                                ResultKt.throwOnFailure(object1);
                                return Unit.INSTANCE;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                };
                Object object0 = this.$this_unsafeTransform$inlined.collect(keditorView$startViewRequestCollector$$inlined$subscribe$2$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        }.collect(new FlowCollector() {
            public static void a(KeditorView keditorView0, int v, ViewRequest viewRequest0) {
                com.kakao.keditor.KeditorView.startViewRequestCollector.2.emit$lambda$10$lambda$9(keditorView0, v, viewRequest0);
            }

            public static void b(ViewRequest viewRequest0) {
                com.kakao.keditor.KeditorView.startViewRequestCollector.2.emit$lambda$2(viewRequest0);
            }

            public static void c(KeditorView keditorView0, int v, ViewRequest viewRequest0) {
                com.kakao.keditor.KeditorView.startViewRequestCollector.2.emit$lambda$6$lambda$5(keditorView0, v, viewRequest0);
            }

            @Nullable
            public final Object emit(@NotNull ViewRequest viewRequest0, @NotNull Continuation continuation0) {
                int v16;
                int v = -1;
                int v1 = 0;
                Keditor.INSTANCE.log(KeditorView.this, "ViewRequest : " + viewRequest0);
                if(KeditorView.this.isReadOnly()) {
                    return Unit.INSTANCE;
                }
                if(viewRequest0 instanceof RefreshPosition) {
                    int v2 = ((RefreshPosition)viewRequest0).getPosition() <= -1 ? KeditorView.this._focusedPosition : ((RefreshPosition)viewRequest0).getPosition();
                    KeditorView.this.getKeditorAdapter().notifyItemChanged(KeditorView.this.getKeditorAdapter().viewPositionAt(v2));
                    return Unit.INSTANCE;
                }
                if(viewRequest0 instanceof AdjustItem) {
                    KeditorView.this.adjustItems();
                    return Unit.INSTANCE;
                }
                if(viewRequest0 instanceof RequestFocus) {
                    int v3 = ((RequestFocus)viewRequest0).getPosition();
                    if(v3 == -1 && KeditorView.this._focusedPosition == -1) {
                        for(Object object0: KeditorView.this.getKeditorAdapter().getItems()) {
                            if(((KeditorItem)object0) instanceof ParagraphItem) {
                                v = v1;
                                break;
                            }
                            ++v1;
                        }
                        v3 = v;
                    }
                    if(v3 < 0) {
                        v3 = KeditorView.this._focusedPosition;
                    }
                    else if(v3 > KeditorView.this.getKeditorAdapter().lastItemIndex()) {
                        v3 = KeditorView.this.getKeditorAdapter().lastItemIndex();
                    }
                    KeditorView.internalSmoothScrollToPosition$default(KeditorView.this, v3, null, 2, null);
                    Object object1 = KeditorView.this.getKeditorAdapter().get(v3);
                    KeditorView.this.onRequestFocus(KeditorView.this._focusedPosition, v3, object1 instanceof TextItem);
                    if(((RequestFocus)viewRequest0).getNeedAdjust()) {
                        KeditorView.this.adjustItems();
                        return Unit.INSTANCE;
                    }
                }
                else {
                    if(viewRequest0 instanceof GetFocusedItem) {
                        ((GetFocusedItem)viewRequest0).getDoWithItem().invoke(KeditorView.this.getItem$keditor_release(KeditorView.this.getFocusedPosition()));
                        return Unit.INSTANCE;
                    }
                    if(Intrinsics.areEqual(viewRequest0, RefreshFocus.INSTANCE)) {
                        KeditorView.this.refreshFocus();
                        return Unit.INSTANCE;
                    }
                    if(Intrinsics.areEqual(viewRequest0, RefreshAll.INSTANCE)) {
                        KeditorAdapter keditorAdapter0 = KeditorView.this.getKeditorAdapter();
                        if(keditorAdapter0 != null) {
                            keditorAdapter0.notifyDataSetChanged();
                            return Unit.INSTANCE;
                        }
                    }
                    else {
                        if(viewRequest0 instanceof RemoveFocusItem) {
                            KeditorAdapter.removeItem$default(KeditorView.this.getKeditorAdapter(), KeditorView.this._focusedPosition, false, 2, null);
                            KeditorView.this._focusedPosition = -1;
                            com.kakao.keditor.util.eventbus.ToolbarRequest.FocusCategory toolbarRequest$FocusCategory0 = new com.kakao.keditor.util.eventbus.ToolbarRequest.FocusCategory(Idle.INSTANCE);
                            KeEvent.INSTANCE.postInScope(toolbarRequest$FocusCategory0);
                            return Unit.INSTANCE;
                        }
                        if(viewRequest0 instanceof AddKeditorItems) {
                            int v4 = ((AddKeditorItems)viewRequest0).getPosition();
                            int v5 = KeditorView.this.getTargetPosition(v4);
                            KeditorItem keditorItem0 = (KeditorItem)KeditorView.this.getKeditorAdapter().getOrNull(v5);
                            if(keditorItem0 instanceof ParagraphItem) {
                                List list0 = ParagraphItemKt.itemListAfterSplit(((ParagraphItem)keditorItem0), ((AddKeditorItems)viewRequest0).getItems(), ((AddKeditorItems)viewRequest0).getFocusOnNextParagraph());
                                List list1 = list0.subList(1, list0.size());
                                KeditorAdapter keditorAdapter2 = KeditorView.this.getKeditorAdapter();
                                KeditorItem[] arr_keditorItem1 = (KeditorItem[])list1.toArray(new KeditorItem[0]);
                                keditorAdapter2.add(v5, ((KeditorItem[])Arrays.copyOf(arr_keditorItem1, arr_keditorItem1.length)));
                                boolean z = ((AddKeditorItems)viewRequest0).getFocusOnNextParagraph();
                                int v8 = KeditorView.this.getTargetPosition(list1.size() - !z + v5);
                                KeditorView.this._focusedPosition = v8;
                                KeditorView.this.getKeditorAdapter().notifyItemChanged(v5);
                                ScrollTo scrollTo0 = new ScrollTo(KeditorView.this._focusedPosition, true, null, 4, null);
                                KeditorView.this.scrollTo(scrollTo0);
                            }
                            else {
                                KeditorAdapter keditorAdapter1 = KeditorView.this.getKeditorAdapter();
                                KeditorItem[] arr_keditorItem = (KeditorItem[])((AddKeditorItems)viewRequest0).getItems().toArray(new KeditorItem[0]);
                                keditorAdapter1.add(v5, ((KeditorItem[])Arrays.copyOf(arr_keditorItem, arr_keditorItem.length)));
                                int v6 = ((AddKeditorItems)viewRequest0).getItems().size();
                                int v7 = KeditorView.this.getTargetPosition(v6 + v5);
                                KeditorView.this._focusedPosition = v7;
                                KeditorView.internalSmoothScrollToPosition$default(KeditorView.this, KeditorView.this._focusedPosition, null, 2, null);
                                KeditorView.this.refreshFocus();
                            }
                            KeditorView.this.adjustItems();
                            return Unit.INSTANCE;
                        }
                        if(viewRequest0 instanceof InsertKeditorItem) {
                            int v9 = ((InsertKeditorItem)viewRequest0).getPosition() <= -1 ? KeditorView.this.getKeditorAdapter().lastItemIndex() : ((InsertKeditorItem)viewRequest0).getPosition();
                            int v10 = KeditorView.this.getKeditorAdapter().insert(v9, new KeditorItem[]{((InsertKeditorItem)viewRequest0).getItem()});
                            KeditorView.this._focusedPosition = v10;
                            if(!((InsertKeditorItem)viewRequest0).getSkipScroll() && ((InsertKeditorItem)viewRequest0).getPosition() > -1) {
                                ScrollTo scrollTo1 = new ScrollTo(((InsertKeditorItem)viewRequest0).getPosition(), false, null, 6, null);
                                KeditorView.this.scrollTo(scrollTo1);
                            }
                            KeditorView.this.refreshFocus();
                            return Unit.INSTANCE;
                        }
                        if(viewRequest0 instanceof ReplaceItems) {
                            int v11 = ((ReplaceItems)viewRequest0).getPosition();
                            int v12 = KeditorView.this.getTargetPosition(v11);
                            int v13 = ((ReplaceItems)viewRequest0).getToPosition();
                            int v14 = KeditorView.this.getTargetPosition(v13);
                            KeditorView.this.getKeditorAdapter().replaceItem(v12, ((ReplaceItems)viewRequest0).getItems(), ((ReplaceItems)viewRequest0).getNotify());
                            KeditorView.this._focusedPosition = v14;
                            ScrollTo scrollTo2 = new ScrollTo(v14, true, null, 4, null);
                            KeditorView.this.scrollTo(scrollTo2);
                            return Unit.INSTANCE;
                        }
                        if(viewRequest0 instanceof RemoveItem) {
                            int v15 = ((RemoveItem)viewRequest0).getPosition();
                            KeditorView.this.getKeditorAdapter().removeItem(v15, ((boolean)(true ^ ((RemoveItem)viewRequest0).getIgnoreAdjust())));
                            if(((RemoveItem)viewRequest0).getIgnoreAdjust()) {
                                RequestFocus viewRequest$RequestFocus0 = new RequestFocus(v15, false, 2, null);
                                KeEvent.INSTANCE.postInScope(viewRequest$RequestFocus0);
                                return Unit.INSTANCE;
                            }
                            if(v15 > KeditorView.this.getKeditorAdapter().getItems().size()) {
                                KeditorView.this._focusedPosition = -1;
                            }
                            com.kakao.keditor.util.eventbus.ToolbarRequest.FocusCategory toolbarRequest$FocusCategory1 = new com.kakao.keditor.util.eventbus.ToolbarRequest.FocusCategory(Idle.INSTANCE);
                            KeEvent.INSTANCE.postInScope(toolbarRequest$FocusCategory1);
                            return Unit.INSTANCE;
                        }
                        if(viewRequest0 instanceof ResetAllItems) {
                            KeditorView.this.getKeditorAdapter().resetAllItems();
                            return Unit.INSTANCE;
                        }
                        if(viewRequest0 instanceof MergeText) {
                            Object object2 = KeditorView.this.getKeditorAdapter().get(((MergeText)viewRequest0).getTo());
                            KeditorView keditorView0 = KeditorView.this;
                            if(((KeditorItem)object2) instanceof ParagraphItem) {
                                ((ParagraphItem)(((KeditorItem)object2))).setHasPendingFocus(true);
                                ((ParagraphItem)(((KeditorItem)object2))).setSelectionStart(((ParagraphItem)(((KeditorItem)object2))).getText().length());
                                ((ParagraphItem)(((KeditorItem)object2))).setSelectionEnd(((ParagraphItem)(((KeditorItem)object2))).getText().length());
                                Object object3 = keditorView0.getKeditorAdapter().get(((MergeText)viewRequest0).getFrom());
                                Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItem");
                                ParagraphItemKt.merge(((ParagraphItem)(((KeditorItem)object2))), ((ParagraphItem)object3));
                                keditorView0.getKeditorAdapter().delete(((MergeText)viewRequest0).getFrom());
                                keditorView0.getKeditorAdapter().notifyItemRangeChanged(((MergeText)viewRequest0).getTo(), 2);
                                return Unit.INSTANCE;
                            }
                        }
                        else {
                            if(viewRequest0 instanceof EditorSortRequest) {
                                Alignment alignment0 = ((EditorSortRequest)viewRequest0).getAlignment();
                                KeditorView.this.setAlignment(alignment0);
                                KeditorView.this.adjustItems();
                                return Unit.INSTANCE;
                            }
                            if(viewRequest0 instanceof com.kakao.keditor.util.eventbus.ViewRequest.ScrollTo) {
                                if(((com.kakao.keditor.util.eventbus.ViewRequest.ScrollTo)viewRequest0).getPosition() > -1) {
                                    v16 = ((com.kakao.keditor.util.eventbus.ViewRequest.ScrollTo)viewRequest0).getPosition();
                                }
                                else {
                                    KeditorItem keditorItem1 = ((com.kakao.keditor.util.eventbus.ViewRequest.ScrollTo)viewRequest0).getItem();
                                    v16 = KeditorView.this.indexOf$keditor_release(keditorItem1);
                                }
                                int v17 = KeditorView.this.getKeditorAdapter().viewPositionAt(v16);
                                LayoutManager recyclerView$LayoutManager0 = KeditorView.this.getLayoutManager();
                                Intrinsics.checkNotNull(recyclerView$LayoutManager0, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                                int v18 = ((LinearLayoutManager)recyclerView$LayoutManager0).findFirstVisibleItemPosition();
                                LayoutManager recyclerView$LayoutManager1 = KeditorView.this.getLayoutManager();
                                Intrinsics.checkNotNull(recyclerView$LayoutManager1, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                                if(v17 <= ((LinearLayoutManager)recyclerView$LayoutManager1).findLastVisibleItemPosition() && v17 >= v18) {
                                    b b0 = new b(viewRequest0, 0);
                                    KeditorView.this.post(b0);
                                    return Unit.INSTANCE;
                                }
                                Function0 function00 = ((com.kakao.keditor.util.eventbus.ViewRequest.ScrollTo)viewRequest0).getDoAfterScroll();
                                KeditorView.this.internalSmoothScrollToPosition(v16, function00);
                                return Unit.INSTANCE;
                            }
                            if(viewRequest0 instanceof ScrollToSpecificTextIndex) {
                                TextItem textItem0 = ((ScrollToSpecificTextIndex)viewRequest0).getItem();
                                int v19 = KeditorView.this.indexOf$keditor_release(textItem0);
                                if(v19 < 0) {
                                    return Unit.INSTANCE;
                                }
                                int v20 = KeditorView.this.getKeditorAdapter().viewPositionAt(v19);
                                ViewHolder recyclerView$ViewHolder0 = KeditorView.this.findViewHolderForAdapterPosition(v20);
                                if(recyclerView$ViewHolder0 != null) {
                                    KeditorView.this.getItemSpecs().byType(((ScrollToSpecificTextIndex)viewRequest0).getItem().getType()).onRenderingRequest(recyclerView$ViewHolder0.itemView, viewRequest0);
                                    return Unit.INSTANCE;
                                }
                                KeditorView.this.scrollToPosition(v19);
                                com.kakao.keditor.c c0 = new com.kakao.keditor.c(KeditorView.this, v19, viewRequest0, 0);
                                KeditorView.this.post(c0);
                                return Unit.INSTANCE;
                            }
                            if(viewRequest0 instanceof RequestFocusToFirstTextItem) {
                                if(!(CollectionsKt___CollectionsKt.firstOrNull(KeditorView.this.getKeditorAdapter().getItems()) instanceof SingleTextItem)) {
                                    goto label_175;
                                }
                                RequestFocus viewRequest$RequestFocus1 = new RequestFocus(0, false, 2, null);
                                KeEvent.INSTANCE.postInScope(viewRequest$RequestFocus1);
                                int v21 = KeditorView.this.getKeditorAdapter().viewPositionAt(0);
                                ViewHolder recyclerView$ViewHolder1 = KeditorView.this.findViewHolderForAdapterPosition(v21);
                                if(recyclerView$ViewHolder1 != null) {
                                    View view0 = recyclerView$ViewHolder1.itemView;
                                    if(view0 != null) {
                                        view0.requestFocusFromTouch();
                                        return Unit.INSTANCE;
                                    label_175:
                                        InsertKeditorItem viewRequest$InsertKeditorItem0 = new InsertKeditorItem(new ParagraphItem(new SpannableStringBuilder(""), true, false, 4, null), 0, false, 4, null);
                                        KeEvent.INSTANCE.postInScope(viewRequest$InsertKeditorItem0);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                            else {
                                if(viewRequest0 instanceof GrammarViewRequest) {
                                    KeditorItem keditorItem2 = ((GrammarViewRequest)viewRequest0).getKeditorItem();
                                    int v22 = KeditorView.this.indexOf$keditor_release(keditorItem2);
                                    if(v22 < 0) {
                                        return Unit.INSTANCE;
                                    }
                                    int v23 = KeditorView.this.getKeditorAdapter().viewPositionAt(v22);
                                    ViewHolder recyclerView$ViewHolder2 = KeditorView.this.findViewHolderForAdapterPosition(v23);
                                    if(recyclerView$ViewHolder2 != null) {
                                        KeditorView.this.getItemSpecs().byType(((GrammarViewRequest)viewRequest0).getKeditorItem().getType()).onRenderingRequest(recyclerView$ViewHolder2.itemView, viewRequest0);
                                        return Unit.INSTANCE;
                                    }
                                    KeditorView.this.scrollToPosition(v22);
                                    com.kakao.keditor.c c1 = new com.kakao.keditor.c(KeditorView.this, v22, viewRequest0, 1);
                                    KeditorView.this.post(c1);
                                    return Unit.INSTANCE;
                                }
                                if(!(viewRequest0 instanceof UpdateRepresentState) || ((UpdateRepresentState)viewRequest0).getPosition() < 0) {
                                    return Unit.INSTANCE;
                                }
                                KeditorView.this.getKeditorAdapter().onViewRequest(viewRequest0);
                                if(!((UpdateRepresentState)viewRequest0).isSet()) {
                                    KeditorView.this.backupRepresentativeImage = null;
                                }
                                Object object4 = KeditorView.this.getKeditorAdapter().get(((UpdateRepresentState)viewRequest0).getPosition());
                                ((UpdateRepresentState)viewRequest0).setItem(((KeditorItem)object4));
                                DefaultImpls.onRenderingRequest$default(KeditorView.this.getItemSpecs().byType(((KeditorItem)object4).getType()), null, viewRequest0, 1, null);
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            }

            @Override  // kotlinx.coroutines.flow.FlowCollector
            public Object emit(Object object0, Continuation continuation0) {
                return this.emit(((ViewRequest)object0), continuation0);
            }

            private static final void emit$lambda$10$lambda$9(KeditorView keditorView0, int v, ViewRequest viewRequest0) {
                Intrinsics.checkNotNullParameter(keditorView0, "this$0");
                Intrinsics.checkNotNullParameter(viewRequest0, "$request");
                ViewHolder recyclerView$ViewHolder0 = keditorView0.findViewHolderForAdapterPosition(keditorView0.getKeditorAdapter().viewPositionAt(v));
                if(recyclerView$ViewHolder0 != null) {
                    keditorView0.getItemSpecs().byType(((GrammarViewRequest)viewRequest0).getKeditorItem().getType()).onRenderingRequest(recyclerView$ViewHolder0.itemView, viewRequest0);
                }
            }

            private static final void emit$lambda$2(ViewRequest viewRequest0) {
                Intrinsics.checkNotNullParameter(viewRequest0, "$request");
                Function0 function00 = ((com.kakao.keditor.util.eventbus.ViewRequest.ScrollTo)viewRequest0).getDoAfterScroll();
                if(function00 != null) {
                    function00.invoke();
                }
            }

            private static final void emit$lambda$6$lambda$5(KeditorView keditorView0, int v, ViewRequest viewRequest0) {
                Intrinsics.checkNotNullParameter(keditorView0, "this$0");
                Intrinsics.checkNotNullParameter(viewRequest0, "$request");
                ViewHolder recyclerView$ViewHolder0 = keditorView0.findViewHolderForAdapterPosition(keditorView0.getKeditorAdapter().viewPositionAt(v));
                if(recyclerView$ViewHolder0 != null) {
                    keditorView0.getItemSpecs().byType(((ScrollToSpecificTextIndex)viewRequest0).getItem().getType()).onRenderingRequest(recyclerView$ViewHolder0.itemView, viewRequest0);
                }
            }
        }, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;

        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001F\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\n"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1", "com/kakao/keditor/util/eventbus/KeEvent$subscribe$$inlined$filter$1"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
        public final class com.kakao.keditor.KeditorView.startViewRequestCollector..inlined.subscribe.1 implements Flow {
            public com.kakao.keditor.KeditorView.startViewRequestCollector..inlined.subscribe.1(Flow flow0) {
            }

            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                com.kakao.keditor.KeditorView.startViewRequestCollector..inlined.subscribe.1.2 keditorView$startViewRequestCollector$$inlined$subscribe$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        com.kakao.keditor.KeditorView.startViewRequestCollector..inlined.subscribe.1.2.1 keditorView$startViewRequestCollector$$inlined$subscribe$1$2$10;
                        if(continuation0 instanceof com.kakao.keditor.KeditorView.startViewRequestCollector..inlined.subscribe.1.2.1) {
                            keditorView$startViewRequestCollector$$inlined$subscribe$1$2$10 = (com.kakao.keditor.KeditorView.startViewRequestCollector..inlined.subscribe.1.2.1)continuation0;
                            int v = keditorView$startViewRequestCollector$$inlined$subscribe$1$2$10.label;
                            if((v & 0x80000000) == 0) {
                                keditorView$startViewRequestCollector$$inlined$subscribe$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                    Object L$0;
                                    Object L$1;
                                    int label;
                                    Object result;

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object0) {
                                        this.result = object0;
                                        this.label |= 0x80000000;
                                        return continuation0.emit(null, this);
                                    }
                                };
                            }
                            else {
                                keditorView$startViewRequestCollector$$inlined$subscribe$1$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            keditorView$startViewRequestCollector$$inlined$subscribe$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                Object L$0;
                                Object L$1;
                                int label;
                                Object result;

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object0) {
                                    this.result = object0;
                                    this.label |= 0x80000000;
                                    return continuation0.emit(null, this);
                                }
                            };
                        }
                        Object object1 = keditorView$startViewRequestCollector$$inlined$subscribe$1$2$10.result;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(keditorView$startViewRequestCollector$$inlined$subscribe$1$2$10.label) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                FlowCollector flowCollector0 = this.$this_unsafeFlow;
                                if(object0 instanceof ViewRequest) {
                                    keditorView$startViewRequestCollector$$inlined$subscribe$1$2$10.label = 1;
                                    if(flowCollector0.emit(object0, keditorView$startViewRequestCollector$$inlined$subscribe$1$2$10) == object2) {
                                        return object2;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                            case 1: {
                                ResultKt.throwOnFailure(object1);
                                return Unit.INSTANCE;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                };
                Object object0 = this.$this_unsafeTransform$inlined.collect(keditorView$startViewRequestCollector$$inlined$subscribe$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        }

    }

    private final void unregisterEditor() {
        Keditor.INSTANCE.unregister$keditor_release(this);
        PluginSpecRequester.INSTANCE.unregisterPlugins(this.editorId);
        this.getViewTreeObserver().removeOnGlobalFocusChangeListener(this.internalGlobalFocusChangeListener);
    }

    private final List unzipUploadableItems() {
        Iterable iterable0 = this.allItems$keditor_release();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            if(((KeditorItem)object0) instanceof HasExtraUploadable) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(arrayList0, 10));
        for(Object object1: arrayList0) {
            Intrinsics.checkNotNull(((KeditorItem)object1), "null cannot be cast to non-null type com.kakao.keditor.plugin.attrs.item.HasExtraUploadable");
            arrayList1.add(((HasExtraUploadable)(((KeditorItem)object1))));
        }
        List list0 = new ArrayList();
        for(Object object2: arrayList1) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(((HasExtraUploadable)object2).getUploadables());
            o.addAll(list0, arrayList2);
        }
        return list0;
    }

    private final void updateDragAndDropEnabled() {
        Boolean boolean1;
        Keditor keditor0 = Keditor.INSTANCE;
        Integer integer0 = this.editorId;
        Boolean boolean0 = Boolean.TRUE;
        if(KeditorStandardKt.getOr(keditor0.getLocalConfigs(), integer0, null) == null || !((Map)androidx.room.a.g(keditor0, integer0)).containsKey("drag_and_drop_enabled")) {
            Object object1 = keditor0.getConfig().get("drag_and_drop_enabled");
            if(!(object1 instanceof Boolean)) {
                object1 = null;
            }
            boolean1 = (Boolean)object1;
        }
        else {
            Object object0 = ((Map)androidx.room.a.g(keditor0, integer0)).get("drag_and_drop_enabled");
            if(!(object0 instanceof Boolean)) {
                object0 = null;
            }
            boolean1 = (Boolean)object0;
        }
        if(boolean1 != null) {
            boolean0 = boolean1;
        }
        if(boolean0.booleanValue()) {
            ItemTouchHelper itemTouchHelper0 = this.itemTouchHelper;
            if(itemTouchHelper0 != null) {
                itemTouchHelper0.attachToRecyclerView(this);
            }
        }
        else {
            ItemTouchHelper itemTouchHelper1 = this.itemTouchHelper;
            if(itemTouchHelper1 != null) {
                itemTouchHelper1.attachToRecyclerView(null);
            }
        }
    }

    @NotNull
    public final List uploadFailedItems() {
        Iterable iterable0 = this.allUploadableItems();
        List list0 = new ArrayList();
        for(Object object0: iterable0) {
            if(((Uploadable)object0).getLocation() == Location.FAILED) {
                list0.add(object0);
            }
        }
        return list0;
    }

    @NotNull
    public final List uploadedItems() {
        Iterable iterable0 = this.allUploadableItems();
        List list0 = new ArrayList();
        for(Object object0: iterable0) {
            if(((Uploadable)object0).getLocation() == Location.UPLOADED) {
                list0.add(object0);
            }
        }
        return list0;
    }
}

