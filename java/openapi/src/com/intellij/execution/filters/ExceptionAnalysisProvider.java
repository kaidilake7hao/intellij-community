// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.execution.filters;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Experimental
public interface ExceptionAnalysisProvider {
  /**
   * @param anchor a place (leaf element) in the source code where exception occurred
   * @param exceptionClassName exception class name (fully-qualified)
   * @param exceptionMessage exception message (fully-qualified)
   * @return an action to provide additional analysis for given exception; null if not available.
   */
  @Nullable AnAction getAnalysisAction(@NotNull PsiElement anchor,
                                       @NotNull String exceptionClassName,
                                       @NotNull String exceptionMessage);
}
