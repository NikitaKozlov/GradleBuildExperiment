# GradleBuildExperiment
Android experiment that clarify dependency between amount of modules and incremental build time.
You can find more details and results of this experiment here.

### Problem
If in a single-module project one class is changed, gradle have to recompile the whole project.

### Hypothesis
Incremental build for a project with multiple modules is faster then for a single-module project, because only modified modules are recompiled while the rest — not.

## Structure
Every branch will have it's own configuration. All configurations has around 90 000 methods splitted among 15 000 classes.
* [1 module](https://github.com/NikitaKozlov/GradleBuildExperiment/tree/1module) initial state.
* [3 modules](https://github.com/NikitaKozlov/GradleBuildExperiment/tree/3modules) code is equally split between 3 modules.
* [5 modules](https://github.com/NikitaKozlov/GradleBuildExperiment/tree/5modules) code is equally split between 5 modules.





g