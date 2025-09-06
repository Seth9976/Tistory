package com.kakao.tistory.presentation.viewmodel;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import com.kakao.android.base.BaseKt;
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.plugin.itemspec.file.FileItem;
import com.kakao.keditor.plugin.itemspec.opengraph.OpenGraphItem;
import com.kakao.keditor.plugin.pluginspec.image.ImageItem;
import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.CategoryItem;
import com.kakao.tistory.domain.entity.SortItem;
import com.kakao.tistory.domain.entity.autosave.EditEntryEntity;
import com.kakao.tistory.domain.entity.autosave.EntryEntity;
import com.kakao.tistory.domain.entity.autosave.EntryKeyEntity;
import com.kakao.tistory.domain.entity.autosave.EntrySettingEntity;
import com.kakao.tistory.domain.entity.entry.DaumLikeItem;
import com.kakao.tistory.domain.entity.entry.DraftItem;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.AutoSaveRepository;
import com.kakao.tistory.domain.repository.EntryFileRepository;
import com.kakao.tistory.domain.repository.EntryRepository;
import com.kakao.tistory.domain.repository.GrammarRepository;
import com.kakao.tistory.domain.usecase.GetChallengeRequirementsUseCase;
import com.kakao.tistory.domain.usecase.GetEditableEntryUseCase;
import com.kakao.tistory.domain.usecase.GetLatestEditEntryUseCase;
import com.kakao.tistory.domain.usecase.GetMyBlogUseCase;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.common.utils.CrashlyticsUtils;
import com.kakao.tistory.presentation.common.utils.DateUtils;
import com.kakao.tistory.presentation.editor.contract.EditorChallenge;
import com.kakao.tistory.presentation.editor.contract.EditorChallengeKt;
import com.kakao.tistory.presentation.editor.contract.Reservation;
import com.kakao.tistory.presentation.editor.contract.Visibility;
import com.kakao.tistory.presentation.view.editor.EditorSettingTiara;
import com.kakao.tistory.presentation.view.editor.EditorTiara;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.p;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000\u0096\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0006\u00A5\u0002\u00A6\u0002\u00A7\u0002BQ\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u0012\u0006\u0010\u0011\u001A\u00020\u0010\u0012\u0006\u0010\u0013\u001A\u00020\u0012\u00A2\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u001E\u001A\u00020\u001D2\b\u0010\u0017\u001A\u0004\u0018\u00010\u00162\b\u0010\u0019\u001A\u0004\u0018\u00010\u00182\u0006\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\u001C\u001A\u00020\u001A\u00A2\u0006\u0004\b\u001E\u0010\u001FJ)\u0010$\u001A\u00020\u001D2\u0006\u0010!\u001A\u00020 2\u0012\u0010#\u001A\u000E\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001D0\"\u00A2\u0006\u0004\b$\u0010%J\u001E\u0010)\u001A\b\u0012\u0004\u0012\u00020(0\'2\u0006\u0010&\u001A\u00020\u0016H\u0086@\u00A2\u0006\u0004\b)\u0010*J\u0015\u0010-\u001A\u00020\u001D2\u0006\u0010,\u001A\u00020+\u00A2\u0006\u0004\b-\u0010.J\u0015\u00101\u001A\u00020\u001D2\u0006\u00100\u001A\u00020/\u00A2\u0006\u0004\b1\u00102J\u0015\u00103\u001A\u00020\u001D2\u0006\u00100\u001A\u00020/\u00A2\u0006\u0004\b3\u00102J\u0015\u00105\u001A\u00020\u001D2\u0006\u00104\u001A\u00020\u0018\u00A2\u0006\u0004\b5\u00106J\u0017\u00108\u001A\u00020\u001D2\b\u00107\u001A\u0004\u0018\u00010\u0016\u00A2\u0006\u0004\b8\u00109J\r\u0010:\u001A\u00020\u001D\u00A2\u0006\u0004\b:\u0010;J\r\u0010<\u001A\u00020\u001D\u00A2\u0006\u0004\b<\u0010;J\r\u0010=\u001A\u00020\u001D\u00A2\u0006\u0004\b=\u0010;J\r\u0010>\u001A\u00020\u001D\u00A2\u0006\u0004\b>\u0010;J\r\u0010?\u001A\u00020\u001D\u00A2\u0006\u0004\b?\u0010;J\u0015\u0010B\u001A\u00020\u001D2\u0006\u0010A\u001A\u00020@\u00A2\u0006\u0004\bB\u0010CJ\r\u0010D\u001A\u00020\u001D\u00A2\u0006\u0004\bD\u0010;J\r\u0010E\u001A\u00020\u001D\u00A2\u0006\u0004\bE\u0010;J\u0015\u0010G\u001A\u00020\u001D2\u0006\u0010F\u001A\u00020\u0016\u00A2\u0006\u0004\bG\u00109J\u0015\u0010I\u001A\u00020\u001D2\u0006\u0010!\u001A\u00020H\u00A2\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001A\u00020\u001D2\b\b\u0002\u0010K\u001A\u00020\u001A\u00A2\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001A\u00020\u001D2\b\u0010!\u001A\u0004\u0018\u00010N\u00A2\u0006\u0004\bO\u0010PJ\r\u0010Q\u001A\u00020\u001D\u00A2\u0006\u0004\bQ\u0010;J\u0015\u0010S\u001A\u00020\u001D2\u0006\u0010R\u001A\u00020\u0016\u00A2\u0006\u0004\bS\u00109J\u0015\u0010T\u001A\u00020\u001D2\u0006\u0010R\u001A\u00020\u0016\u00A2\u0006\u0004\bT\u00109J\r\u0010U\u001A\u00020\u001D\u00A2\u0006\u0004\bU\u0010;J\r\u0010V\u001A\u00020\u001D\u00A2\u0006\u0004\bV\u0010;J\r\u0010W\u001A\u00020\u001D\u00A2\u0006\u0004\bW\u0010;J\u001B\u0010Z\u001A\u00020\u001D2\f\u0010Y\u001A\b\u0012\u0004\u0012\u00020\u00160X\u00A2\u0006\u0004\bZ\u0010[J\r\u0010\\\u001A\u00020\u001D\u00A2\u0006\u0004\b\\\u0010;J\u0015\u0010_\u001A\u00020\u001D2\u0006\u0010^\u001A\u00020]\u00A2\u0006\u0004\b_\u0010`J\r\u0010a\u001A\u00020\u001D\u00A2\u0006\u0004\ba\u0010;J\u001D\u0010e\u001A\u00020\u001D2\u0006\u0010c\u001A\u00020b2\u0006\u0010d\u001A\u00020\u001A\u00A2\u0006\u0004\be\u0010fJ\u0015\u0010h\u001A\u00020\u001D2\u0006\u0010g\u001A\u00020\u0016\u00A2\u0006\u0004\bh\u00109J\u0015\u0010j\u001A\u00020\u001D2\u0006\u0010i\u001A\u00020\u001A\u00A2\u0006\u0004\bj\u0010MJ\r\u0010k\u001A\u00020\u001D\u00A2\u0006\u0004\bk\u0010;J\r\u0010l\u001A\u00020\u001D\u00A2\u0006\u0004\bl\u0010;J\r\u0010m\u001A\u00020\u001A\u00A2\u0006\u0004\bm\u0010nJ\'\u0010t\u001A\u00020\u001D2\u0006\u0010p\u001A\u00020o2\u0006\u0010q\u001A\u00020o2\b\u0010s\u001A\u0004\u0018\u00010r\u00A2\u0006\u0004\bt\u0010uJ\r\u0010v\u001A\u00020\u001D\u00A2\u0006\u0004\bv\u0010;J\r\u0010w\u001A\u00020\u001D\u00A2\u0006\u0004\bw\u0010;J\r\u0010x\u001A\u00020\u001D\u00A2\u0006\u0004\bx\u0010;J\r\u0010y\u001A\u00020\u0016\u00A2\u0006\u0004\by\u0010zJ\u0015\u0010|\u001A\u00020\u001D2\u0006\u0010{\u001A\u00020\u0016\u00A2\u0006\u0004\b|\u00109R%\u0010\u0017\u001A\u00020\u00162\u0006\u0010}\u001A\u00020\u00168\u0006@BX\u0086\u000E\u00A2\u0006\r\n\u0004\b~\u0010\u007F\u001A\u0005\b\u0080\u0001\u0010zR(\u0010\u0019\u001A\u00020\u00182\u0006\u0010}\u001A\u00020\u00188\u0006@BX\u0086\u000E\u00A2\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001A\u0006\b\u0083\u0001\u0010\u0084\u0001R/\u0010\u008A\u0001\u001A\u0005\u0018\u00010\u0085\u00012\t\u0010}\u001A\u0005\u0018\u00010\u0085\u00018\u0006@BX\u0086\u000E\u00A2\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001A\u0006\b\u0088\u0001\u0010\u0089\u0001R9\u0010\u0092\u0001\u001A\u001F\u0012\u001A\u0012\u0018\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u008D\u00010\u008C\u00010\u008B\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u008E\u0001\u0010\u008F\u0001\u001A\u0006\b\u0090\u0001\u0010\u0091\u0001R;\u0010\u0097\u0001\u001A!\u0012\u001C\u0012\u001A\u0012\u0015\u0012\u0013\u0012\u0005\u0012\u00030\u0093\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0094\u00010\u008D\u00010\u008C\u00010\u008B\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u008F\u0001\u001A\u0006\b\u0096\u0001\u0010\u0091\u0001R*\u0010\u009A\u0001\u001A\u0010\u0012\u000B\u0012\t\u0012\u0004\u0012\u00020\u001D0\u008C\u00010\u008B\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u008F\u0001\u001A\u0006\b\u0099\u0001\u0010\u0091\u0001R*\u0010\u009D\u0001\u001A\u0010\u0012\u000B\u0012\t\u0012\u0004\u0012\u00020\u001D0\u008C\u00010\u008B\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u009B\u0001\u0010\u008F\u0001\u001A\u0006\b\u009C\u0001\u0010\u0091\u0001R#\u0010\u00A3\u0001\u001A\t\u0012\u0004\u0012\u00020\u001A0\u009E\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u009F\u0001\u0010\u00A0\u0001\u001A\u0006\b\u00A1\u0001\u0010\u00A2\u0001R$\u0010\u00A7\u0001\u001A\n\u0012\u0005\u0012\u00030\u00A4\u00010\u009E\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u00A5\u0001\u0010\u00A0\u0001\u001A\u0006\b\u00A6\u0001\u0010\u00A2\u0001R#\u0010\u00AA\u0001\u001A\t\u0012\u0004\u0012\u00020\u001A0\u009E\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u00A8\u0001\u0010\u00A0\u0001\u001A\u0006\b\u00A9\u0001\u0010\u00A2\u0001R%\u0010\u00AD\u0001\u001A\u000B\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u009E\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u00AB\u0001\u0010\u00A0\u0001\u001A\u0006\b\u00AC\u0001\u0010\u00A2\u0001R)\u0010\u00B0\u0001\u001A\u000F\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160X0\u009E\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u00AE\u0001\u0010\u00A0\u0001\u001A\u0006\b\u00AF\u0001\u0010\u00A2\u0001R#\u0010\u00B3\u0001\u001A\t\u0012\u0004\u0012\u00020\u001A0\u009E\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u00B1\u0001\u0010\u00A0\u0001\u001A\u0006\b\u00B2\u0001\u0010\u00A2\u0001R1\u0010g\u001A\u000B\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u009E\u00018\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0018\n\u0006\b\u00B4\u0001\u0010\u00A0\u0001\u001A\u0006\b\u00B5\u0001\u0010\u00A2\u0001\"\u0006\b\u00B6\u0001\u0010\u00B7\u0001R#\u0010\u00BA\u0001\u001A\t\u0012\u0004\u0012\u00020]0\u009E\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u00B8\u0001\u0010\u00A0\u0001\u001A\u0006\b\u00B9\u0001\u0010\u00A2\u0001R%\u0010\u00BD\u0001\u001A\u000B\u0012\u0006\u0012\u0004\u0018\u00010H0\u009E\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u00BB\u0001\u0010\u00A0\u0001\u001A\u0006\b\u00BC\u0001\u0010\u00A2\u0001R#\u0010\u00C0\u0001\u001A\t\u0012\u0004\u0012\u00020o0\u008B\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u00BE\u0001\u0010\u008F\u0001\u001A\u0006\b\u00BF\u0001\u0010\u0091\u0001R%\u0010\u00C3\u0001\u001A\u000B\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u008B\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u00C1\u0001\u0010\u008F\u0001\u001A\u0006\b\u00C2\u0001\u0010\u0091\u0001R%\u0010\u00C6\u0001\u001A\u000B\u0012\u0006\u0012\u0004\u0018\u00010N0\u009E\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u00C4\u0001\u0010\u00A0\u0001\u001A\u0006\b\u00C5\u0001\u0010\u00A2\u0001R%\u0010\u00C9\u0001\u001A\u000B\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u008B\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u00C7\u0001\u0010\u008F\u0001\u001A\u0006\b\u00C8\u0001\u0010\u0091\u0001R%\u0010\u00CC\u0001\u001A\u000B\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u009E\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u00CA\u0001\u0010\u00A0\u0001\u001A\u0006\b\u00CB\u0001\u0010\u00A2\u0001R%\u0010\u00CF\u0001\u001A\u000B\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u009E\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u00CD\u0001\u0010\u00A0\u0001\u001A\u0006\b\u00CE\u0001\u0010\u00A2\u0001R$\u0010\u00D3\u0001\u001A\n\u0012\u0005\u0012\u00030\u00D0\u00010\u009E\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u00D1\u0001\u0010\u00A0\u0001\u001A\u0006\b\u00D2\u0001\u0010\u00A2\u0001R(\u0010\u00D7\u0001\u001A\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0015\n\u0005\b\u00D4\u0001\u0010\u007F\u001A\u0005\b\u00D5\u0001\u0010z\"\u0005\b\u00D6\u0001\u00109R#\u0010\u00D9\u0001\u001A\t\u0012\u0004\u0012\u00020\u001A0\u009E\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u00D8\u0001\u0010\u00A0\u0001\u001A\u0006\b\u00D9\u0001\u0010\u00A2\u0001R*\u0010\u00DC\u0001\u001A\u0010\u0012\u000B\u0012\t\u0012\u0004\u0012\u00020\u001D0\u008C\u00010\u009E\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u00DA\u0001\u0010\u00A0\u0001\u001A\u0006\b\u00DB\u0001\u0010\u00A2\u0001R*\u0010\u00DF\u0001\u001A\u0010\u0012\u000B\u0012\t\u0012\u0004\u0012\u00020\u001D0\u008C\u00010\u009E\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u00DD\u0001\u0010\u00A0\u0001\u001A\u0006\b\u00DE\u0001\u0010\u00A2\u0001R*\u0010\u00E2\u0001\u001A\u0010\u0012\u000B\u0012\t\u0012\u0004\u0012\u00020\u001D0\u008C\u00010\u009E\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u00E0\u0001\u0010\u00A0\u0001\u001A\u0006\b\u00E1\u0001\u0010\u00A2\u0001R&\u0010\u00E9\u0001\u001A\f\u0012\u0007\u0012\u0005\u0018\u00010\u00E4\u00010\u00E3\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u00E5\u0001\u0010\u00E6\u0001\u001A\u0006\b\u00E7\u0001\u0010\u00E8\u0001R#\u0010\u00EC\u0001\u001A\t\u0012\u0004\u0012\u00020\u001A0\u00E3\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u00EA\u0001\u0010\u00E6\u0001\u001A\u0006\b\u00EB\u0001\u0010\u00E8\u0001R+\u0010\u00F3\u0001\u001A\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0018\n\u0006\b\u00ED\u0001\u0010\u00EE\u0001\u001A\u0006\b\u00EF\u0001\u0010\u00F0\u0001\"\u0006\b\u00F1\u0001\u0010\u00F2\u0001R\"\u0010\u00F5\u0001\u001A\u0010\u0012\u000B\u0012\t\u0012\u0004\u0012\u00020\u001D0\u008C\u00010\u008B\u00018F\u00A2\u0006\b\u001A\u0006\b\u00F4\u0001\u0010\u0091\u0001R\"\u0010\u00F7\u0001\u001A\u0010\u0012\u000B\u0012\t\u0012\u0004\u0012\u00020o0\u008C\u00010\u008B\u00018F\u00A2\u0006\b\u001A\u0006\b\u00F6\u0001\u0010\u0091\u0001R\"\u0010\u00F9\u0001\u001A\u0010\u0012\u000B\u0012\t\u0012\u0004\u0012\u00020\u001D0\u008C\u00010\u008B\u00018F\u00A2\u0006\b\u001A\u0006\b\u00F8\u0001\u0010\u0091\u0001R\"\u0010\u00FB\u0001\u001A\u0010\u0012\u000B\u0012\t\u0012\u0004\u0012\u00020\u00160\u008C\u00010\u008B\u00018F\u00A2\u0006\b\u001A\u0006\b\u00FA\u0001\u0010\u0091\u0001R\"\u0010\u00FD\u0001\u001A\u0010\u0012\u000B\u0012\t\u0012\u0004\u0012\u00020\u001D0\u008C\u00010\u008B\u00018F\u00A2\u0006\b\u001A\u0006\b\u00FC\u0001\u0010\u0091\u0001R\"\u0010\u00FF\u0001\u001A\u0010\u0012\u000B\u0012\t\u0012\u0004\u0012\u00020\u001D0\u008C\u00010\u008B\u00018F\u00A2\u0006\b\u001A\u0006\b\u00FE\u0001\u0010\u0091\u0001R\"\u0010\u0081\u0002\u001A\u0010\u0012\u000B\u0012\t\u0012\u0004\u0012\u00020\u001D0\u008C\u00010\u008B\u00018F\u00A2\u0006\b\u001A\u0006\b\u0080\u0002\u0010\u0091\u0001R$\u0010\u0083\u0002\u001A\u0012\u0012\r\u0012\u000B\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u008C\u00010\u008B\u00018F\u00A2\u0006\b\u001A\u0006\b\u0082\u0002\u0010\u0091\u0001R\"\u0010\u0085\u0002\u001A\u0010\u0012\u000B\u0012\t\u0012\u0004\u0012\u00020o0\u008C\u00010\u008B\u00018F\u00A2\u0006\b\u001A\u0006\b\u0084\u0002\u0010\u0091\u0001R\"\u0010\u0087\u0002\u001A\u0010\u0012\u000B\u0012\t\u0012\u0004\u0012\u00020o0\u008C\u00010\u008B\u00018F\u00A2\u0006\b\u001A\u0006\b\u0086\u0002\u0010\u0091\u0001R$\u0010\u0089\u0002\u001A\u0012\u0012\r\u0012\u000B\u0012\u0006\u0012\u0004\u0018\u00010N0\u008C\u00010\u008B\u00018F\u00A2\u0006\b\u001A\u0006\b\u0088\u0002\u0010\u0091\u0001R\"\u0010\u008B\u0002\u001A\u0010\u0012\u000B\u0012\t\u0012\u0004\u0012\u00020\u001D0\u008C\u00010\u008B\u00018F\u00A2\u0006\b\u001A\u0006\b\u008A\u0002\u0010\u0091\u0001R\"\u0010\u008D\u0002\u001A\u0010\u0012\u000B\u0012\t\u0012\u0004\u0012\u00020\u001D0\u008C\u00010\u008B\u00018F\u00A2\u0006\b\u001A\u0006\b\u008C\u0002\u0010\u0091\u0001R\"\u0010\u008F\u0002\u001A\u0010\u0012\u000B\u0012\t\u0012\u0004\u0012\u00020\u00180\u008C\u00010\u008B\u00018F\u00A2\u0006\b\u001A\u0006\b\u008E\u0002\u0010\u0091\u0001R\"\u0010\u0091\u0002\u001A\u0010\u0012\u000B\u0012\t\u0012\u0004\u0012\u00020\u00180\u008C\u00010\u008B\u00018F\u00A2\u0006\b\u001A\u0006\b\u0090\u0002\u0010\u0091\u0001R\"\u0010\u0093\u0002\u001A\u0010\u0012\u000B\u0012\t\u0012\u0004\u0012\u00020\u001D0\u008C\u00010\u008B\u00018F\u00A2\u0006\b\u001A\u0006\b\u0092\u0002\u0010\u0091\u0001R\"\u0010\u0095\u0002\u001A\u0010\u0012\u000B\u0012\t\u0012\u0004\u0012\u00020\u001D0\u008C\u00010\u008B\u00018F\u00A2\u0006\b\u001A\u0006\b\u0094\u0002\u0010\u0091\u0001R\"\u0010\u0097\u0002\u001A\u0010\u0012\u000B\u0012\t\u0012\u0004\u0012\u00020\u001D0\u008C\u00010\u008B\u00018F\u00A2\u0006\b\u001A\u0006\b\u0096\u0002\u0010\u0091\u0001R\"\u0010\u0099\u0002\u001A\u0010\u0012\u000B\u0012\t\u0012\u0004\u0012\u00020\u001D0\u008C\u00010\u008B\u00018F\u00A2\u0006\b\u001A\u0006\b\u0098\u0002\u0010\u0091\u0001R\"\u0010\u009B\u0002\u001A\u0010\u0012\u000B\u0012\t\u0012\u0004\u0012\u00020\u001D0\u008C\u00010\u008B\u00018F\u00A2\u0006\b\u001A\u0006\b\u009A\u0002\u0010\u0091\u0001R\"\u0010\u009D\u0002\u001A\u0010\u0012\u000B\u0012\t\u0012\u0004\u0012\u00020/0\u008C\u00010\u008B\u00018F\u00A2\u0006\b\u001A\u0006\b\u009C\u0002\u0010\u0091\u0001R\"\u0010\u009F\u0002\u001A\u0010\u0012\u000B\u0012\t\u0012\u0004\u0012\u00020/0\u008C\u00010\u008B\u00018F\u00A2\u0006\b\u001A\u0006\b\u009E\u0002\u0010\u0091\u0001R1\u0010\u00A1\u0002\u001A\u001F\u0012\u001A\u0012\u0018\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020o\u0012\u0004\u0012\u00020o\u0018\u00010\u008D\u00010\u008C\u00010\u008B\u00018F\u00A2\u0006\b\u001A\u0006\b\u00A0\u0002\u0010\u0091\u0001R#\u0010\u00A4\u0002\u001A\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u00A2\u00020\u008C\u00010\u008B\u00018F\u00A2\u0006\b\u001A\u0006\b\u00A3\u0002\u0010\u0091\u0001\u00A8\u0006\u00A8\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/EditorViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/domain/repository/EntryRepository;", "entryRepository", "Lcom/kakao/tistory/domain/repository/EntryFileRepository;", "entryFileRepository", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "Lcom/kakao/tistory/domain/repository/AutoSaveRepository;", "autoSaveRepository", "Lcom/kakao/tistory/domain/repository/GrammarRepository;", "grammarRepository", "Lcom/kakao/tistory/domain/usecase/GetEditableEntryUseCase;", "getEditableEntryUseCase", "Lcom/kakao/tistory/domain/usecase/GetLatestEditEntryUseCase;", "getLatestEditEntryUseCase", "Lcom/kakao/tistory/domain/usecase/GetMyBlogUseCase;", "getMyBlogUseCase", "Lcom/kakao/tistory/domain/usecase/GetChallengeRequirementsUseCase;", "getChallengeRequirementsUseCase", "<init>", "(Lcom/kakao/tistory/domain/repository/EntryRepository;Lcom/kakao/tistory/domain/repository/EntryFileRepository;Lcom/kakao/tistory/domain/repository/AccountRepository;Lcom/kakao/tistory/domain/repository/AutoSaveRepository;Lcom/kakao/tistory/domain/repository/GrammarRepository;Lcom/kakao/tistory/domain/usecase/GetEditableEntryUseCase;Lcom/kakao/tistory/domain/usecase/GetLatestEditEntryUseCase;Lcom/kakao/tistory/domain/usecase/GetMyBlogUseCase;Lcom/kakao/tistory/domain/usecase/GetChallengeRequirementsUseCase;)V", "", "blogName", "", "entryId", "", "isOpenLatestEdit", "needLoadEntry", "", "init", "(Ljava/lang/String;Ljava/lang/Long;ZZ)V", "Lcom/kakao/keditor/plugin/itemspec/opengraph/OpenGraphItem;", "item", "Lkotlin/Function1;", "callback", "loadOpenGraphSync", "(Lcom/kakao/keditor/plugin/itemspec/opengraph/OpenGraphItem;Lkotlin/jvm/functions/Function1;)V", "checkString", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/GrammarCheck;", "checkGrammar", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/keditor/KeditorView;", "keditorView", "setKediorView", "(Lcom/kakao/keditor/KeditorView;)V", "Lcom/kakao/tistory/domain/entity/entry/DraftItem;", "draftItem", "loadDraft", "(Lcom/kakao/tistory/domain/entity/entry/DraftItem;)V", "loadDraftCMD", "sequence", "resetDraftItem", "(J)V", "draftTitle", "setTitleString", "(Ljava/lang/String;)V", "onClickDraftButton", "()V", "cancelMediaUpload", "onClickToolbarRightButton", "uploadPost", "onClickCamera", "Lcom/kakao/tistory/domain/entity/SortItem;", "sortItem", "onClickBottomDialogItem", "(Lcom/kakao/tistory/domain/entity/SortItem;)V", "onClickCategorySelect", "deleteThumbnailImage", "imageUrl", "onClickChangeImage", "Lcom/kakao/tistory/domain/entity/CategoryItem;", "selectCategoryItem", "(Lcom/kakao/tistory/domain/entity/CategoryItem;)V", "isClick", "onClickDaumLikeSelect", "(Z)V", "Lcom/kakao/tistory/domain/entity/entry/DaumLikeItem;", "selectDaumLikeCategoryItem", "(Lcom/kakao/tistory/domain/entity/entry/DaumLikeItem;)V", "onClickPublished", "reservedType", "onClickPublishNow", "onClickPublishReserve", "onClickReserveCalendar", "onClickReserveTime", "onClickEditTag", "", "list", "updateTagList", "(Ljava/util/List;)V", "onClickChallenge", "Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;", "visibilityType", "onClickChangeVisibility", "(Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;)V", "onClickPassword", "Landroid/view/View;", "view", "hasFocus", "onFocusChangeTitle", "(Landroid/view/View;Z)V", "password", "setEntryPassword", "isAcceptComment", "commentAcceptChanged", "onClickCopyPassword", "onClosedClicked", "onClickBack", "()Z", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "handleActivityResult", "(IILandroid/content/Intent;)V", "runAutoSaving", "onClickModifyAlertOk", "clearAutoSaved", "keditorExportToJson", "()Ljava/lang/String;", "gsonString", "loadKeditor", "<set-?>", "p", "Ljava/lang/String;", "getBlogName", "q", "J", "getEntryId", "()J", "Lcom/kakao/tistory/domain/entity/Blog;", "r", "Lcom/kakao/tistory/domain/entity/Blog;", "getBlog", "()Lcom/kakao/tistory/domain/entity/Blog;", "blog", "Landroidx/lifecycle/LiveData;", "Lcom/kakao/tistory/presentation/common/extension/Event;", "Lkotlin/Pair;", "v", "Landroidx/lifecycle/LiveData;", "getShowUploadFailStringDialog", "()Landroidx/lifecycle/LiveData;", "showUploadFailStringDialog", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "Lcom/kakao/tistory/domain/entity/entry/ChallengeResult;", "x", "getOnPublishEntry", "onPublishEntry", "U", "getShowChallengeCategoryDialog", "showChallengeCategoryDialog", "W", "getShowNotMyBlogDialog", "showNotMyBlogDialog", "Landroidx/lifecycle/MutableLiveData;", "a0", "Landroidx/lifecycle/MutableLiveData;", "getTitleFocus", "()Landroidx/lifecycle/MutableLiveData;", "titleFocus", "Lcom/kakao/tistory/presentation/viewmodel/EditorViewModel$EditorMode;", "b0", "getEditorMode", "editorMode", "c0", "getDraftEnable", "draftEnable", "d0", "getTitleString", "titleString", "e0", "getTagList", "tagList", "f0", "getCommentPermit", "commentPermit", "g0", "getPassword", "setPassword", "(Landroidx/lifecycle/MutableLiveData;)V", "h0", "getEntryVisibilityType", "entryVisibilityType", "i0", "getCategoryItem", "categoryItem", "j0", "getCategoryVisibility", "categoryVisibility", "k0", "getCategoryName", "categoryName", "l0", "getDaumLikeItem", "daumLikeItem", "m0", "getDaumLikeName", "daumLikeName", "n0", "getCoverImageUrl", "coverImageUrl", "o0", "getReserverTime", "reserverTime", "Lcom/kakao/tistory/presentation/viewmodel/EditorViewModel$ReservedType;", "p0", "getReserveType", "reserveType", "q0", "getReservedOrPublishedDate", "setReservedOrPublishedDate", "reservedOrPublishedDate", "r0", "isCompleteLoad", "u0", "getTrackPageViewEdit", "trackPageViewEdit", "v0", "getTrackPageViewSetting", "trackPageViewSetting", "w0", "getTrackPageViewTag", "trackPageViewTag", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/kakao/tistory/presentation/editor/contract/EditorChallenge;", "z0", "Lkotlinx/coroutines/flow/StateFlow;", "getChallenge", "()Lkotlinx/coroutines/flow/StateFlow;", "challenge", "A0", "getNeedChallengeValidation", "needChallengeValidation", "B0", "Ljava/lang/Long;", "getPublishedTime", "()Ljava/lang/Long;", "setPublishedTime", "(Ljava/lang/Long;)V", "publishedTime", "getShowJsonExceptionDialog", "showJsonExceptionDialog", "getShowUploadFailDialog", "showUploadFailDialog", "getFinishEditor", "finishEditor", "getCanNotEditEntry", "canNotEditEntry", "getCompleteEditTag", "completeEditTag", "getErrorNoTitle", "errorNoTitle", "getEntryModifyAlert", "entryModifyAlert", "getShowPasswordDialog", "showPasswordDialog", "getShowToast", "showToast", "getShowBlogCategoryDialog", "showBlogCategoryDialog", "getShowDaumCategoryDialog", "showDaumCategoryDialog", "getShowCameraBottomDialog", "showCameraBottomDialog", "getGoToPhotoPicker", "goToPhotoPicker", "getShowCalendarDialog", "showCalendarDialog", "getShowTimePickerDialog", "showTimePickerDialog", "getDeleteThumbnailDialog", "deleteThumbnailDialog", "getSaveDraftComplete", "saveDraftComplete", "getErrorDraftNoTitleOrContent", "errorDraftNoTitleOrContent", "getLoadDraftComplete", "loadDraftComplete", "getLoadDraftDuplicated", "loadDraftDuplicated", "getRequestLoadModifiedEntry", "requestLoadModifiedEntry", "getRequestLoadDraft", "requestLoadDraft", "getShowUploadLoading", "showUploadLoading", "Lcom/kakao/tistory/domain/entity/common/RegulationLink;", "getShowRegulationErrorEvent", "showRegulationErrorEvent", "ButtonMode", "EditorMode", "ReservedType", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEditorViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/EditorViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1413:1\n1#2:1414\n*E\n"})
public final class EditorViewModel extends TistoryViewModel {
    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000E\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u0017\u0010\u000F\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001A\u0004\b\u000E\u0010\u000BR\u0017\u0010\u0012\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\t\u001A\u0004\b\u0011\u0010\u000BR\u0017\u0010\u0018\u001A\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017j\u0002\b\u0019j\u0002\b\u001A¨\u0006\u001B"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/EditorViewModel$ButtonMode;", "", "", "a", "Ljava/lang/Integer;", "getTitleStringId", "()Ljava/lang/Integer;", "titleStringId", "b", "I", "getTextColor", "()I", "textColor", "c", "getButtonBackground", "buttonBackground", "d", "getBackButtonImage", "backButtonImage", "", "e", "Ljava/lang/String;", "getContentDescription", "()Ljava/lang/String;", "contentDescription", "COMPLETE", "PUBLISH", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ButtonMode extends Enum {
        public static final enum ButtonMode COMPLETE;
        public static final enum ButtonMode PUBLISH;
        public final Integer a;
        public final int b;
        public final int c;
        public final int d;
        public final String e;
        public static final ButtonMode[] f;
        public static final EnumEntries g;

        static {
            Context context3;
            Context context1;
            Integer integer0 = string.label_complete;
            int v = color.gray1;
            int v1 = drawable.selector_button_fff_pressed_f5_border_d0_rounded_18dp;
            int v2 = drawable.ic_navi_close_b;
            Context context0 = BaseKt.appContext;
            if(context0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appContext");
                context1 = null;
            }
            else {
                context1 = context0;
            }
            String s = context1.getString(string.content_desc_close);
            if(s == null) {
                NullPointerException nullPointerException0 = new NullPointerException("getString(...) must not be null");
                Intrinsics.b(nullPointerException0, "kotlin.jvm.internal.Intrinsics");
                throw nullPointerException0;
            }
            ButtonMode.COMPLETE = new ButtonMode("COMPLETE", 0, integer0, v, v1, v2, s);
            Integer integer1 = string.label_publish;
            int v3 = color.white;
            int v4 = drawable.selector_button_gray1_pressed_gray5_rounded_18dp;
            int v5 = drawable.ic_navi_back_b;
            Context context2 = BaseKt.appContext;
            if(context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appContext");
                context3 = null;
            }
            else {
                context3 = context2;
            }
            String s1 = context3.getString(string.content_desc_back);
            if(s1 == null) {
                NullPointerException nullPointerException1 = new NullPointerException("getString(...) must not be null");
                Intrinsics.b(nullPointerException1, "kotlin.jvm.internal.Intrinsics");
                throw nullPointerException1;
            }
            ButtonMode.PUBLISH = new ButtonMode("PUBLISH", 1, integer1, v3, v4, v5, s1);
            ButtonMode[] arr_editorViewModel$ButtonMode = {ButtonMode.COMPLETE, ButtonMode.PUBLISH};
            ButtonMode.f = arr_editorViewModel$ButtonMode;
            Intrinsics.checkNotNullParameter(arr_editorViewModel$ButtonMode, "entries");
            ButtonMode.g = new a(arr_editorViewModel$ButtonMode);
        }

        public ButtonMode(String s, int v, Integer integer0, int v1, int v2, int v3, String s1) {
            super(s, v);
            this.a = integer0;
            this.b = v1;
            this.c = v2;
            this.d = v3;
            this.e = s1;
        }

        public final int getBackButtonImage() {
            return this.d;
        }

        public final int getButtonBackground() {
            return this.c;
        }

        @NotNull
        public final String getContentDescription() {
            return this.e;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return ButtonMode.g;
        }

        public final int getTextColor() {
            return this.b;
        }

        @Nullable
        public final Integer getTitleStringId() {
            return this.a;
        }

        public static ButtonMode valueOf(String s) {
            return (ButtonMode)Enum.valueOf(ButtonMode.class, s);
        }

        public static ButtonMode[] values() {
            return (ButtonMode[])ButtonMode.f.clone();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u000B\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u0017\u0010\u0013\u001A\u00020\u000E8\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001A\u00020\u000E8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001A\u0004\b\u0015\u0010\u0012j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/EditorViewModel$EditorMode;", "", "", "a", "Ljava/lang/Integer;", "getTitleStringId", "()Ljava/lang/Integer;", "titleStringId", "Lcom/kakao/tistory/presentation/viewmodel/EditorViewModel$ButtonMode;", "b", "Lcom/kakao/tistory/presentation/viewmodel/EditorViewModel$ButtonMode;", "getButtonMode", "()Lcom/kakao/tistory/presentation/viewmodel/EditorViewModel$ButtonMode;", "buttonMode", "", "c", "Ljava/lang/String;", "getPage", "()Ljava/lang/String;", "page", "section", "getSection", "EDIT_MODE", "SETTING_MODE", "EDIT_TAG_MODE", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum EditorMode {
        EDIT_MODE(null, ButtonMode.COMPLETE, "에디터"),
        SETTING_MODE(string.label_editor_setting_title, ButtonMode.PUBLISH, "발행설정"),
        EDIT_TAG_MODE(string.label_editor_setting_tag_title, ButtonMode.COMPLETE, "태그입력");

        public final Integer a;
        public final ButtonMode b;
        public final String c;
        public static final EditorMode[] d;
        public static final EnumEntries e;

        static {
            EditorMode.d = arr_editorViewModel$EditorMode;
            Intrinsics.checkNotNullParameter(arr_editorViewModel$EditorMode, "entries");
            EditorMode.e = new a(arr_editorViewModel$EditorMode);
        }

        public EditorMode(Integer integer0, ButtonMode editorViewModel$ButtonMode0, String s1) {
            this.a = integer0;
            this.b = editorViewModel$ButtonMode0;
            this.c = s1;
        }

        @NotNull
        public final ButtonMode getButtonMode() {
            return this.b;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return EditorMode.e;
        }

        @NotNull
        public final String getPage() {
            return this.c;
        }

        @NotNull
        public final String getSection() {
            return "에디터";
        }

        @Nullable
        public final Integer getTitleStringId() {
            return this.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/EditorViewModel$ReservedType;", "", "PUBLISHED", "PUBLISH_NOW", "RESERVE", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum ReservedType {
        PUBLISHED,
        PUBLISH_NOW,
        RESERVE;

        public static final ReservedType[] a;
        public static final EnumEntries b;

        static {
            ReservedType.a = arr_editorViewModel$ReservedType;
            Intrinsics.checkNotNullParameter(arr_editorViewModel$ReservedType, "entries");
            ReservedType.b = new a(arr_editorViewModel$ReservedType);
        }

        @NotNull
        public static EnumEntries getEntries() {
            return ReservedType.b;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;

        static {
            int[] arr_v = new int[EditorMode.values().length];
            try {
                arr_v[EditorMode.EDIT_MODE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[EditorMode.SETTING_MODE.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[EditorMode.EDIT_TAG_MODE.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
            int[] arr_v1 = new int[ReservedType.values().length];
            try {
                arr_v1[ReservedType.RESERVE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[ReservedType.PUBLISHED.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[ReservedType.PUBLISH_NOW.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$1 = arr_v1;
        }
    }

    public static final int $stable = 8;
    public final MutableLiveData A;
    public final StateFlow A0;
    public final MutableLiveData B;
    public Long B0;
    public final MutableLiveData C;
    public Job C0;
    public final MutableLiveData D;
    public boolean D0;
    public final MutableLiveData E;
    public final CompletableJob E0;
    public final MutableLiveData F;
    public final u0 F0;
    public final MutableLiveData G;
    public final s0 G0;
    public final MutableLiveData H;
    public final MutableLiveData I;
    public final MutableLiveData J;
    public final MutableLiveData K;
    public final MutableLiveData L;
    public final MutableLiveData M;
    public final MutableLiveData N;
    public final MutableLiveData O;
    public final MutableLiveData P;
    public final MutableLiveData Q;
    public final MutableLiveData R;
    public final MutableLiveData S;
    public final MutableLiveData T;
    public final LiveData U;
    public final MutableLiveData V;
    public final LiveData W;
    public Long X;
    public DraftItem Y;
    public EditEntryEntity Z;
    public final MutableLiveData a0;
    public final MutableLiveData b0;
    public final MutableLiveData c0;
    public final MutableLiveData d0;
    public final MutableLiveData e0;
    public final MutableLiveData f0;
    public final EntryRepository g;
    public MutableLiveData g0;
    public final EntryFileRepository h;
    public final MutableLiveData h0;
    public final AccountRepository i;
    public final MutableLiveData i0;
    public final AutoSaveRepository j;
    public final LiveData j0;
    public final GrammarRepository k;
    public final LiveData k0;
    public final GetEditableEntryUseCase l;
    public final MutableLiveData l0;
    public final GetLatestEditEntryUseCase m;
    public final LiveData m0;
    public final GetMyBlogUseCase n;
    public final MutableLiveData n0;
    public final GetChallengeRequirementsUseCase o;
    public final MutableLiveData o0;
    public String p;
    public final MutableLiveData p0;
    public long q;
    public String q0;
    public Blog r;
    public final MutableLiveData r0;
    public KeditorView s;
    public final long s0;
    public final MutableLiveData t;
    public final ArrayList t0;
    public final MutableLiveData u;
    public final MutableLiveData u0;
    public final LiveData v;
    public final MutableLiveData v0;
    public final MutableLiveData w;
    public final MutableLiveData w0;
    public final LiveData x;
    public final MutableLiveData x0;
    public final MutableLiveData y;
    public final MutableStateFlow y0;
    public final MutableLiveData z;
    public final StateFlow z0;

    @Inject
    public EditorViewModel(@NotNull EntryRepository entryRepository0, @NotNull EntryFileRepository entryFileRepository0, @NotNull AccountRepository accountRepository0, @NotNull AutoSaveRepository autoSaveRepository0, @NotNull GrammarRepository grammarRepository0, @NotNull GetEditableEntryUseCase getEditableEntryUseCase0, @NotNull GetLatestEditEntryUseCase getLatestEditEntryUseCase0, @NotNull GetMyBlogUseCase getMyBlogUseCase0, @NotNull GetChallengeRequirementsUseCase getChallengeRequirementsUseCase0) {
        Intrinsics.checkNotNullParameter(entryRepository0, "entryRepository");
        Intrinsics.checkNotNullParameter(entryFileRepository0, "entryFileRepository");
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        Intrinsics.checkNotNullParameter(autoSaveRepository0, "autoSaveRepository");
        Intrinsics.checkNotNullParameter(grammarRepository0, "grammarRepository");
        Intrinsics.checkNotNullParameter(getEditableEntryUseCase0, "getEditableEntryUseCase");
        Intrinsics.checkNotNullParameter(getLatestEditEntryUseCase0, "getLatestEditEntryUseCase");
        Intrinsics.checkNotNullParameter(getMyBlogUseCase0, "getMyBlogUseCase");
        Intrinsics.checkNotNullParameter(getChallengeRequirementsUseCase0, "getChallengeRequirementsUseCase");
        super();
        this.g = entryRepository0;
        this.h = entryFileRepository0;
        this.i = accountRepository0;
        this.j = autoSaveRepository0;
        this.k = grammarRepository0;
        this.l = getEditableEntryUseCase0;
        this.m = getLatestEditEntryUseCase0;
        this.n = getMyBlogUseCase0;
        this.o = getChallengeRequirementsUseCase0;
        this.p = "";
        this.t = new MutableLiveData();
        this.u = new MutableLiveData();
        this.v = LiveDataExtensionKt.asLiveData(new MutableLiveData());
        MutableLiveData mutableLiveData0 = new MutableLiveData();
        this.w = mutableLiveData0;
        this.x = LiveDataExtensionKt.asLiveData(mutableLiveData0);
        this.y = new MutableLiveData();
        this.z = new MutableLiveData();
        this.A = new MutableLiveData();
        this.B = new MutableLiveData();
        this.C = new MutableLiveData();
        this.D = new MutableLiveData();
        this.E = new MutableLiveData();
        this.F = new MutableLiveData();
        this.G = new MutableLiveData();
        this.H = new MutableLiveData();
        this.I = new MutableLiveData();
        this.J = new MutableLiveData();
        this.K = new MutableLiveData();
        this.L = new MutableLiveData();
        this.M = new MutableLiveData();
        this.N = new MutableLiveData();
        this.O = new MutableLiveData();
        this.P = new MutableLiveData();
        this.Q = new MutableLiveData();
        this.R = new MutableLiveData();
        this.S = new MutableLiveData();
        MutableLiveData mutableLiveData1 = new MutableLiveData();
        this.T = mutableLiveData1;
        this.U = LiveDataExtensionKt.asLiveData(mutableLiveData1);
        MutableLiveData mutableLiveData2 = new MutableLiveData();
        this.V = mutableLiveData2;
        this.W = LiveDataExtensionKt.asLiveData(mutableLiveData2);
        this.a0 = new MutableLiveData();
        this.b0 = new MutableLiveData();
        this.c0 = new MutableLiveData();
        this.d0 = new MutableLiveData();
        MutableLiveData mutableLiveData3 = new MutableLiveData();
        this.e0 = mutableLiveData3;
        MutableLiveData mutableLiveData4 = new MutableLiveData();
        this.f0 = mutableLiveData4;
        this.g0 = new MutableLiveData();
        MutableLiveData mutableLiveData5 = new MutableLiveData();
        this.h0 = mutableLiveData5;
        MutableLiveData mutableLiveData6 = new MutableLiveData();
        this.i0 = mutableLiveData6;
        this.j0 = Transformations.map(mutableLiveData6, j0.a);
        this.k0 = Transformations.map(mutableLiveData6, i0.a);
        MutableLiveData mutableLiveData7 = new MutableLiveData();
        this.l0 = mutableLiveData7;
        this.m0 = Transformations.map(mutableLiveData7, n0.a);
        this.n0 = new MutableLiveData();
        MutableLiveData mutableLiveData8 = new MutableLiveData();
        this.o0 = mutableLiveData8;
        MutableLiveData mutableLiveData9 = new MutableLiveData();
        this.p0 = mutableLiveData9;
        this.r0 = new MutableLiveData();
        this.s0 = 1L;
        this.t0 = new ArrayList();
        this.u0 = new MutableLiveData();
        this.v0 = new MutableLiveData();
        this.w0 = new MutableLiveData();
        this.x0 = new MutableLiveData();
        MutableStateFlow mutableStateFlow0 = StateFlowKt.MutableStateFlow(null);
        this.y0 = mutableStateFlow0;
        StateFlow stateFlow0 = FlowKt.asStateFlow(mutableStateFlow0);
        this.z0 = stateFlow0;
        this.A0 = FlowKt.stateIn(FlowKt.combine(stateFlow0, FlowLiveDataConversions.asFlow(mutableLiveData3), new f1(null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.getEagerly(), Boolean.FALSE);
        this.E0 = JobKt.Job$default(null, 1, null);
        mutableLiveData6.setValue(null);
        this.a(EditorMode.EDIT_MODE);
        mutableLiveData5.setValue(EntryVisibilityType.PUBLIC);
        mutableLiveData8.setValue(Calendar.getInstance().getTimeInMillis());
        mutableLiveData9.setValue(ReservedType.PUBLISH_NOW);
        mutableLiveData4.setValue(Boolean.TRUE);
        mutableLiveData3.setValue(CollectionsKt__CollectionsKt.emptyList());
        mutableLiveData7.setValue(null);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new v0(this, null), 3, null);
        this.F0 = new u0(this);
        this.G0 = new s0(this);
    }

    public final void a(EditEntryEntity editEntryEntity0) {
        EntryVisibilityType entryVisibilityType0;
        Unit unit0;
        this.Z = editEntryEntity0;
        EntryKeyEntity entryKeyEntity0 = editEntryEntity0.getKey();
        this.q = entryKeyEntity0.getEntryId();
        this.X = entryKeyEntity0.getDraftSequence();
        boolean z = false;
        this.c0.postValue(Boolean.valueOf(Long.compare(entryKeyEntity0.getEntryId(), 0L) == 0));
        EntryEntity entryEntity0 = editEntryEntity0.getEntry();
        this.setTitleString(entryEntity0.getTitle());
        this.n0.setValue(entryEntity0.getThumbnail());
        Logger.INSTANCE.log("gsonString " + entryEntity0.getPostJson() + " ");
        this.loadKeditor(entryEntity0.getPostJson());
        EntrySettingEntity entrySettingEntity0 = editEntryEntity0.getSetting();
        MutableLiveData mutableLiveData0 = this.f0;
        if(entrySettingEntity0.getCommentPermit() == 1) {
            z = true;
        }
        mutableLiveData0.postValue(Boolean.valueOf(z));
        Long long0 = entrySettingEntity0.getPublished();
        this.B0 = long0;
        Long long1 = long0 == null ? null : TimeUnit.SECONDS.toMillis(long0.longValue());
        if(entrySettingEntity0.getReserveType() == null && long1 != null) {
            this.p0.setValue((((long)long1) <= System.currentTimeMillis() ? ReservedType.PUBLISHED : ReservedType.RESERVE));
        }
        else if(entrySettingEntity0.getReserveType() != null) {
            String s = entrySettingEntity0.getReserveType();
            this.p0.setValue((s == null ? null : ReservedType.valueOf(s)));
        }
        if(entrySettingEntity0.getReserveTime() == null && long1 != null) {
            this.o0.setValue(long1);
        }
        else if(entrySettingEntity0.getReserveTime() != null) {
            Long long2 = entrySettingEntity0.getReserveTime();
            if(long2 != null) {
                this.o0.setValue(long2.longValue());
            }
        }
        if(long1 != null) {
            Date date0 = new Date();
            date0.setTime(long1.longValue());
            this.q0 = DateUtils.INSTANCE.getDateFormat(date0, "yyyy. M. d. HH:mm");
        }
        this.e0.postValue((entrySettingEntity0.getTags() == null ? CollectionsKt__CollectionsKt.emptyList() : entrySettingEntity0.getTags()));
        Integer integer0 = entrySettingEntity0.getCategoryId();
        if(integer0 == null) {
            unit0 = null;
        }
        else {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new x0(this, integer0.intValue(), null), 3, null);
            unit0 = Unit.INSTANCE;
        }
        if(unit0 == null) {
            this.i0.postValue(null);
        }
        Integer integer1 = entrySettingEntity0.getDaumLikeId();
        this.l0.postValue(new DaumLikeItem((integer1 == null ? -3 : ((int)integer1)), entrySettingEntity0.getDaumLikeName(), false, null, 12, null));
        String s1 = entrySettingEntity0.getVisibility();
        if(s1 == null) {
            entryVisibilityType0 = EntryVisibilityType.PUBLIC;
        }
        else {
            entryVisibilityType0 = EntryVisibilityType.valueOf(s1);
            if(entryVisibilityType0 == null) {
                entryVisibilityType0 = EntryVisibilityType.PUBLIC;
            }
        }
        this.h0.postValue(entryVisibilityType0);
        this.g0.postValue(entrySettingEntity0.getPasswordString());
    }

    public final void a(EditorMode editorViewModel$EditorMode0) {
        this.b0.setValue(editorViewModel$EditorMode0);
        this.c0.setValue(Boolean.valueOf(editorViewModel$EditorMode0 == EditorMode.EDIT_MODE && this.q == 0L));
        if(!this.t0.contains(editorViewModel$EditorMode0)) {
            this.t0.add(editorViewModel$EditorMode0);
            switch(WhenMappings.$EnumSwitchMapping$0[editorViewModel$EditorMode0.ordinal()]) {
                case 1: {
                    Event event2 = new Event(Unit.INSTANCE);
                    this.u0.setValue(event2);
                    break;
                }
                case 2: {
                    Event event0 = new Event(Unit.INSTANCE);
                    this.v0.setValue(event0);
                    return;
                }
                case 3: {
                    Event event1 = new Event(Unit.INSTANCE);
                    this.w0.setValue(event1);
                }
            }
        }
    }

    public final void a(String s) {
        Integer integer1;
        Integer integer0;
        long v;
        Object object0 = this.d0.getValue();
        if(((String)object0) == null) {
            return;
        }
        EntryVisibilityType entryVisibilityType0 = (EntryVisibilityType)this.h0.getValue();
        if(entryVisibilityType0 == null) {
            entryVisibilityType0 = EntryVisibilityType.PUBLIC;
        }
        Intrinsics.checkNotNull(entryVisibilityType0);
        Boolean boolean0 = (Boolean)this.f0.getValue();
        if(boolean0 == null) {
            boolean0 = Boolean.TRUE;
        }
        boolean z = boolean0.booleanValue();
        ReservedType editorViewModel$ReservedType0 = (ReservedType)this.p0.getValue();
        switch((editorViewModel$ReservedType0 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[editorViewModel$ReservedType0.ordinal()])) {
            case 1: {
                Long long0 = (Long)this.o0.getValue();
                v = long0 == null ? this.s0 : TimeUnit.MILLISECONDS.toSeconds(((long)long0));
                break;
            }
            case 2: {
                v = 0L;
                break;
            }
            case 3: {
                v = this.s0;
                break;
            }
            default: {
                v = this.s0;
            }
        }
        CategoryItem categoryItem0 = (CategoryItem)this.i0.getValue();
        KeditorView keditorView0 = null;
        if(categoryItem0 != null && categoryItem0.getId() == -3) {
            integer0 = null;
        }
        else {
            CategoryItem categoryItem1 = (CategoryItem)this.i0.getValue();
            integer0 = categoryItem1 == null ? null : categoryItem1.getId();
        }
        Object object1 = this.e0.getValue();
        DaumLikeItem daumLikeItem0 = (DaumLikeItem)this.l0.getValue();
        if(daumLikeItem0 == null) {
            integer1 = null;
        }
        else {
            if(entryVisibilityType0 != EntryVisibilityType.PUBLIC) {
                daumLikeItem0 = null;
            }
            integer1 = daumLikeItem0 == null ? null : daumLikeItem0.getId();
        }
        Object object2 = this.g0.getValue();
        KeditorView keditorView1 = this.s;
        if(keditorView1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keditor");
        }
        else {
            keditorView0 = keditorView1;
        }
        String s1 = keditorView0.exportToJson();
        Object object3 = this.e0.getValue();
        Logger.INSTANCE.log("titile : " + ((String)object0) + ", visibility : " + entryVisibilityType0 + ", acceptComment : " + z + ", cdm " + s1 + ", tagString: " + object3);
        long v1 = this.q;
        if(v1 == 0L) {
            String s2 = this.p;
            Long long1 = this.X;
            this.isShowProgress().setValue(Boolean.TRUE);
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new m0(this, z, s2, long1, ((String)object0), integer0, entryVisibilityType0, s1, ((String)object2), v, s, ((List)object1), integer1, null), 3, null);
            return;
        }
        String s3 = this.p;
        this.isShowProgress().setValue(Boolean.TRUE);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new e1(this, z, s3, v1, ((String)object0), integer0, entryVisibilityType0, s1, ((String)object2), v, s, ((List)object1), integer1, null), 3, null);
    }

    public final void a(Function1 function10) {
        String s = (String)this.n0.getValue();
        if(s == null) {
            function10.invoke(null);
            return;
        }
        if(p.startsWith(s, "http", true)) {
            function10.invoke(s);
            return;
        }
        Logger.INSTANCE.log("file upload " + s);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new l1(this, s, function10, null), 3, null);
    }

    public final boolean a() {
        if(this.Z != null && this.Z.getFromLocal()) {
            return true;
        }
        if((this.X == null || ((long)this.X) != 0L) && this.X != null) {
            if(Intrinsics.areEqual((this.Y == null ? null : this.Y.getTitle()), this.d0.getValue())) {
                goto label_13;
            }
            return true;
        }
        if(this.q != 0L) {
            EditEntryEntity editEntryEntity0 = this.Z;
            if(editEntryEntity0 != null) {
                EntryEntity entryEntity0 = editEntryEntity0.getEntry();
                if(Intrinsics.areEqual((entryEntity0 == null ? null : entryEntity0.getTitle()), this.d0.getValue())) {
                    goto label_13;
                }
                return true;
            }
        }
        CharSequence charSequence0 = (CharSequence)this.d0.getValue();
        if(charSequence0 == null || charSequence0.length() == 0) {
        label_13:
            KeditorView keditorView0 = this.s;
            if(keditorView0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("keditor");
                throw new NullPointerException();
            }
            return keditorView0.isModified();
        }
        return true;
    }

    public static final void access$editorPreExport(EditorViewModel editorViewModel0, Function0 function00) {
        editorViewModel0.getClass();
        p0 p00 = new p0(editorViewModel0, function00);
        Job job0 = editorViewModel0.C0;
        if(job0 != null) {
            DefaultImpls.cancel$default(job0, null, 1, null);
        }
        editorViewModel0.C0 = BuildersKt.launch$default(ViewModelKt.getViewModelScope(editorViewModel0), Dispatchers.getDefault(), null, new k0(editorViewModel0, p00, null), 2, null);
    }

    public static final EntryEntity access$makePostEntity(EditorViewModel editorViewModel0) {
        String s = (String)editorViewModel0.d0.getValue();
        KeditorView keditorView0 = editorViewModel0.s;
        if(keditorView0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keditor");
            keditorView0 = null;
        }
        return new EntryEntity(s, keditorView0.exportToJson(), ((String)editorViewModel0.n0.getValue()));
    }

    public static final EntrySettingEntity access$makeSettingEntity(EditorViewModel editorViewModel0) {
        EntryVisibilityType entryVisibilityType0 = (EntryVisibilityType)editorViewModel0.h0.getValue();
        if(entryVisibilityType0 == null) {
            entryVisibilityType0 = EntryVisibilityType.PUBLIC;
        }
        String s = entryVisibilityType0.toString();
        Object object0 = editorViewModel0.e0.getValue();
        boolean z = Intrinsics.areEqual(editorViewModel0.f0.getValue(), Boolean.FALSE);
        CategoryItem categoryItem0 = (CategoryItem)editorViewModel0.i0.getValue();
        Integer integer0 = categoryItem0 == null ? null : categoryItem0.getId();
        CategoryItem categoryItem1 = (CategoryItem)editorViewModel0.i0.getValue();
        String s1 = categoryItem1 == null ? null : categoryItem1.getName();
        DaumLikeItem daumLikeItem0 = (DaumLikeItem)editorViewModel0.l0.getValue();
        Integer integer1 = daumLikeItem0 == null ? null : daumLikeItem0.getId();
        DaumLikeItem daumLikeItem1 = (DaumLikeItem)editorViewModel0.l0.getValue();
        return daumLikeItem1 == null ? new EntrySettingEntity(s, ((List)object0), !z, String.valueOf(editorViewModel0.p0.getValue()), ((Long)editorViewModel0.o0.getValue()), integer0, s1, integer1, null, ((String)editorViewModel0.g0.getValue()), editorViewModel0.B0, Calendar.getInstance().getTimeInMillis()) : new EntrySettingEntity(s, ((List)object0), !z, String.valueOf(editorViewModel0.p0.getValue()), ((Long)editorViewModel0.o0.getValue()), integer0, s1, integer1, daumLikeItem1.getLabel(), ((String)editorViewModel0.g0.getValue()), editorViewModel0.B0, Calendar.getInstance().getTimeInMillis());
    }

    public static final void access$publishDraft(EditorViewModel editorViewModel0, String s) {
        String s2;
        Integer integer0;
        Object object0 = editorViewModel0.d0.getValue();
        CategoryItem categoryItem0 = (CategoryItem)editorViewModel0.i0.getValue();
        if(categoryItem0 != null && categoryItem0.getId() == -3) {
            integer0 = null;
        }
        else {
            CategoryItem categoryItem1 = (CategoryItem)editorViewModel0.i0.getValue();
            integer0 = categoryItem1 == null ? null : categoryItem1.getId();
        }
        Object object1 = editorViewModel0.e0.getValue();
        if(((String)object0) == null || p.isBlank(((String)object0))) {
            KeditorView keditorView0 = editorViewModel0.s;
            if(keditorView0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("keditor");
                keditorView0 = null;
            }
            if(keditorView0.isEmpty()) {
                Event event0 = new Event(Unit.INSTANCE);
                editorViewModel0.N.setValue(event0);
                return;
            }
        }
        KeditorView keditorView1 = editorViewModel0.s;
        if(keditorView1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keditor");
            keditorView1 = null;
        }
        String s1 = keditorView1.exportToJson();
        if(s != null) {
            s2 = s;
        }
        else if((editorViewModel0.Y == null ? null : editorViewModel0.Y.getThumbnail()) != null) {
            s2 = "";
        }
        else {
            s2 = null;
        }
        Long long0 = editorViewModel0.X;
        if(long0 != null && ((long)long0) != 0L) {
            String s3 = editorViewModel0.p;
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(editorViewModel0), null, null, new d1(editorViewModel0, s3, ((long)long0), ((String)object0), s1, ((List)object1), integer0, s2, null), 3, null);
            return;
        }
        String s4 = editorViewModel0.p;
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(editorViewModel0), null, null, new i1(editorViewModel0, s4, ((String)object0), s1, ((List)object1), integer0, s2, null), 3, null);
    }

    public static final void access$saveCurrentPost(EditorViewModel editorViewModel0) {
        editorViewModel0.getClass();
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(editorViewModel0), null, null, new k1(editorViewModel0, null), 3, null);
    }

    public static final void access$stopAutoSaving(EditorViewModel editorViewModel0) {
        DefaultImpls.cancel$default(editorViewModel0.E0, null, 1, null);
    }

    public static final Object access$uploadFile(EditorViewModel editorViewModel0, String s, FileItem fileItem0, Continuation continuation0) {
        editorViewModel0.getClass();
        return BuildersKt.withContext(Dispatchers.getDefault(), new m1(fileItem0, editorViewModel0, s, null), continuation0);
    }

    public static final Object access$uploadImage(EditorViewModel editorViewModel0, String s, ImageItem imageItem0, Continuation continuation0) {
        editorViewModel0.getClass();
        return BuildersKt.withContext(Dispatchers.getDefault(), new n1(imageItem0, editorViewModel0, s, null), continuation0);
    }

    public final boolean b() {
        int v1;
        List list0;
        String s;
        Object object0 = this.n0.getValue();
        DraftItem draftItem0 = this.Y;
        Integer integer0 = null;
        if(draftItem0 == null) {
        label_6:
            EditEntryEntity editEntryEntity0 = this.Z;
            if(editEntryEntity0 == null) {
                s = null;
            }
            else {
                EntryEntity entryEntity0 = editEntryEntity0.getEntry();
                s = entryEntity0 == null ? null : entryEntity0.getThumbnail();
            }
        }
        else {
            s = draftItem0.getThumbnail();
            if(s == null) {
                goto label_6;
            }
        }
        boolean z = Intrinsics.areEqual(object0, s);
        String s1 = String.valueOf(this.e0.getValue());
        DraftItem draftItem1 = this.Y;
        if(draftItem1 == null) {
        label_21:
            EditEntryEntity editEntryEntity1 = this.Z;
            if(editEntryEntity1 == null) {
                list0 = null;
            }
            else {
                EntrySettingEntity entrySettingEntity0 = editEntryEntity1.getSetting();
                list0 = entrySettingEntity0 == null ? null : entrySettingEntity0.getTags();
            }
            if(list0 == null) {
                list0 = CollectionsKt__CollectionsKt.emptyList();
            }
        }
        else {
            list0 = draftItem1.getTags();
            if(list0 == null) {
                goto label_21;
            }
        }
        boolean z1 = Intrinsics.areEqual(s1, list0.toString());
        CategoryItem categoryItem0 = (CategoryItem)this.i0.getValue();
        int v = categoryItem0 == null ? 0 : categoryItem0.getId();
        DraftItem draftItem2 = this.Y;
        if(draftItem2 == null) {
        label_41:
            EditEntryEntity editEntryEntity2 = this.Z;
            if(editEntryEntity2 != null) {
                EntrySettingEntity entrySettingEntity1 = editEntryEntity2.getSetting();
                if(entrySettingEntity1 != null) {
                    integer0 = entrySettingEntity1.getCategoryId();
                }
            }
            v1 = integer0 == null ? 0 : ((int)integer0);
        }
        else {
            CategoryItem categoryItem1 = draftItem2.getCategory();
            if(categoryItem1 != null) {
                v1 = categoryItem1.getId();
                goto label_47;
            }
            goto label_41;
        }
    label_47:
        DaumLikeItem daumLikeItem0 = (DaumLikeItem)this.l0.getValue();
        int v2 = -3;
        int v3 = daumLikeItem0 == null ? -3 : daumLikeItem0.getId();
        EditEntryEntity editEntryEntity3 = this.Z;
        if(editEntryEntity3 != null) {
            EntrySettingEntity entrySettingEntity2 = editEntryEntity3.getSetting();
            if(entrySettingEntity2 != null) {
                Integer integer1 = entrySettingEntity2.getDaumLikeId();
                if(integer1 != null) {
                    v2 = (int)integer1;
                }
            }
        }
        if(z && z1 && v == v1 && v3 == v2) {
            CharSequence charSequence0 = (CharSequence)this.n0.getValue();
            return charSequence0 != null && charSequence0.length() != 0;
        }
        return true;
    }

    public final void cancelMediaUpload() {
        Event event0 = new Event(null);
        this.S.postValue(event0);
        Job job0 = this.C0;
        if(job0 != null) {
            DefaultImpls.cancel$default(job0, null, 1, null);
        }
        this.C0 = null;
    }

    @Nullable
    public final Object checkGrammar(@NotNull String s, @NotNull Continuation continuation0) {
        return this.k.postGrammarCheck(s, continuation0);
    }

    public final void clearAutoSaved() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new l0(this, null), 3, null);
    }

    public final void commentAcceptChanged(boolean z) {
        this.f0.postValue(Boolean.valueOf(z));
    }

    public final void deleteThumbnailImage() {
        this.n0.postValue(null);
    }

    @Nullable
    public final Blog getBlog() {
        return this.r;
    }

    @NotNull
    public final String getBlogName() {
        return this.p;
    }

    @NotNull
    public final LiveData getCanNotEditEntry() {
        return this.z;
    }

    @NotNull
    public final MutableLiveData getCategoryItem() {
        return this.i0;
    }

    @NotNull
    public final LiveData getCategoryName() {
        return this.k0;
    }

    @NotNull
    public final LiveData getCategoryVisibility() {
        return this.j0;
    }

    @NotNull
    public final StateFlow getChallenge() {
        return this.z0;
    }

    @NotNull
    public final MutableLiveData getCommentPermit() {
        return this.f0;
    }

    @NotNull
    public final LiveData getCompleteEditTag() {
        return this.A;
    }

    @NotNull
    public final MutableLiveData getCoverImageUrl() {
        return this.n0;
    }

    @NotNull
    public final MutableLiveData getDaumLikeItem() {
        return this.l0;
    }

    @NotNull
    public final LiveData getDaumLikeName() {
        return this.m0;
    }

    @NotNull
    public final LiveData getDeleteThumbnailDialog() {
        return this.L;
    }

    @NotNull
    public final MutableLiveData getDraftEnable() {
        return this.c0;
    }

    @NotNull
    public final MutableLiveData getEditorMode() {
        return this.b0;
    }

    public final long getEntryId() {
        return this.q;
    }

    @NotNull
    public final LiveData getEntryModifyAlert() {
        return this.C;
    }

    @NotNull
    public final MutableLiveData getEntryVisibilityType() {
        return this.h0;
    }

    @NotNull
    public final LiveData getErrorDraftNoTitleOrContent() {
        return this.N;
    }

    @NotNull
    public final LiveData getErrorNoTitle() {
        return this.B;
    }

    @NotNull
    public final LiveData getFinishEditor() {
        return this.y;
    }

    @NotNull
    public final LiveData getGoToPhotoPicker() {
        return this.I;
    }

    @NotNull
    public final LiveData getLoadDraftComplete() {
        return this.O;
    }

    @NotNull
    public final LiveData getLoadDraftDuplicated() {
        return this.P;
    }

    @NotNull
    public final StateFlow getNeedChallengeValidation() {
        return this.A0;
    }

    @NotNull
    public final LiveData getOnPublishEntry() {
        return this.x;
    }

    @NotNull
    public final MutableLiveData getPassword() {
        return this.g0;
    }

    @Nullable
    public final Long getPublishedTime() {
        return this.B0;
    }

    @NotNull
    public final LiveData getRequestLoadDraft() {
        return this.R;
    }

    @NotNull
    public final LiveData getRequestLoadModifiedEntry() {
        return this.Q;
    }

    @NotNull
    public final MutableLiveData getReserveType() {
        return this.p0;
    }

    @Nullable
    public final String getReservedOrPublishedDate() {
        return this.q0;
    }

    @NotNull
    public final MutableLiveData getReserverTime() {
        return this.o0;
    }

    @NotNull
    public final LiveData getSaveDraftComplete() {
        return this.M;
    }

    @NotNull
    public final LiveData getShowBlogCategoryDialog() {
        return this.F;
    }

    @NotNull
    public final LiveData getShowCalendarDialog() {
        return this.J;
    }

    @NotNull
    public final LiveData getShowCameraBottomDialog() {
        return this.H;
    }

    @NotNull
    public final LiveData getShowChallengeCategoryDialog() {
        return this.U;
    }

    @NotNull
    public final LiveData getShowDaumCategoryDialog() {
        return this.G;
    }

    @NotNull
    public final LiveData getShowJsonExceptionDialog() {
        return this.t;
    }

    @NotNull
    public final LiveData getShowNotMyBlogDialog() {
        return this.W;
    }

    @NotNull
    public final LiveData getShowPasswordDialog() {
        return this.D;
    }

    @NotNull
    public final LiveData getShowRegulationErrorEvent() {
        return this.x0;
    }

    @NotNull
    public final LiveData getShowTimePickerDialog() {
        return this.K;
    }

    @NotNull
    public final LiveData getShowToast() {
        return this.E;
    }

    @NotNull
    public final LiveData getShowUploadFailDialog() {
        return this.u;
    }

    @NotNull
    public final LiveData getShowUploadFailStringDialog() {
        return this.v;
    }

    @NotNull
    public final LiveData getShowUploadLoading() {
        return this.S;
    }

    @NotNull
    public final MutableLiveData getTagList() {
        return this.e0;
    }

    @NotNull
    public final MutableLiveData getTitleFocus() {
        return this.a0;
    }

    @NotNull
    public final MutableLiveData getTitleString() {
        return this.d0;
    }

    @NotNull
    public final MutableLiveData getTrackPageViewEdit() {
        return this.u0;
    }

    @NotNull
    public final MutableLiveData getTrackPageViewSetting() {
        return this.v0;
    }

    @NotNull
    public final MutableLiveData getTrackPageViewTag() {
        return this.w0;
    }

    public final void handleActivityResult(int v, int v1, @Nullable Intent intent0) {
        KeditorView keditorView0 = this.s;
        if(keditorView0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keditor");
            keditorView0 = null;
        }
        keditorView0.onActivityResult(v, v1, intent0);
    }

    public final void init(@Nullable String s, @Nullable Long long0, boolean z, boolean z1) {
        String s1 = s == null ? ((String)this.i.getOldCurrentBlogName().getValue()) : s;
        if(s1 != null) {
            if(p.isBlank(s1)) {
                s1 = null;
            }
            if(s1 != null) {
                this.p = s1;
                Blog blog0 = this.n.invoke(s1);
                if(blog0 == null) {
                    Throwable throwable0 = new Throwable("editor view model not find blog info " + s);
                    CrashlyticsUtils.INSTANCE.logException(throwable0);
                    LiveDataExtensionKt.postEvent(this.V, Unit.INSTANCE);
                    return;
                }
                this.r = blog0;
                this.q = long0 == null ? 0L : ((long)long0);
                if(Intrinsics.areEqual((this.r == null ? null : this.r.getRole()), "owner")) {
                    String s2 = this.p;
                    long v = this.q;
                    BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new w0(this, s2, v, null), 3, null);
                }
                else {
                    this.y0.setValue(null);
                }
                if(!z1) {
                    return;
                }
                long v1 = this.q;
                if(Long.compare(v1, 0L) > 0) {
                    String s3 = this.p;
                    this.q = v1;
                    this.D0 = true;
                    BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new z0(this, s3, v1, null), 3, null);
                    return;
                }
                this.D0 = true;
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new a1(this, !z, null), 3, null);
                return;
            }
        }
        Throwable throwable1 = new Throwable("editor view model not find invalid blogName");
        CrashlyticsUtils.INSTANCE.logException(throwable1);
        Event event0 = new Event(Unit.INSTANCE);
        this.y.setValue(event0);
    }

    @NotNull
    public final MutableLiveData isCompleteLoad() {
        return this.r0;
    }

    @NotNull
    public final String keditorExportToJson() {
        KeditorView keditorView0 = this.s;
        if(keditorView0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keditor");
            keditorView0 = null;
        }
        return keditorView0.exportToJson();
    }

    public final void loadDraft(@NotNull DraftItem draftItem0) {
        Intrinsics.checkNotNullParameter(draftItem0, "draftItem");
        if(this.X != null && draftItem0.getSequence() == ((long)this.X)) {
            Event event0 = new Event(Unit.INSTANCE);
            this.P.setValue(event0);
            return;
        }
        if(!this.a() && !this.b()) {
            Event event1 = new Event(draftItem0);
            this.R.postValue(event1);
            return;
        }
        Event event2 = new Event(draftItem0);
        this.Q.postValue(event2);
    }

    public final void loadDraftCMD(@NotNull DraftItem draftItem0) {
        Intrinsics.checkNotNullParameter(draftItem0, "draftItem");
        this.setTitleString(draftItem0.getTitle());
        if(draftItem0.getCategory().getId() == 0) {
            this.i0.postValue(null);
        }
        else {
            this.i0.postValue(draftItem0.getCategory());
        }
        this.e0.postValue((draftItem0.getTags() == null ? CollectionsKt__CollectionsKt.emptyList() : draftItem0.getTags()));
        this.X = draftItem0.getSequence();
        this.Y = draftItem0;
        this.Z = null;
        this.n0.setValue(draftItem0.getThumbnail());
        String s = String.valueOf(draftItem0.getCdm());
        Logger.INSTANCE.log("gsonString " + s + " ");
        this.isShowProgress().postValue(Boolean.TRUE);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new y0(this, s, null), 3, null);
    }

    public final void loadKeditor(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "gsonString");
        try {
            KeditorView keditorView0 = this.s;
            if(keditorView0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("keditor");
                keditorView0 = null;
            }
            KeditorView.load$default(keditorView0, s, null, 2, null);
        }
        catch(Exception unused_ex) {
            LiveDataExtensionKt.postEvent(this.t, Unit.INSTANCE);
        }
    }

    public final void loadOpenGraphSync(@NotNull OpenGraphItem openGraphItem0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(openGraphItem0, "item");
        Intrinsics.checkNotNullParameter(function10, "callback");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new c1(this, openGraphItem0, function10, null), 2, null);
    }

    public final boolean onClickBack() {
        EditorMode editorViewModel$EditorMode0 = (EditorMode)this.b0.getValue();
        switch((editorViewModel$EditorMode0 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[editorViewModel$EditorMode0.ordinal()])) {
            case 1: {
                if(!this.a() && !this.b()) {
                    DefaultImpls.cancel$default(this.E0, null, 1, null);
                    this.clearAutoSaved();
                    return false;
                }
                Event event0 = new Event(Unit.INSTANCE);
                this.C.postValue(event0);
                return true;
            }
            case 2: {
                this.a(EditorMode.EDIT_MODE);
                return true;
            }
            case 3: {
                this.a(EditorMode.SETTING_MODE);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public final void onClickBottomDialogItem(@NotNull SortItem sortItem0) {
        Intrinsics.checkNotNullParameter(sortItem0, "sortItem");
        String s = sortItem0.getType();
        if(Intrinsics.areEqual(s, "gallery")) {
            Event event0 = new Event(Unit.INSTANCE);
            this.I.setValue(event0);
            return;
        }
        if(Intrinsics.areEqual(s, "delete")) {
            Event event1 = new Event(Unit.INSTANCE);
            this.L.setValue(event1);
        }
    }

    public final void onClickCamera() {
        Unit unit0;
        if(((String)this.n0.getValue()) == null) {
            unit0 = null;
        }
        else {
            unit0 = Unit.INSTANCE;
            Event event0 = new Event(unit0);
            this.H.setValue(event0);
        }
        if(unit0 == null) {
            Event event1 = new Event(Unit.INSTANCE);
            this.I.setValue(event1);
        }
    }

    public final void onClickCategorySelect() {
        EditorSettingTiara.INSTANCE.trackClickOpenCategory();
        CategoryItem categoryItem0 = (CategoryItem)this.i0.getValue();
        Event event0 = new Event(((int)(categoryItem0 == null ? -3 : categoryItem0.getId())));
        this.F.postValue(event0);
    }

    public final void onClickChallenge() {
        EditorChallenge editorChallenge0 = (EditorChallenge)this.z0.getValue();
        if(editorChallenge0 != null) {
            EditorSettingTiara.INSTANCE.trackClickAddChallengeTag(editorChallenge0.getTagLabel());
            List list0 = (List)this.e0.getValue();
            if(list0 == null) {
                list0 = CollectionsKt__CollectionsKt.emptyList();
            }
            List list1 = CollectionsKt___CollectionsKt.toMutableList(list0);
            list1.removeAll(editorChallenge0.getTagList());
            list1.addAll(0, editorChallenge0.getTagList());
            this.e0.setValue(list1);
            Event event0 = new Event(string.label_toast_challenge_tag_added);
            this.E.postValue(event0);
        }
    }

    public final void onClickChangeImage(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "imageUrl");
        this.n0.postValue(s);
    }

    public final void onClickChangeVisibility(@NotNull EntryVisibilityType entryVisibilityType0) {
        Intrinsics.checkNotNullParameter(entryVisibilityType0, "visibilityType");
        if(entryVisibilityType0 == EntryVisibilityType.PROTECTED) {
            CharSequence charSequence0 = (CharSequence)this.g0.getValue();
            if(charSequence0 == null || p.isBlank(charSequence0)) {
                MutableLiveData mutableLiveData0 = this.g0;
                Intrinsics.checkNotNullExpressionValue("85368f77-e3e7-4e1a-b98f-7146c09dd642", "toString(...)");
                Intrinsics.checkNotNullExpressionValue("85368f77-e3e7-4e1a-b98f-7146c09dd642".getBytes(Charsets.UTF_8), "getBytes(...)");
                Intrinsics.checkNotNullExpressionValue("ODUzNjhmNzctZTNlNy00ZTFhLWI5OGYtNzE0NmMwOWRkNjQy\n", "encodeToString(...)");
                Intrinsics.checkNotNullExpressionValue("ODUzNjhm", "substring(...)");
                mutableLiveData0.postValue("ODUzNjhm");
            }
        }
        EditorSettingTiara.INSTANCE.trackClickVisibility(entryVisibilityType0);
        this.h0.setValue(entryVisibilityType0);
        if(((Boolean)this.A0.getValue()).booleanValue()) {
            EditorChallenge editorChallenge0 = (EditorChallenge)this.z0.getValue();
            if(editorChallenge0 != null) {
                Visibility visibility0 = editorChallenge0.getVisibility();
                if(visibility0 != null && !EditorChallengeKt.isValid(visibility0, entryVisibilityType0)) {
                    Integer integer0 = visibility0.getInvalidMessage();
                    LiveDataExtensionKt.postEvent(this.E, integer0);
                }
            }
        }
    }

    public final void onClickCopyPassword() {
        String s = (String)this.g0.getValue();
        if(s != null) {
            Object object0 = BaseKt.getAppContext().getSystemService("clipboard");
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager)object0).setPrimaryClip(ClipData.newPlainText("text", s));
        }
        if(Build.VERSION.SDK_INT < 33) {
            Event event0 = new Event(string.label_blog_toast_copy_password);
            this.E.setValue(event0);
        }
    }

    public final void onClickDaumLikeSelect(boolean z) {
        if(z) {
            EditorSettingTiara.INSTANCE.trackClickOpenHomeSubject();
        }
        Event event0 = new Event(this.l0.getValue());
        this.G.postValue(event0);
    }

    public static void onClickDaumLikeSelect$default(EditorViewModel editorViewModel0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        editorViewModel0.onClickDaumLikeSelect(z);
    }

    public final void onClickDraftButton() {
        this.throttleFirst(1000, new g1(this));
    }

    public final void onClickEditTag() {
        this.a(EditorMode.EDIT_TAG_MODE);
    }

    public final void onClickModifyAlertOk() {
        DefaultImpls.cancel$default(this.E0, null, 1, null);
        this.clearAutoSaved();
        Event event0 = new Event(Unit.INSTANCE);
        this.y.postValue(event0);
    }

    public final void onClickPassword() {
        Event event0 = new Event(this.g0.getValue());
        this.D.postValue(event0);
    }

    public final void onClickPublishNow(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "reservedType");
        EditorSettingTiara.INSTANCE.trackClickReservedType(s);
        this.p0.postValue(ReservedType.PUBLISH_NOW);
    }

    public final void onClickPublishReserve(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "reservedType");
        EditorSettingTiara.INSTANCE.trackClickReservedType(s);
        this.p0.postValue(ReservedType.RESERVE);
        if(((Boolean)this.A0.getValue()).booleanValue()) {
            EditorChallenge editorChallenge0 = (EditorChallenge)this.z0.getValue();
            if(editorChallenge0 != null) {
                Reservation reservation0 = editorChallenge0.getReservation();
                if(reservation0 != null && !EditorChallengeKt.isValid(reservation0, true)) {
                    Integer integer0 = reservation0.getInvalidMessage();
                    LiveDataExtensionKt.postEvent(this.E, integer0);
                }
            }
        }
    }

    public final void onClickPublished() {
        this.p0.postValue(ReservedType.PUBLISHED);
    }

    public final void onClickReserveCalendar() {
        Long long0 = (Long)this.o0.getValue();
        if(long0 != null) {
            Event event0 = new Event(long0);
            this.J.postValue(event0);
        }
    }

    public final void onClickReserveTime() {
        Long long0 = (Long)this.o0.getValue();
        if(long0 != null) {
            Event event0 = new Event(long0);
            this.K.postValue(event0);
        }
    }

    public final void onClickToolbarRightButton() {
        EditorMode editorViewModel$EditorMode0 = (EditorMode)this.b0.getValue();
        switch((editorViewModel$EditorMode0 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[editorViewModel$EditorMode0.ordinal()])) {
            case 1: {
                KeditorView keditorView0 = this.s;
                if(keditorView0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("keditor");
                    keditorView0 = null;
                }
                keditorView0.clearFocus();
                EditorTiara.INSTANCE.trackClickComplete();
                CharSequence charSequence0 = (CharSequence)this.d0.getValue();
                if(charSequence0 != null && !p.isBlank(charSequence0)) {
                    this.F0.invoke();
                    return;
                }
                Event event0 = new Event(Unit.INSTANCE);
                this.B.setValue(event0);
                return;
            }
            case 2: {
                EditorSettingTiara editorSettingTiara0 = EditorSettingTiara.INSTANCE;
                editorSettingTiara0.trackClickPublish();
                h1 h10 = new h1(this);
                if(!((Boolean)this.A0.getValue()).booleanValue()) {
                    h10.invoke();
                    return;
                }
                EditorChallenge editorChallenge0 = (EditorChallenge)this.z0.getValue();
                if(editorChallenge0 == null) {
                    h10.invoke();
                    return;
                }
                if(editorChallenge0.areGeneralRequirementsValid(((CategoryItem)this.i0.getValue()), ((EntryVisibilityType)this.h0.getValue()), ((ReservedType)this.p0.getValue())) && !EditorChallengeKt.isValid(editorChallenge0.getServiceCategory(), ((DaumLikeItem)this.l0.getValue()))) {
                    editorSettingTiara0.trackPageChallengeServiceCategoryDialog();
                    LiveDataExtensionKt.postEvent(this.T, Unit.INSTANCE);
                    return;
                }
                h10.invoke();
                return;
            }
            case 3: {
                Event event1 = new Event(Unit.INSTANCE);
                this.A.setValue(event1);
                this.a(EditorMode.SETTING_MODE);
            }
        }
    }

    public final void onClosedClicked() {
        if(!this.onClickBack()) {
            Event event0 = new Event(Unit.INSTANCE);
            this.y.setValue(event0);
        }
    }

    public final void onFocusChangeTitle(@NotNull View view0, boolean z) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Logger.INSTANCE.log("onFocusChangeTitle " + z);
        this.a0.postValue(Boolean.valueOf(z));
    }

    public final void resetDraftItem(long v) {
        if(this.X != null && v == ((long)this.X)) {
            this.X = null;
            this.Y = null;
        }
    }

    public final void runAutoSaving() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), this.E0.plus(Dispatchers.getIO()), null, new j1(this, null), 2, null);
    }

    public final void selectCategoryItem(@NotNull CategoryItem categoryItem0) {
        Intrinsics.checkNotNullParameter(categoryItem0, "item");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new x0(this, categoryItem0.getId(), null), 3, null);
    }

    public final void selectDaumLikeCategoryItem(@Nullable DaumLikeItem daumLikeItem0) {
        EditorSettingTiara editorSettingTiara0 = EditorSettingTiara.INSTANCE;
        String s = daumLikeItem0 == null ? null : daumLikeItem0.getLabel();
        if(s == null) {
            s = "";
        }
        editorSettingTiara0.trackClickHomeSubject(s);
        this.l0.postValue(daumLikeItem0);
    }

    public final void setEntryPassword(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "password");
        this.g0.postValue(s);
        this.h0.setValue(EntryVisibilityType.PROTECTED);
    }

    public final void setKediorView(@NotNull KeditorView keditorView0) {
        Intrinsics.checkNotNullParameter(keditorView0, "keditorView");
        this.s = keditorView0;
    }

    public final void setPassword(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.g0 = mutableLiveData0;
    }

    public final void setPublishedTime(@Nullable Long long0) {
        this.B0 = long0;
    }

    public final void setReservedOrPublishedDate(@Nullable String s) {
        this.q0 = s;
    }

    public final void setTitleString(@Nullable String s) {
        if(s == null) {
            s = "";
        }
        else if(s.length() > 80) {
            s = s.subSequence(0, 80).toString();
        }
        this.d0.postValue(s);
    }

    public final void updateTagList(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "list");
        this.e0.postValue(list0);
    }

    public final void uploadPost() {
        this.a(new o1(this));
    }
}

