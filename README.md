# GradleBuildExperiment
Android experiment that clarify dependency between amount of modules and build time.

### Problem
If in a single-module project one class is changed, gradle have to recompile the project. 

### Hypothesis
If project have multiple modules, then gradle recompile only changed module. That should decrease build time.

## Structure
Every branch will have it's own configuration, that will be described in README.


