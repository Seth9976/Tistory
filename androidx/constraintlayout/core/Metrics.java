package androidx.constraintlayout.core;

import a5.b;
import java.util.ArrayList;

public class Metrics {
    public long additionalMeasures;
    public long barrierConnectionResolved;
    public long bfs;
    public long centerConnectionResolved;
    public long chainConnectionResolved;
    public long constraints;
    public long determineGroups;
    public long errors;
    public long extravariables;
    public long fullySolved;
    public long graphOptimizer;
    public long graphSolved;
    public long grouping;
    public long infeasibleDetermineGroups;
    public long iterations;
    public long lastTableSize;
    public long layouts;
    public long linearSolved;
    public long matchConnectionResolved;
    public long maxRows;
    public long maxTableSize;
    public long maxVariables;
    public long measuredMatchWidgets;
    public long measuredWidgets;
    public long measures;
    public long measuresLayoutDuration;
    public long measuresWidgetsDuration;
    public long measuresWrap;
    public long measuresWrapInfeasible;
    public long minimize;
    public long minimizeGoal;
    public long nonresolvedWidgets;
    public long oldresolvedWidgets;
    public long optimize;
    public long pivots;
    public ArrayList problematicLayouts;
    public long resolutions;
    public long resolvedWidgets;
    public long simpleconstraints;
    public long slackvariables;
    public long tableSizeIncrease;
    public long variables;
    public long widgets;

    public Metrics() {
        this.problematicLayouts = new ArrayList();
    }

    public void reset() {
        this.measures = 0L;
        this.widgets = 0L;
        this.additionalMeasures = 0L;
        this.resolutions = 0L;
        this.tableSizeIncrease = 0L;
        this.maxTableSize = 0L;
        this.lastTableSize = 0L;
        this.maxVariables = 0L;
        this.maxRows = 0L;
        this.minimize = 0L;
        this.minimizeGoal = 0L;
        this.constraints = 0L;
        this.simpleconstraints = 0L;
        this.optimize = 0L;
        this.iterations = 0L;
        this.pivots = 0L;
        this.bfs = 0L;
        this.variables = 0L;
        this.errors = 0L;
        this.slackvariables = 0L;
        this.extravariables = 0L;
        this.fullySolved = 0L;
        this.graphOptimizer = 0L;
        this.graphSolved = 0L;
        this.resolvedWidgets = 0L;
        this.oldresolvedWidgets = 0L;
        this.nonresolvedWidgets = 0L;
        this.centerConnectionResolved = 0L;
        this.matchConnectionResolved = 0L;
        this.chainConnectionResolved = 0L;
        this.barrierConnectionResolved = 0L;
        this.problematicLayouts.clear();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("\n*** Metrics ***\nmeasures: ");
        stringBuilder0.append(this.measures);
        stringBuilder0.append("\nmeasuresWrap: ");
        stringBuilder0.append(this.measuresWrap);
        stringBuilder0.append("\nmeasuresWrapInfeasible: ");
        stringBuilder0.append(this.measuresWrapInfeasible);
        stringBuilder0.append("\ndetermineGroups: ");
        stringBuilder0.append(this.determineGroups);
        stringBuilder0.append("\ninfeasibleDetermineGroups: ");
        stringBuilder0.append(this.infeasibleDetermineGroups);
        stringBuilder0.append("\ngraphOptimizer: ");
        stringBuilder0.append(this.graphOptimizer);
        stringBuilder0.append("\nwidgets: ");
        stringBuilder0.append(this.widgets);
        stringBuilder0.append("\ngraphSolved: ");
        stringBuilder0.append(this.graphSolved);
        stringBuilder0.append("\nlinearSolved: ");
        return b.g(this.linearSolved, "\n", stringBuilder0);
    }
}

